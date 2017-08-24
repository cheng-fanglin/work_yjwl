package com.jghz.ih.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc13Dao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.entity.Tbih13;
import com.jghz.ih.entity.Tbih30;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih30对象信息的保存操作
 */
@Transactional
@Component("ihjc13Service")
public class Ihjc13Service {
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	@Resource
	private Ihjc13Dao ihjc13Dao;

	@DataProvider
	public void loadTbih30(Page<Tbih30> page, Map<String, Object> parameter) throws Exception {
		if(parameter==null){
			parameter = new HashMap<String,Object>();
		}
		parameter.put("status", "IN");//在库
		ihjc30Dao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih13(Page<Tbih13> page, Map<String, Object> parameter) throws Exception {
		
		ihjc13Dao.pagingQuery(page,parameter);
	}
	
	@DataResolver
	public void saveTbih30(Collection<Tbih30> datas,Map<String, Object> parameter) throws Exception {
		String zkCraneDriver = (String) parameter.get("zkCraneDriver");
		String zkLiftingEmp = (String) parameter.get("zkLiftingEmp");
		String zkLiftingTeam = (String) parameter.get("zkLiftingTeam");
			for (Tbih30 ih30 : datas) {
				EntityState state = EntityUtils.getState(ih30);
				if (state.equals(EntityState.MODIFIED)) {
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("compId", ih30.getCompId());
					mapParam.put("wareQwCode", ih30.getWareQwCodeOld());
					
					//计算所在层数
					String layerCode = "";
					if(StringHelper.isNotEmpty(ih30.getLayerCodeOld())){
						layerCode =String.valueOf((Integer.valueOf(ih30.getLayerCodeOld())+Integer.valueOf(ihjc30Dao.queryMaxLayerCode(mapParam))));
					}
							
					Tbih13 tbih13 = new Tbih13();
					AppUtils.copyProperties(ih30, tbih13);
					tbih13.setIh13Id(AppUtils.generateUniqueKey());
					tbih13.setCompId(AppUtils.getCompId());
					tbih13.setWareQwCodeOld(ih30.getWareQwCode());
					tbih13.setWareQwCode(ih30.getWareQwCodeOld());
					tbih13.setLayerCodeOld(ih30.getLayerCode());
					tbih13.setLayerCode(layerCode);
					tbih13.setZkDate(AppUtils.getCurrentDateString("yyyyMMdd"));
					tbih13.setZkEmp(AppUtils.getUserName());
					tbih13.setZkCraneDriver(zkCraneDriver);
					tbih13.setZkLiftingEmp(zkLiftingEmp);
					tbih13.setZkLiftingTeam(zkLiftingTeam);
					tbih13.setCreateDate(AppUtils.getCurrentDate());
					tbih13.setCreateEmp(AppUtils.getUserName());
					tbih13.setUpdateDate(null);
					tbih13.setUpdateEmp(null);
					tbih13.setVersion(0);
					ihjc30Dao.save(tbih13);
					
					ih30.setLayerCode(layerCode);
					ih30.setWareQwCode(ih30.getWareQwCodeOld());
					ihjc30Dao.update(ih30);
				}
			}
	}
	
	@Expose
	public void saveLayerCodeRefresh(Map<String, Object> parameter) throws Exception {
			if(parameter==null){
				parameter= new HashMap<String,Object>();
			}
			parameter.put("compId", AppUtils.getCompId());
			List<Map<String,Object>> listWareCode = ihjc30Dao.queryLayerCodeRefresh(parameter);
			for(Map<String,Object> mapWareCode :listWareCode){
				List<Tbih30> listIh30 = ihjc30Dao.queryListOrderByLayerCode(mapWareCode);
				for(int i=0;i<listIh30.size();i++){
					Tbih30 ih30 = listIh30.get(i);
					ih30.setLayerCode(String.valueOf(i+1));
					ihjc30Dao.update(ih30);
				}
			}
	}

}
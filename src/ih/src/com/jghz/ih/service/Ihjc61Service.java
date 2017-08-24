package com.jghz.ih.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.Ihjc61Dao;
import com.jghz.ih.entity.Tbih30;
import com.jghz.ih.entity.Tbih61;

/**
 * 单表维护服务类
 * 实现对com.jghz.ih.entity.Tbih61对象信息的保存操作
 */
@Component("ihjc61Service")
public class Ihjc61Service {
	@Resource
	private Ihjc61Dao ihjc61Dao;
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	@DataProvider
	public void loadTbih61(Page<Tbih61> page, Map<String, Object> parameter)
			throws Exception {
		ihjc61Dao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih30(Page<Tbih30> page, Map<String, Object> parameter)
			throws Exception {
		if(parameter==null){		
			parameter=new HashMap<String, Object>();
		}
		parameter.put("status", "IN");
		ihjc30Dao.pagingQuery(page,parameter);
	}
	
	@DataResolver
	public Properties saveTbih61(Collection<Tbih61> ListIh61, Map<String, Object> parameter) throws Exception {
		Session session = ihjc61Dao.getSession();
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for (Tbih61 tbih61 : ListIh61) {
				EntityState state = EntityUtils.getState(tbih61);
				final Tbih61 ih61 = tbih61;
				if (state.equals(EntityState.NEW)) {
					ih61.setIh61Id(AppUtils.generateUniqueKey());
					ih61.setCompId(AppUtils.getCompId());
					
					if(ih61.getInventoryWgt()!=null){
						if(ih61.getInventoryWgt().compareTo(ih61.getWgt())>0){
							ih61.setSurplusWgt(ih61.getInventoryWgt().subtract(ih61.getWgt()));
						}else{
							ih61.setLoseWgt(ih61.getWgt().subtract(ih61.getInventoryWgt()));
						}
					}
					if(ih61.getInventoryNum()!=null){
						if(ih61.getInventoryNum().compareTo(ih61.getPieceNum())>0){
							ih61.setSurplusNum(ih61.getInventoryNum().subtract(ih61.getPieceNum()));
						}else{
							ih61.setLoseNum(ih61.getPieceNum().subtract(ih61.getInventoryNum()));
						}
					}
					
					if(StringHelper.isEmpty(ih61.getInventoryEmp())){
						ih61.setInventoryEmp(AppUtils.getUserName());
					}
					
					ih61.setCheckStatus("00");
					ih61.setCreateTime(new Date());
					ih61.setCreateEmp(AppUtils.getUserName());
					session.save(ih61);

				}
				if (state.equals(EntityState.MODIFIED)) {
					if("00".equals(ih61.getCheckStatus())){
						session.update(ih61);
					}else{
						flag=false;
						prop.put("msg", "不是建立状态，不能修改");
						break;
					}
					
				}
				if (state.equals(EntityState.DELETED)) {
					if("00".equals(ih61.getCheckStatus())){
						session.delete(ih61);
					}else{
						flag=false;
						prop.put("msg", "不是建立状态，不能删除");
						break;
					}
					
				}
			}

		} finally {
			session.flush();
			
		}
		
		prop.put("flag", flag);
		return prop;
	}
	
	@Expose
	public Properties saveConfirm(Map<String, Object> parameter) throws Exception {
		Session session = ihjc61Dao.getSession();
		Properties prop = new Properties();
		boolean flag = true;
		try {
			Collection<Tbih61> ListIh61 = (Collection<Tbih61>) parameter.get("ListIH61");
			for (Tbih61 tbih61 : ListIh61) {
				Map<String,Object> mapParam = new HashMap<String,Object>();
				AppUtils.copyProperties(tbih61, mapParam);
				Tbih30 ih30 = ihjc30Dao.getOneTbih30(mapParam);
				ih30.setWgt(tbih61.getInventoryWgt());
				ih30.setNum(tbih61.getInventoryNum());
				session.update(ih30);
				
				tbih61.setCheckStatus("10");
				session.update(tbih61);
			}
		}finally {
			session.flush();
			
		}
		prop.put("flag", flag);
		return prop;
	}
}
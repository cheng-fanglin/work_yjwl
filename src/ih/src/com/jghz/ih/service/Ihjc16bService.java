package com.jghz.ih.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc03aDao;
import com.jghz.ih.dao.Ihjc16Dao;
import com.jghz.ih.dao.Ihjc16aDao;
import com.jghz.ih.dao.Ihjc16bDao;
import com.jghz.ih.dao.Ihjc21bDao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih16;
import com.jghz.ih.entity.Tbih16a;
import com.jghz.ih.entity.Tbih16b;
import com.jghz.ih.entity.Tbih19;
import com.jghz.ih.entity.Tbih21b;
import com.jghz.ih.entity.Tbih30;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih16对象信息的保存操作
 */
@Transactional
@Component("ihjc16bService")
public class Ihjc16bService {
	@Resource
	private Ihjc16Dao ihjc16Dao;
	
	@Resource
	private Ihjc16aDao ihjc16aDao;
	
	@Resource
	private Ihjc16bDao ihjc16bDao;
	
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	

	@DataProvider
	public void loadTbih16b(Page<Tbih16b> page, Map<String, Object> parameter) throws Exception{
		
		ihjc16bDao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public Collection<Map<String,Object>> loadOrderItem(Map<String, Object> parameter) throws Exception{
		List<Map<String,Object>> list =new ArrayList<Map<String,Object>>();
		list=ihjc30Dao.queryListOrderItem(parameter);
		return list;
	}
	
	@DataProvider
	public void loadTbih19(Page<Tbih19> page, Map<String, Object> parameter) throws Exception{
		if(parameter==null){
			parameter= new HashMap<String,Object>();
		}
		parameter.put("flag", "IH16b");
		ihjc16bDao.pagingQuery19(page,parameter);
		
	}
	
	@DataProvider
	public void loadTbih19left(Page<Tbih19> page, Map<String, Object> parameter) throws Exception{
		
		ihjc16bDao.pagingQuery19left(page,parameter);
		
	}
	
	
	@DataResolver
	public Properties saveTbih16b(Collection<Tbih16b> datas) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		Map<String,Object> parameter = new HashMap<String,Object>();
			for (Tbih16b ih16b : datas) {
				EntityState state = EntityUtils.getState(ih16b);
				if (state.equals(EntityState.NEW)) {
					ih16b.setIh16bId(AppUtils.generateUniqueKey());
					ih16b.setCompId(AppUtils.getCompId());
					parameter.put("compId", ih16b.getCompId());
					ihjc16Dao.save(ih16b);
				}
				if (state.equals(EntityState.MODIFIED)) {
					//更新南钢提单中实提量和未提量
					Map<String,Object> paramIh16b = new HashMap<String,Object>();
					AppUtils.copyProperties(ih16b, paramIh16b);
					List<Tbih16b> listIh16b  = ihjc16bDao.queryList(paramIh16b);
					if(CollectionUtils.isNotEmpty(listIh16b)&&listIh16b.get(0)!=null){
						if(StringHelper.isEmpty(listIh16b.get(0).getLadingNoF())&&StringHelper.isNotEmpty(ih16b.getLadingNoF())){
							Map<String,Object> paramIh16bF = new HashMap<String,Object>();
							paramIh16bF.put("ladingNo", ih16b.getLadingNoF());
							paramIh16bF.put("compId", ih16b.getCompId());
							List<Tbih16b> listIh16bF  = ihjc16bDao.queryList(paramIh16bF);
							if(CollectionUtils.isNotEmpty(listIh16bF)&&listIh16bF.get(0)!=null){
								Tbih16b ih16bF = listIh16bF.get(0);
								ih16bF.setStl(ih16bF.getStl().add(ih16b.getStl()));
								ih16bF.setWtl(ih16bF.getWtl().subtract(ih16b.getStl()));
								ihjc16Dao.update(ih16bF);
							}
						}
						if(StringHelper.isNotEmpty(listIh16b.get(0).getLadingNoF())&&StringHelper.isEmpty(ih16b.getLadingNoF())){
							Map<String,Object> paramIh16bF = new HashMap<String,Object>();
							paramIh16bF.put("ladingNo", listIh16b.get(0).getLadingNoF());
							paramIh16bF.put("compId", ih16b.getCompId());
							List<Tbih16b> listIh16bF  = ihjc16bDao.queryList(paramIh16bF);
							if(CollectionUtils.isNotEmpty(listIh16bF)&&listIh16bF.get(0)!=null){
								Tbih16b ih16bF = listIh16bF.get(0);
								ih16bF.setStl(ih16bF.getStl().subtract(ih16b.getStl()));
								ih16bF.setWtl(ih16bF.getWtl().add(ih16b.getStl()));
								ihjc16bDao.update(ih16bF);
							}
						}
						ihjc16bDao.getSession().evict(listIh16b.get(0));
					}
					ihjc16Dao.update(ih16b);
				}
				if (state.equals(EntityState.DELETED)) {
					if(StringHelper.isNotEmpty(ih16b.getLadingNoF())){
						Map<String,Object> paramIh16bF = new HashMap<String,Object>();
						paramIh16bF.put("ladingNo", ih16b.getLadingNoF());
						paramIh16bF.put("compId", ih16b.getCompId());
						List<Tbih16b> listIh16bF  = ihjc16bDao.queryList(paramIh16bF);
						if(CollectionUtils.isNotEmpty(listIh16bF)&&listIh16bF.get(0)!=null){
							Tbih16b ih16bF = listIh16bF.get(0);
							ih16bF.setStl(ih16bF.getStl().subtract(ih16b.getStl()));
							ih16bF.setWtl(ih16bF.getWtl().add(ih16b.getStl()));
							ihjc16bDao.update(ih16bF);
						}
					}
					ihjc16bDao.delete(ih16b);
				}
			}
		prop.put("flag", flag);
		return prop;
	}
	
}
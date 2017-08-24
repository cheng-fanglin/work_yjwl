package com.jghz.ih.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.bstek.dorado.view.widget.data.DataSet;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc21Dao;
import com.jghz.ih.dao.Ihjc21aDao;
import com.jghz.ih.dao.Ihjc22Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih16;
import com.jghz.ih.entity.Tbih21;
import com.jghz.ih.entity.Tbih21a;
import com.jghz.ih.entity.Tbih21b;
import com.jghz.ih.entity.Tbih22;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih21对象信息的保存操作
 */
@Transactional
@Component("ihjc21Service")
public class Ihjc21Service {
	@Resource
	private Ihjc21Dao ihjc21Dao;
	
	@Resource
	private Ihjc21aDao ihjc21aDao;
	
	@Resource
	private Ihjc22Dao ihjc22Dao;
	
	@Resource
	private Ihjc02Dao ihjc02Dao;
	
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;

	@DataProvider
	public void loadTbih21(Page<Tbih21> page, Map<String, Object> parameter) throws Exception{
		
		ihjc21Dao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih21a(Page<Tbih21a> page, Map<String, Object> parameter) throws Exception{
		
		ihjc21aDao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih22(Page<Tbih22> page, Map<String, Object> parameter) throws Exception{
		
		ihjc22Dao.pagingQuery(page,parameter);
	}
	
	@DataResolver
	public void saveTbih21(Collection<Tbih21> datasTbih21,Map<String,Object> parameter) throws Exception {
		
		Session session = ihjc21Dao.getSession();
		try {
			
			String ih21Id="";
			if(parameter!=null){
				ih21Id=AppUtils.toValidString(parameter.get("ih21Id"));
			}
			for (Tbih21 ih21 : datasTbih21) {
				ih21Id=AppUtils.generateUniqueKey();
				EntityState state = EntityUtils.getState(ih21);
				if (state.equals(EntityState.NEW)) {
					ih21.setIh21Id(ih21Id);
					ih21.setCompId(AppUtils.getCompId());
					if(StringHelper.isEmpty(ih21.getContNo())){
						Map<String,Object> mapp=new HashMap<String,Object>();
						mapp.put("compId", ih21.getCompId());
						ih21.setContNo(ihjcComm01Dao.getContNo(mapp));
					}
					session.save(ih21);
				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih21);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(ih21);
				}
				
				session.flush();
			}
			/*if(CollectionUtils.isNotEmpty(datasTbih21a)){
				for (Tbih21a ih21a : datasTbih21a) {
					EntityState state21a = EntityUtils.getState(ih21a);
					if (state21a.equals(EntityState.NEW)) {
						ih21a.setIh21aId(AppUtils.generateUniqueKey());
						ih21a.setIh21Id(ih21Id);
						session.save(ih21a);
					}
					if (state21a.equals(EntityState.MODIFIED)) {
						session.update(ih21a);
					}
					if (state21a.equals(EntityState.DELETED)) {
						session.delete(ih21a);
					}
				}
			}*/
			
			
		} finally {
			session.flush();
			
		}
	}
	
	@DataResolver
	public void saveTbih21Cust(Collection<Tbih21> datasTbih21,Map<String,Object> parameter) throws Exception {
		
		Session session = ihjc21Dao.getSession();
		try {
			
			String ih21Id="";
			if(parameter!=null){
				ih21Id=AppUtils.toValidString(parameter.get("ih21Id"));
			}
			for (Tbih21 ih21 : datasTbih21) {
				ih21Id=AppUtils.generateUniqueKey();
				EntityState state = EntityUtils.getState(ih21);
				if (state.equals(EntityState.NEW)) {
					ih21.setIh21Id(ih21Id);
					ih21.setCompId(AppUtils.getCompId());
					if(StringHelper.isEmpty(ih21.getContNo())){
						Map<String,Object> mapp=new HashMap<String,Object>();
						mapp.put("compId", ih21.getCompId());
						ih21.setContNo(ihjcComm01Dao.getContNo(mapp));
					}
					ih21.setCreateDate(new Date());
					ih21.setCreateEmp(AppUtils.getUserName());
					session.save(ih21);
				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih21);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(ih21);
				}
			}
		} finally {
			session.flush();
			
		}
	}
	
	@DataResolver
	public void saveTbih21a(Collection<Tbih21a> datas) throws Exception {
		Session session = ihjc21aDao.getSession();
		try {
			for (Tbih21a ih21a : datas) {
				EntityState state = EntityUtils.getState(ih21a);
				if (state.equals(EntityState.NEW)) {
					ih21a.setIh21aId(AppUtils.generateUniqueKey());
					ih21a.setCompId(AppUtils.getCompId());
					session.save(ih21a);
				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih21a);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(ih21a);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	
	@DataResolver
	public void saveTbih22(Collection<Tbih22> datas) throws Exception {
		Session session = ihjc22Dao.getSession();
		try {
			for (Tbih22 ih22 : datas) {
				EntityState state = EntityUtils.getState(ih22);
				if (state.equals(EntityState.NEW)) {
					ih22.setIh22Id(AppUtils.generateUniqueKey());
					ih22.setCompId(AppUtils.getCompId());
					if(StringHelper.isEmpty(ih22.getOrderNo())){
						Map<String,Object> mapp=new HashMap<String,Object>();
						mapp.put("compId", ih22.getCompId());
						ih22.setOrderNo(ihjcComm01Dao.getOrderNo(mapp));
					}
					session.save(ih22);
				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih22);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(ih22);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public void saveTbih22Cont(Map<String, Object> paramater) throws Exception {
		Session session = ihjc21Dao.getSession();
		String contNo = (String) paramater.get("contNo");
		String ih21Id = (String) paramater.get("ih21Id");
		String custNo = (String) paramater.get("custNo");
		try {
			Map<String,Object> mapara = new HashMap<String,Object>();
			mapara.put("custNo", custNo);
			mapara.put("compId", AppUtils.getCompId());
			List<Tbih22> list22= ihjc22Dao.queryList22(mapara);
			for(Tbih22 ih22:list22){
				ih22.setContNo(contNo);
				ih22.setIh21Id(ih21Id);
				session.update(ih22);
			}
		} finally {
			session.flush();
			
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public void saveTbih16LadingNo(Map<String, Object> parameter) throws Exception {
		Session session = ihjc21Dao.getSession();
		Collection<Tbih22> ListIh22 = (Collection<Tbih22>) parameter.get("ListIh22");
		Tbih21 ih21 = (Tbih21) parameter.get("Ih21");
		String ladingNo="";
		try {
			for (Tbih22 ih22 : ListIh22) {
				Tbih16 ih16= new Tbih16();
				AppUtils.copyProperties(ih22, ih16);
				ih16.setIh16Id(AppUtils.generateUniqueKey());
				ih16.setCompId(AppUtils.getCompId());
				parameter.put("compId", ih16.getCompId());
				ladingNo=ihjcComm01Dao.getLaddingNo(parameter);
				ih16.setLadingNo(ladingNo);
				ih16.setSettleType(ih21.getSettleType());
				ih16.setContNo(ih21.getContNo());
				ih16.setFwlx(ih21.getFwfl());
				ih16.setCustName(ih22.getOrderCompName());
				ih16.setCustNo(ih22.getOrderCompNo());
				Map<String,Object> map02=new HashMap<String,Object>();
				AppUtils.copyProperties(ih16, map02);
				List<Tbih02> listIh02 = ihjc02Dao.queryList02(map02);
				if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
					Tbih02 ih02 = listIh02.get(0);
					ih16.setDsNo(ih02.getDsNo());
					ih16.setDsName(ih02.getDsName());
				}
				ih16.setStatus("00");
				ih16.setDeliveryDate(AppUtils.getCurrentDateString("yyyyMMdd"));
				session.save(ih16);
				
				ih22.setLadingNo(ladingNo);
				session.update(ih22);
			}
		} finally {
			session.flush();
			
		}
		
	}

}
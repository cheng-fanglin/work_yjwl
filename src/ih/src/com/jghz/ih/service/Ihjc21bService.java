package com.jghz.ih.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

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
import com.jghz.ih.dao.Ihjc03Dao;
import com.jghz.ih.dao.Ihjc03aDao;
import com.jghz.ih.dao.Ihjc03cDao;
import com.jghz.ih.dao.Ihjc03eDao;
import com.jghz.ih.dao.Ihjc03fDao;
import com.jghz.ih.dao.Ihjc21Dao;
import com.jghz.ih.dao.Ihjc21bDao;
import com.jghz.ih.dao.Ihjc21cDao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih03;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih03c;
import com.jghz.ih.entity.Tbih03e;
import com.jghz.ih.entity.Tbih03f;
import com.jghz.ih.entity.Tbih21;
import com.jghz.ih.entity.Tbih21b;
import com.jghz.ih.entity.Tbih21c;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih21b对象信息的保存操作
 */
@Transactional
@Component("ihjc21bService")
public class Ihjc21bService {
	@Resource
	private Ihjc21Dao ihjc21Dao;
	
	@Resource
	private Ihjc21bDao ihjc21bDao;
	
	@Resource
	private Ihjc21cDao ihjc21cDao;
	
	@Resource
	private Ihjc03Dao ihjc03Dao;
	
	@Resource
	private Ihjc03aDao ihjc03aDao;
	
	@Resource
	private Ihjc03cDao ihjc03cDao;
	
	@Resource
	private Ihjc03eDao ihjc03eDao;
	
	@Resource
	private Ihjc03fDao ihjc03fDao;

	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	@DataProvider
	public void loadTbih21(Page<Tbih21> page , Map<String, Object> parameter) throws Exception{
		ihjc21Dao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih21b(Page<Tbih21b> page, Map<String, Object> parameter) throws Exception{
		
		ihjc21bDao.pagingQuery(page,parameter);
		if(page.getEntityCount()==0){
			Tbih21 ih21 = (Tbih21) parameter.get("Ih21");
			parameter.put("compId", ih21.getCompId());
			parameter.put("settleType", ih21.getSettleType());
			parameter.put("status", "01");
			Collection<Tbih21b> colIh21b=new ArrayList<Tbih21b>();
			Collection<Tbih03> colIh03=ihjc03Dao.queryIh03Basic(parameter);
			for(Tbih03 ih03:colIh03){
				Tbih21b ih21b=new Tbih21b();
				ih21b.setStoragePrice(ih03.getStoragePrice());
				ih21b.setOverduePrice(ih03.getOverduePrice());
				ih21b.setOverdueStdPrice(ih03.getOverdueStdPrice());
				ih21b.setDiscountPrice(ih03.getDiscountPrice());
				ih21b.setOverdueType(ih03.getOverdueType());
				ih21b.setTranType(ih03.getTranType());
				ih21b.setKb(ih03.getKb());
				ih21b.setCycle(ih03.getCycle());
				if(StringHelper.isEmpty(ih21.getSettleType())){
					ih21b.setSettleType(ih03.getSettleType());
				}else{
					ih21b.setSettleType(ih21.getSettleType());
				}
				ih21b.setProductName(ih03.getProductNo());
				ih21b.setStartDate(ih03.getStartDate());
				ih21b.setEndDate(ih03.getEndDate());
				ih21b.setContNo(ih21.getContNo());
				ih21b.setCustNo(ih21.getCustNo());
				ih21b.setCustName(ih21.getCustName());
				ih21b.setFwlx(ih21.getFwfl());
				ih21b.setIsStorage("Y");
				ih21b.setIsOverdue("Y");
				ih21b.setIsTurnning("N");
				ih21b.setIsOrder("N");
				BigDecimal price = AppUtils.getBigDecimal(ih21b.getStoragePrice()).
						add(AppUtils.getBigDecimal(ih21b.getOverduePrice())).
						subtract(AppUtils.getBigDecimal(ih21b.getDiscountPrice()));
				ih21b.setPrice(price);
				colIh21b.add(ih21b);
			}
			page.setEntities(colIh21b);
		}
	}
	
	@DataProvider
	public void loadTbih21c(Page<Tbih21c> page, Map<String, Object> parameter) throws Exception{
		
		ihjc21cDao.pagingQuery(page,parameter);
	}
	@DataProvider
	public void loadTbih03a(Page<Tbih03a> page, Map<String, Object> parameter) throws Exception{
		
		ihjc03aDao.pagingQuery(page,parameter);
		if(page.getEntityCount()==0){
			Collection<Tbih03a> colIh03a=ihjc03aDao.queryIh03aBasic(parameter);
			page.setEntities(colIh03a);
		}
	}
	
	@DataProvider
	public void loadTbih03c(Page<Tbih03c> page, Map<String, Object> parameter) throws Exception{
		
		ihjc03cDao.pagingQuery(page,parameter);
		if(page.getEntityCount()==0){
			Collection<Tbih03c> colIh03c=ihjc03cDao.queryIh03cBasic(parameter);
			page.setEntities(colIh03c);
		}
	}
	
	@DataProvider
	public void loadTbih03e(Page<Tbih03e> page, Map<String, Object> parameter) throws Exception{
		
		ihjc03eDao.pagingQuery(page,parameter);
		if(page.getEntityCount()==0){
			Collection<Tbih03e> colIh03e=ihjc03eDao.queryIh03eBasic(parameter);
			page.setEntities(colIh03e);
		}
	}
	
	@DataProvider
	public void loadTbih03f(Page<Tbih03f> page, Map<String, Object> parameter) throws Exception{
		
		ihjc03fDao.pagingQuery(page,parameter);
		if(page.getEntityCount()==0){
			Collection<Tbih03f> colIh03f=ihjc03fDao.queryIh03fBasic(parameter);
			page.setEntities(colIh03f);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public void saveTbih21b(Map<String, Object> parameter) throws Exception {
		Collection<Tbih21b> dataTbih21bs = (Collection<Tbih21b>) parameter.get("ListIh21b");
		String deleteFlag= (String)parameter.get("deleteFlag");
			for (Tbih21b ih21b : dataTbih21bs) {
				if (StringHelper.isEmpty(ih21b.getSno())) {
					ih21b.setIh21bId(AppUtils.generateUniqueKey());
					ih21b.setCompId(AppUtils.getCompId());
					ih21b.setCreateDate(AppUtils.getCurrentDate());
					ih21b.setCreateEmp(AppUtils.getUserName());
					if(StringHelper.isEmpty(ih21b.getSno())){
						Map<String,Object> mapp=new HashMap<String,Object>();
						mapp.put("compId", ih21b.getCompId());
						mapp.put("contNo", ih21b.getContNo());
						ih21b.setSno(ihjcComm01Dao.getSNo(mapp));
					}
					if(ih21b.getStoragePrice()!=null&&ih21b.getStoragePrice().compareTo(BigDecimal.ZERO)>0){
						ih21b.setIsStorage("Y");
					}
					if((ih21b.getOverduePrice()!=null&&ih21b.getOverduePrice().compareTo(BigDecimal.ZERO)>0)||
							(ih21b.getOverdueStdPrice()!=null&&ih21b.getOverdueStdPrice().compareTo(BigDecimal.ZERO)>0)){
						ih21b.setIsOverdue("Y");
					}
					if(ih21b.getTranPrice()!=null&&ih21b.getTranPrice().compareTo(BigDecimal.ZERO)>0){
						ih21b.setIsTran("Y");
					}
					if(ih21b.getLiftingPrice()!=null&&ih21b.getLiftingPrice().compareTo(BigDecimal.ZERO)>0){
						ih21b.setIsLifting("Y");
					}
					if(ih21b.getPremiumsPrice()!=null&&ih21b.getPremiumsPrice().compareTo(BigDecimal.ZERO)>0){
						ih21b.setIsPremiums("Y");
					}
					if(ih21b.getPrice()==null||ih21b.getPrice().compareTo(BigDecimal.ZERO)==0){
						ih21b.setPrice(AppUtils.getBigDecimal(ih21b.getStoragePrice()).add(AppUtils.getBigDecimal(ih21b.getOrderPrice()))
								.add(AppUtils.getBigDecimal(ih21b.getOverdueStdPrice())).subtract(AppUtils.getBigDecimal(ih21b.getDiscountPrice())));
					}
					ihjc21Dao.save(ih21b);
				}else{
					//删除
					if (StringHelper.isNotEmpty(deleteFlag)&&"Y".equals(deleteFlag)) {
						ihjc21Dao.delete(ih21b);
					}else{//修改
						if(ih21b.getStoragePrice()!=null&&ih21b.getStoragePrice().compareTo(BigDecimal.ZERO)>0){
							ih21b.setIsStorage("Y");
						}
						if((ih21b.getOverduePrice()!=null&&ih21b.getOverduePrice().compareTo(BigDecimal.ZERO)>0)||
								(ih21b.getOverdueStdPrice()!=null&&ih21b.getOverdueStdPrice().compareTo(BigDecimal.ZERO)>0)){
							ih21b.setIsOverdue("Y");
						}
						if(ih21b.getTranPrice()!=null&&ih21b.getTranPrice().compareTo(BigDecimal.ZERO)>0){
							ih21b.setIsTran("Y");
						}
						if(ih21b.getLiftingPrice()!=null&&ih21b.getLiftingPrice().compareTo(BigDecimal.ZERO)>0){
							ih21b.setIsLifting("Y");
						}
						if(ih21b.getPremiumsPrice()!=null&&ih21b.getPremiumsPrice().compareTo(BigDecimal.ZERO)>0){
							ih21b.setIsPremiums("Y");
						}
						if(ih21b.getPrice()==null||ih21b.getPrice().compareTo(BigDecimal.ZERO)==0){
							ih21b.setPrice(AppUtils.getBigDecimal(ih21b.getStoragePrice()).add(AppUtils.getBigDecimal(ih21b.getOrderPrice()))
									.add(AppUtils.getBigDecimal(ih21b.getOverdueStdPrice())).subtract(AppUtils.getBigDecimal(ih21b.getDiscountPrice())));
						}
						ih21b.setUpdateDate(AppUtils.getCurrentDate());
						ih21b.setUpdateEmp(AppUtils.getUserName());
						ihjc21Dao.update(ih21b);
					}
				}
			}
	}
	
	@DataResolver
	public void saveTbih21c(Collection<Tbih21c> datas, Map<String, Object> parameter) throws Exception {
			String ih21Id="";
			if(parameter!=null){
				ih21Id=AppUtils.toValidString(parameter.get("ih21Id"));
			}
			for (Tbih21c ih21c : datas) {
				EntityState state = EntityUtils.getState(ih21c);
				if (state.equals(EntityState.NEW)) {
					ih21c.setIh21cId(AppUtils.generateUniqueKey());
					ih21c.setIh21Id(ih21Id);
					ih21c.setCreateDate(AppUtils.getCurrentDate());
					ih21c.setCreateEmp(AppUtils.getUserName());
					ihjc21Dao.save(ih21c);
				}
				if (state.equals(EntityState.MODIFIED)) {
					ih21c.setUpdateDate(AppUtils.getCurrentDate());
					ih21c.setUpdateEmp(AppUtils.getUserName());
					ihjc21Dao.update(ih21c);
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc21Dao.delete(ih21c);
				}
			}
	}
	
	@DataResolver
	public void saveTbih03a(Collection<Tbih03a> datas, Map<String, Object> parameter) throws Exception {
			for (Tbih03a ih03a : datas) {
				EntityState state = EntityUtils.getState(ih03a);
				if (state.equals(EntityState.NEW)) {
					ih03a.setIh03aId(AppUtils.generateUniqueKey());
					ih03a.setCreateDate(AppUtils.getCurrentDate());
					ih03a.setCreateEmp(AppUtils.getUserName());
					ihjc21Dao.save(ih03a);
				}
				if (state.equals(EntityState.MODIFIED)) {
					ih03a.setUpdateDate(AppUtils.getCurrentDate());
					ih03a.setUpdateEmp(AppUtils.getUserName());
					ihjc21Dao.update(ih03a);
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc21Dao.delete(ih03a);
				}
			}
	}
	
	@DataResolver
	public void saveTbih03c(Collection<Tbih03c> datas, Map<String, Object> parameter) throws Exception {
			for (Tbih03c ih03c : datas) {
				EntityState state = EntityUtils.getState(ih03c);
				if (state.equals(EntityState.NEW)) {
					ih03c.setIh03cId(AppUtils.generateUniqueKey());
					ih03c.setCreateDate(AppUtils.getCurrentDate());
					ih03c.setCreateEmp(AppUtils.getUserName());
					ihjc21Dao.save(ih03c);
				}
				if (state.equals(EntityState.MODIFIED)) {
					ih03c.setUpdateDate(AppUtils.getCurrentDate());
					ih03c.setUpdateEmp(AppUtils.getUserName());
					ihjc21Dao.update(ih03c);
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc21Dao.delete(ih03c);
				}
			}
	}
	
	@DataResolver
	public void saveTbih03e(Collection<Tbih03e> datas, Map<String, Object> parameter) throws Exception {
			for (Tbih03e ih03e : datas) {
				EntityState state = EntityUtils.getState(ih03e);
				if (state.equals(EntityState.NEW)) {
					ih03e.setIh03eId(AppUtils.generateUniqueKey());
					ih03e.setCreateDate(AppUtils.getCurrentDate());
					ih03e.setCreateEmp(AppUtils.getUserName());
					ihjc21Dao.save(ih03e);
				}
				if (state.equals(EntityState.MODIFIED)) {
					ih03e.setUpdateDate(AppUtils.getCurrentDate());
					ih03e.setUpdateEmp(AppUtils.getUserName());
					ihjc21Dao.update(ih03e);
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc21Dao.delete(ih03e);
				}
			}
	}
	
	@DataResolver
	public void saveTbih03f(Collection<Tbih03f> datas, Map<String, Object> parameter) throws Exception {
			for (Tbih03f ih03f : datas) {
				EntityState state = EntityUtils.getState(ih03f);
				if (state.equals(EntityState.NEW)) {
					ih03f.setIh03fId(AppUtils.generateUniqueKey());
					ih03f.setCreateDate(AppUtils.getCurrentDate());
					ih03f.setCreateEmp(AppUtils.getUserName());
					ihjc21Dao.save(ih03f);
				}
				if (state.equals(EntityState.MODIFIED)) {
					ih03f.setUpdateDate(AppUtils.getCurrentDate());
					ih03f.setUpdateEmp(AppUtils.getUserName());
					ihjc21Dao.update(ih03f);
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc21Dao.delete(ih03f);
				}
			}
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public void saveTbih21bCommitOrCancle(Map<String, Object> parameter) throws Exception {
		Collection<Tbih21b> ListIh21b = (Collection<Tbih21b>) parameter.get("ListIh21b");
//		Collection<Tbih03a> ListIh03a = (Collection<Tbih03a>) parameter.get("ListIh03a");
//		Collection<Tbih03c> ListIh03c = (Collection<Tbih03c>) parameter.get("ListIh03c");
		String status = (String) parameter.get("status");
			for (Tbih21b ih21b : ListIh21b) {
				//启用：01
				if(StringHelper.isNotEmpty(status)&&"01".equals(status)){
					ih21b.setUseDate(AppUtils.getCurrentDateString("yyyyMMdd"));
					ih21b.setUseEmp(AppUtils.getUserName());
					ih21b.setIsuse(status);
					ih21b.setUpdateDate(AppUtils.getCurrentDate());
					ih21b.setUpdateEmp(AppUtils.getUserName());
					ihjc21Dao.update(ih21b);
					
//					if(StringHelper.isNotEmpty(ih21b.getIsOverdue())&&"Y".equals(ih21b.getIsOverdue())){
//						for(Tbih03a ih03a:ListIh03a){
//							if(StringHelper.isEmpty(ih03a.getCustNo())){
//								Tbih03a ih03aNew =  new Tbih03a();
//								AppUtils.copyProperties(ih03a, ih03aNew);
//								ih03aNew.setIh03aId(AppUtils.generateUniqueKey());
//								ih03aNew.setCompId(AppUtils.getCompId());
//								ih03aNew.setContNo(ih21b.getContNo());
//								ih03aNew.setCustNo(ih21b.getCustNo());
//								ih03aNew.setCustName(ih21b.getCustName());
//								ih03aNew.setUseDate(AppUtils.getCurrentDateString("yyyyMMdd"));
//								ih03aNew.setStatus(status);
//								ihjc21Dao.save(ih03aNew);	
//							}else{
//								ih03a.setUseDate(AppUtils.getCurrentDateString("yyyyMMdd"));
//								ih03a.setStatus(status);
//								ihjc21Dao.update(ih03a);
//							}
//						}
//					}
//					
//					if(StringHelper.isNotEmpty(ih21b.getIsDiscount())&&"Y".equals(ih21b.getIsDiscount())){
//						for(Tbih03c ih03c:ListIh03c){
//							if(StringHelper.isEmpty(ih03c.getCustNo())){
//								Tbih03c ih03cNew =  new Tbih03c();
//								AppUtils.copyProperties(ih03c, ih03cNew);
//								ih03cNew.setIh03cId(AppUtils.generateUniqueKey());
//								ih03cNew.setCompId(AppUtils.getCompId());
//								ih03cNew.setContNo(ih21b.getContNo());
//								ih03cNew.setCustNo(ih21b.getCustNo());
//								ih03cNew.setCustName(ih21b.getCustName());
//								ih03cNew.setUsedate(AppUtils.getCurrentDateString("yyyyMMdd"));
//								ih03cNew.setStatus(status);
//								ihjc21Dao.save(ih03cNew);	
//							}else{
//								ih03c.setUsedate(AppUtils.getCurrentDateString("yyyyMMdd"));
//								ih03c.setStatus(status);
//								ihjc21Dao.update(ih03c);
//							}
//						}
//					}
				}else if(StringHelper.isNotEmpty(status)&&"10".equals(status)){
					ih21b.setStopDate(AppUtils.getCurrentDateString("yyyyMMdd"));
					ih21b.setStopEmp(AppUtils.getUserName());
					ih21b.setIsuse(status);
					ih21b.setUpdateDate(AppUtils.getCurrentDate());
					ih21b.setUpdateEmp(AppUtils.getUserName());
					ihjc21Dao.update(ih21b);
					
//					if(StringHelper.isNotEmpty(ih21b.getIsOverdue())&&"Y".equals(ih21b.getIsOverdue())){
//						for(Tbih03a ih03a:ListIh03a){
//							ih03a.setStatus(status);
//							ihjc21Dao.update(ih03a);
//						}
//					}
//					
//					if(StringHelper.isNotEmpty(ih21b.getIsDiscount())&&"Y".equals(ih21b.getIsDiscount())){
//						for(Tbih03c ih03c:ListIh03c){
//							ih03c.setStatus(status);
//							ihjc21Dao.update(ih03c);
//						}
//					}
				}
			}
	}
}
package com.jghz.ih.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import com.base.exception.AppException;
import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc40Dao;
import com.jghz.ih.dao.Ihjc40aDao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih02a;
import com.jghz.ih.entity.Tbih40;
import com.jghz.ih.entity.Tbih40a;


/**
 * 单表维护服务类
 * 实现对com.jghz.ih.entity.Tbih40对象信息的保存操作
 */

@Transactional
@Component("ihjc40Service")
public class Ihjc40Service {
	@Resource
	private Ihjc40Dao ihjc40Dao;
	
	@Resource
	private Ihjc40aDao ihjc40aDao;
	
	@Resource
	private Ihjc02Dao ihjc02Dao;

	@DataProvider
	public void loadTbih40(Page<Tbih40> page, Map<String, Object> parameter) throws Exception {
		ihjc40Dao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih40a(Page<Tbih40a> page, Map<String, Object> parameter) throws Exception {
		ihjc40aDao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public Collection<Map<String,Object>> loadCust(Map<String, Object> parameter) {
		Collection<Map<String,Object>> listIh40Cust=ihjc40Dao.queryIh40Cust(parameter);
		return listIh40Cust;
	}
	
	@DataResolver
	public void saveTbih40(Collection<Tbih40> ListIh40) throws Exception {
		Session session = ihjc40Dao.getSession();
		try {
			for (Tbih40 tbih40 : ListIh40) {
				EntityState state = EntityUtils.getState(tbih40);
				final Tbih40 ih40 = tbih40;
				if (state.equals(EntityState.NEW)) {
					ih40.setIh40Id(AppUtils.generateUniqueKey());
					ih40.setCompId(AppUtils.getCompId());
					ih40.setCreateDate(new Date());
					ih40.setUpdateDate(new Date());
					session.save(ih40);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih40);
				}
				if (state.equals(EntityState.DELETED)) {
					String ih40Id = ih40.getIh40Id();
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih40Id", ih40Id);
					List<Tbih40a> listIh40a = ihjc40aDao.queryList(mapParam);
					for(Tbih40a ih40a:listIh40a){
						session.delete(ih40a);
					}
					
					session.delete(ih40);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih40Stu(Map<String,Object> parameters) throws Exception {
		Collection<Tbih40> ListIh40 = (Collection<Tbih40>) parameters.get("ListIh40");
		String status = (String) parameters.get("status");
		Session session = ihjc40Dao.getSession();
		try {
			for (Tbih40 ih40 : ListIh40) {
				/*//没有扣款时
				if("10".equals(status)&&"00".equals(ih40.getStatus())){
					Map<String,Object> mapParam02 = new HashMap<String,Object>();
					mapParam02.put("compId", ih40.getCompId());
					mapParam02.put("custNo", ih40.getPayCompNo());
					mapParam02.put("custName", ih40.getPayCompName());
					List<Tbih02> listIh02 = ihjc02Dao.queryList02(mapParam02);	
					if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
						Tbih02 ih02 = listIh02.get(0);
						if(ih02.getBalancenum()!=null){
							if(ih02.getBalancenum().compareTo(ih40.getTotalAmt())>=0){
								Tbih02a ih02a = new Tbih02a();
								ih02a.setIh02aId(AppUtils.generateUniqueKey());
								ih02a.setCompId(ih40.getCompId());
								ih02a.setCustNo(ih02.getCustNo());
								ih02a.setCustName(ih02.getCustName());
								ih02a.setLadingNo(ih40.getLadingNo());
								ih02a.setOutNo(ih40.getOutNo());
								ih02a.setOutDate(ih40.getOutDate());
								ih02a.setOutAmt(ih40.getTotalAmt());
								ih02a.setSettleDate(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
								ih02a.setSettleNo(ih40.getSettleNo());
								ih02a.setReason("01");//扣款原因：01配货出库
								ih02a.setBalancenum(AppUtils.getBigDecimal(ih02.getBalancenum()).subtract(ih02a.getOutAmt()));
								session.save(ih02a);
								
								ih02.setBalancenum(ih02.getBalancenum().subtract(ih40.getTotalAmt()));//设置付款单位的余额
								session.update(ih02);
								
								ih40.setStatus("10");//已扣款
							}else{
								throw new AppException("付款单位"+ih02.getCustName()+"费用不足,欠款" + ih40.getTotalAmt().subtract(ih02.getBalancenum()));
							}
						}else{
							throw new AppException("付款单位"+ih02.getCustName()+"费用不足,欠款" + ih40.getTotalAmt());
						}
					}else{
						throw new AppException("付款单位"+ih40.getPayCompName()+"不在往来单位的中，请先维护" );
					}
					
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih40Id", ih40.getIh40Id());
					List<Tbih40a> listIh40a = ihjc40aDao.queryList(mapParam);
					for(Tbih40a ih40a:listIh40a){
						ih40a.setStatus(status);
						session.update(ih40a);
					}
					
				}*/
				ih40.setStatus(status);
				session.update(ih40);
				Map<String,Object> mapParam = new HashMap<String,Object>();
				mapParam.put("ih40Id", ih40.getIh40Id());
				List<Tbih40a> listIh40a = ihjc40aDao.queryList(mapParam);
				for(Tbih40a ih40a:listIh40a){
					ih40a.setStatus(status);
					session.update(ih40a);
				}
			}

		} finally {
			session.flush();
			
		}
	}

	@DataResolver
	public void saveTbih40a(Collection<Tbih40a> ListIh40a,Map<String,Object> parameter) throws Exception {
		Session session = ihjc40aDao.getSession();
		try {
			for (Tbih40a ih40a : ListIh40a) {
				EntityState state = EntityUtils.getState(ih40a);
				if (state.equals(EntityState.NEW)) {
					ih40a.setIh40aId(AppUtils.generateUniqueKey());
					ih40a.setCompId(AppUtils.getCompId());
					ih40a.setCreateDate(new Date());
					ih40a.setUpdateDate(new Date());
					session.save(ih40a);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih40a);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(ih40a);
				}
			}

		} finally {
			session.flush();
			
		}
	}
}
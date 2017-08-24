package com.jghz.ih.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
import com.jghz.ih.dao.Ihjc40Dao;
import com.jghz.ih.dao.Ihjc40aDao;
import com.jghz.ih.dao.Ihjc50Dao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih40;
import com.jghz.ih.entity.Tbih40a;
import com.jghz.ih.entity.Tbih50;

@Transactional
@Component
public class Ihjc50Sevice {
	@Resource
	private Ihjc50Dao ihjc50Dao;
	@Resource
	private Ihjc40Dao ihjc40Dao;
	@Resource
	private Ihjc40aDao ihjc40aDao;

	@DataProvider
	public void loadTbih50(Page<Tbih50> page, Map<String, Object> parameter)
			throws Exception {
		ihjc50Dao.pagingQuery50(page,parameter);
	}
	
	@DataProvider
	public void loadTbih02(Page<Tbih02> page, Map<String, Object> parameter)
			throws Exception {
		ihjc50Dao.pagingQuery02(page,parameter);
	}
	
	@DataProvider
	public void loadTbih02a(Page<Tbih02> page, Map<String, Object> parameter)
			throws Exception {
		ihjc50Dao.pagingQuery02a(page,parameter);
	}
	
	@DataResolver
	public void saveTbih50(Collection<Tbih50> datasTbih50,Map<String,Object> parameter) throws Exception {
		String custNo = AppUtils.toValidString(parameter.get("custNo"));
		Session session = ihjc50Dao.getSession();
		try {
			Map<String,Object> mapParam02 = new HashMap<String,Object>();
			mapParam02.put("custNo", custNo);
			mapParam02.put("compId", AppUtils.getCompId());
			List<Tbih02> listIh02 = ihjc50Dao.queryList02(mapParam02);	
			
			for (Tbih50 thih50 : datasTbih50) {
				EntityState state = EntityUtils.getState(thih50);
				Tbih50 ih50 = new Tbih50();
				AppUtils.copyProperties(thih50, ih50);
				if (state.equals(EntityState.NEW)) {
					ih50.setIh50Id(AppUtils.generateUniqueKey());
					ih50.setCompId(AppUtils.getCompId());
					ih50.setCustNo(listIh02.get(0).getCustNo());
					ih50.setCustName(listIh02.get(0).getCustName());
					ih50.setSy("仓储费");
					ih50.setStatus("00");
					ih50.setJkrq(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
					ih50.setSkr(AppUtils.getUserName());
					ih50.setBalance(AppUtils.getBigDecimal(listIh02.get(0).getBalancenum()).add(AppUtils.getBigDecimal(ih50.getJkje())));
					listIh02.get(0).setBalancenum(AppUtils.getBigDecimal(listIh02.get(0).getBalancenum()).add(AppUtils.getBigDecimal(ih50.getJkje())));// 设置付款单位"资金余额"
					// tl04.setKyye(sh51.getKyye()==null?new
					// BigDecimal("0"):sh51.getKyye().add(ih50.getJkje()));//设置付款单位“可用余额”
					session.update(listIh02.get(0));
					session.evict(thih50);
					ih50.setCreateDate(AppUtils.getCurrentDate());
					ih50.setCreateEmp(AppUtils.getUserName());
					session.save(ih50);
				}
                if (state.equals(EntityState.MODIFIED)) {
                	Map<String,Object> mapParam50 = new HashMap<String,Object>();
        			mapParam50.put("tbih50Id", ih50.getIh50Id());
        			mapParam50.put("compId", ih50.getCompId());
        			List<Map<String,Object>> listIh50 = ihjc50Dao.queryList50(mapParam50);	
        			ih50.setJkrq(AppUtils.getCurrentDateString("yyyyMMdd  HH:mm:ss"));
        			ih50.setSkr(AppUtils.getUserName());
        			ih50.setBalance(AppUtils.getBigDecimal(ih50.getBalance()).subtract(AppUtils.getBigDecimal(listIh50.get(0).get("JKJE_"))));
        			ih50.setBalance(ih50.getBalance().add(ih50.getJkje()));
        			ih50.setCustNo(listIh02.get(0).getCustNo());
        			ih50.setCustName(listIh02.get(0).getCustName());
        			// 设置付款单位"资金余额"
        			listIh02.get(0).setBalancenum(
        					listIh02.get(0).getBalancenum().subtract(AppUtils.getBigDecimal(listIh50.get(0).get("JKJE_"))));
        			listIh02.get(0).setBalancenum(
        					listIh02.get(0).getBalancenum().add(ih50.getJkje()));
        			// 设置付款单位“可用余额”
        			// sh51.setKyye(sh51.getKyye().subtract(sh66Before.getJkje()));
        			// sh51.setKyye(sh51.getKyye().add(sh66.getJkje()));
                	
        			session.update(listIh02.get(0));
        			ih50.setUpdateDate(AppUtils.getCurrentDate());
					ih50.setUpdateEmp(AppUtils.getUserName());
                	session.update(ih50);
				}
			}
			
		}finally {
			session.flush();
			
		}
	}
	@SuppressWarnings("unchecked")
	@Expose
	public Properties updateTbih50Stu(Map<String,Object> parameters) throws Exception {
		Collection<Tbih50> ListIh50 = (Collection<Tbih50>) parameters.get("ListIh50");
		String status = (String) parameters.get("status");
		Session session = ihjc50Dao.getSession();
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for (Tbih50 ih50 : ListIh50) {
				ih50.setStatus(status);
				if(StringHelper.isNotEmpty(ih50.getDeliveryNo())){	
					Map<String,Object> paramater40 = new HashMap<String,Object>();
					paramater40.put("compId", ih50.getCompId());
					paramater40.put("deliveryNo", ih50.getDeliveryNo());
					List<Tbih40> listIh40 = ihjc40Dao.queryList(paramater40);
					for(Tbih40 ih40:listIh40){
						if(StringHelper.isNotEmpty(status)&&status.equals("01")){
							ih40.setBillNo(ih50.getBillNo());
							ih40.setBillCompName(ih50.getBillCompName());
							ih40.setBillCompNo(ih50.getBillCompNo());
							ih40.setStatus(status);
							session.update(ih40);
							
							Map<String,Object> paramater40a = new HashMap<String,Object>();
							paramater40a.put("settleNo", ih40.getSettleNo());
							paramater40a.put("ih40Id", ih40.getIh40Id());
							List<Tbih40a> listIh40a = ihjc40aDao.queryList(paramater40a);
							for(Tbih40a ih40a:listIh40a){
								ih40a.setBillNo(ih50.getBillNo());
								ih40a.setBillCompName(ih50.getBillCompName());
								ih40a.setBillCompNo(ih50.getBillCompNo());
								ih40a.setStatus(status);
								session.update(ih40a);
							}
						}else if(StringHelper.isNotEmpty(status)&&status.equals("10")){
							ih40.setBillNo(null);
							ih40.setBillCompName(null);
							ih40.setBillCompNo(null);
							ih40.setStatus("00");
							session.update(ih40);
							
							Map<String,Object> paramater40a = new HashMap<String,Object>();
							paramater40a.put("settleNo", ih40.getSettleNo());
							paramater40a.put("ih40Id", ih40.getIh40Id());
							List<Tbih40a> listIh40a = ihjc40aDao.queryList(paramater40a);
							for(Tbih40a ih40a:listIh40a){
								ih40a.setBillNo(null);
								ih40a.setBillCompName(null);
								ih40a.setBillCompNo(null);
								ih40a.setStatus("00");
								session.update(ih40a);
							}
						}
						
					}
					
				}
				ih50.setUpdateDate(AppUtils.getCurrentDate());
				ih50.setUpdateEmp(AppUtils.getUserName());
				session.update(ih50);
				session.flush();
			}

		} finally {
			
			
		}
		
		prop.put("flag", flag);
		return prop;
	}
	
}

package com.jghz.sh.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.base.constant.SystemConstant;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc03wdDao;
import com.jghz.sh.dao.Shjc07wdDao;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd07;

/**
 * 单表维护服务�?
 * 实现对com.ec.entity.Tbwd03对象信息的保存操�?
 */
@Component("ecjc07Service")
public class Ecjc07Service  extends HibernateDao{

	@Resource
	private Shjc07wdDao shjc07wdDao;
	
	 @DataProvider
		public void loadwd07(Page<Tbwd07> page,  Map<String, Object> paramater)
				throws Exception {
		 shjc07wdDao.pagingQuery07(page,paramater);
		 Collection<Tbwd07> col= page.getEntities();
		 for(Tbwd07 wd07:col){
		 }
		 page.setEntities(col);
		}

    /**
     * �����޸�ɾ��
     * @param wd03s
     * @throws Exception
     */
	@DataResolver
	public void saveTbwd03(Collection<Tbwd03> wd03s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbwd03 wd03 : wd03s) {
				EntityState state = EntityUtils.getState(wd03);
				final Tbwd03 w03 = wd03;
				if (state.equals(EntityState.NEW)) {
					w03.setWd03Id(AppUtils.generateUniqueKey());
					w03.setCreateTime(new Date());
					w03.setUpdateTime(new Date());
					session.save(w03);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(w03);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(w03);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	@DataResolver
	public void saveSH(Collection<Tbwd03> wd03s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbwd03 wd03 : wd03s) {
				EntityState state = EntityUtils.getState(wd03);
				final Tbwd03 w03 = wd03;
				
				if (state.equals(EntityState.MODIFIED)) {
					session.update(w03);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	
	@DataResolver
	public String getCarrierNo(String userType) throws Exception {
		String carrierNo = "C000000";
		return carrierNo;
	}
	
	
	
	
	
	
	
	
	

}
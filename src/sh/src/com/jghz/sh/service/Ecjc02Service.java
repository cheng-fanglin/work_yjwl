package com.jghz.sh.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.base.constant.SystemConstant;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc01wdDao;
import com.jghz.sh.dao.Shjc02wdDao;
import com.jghz.sh.dao.Shjc03wdDao;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd02;
import com.jghz.sh.entity.Tbwd03;

/**
 * 单表维护服务�?
 * 实现对com.ec.entity.Tbwd02对象信息的保存操�?
 */
@Component("ecjc02Service")
public class Ecjc02Service  extends HibernateDao{

	@Resource
	private Shjc02wdDao shjc02wdDao;
	
	 @DataProvider
		public void loadwd02(Page<Tbwd02> page, Map<String, Object> paramater)
				throws Exception {
		 shjc02wdDao.pagingQuery02(page,paramater);
		 Collection<Tbwd02> col= page.getEntities();
		 for(Tbwd02 wd02:col){
			 String Id1 = wd02.getDriverHead();
			 String Id2 = wd02.getDriverLisenceImg();
			 String Id3 = wd02.getIdentifyImg();
			 if(Id1 != null){
				 wd02.setDriverShow(SystemConstant.compressUrl+shjc02wdDao.getFilePath(Id1));
			 }else{
				 wd02.setDriverShow("/jghz/html_qt/images/no_imgage.jpg");
			 }
			 if(Id2 != null){
				 wd02.setDriverLisenceShow(SystemConstant.compressUrl+shjc02wdDao.getFilePath(Id2));
			 }else{
				 wd02.setDriverLisenceShow("/jghz/html_qt/images/no_imgage.jpg");
			 }
			 if(Id3 != null){
				 wd02.setIdentifyShow(SystemConstant.compressUrl+shjc02wdDao.getFilePath(Id3));
			 }else{
				 wd02.setIdentifyShow("/jghz/html_qt/images/no_imgage.jpg");
			 }
		 }
		 page.setEntities(col);
		}

    /**
     * �����޸�ɾ��
     * @param wd02s
     * @throws Exception
     */
	@DataResolver
	public void saveTbwd02(Collection<Tbwd02> wd02s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbwd02 wd02 : wd02s) {
				EntityState state = EntityUtils.getState(wd02);
				final Tbwd02 w02 = wd02;
				if (state.equals(EntityState.NEW)) {
					w02.setWd02Id(new VMID().toString());
					w02.setCreateTime(new Date());
					w02.setUpdateTime(new Date());
					session.save(w02);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(w02);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(w02);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	@DataResolver
	public void saveSH(Collection<Tbwd02> wd02s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbwd02 wd02 : wd02s) {
				EntityState state = EntityUtils.getState(wd02);
				final Tbwd02 w02 = wd02;
				
				if (state.equals(EntityState.MODIFIED)) {
					session.update(w02);
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
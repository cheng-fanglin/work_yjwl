package com.jghz.sh.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.base.constant.SystemConstant;
import com.base.util.AppUtils;
import com.base.util.StringUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.pt.entity.Bdf2Message;
import com.jghz.sh.dao.Shjc40Dao;
import com.jghz.sh.dao.Shjc43Dao;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh22;
import com.jghz.sh.entity.Tbsh33;
import com.jghz.sh.entity.Tbsh34;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd07;

/**
 * 单表维护服务�?
 * 实现对com.ec.entity.Tbwd07对象信息的保存操�?
 */
@Component("shjc43Service")
public class Shjc43Service  extends HibernateDao{

	@Resource
	private Shjc43Dao shjc43Dao;
	
	 @DataProvider
		public void loadsh33(Page<Tbsh33> page,  Map<String, Object> paramater)
				throws Exception {
		 shjc43Dao.pagingQuery33(page,paramater);
		 Collection<Tbsh33> col= page.getEntities();
		 for(Tbsh33 sh33:col){
			 String Id = sh33.getUpload();
			 if(Id != null){
				 sh33.setUpload(SystemConstant.compressUrl+shjc43Dao.getFilePath(Id));
			 }else{
				 sh33.setUpload("/jghz/html_qt/images/no_imgage.jpg");
			 }
		 }
		 page.setEntities(col);	
	 }
	 @DataProvider
		public void loadsh34(Page<Tbsh34> page,  Map<String, Object> paramater)
				throws Exception {
		 shjc43Dao.pagingQuery34(page,paramater);
		}

    /**
     * �����޸�ɾ��
     * @param wd07s
     * @throws Exception
     */
	@DataResolver
	public void saveTbsh33(Collection<Tbsh33> sh33s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbsh33 sh33 : sh33s) {
				EntityState state = EntityUtils.getState(sh33);
				final Tbsh33 h33 = sh33;
				if (state.equals(EntityState.NEW)) {
					h33.setSh33Id(AppUtils.generateUniqueKey());
					h33.setCreateDate(new Date());
					h33.setUpdateDate(new Date());
					h33.setStatus("01");
					session.save(h33);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(h33);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(h33);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	/**
     * �����޸�ɾ��
     * @param wd07s
     * @throws Exception
     */
	@DataResolver
	public void saveTbsh34(Collection<Tbsh34> sh34s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbsh34 sh34 : sh34s) {
				EntityState state = EntityUtils.getState(sh34);
				final Tbsh34 h34 = sh34;
				if (state.equals(EntityState.NEW)) {
					h34.setSh34Id(AppUtils.generateUniqueKey());
					h34.setCreateDate(new Date());
					h34.setUpdateDate(new Date());
					session.save(h34);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(h34);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(h34);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	/**
     * �����޸�ɾ��
     * @param wd07s
     * @throws Exception
     */
	@DataResolver
	public void saveMessage(Collection<Tbsh34> sh34s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbsh34 sh34 : sh34s) {
				String	settleNo = sh34.getSettleNo();
				String  type = sh34.getType();
				String  approveEmp = sh34.getApproveEmp();
				session.update(sh34);
				Bdf2Message bm = new Bdf2Message();
				bm.setId(AppUtils.generateUniqueKey());
				bm.setTitle("运输杂项报支审核提醒");
				bm.setContent("运输单号为:"+settleNo+",报支内容为:"+type+",请前往结算审核页面审核！");
			    bm.setReceiver(approveEmp);
			    bm.setSendDate(AppUtils.getCurrentDate());
			    bm.setSender(sh34.getSendEmp());
			    bm.setRead(false);
			    session.save(bm);
			}
		    
		} finally {
			session.flush();
			
		}
	}
	
}
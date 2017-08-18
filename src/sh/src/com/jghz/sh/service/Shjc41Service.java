package com.jghz.sh.service;

import java.rmi.dgc.VMID;
import java.util.*;

import javax.annotation.Resource;

import org.hibernate.Session;
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
import com.jghz.sh.dao.Shjc41Dao;
import com.jghz.sh.dao.Shjc42Dao;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd09;

/**
 * 单表维护服务�?
 * 实现对com.ec.entity.Tbwd09对象信息的保存操�?
 */
@Component("shjc41Service")
public class Shjc41Service  extends HibernateDao{

	@Resource
	private Shjc41Dao shjc41Dao;
	
	 @DataProvider
		public void loadsh10a(Page page,  Map<String, Object> paramater)
				throws Exception {
		 shjc41Dao.pagingQuery10a(page,paramater);
		}

    /**
     * �����޸�ɾ��
     * @param wd09s
     * @throws Exception
     */
	@DataResolver
	public void saveTbsh10a(Collection<Tbsh10a> sh10as) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbsh10a sh10a : sh10as) {
				EntityState state = EntityUtils.getState(sh10a);
				final Tbsh10a s10a = sh10a;
				if (state.equals(EntityState.NEW)) {
					s10a.setSh10aId(AppUtils.generateUniqueKey());
					s10a.setCreateDate(new Date());
					s10a.setUpdateDate(new Date());
					session.save(s10a);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(s10a);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(s10a);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	
	@DataProvider
	public void findCarNo(Page<Tbwd03> page , String carNo) throws Exception {
		shjc41Dao.getCarNoList(page , carNo);
	}
	
}
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
import com.jghz.sh.dao.Shjc42Dao;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd09;

/**
 * 单表维护服务�?
 * 实现对com.ec.entity.Tbwd09对象信息的保存操�?
 */
@Component("shjc42Service")
public class Shjc42Service  extends HibernateDao{

	@Resource
	private Shjc42Dao shjc42Dao;
	
	 @DataProvider
		public void loadwd09(Page<Tbwd09> page,  Map<String, Object> paramater)
				throws Exception {
		 shjc42Dao.pagingQuery09(page,paramater);
		}

    /**
     * �����޸�ɾ��
     * @param wd09s
     * @throws Exception
     */
	@DataResolver
	public void saveTbwd09(Collection<Tbwd09> wd09s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbwd09 wd09 : wd09s) {
				EntityState state = EntityUtils.getState(wd09);
				final Tbwd09 w09 = wd09;
				if (state.equals(EntityState.NEW)) {
					w09.setWd09Id(AppUtils.generateUniqueKey());
					w09.setCreateTime(new Date());
					w09.setUpdateTime(new Date());
					session.save(w09);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(w09);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(w09);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	
	@DataProvider
	public void findCarNo(Page<Tbwd03> page , String carNo) throws Exception {
		shjc42Dao.getCarNoList(page , carNo);
	}
	
}
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
import com.jghz.sh.dao.Shjc40Dao;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd07;

/**
 * 单表维护服务�?
 * 实现对com.ec.entity.Tbwd07对象信息的保存操�?
 */
@Component("shjc40Service")
public class Shjc40Service  extends HibernateDao{

	@Resource
	private Shjc40Dao shjc40Dao;
	
	 @DataProvider
		public void loadwd07(Page<Tbwd07> page,  Map<String, Object> paramater)
				throws Exception {
		 shjc40Dao.pagingQuery07(page,paramater);
		}

    /**
     * �����޸�ɾ��
     * @param wd07s
     * @throws Exception
     */
	@DataResolver
	public void saveTbwd07(Collection<Tbwd07> wd07s) throws Exception {
		Session session = this.getSession();
		
		try {
			for (Tbwd07 wd07 : wd07s) {
				EntityState state = EntityUtils.getState(wd07);
				final Tbwd07 w07 = wd07;
				if (state.equals(EntityState.NEW)) {
					w07.setWd07Id(AppUtils.generateUniqueKey());
					w07.setCreateTime(new Date());
					w07.setUpdateTime(new Date());
					session.save(w07);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(w07);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(w07);
				}
			}

		} finally {
			session.flush();
			
		}
	}
	
	@DataProvider
	public void findCarNo(Page<Tbwd03> page , String carNo) throws Exception {
		shjc40Dao.getCarNoList(page , carNo);
	}
	
}
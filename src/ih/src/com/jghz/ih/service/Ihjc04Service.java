package com.jghz.ih.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih04;

@Transactional
@Component
public class Ihjc04Service extends HibernateDao {
	@DataProvider
	public void loadTbih04(Page<Tbih04> page, Criteria criteria)
			throws Exception {
		DetachedCriteria dc = this
				.buildDetachedCriteria(criteria, Tbih04.class);
		this.pagingQuery(page, dc);

		String hql = " from Tbih04 ";
		ParseResult result = this.parseCriteria(criteria, true, "u");
		if (result != null) {
			hql += "where " + result.getAssemblySql().toString();
			this.pagingQuery(page, hql, "select count(*) " + hql,
					result.getValueMap());
		} else {
			this.pagingQuery(page, hql, "select count(*) " + hql);
		}
	}

	@DataResolver
	public void saveIh04(Collection<Tbih04> ListIh04) throws Exception {
		Session session = this.getSession();
		try {
			for (Tbih04 tbih04 : ListIh04) {
				EntityState state = EntityUtils.getState(tbih04);
				final Tbih04 ih04 = tbih04;
				if (state.equals(EntityState.NEW)) {
					ih04.setIh04Id(new VMID().toString());
					ih04.setCreateDate(new Date());
					ih04.setUpdateDate(new Date());
					session.save(ih04);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih04);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(ih04);
				}
			}
		} finally {
			session.flush();
			
		}
	}

}

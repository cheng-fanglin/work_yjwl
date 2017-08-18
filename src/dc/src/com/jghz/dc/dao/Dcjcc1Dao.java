package com.jghz.dc.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdcc1;

@Repository
public class Dcjcc1Dao extends BaseDao {

	
	/**
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void pagingQuery(Page<Tbdcc1> page, Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdcc1.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("typeId"))) {
 				hql += " and typeId='"+parameter.get("typeId")+"' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("typeName"))) {
 				hql += " and typeName='"+parameter.get("typeName")+"' ";
			}
		} 
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}
	
}

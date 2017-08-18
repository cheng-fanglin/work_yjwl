package com.jghz.dc.dao;

import java.util.Map; 
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils; 
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdca1;

@Repository
public class Dcjca1Dao extends BaseDao {

	/**
	 * @Description 查询公用代码档资料(可以查询所以数据)
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbdca1> page, Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdca1.class.getName()+" where compId = '"+AppUtils.getCompId()+"' ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("sysType"))) {
 				hql += " and sysType like '%"+parameter.get("sysType")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("compTabCode"))) {
 				hql += " and compTabCode like '%"+parameter.get("compTabCode")+"%' ";
			}
		}
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}
}

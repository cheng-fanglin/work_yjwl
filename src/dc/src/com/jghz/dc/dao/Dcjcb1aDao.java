package com.jghz.dc.dao;

import java.util.Map; 
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils; 
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdcb1a;

@Repository
public class Dcjcb1aDao extends BaseDao {

	/**
	 * @Description 查询公用代码档资料(可以查询所以数据)
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbdcb1a> page, Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdcb1a.class.getName()+" where compId = '"+AppUtils.getCompId()+"' ";
		//para1推送ID ，para2推送内容,para3推送Id
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("para1"))) {
 				hql += " and phoneNo like '%"+parameter.get("para1")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("para2"))) {
 				hql += " and pushDesc like '%"+parameter.get("para2")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("para3"))) {
 				hql += " and templateId like '%"+parameter.get("para3")+"%' ";
			}
		}
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}
}

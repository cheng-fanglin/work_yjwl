package com.jghz.ih.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih41;

@Component
public class Ihjc41Dao extends BaseDao{
	public void pagingQuery(Page<Tbih41> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih41.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			//合同号
			if (null != paramater.get("contNo") && !"".equals( paramater.get("contNo"))) {
 				hql += " and contNo like '%"+paramater.get("contNo")+"%' ";
			}
			//对方当事人编号
			if (null !=paramater.get("cuctNo") && !"".equals( paramater.get("cuctNo"))) {
 				hql += " and cuctNo= '"+paramater.get("cuctNo")+"' ";
			}
			//对方当事人
			if (null != paramater.get("cuctName") && !"".equals( paramater.get("cuctName"))) {
 				hql += " and cuctName like '%"+paramater.get("cuctName")+"%' ";
			}
			//对方当事人编号
			if (null !=paramater.get("cuctNo") && !"".equals( paramater.get("cuctNo"))) {
 				hql += " and orderCompNo= '"+paramater.get("cuctNo")+"' ";
			}
			//对方当事人
			if (null != paramater.get("cuctName") && !"".equals( paramater.get("cuctName"))) {
 				hql += " and orderCompName like '%"+paramater.get("cuctName")+"%' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
}

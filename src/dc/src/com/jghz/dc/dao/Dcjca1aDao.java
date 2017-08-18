package com.jghz.dc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdca1a;
import com.jghz.ih.entity.Tbih01a;

@Repository
public class Dcjca1aDao extends BaseDao {
 
	/**
	 * @Description 分页查询
	 * @param page
	 * @param parameter
	 * @throws Exception 
	 */
	public void pagingQuery(Page<Tbdca1a> page, Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdca1a.class.getName()+" where compId = '"+AppUtils.getCompId()+"' ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("sysType"))) {
 				hql += " and sysType='"+parameter.get("sysType")+"' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("compTabCode"))) {
 				hql += " and compTabCode='"+parameter.get("compTabCode")+"' ";
			}
			if (null != parameter.get("dca1Id") && !"".equals( parameter.get("dca1Id"))) {
 				hql += " and dca1Id='"+parameter.get("dca1Id")+"' ";
			} 
			hql += " order by itemNo ";
			this.pagingQuery(page, hql,"select count(*) "+hql);
		}
	}
	
	public List<Map<String,Object>> queryList(Map<String, Object> paramater){
		String hql="select item_No_ ,desp_One_ from "+Tbdca1a.class.getName()+" where sys_Type_='IH' and comp_Tab_Code_='BUSINATURE_'";
		List<Map<String,Object>> list=this.getJdbcTemplate().queryForList(hql);
		return list;
	}
}

package com.jghz.dc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.business.IUser;
import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdcc1a;

@Repository
public class Dcjcc1aDao extends BaseDao {

	
	/**
	 * @Description 过滤查询产品表
	 * @param page
	 * @param criteria
	 * @throws Exception
	 */
	public void loadProdNoByCriteria(Page<Tbdcc1a> page,Criteria criteria) throws Exception{
		IUser user=ContextHolder.getLoginUser();
	 
		String compId=AppUtils.getCompId();
		String hql="from "+Tbdcc1a.class.getName()+" where compId=:compId";
		ParseResult result=this.parseCriteria(criteria,true,"r");
		Map<String,Object> valueMap;
		if(result!=null){
			StringBuffer sb=result.getAssemblySql();
			valueMap=result.getValueMap();
			hql="from "+Tbdcc1a.class.getName()+" r where "+sb.toString()+" and r.compId=:compId";
		}else{
			valueMap=new HashMap<String,Object>();
		}
		String countHql="select count(*) "+hql;
		hql+=" order by name desc"; 
		valueMap.put("compId",compId);
		this.pagingQuery(page, hql,countHql,valueMap);
	}
	
	/**
	 * @Description typeId typeName
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbdcc1a> page, Map<String, Object> parameter) throws Exception {
		//typeId,分类编号, typeName,分类名称, id,物料编号, name,物料全称, shortName,物料简称, searchName,搜索名
		String hql = " from "+Tbdcc1a.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("typeId"))) {
 				hql += " and typeId like '%"+parameter.get("typeId")+"%' ";
			}if (AppUtils.isNotEmpty(parameter.get("typeName"))) {
 				hql += " and typeName like '%"+parameter.get("typeName")+"%' ";
			}if (AppUtils.isNotEmpty(parameter.get("id"))) {
 				hql += " and id like '%"+parameter.get("id")+"%' ";
			}if (AppUtils.isNotEmpty(parameter.get("name"))) {
 				hql += " and name like '%"+parameter.get("name")+"%' ";
			}if (AppUtils.isNotEmpty(parameter.get("shortName"))) {
 				hql += " and shortName like '%"+parameter.get("shortName")+"%' ";
			}if (AppUtils.isNotEmpty(parameter.get("searchName"))) {
 				hql += " and searchName like '%"+parameter.get("searchName")+"%' ";
			}   
		} 
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}	
}

package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdctree;
import com.jghz.ih.entity.Tbih01a;


@Component
public class Ihjc01aDao extends BaseDao{
	
	
	
	public void pagingQuery(Page<Tbih01a> page,Map<String, Object> paramater) throws Exception{
		if(paramater==null){
			return;
		}
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih01a.class.getName()+ " where 1=1 ";
		if(paramater.get("ih01Id")!=null){
			hql += " and ih01Id = :ih01Id ";
			param.put("ih01Id", paramater.get("ih01Id"));
		}
		if(paramater.get("wareCode")!=null){
			hql += " and wareCode like :wareCode ";
			param.put("wareCode", "%"+paramater.get("wareCode")+"%");
		}
		if(paramater.get("wareName")!=null){
			hql += " and wareName like :wareName ";
			param.put("wareName", "%"+paramater.get("wareName")+"%");
		}
		this.pagingQuery(page, hql,"select count(*) "+hql,param);
	}
	
	public List<Tbih01a> queryList(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih01a.class.getName()+ " where 1=1 ";
		if(paramater.get("ih01Id")!=null){
			hql += " and ih01Id = :ih01Id ";
			param.put("ih01Id", paramater.get("ih01Id"));
		}
		if(paramater.get("qwCode")!=null){
			hql += " and qwCode = :qwCode ";
			param.put("qwCode", paramater.get("qwCode"));
		}
		List<Tbih01a> listIh01a = this.query(hql,param);
		return listIh01a;
	}
	
	@DataProvider
	public List<Tbih01a> queryByFatherId(Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbih01a.class.getName()+" where 1=1 ";
		if (parameter != null) {
//			if (AppUtils.isNotEmpty(parameter.get("treeType"))) {
// 				hql += " and treeType='"+parameter.get("treeType")+"' ";
//			}
			if (AppUtils.isNotEmpty(parameter.get("ih01Id"))&&"null"!=parameter.get("ih01Id")) {
 				hql += " and ih01Id='"+parameter.get("ih01Id")+"' ";
			}else{
				hql += " and (ih01Id is null or ih01Id='') ";
			}
			if (AppUtils.isNotEmpty(parameter.get("compId"))) {
 				hql += " and compId='"+parameter.get("compId")+"' ";
			}
			List<Tbih01a> list= this.query(hql);
			return list;
		}else{
			return null;
		}
	}
}

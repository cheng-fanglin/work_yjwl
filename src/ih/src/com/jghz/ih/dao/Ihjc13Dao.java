package com.jghz.ih.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih13;


@Component
public class Ihjc13Dao extends BaseDao{

	
	public void pagingQuery(Page<Tbih13> page, Map<String, Object> paramater)
			throws Exception {
		
		String hql = " from "+Tbih13.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("wareQwCode")!=null){
				hql += " and wareQwCode = '" +paramater.get("wareQwCode")+"'";
			}
			if(paramater.get("custName")!=null){
				hql += " and custName like '%" +paramater.get("custName")+"%'";
			}
			if(paramater.get("labelNo")!=null){
				hql += " and labelNo like '%" +paramater.get("labelNo")+"%'";
			}
			if(paramater.get("gradeNo")!=null){
				hql += " and gradeNo like '%" +paramater.get("gradeNo")+"%'";
			}
			if(paramater.get("productName")!=null){
				hql += " and productName like '%" +paramater.get("productName")+"%'";
			}
			if(paramater.get("size")!=null){
				hql += " and size like '%" +paramater.get("size")+"%'";
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public List<Tbih13> queryList(Map<String, Object> paramater){
		 
		String hql = " from "+Tbih13.class.getName()+ " where 1=1 ";
		if(paramater.get("wareQwCode")!=null){
			hql += " and wareQwCode = '" +paramater.get("wareQwCode")+"'";
		}
		if(paramater.get("custName")!=null){
			hql += " and custName like '%" +paramater.get("custName")+"%'";
		}
		if(paramater.get("labelNo")!=null){
			hql += " and labelNo like '%" +paramater.get("labelNo")+"%'";
		}
		if(paramater.get("gradeNo")!=null){
			hql += " and gradeNo like '%" +paramater.get("gradeNo")+"%'";
		}
		if(paramater.get("productName")!=null){
			hql += " and productName like '%" +paramater.get("productName")+"%'";
		}
		if(paramater.get("size")!=null){
			hql += " and size like '%" +paramater.get("size")+"%'";
		}    
		hql +=" order by createDate desc";
		List<Tbih13> listIh13 = this.query(hql);
		return listIh13;
	}
}

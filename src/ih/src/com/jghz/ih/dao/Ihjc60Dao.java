package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih30;
import com.jghz.ih.entity.Tbih60;
import com.jghz.ih.entity.Tbih60a;

@Component
public class Ihjc60Dao extends BaseDao {
	
	public void pagingQuery60(Page<Tbih60> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih60.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("newCustName")!=null){
				hql += " and newCustName like '%" +paramater.get("newCustName")+"%'";
			}
			if(paramater.get("oldCustName")!=null){
				hql += " and oldCustName like '%" +paramater.get("oldCustName")+"%'";
			}
			if(paramater.get("lableNo")!=null){
				hql += " and lableNo like '%" +paramater.get("lableNo")+"%'";
			}
			 
			if(paramater.get("orderItem")!=null){
				hql += " and orderItem like '%" +paramater.get("orderItem")+"%'";
			}
			if(paramater.get("zhd")!=null){
				hql += " and zhd like '%" +paramater.get("zhd")+"%'";
			} 
			
			if(paramater.get("zsTimeS")!=null){
				hql += " and zsTime >= '" +paramater.get("zsTimeS")+"'";
			}
			if(paramater.get("zsTimeE")!=null){
				hql += " and zsTime <= '" +paramater.get("zsTimeE")+" 24:00:00"+"'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public void pagingQuery60a(Page<Tbih60a> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih60a.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("custName")!=null){
				hql += " and newCustName like '%" +paramater.get("custName")+"%'";
			}
			if(paramater.get("custNo")!=null){
				hql += " and newCustNo like '%" +paramater.get("custNo")+"%'";
			} 
			if(paramater.get("orderItem")!=null){
				hql += " and orderItem like '%" +paramater.get("orderItem")+"%'";
			}
			if(paramater.get("zhd")!=null){
				hql += " and zhd like '%" +paramater.get("zhd")+"%'";
			}   
			if(paramater.get("labelNo")!=null){
				hql += " and labelNo like '%" +paramater.get("labelNo")+"%'";
			}
			if(paramater.get("status")!=null){
				hql += " and status = '" +paramater.get("status")+"'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public List<Tbih03a> queryList03a(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih03a.class.getName()+ " where 1=1 and status='ON' ";
		if(paramater.get("compId")!=null){
			hql += " and compId = ? ";
			param.put("compId", paramater.get("compId"));
		}
		if(paramater.get("cuscode")!=null){
			hql += " and cuscode = ? ";
			param.put("cuscode", paramater.get("cuscode"));
		}
		if(paramater.get("startdate")!=null){
			hql += " and startdate <= ? ";
			param.put("startdate", paramater.get("startdate"));
		}
		if(paramater.get("stopdate")!=null){
			hql += " and stopdate >= ? ";
			param.put("stopdate", paramater.get("stopdate"));
		}
		List<Tbih03a> listIh03a = this.query(hql,param);
		return listIh03a;
	}
	
	public List<Tbih60> queryList(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih60.class.getName()+ " where 1=1 ";
		if(paramater.get("ih60Id")!=null){
			hql += " and ih60Id = :ih60Id ";
			param.put("ih60Id", paramater.get("ih60Id"));
		}
		if(paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if(paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		
		if(paramater.get("overdueFlag")!=null){
			hql += " and overdueFlag = :overdueFlag ";
			param.put("overdueFlag", paramater.get("overdueFlag"));
		}
		if(paramater.get("outNo")!=null){
			hql += " and outNo = :outNo ";
			param.put("outNo", paramater.get("outNo"));
		}
		List<Tbih60> listIh60 = this.query(hql,param);
		return listIh60;
	}
}

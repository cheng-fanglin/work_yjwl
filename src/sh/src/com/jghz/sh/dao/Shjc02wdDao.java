package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbwd02;
import com.jghz.sh.entity.Tbwd03;


@Repository
public class Shjc02wdDao extends BaseDao {
	
	public void pagingQuery02 (Page<Tbwd02> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbwd02.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("phoneNo")!=null){
				hql += " and phoneNo like '%" +paramater.get("phoneNo")+"%'";
			}
			if(paramater.get("userType")!=null){
				hql += " and userType like '%" +paramater.get("userType")+"%'";
			} 
			if(paramater.get("carrierName")!=null){
				hql += " and carrierName like '%" +paramater.get("carrierName")+"%'";
			} 
			if(paramater.get("state")!=null){
				hql += " and state like '%" +paramater.get("state")+"%'";
			} 
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public String getFilePath(String id){
		String filePath = "";
		String sql="select file_path_ as filePath from Tbupload where id_ = '"+id+"' ";
		
		List list= this.getJdbcDao().getListBySQL(sql, null);
		if(list.size()>0){
			Map map =(Map) list.get(0);
			filePath=map.get("filePath").toString();
		}
		
		return filePath;
	}

}

package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd07;


@Repository
public class Shjc07wdDao extends BaseDao {
	
	public void pagingQuery07 (Page<Tbwd07> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbwd07.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("carNo")!=null){
				hql += " and carNo like '%" +paramater.get("carNo")+"%'";
			}
			if(paramater.get("carType")!=null){
				hql += " and carType like '%" +paramater.get("carType")+"%'";
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

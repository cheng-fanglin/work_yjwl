package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih01;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd07;
import com.jghz.sh.entity.Tbwd09;


@Repository
public class Shjc42Dao extends BaseDao {
	
	public void pagingQuery09 (Page<Tbwd09> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbwd09.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("carNo")!=null){
				hql += " and carNo like '%" +paramater.get("carNo")+"%'";
			}
			if(paramater.get("date")!=null){
				hql += " and date like '%" +paramater.get("date")+"%'";
			} 
			if(paramater.get("driverName")!=null){
				hql += " and driverName like '%" +paramater.get("driverName")+"%'";
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
	
	public void getCarNoList(Page<Tbwd03> page,String carNo) throws Exception{
		String hql="from Tbwd03  where  1=1 ";
		if(carNo!=null){
			hql += " and carNo like '%"+carNo+"%' ";
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
}

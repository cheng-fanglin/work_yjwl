package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih50;
import com.jghz.sh.entity.Tbwd01;

import javax.annotation.Resource;
@Repository
public class Shjc01wdDao extends BaseDao {
	
	public void pagingQuery01 (Page<Tbwd01> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbwd01.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("phoneNo")!=null){
				hql += " and phoneNo = '" +paramater.get("phoneNo")+"' ";
			}
			if(paramater.get("userType")!=null){
				hql += " and userType = '" +paramater.get("userType")+"' ";
			} 
			if(paramater.get("carrierNo")!=null){
				hql += " and carrierNo  = '" +paramater.get("carrierNo")+"' ";
			}
			if(paramater.get("carrierName")!=null){
				hql += " and carrierName  = '" +paramater.get("carrierName")+"' ";
			}
			if(paramater.get("state")!=null){
				hql += " and state  = '" +paramater.get("state")+"' ";
			}
		}	
//		String sql = "SELECT *FROM TBWD01 WHERE 1=1";
//		List list = this.getJdbcTemplate().queryForList(sql);
		
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public List<Tbwd01> getObjectList(String ids){
		String hql="from ZczyFinanceReceiveT fr where  fr.receiveId  in("+ids+")";
		
		List<Tbwd01> listTbwd01=(List<Tbwd01>)this.getListByHQL(hql);
		return  listTbwd01;
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
	
	public String getIdByFilePath(String path){
		String id = "";
		String sql="select id_  from Tbupload where file_path_ = '"+path+"' ";
		
		List list= this.getJdbcDao().getListBySQL(sql, null);
		if(list.size()>0){
			Map map =(Map) list.get(0);
			id = map.get("ID_").toString();
		}
		
		return id;
	}
	

}

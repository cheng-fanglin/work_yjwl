package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih01;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd03;
import com.jghz.sh.entity.Tbwd07;
import com.jghz.sh.entity.Tbwd09;


@Repository
public class Shjc41Dao extends BaseDao {
	
	public void pagingQuery10a (Page page, Map<String, Object> paramater)
			throws Exception {
		String sql = "SELECT a.DELIVERY_ADDRESS_ as deliveryAddress , b.USER_NAME_ as userName , b.PHONE_NO_ as phoneNo ,b.CAR_NO_ as carNo ,b.TRANS_ITEM_ as transItem,b.ON_WAY_ as onWay,b.OUT_DATE_ as outDate  from Tbsh10 a LEFT JOIN Tbsh10a b on a.TRANS_NO_ = b.TRANS_NO_ WHERE  1=1 ";
		if (paramater != null) {
			if(paramater.get("carNo")!=null){
				sql += " and b.CAR_NO_ like '%" +paramater.get("carNo")+"%'";
			}
			if(paramater.get("date")!=null){
				sql += " and b.OUT_DATE_ like '%" +paramater.get("date")+"%'";
			} 
			if(paramater.get("driverName")!=null){
				sql += " and b.USER_NAME_ like '%" +paramater.get("driverName")+"%'";
			} 
		}	
		this.getJdbcDao().paginationQuery(sql, page);
	}
	
	public void getCarNoList(Page<Tbwd03> page,String carNo) throws Exception{
		String hql="from Tbwd03  where  1=1 ";
		if(carNo!=null){
			hql += " and carNo like '%"+carNo+"%' ";
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
}

package com.jghz.ih.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih16b;
import com.jghz.ih.entity.Tbih19;

@Component
public class Ihjc16bDao extends BaseDao{
	public void pagingQuery(Page<Tbih16b> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih16b.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			//IH16委托函主档页面显示的提单
			if (null != paramater.get("flag") && !"".equals( paramater.get("flag"))) {
				if("IH16".equals( paramater.get("flag"))){
					hql += " and (ladingEffectE is null or ladingEffectE='') and ladingWgt <> stl ";
				}
			}
			//提单号
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
 				hql += " and ladingNo like '%"+paramater.get("ladingNo")+"%' ";
			}
			//订单项次号
			if (null != paramater.get("orderItem") && !"".equals( paramater.get("orderItem"))) {
 				hql += " and orderItem like '%"+paramater.get("orderItem")+"%' ";
			}
			//牌号
			if (null != paramater.get("gradeNo") && !"".equals( paramater.get("gradeNo"))) {
 				hql += " and gradeNo like '%"+paramater.get("gradeNo")+"%' ";
			}
			//品种大类
			if (null != paramater.get("prodTypeName") && !"".equals( paramater.get("prodTypeName"))) {
 				hql += " and prodTypeName like '%"+paramater.get("prodTypeName")+"%' ";
			}
			//型号
			if (null != paramater.get("size") && !"".equals( paramater.get("size"))) {
 				hql += " and size like '%"+paramater.get("size")+"%' ";
			}
			//客户名称
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
 				hql += " and custName like '%"+paramater.get("custName")+"%' ";
			}
			//开单总量
			if (null != paramater.get("ladingwgt") && !"".equals( paramater.get("ladingwgt"))) {
 				hql += " and ladingwgt like '%"+paramater.get("ladingwgt")+"%' ";
			}
			
			
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	public void pagingQuery19(Page<Tbih19> page, Map<String, Object> paramater)
			throws Exception {
		String sql = "SELECT a.OUT_NO_ as outNo ,a.LADING_NO_ as ladingNo ,a.ORDER_ITEM_ as orderItem,a.CAR_NO_ as carNo , " +
				" a.grade_No_ as gradeNo, a.size_ as size, " +
				" sum(b.LADING_WGT_) as ladingWgt ,sum(a.WGT_) as wgt" +
				" FROM tbih19 a LEFT JOIN  tbih16b b ON a.LADING_NO_ = b.LADING_NO_ WHERE	1 = 1  ";
		if (paramater != null) {	
			if("IH16b".equals(paramater.get("flag"))){
				sql += " and a.status_ <='20' ";
			}
			//提单号
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
				sql += " and a.lading_No_ like '%"+paramater.get("ladingNo")+"%' ";
			}
			
			//品种大类
			if (null != paramater.get("contNo") && !"".equals( paramater.get("contNo"))) {
				sql += " and a.cont_No_= '"+paramater.get("contNo")+"' ";
			}
			//品种大类
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
				sql += " and a.cust_Name_ like '%"+paramater.get("custName")+"%' ";
			}
			//货物编号
			if (null != paramater.get("carNo") && !"".equals( paramater.get("carNo"))) {
				sql += " and a.car_No_ = '"+paramater.get("carNo")+"' ";
			}
			//货物名称
			if (null != paramater.get("orderItem") && !"".equals( paramater.get("orderItem"))) {
				sql += " and a.order_Item_ like '%"+paramater.get("orderItem")+"%' ";
			}
		}
		sql +=" GROUP BY a.OUT_NO_,	a.LADING_NO_,	a.ORDER_ITEM_ ";
		this.getJdbcDao().paginationQuery(sql, page);
		
	}
	
	public void pagingQuery19left(Page<Tbih19> page, Map<String, Object> paramater)
			throws Exception {
		String sql = " SELECT LABEL_NO_ as labelNo ,WGT_ as wgt ,TS_ as ts ,OUT_DATE_ as outDate " +
				" FROM tbih19 " +
				" where COMP_ID_ = '"+AppUtils.getCompId()+"' and status_ <='20'  ";
		if(null !=paramater){
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
				sql += " and LADING_NO_ like '%"+paramater.get("ladingNo")+"%' ";
			}
			if (null != paramater.get("outNo") && !"".equals( paramater.get("outNo"))) {
				sql += " and OUT_NO_ like '%"+paramater.get("outNo")+"%' ";
			}
			if (null != paramater.get("orderItem") && !"".equals( paramater.get("orderItem"))) {
				sql += "  and ORDER_ITEM_ like '%"+paramater.get("orderItem")+"%' ";
			}

		}
		this.getJdbcDao().paginationQuery(sql, page);
		
	}
	
	public List<Tbih16b> queryList(Map<String, Object> paramater){
		List<Tbih16b> listIh16b = new ArrayList<Tbih16b>();
		if(paramater==null){
			return listIh16b;
		}
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih16b.class.getName()+ " where 1=1 ";
		if(paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if(paramater.get("ladingNo")!=null){
			hql += " and ladingNo = :ladingNo ";
			param.put("ladingNo", paramater.get("ladingNo"));
		}
		if(paramater.get("ladingNoF")!=null){
			hql += " and ladingNoF = :ladingNoF ";
			param.put("ladingNoF", paramater.get("ladingNoF"));
		}
		if(paramater.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paramater.get("custNo"));
		}
		if(paramater.get("custName")!=null){
			hql += " and custName = :custName ";
			param.put("custName", paramater.get("custName"));
		}
		
		//IH16委托函主档页面显示的提单
		if (null != paramater.get("flag") && !"".equals( paramater.get("flag"))) {
			if("IH16".equals( paramater.get("flag"))){
				hql += " and (ladingEffectE is null or ladingEffectE='') and ladingWgt <> stl ";
			}
		}
		listIh16b = this.query(hql,param);
		return listIh16b;
	}
	
}

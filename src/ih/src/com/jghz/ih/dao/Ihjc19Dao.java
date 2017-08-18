package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih19;
import com.jghz.ih.entity.Tbih19;

@Component
public class Ihjc19Dao extends BaseDao{
	public void pagingQuery(Page<Tbih19> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih19.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			//合同号
			if (null != paramater.get("outNo") && !"".equals( paramater.get("outNo"))) {
 				hql += " and outNo = '"+paramater.get("outNo")+"' ";
			}
			
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
 				hql += " and ladingNo like '%"+paramater.get("ladingNo")+"%' ";
			}
			
			//品种大类
			if (null != paramater.get("prodType") && !"".equals( paramater.get("prodType"))) {
 				hql += " and prodType= '"+paramater.get("prodType")+"' ";
			}
			//品种大类
			if (null != paramater.get("prodTypeName") && !"".equals( paramater.get("prodTypeName"))) {
 				hql += " and prodTypeName like '%"+paramater.get("prodTypeName")+"%' ";
			}
			//货物编号
			if (null != paramater.get("productNo") && !"".equals( paramater.get("productNo"))) {
 				hql += " and productNo= '"+paramater.get("productNo")+"' ";
			}
			//货物名称
			if (null != paramater.get("productName") && !"".equals( paramater.get("productName"))) {
 				hql += " and productName like '%"+paramater.get("productName")+"%' ";
			}
			
		}else return;
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	//customDropDown中数据查询
	public void pagingQueryCustDrop(Page<Tbih19> page,Criteria criteria) throws Exception {
		String compId=AppUtils.getCompId();
		String sql="select distinct out_no_ outNo,settle_Type_ settleType,receipt_Comp_Name_ receiptCompName," +
				" lading_no_ ladingNo,status_ status,substr(ware_qw_code_,1,2) wareQwCode,cust_name_ custName," +
				" out_Date_ outDate,ph_Date_ phDate,shr_ shr,tran_Type_ tranType" +
				" from tbih19 where comp_id_ = '"+compId+"' ";
		ParseResult result=this.parseCriteria(criteria,true,"r");
		
		Map<String,Object> paramater= new HashMap<String,Object>();
		if(result!=null){
			paramater=result.getValueMap();		
		if( paramater!=null&&paramater.get("ih19Id")!=null){
			sql += " and ih19_id_ = '"+paramater.get("ih19Id")+"' ";
		}
		if( paramater!=null&&paramater.get("ladingNo_1_")!=null){
			sql += " and lading_no_ = '"+paramater.get("ladingNo_1_")+"' ";
		}
		if( paramater!=null&&paramater.get("outNo_1_")!=null){
			sql += " and out_no_ like '%"+paramater.get("outNo_1_")+"%' ";
		}
		if( paramater!=null&&paramater.get("custNo_1_")!=null){
			sql += " and cust_no_ = '"+paramater.get("custNo_1_")+"' ";
		}
		if( paramater!=null&&paramater.get("wareQwNo_1_")!=null){
			sql += " and ware_Qw_No_ = '"+paramater.get("wareQwNo_1_")+"' ";
		}
		if( paramater!=null&&paramater.get("settleType_1_")!=null){
			sql += " and settle_Type_ = '"+paramater.get("settleType_1_")+"' ";
		}
		if( paramater!=null&&paramater.get("receiptCompName_1_")!=null){
			sql += " and receipt_Comp_Name_ = '"+paramater.get("receiptCompName_1_")+"' ";
		}
		if( paramater!=null&&paramater.get("shr_1_")!=null){
			sql += " and shr_ = '"+paramater.get("shr_1_")+"' ";
		}
		if( paramater!=null&&paramater.get("status_1_")!=null){
			sql += " and status_ like '"+paramater.get("status_1_")+"' ";
		}
//		else{
//			sql += " and (status_ = '00' or status_='' or status_ is null) ";
//		}
		}
		this.getJdbcDao().paginationQuery(sql, page);
		

	}
	
	public List<Tbih19> queryList(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih19.class.getName()+ " where 1=1 ";
		if(paramater.get("ih19Id")!=null){
			hql += " and ih19Id = :ih19Id ";
			param.put("ih19Id", paramater.get("ih19Id"));
		}
		if(paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if(paramater.get("sfxzztxc")!=null){
			hql += " and sfxzztxc = :sfxzztxc ";
			param.put("sfxzztxc", paramater.get("sfxzztxc"));
		}
		if(paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		if(paramater.get("productNo")!=null){
			hql += " and productNo = :productNo ";
			param.put("productNo", paramater.get("productNo"));
		}
		if(paramater.get("productName")!=null){
			hql += " and productName = :productName ";
			param.put("productName", paramater.get("productName"));
		}
		if(paramater.get("prodType")!=null){
			hql += " and prodType = :prodType ";
			param.put("prodType", paramater.get("prodType"));
		}
		if(paramater.get("prodTypeName")!=null){
			hql += " and prodTypeName = :prodTypeName ";
			param.put("prodTypeName", paramater.get("prodTypeName"));
		}
		List<Tbih19> listIh19 = this.query(hql,param);
		return listIh19;
	}
	
	
	public List<Map<String,Object>> queryTbih19Info(Map<String, Object> paramater){
		if(paramater==null){
			return null;
		}
		String sql= "select sum(storage_Amt_) storageAmt,sum(total_Amt_) totalAmt,sum(wgt_) outWgt,sum(num_) outNum,count(1) outCount,"+
				 " out_no_ outNo,status_ status, substr(ware_qw_code_,1,2) outWareCode,out_Emp_ outEmp,out_Date_ outDate,"+
				 " product_name_ productName,pay_Comp_Name_ payCompName, ph_Date_ phDate,shr_ shr,syhch_ syhch,"+
				 " xz_Emp_ xzEmp,xz_Time_ xzTime,settle_Type_ settleType,tran_Type_ tranType, lb_ lb,"+
				 " grade_No_ gradeNo,size_ size,end_Line_ endLine,sum(total_Amt_) totalAmt,zz_ zz,car_No_ carNo, "+
				 " driver_License_ driverLicense,ph_Emp_ phEmp,zcr_ zcr,delivery_No_ deliveryNo,comp_id_ compId," +
				 " lifting_Team_ liftingTeam ,lifting_Emp_ liftingEmp , crane_Driver_ craneDriver "+  
				 " from tbih19 "+
				 " where 1=1 ";
		if( paramater!=null&&paramater.get("ih19Id")!=null){
			sql += " and ih19_id_ = '"+paramater.get("ih19Id")+"' ";
		}
		if( paramater!=null&&paramater.get("ladingNo")!=null){
			sql += " and lading_no_ = '"+paramater.get("ladingNo")+"' ";
		}
		if( paramater!=null&&paramater.get("outNo")!=null){
			sql += " and out_no_ = '"+paramater.get("outNo")+"' ";
		}
		if( paramater!=null&&paramater.get("custNo")!=null){
			sql += " and cust_no_ = '"+paramater.get("custNo")+"' ";
		}
		
		sql += " group by out_no_";
		List<Map<String,Object>> listIh19 = this.getJdbcTemplate().queryForList(sql);

		return listIh19;
	}
	
	
	public Tbih19 getOneTbih19(Map<String, Object> paramater) throws Exception{
		if(paramater==null){
			return null;
		}
		Tbih19 ih19=new Tbih19();
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih19.class.getName()+ " where 1=1 ";
		if(paramater.get("ih19Id")!=null){
			hql += " and ih19Id = :ih19Id ";
			param.put("ih19Id", paramater.get("ih19Id"));
		}
		if(paramater.get("outNo")!=null){
			hql += " and outNo = :outNo ";
			param.put("outNo", paramater.get("outNo"));
		}
		if(paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		List<Tbih19> listIh19 = this.query(hql,param);
		if(CollectionUtils.isNotEmpty(listIh19)&&listIh19.get(0)!=null){
			ih19 = listIh19.get(0);
		}else{
			throw new Exception("找不到对应的出库记录");
		}
		
		return ih19;
	}
	
	public void pagingQuery19a(Page<Tbih19> page, Map<String, Object> paramater)
			throws Exception {
		String sql = "SELECT OUT_NO_ as outNo ,CUST_NAME_ as custName ,ORDER_NO_ as orderNo ,ORDER_ITEM_ as orderItem ," +
				" lading_No_ ladingNo,delivery_No_ deliveryNo,GRADE_NO_ as gradeNo ,STEEL_NO_ as steelNo,STATUS_ as status ,SUM(WGT_) as wgt " +
				"from tbih19 where 1=1" ;
		if(paramater != null){
			if (null != paramater.get("outNo") && !"".equals( paramater.get("outNo"))) {
				sql += " and OUT_NO_ like '%"+paramater.get("outNo")+"%' ";
			}
			if (null != paramater.get("orderItem") && !"".equals( paramater.get("orderItem"))) {
				sql += " and order_Item_ like '%"+paramater.get("orderItem")+"%' ";
			}
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
				sql += " and lading_No_ like '%"+paramater.get("ladingNo")+"%' ";
			}
			if (null != paramater.get("deliveryNo") && !"".equals( paramater.get("deliveryNo"))) {
				sql += " and delivery_No_ like '%"+paramater.get("deliveryNo")+"%' ";
			}
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
				sql += " and cust_Name_ like '%"+paramater.get("custName")+"%' ";
			}
			if (null != paramater.get("outDateS") && !"".equals( paramater.get("outDateS"))) {
				sql += " and out_Date_ >= '"+paramater.get("outDateS")+"' ";
			}
			if (null != paramater.get("outDateE") && !"".equals( paramater.get("outDateE"))) {
				sql += " and out_Date_ <= '"+paramater.get("outDateE")+"' ";
			}
			if (null != paramater.get("outStatus") && !"".equals( paramater.get("outStatus"))) {
				sql += " and status_ <= '"+paramater.get("outStatus")+"' ";
			}
		}
		  sql +=" GROUP BY OUT_NO_,lading_No_,ORDER_ITEM_";
		this.getJdbcDao().paginationQuery(sql, page);
	}
	
	public void pagingQuery19b(Page<Tbih19> page, Map<String, Object> paramater)
			throws Exception {
		String hql = "from "+Tbih19.class.getName()+ " where 1=1 ";
		if(paramater != null){
			if (null != paramater.get("outNo") && !"".equals( paramater.get("outNo"))) {
 				hql += " and outNo like '%"+paramater.get("outNo")+"%' ";
			}
			if (null != paramater.get("orderItem") && !"".equals( paramater.get("orderItem"))) {
 				hql += " and orderItem like '%"+paramater.get("orderItem")+"%' ";
			}
			if (null != paramater.get("deliveryNo") && !"".equals( paramater.get("deliveryNo"))) {
				hql += " and deliveryNo like '%"+paramater.get("deliveryNo")+"%' ";
			}
			if (null != paramater.get("lableNo") && !"".equals( paramater.get("lableNo"))) {
 				hql += " and lableNo like '%"+paramater.get("lableNo")+"%' ";
			}
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
 				hql += " and ladingNo like '%"+paramater.get("ladingNo")+"%' ";
			}
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
 				hql += " and custName like '%"+paramater.get("custName")+"%' ";
			}
			if (null != paramater.get("outDateS") && !"".equals( paramater.get("outDateS"))) {
 				hql += " and outDate >= '"+paramater.get("outDateS")+"' ";
			}
			if (null != paramater.get("outDateE") && !"".equals( paramater.get("outDateE"))) {
 				hql += " and outDate <= '"+paramater.get("outDateE")+"' ";
			}
			if (null != paramater.get("outStatus") && !"".equals( paramater.get("outStatus"))) {
				hql += " and status <= '"+paramater.get("outStatus")+"' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
}

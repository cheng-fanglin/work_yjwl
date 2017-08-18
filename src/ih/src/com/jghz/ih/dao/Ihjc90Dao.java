package com.jghz.ih.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih30;

@Component
public class Ihjc90Dao extends BaseDao{
	public List<Map<String,Object>> queryList(Map<String, Object> paramater)
			throws Exception {
		String condition = "";
		if( paramater!=null&&paramater.get("compId")!=null){
			condition += " and comp_id_ = '"+paramater.get("compId")+"' ";
		}
		if( paramater!=null&&paramater.get("custName")!=null){
			condition += " and cust_Name_ like '%"+paramater.get("custName")+"%' ";
		}
		String dateS= AppUtils.toValidString(paramater.get("dateS"));
		String dateE= AppUtils.toValidString(paramater.get("dateE"));
		String hql = "SELECT wareQwCode,productName,gradeNo,custName,SUM(beginWgt) beginWgt,SUM(dayIn) dayIn," +
				" SUM(monthIn) monthIn,SUM(dayOut) dayOut,SUM(monthOut) monthOut,SUM(wgt) wgt FROM(" +
				" SELECT WARE_QW_CODE_ wareQwCode,PRODUCT_NAME_ productName,GRADE_NO_ gradeNo,CUST_NAME_ custName," +
				" SUM(WGT_) beginWgt,0 dayIn,0 monthIn,0 dayOut,0 monthOut,0 wgt" +
				" FROM TBIH30 " +
				" WHERE IN_DATE_<'"+dateS+"' AND (OUT_DATE_ IS NULL OR OUT_DATE_>='"+dateS+"') " + condition+
				" GROUP BY WARE_QW_CODE_ ,PRODUCT_NAME_,GRADE_NO_,CUST_NAME_ " +
				" UNION" +
				" SELECT WARE_QW_CODE_ wareQwCode,PRODUCT_NAME_ productName,GRADE_NO_ gradeNo,CUST_NAME_ custName," +
				" 0 beginWgt,SUM(WGT_) dayIn,0 monthIn,0 dayOut,0 monthOut,0 wgt " +
				" FROM TBIH11 " +
				" WHERE SUBSTR(IN_DATE_,1,8)='"+dateE+"' AND STATUS_='10' " + condition+
				" GROUP BY WARE_QW_CODE_ ,PRODUCT_NAME_,GRADE_NO_,CUST_NAME_" +
				" UNION " +
				" SELECT WARE_QW_CODE_ wareQwCode,PRODUCT_NAME_ productName,GRADE_NO_ gradeNo,CUST_NAME_ custName, " +
				" 0 beginWgt,0 dayIn,SUM(WGT_) monthIn,0 dayOut,0 monthOut,0 wgt  " +
				" FROM TBIH11 " +
				" WHERE SUBSTR(IN_DATE_,1,8)>='"+dateS+"' AND SUBSTR(IN_DATE_,1,8)<='"+dateE+"' AND STATUS_='10' " +condition+
				" GROUP BY WARE_QW_CODE_ ,PRODUCT_NAME_,GRADE_NO_,CUST_NAME_ " +
				" UNION " +
				" SELECT WARE_QW_CODE_ wareQwCode,PRODUCT_NAME_ productName,GRADE_NO_ gradeNo,CUST_NAME_ custName," +
				" 0 beginWgt,0 dayIn,0 monthIn,SUM(WGT_) dayOut,0 monthOut,0 wgt" +
				" FROM TBIH19" +
				" WHERE SUBSTR(OUT_DATE_,1,8)='"+dateE+"' AND STATUS_='20' " +condition+
				" GROUP BY WARE_QW_CODE_ ,PRODUCT_NAME_,GRADE_NO_,CUST_NAME_" +
				" UNION" +
				" SELECT WARE_QW_CODE_ wareQwCode,PRODUCT_NAME_ productName,GRADE_NO_ gradeNo,CUST_NAME_ custName," +
				" 0 beginWgt,0 dayIn,0 monthIn,0 dayOut,SUM(WGT_) monthOut,0 wgt" +
				" FROM TBIH19" +
				" WHERE SUBSTR(OUT_DATE_,1,8)>='"+dateS+"' AND SUBSTR(OUT_DATE_,1,8)<='"+dateE+"' AND STATUS_='20'" +condition+
				" GROUP BY WARE_QW_CODE_ ,PRODUCT_NAME_,GRADE_NO_,CUST_NAME_" +
				" UNION" +
				" SELECT WARE_QW_CODE_ wareQwCode,PRODUCT_NAME_ productName,GRADE_NO_ gradeNo,CUST_NAME_ custName," +
				" 0 beginWgt,0 dayIn,0 monthIn,0 dayOut,0 monthOut,SUM(WGT_) wgt" +
				" FROM TBIH30" +
				" WHERE STATUS_<'20'" +condition+
				" GROUP BY WARE_QW_CODE_ ,PRODUCT_NAME_,GRADE_NO_,CUST_NAME_" +
				" )Tbih90" +
				" GROUP BY wareQwCode,productName,gradeNo,custName";
		
		List<Map<String,Object>> listIh30 = this.getJdbcTemplate().queryForList(hql);
		return listIh30;
	}
}

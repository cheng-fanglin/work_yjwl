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
public class Ihjc91Dao extends BaseDao{
	public List<Map<String,Object>> queryList(Map<String, Object> paramater)
			throws Exception {
		String condition = "";
		if( paramater!=null&&paramater.get("compId")!=null){
			condition += " and comp_id_ = '"+paramater.get("compId")+"' ";
		}
		if( paramater!=null&&paramater.get("liftingTeam")!=null){
			condition += " and lifting_Team_ like '%"+paramater.get("liftingTeam")+"%' ";
		}
		if( paramater!=null&&paramater.get("liftingEmp")!=null){
			condition += " and lifting_Emp_ like '%"+paramater.get("liftingEmp")+"%' ";
		}
		if( paramater!=null&&paramater.get("craneDriver")!=null){
			condition += " and crane_Driver_ like '%"+paramater.get("craneDriver")+"%' ";
		}
		String dateS= AppUtils.toValidString(paramater.get("dateS"));
		String dateE= AppUtils.toValidString(paramater.get("dateE"));
		String hql = "SELECT liftingTeam,liftingEmp,craneDriver," +
				" SUM(dayIn) dayIn,SUM(monthIn) monthIn,SUM(dayOut) dayOut,SUM(monthOut) monthOut," +
				" SUM(monthIn)+SUM(monthOut) wgt FROM(" +
				" SELECT LIFTING_TEAM_  liftingTeam,LIFTING_EMP_ liftingEmp,CRANE_DRIVER_ craneDriver, " +
				"  SUM(WGT_) dayIn,0 monthIn,0 dayOut,0 monthOut  " +
				" FROM TBIH11 " +
				" WHERE SUBSTR(IN_DATE_,1,8)='"+dateE+"' AND STATUS_='10' " + condition+
				" GROUP BY LIFTING_TEAM_,LIFTING_EMP_,CRANE_DRIVER_" +
				" UNION " +
				" SELECT LIFTING_TEAM_  liftingTeam,LIFTING_EMP_ liftingEmp,CRANE_DRIVER_ craneDriver,  " +
				"  0 dayIn,SUM(WGT_) monthIn,0 dayOut,0 monthOut   " +
				" FROM TBIH11 " +
				" WHERE SUBSTR(IN_DATE_,1,8)>='"+dateS+"' AND SUBSTR(IN_DATE_,1,8)<='"+dateE+"' AND STATUS_='10' " +condition+
				" GROUP BY LIFTING_TEAM_,LIFTING_EMP_,CRANE_DRIVER_ " +
				" UNION " +
				" SELECT LIFTING_TEAM_  liftingTeam,LIFTING_EMP_ liftingEmp,CRANE_DRIVER_ craneDriver, " +
				"  0 dayIn,0 monthIn,SUM(WGT_) dayOut,0 monthOut " +
				" FROM TBIH19" +
				" WHERE SUBSTR(OUT_DATE_,1,8)='"+dateE+"' AND STATUS_='20' " +condition+
				" GROUP BY LIFTING_TEAM_,LIFTING_EMP_,CRANE_DRIVER_" +
				" UNION" +
				" SELECT LIFTING_TEAM_  liftingTeam,LIFTING_EMP_ liftingEmp,CRANE_DRIVER_ craneDriver, " +
				"  0 dayIn,0 monthIn,0 dayOut,SUM(WGT_) monthOut " +
				" FROM TBIH19" +
				" WHERE SUBSTR(OUT_DATE_,1,8)>='"+dateS+"' AND SUBSTR(OUT_DATE_,1,8)<='"+dateE+"' AND STATUS_='20'" +condition+
				" GROUP BY LIFTING_TEAM_,LIFTING_EMP_,CRANE_DRIVER_" +
				" )Tbih91" +
				" GROUP BY liftingTeam,liftingEmp,craneDriver";
		
		List<Map<String,Object>> listIh30 = this.getJdbcTemplate().queryForList(hql);
		return listIh30;
	}
}

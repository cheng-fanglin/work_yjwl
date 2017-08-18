package com.jghz.dc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.jghz.dc.entity.Tbdca1a;


@Component
public class DcjcCommonDao extends BaseDao{
	
	
	/**
	 * @Description 传入参数获得公用代码档（datatype mapping 专用）
	 * @param sys
	 * @param tabId
	 * @return Map（key，map）
	 * @throws Exception
	 */
	public Map<String,Object> queryTbdca1aById(String sys,String tabId)
			throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		String sql ="select ITEM_NO_ ,DESP_ONE_ from tbdca1a where COMP_ID_ = ? and SYS_TYPE_ = ? and COMP_TAB_CODE_ = ?";
		List<Map<String, Object>> resluts =this.getJdbcTemplate().queryForList(sql,new Object[]{AppUtils.getCompId(),sys,tabId});
		for(Map<String, Object> map :resluts){
			parameter.put(AppUtils.toValidString(map.get("ITEM_NO_")), map.get("DESP_ONE_"));
		}
		return parameter;
	}
	
	/**
	 * @Description 传入参数获得公用代码档（datatype mapping 专用）
	 * @param sys
	 * @param tabId
	 * @return Map（key，map）
	 * @throws Exception
	 */
	public List<Tbdca1a> queryListTbdca1aById(String sys,String tabId)throws Exception { 
		String hql =" from Tbdca1a where compId = '"+AppUtils.getCompId()+"' " +
				"and sysType = '"+sys+"' and compTabCode = '"+tabId+"'";
		List<Tbdca1a> resluts =this.query(hql);
		return resluts;
	}
	
}

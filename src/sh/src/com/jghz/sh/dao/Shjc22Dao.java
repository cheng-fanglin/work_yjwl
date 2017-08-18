package com.jghz.sh.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh22;


  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc22Dao  
* 类描述：  
* 创建人：Tom  
* 创建时间：2226-10-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：2226-10-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc22Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh22> page, Map<String, Object> paramater)
			throws Exception {
		String sql = " from Tbsh22 where 1=1 ";
		super.pagingQuery(page, sql, "select count(*) " + sql);
	}
	
	//查询船只的相关信息
	public Tbsh22 queryShip(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
	
		Tbsh22 sh22 = null;
		String hql = " from "+Tbsh22.class.getName()+ " where 1=1 ";
		if(paramater == null){
			return null;
		}
		if(paramater.get("compId")!=null){
			hql += " and compId = :compId ";
			param.put("compId", paramater.get("compId"));
		}
		if(paramater.get("hc")!=null){
			hql += " and hc = :hc ";
			param.put("hc", paramater.get("hc"));
		}  
		List<Tbsh22> listSh22 = this.query(hql,param);
		if(!CollectionUtils.isEmpty(listSh22)&&listSh22.get(0)!=null){
			sh22=listSh22.get(0);
		}
		return sh22;
	}
	
	public List queryDock(Map inMap){
		String startDock = AppUtils.toValidString(inMap.get("startDock"));
		String endDock = AppUtils.toValidString(inMap.get("endDock"));
		String transNo = AppUtils.toValidString(inMap.get("transNo"));
		String compId = AppUtils.toValidString(inMap.get("compId"));
		String hql = " from Tbsh22 where compId='"+compId+"' and transNo='"+transNo+"' ";
		if(StringHelper.isNotEmpty(startDock)){
			hql+="and startDock='"+startDock+"'";
		}
		if(StringHelper.isNotEmpty(endDock)){
			hql+="and endDock='"+endDock+"'";
		}
		List<Tbsh22> listSh22 = this.query(hql);
		return listSh22;
	}
	
	public List queryUnSettleList(Map inMap){
		String transNo = AppUtils.toValidString(inMap.get("transNo"));
		String compId = AppUtils.toValidString(inMap.get("compId"));
		String hql = " from Tbsh22 where compId='"+compId+"' and transNo='"+transNo+"' and status !='10'";
		List<Tbsh22> listSh22 = this.query(hql);
		return listSh22;
	}
	
	public List queryByShipNoList(String shipListNo){
		String hql = " from Tbsh22 where compId='"+AppUtils.getCompId()+"' and shipListNo='"+shipListNo+"' ";
		List<Tbsh22> listSh22 = this.query(hql);
		return listSh22;
	}

	  
	/**  
	* querySettle 查询待结算
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2017-1-4 下午6:37:53 
	* 修改时间：2017-1-4 下午6:37:53 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public void querySettle(Page<Tbsh22> page, Map<String, Object> paramater) throws Exception {
		String transNo = AppUtils.toValidString(paramater.get("transNo"));
		String compId = AppUtils.getCompId();
		String shipListNo = AppUtils.toValidString(paramater.get("shipListNo"));
		String hql = " from Tbsh22 where compId='"+compId+"' and status ='10'";
		if(StringHelper.isNotEmpty(transNo)){
			hql+=" and transNo='"+transNo+"'";
		}
		if(StringHelper.isNotEmpty(shipListNo)){
			hql+=" and shipListNo='"+shipListNo+"'";
		}
		super.pagingQuery(page, hql, "select count(*) " + hql);
	}
}

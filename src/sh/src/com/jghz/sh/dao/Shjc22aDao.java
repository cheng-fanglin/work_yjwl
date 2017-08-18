package com.jghz.sh.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh22a;
  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc22aDao  
* 类描述：  
* 创建人：Tom  
* 创建时间：2226-22-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：2226-22-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc22aDao extends BaseDao {

	public void pagingQuery(Page<Tbsh22a> page,  Map<String, Object> paramater)throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh22a where 1=1 and compId='"+AppUtils.getCompId()+"' ");
		if(paramater!= null ){  
			if(paramater.get("shipListNo")!=null){
				sqlStr.append(" and shipListNo like '%"+paramater.get("shipListNo")+"%' ");
			} 
			if(paramater.get("shipNo")!=null){
				sqlStr.append(" and shipNo like '%"+paramater.get("shipNo")+"%' ");
			} 
			if(paramater.get("custName")!=null){
				sqlStr.append(" and custName like '%"+paramater.get("custName")+"%' ");
			} 
		}
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());
 	}
	
	public void pagingQueryShip(Page<Tbsh22a> page,  Criteria criteria)throws Exception {
		List sh22aList = new ArrayList();
		String sh22aHql = " from "+Tbsh22a.class.getName()+" r where  r.shipListNo ='' and r.backStatus ='1' ";
		ParseResult result=this.parseCriteria(criteria,true,"r");
		if(result!=null){
			StringBuffer sb=result.getAssemblySql();
			sh22aHql +=  sb.toString() +" and r.compId=:compId ";
		} 
		sh22aList = this.query(sh22aHql);
		page.setEntities(sh22aList);
		page.setEntityCount(sh22aList.size());
 	}
	
	public List querySh22aByTransItem(String transItem,String compId){
		StringBuffer sqlStr = new StringBuffer();
		 sqlStr.append(" from Tbsh22a where 1=1 ");
		 if(StringHelper.isNotEmpty(transItem)){
			 sqlStr.append(" and transItem ='"+transItem+"'");
		 }
		 if(StringHelper.isNotEmpty(compId)){
			 sqlStr.append(" and compId ='"+compId+"'");
		 }
		 return this.query(sqlStr.toString());
	}
	
	
	public List querySh22a (Map inMap){
		String shipListNo = AppUtils.toValidString(inMap.get("shipListNo"));
		String loadingNoNg = AppUtils.toValidString(inMap.get("loadingNoNg"));
		String compId = AppUtils.getCompId();
		String hqla = "from Tbsh22a where compId='"+compId+"'";
		if(StringHelper.isNotEmpty(shipListNo)){
			hqla+=" and shipListNo='"+shipListNo+"'";
		}
		if(StringHelper.isNotEmpty(loadingNoNg)){
			hqla+=" and loadingNoNg='"+loadingNoNg+"'";
		}
		List sh22aList = this.query(hqla);
		return sh22aList;
	}
	
 	public List querySh22a (String transNo){
		String hqla = "from Tbsh22a where transNo='"+transNo+"'  ";
		List sh22aList = this.query(hqla);
		return sh22aList;
	}

}

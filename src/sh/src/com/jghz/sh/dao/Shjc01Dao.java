package com.jghz.sh.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;


  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc01Dao  
* 类描述：  
* 创建人：Tom  
* 创建时间：2016-10-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：2016-10-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc01Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh01> page, Map<String, Object> paramater)
			throws Exception {
		String sql = " from Tbsh01 where 1=1 ";
		if (paramater != null) {
			if (null != paramater.get("pyname")
					&& !"".equals(paramater.get("pyname"))) {
				sql += " and pyname like '%" + paramater.get("pyname") + "%' ";
			}
		}
		if (paramater != null) {
			if (null != paramater.get("transport")
					&& !"".equals(paramater.get("transport"))) {
				sql += " and transport like '%" + paramater.get("transport") + "%' ";
			}
		}
		if (paramater != null) {
			if (null != paramater.get("stationname")
					&& !"".equals(paramater.get("stationname"))) {
				sql += " and stationname like '%" + paramater.get("stationname") + "%' ";
			}
		}
		super.pagingQuery(page, sql, "select count(*) " + sql);
	}
	
	/**
	 * pagingQueryb
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQueryb(Page<Tbsh01b> page, Map<String, Object> paramater)
			throws Exception {
		String sql = " from Tbsh01b where 1=1 ";
		
		if (paramater != null) {
			if (null != paramater.get("stationcode")
					&& !"".equals(paramater.get("sh01Id"))) {
				sql += " and stationcode='" + paramater.get("stationcode") + "' ";
			} 
		}
		super.pagingQuery(page, sql, "select count(*) " + sql);
	}

	public void executeConfirm(Collection<Tbsh01> sh01s) {

	}
}

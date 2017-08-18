package com.jghz.sh.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh23;


  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc23Dao  
* 类描述：  
* 创建人：Tom  
* 创建时间：2326-10-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：2326-10-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc23Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh23> page, Map<String, Object> paramater)
			throws Exception {
		String sql = " from Tbsh23 where 1=1 ";
		super.pagingQuery(page, sql, "select count(*) " + sql);
	}
	
}

package com.jghz.sh.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh34;

/**
 * 
 * 项目名称：jghz 类名称：Shjc34Dao 类描述： 创建人：Tom 创建时间：3426-34-29 下午2:20:09 修改人：Tom
 * 修改时间：3426-34-29 下午2:20:09 修改备注：
 * 
 * @version
 * 
 */
@Repository
public class Shjc34Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh34> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from Tbsh34 where 1=1 ";
		super.pagingQuery(page, hql, "select count(*) " + hql);
	}
  
}

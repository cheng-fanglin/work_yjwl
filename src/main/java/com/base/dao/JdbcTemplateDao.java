package com.base.dao;
import java.util.List;
import java.util.Map;
import com.bstek.dorado.data.provider.Page;
import com.bstek.bdf2.core.orm.jdbc.JdbcDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("jdbcTemplateDao")
public class JdbcTemplateDao extends JdbcDao {
	
	/**
	 * 基于Jdbc进行分页，不带查询条件，使用默认的Map为结果包装器
	 * 
	 * @param sql
	 *            用来查询具体记录信息的sql
	 * @param countSql
	 *            用来查询记录总数的sql
	 * @param page
	 *            Pagination对象，结果信息就在这个Pagination对象当中
	 */
	public void paginationQuery(String sql,final Page<?> page) {
		this.pagingQuery(page, sql);
	}

	/**
	 * 基于Jdbc进行分页，不带查询条件，可以自定义结果包装器
	 * 
	 * @param sql
	 *            用来查询具体记录信息的sql
	 * @param countSql
	 *            用来查询记录总数的sql
	 * @param page
	 *            Pagination对象，结果信息就在这个Pagination对象当中
	 * @param mapper
	 *            返回结果的包装器
	 */
	public <T> void paginationQuery(String sql,final Page<?> page, RowMapper mapper) {
		this.pagingQuery(page, sql, mapper);
	}

	/**
	 * 基于Jdbc进行分页，可以添加查询条件，使用默认的Map为结果包装器
	 * 
	 * @param sql
	 *            用来查询具体记录信息的sql
	 * @param countSql
	 *            用来查询记录总数的sql
	 * @param params
	 *            参数值，如果有条件参数的话
	 * @param page
	 *            Pagination对象，结果信息就在这个Pagination对象当中
	 * @param mapper
	 *            返回结果的包装器
	 */
	public void paginationQuery(String sql,Object params[],final Page<Map<String, Object>> page) {
		this.pagingQuery(page, sql, params);
	}

	/**
	 * 基于Jdbc进行分页，可以添加查询条件，可以自定义结果包装器
	 * 
	 * @param sql
	 *            用来查询具体记录信息的sql
	 * @param countSql
	 *            用来查询记录总数的sql
	 * @param params
	 *            参数值，如果有条件参数的话
	 * @param page
	 *            Pagination对象，结果信息就在这个Pagination对象当中
	 * @param mapper
	 *            返回结果的包装器
	 */
	public <T> void paginationQuery(String sql,
			Object params[], Page<T> page, final RowMapper rowMapper) {
		this.pagingQuery(page, sql, params, rowMapper);
	}
	
	public List<Map<String,Object>> getListBySQL(String sql,Map<String,Object> params){
		List<Map<String,Object>> list=this.getJdbcTemplate().queryForList(sql);
		return list;
	}


}

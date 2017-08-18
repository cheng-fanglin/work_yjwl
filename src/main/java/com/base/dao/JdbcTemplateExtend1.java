package com.base.dao;

import java.util.List;
import java.util.Map;

import com.base.pagination.Pagination;
import com.base.pagination.PaginationQuery;
import com.base.pagination.JdbcPaginationQueryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;


public class JdbcTemplateExtend1 extends JdbcTemplate {
	
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
	public void paginationQuery(String sql, String countSql,
			final Pagination<Map<String, Object>> page) {
		paginationQuery(sql, countSql, new Object[] {}, page,
				new ColumnMapRowMapper());
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
	public <T> void paginationQuery(String sql, String countSql,
			final Pagination<T> page, RowMapper mapper) {
		paginationQuery(sql, countSql, new Object[] {}, page, mapper);
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
	public void paginationQuery(String sql, String countSql, Object params[],
			final Pagination<Map<String, Object>> page) {
		paginationQuery(sql, countSql, params, page, new ColumnMapRowMapper());
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
	public <T> void paginationQuery(String sql, String countSql,
			Object params[], Pagination<T> page, final RowMapper rowMapper) {
		int totalCount = super.queryForInt(countSql, params);
		page.setTotalCount(totalCount);
		Assert.notNull(rowMapper,
				"请使用paginationQuery(String,String,Object[],Pagination<Map<String, Object>>)函数");
		int pageSize = page.getPageSize();
		int pageIndex = page.getPageIndex();
		pageIndex = getRealIndex(pageSize,pageIndex,totalCount);
		List<T> resultList = queryDataInPage(sql, params, pageIndex, pageSize,
				rowMapper);
		page.setResults(resultList);
	}
	
	/**
	 * 获取合理的分页当前页数
	 */
	private int getRealIndex(int pageSize,int pageIndex,int totalCount){
		if(pageIndex<1){
			return 1;
		}
		int pageStart = ( pageIndex - 1 ) * pageSize;
		if( totalCount <= pageStart ){
			return 1;
		}else{
			return pageIndex;
		}
	}

	/**
	 * 查询当页的记录.
	 * 
	 * @param <T>
	 *            结果对象类型
	 * @param sql
	 *            查询sql
	 * @param params
	 *            查询参数
	 * @param pageIndex
	 *            开始页
	 * @param pageSize
	 *            每页大小
	 * @param rowMapper
	 *            行映射器
	 * @return 查询结果列表,仅包含当页的记录
	 */
	protected <T> List<T> queryDataInPage(String sql, Object[] params,
			int pageIndex, int pageSize, final RowMapper rowMapper) {
		final int safePageSize = (pageSize < 1) ? 65535 : pageSize;

		PaginationQuery<T> pq = this.createPaginationQuery();
		pq.sql(sql).parameters(params).rowMapper(rowMapper).pageNo(pageIndex)
				.pageSize(safePageSize);
		List<T> list = pq.list();
		return list;
	}

	/**
	 * 创建一个分页查询对象.
	 * 
	 * @return 空的分页查询对象
	 */
	public <T> PaginationQuery<T> createPaginationQuery() {
//		return new JdbcPaginationQueryImpl<T>(this);
		return null;
	}

}

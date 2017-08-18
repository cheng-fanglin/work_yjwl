/**
 * DBDialect.java
 */
package com.base.pagination;

import java.sql.Connection;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * 数据库方言接口.
 * 
 * @filename DBDialect.java
 * @author <a href="mailto:tom.cui@bstek.com">Tom</a>
 * @data 2011-7-8
 * @time 上午11:46:05
 */
public interface DBDialect {
	/**
	 * 判定此种方言是否支持此数据库连接.
	 * 
	 * @param connection
	 *            数据库连接
	 * @return 是否支持
	 */
	public boolean support(Connection connection);
	
	/**
	 * 对数据库进行分页查询.
	 * 
	 * @param jdbcTemplate
	 *            JdbcTemplate对象
	 * @param sql
	 *            查询sql语句
	 * @param parameters
	 *            查询参数
	 * @param pageNo
	 *            分页号
	 * @param pageSize
	 *            分页大小
	 * @param rowMapper
	 *            行映射器
	 * @return 分页结果
	 */
	public <T> List<T> query(JdbcTemplate jdbcTemplate, String sql,
			Object[] parameters, int pageNo, int pageSize, RowMapper rowMapper);
}

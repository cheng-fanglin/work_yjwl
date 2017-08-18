/**
 * PaginationQueryImpl.java
 */
package com.base.pagination;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.base.dao.JdbcTemplateDao;
import com.base.pagination.PaginationQuery;
import com.base.pagination.PaginationQuery;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * PaginationQuery的JDBC实现.
 * 
 * @filename JdbcPaginationQueryImpl.java
 * @author <a href="mailto:tom.cui@bstek.com">Tom</a>
 * @data 2011-7-8
 * @time 上午10:37:07
 */

public class JdbcPaginationQueryImpl<T> implements PaginationQuery<T> {
	/**
	 * Excel单个sheet中的最大行数
	 */
	private static final int MAX_ROW_IN_EXCEL = 65535;

	public JdbcPaginationQueryImpl(JdbcTemplateDao jdbcTemplateExtend) {
		Assert.notNull(jdbcTemplateExtend);
		this.jdbcTemplateExtend = jdbcTemplateExtend;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bstek.bdf.pagination.PaginationQuery#pageNo(int)
	 */
	public PaginationQuery<T> pageNo(int pageNo) {
		Assert.state(pageNo > 0, "页号必须大于0");
		this.pageNo = pageNo;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bstek.bdf.pagination.PaginationQuery#pageSize(int)
	 */
	public PaginationQuery<T> pageSize(int pageSize) {
		if (0 >= pageSize) {
			// 如果pageSize <= 0，要把它设置为excel导出的最大行数
			pageSize = MAX_ROW_IN_EXCEL;
		}
		this.pageSize = pageSize;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bstek.bdf.pagination.PaginationQuery#sql(java.lang.String)
	 */
	public PaginationQuery<T> sql(String sql) {
		this.sql = sql;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bstek.bdf.pagination.PaginationQuery#countSql(java.lang.String)
	 */
	public PaginationQuery<T> countSql(String countSql) {
		this.countSql = countSql;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bstek.bdf.pagination.PaginationQuery#parameters(java.lang.Object[])
	 */
	public PaginationQuery<T> parameters(Object[] parameters) {
		this.parameters = parameters;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bstek.bdf.pagination.PaginationQuery#rowMapper(org.springframework
	 * .jdbc.core.RowMapper)
	 */
	public PaginationQuery<T> rowMapper(RowMapper rowMapper) {
		if (null != rowMapper) {
			this.rowMapper = rowMapper;
		}
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bstek.bdf.pagination.PaginationQuery#count()
	 */
	public int count() {
		if (!StringUtils.hasText(this.countSql)) {
			if (!StringUtils.hasText(this.sql)) {
				throw new IllegalArgumentException("必须至少指定countSql或sql中的一个");
			}
			String tmp = this.sql.toLowerCase();
			int firstIndexOfFrom = tmp.indexOf(" from ");
			Assert.state(-1 < firstIndexOfFrom, "您的sql里没有from关键字,请确认其是一条查询sql");
			this.countSql = "SELECT COUNT(*) "
					+ this.sql.substring(firstIndexOfFrom + 1);
		}
		int count = this.getJdbcTemplate().queryForInt(this.countSql,
				this.parameters);
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bstek.bdf.pagination.PaginationQuery#list()
	 */
	public List<T> list() {
		DBDialect dbDialect = (DBDialect) this.getJdbcTemplate().execute(
				new ConnectionCallback() {

					public Object doInConnection(Connection connection)
							throws SQLException, DataAccessException {
						return DBDialectUtils.getDBDialect(connection);
					}

				});
		if (null == this.rowMapper) {
			this.rowMapper = (RowMapper) COLUMN_MAP_ROW_MAPPER;
		}
		List<T> list = dbDialect.query(this.getJdbcTemplate(), this.sql,
				this.parameters, this.pageNo, this.pageSize, this.rowMapper);
		return list;
	}

	protected JdbcTemplate getJdbcTemplate() {
//		return this.jdbcTemplateExtend;
		return null;
	}

	private int pageNo = 1;
	private int pageSize = DEFAULT_PAGE_SIZE;
	private JdbcTemplateDao jdbcTemplateExtend = null;
	private String sql = null;
	private String countSql = null;
	private Object[] parameters = null;
	private RowMapper rowMapper = null;

	private static final ColumnMapRowMapper COLUMN_MAP_ROW_MAPPER = new ColumnMapRowMapper();


}

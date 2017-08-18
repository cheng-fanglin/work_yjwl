/**
 * DBDialectUtils.java
 */
package com.base.pagination;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @filename DBDialectUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">Tom</a>
 * @data 2011-7-8
 * @time 上午11:46:41
 */
public final class DBDialectUtils {
	public static final DBDialect getDBDialect(Connection connection)
			throws SQLException {
		DBDialectProvider dbDialectProvider = (DBDialectProvider) SpringHolder
				.getApplicationContext().getBean(DBDialectProvider.SERVICE_ID);
		return dbDialectProvider.provide(connection);
	}
}

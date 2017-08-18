/**
 * DBDialectProvider.java
 */
package com.base.pagination;

import java.sql.Connection;

/**
 * @filename DBDialectProvider.java
 * @author <a href="mailto:tom.cui@bstek.com">Tom</a>
 * @data 2011-7-8
 * @time 上午11:51:21
 */
public interface DBDialectProvider {
	public DBDialect provide(Connection connection);
	public static final String SERVICE_ID = "m6.dbDialectProvider";
}

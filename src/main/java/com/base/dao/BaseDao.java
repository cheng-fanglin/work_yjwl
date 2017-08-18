/**  
 * 文件名：BaseDao.java  
 *  
 * 版本信息：  
 * 日期：2016-10-25  
 * Copyright 足下 Corporation 2016  
 * 版权所有  
 *  
 */

package com.base.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.pretty.MessageHelper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import com.base.exception.AppException;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.bdf2.importexcel.model.CellWrapper;
import com.bstek.dorado.web.DoradoContext;

/**
 * 
 * 项目名称：jghz 类名称：BaseDao 类描述： dao的基类，提供一些操作数据库的基本方法 创建人：Tom 创建时间：2016-10-25
 * 上午11:01:30 修改人：Tom 修改时间：2016-10-25 上午11:01:30 修改备注：
 * 
 * @version
 * 
 */
@Repository("baseDao")
public abstract class BaseDao extends HibernateDao {

	@Resource(name = "jdbcTemplateDao")
	private JdbcTemplateDao jdbcDao;

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	private Logger log = Logger.getLogger(BaseDao.class);

	/**
	 * 业务类要使用它来实现对数据库的操作，通过使用该对象，可以实现普通的JDBC操作
	 * 
	 * @return JdbcTemplateExtend 返回对象
	 * */
	public JdbcTemplateDao getJdbcDao() {
		return jdbcDao;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcDao.getJdbcTemplate();
	}

	/**
	 * addOneObject 添加单条数据（Hibernate操作） 创建人：Tom 修改人：Tom 创建时间：2016-10-25
	 * 上午11:09:41 修改时间：2016-10-25 上午11:09:41
	 * 
	 * @param obj
	 *            待添加的Hibernate对象
	 * @param boolean true：添加成功 false：添加失败
	 */
	public boolean save(Object obj) {
		try {
			Session session = this.getSession();
			session.save(obj);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException(e.getMessage());
		}
	}

	/**
	 * delete 删除单条对象 创建人：Tom 修改人：Tom 创建时间：2016-10-25 上午11:11:24 修改时间：2016-10-25
	 * 上午11:11:24
	 * 
	 * @param obj
	 *            待删除的Hibernate对象
	 * @param @return boolean true：删除成功 false：删除失败
	 */
	public boolean delete(Object obj) {
		Session session = null;
		try {
			session = this.getSession();
			session.delete(obj);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException(e.getMessage());
		} 
	}

	/**
	 * update 更新表中的一条记录 创建人：Tom 修改人：Tom 创建时间：2016-10-25 上午11:22:40
	 * 修改时间：2016-10-25 上午11:22:40
	 * 
	 * @param obj
	 *            待更新的Hibernate对象
	 * @param @return boolean true：更新成功 false：更新失败
	 */
	public boolean update(Object obj) {
		Session session = null;
		try {
			session = this.getSession();
			session.update(obj);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException(e.getMessage());
		}
	}

	/**
	 * deleteBySQL 删除单条对象 创建人：Tom 修改人：Tom 创建时间：2016-10-25 上午11:12:47
	 * 修改时间：2016-10-25 上午11:12:47
	 * 
	 * @param sql
	 *            原生SQL语句
	 * @param @return boolean true：删除成功 false：删除失败
	 */
	public boolean deleteBySQL(String sql, List<?> params) {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		int result = 0;
		try {
			conn = SessionFactoryUtils.getDataSource(sessionFactory)
					.getConnection();
			prep = conn.prepareStatement(sql);
			if (params != null && params.size() > 0) {
				for (int i = 1; i <= params.size(); i++) {
					prep.setObject(i, params.get(i - 1));
				}
			}
			result = prep.executeUpdate();
		} catch (SQLException e) {
			log.error(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					log.error(e.getMessage());
				}
			}
		}
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * updateBySQL 通过SQL语句批量修改数据 创建人：Tom 修改人：Tom 创建时间：2016-10-25 上午11:13:30
	 * 修改时间：2016-10-25 上午11:13:30
	 * 
	 * @param name
	 * @param @return 返回int
	 */
	public int updateBySQL(String sql, List<?> params) {
		Connection conn = null;
		PreparedStatement prep = null;
		int result = 0;
		try {
			conn = SessionFactoryUtils.getDataSource(sessionFactory)
					.getConnection();
			prep = conn.prepareStatement(sql);
			if (params != null && params.size() > 0) {
				for (int i = 1; i <= params.size(); i++) {
					prep.setObject(i, params.get(i - 1));
				}
			}
			result = prep.executeUpdate();
		} catch (SQLException e) {
			log.error(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					log.error(e.getMessage());
				}
			}
		}
		return result;
	}

	/**
	 * 
	 * 方法描述： 通过hql语句查询记录（返回List<?>类型，可以是一条数据，也可以是多条数据）
	 * 
	 * @param: hql hql语句
	 * @return: List<?> 查询结果
	 * 
	 *          修改人： 修改时间： 2014-11-27 下午2:45:31 修改备注：
	 * @version
	 * 
	 */
	public List<?> getListByHQL(String hql) {
		Session session = null;
		List<?> list = new ArrayList();
		try {
			session = sessionFactory.openSession();
			Query query = session.createQuery(hql);
			list = query.list();
		} catch (Exception e) {
			log.error(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}

	/**
	 * executeHQLsql 通过HQl修改 创建人：Tom 修改人：Tom 创建时间：2016-10-25 上午11:24:00
	 * 修改时间：2016-10-25 上午11:24:00
	 * 
	 * @param sql
	 * @param @return boolean true：更新成功 false：更新失败
	 */
	public boolean executeHQLsql(String sql) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			query.executeUpdate();
			tx.commit();
			return true;
		} catch (Exception e) {
			log.error(e.getMessage());
			if (tx != null) {
				try {
					tx.rollback();
				} catch (Exception ex) {
					ex.printStackTrace();
					return false;
				}
			}
			return false;
		} finally {
			session.close();
		}
	}

	/**
	 * getOneResultByHQL 通过HQL查询单条数据 创建人：Tom 修改人：Tom 创建时间：2016-10-25 上午11:25:18
	 * 修改时间：2016-10-25 上午11:25:18
	 * 
	 * @param hql
	 *            hql语句
	 * @param @return Object 查询的结果
	 */
	public Object getOneResultByHQL(String hql) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		// query.setCacheable(true);
		query.setMaxResults(1);
		Object obj = null;
		try {
			obj = query.uniqueResult();
		} catch (Exception e) {
			System.out.println("BaseDao getOneResultByHQL Exception!");
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return obj;
	}

	/**
	 * 
	 * 方法描述： 事务处理 创建人： Tom 创建时间： 2014-11-27 下午2:47:48
	 * 
	 * @param insertList
	 *            增加的数据列表
	 * @param updateList
	 *            更新的数据列表
	 * @param deleteList
	 *            删除的数据列表
	 * @return: boolean true：执行成功 false：执行失败
	 * 
	 *          修改人： 修改时间： 2016年12月13日 11:09:58 修改备注：
	 * @version
	 * 
	 */
	public boolean batchTransaction(List<?> insertList, List<?> updateList,
			List<?> deleteList) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			if (deleteList != null && deleteList.size() > 0) {
				for (int i = 0; i < deleteList.size(); i++) {
					session.delete(deleteList.get(i));
				}
			}
			if (updateList != null && updateList.size() > 0) {
				for (int i = 0; i < updateList.size(); i++) {
					session.update(updateList.get(i));
				}
			}
			if (insertList != null && insertList.size() > 0) {
				for (int i = 0; i < insertList.size(); i++) {
					session.save(insertList.get(i));
				}
			}
			tx.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			if (tx != null) {
				try {
					tx.rollback();
				} catch (Exception ex) {
					ex.printStackTrace();
					return false;
				}
			}
			return false;
		} finally {
			session.close();
		}
	}

	/**
	 * getListBySQL 通过sql语句查询记录（返回List<Object[]>类型，可以是一条数据，也可以是多条数据） 创建人：Tom
	 * 修改人：Tom 创建时间：2016-10-26 下午4:44:41 修改时间：2016-10-26 下午4:44:41
	 * 
	 * @param sql
	 *            完整的sql语句
	 * @param @return List<Object[]> 查询结果
	 */
	public List<Object[]> getListBySQL(String sql, List<?> params) {
		List<Object[]> listt = new ArrayList<Object[]>();
		Session session = null;
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		try {
			session = sessionFactory.openSession();
			conn = SessionFactoryUtils.getDataSource(sessionFactory)
					.getConnection();
			prep = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			if (params != null && params.size() > 0) {
				for (int i = 1; i <= params.size(); i++) {
					prep.setObject(i, params.get(i - 1));
				}
			}
			rs = prep.executeQuery();
			int in = rs.getMetaData().getColumnCount();// 返回结果的列数
			while (rs.next()) {
				Object[] oj = new Object[in];
				for (int j = 1; j <= oj.length; j++) {
					oj[j - 1] = rs.getObject(j);
				}
				listt.add(oj);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (prep != null) {
					prep.close();
				}
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("BaseDao getSpiltSql close Exception!");
				log.error(e.getMessage());
			}
			session.close();
		}

		return listt;
	}

	/**
	 * 
	 * 方法描述： 通过sql语句查询满足条件的记录数 创建人： lichangyu 创建时间： 2014-12-4 下午7:00:40
	 * 
	 * @param: sql select count(1) from tableName where 1=1
	 * @return: Long -1:执行失败 ，其他：返回结果集的记录数
	 * 
	 *          修改人： 修改时间： 2014年12月23日10:09:30 修改备注：
	 * @version
	 * 
	 */
	public int getCountsBySQL(String sql, List<?> params) {
		int result = 0;
		Session session = null;
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		try {
			session = sessionFactory.openSession();
			conn = SessionFactoryUtils.getDataSource(sessionFactory)
					.getConnection();
			prep = conn.prepareStatement(sql);
			if (params != null && params.size() > 0) {
				for (int i = 1; i <= params.size(); i++) {
					prep.setObject(i, params.get(i - 1));
				}
			}
			rs = prep.executeQuery();

			while (rs.next()) {
				Object obj = rs.getObject(1);
				result = Integer.parseInt(obj.toString());
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return -1;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (prep != null) {
					prep.close();
				}
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("BaseDao getSpiltSql close Exception!");
				log.error(e.getMessage());
			}
			session.close();
		}
		return result;
	}

	// =================无事物处理=============//

	/**
	 * getSessionFactory SessionFactory对象 创建人：Tom 修改人：Tom 创建时间：2016-10-25
	 * 上午11:44:11 修改时间：2016-10-25 上午11:44:11
	 * 
	 * @param name
	 * @param @return sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * 
	 * 方法描述： 返回Oracle数据库的相应sequence的下一个值(使用的是原生SQL语句查询) 创建人： lichangyu 创建时间：
	 * 2014-11-27 下午2:48:40
	 * 
	 * @param: sequenceName 序列名
	 * @return: Long
	 * 
	 *          修改人： 修改时间： 2014-11-27 下午2:48:40 修改备注：
	 * @version
	 * 
	 */
	public String getNextSequenceValue(String sequenceName) {
		Connection conn = null;
		String nextVal = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		try {
			conn = SessionFactoryUtils.getDataSource(sessionFactory)
					.getConnection();
			prep = conn.prepareStatement("select " + sequenceName
					+ ".NEXTVAL SEQ from dual");
			rs = prep.executeQuery();
			while (rs.next()) {
				nextVal = (rs.getString("SEQ"));
			}
		} catch (SQLException e) {
			log.error(e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					log.error(e.getMessage());
				}
			}
			if (prep != null) {
				try {
					prep.close();
				} catch (SQLException e) {
					log.error(e.getMessage());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					log.error(e);
				}
			}
		}
		return nextVal;
	}
	
	/**
	 * @Description 生成序号 范例XH1612110001
	 * @param tableName 表名（POJO对象）
	 * @param cloumName 字段名字（序号在表中的物理字段名）
	 * @param staticStr 静态字符串（开头字符串）范例XH1612310001 中的 XH
	 * @param date 中间固定字符（日期或其它自定义字符）范例XH1612110001 中的 161231
	 * @param indexMax 序号位数（序号长度）范例XH1612110001 中的 0001的长度 4
	 * @return String 传入参数范例XH1612110001 ---输出范例XH1612110002
	 */
	public String genNo(String tableName ,String cloumName,String staticStr,String date,int indexMax) {
		String deaultNo = staticStr+date+AppUtils.addZero("1", indexMax);
		String sql = " select max("+cloumName+") as "+cloumName+" from "+tableName+
				" where "+cloumName+" like '"+staticStr+date+"%'";
		Map<String, Object> map = this.getJdbcTemplate().queryForMap(sql);
		if(null!=map){
			if(AppUtils.isNotEmpty((map.get(cloumName)))){
				String indexNo = AppUtils.toValidString(map.get(cloumName));
				String a = staticStr+date;//固定字符串  XH161211 
				String b = Integer.parseInt(indexNo.substring(indexNo.length()-indexMax))+1+"";//0002
				String c = a+AppUtils.addZero(b, indexMax);
				return c;
			}else{
				return deaultNo;
			}
		}else{
			return deaultNo;
		}
	}
	
}

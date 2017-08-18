package com.jghz.sh.dao;

import java.util.Map;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh10a1;
import com.jghz.sh.entity.Tbsh11;
import com.jghz.sh.entity.Tbwd01;

/**
 * 
 * 项目名称：jghz 类名称：Shjc11Dao 类描述： 创建人：Tom 创建时间：1126-11-29 下午2:20:09 修改人：Tom
 * 修改时间：1126-11-29 下午2:20:09 修改备注：
 * 
 * @version
 * 
 */
@Repository
public class Shjc11Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingSh10a(Page<Tbsh10a> page, Map<String, Object> paramater)
			throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("  from Tbsh10a where 1=1 ");
		if (paramater != null) {
			if(AppUtils.isNotEmpty(paramater.get("carrierName"))){
				sqlStr.append("and carrierName='"+paramater.get("carrierName")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("carNo"))){
				sqlStr.append("and carNo like '%"+paramater.get("carNo")+"%' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("phoneNo"))){
				sqlStr.append("and phoneNo='"+paramater.get("phoneNo")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("receiptCompName"))){
				sqlStr.append("and receiptCompName='"+paramater.get("receiptCompName")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("phDateS"))){
				sqlStr.append("and phDate >'"+paramater.get("phDateS")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("phDateE"))){
				sqlStr.append("and phDate <'"+paramater.get("phDateE")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("outDateS"))){
				sqlStr.append("and outDate >'"+paramater.get("outDateS")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("outDateE"))){
				sqlStr.append("and outDate <'"+paramater.get("outDateE")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("backTimeS"))){
				sqlStr.append("and backTime >'"+paramater.get("backTimeS")+"' ");
			}
			if(AppUtils.isNotEmpty(paramater.get("backTimeE"))){
				sqlStr.append("and backTime <'"+paramater.get("backTimeE")+"' ");
			} 
		}
		this.pagingQuery(page, sqlStr.toString(),"select count(*) " + sqlStr.toString());
//		List list = this.getJdbcDao().getListBySQL(sqlStr.toString(), null);
//		List sh10List = AppUtils.convertKey(list);
////		super.pagingQuery(page, sqlStr.toString(),"select count(*) " + sqlStr.toString());
//		page.setEntities(sh10List);
//		page.setEntityCount(sh10List.size());
	}
	
	public void pagingSh10a1(Page<Tbsh10a1> page, Map<String, Object> paramater)
			throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("  from Tbsh10a1 where 1=1 ");
		if (paramater != null) {
			if(AppUtils.isNotEmpty(paramater.get("carNo"))){
				sqlStr.append("and carNo='"+paramater.get("carNo")+"' ");
			} 
			if(AppUtils.isNotEmpty(paramater.get("transItem"))){
				sqlStr.append("and transItem='"+paramater.get("transItem")+"' ");
			} 
		}
		this.pagingQuery(page, sqlStr.toString(),"select count(*) " + sqlStr.toString());
	}
 

	/**
	 * queryWdsh01 查询供应商 创建人：Tom 修改人：Tom 创建时间：2016-11-4 下午2:32:21 修改时间：2016-11-4
	 * 下午2:32:21
	 * 
	 * @param name
	 * @param @return 设定文件
	 * @return String DOM对象
	 * @throws Exception
	 * @Exception 异常对象
	 * @since CodingExample　Ver(编码范例查看) 1.1
	 */

	public void queryWdsh01(Page<Tbwd01> page, String parameter)
			throws Exception {
		String hql = " from " + Tbwd01.class.getName() + " where 1=1 ";
		if (parameter != null) {
			// String carrierName =
			// AppUtils.toValidString(parameter.get("carrierName"));
			if (StringHelper.isNotEmpty(parameter)) {
				hql += " and carrierName like '%" + parameter + "%' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}

	/**
	 * queryCont 查协议号 创建人：Tom 修改人：Tom 创建时间：2016-11-4 下午4:32:01 修改时间：2016-11-4
	 * 下午4:32:01
	 * 
	 * @param name
	 * @param @return 设定文件
	 * @return String DOM对象
	 * @throws Exception
	 * @Exception 异常对象
	 * @since CodingExample　Ver(编码范例查看) 1.1
	 */

	public void queryCont(Page<Tbih21> page, Map<String, Object> paramater)
			throws Exception {
		String sql = "select a.cont_no_,a.PROD_TYPE_,a.PROD_TYPE_NAME_,a.PRODUCT_NO_,a.PRODUCT_NAME_,a.PRODUCT_DETAIL_,a.CUST_NO_,A.CUST_NAME_,b.ADDRESS_,b.TEL_NUM_  from tbih21 a left join tbdcd1 b on a.CUST_NO_= b.CUST_NO_ ";
		this.getJdbcDao().paginationQuery(sql, page);
		// String hql = " from "+Tbih21.class.getName()+" where 1=1 ";
		// this.pagingQuery(page, hql,"select count(*) "+hql);

	}

	/**
	 * querySh01 查询到站 创建人：Tom 修改人：Tom 创建时间：2016-11-6 下午4:29:36 修改时间：2016-11-6
	 * 下午4:29:36
	 * 
	 * @param name
	 * @param @return 设定文件
	 * @return String DOM对象
	 * @throws Exception
	 * @Exception 异常对象
	 * @since CodingExample　Ver(编码范例查看) 1.1
	 */

	public void querySh01(Page<Tbsh01> page, String paramater) throws Exception {
		// TODO Auto-generated method stub
		String hql = " from " + Tbsh01.class.getName() + " where 1=1 ";
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}

	/**
	 * querySh01b 根据到站查询专用线 创建人：Tom 修改人：Tom 创建时间：2016-11-8 下午5:42:54
	 * 修改时间：2016-11-8 下午5:42:54
	 * 
	 * @param name
	 * @param @return 设定文件
	 * @return String DOM对象
	 * @throws Exception
	 * @Exception 异常对象
	 * @since CodingExample　Ver(编码范例查看) 1.1
	 */

	public void querySh01b(Page<Tbsh01b> page, String paramater)
			throws Exception {
		// TODO Auto-generated method stub
		String hql = " from " + Tbsh01b.class.getName() + " where 1=1 ";
		if (StringHelper.isNotEmpty(paramater)) {
			hql += " and stationcode ='" + paramater + "' ";
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public Tbsh11 saveSh11(Tbsh10 sh10,Tbsh10a sh10a){
		Tbsh11 sh11 = new Tbsh11();
		BeanUtils.copyProperties(sh10, sh11);
		BeanUtils.copyProperties(sh10a, sh11);
		return sh11;
	}
}

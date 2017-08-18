package com.jghz.sh.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.DateFormatUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbwd01;

/**
 * 
 * 项目名称：jghz 类名称：Shjc10Dao 类描述： 创建人：Tom 创建时间：1026-10-29 下午2:20:09 修改人：Tom
 * 修改时间：1026-10-29 下午2:20:09 修改备注：
 * 
 * @version
 * 
 */
@Repository
public class Shjc10Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh10> page, Map<String, Object> paramater)
			throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10 where 1=1 and compId='"
				+ AppUtils.getCompId() + "' ");
		if (paramater != null) {
			if (paramater.get("custName") != null) {
				sqlStr.append(" and custName like '%"
						+ paramater.get("custName") + "%' ");
			}
			if (paramater.get("startStation") != null) {
				sqlStr.append(" and startStation like '%"
						+ paramater.get("startStation") + "%' ");
			}
			if (paramater.get("endStation") != null) {
				sqlStr.append(" and endStation='"
						+ paramater.get("endStation") + "' ");
			} 
			if (paramater.get("status") != null) {
				sqlStr.append(" and status='" + paramater.get("status") + "' ");
			}
		}
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());
	}
	
	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQueryEc(Page<Tbsh10> page, Map<String, Object> paramater)
			throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10 where 1=1 and compId='"
				+ AppUtils.getCompId() + "' and status > '0' ");
		if (paramater != null) {
			 
		}
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());
	}

	/**
	 * queryByTransNo 根据运单号查询出单笔 创建人：Tom 修改人：Tom 创建时间：2016-11-17 下午6:42:11
	 * 修改时间：2016-11-17 下午6:42:11
	 * 
	 * @param name
	 * @param @return 设定文件
	 * @return String DOM对象
	 * @Exception 异常对象
	 * @since CodingExample　Ver(编码范例查看) 1.1
	 */
	public Tbsh10 queryByTransNo(String transNo) {
		Tbsh10 sh10 = new Tbsh10();
		String hql = " from Tbsh10 where transNo = '" + transNo
				+ "' and compId='" + AppUtils.getCompId() + "' ";
		List<Tbsh10> list = this.query(hql);
		if (!CollectionUtils.isEmpty(list)) {
			sh10 = list.get(0);
		}
		return sh10;
	}

	public List queryByContNo(String contNo) {
		String hql = " from Tbsh10 where contNo = '" + contNo
				+ "' and compId='" + AppUtils.getCompId() + "' ";
		List<Tbsh10> list = this.query(hql);
		return list;
	}

	public String genTransNo() {
		String newTransNo = "";
		String todayStr = DateFormatUtils.format(new Date(), "yyyyMMdd").substring(2);
		String sql = "select max(trans_no_) as transNo  from tbsh10  where comp_Id_='"
				+ AppUtils.getCompId() + "' and substr(trans_no_,2,6)='"+todayStr+"'  for update;";
		List sh10List = this.getJdbcTemplate().queryForList(sql);
		if (!CollectionUtils.isEmpty(sh10List)) {
			Map sh10Map = (Map) sh10List.get(0);
			if (sh10Map.get("transNo") == null) {
				newTransNo = "T"
						+ (DateFormatUtils.format(new Date(), "yyyyMMdd") + "00001")
								.substring(2);
			} else {
				String transNoMax = AppUtils.toValidString(sh10Map.get("transNo")).substring(1);
				String noserNo = transNoMax.substring(0,transNoMax.length()-5);
				String serNo = transNoMax.substring(transNoMax.length()-5,transNoMax.length());
				String serNoMax = AppUtils.addZero(AppUtils.toValidString(NumberUtils.toLong(serNo)+1), 5);
				newTransNo = "T" + noserNo + serNoMax;
			}
		}
		return newTransNo;
	}
	
	public static void main(String[] args) {
		String str ="T16121200012";
		String transNoMax = str.substring(1);
		String noserNo = transNoMax.substring(0,transNoMax.length()-5);
		String serNo = transNoMax.substring(transNoMax.length()-5,transNoMax.length());
		String serNoMax = AppUtils.addZero(AppUtils.toValidString(NumberUtils.toLong(serNo)+1), 5);
		String newTransNo = "T" + noserNo + serNoMax;
		System.out.println(DateFormatUtils.format(new Date(), "yyyyMMdd").substring(2));
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
		String hql = " from " + Tbwd01.class.getName()
				+ " where 1=1 and compId='" + AppUtils.getCompId() + "' ";
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
		sql += " where compId='" + AppUtils.getCompId() + "' ";
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
		String transPort = "";
		String hql = " from " + Tbsh01.class.getName()
				+ " where 1=1 and compId='" + AppUtils.getCompId() + "'";
		if (StringHelper.isNotEmpty(paramater)) {
			transPort = paramater;
			hql = " from " + Tbsh01.class.getName() + " where 1=1 and compId='"
					+ AppUtils.getCompId() + "' and transport='" + transPort
					+ "' ";
		}
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
		String hql = " from " + Tbsh01b.class.getName()
				+ " where 1=1 and compId='" + AppUtils.getCompId() + "'";
		if (StringHelper.isNotEmpty(paramater)) {
			hql += " and stationcode ='" + paramater + "' ";
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}

	/**
	 * saveByWgt 反写重量 创建人：Tom 修改人：Tom 创建时间：2016-11-16 下午7:12:20 修改时间：2016-11-16
	 * 下午7:12:20
	 * 
	 * @param name
	 * @param @return 设定文件
	 * @return String DOM对象
	 * @Exception 异常对象
	 * @since CodingExample　Ver(编码范例查看) 1.1
	 */
	public void saveByWgt(Map<String, Object> inMap) {
		String transNo = AppUtils.toValidString(inMap.get("transNo"));
		String backStatus = AppUtils.toValidString(inMap.get("backStatus"));
		String deliverStatus = AppUtils.toValidString(inMap
				.get("deliverStatus"));
		BigDecimal deliveryWgt = new BigDecimal(
				AppUtils.toValidStringForZero(inMap.get("deliveryWgt")));
		BigDecimal backWgt = new BigDecimal(AppUtils.toValidStringForZero(inMap
				.get("backWgt")));
		String hql = " from Tbsh10 where transNo='" + transNo
				+ "' and compId='" + AppUtils.getCompId() + "' ";
		List<Tbsh10> sh10List = this.query(hql);
		if (!CollectionUtils.isEmpty(sh10List)) {
			Tbsh10 sh10 = sh10List.get(0);
			BigDecimal deliveredWgt_total = AppUtils.getBigDecimal(sh10
					.getDeliveredWgt());
			BigDecimal backWgt_total = AppUtils
					.getBigDecimal(sh10.getBackWgt());
			if ("1".equals(backStatus)) {
				sh10.setBackWgt(backWgt_total.add(backWgt));
			}
			if ("1".equals(deliverStatus)) {
				sh10.setDeliveredWgt(deliveredWgt_total.add(deliveryWgt));
			}
			if ("0".equals(backStatus)
					&& backWgt_total.compareTo(BigDecimal.ZERO) != 0) {
				sh10.setBackWgt(backWgt_total.subtract(backWgt));
			}
			if ("0".equals(deliverStatus)
					&& deliveredWgt_total.compareTo(BigDecimal.ZERO) != 0) {
				sh10.setDeliveredWgt(deliveredWgt_total.subtract(deliveryWgt));
			}
			this.update(sh10);
		}
	}

	/**
	 * pagingQueryUnSettleSh10 创建人：Tom 修改人：Tom 创建时间：2016-12-28 下午2:11:30
	 * 修改时间：2016-12-28 下午2:11:30
	 * 
	 * @param name
	 * @param @return 设定文件
	 * @return String DOM对象
	 * @throws Exception
	 * @Exception 异常对象
	 * @since CodingExample　Ver(编码范例查看) 1.1
	 */

	public void pagingQueryUnSettleSh10(Page<Tbsh10> page,
			Map<String, Object> paramater) throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10 where 1=1 and compId='"
				+ AppUtils.getCompId() + "' and status = '10' ");
		if(paramater!= null){
			 String transNo = AppUtils.toValidString(paramater.get("transNo"));
			 String contNo = AppUtils.toValidString(paramater.get("contNo"));
			 String custName = AppUtils.toValidString(paramater.get("custName"));
			 if(StringHelper.isNotEmpty(transNo)){
				 sqlStr.append(" and transNo like'%"+transNo+"%'");
			 }
			 if(StringHelper.isNotEmpty(contNo)){
				 sqlStr.append(" and contNo like %'"+contNo+"%'");
			 }
			 if(StringHelper.isNotEmpty(custName)){
				 sqlStr.append(" and custName like %'"+custName+"%'");
			 } 
		 }
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());

	}

}

package com.jghz.sh.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.tools.ant.taskdefs.optional.sos.SOS;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.DateFormatUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.data.provider.Page;
import com.itextpdf.text.log.SysoLogger;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh32;
import com.jghz.sh.entity.Tbsh33;
import com.jghz.sh.entity.Tbwd01;

/**
 * 
 * 项目名称：jghz 类名称：Shjc33Dao 类描述： 创建人：Tom 创建时间：3326-33-29 下午2:20:09 修改人：Tom
 * 修改时间：3326-33-29 下午2:20:09 修改备注：
 * 
 * @version
 * 
 */
@Repository
public class Shjc33Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh33> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from " + Tbsh33.class.getName() + " where 1=1 ";
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}

	public String genSettleNo() {
		String newSettleNo = "";
		String sql = "select max(settle_no_) as settleNo from tbsh33 for update;";
		List sh33List = this.getJdbcTemplate().queryForList(sql);
		if (!CollectionUtils.isEmpty(sh33List)) {
			Map sh33Map = (Map) sh33List.get(0);
			if (sh33Map.get("settleNo") == null) {
				newSettleNo = "PS"+DateFormatUtils.format(new Date(), "yyyyMMdd") + "001";
			} else { 
				String settleNoMax = AppUtils.toValidString(sh33Map.get("settleNo")); 
				String noserNo = settleNoMax.substring(2,settleNoMax.length()-3);
				String serNo = settleNoMax.substring(settleNoMax.length()-3,settleNoMax.length());
				String serNoMax = AppUtils.addZero(AppUtils.toValidString(NumberUtils.toLong(serNo)+1), 3);
				newSettleNo = "PS" + noserNo + serNoMax;
			}
		}
		return newSettleNo; 
	}
	
	public Tbsh33 queryBySettleNo(String settleNo){
		Tbsh33 sh33 = new Tbsh33();
		String hqla = "from Tbsh33 where settleNo='"+settleNo+"'  ";
		List sh33List = this.query(hqla);
		if(CollectionUtils.isNotEmpty(sh33List)){
			sh33 = (Tbsh33)sh33List.get(0);
		}
		return sh33;
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
		String hql = " from " + Tbsh01b.class.getName() + " where 1=1 and compId='"+AppUtils.getCompId()+"'";
		if (StringHelper.isNotEmpty(paramater)) {
			hql += " and stationcode ='" + paramater + "' ";
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
 
}

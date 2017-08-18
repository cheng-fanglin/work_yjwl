package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh10d;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd02;

/**
 * 
 * 项目名称：jghz 类名称：Shjc10dDao 类描述： 创建人：Tom 创建时间：1026-10-29 下午2:20:09 修改人：Tom
 * 修改时间：1026-10-29 下午2:20:09 修改备注：
 * 
 * @version
 * 
 */
@Repository
public class Shjc10dDao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh10d> page, Map<String, Object> paramater)
			throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10d where 1=1 ");
		if (paramater != null) {
			String transNo = AppUtils.toValidString(paramater.get("transNo"));
			if (StringHelper.isNotEmpty(transNo)) {
				sqlStr.append(" and transNo ='" + transNo + "'");
			}
		}
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());
	}
}

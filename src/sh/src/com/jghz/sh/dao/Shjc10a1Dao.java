package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh10a1;
import com.jghz.sh.entity.Tbsh22;

/**
 * 
 * 项目名称：jghz 类名称：Shjc10a1Dao 类描述： 创建人：Tom 创建时间：1026-10-29 下午2:20:09 修改人：Tom
 * 修改时间：1026-10-29 下午2:20:09 修改备注：
 * 
 * @version
 * 
 */
@Repository
public class Shjc10a1Dao extends BaseDao {

	@Resource
	private Shjc10dDao shjc10dDao;
	
	@Resource
	private Shjc10aDao shjc10aDao;
	
	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh10a1> page, Map<String, Object> paramater)
			throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10a1 where 1=1 ");
		if (paramater != null) {
			String transNo = AppUtils.toValidString(paramater.get("transNo"));
			if (StringHelper.isNotEmpty(transNo)) {
				sqlStr.append(" and transNo ='" + transNo + "'");
			}
		}
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());
	}
	
	public List querySh10a1(Map inMap){
		String transItem = AppUtils.toValidString(inMap.get("transItem"));
		String compId = AppUtils.toValidString(inMap.get("compId"));
		String hql = " from Tbsh10a1 where compId='"+compId+"' and transItem='"+transItem+"' ";
		List<Tbsh10a1> listSh10a1 = this.query(hql);
		return listSh10a1;
	}

}

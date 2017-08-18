package com.jghz.dc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdcb1;

@Repository
public class Dcjcb1Dao extends BaseDao {

	/**
	 * @Description ajax 判断是否可以新增
	 * @param map
	 * @return
	 */
	public String uniqueCheck(String compId,String Id){
		String hql = "select count(*) from " + Tbdcb1.class.getName() + " d where d.compId = :compId and d.templateId = :templateId";
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("compId", compId);
		parameterMap.put("templateId", Id);
		if(this.queryForInt(hql, parameterMap)>0){
			return "当前ID已存在！";
		}else{
			return null;
		}
	}
	
	/**
	 * @Description 查询公用代码档资料(可以查询所以数据)
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbdcb1> page, Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdcb1.class.getName()+" where compId = '"+AppUtils.getCompId()+"' ";
		//{templateId=1, template=2, tempDesc=3}
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("templateId"))) {
 				hql += " and templateId like '%"+parameter.get("templateId")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("template"))) {
 				hql += " and template like '%"+parameter.get("template")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("tempDesc"))) {
 				hql += " and tempDesc like '%"+parameter.get("tempDesc")+"%' ";
			}
		}
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}
}

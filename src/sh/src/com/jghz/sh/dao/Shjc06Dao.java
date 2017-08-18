package com.jghz.sh.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.CollectionUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh06;
 
  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc06Dao  
* 类描述：  
* 创建人：Tom  
* 创建时间：2016-10-29 下午2:20:45  
* 修改人：Tom  
* 修改时间：2016-10-29 下午2:20:45  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc06Dao extends BaseDao {
	
	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh06> page, Map<String, Object> paramater)
			throws Exception {
		String sql = " from Tbsh06 where 1=1 ";
		if (paramater != null) {
			if (null != paramater.get("sh06Id")
					&& !"".equals(paramater.get("sh06Id"))) {
				sql += " and parentId='" + paramater.get("sh06Id") + "' ";
			}
		}
		super.pagingQuery(page, sql, "select count(*) " + sql);
	}
	
	public List getAreaByParentId(String parentId){
		String sql = " from Tbsh06 where parentId='"+parentId+"' and comp_id_='wgwl'";
		List rtnList = this.query(sql);
		return rtnList;
	}

	/**  
	* getAreaRoot 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-10-29 下午2:20:56 
	* 修改时间：2016-10-29 下午2:20:56 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	public List<Tbsh06> getAreaRoot(String parentId) {
		String sql = "   from Tbsh06  where  comp_id_='wgwl' and (parentId is null or parentId='') ";
		List<Tbsh06> rtnList = this.query(sql);
		return rtnList;
	}
	
	public String createCode(Tbsh06 sh06) {
		List paramList = new ArrayList();
		String areacode = "";
		if (null == sh06.getParentId() || "".equals(sh06.getParentId())) { 
			String sql = " SELECT MAX(areacode_)  as AREACODE FROM Tbsh06 WHERE comp_Id_ = ? ";
			paramList.add(sh06.getCompId());
			List list = this.getJdbcTemplate().queryForList(sql, paramList.toArray());
			if(!CollectionUtils.isEmpty(list) ){
				Map map = (Map)list.get(0);
				String str=AppUtils.toValidString(map.get("AREACODE"));
				if(StringHelper.isNotEmpty(str)){
					areacode = String.format("%02d", Integer.parseInt(str) + 1);
				}else{
					areacode ="";
				}
			}  
		} else { 
			String sql = " SELECT MAX(areacode_) as AREACODE FROM Tbsh06 WHERE comp_Id_ = ? AND parent_Id_ = ? ";
			paramList = new ArrayList();
			paramList.add(sh06.getCompId());
			paramList.add(sh06.getParentId());
			List list = this.getJdbcTemplate().queryForList(sql, paramList.toArray());
			if(!CollectionUtils.isEmpty(list) ){
				Map map = (Map)list.get(0);
				String str=AppUtils.toValidString(map.get("AREACODE"));
				if(StringHelper.isNotEmpty(str)){
					areacode = str.substring(0, str.length() - 2)
							+ String.format(
									"%02d",
									Integer.parseInt(str.substring(
											str.length() - 2, str.length())) + 1);
				}else{
					sql = " SELECT areacode_ FROM Tbsh06 WHERE comp_Id_ = ? AND sh06_Id_ = ? ";
					paramList = new ArrayList();
					paramList.add(sh06.getCompId());
					paramList.add(sh06.getSh06Id());
					List listCode = this.getJdbcTemplate().queryForList(sql, paramList.toArray());
					areacode = listCode.get(0)+"01"; 
				} 
			} 
		}
		return areacode;
	}
	
	@SuppressWarnings("unchecked")
	public boolean checkTbsh06Index(Tbsh06 sh06) {
		List listParam = new ArrayList();
		String sql = "select * FROM Tbsh06 WHERE comp_Id_=? AND areacode_ = ?";
		listParam.add(sh06.getCompId());
		listParam.add(sh06.getAreacode());
		List listTbsh06 = this.getJdbcTemplate().queryForList(sql, listParam.toArray());

		listParam = new ArrayList();
		listParam.add(sh06.getCompId());
		listParam.add(sh06.getAreaname());
		String sql1 = "select * FROM Tbsh06 WHERE comp_Id_=? AND areaname_=? ";
		List listTbsh06_ = this.getJdbcTemplate().queryForList(sql1, listParam.toArray());

		if ((listTbsh06 != null && listTbsh06.size() == 1)
				|| (listTbsh06_ != null && listTbsh06_.size() == 1)) {
			return true;
		} else {
			return false; // 
		}
	}


	@SuppressWarnings("unchecked")
	public boolean checkTbsh06Modif(Tbsh06 sh06) {
		List listParam = new ArrayList();
		listParam.add(sh06.getCompId());
		listParam.add(sh06.getAreacode());
		listParam.add(sh06.getAreaname());
		listParam.add(sh06.getSh06Id());
		listParam.add(sh06.getCreateDate());
		listParam.add(sh06.getEcode());
		String sql = "select * FROM Tbsh06 WHERE comp_Id_ = ? AND areacode_ = ? AND areaname_ = ? AND sh06_Id_ = ? "
				+ "AND create_Date_ = ? AND ecode_ = ?";
		List listTbsh06 = this.getJdbcTemplate().queryForList(sql, listParam.toArray());;

		if (listTbsh06 != null && listTbsh06.size() == 1) {
			return true;
		} else {
			return false; // 
		}
	}

	  
	/**  
	* getAreaAll(这里用一句话描述这个方法的作用)   
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-4 上午11:04:29 
	* 修改时间：2016-11-4 上午11:04:29 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public List<Tbsh06> getAreaAll(String parentId) {
		Tbsh06 sh06 = new Tbsh06();
		List list = new ArrayList();
		sh06.setCompId(AppUtils.getCompId());
		sh06.setSh06Id("all");
		sh06.setAreaname("全国");
		list.add(sh06);
		// TODO Auto-generated method stub
		return list;
	}
}

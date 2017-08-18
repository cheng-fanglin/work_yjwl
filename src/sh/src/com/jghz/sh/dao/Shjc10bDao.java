package com.jghz.sh.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih01a;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh10b;
import com.jghz.sh.entity.Tbsh10d;

/**
 * 
 * 项目名称：jghz 类名称：Shjc10bDao 类描述： 创建人：Tom 创建时间：1026-10-29 下午2:20:09 修改人：Tom
 * 修改时间：1026-10-29 下午2:20:09 修改备注：
 * 
 * @version
 * 
 */
@Repository
public class Shjc10bDao extends BaseDao {

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
	public void pagingQuery(Page<Tbsh10b> page, Map<String, Object> paramater)
			throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10b where 1=1 ");
		if (paramater != null) {
			String transNo = AppUtils.toValidString(paramater.get("transNo"));
			if (StringHelper.isNotEmpty(transNo)) {
				sqlStr.append(" and transNo ='" + transNo + "'");
			}
		}
		sqlStr.append("order by carNo desc ");
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());
	}
	
	public void loadSh10bByTransNo(Page<Tbsh10b> page, Criteria criteria) throws Exception {
		List sh10dList=new ArrayList();
		String sh10bHql = " from Tbsh10b where compId= '"+AppUtils.getCompId()+"' and transNo is null ";
		List sh10bList = this.query(sh10bHql);
		//先查询运单下的南钢订单
		Map<String,Object> valueMap;
		ParseResult result=this.parseCriteria(criteria,true,"r");
		if(result!=null){
			StringBuffer sb=result.getAssemblySql();
			valueMap=result.getValueMap();
			String sh10dHql = " from "+Tbsh10d.class.getName()+" r where "+sb.toString()+" and r.compId=:compId order by carNo desc";
			sh10dList = shjc10dDao.query(sh10dHql);
		}else{
			valueMap=new HashMap<String,Object>();
		}
		for(int i = 0;i<sh10dList.size();i++){
			Tbsh10d sh10d = (Tbsh10d)sh10dList.get(i);
			//判断装车单的的订单是否跟运单的南钢订单吻合，如果不吻合，则剔除
			String orderNoNg = sh10d.getOrderNoNj();
			for(int j = 0;j<sh10bList.size();j++){
				Tbsh10b sh10b = (Tbsh10b)sh10bList.get(j);
				String orderNoNgSh10b = sh10b.getOrderNoNg();
				String orderItemNgSh10b = sh10b.getOrderItemNg();
				if(StringHelper.isEmpty(orderNoNgSh10b) && orderItemNgSh10b.contains("-")){
					orderNoNgSh10b = orderItemNgSh10b.split("-")[0];
				}
				if(!orderNoNg.equals(orderNoNgSh10b)){
					sh10bList.remove(j);
				}
			} 
		}
		page.setEntities(sh10bList);
		page.setEntityCount(sh10bList.size());
	}
	
	public List queryByTransNo(String transNo){
		String hql = " from Tbsh10b where compId='"+AppUtils.getCompId()+"' and transNo='"+transNo+"' ";
		List list = this.query(hql);
		return list;
	}

	  
	/**  
	* queryByTransItem 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2017-1-7 上午11:42:16 
	* 修改时间：2017-1-7 上午11:42:16 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public List queryByTransItem(String transItem) {
		// TODO Auto-generated method stub
		String hql = " from Tbsh10b where compId='"+AppUtils.getCompId()+"' and transItem='"+transItem+"' ";
		List list = this.query(hql);
		return list;
	}
}

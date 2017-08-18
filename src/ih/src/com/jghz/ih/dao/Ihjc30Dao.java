package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih30;


@Component
public class Ihjc30Dao extends BaseDao{
	
	public void pagingQueryForSelect(Page<Tbih30> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih30.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("custName")!=null){
				hql += " and custName like '%" +paramater.get("custName")+"%'";
			}
			if(paramater.get("wareQwCode")!=null){
				hql += " and wareQwCode = '%" +paramater.get("wareQwCode")+"%'";
			}
			if(paramater.get("orderNo")!=null){
				hql += " and orderNo = '" +paramater.get("orderNo")+"'";
			}        
			hql += " and status = '00' order by wareQwCode ,layerCode ";
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	//通用情况下查询Tbih30的分页数据
	public void pagingQuery(Page<Tbih30> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih30.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("wareQwCode")!=null){
				hql += " and wareQwCode like '%" +paramater.get("wareQwCode")+"%'";
			}
			if(paramater.get("custName")!=null){
				hql += " and custName like '%" +paramater.get("custName")+"%'";
			}
			if(paramater.get("labelNo")!=null){
				hql += " and labelNo like '%" +paramater.get("labelNo")+"%'";
			}
			if(paramater.get("gradeNo")!=null){
				hql += " and gradeNo like '%" +paramater.get("gradeNo")+"%'";
			}
			if(paramater.get("productName")!=null){
				hql += " and productName like '%" +paramater.get("productName")+"%'";
			}
			if(paramater.get("size")!=null){
				hql += " and size like '%" +paramater.get("size")+"%'";
			}
			if(paramater.get("ladingNo")!=null){
				hql += " and ladingNo like '%" +paramater.get("ladingNo")+"%'";
			}
			if(paramater.get("orderItem")!=null){
				hql += " and orderItem like '%" +paramater.get("orderItem")+"%'";
			}
			if(paramater.get("inDateS")!=null){
				hql += " and inDate >= '" +paramater.get("inDateS")+"'";
			}
			if(paramater.get("inDateE")!=null){
				hql += " and inDate <= '" +paramater.get("inDateE")+" 24:00:00"+"'";
			}
			if(paramater.get("outDateS")!=null){
				hql += " and outDate >= '" +paramater.get("outDateS")+"'";
			}
			if(paramater.get("outDateE")!=null){
				hql += " and outDate <= '" +paramater.get("outDateE")+" 24:00:00"+"'";
			}
			
			if(paramater.get("status")!=null){
				if("IN".equals(paramater.get("status"))){
					hql += " and status < '20' ";
				}else{
					hql += " and status = '"+paramater.get("status")+"' ";
				}
				
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	//通用情况下查询Tbih30的List数据
	public List<Tbih30> queryList(Map<String, Object> paramater){
		if(paramater==null){
			return null;
		}
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih30.class.getName()+ " where 1=1 ";
		
		if( paramater.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paramater.get("custNo"));
		}
		if( paramater.get("custName")!=null){
			hql += " and custName like :custName ";
			param.put("custName", "%"+paramater.get("custName")+"%");
		}
		if( paramater.get("contNo")!=null){
			hql += " and contNo = :contNo ";
			param.put("contNo", paramater.get("contNo"));
		}
		if( paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if( paramater.get("ladingNo")!=null){
			hql += " and ladingNo = :ladingNo ";
			param.put("ladingNo", paramater.get("ladingNo"));
		}
		
		if( paramater.get("prodType")!=null){
			hql += " and prodType = :prodType ";
			param.put("prodType", paramater.get("prodType"));
		}
		if( paramater.get("prodTypeName")!=null){
			hql += " and prodTypeName like :prodTypeName ";
			param.put("prodTypeName", "%"+paramater.get("prodTypeName")+"%");
		}
		if( paramater.get("productNo")!=null){
			hql += " and productNo = :productNo ";
			param.put("productNo", paramater.get("productNo"));
		}
		if( paramater.get("productName")!=null){
			hql += " and productName like :productName ";
			param.put("productName", "%"+paramater.get("productName")+"%");
		}
		if( paramater.get("inNo")!=null){
			hql += " and inNo = :inNo ";
			param.put("inNo", paramater.get("inNo"));
		}
		if( paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		hql +=" order by jfr asc";
		List<Tbih30> listIh30 = this.query(hql,param);
		return listIh30;
	}
	
	/**
	 * 提单开立
	 * 左边table中，显示orderItem下的在库合计值
	 * 合计当前仓库中可以开提单的每个品种下的量的合计
	 * */
	public List<Map<String,Object>> queryListOrderItem(Map<String, Object> paramater){
		String hql = "select sum(wgt_) as kdl, order_item_ as orderItem, prod_type_ as prodType, prod_type_name_ as prodTypeName, product_no_ as productNo, product_name_ as productName " +
				" from tbih30 where status_ ='00' and (lading_no_ is null or lading_no_ = '' ) and (out_no_ is null or out_no_ = '') ";
		if( paramater!=null&&paramater.get("compId")!=null){
			hql += " and comp_id_ = '"+paramater.get("compId")+"' ";
		}
		if( paramater!=null&&paramater.get("cust_no_")!=null){
			hql += " and cust_no_ = '"+paramater.get("custNo")+"' ";
		}
		hql +=" group by order_item_ , prod_type_ , prod_type_name_ , product_no_ , product_name_";
		
		List<Map<String,Object>> listIh30 = this.getJdbcTemplate().queryForList(hql);
		return listIh30;
	}
	
	/**
	 * 提单开立
	 * 右边table中，显示满足提单条件，未出库的所有存货档Tbih30数据
	 */
	public List<Tbih30> queryListLading(Map<String, Object> paramater){
		if(paramater==null){
			return null;
		}
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih30.class.getName()+ 
				" where status ='00' and (deliveryNo is null or deliveryNo = '' ) and (outNo is null or outNo = '')  ";
		
		if( paramater.get("compId")!=null){
			hql += " and compId = :compId ";
			param.put("compId", paramater.get("compId"));
		}
		if( paramater.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paramater.get("custNo"));
		}
		if( paramater.get("contNo")!=null){
			hql += " and contNo = :contNo ";
			param.put("contNo", paramater.get("contNo"));
		}
		if( paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if( paramater.get("ladingNo")!=null){
			hql += " and ladingNo = :ladingNo ";
			param.put("ladingNo", paramater.get("ladingNo"));
		}
		
		/*if( paramater.get("prodType")!=null){
			hql += " and prodType = :prodType ";
			param.put("prodType", paramater.get("prodType"));
		}
		if( paramater.get("prodTypeName")!=null){
			hql += " and prodTypeName like :prodTypeName ";
			param.put("prodTypeName", "%"+paramater.get("prodTypeName")+"%");
		}*/
		if( paramater.get("productNo")!=null){
			hql += " and productNo = :productNo ";
			param.put("productNo", paramater.get("productNo"));
		}
		if( paramater.get("productName")!=null){
			hql += " and productName like :productName ";
			param.put("productName", "%"+paramater.get("productName")+"%");
		}
		if( paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		List<Tbih30> listIh30 = this.query(hql,param);
		return listIh30;
	}
	
	
	
	/**
	 * 
	 * 计算存货档中已经挂了某一个订单的合计重量
	 * for Ihjc19Service 判断配货时是否超量
	 * */
	public List<Map<String,Object>> queryListOrderItemDone(Map<String, Object> paramater){
		String hql = "select sum(wgt_) as sumWgt " +
				" from tbih30 where 1=1 ";
		if( paramater!=null&&paramater.get("compId")!=null){
			hql += " and comp_id_ = '"+paramater.get("compId")+"' ";
		}
		if( paramater!=null&&paramater.get("deliveryNo")!=null){
			hql += " and delivery_No_ = '"+paramater.get("deliveryNo")+"' ";
		}
		if( paramater!=null&&paramater.get("ladingNo")!=null){
			hql += " and lading_No_ = '"+paramater.get("ladingNo")+"' ";
		}
		if( paramater!=null&&paramater.get("orderItem")!=null){
			hql += " and order_item_ = '"+paramater.get("orderItem")+"' ";
		}
//		if( paramater!=null&&paramater.get("prodType")!=null){
//			hql += " and prod_type_ = '"+paramater.get("prodType")+"' ";
//		}
//		if( paramater!=null&&paramater.get("prodTypeName")!=null){
//			hql += " and prod_type_name_ = '"+paramater.get("prodTypeName")+"' ";
//		}
		if( paramater!=null&&paramater.get("productNo")!=null){
			hql += " and product_no_ = '"+paramater.get("productNo")+"' ";
		}
		if( paramater!=null&&paramater.get("productName")!=null){
			hql += " and product_name_ = '"+paramater.get("productName")+"' ";
		}
		
		List<Map<String,Object>> listIh30 = this.getJdbcTemplate().queryForList(hql);
		return listIh30;
	} 
	
	/**
	 * 配货页面显示Tbih30数据
	 * 根据ladingNo查询出在库产品中可以发货的数据
	 * */
	public List<Tbih30> queryListPH(Map<String, Object> paramater){
		if(paramater==null){
			return null;
		}
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih30.class.getName()+ " where status ='00' ";
		
		//整体项次新增，提单号为空(配货页面查询使用)
		if(  "Y".equals(AppUtils.toValidString(paramater.get("sfxzztxc")))){
			hql += " and (deliveryNo is null or deliveryNo = '' ) and (outNo is null or outNo = '') ";
			
			if( paramater.get("orderItemArry")!=null){
				hql += " and orderItem in "+paramater.get("orderItemArry")+" ";
			}
			if( paramater.get("orderItem")!=null){
				hql += " and orderItem = '"+paramater.get("orderItem")+"' ";
			}
			if( paramater.get("ladingNo")!=null){
				hql += " and ladingNo = '"+paramater.get("ladingNo")+"' ";
			}
		}else{
			if( paramater.get("deliveryNo")!=null){
				hql += " and deliveryNo = :deliveryNo ";
				param.put("deliveryNo", paramater.get("deliveryNo"));
			}
			if( paramater.get("ladingNo")!=null){
				hql += " and ladingNo = :ladingNo ";
				param.put("ladingNo", paramater.get("ladingNo"));
			}
			if( paramater.get("labelNo")!=null){
				hql += " and labelNo = :labelNo ";
				param.put("labelNo", paramater.get("labelNo"));
			}
			hql += " and (outNo is null or outNo = '') ";
		}
		/*if( paramater.get("prodType")!=null){
			hql += " and prodType = :prodType ";
			param.put("prodType", paramater.get("prodType"));
		}
		if( paramater.get("prodTypeName")!=null){
			hql += " and prodTypeName like :prodTypeName ";
			param.put("prodTypeName", "%"+paramater.get("prodTypeName")+"%");
		}*/
		if( paramater.get("productNo")!=null){
			hql += " and productNo = :productNo ";
			param.put("productNo", paramater.get("productNo"));
		}
		if( paramater.get("productName")!=null){
			hql += " and productName like :productName ";
			param.put("productName", "%"+paramater.get("productName")+"%");
		}
		hql += " order by inDate asc ";//入库时间升序排列，排第一条的数据库龄最大
		List<Tbih30> listIh30 = this.query(hql,param);
		return listIh30;
	}
	
	public Tbih30 getOneTbih30(Map<String, Object> paramater) throws Exception{
		if(paramater==null){
			return null;
		}
		Tbih30 ih30=new Tbih30();
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih30.class.getName()+ " where 1=1 ";
		if(paramater.get("ih30Id")!=null){
			hql += " and ih30Id = :ih30Id ";
			param.put("ih30Id", paramater.get("ih30Id"));
		}
		if(paramater.get("compId")!=null){
			hql += " and compId = :compId ";
			param.put("compId", paramater.get("compId"));
		}
		if(paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		if(paramater.get("ladingNo")!=null){
			hql += " and ladingNo = :ladingNo ";
			param.put("ladingNo", paramater.get("ladingNo"));
		}
		List<Tbih30> listIh30 = this.query(hql,param);
		if(CollectionUtils.isNotEmpty(listIh30)&&listIh30.get(0)!=null){
			ih30 = listIh30.get(0);
		}else{
			throw new Exception("找不到对应的存货记录");
		}
		
		return ih30;
	}
	
	/**
	 * 
	 * 得到在库存货中，某一个库位上最大的层号
	 * for Ihjc19Service 判断配货时是否超量
	 * */
	public String queryMaxLayerCode(Map<String, Object> paramater){
		String hql = "select max(LAYER_CODE_) as layerCode " +
				" from tbih30 where 1=1 ";
		if( paramater!=null&&paramater.get("compId")!=null){
			hql += " and comp_id_ = '"+paramater.get("compId")+"' ";
		}
		if( paramater!=null&&paramater.get("wareQwCode")!=null){
			hql += " and ware_Qw_Code_ = '"+paramater.get("wareQwCode")+"' ";
		}
		hql += " and STATUS_ < '20' "; //在库存货
		
		List<Map<String,Object>> listIh30 = this.getJdbcTemplate().queryForList(hql);
		if(CollectionUtils.isEmpty(listIh30)||listIh30.get(0)==null||listIh30.get(0).get("layerCode")==null){
			return "0";
		}else{
			return AppUtils.toValidString(listIh30.get(0).get("layerCode"));
		}
		
	} 
	
	/**
	 * 
	 * 得到在库存货中，某一个库位上最大的层号与实际堆放层数不匹配
	 * for Ihjc13Service 刷新库位上的层号 
	 * */
	public List<Map<String,Object>> queryLayerCodeRefresh(Map<String, Object> paramater){
		String hql = "select * from ( " +
				" select comp_id_ compId, WARE_QW_CODE_ wareQwCode ,COUNT(1) countNum ,max(LAYER_CODE_) maxNum " +
				" from Tbih30  " +
				" where 1=1 ";
				
		if( paramater!=null&&paramater.get("compId")!=null){
			hql += " and comp_id_ = '"+paramater.get("compId")+"' ";
		}
		if( paramater!=null&&paramater.get("wareQwCode")!=null){
			hql += " and ware_Qw_Code_ = '"+paramater.get("wareQwCode")+"' ";
		}
		hql += " and STATUS_ < '20' " +      //在库存货
				" GROUP BY WARE_QW_CODE_ ,comp_id_" +
				" )Ih30Ware where Ih30Ware.countNum <> Ih30Ware.maxNum "; 
		
		List<Map<String,Object>> listIh30 = this.getJdbcTemplate().queryForList(hql);
		return listIh30;
		
	} 
	
	//查询一个库位上层号由小到大排序的库存数据
	public List<Tbih30> queryListOrderByLayerCode(Map<String, Object> paramater){
		if(paramater==null){
			return null;
		}
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih30.class.getName()+ " where 1=1 ";
		if(paramater.get("compId")!=null){
			hql += " and compId = '" +paramater.get("compId")+"'";
		}
		if(paramater.get("wareQwCode")!=null){
			hql += " and wareQwCode = '" +paramater.get("wareQwCode")+"'";
		}
		hql +=" order by layerCode asc";
		List<Tbih30> listIh30 = this.query(hql,param);
		return listIh30;
	}
}

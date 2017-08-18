package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih01;
import com.jghz.ih.entity.Tbih01a;


@Component
public class Ihjc01Dao extends BaseDao{

	public void pagingQueryCustdrop(Page<Tbih01> page,Criteria criteria)
			throws Exception {
		String compId=AppUtils.getCompId();
		String sql="SELECT a.QW_CODE_ qwCode,a.QW_NAME_ qwName,a.WARE_CODE_ wareCode,IH30.maxLayerCode,a.KB_ kb from tbih01 a LEFT JOIN " +
				" (SELECT b.ware_qw_code_, MAX(b.layer_code_) as maxLayerCode from tbih30 b where b.status_='00')IH30 on a.QW_CODE_ = IH30.ware_qw_code_"+
				" where a.comp_id_ = '"+compId+"' ";
		ParseResult result=this.parseCriteria(criteria,true,"r");
		Map<String,Object> paramter= new HashMap<String,Object>();
		if(result!=null){
			paramter=result.getValueMap();	
			if(paramter!=null){
				if(paramter.get("wareCode_1_")!=null){
					sql+=" and a.WARE_CODE_ like '%"+paramter.get("wareCode_1_")+"%'";
				}
				if(paramter.get("qwCode_1_")!=null){
					sql+=" and a.QW_CODE_ like '%"+paramter.get("qwCode_1_")+"%'";
				}
				if(paramter.get("qwName_1_")!=null){
					sql+=" and a.QW_NAME_ like '%"+paramter.get("qwName_1_")+"%'";
				}
				if(paramter.get("kb_1_")!=null){
					sql+=" and a.KB_ like '%"+paramter.get("kb_1_")+"%'";
				}
			}
		}
		sql+=" order by a.QW_CODE_ ";
		this.getJdbcDao().paginationQuery(sql, page);
	}
	
	public void pagingQuery(Page<Tbih01> page, Map<String, Object> paramater)
			throws Exception {
		
		String hql = " from "+Tbih01.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("wareCode")!=null){
				hql += " and wareCode like '%" +paramater.get("wareCode")+"%'";
			}
			if(paramater.get("wareName")!=null){
				hql += " and wareName like '%" +paramater.get("wareName")+"%'";
			}  
			if (AppUtils.isNotEmpty(paramater.get("ih01Id"))) {
 				hql += " and fatherId='"+paramater.get("ih01Id")+"' ";
			}else{
				hql += " and (fatherId='root') ";
			}
		}	
		this.pagingQuery(page, hql+" order by qwCode asc", "select count(*) " + hql);
	}
	
	public List<Tbih01> queryList(Map<String, Object> paramater){
		 
		String hql = " from "+Tbih01.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("qwCode")!=null){
				hql += " and qwCode like '%" +paramater.get("qwCode")+"%'";
			}
			if(paramater.get("ih01Id")!=null){
				hql += " and ih01Id = '" +paramater.get("ih01Id")+"'";
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		}
		List<Tbih01> listIh01 = this.query(hql);
		return listIh01;
	}
	
	@DataProvider
	public List<Tbih01> queryByFatherId(Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbih01.class.getName()+" where 1=1 ";
		if (parameter != null) {
//			if (AppUtils.isNotEmpty(parameter.get("treeType"))) {
// 				hql += " and treeType='"+parameter.get("treeType")+"' ";
//			}
			if (AppUtils.isNotEmpty(parameter.get("ih01Id"))) {
 				hql += " and fatherId='"+parameter.get("ih01Id")+"' ";
			}else{
				hql += " and (fatherId='root') ";
			}
			if (AppUtils.isNotEmpty(parameter.get("compId"))) {
 				hql += " and compId='"+parameter.get("compId")+"' ";
			}
			hql+=" order by qwCode asc"; 
			List<Tbih01> list= this.query(hql);
			return list;
		}else{
			return null;
		}
	}
}

package com.jghz.ih.dao;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.util.StringHelper;
import org.springframework.stereotype.Component;
import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.DateFormatUtils;
import com.base.util.NumberUtils;
import com.jghz.ih.entity.Tbih01;
import com.jghz.ih.entity.Tbih01a;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih03c;
import com.jghz.ih.entity.Tbih03e;
import com.jghz.ih.entity.Tbih03f;
import com.jghz.ih.entity.Tbih16;
import com.jghz.ih.entity.Tbih21b;
import com.jghz.ih.entity.Tbih30;
import com.jghz.ih.entity.Tbih31;
import com.jghz.ih.entity.Tbih60;

/**
 * IH通用方法
 * */
@Component
public class IhjcComm01Dao extends BaseDao{
	
	@Resource
	private Ihjc01Dao ihjc01Dao;
	
	@Resource
	private Ihjc03aDao ihjc03aDao;
	
	@Resource
	private Ihjc03cDao ihjc03cDao;
	
	@Resource
	private Ihjc03eDao ihjc03eDao;
	
	@Resource
	private Ihjc03fDao ihjc03fDao;
	
	@Resource
	private Ihjc60Dao ihjc60Dao;
	
	//合同协议号
	public String getContNo(Map<String, Object> parameter) throws Exception {
		String newContNo="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String contNoCondition = "N"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(cont_no_) as contNo from tbih21 where cont_no_ like   '%"+contNoCondition+"%' for update;";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("contNo")==null){
				newContNo = "N"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd")+"001");
			}else{
				String contNoMax = AppUtils.toValidString(ihCommMap.get("contNo")).substring(("N"+compId.toUpperCase()).length());
				newContNo = "N"+compId.toUpperCase()+AppUtils.toValidString(NumberUtils.toLong(contNoMax)+1);
			}
		} 
		return newContNo;
	}
	
	//订单项次号
	public String getOrderNo(Map<String, Object> parameter) throws Exception {
		String newOrderNo="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String orderNoCondition = "D"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(order_no_) as orderNo from tbih22  where order_no_ like '%"+orderNoCondition+"%' for update;";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("orderNo")==null){
				newOrderNo = "D"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd")+"0001");
			}else{
				String orderNoMax = AppUtils.toValidString(ihCommMap.get("orderNo")).substring(("D"+compId.toUpperCase()).length());
				newOrderNo = "D"+compId.toUpperCase()+AppUtils.toValidString(NumberUtils.toLong(orderNoMax)+1);
			}
		} 
		return newOrderNo;
	}
	
	//合同协议价格定义序号
	public String getSNo(Map<String, Object> parameter) throws Exception {
		String newSno="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String contNo=AppUtils.toValidString(parameter.get("contNo"));
		String sNoCondition = "J"+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(sno_) as sno from tbih21b where comp_id_='"+compId+"' and cont_no_='"+contNo+"' and sno_ like '%"+sNoCondition+"%' for update;";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("sno")==null){
				newSno = "J"+(DateFormatUtils.format(new Date(), "yyMMdd")+"001");
			}else{
				String snoMax = AppUtils.toValidString(ihCommMap.get("sno")).substring(1);
				newSno = "J"+AppUtils.toValidString(NumberUtils.toLong(snoMax)+1);
			}
		} 
		return newSno;
	}
		
	//提单号
	public String getLaddingNo(Map<String, Object> parameter) throws Exception {
		String newLaddingNo="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String laddingNoCondition = "L"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(delivery_No_) as ladingNo from tbih16 where delivery_No_ like '%"+laddingNoCondition+"%' for update;";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("ladingNo")==null){
				newLaddingNo = "L"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd")+"001");
			}else{
				String orderNoMax = AppUtils.toValidString(ihCommMap.get("ladingNo")).substring(("L"+compId.toUpperCase()).length());
				newLaddingNo = "L"+compId.toUpperCase()+AppUtils.toValidString(NumberUtils.toLong(orderNoMax)+1);
			}
		} 
		return newLaddingNo;
	}
	
	//入库单号
	public String getInNo(Map<String, Object> parameter) throws Exception {
		String newInNo="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String inNoCondition = "R"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(in_no_) as inNo from tbih11 where in_no_ like '%"+inNoCondition+"%' for update ";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("inNo")==null){
				newInNo = "R"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd")+"001");
			}else{
				String inNoMax = AppUtils.toValidString(ihCommMap.get("inNo")).substring(("R"+compId.toUpperCase()).length());
				newInNo = "R"+compId.toUpperCase()+AppUtils.toValidString(NumberUtils.toLong(inNoMax)+1);
			}
		} 
		return newInNo;
	}
	
	//出库单号
	public String getOutNo(Map<String, Object> parameter) throws Exception {
		String newOutNo="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String outNoCondition = "C"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(out_no_) as outNo from tbih19 where out_no_ like '%"+outNoCondition+"%' for update;";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("outNo")==null){
				newOutNo = "C"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd")+"001");
			}else{	
				String outNoMax = AppUtils.toValidString(ihCommMap.get("outNo"));
				if(outNoMax.endsWith("X")){
					outNoMax=outNoMax.substring(("C"+compId.toUpperCase()).length(),outNoMax.length()-1);
				}else{
					outNoMax=outNoMax.substring(("C"+compId.toUpperCase()).length());
				}
				newOutNo = "C"+compId.toUpperCase()+AppUtils.toValidString(NumberUtils.toLong(outNoMax)+1);
			}
		} 
		return newOutNo;
	}
	
	//结算单号
	public String getSettleNo(Map<String, Object> parameter) throws Exception {
		String newSettleNo="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String settleNoCondition = "S"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(settle_no_) as settleNo from tbih40 where settle_no_ like '%"+settleNoCondition+"%' for update;";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("settleNo")==null){
				newSettleNo = "S"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd")+"001");
			}else{
				String settleNoMax = AppUtils.toValidString(ihCommMap.get("settleNo")).substring(("S"+compId.toUpperCase()).length());
				newSettleNo = "S"+compId.toUpperCase()+AppUtils.toValidString(NumberUtils.toLong(settleNoMax)+1);
			}
		} 
		return newSettleNo;
	}
	
	//标签号
	public String getLabelNo(Map<String, Object> parameter) throws Exception {
		String newLabelNo="";
		String compId=AppUtils.toValidString(parameter.get("compId"));
		String labelNoCondition = "L"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd"));
		String sql = "select max(label_no_) as labelNo from tbih11 where label_no_ like '%"+labelNoCondition+"%' for update;";
		List<Map<String,Object>> ihCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(ihCommList)){
			Map<String,Object> ihCommMap = (Map<String,Object>)ihCommList.get(0);
			if(ihCommMap.get("labelNo")==null){
				newLabelNo = "L"+compId.toUpperCase()+(DateFormatUtils.format(new Date(), "yyMMdd")+"0001");
			}else{
				String labelNoMax = AppUtils.toValidString(ihCommMap.get("labelNo")).substring(("L"+compId.toUpperCase()).length());
				newLabelNo = "L"+compId.toUpperCase()+AppUtils.toValidString(NumberUtils.toLong(labelNoMax)+1);
			}
		} 
		return newLabelNo;
	}
		
	
	//备份存货表Tbih30的数据到Tbih31中，记录变更操作和原因
	public void saveTbih31(Map<String,Object> param) throws Exception {
			Tbih30 ih30 = (Tbih30) param.get("ih30");
			String appId = (String) param.get("appId");
			String appidAction = (String) param.get("appidAction");
			String changeNo = (String) param.get("changeNo");
			String changeReason = (String) param.get("changeReason");
			String compId = AppUtils.getCompId();
			Tbih31 ih31 = new Tbih31();
			// 将ih20中与ih21中相对应的字段赋值给ih21
			AppUtils.copyProperties(ih30, ih31);
			ih31.setIh31Id(AppUtils.generateUniqueKey());
			ih31.setCompId(compId);
			ih31.setAppid(appId);
			ih31.setAppidAction(appidAction);
			ih31.setChangeNo(changeNo);	
			ih31.setChangeReason(changeReason);
			ih31.setCreateDate(AppUtils.getCurrentDate());
			ih31.setCreateEmp(AppUtils.getUserName());
			ihjc01Dao.save(ih31);// 　 保存新增的ih31;
	}
	
	/**
	 * 获取"货品"至当前(如果已出库,则为出库时间)的间隔天数(库龄)
	 * @param sh63
	 * @param ih30
	 * @throws ParseException
	 */
	public Long getBetweenDay(Tbih30 ih30) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		//TODO 对于人工输入的，目前直接跳过
		if (ih30.getInDate() == null && ih30.getJfr()==null){
			return Long.valueOf(0);
		}
		Date dateJFR = new Date();
		//有计费时间的以计费时间为准，没有计费时间的以入库时间为准
		if(StringHelper.isNotEmpty(ih30.getJfr())){
			dateJFR = df.parse(ih30.getJfr());//计费日
		}else{
			dateJFR = df.parse(ih30.getInDate().substring(0, 8));//计费日 - 来自"入库时间"
		}
		Date dateNow = AppUtils.getCurrentDate();//来自”入库时间“
		if(StringHelper.isNotEmpty(ih30.getOutDate())){
		    dateNow =df.parse(ih30.getOutDate().substring(0, 8));//来自”入库时间“
		}
		Long ts=(long) 0;
		List<Tbih16> listIh16=this.query(" from "+Tbih16.class.getName()+ " where deliveryNo = '"+ih30.getDeliveryNo()+"' and compId = '"+ih30.getCompId()+"'");
		if(!CollectionUtils.isEmpty(listIh16)&&listIh16.get(0)!=null){
			Tbih16 ih16=listIh16.get(0);
			if(StringHelper.isNotEmpty(ih16.getSettleType())&&ih16.getSettleType().equals("RJ")){
				if(StringHelper.isNotEmpty(ih16.getDeliveryDate())&& StringHelper.isNotEmpty(ih16.getStatus())&&ih16.getStatus().compareTo("01")>=0){
					dateNow=df.parse(ih16.getDeliveryDate());
					ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
				}else{
					ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
					ts=ts-Long.valueOf(AppUtils.getBigDecimal(listIh16.get(0).getThkxr()).toString());
				}
			}else{
				dateNow=df.parse(ih16.getDeliveryDate());
				ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
			}
			
			this.getSession().evict(listIh16.get(0));
		}else{
			ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
		}
		ts=ts>=0?ts:0;
		return ts+1;//间隔天
	}
	
	//获取仓库类别(SN室内/SW室外)
	public String getKB(Tbih30 ih30) {
		String kb = "";
		Map<String,Object> mapOut = new HashMap<String,Object> ();
		mapOut.put("qwCode", ih30.getWareQwCode());
		mapOut.put("compId", ih30.getCompId());
		List<Tbih01> listIh01 = ihjc01Dao.queryList(mapOut);
		if(CollectionUtils.isNotEmpty(listIh01)&&listIh01.get(0)!=null){
			kb = listIh01.get(0).getKb();
		}

		return kb;
	}
	
	//计算费用的公用方法
	public List<Map<String,Object>> getSumPrice(Map<String,Object> paraMap) throws Exception {
		List<Map<String,Object>> ListMapOut= new ArrayList<Map<String,Object>>();
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih21b.class.getName()+ " where 1=1 ";
		if(paraMap!=null&&paraMap.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paraMap.get("custNo"));
		}
		if(paraMap!=null&&paraMap.get("custName")!=null){
			hql +=" and custName like :custName ";
			param.put("custName", "%"+paraMap.get("custName")+"%");
		}
		if(paraMap!=null&&paraMap.get("contNo")!=null){
			hql +=" and contNo= :contNo ";
			param.put("contNo", paraMap.get("contNo"));
		}
		if(paraMap!=null&&StringHelper.isNotEmpty(AppUtils.toValidString(paraMap.get("sno")))){
			hql +=" and sno= :sno ";
			param.put("sno", paraMap.get("sno"));
		}else{
//			if(paraMap!=null&&paraMap.get("tranType")!=null){
//				hql +=" and tranType= :tranType ";
//				param.put("tranType",paraMap.get("tranType"));
//			}
			if(paraMap!=null&&paraMap.get("kb")!=null){
				hql +=" and kb= :kb ";
				param.put("kb", paraMap.get("kb"));
			}
			if(paraMap!=null&&paraMap.get("settleType")!=null){
				hql +=" and settleType= :settleType ";
				param.put("settleType", paraMap.get("settleType"));
			}
//			if(paraMap!=null&&paraMap.get("prodType")!=null){
//				hql +=" and prodType= :prodType ";
//				param.put("prodType", paraMap.get("prodType"));
//			}
//			if(paraMap!=null&&paraMap.get("prodTypeName")!=null){
//				hql +=" and prodTypeName= :prodTypeName ";
//				param.put("prodTypeName", paraMap.get("prodTypeName"));
//			}
//			if(paraMap!=null&&paraMap.get("productNo")!=null){
//				hql +=" and productNo= :productNo ";
//				param.put("productNo", paraMap.get("productNo"));
//			}
			if(paraMap!=null&&paraMap.get("ts")!=null){
				hql +=" and startDate <= :ts ";
				param.put("ts", paraMap.get("ts"));
			}
			if(paraMap!=null&&paraMap.get("ts")!=null){
				hql +=" and endDate >= :ts ";
				param.put("ts", paraMap.get("ts"));
			}
			if(paraMap!=null&&paraMap.get("productName")!=null){
				hql +=" and productName= :productName ";
				param.put("productName", paraMap.get("productName"));
			}
			
		}
		List<Tbih21b> listIh21b = this.query(hql,param);
		BigDecimal wgt = AppUtils.getBigDecimal(paraMap.get("wgt"));
		BigDecimal ts = AppUtils.getBigDecimal(paraMap.get("ts"));
		BigDecimal overduePrice = BigDecimal.ZERO;
		String tranType = AppUtils.toValidString(paraMap.get("tranType"));
		for(Tbih21b ih21b:listIh21b){
			Map<String,Object> mapOut = new HashMap<String,Object>();
//			AppUtils.copyProperties(ih21b, mapOut);
			mapOut.put("prodType", ih21b.getProdType());
			mapOut.put("prodTypeName", ih21b.getProdTypeName());
			mapOut.put("productNo", ih21b.getProductNo());
			mapOut.put("productName", ih21b.getProductName());
			
			//协议价
			mapOut.put("price", ih21b.getPrice());
			mapOut.put("totalAmt", ih21b.getPrice().multiply(wgt));
			//仓储费
			if(StringHelper.isNotEmpty(ih21b.getIsStorage())&&ih21b.getIsStorage().equals("Y")){
				mapOut.put("storagePrice", ih21b.getStoragePrice());
				mapOut.put("storageAmt", ih21b.getStoragePrice().multiply(wgt));
			}
			
			//吊装价格
			if(StringHelper.isNotEmpty(ih21b.getIsLifting())&&ih21b.getIsLifting().equals("Y")){
				mapOut.put("liftingPrice", ih21b.getLiftingPrice());
				mapOut.put("liftingAmt", ih21b.getLiftingPrice().multiply(wgt));
			}
			//保险价格
			if(StringHelper.isNotEmpty(ih21b.getIsPremiums())&&ih21b.getIsPremiums().equals("Y")){
				mapOut.put("premiumsPrice", ih21b.getPremiumsPrice());
				mapOut.put("premiumsAmt", ih21b.getPremiumsPrice().multiply(wgt));
			}
			//特殊加收费用单价
//			if(StringHelper.isNotEmpty(ih21b.getIsOrder())&&ih21b.getIsOrder().equals("Y")){
//				mapOut.put("orderPrice", ih21b.getOrderPrice());
//				mapOut.put("orderAmt", ih21b.getOrderPrice().multiply(wgt));
//			}
			//超期价
			if(StringHelper.isNotEmpty(ih21b.getIsOverdue())&&"Y".equals(ih21b.getIsOverdue())){
				//根据超期费的价格定义计算超期费
				overduePrice=AppUtils.getBigDecimal(ih21b.getOverdueStdPrice()).add(AppUtils.getBigDecimal(ih21b.getOverduePrice()));
				mapOut.put("overduePrice",overduePrice);
				mapOut.put("overdueAmt", overduePrice.multiply(wgt));
				
//				Map<String,Object> paramIh03a = new HashMap<String,Object>();
//				AppUtils.copyProperties(ih21b, paramIh03a);
//				paramIh03a.put("ts", ts);
//				List<Tbih03a> listIh03a = ihjc03aDao.queryList(paramIh03a);
//				if(listIh03a.size()==1){//找到唯一的一条价格记录
//					Tbih03a ih03a=listIh03a.get(0);
//					//超期单价=超期基价+超期单价
//					BigDecimal overduePrice=AppUtils.getBigDecimal(ih03a.getOverdueStdPrice()).add(AppUtils.getBigDecimal(ih03a.getOverduePrice()));
//					mapOut.put("overduePrice",overduePrice);
//					mapOut.put("overdueAmt", overduePrice.multiply(wgt));
//				}else{
//					mapOut.put("overduePrice",BigDecimal.ZERO);
//					mapOut.put("overdueAmt", BigDecimal.ZERO);
//				}
			}else{
				mapOut.put("overduePrice",BigDecimal.ZERO);
				mapOut.put("overdueAmt", BigDecimal.ZERO);
			}
			
			//优惠单价
			if(StringHelper.isNotEmpty(ih21b.getIsDiscount())&&"Y".equals(ih21b.getIsDiscount())){
				//根据存储周期天数计算优惠价格
				Map<String,Object> paramIh03c = new HashMap<String,Object>();
				paramIh03c.put("custNo", ih21b.getCustNo());
				paramIh03c.put("custName", ih21b.getCustName());
				paramIh03c.put("contNo", ih21b.getContNo());
				paramIh03c.put("tranType", tranType);
				paramIh03c.put("ts", ts);
				List<Tbih03c> listIh03c = ihjc03cDao.queryList(paramIh03c);
				BigDecimal discountPrice=BigDecimal.ZERO;
				if(listIh03c.size()==1){//找到唯一的一条价格记录
					Tbih03c ih03c=listIh03c.get(0);
					//超期单价=超期基价+超期单价
					discountPrice=ih03c.getDiscountPrice();
				}
				
				//根据合同量计算优惠价格
				paramIh03c.put("tranType", null);
				if(ih21b.getContWgt()!=null){
					paramIh03c.put("contWgt", ih21b.getContWgt());
					listIh03c = ihjc03cDao.queryList(paramIh03c);
					if(listIh03c.size()==1){//找到唯一的一条价格记录
						Tbih03c ih03c=listIh03c.get(0);
						//超期单价=超期基价+超期单价
						discountPrice=discountPrice.add(AppUtils.getBigDecimal(ih03c.getDiscountPrice()));
					}
				}
				
				mapOut.put("discountPrice",discountPrice);
				mapOut.put("discountAmt", discountPrice.multiply(wgt));
			}else{
				mapOut.put("discountPrice",BigDecimal.ZERO);
				mapOut.put("discountAmt", BigDecimal.ZERO);
			}
			
			//加班单价
			if(StringHelper.isNotEmpty(ih21b.getIsOrder())&&"Y".equals(ih21b.getIsOrder())){
				//根据委托函日期判断是否在加班设定日期中
				Map<String,Object> paramIh03e= new HashMap<String,Object>();
				paramIh03e.put("date", paraMap.get("deliveryDate"));
//				paramIh03e.put("state", "01");
				List<Tbih03e> listIh03e = ihjc03eDao.queryList(paramIh03e);
				BigDecimal orderPrice=BigDecimal.ZERO;
				if(listIh03e.size()==1){//找到唯一的一条价格记录
					Tbih03e ih03e=listIh03e.get(0);
					//加班单价
					orderPrice=ih03e.getAddMoney();
				}
				
				//根据委托函日期判断是否在加班设定日期中
				Map<String,Object> paramIh03f= new HashMap<String,Object>();
				paramIh03f.put("time", paraMap.get("deliveryTime"));
				paramIh03f.put("date", paraMap.get("deliveryDate"));
//				paramIh03e.put("state", "01");
				List<Tbih03f> listIh03f = ihjc03fDao.queryList(paramIh03f);
				if(listIh03f.size()==1){//找到唯一的一条价格记录
					Tbih03f ih03f=listIh03f.get(0);
					//时间加班费和日期加班费取都收取时，取费用高的那个
					if(orderPrice.compareTo(BigDecimal.ZERO)==0){
						orderPrice = ih03f.getAddMoney();
					}else{
						orderPrice = orderPrice.compareTo(ih03f.getAddMoney())>=0?orderPrice:ih03f.getAddMoney();
					}
				}
				mapOut.put("orderPrice",orderPrice);
				mapOut.put("orderAmt", orderPrice.multiply(wgt));
			}
			ListMapOut.add(mapOut);
		}
		return ListMapOut;
	}
		
		
}

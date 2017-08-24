package com.jghz.ih.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import com.base.exception.AppException;
import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc03aDao;
import com.jghz.ih.dao.Ihjc16Dao;
import com.jghz.ih.dao.Ihjc16aDao;
import com.jghz.ih.dao.Ihjc16bDao;
import com.jghz.ih.dao.Ihjc21bDao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih16;
import com.jghz.ih.entity.Tbih16a;
import com.jghz.ih.entity.Tbih16b;
import com.jghz.ih.entity.Tbih21b;
import com.jghz.ih.entity.Tbih30;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih16对象信息的保存操作
 */
@Transactional
@Component("ihjc16Service")
public class Ihjc16Service {
	@Resource
	private Ihjc16Dao ihjc16Dao;
	
	@Resource
	private Ihjc16aDao ihjc16aDao;
	
	@Resource
	private Ihjc16bDao ihjc16bDao;
	
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	@Resource
	private Ihjc21bDao ihjc21bDao;
	
	@Resource
	private Ihjc03aDao ihjc03aDao;
	
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	@DataProvider
	public void loadTbih16(Page<Tbih16> page, Map<String, Object> parameter) throws Exception{
		
		ihjc16Dao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih16a(Page<Tbih16a> page, Map<String, Object> parameter) throws Exception{
		
		ihjc16aDao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih16b(Page<Tbih16b> page, Map<String, Object> parameter) throws Exception{
		if(parameter==null){		
			parameter=new HashMap<String, Object>();
		}
		parameter.put("flag", "IH16");
		ihjc16bDao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public Collection<Map<String,Object>> loadOrderItem(Map<String, Object> parameter) throws Exception{
		List<Map<String,Object>> list =new ArrayList<Map<String,Object>>();
		if(parameter==null){		
			parameter=new HashMap<String, Object>();
		}
		parameter.put("flag", "IH16");
		List<Tbih16b> listIh16b=ihjc16bDao.queryList(parameter);
		for(Tbih16b ih16b:listIh16b){
			Map<String,Object> map = new HashMap<String,Object>();
			AppUtils.copyProperties(ih16b, map);
			map.putAll(parameter);
			List<Tbih16a> listIh16a = ihjc16aDao.queryList(map);
			if(CollectionUtils.isNotEmpty(listIh16a)&&listIh16a.get(0)!=null){
				map.put("bcKdl", listIh16a.get(0).getBcKdl());
				map.put("bcKdlNum", listIh16a.get(0).getBcKdlNum());
			}
			list.add(map);
		}
		return list;
	}
	
	@DataProvider
	public Collection<Tbih30> loadTbih30(Map<String, Object> parameter) throws Exception{
		List<Tbih30> listIh30 = new ArrayList<Tbih30>();
		listIh30=ihjc30Dao.queryListLading(parameter);
		return listIh30;
	}
	
	@DataResolver
	public Properties saveTbih16(Collection<Tbih16> datas,Collection<Tbih16a> datasIh16a) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		Map<String,Object> parameter = new HashMap<String,Object>();
		String deliveryNo = "";
		String ih16Id = "";
		String status = "";
		
			for (Tbih16 ih16 : datas) {
				EntityState state = EntityUtils.getState(ih16);
				if (state.equals(EntityState.NEW)) {
					ih16Id = AppUtils.generateUniqueKey();
					ih16.setIh16Id(ih16Id);
					ih16.setCompId(AppUtils.getCompId());
					parameter.put("compId", ih16.getCompId());
					deliveryNo = ihjcComm01Dao.getLaddingNo(parameter);
					ih16.setDeliveryNo(deliveryNo);
					ih16.setStatus("00");
					status="00";
					ihjc16Dao.save(ih16);
				}
				if (state.equals(EntityState.MODIFIED)) {
					status = ih16.getStatus();
					ih16Id = ih16.getIh16Id(); 
					deliveryNo = ih16.getDeliveryNo();
					if(!"00".equals(ih16.getStatus())){
						throw new RuntimeException("提单状态不是初始状态，不能修改");
					}
					ihjc16Dao.update(ih16);
				}
				if (state.equals(EntityState.DELETED)) {
					status = ih16.getStatus();
					ih16Id = ih16.getIh16Id();
					
					if(StringHelper.isNotEmpty(ih16.getStatus())&& !"00".equals(ih16.getStatus())){
						throw new RuntimeException("提单状态不是初始状态，不能删除");
					}
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih16Id", ih16.getIh16Id());
					List<Tbih16a> listIh16a = ihjc16aDao.queryList(mapParam);
					for(Tbih16a ih16a:listIh16a){
						ihjc16Dao.delete(ih16a);
					}
					ihjc16Dao.delete(ih16);
				}
			}

			for (Tbih16a ih16a : datasIh16a) {
				EntityState state = EntityUtils.getState(ih16a);
				if (state.equals(EntityState.NEW)) {
					ih16a.setIh16aId(AppUtils.generateUniqueKey());
					ih16a.setIh16Id(ih16Id);
					ih16a.setCompId(AppUtils.getCompId());
					ih16a.setDeliveryNo(deliveryNo);
					ih16a.setSfxzztxc("Y");
					ihjc16Dao.save(ih16a);
				}
				if (state.equals(EntityState.MODIFIED)) {
					if(!"00".equals(status)){
						throw new RuntimeException( "提单状态不是初始状态，不能修改");
					}
					ihjc16Dao.update(ih16a);
				}
			}
		prop.put("flag", flag);
		return prop;
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public Properties saveTbih16Submit(Map<String,Object> parameters) throws Exception {
		Tbih16 tbih16 = (Tbih16) parameters.get("Ih16");
		String status = (String) parameters.get("status");
		Properties prop = new Properties();
		boolean flag = true;
		
			final String Ih16Id = tbih16.getIh16Id();
			Tbih16 ih16=ihjc16Dao.queryList(new HashMap(){{put("ih16Id",Ih16Id);}}).get(0);
			if(StringHelper.isNotEmpty(ih16.getStatus())&&status.equals(ih16.getStatus())){
				throw new AppException("委托函"+ih16.getDeliveryNo()+"已审核，不能重复操作");
			}
			ih16.setJkqrtjZfy(BigDecimal.ZERO);
			
			BigDecimal wgt=new BigDecimal("0");
			BigDecimal price=new BigDecimal("0");//基本单价
			BigDecimal Dprice=new BigDecimal("0");//单价最低的单价
			BigDecimal overdueAmt=new BigDecimal("0");//超期费
			BigDecimal totalAmt=new BigDecimal("0");
			String kb = null;//库别
			List<Tbih16a> listIh16a = ihjc16aDao.queryList(new HashMap(){{put("ih16Id",Ih16Id);}});
			if(CollectionUtils.isEmpty(listIh16a)){
				throw new RuntimeException("请先增加提单明细");
			}
			for(Tbih16a ih16a:listIh16a){
				BigDecimal priceIh16a=AppUtils.getBigDecimal(ih16a.getContPrice());//单价
				BigDecimal totalAmtIh16a=AppUtils.getBigDecimal(ih16a.getTotalAmt());//金额
				//获取协议中价格定义的价格
				Map<String,Object> paramIh21b = new HashMap<String,Object>();
				AppUtils.copyProperties(ih16, paramIh21b);
				AppUtils.copyProperties(ih16a, paramIh21b);
				paramIh21b.put("deliveryDate", ih16.getDeliveryDate().substring(0, 8));
				paramIh21b.put("deliveryTime", ih16.getDeliveryDate().substring(9, 17));
				List<Tbih30> listIh30 = new ArrayList<Tbih30>();
				if("Y".equals(ih16a.getSfxzztxc())){
					wgt=wgt.add(ih16a.getBcKdl());
					Map<String,Object> paramIh30 = new HashMap<String,Object>();
					paramIh30.put("sfxzztxc", ih16a.getSfxzztxc());
					paramIh30.put("custNo", ih16.getCustNo());
					paramIh30.put("custName", ih16.getCustName());
					paramIh30.put("contNo", ih16.getContNo());
					paramIh30.put("orderItem", ih16a.getOrderItem());
					paramIh30.put("prodType", ih16a.getProdType());
					paramIh30.put("prodTypeName", ih16a.getProdTypeName());
					paramIh30.put("productNo", ih16a.getProductNo());
					paramIh30.put("productName", ih16a.getProductName());
					Long ts=0l;
					listIh30 = ihjc30Dao.queryListPH(paramIh30);
					if(CollectionUtils.isNotEmpty(listIh30)&&listIh30.get(0)!=null){
						Tbih30 ih30=listIh30.get(0);
						ts=ihjcComm01Dao.getBetweenDay(ih30);
						kb = ihjcComm01Dao.getKB(ih30);
						ih16a.setWareQwCode(ih30.getWareQwCode());
						ih16a.setTs(ts.toString());
					}
					paramIh21b.put("wgt", ih16a.getBcKdl());
					paramIh21b.put("ts", BigDecimal.valueOf(ts));
					paramIh21b.put("kb", kb);
					//如果填了缴款确认总金额，以输入的总金额为准
					if(AppUtils.getBigDecimal(ih16.getJkqrtjZfy()).compareTo(BigDecimal.ZERO)>0){
						totalAmt = ih16.getJkqrtjZfy();
					}else{
						//如果没有选择价格定义，只输入单价，以输入的单价为准
						if(StringHelper.isEmpty(ih16.getSno())&&AppUtils.getBigDecimal(ih16.getContPrice()).compareTo(BigDecimal.ZERO)>0){
							totalAmt = totalAmt.add(AppUtils.getBigDecimal(ih16.getContPrice()).multiply(ih16a.getBcKdl()));
						}else{
							//如果Tbih16a委托函明细档中直接录入了金额，以录入的为准
							if(AppUtils.getBigDecimal(totalAmtIh16a).compareTo(BigDecimal.ZERO)>0){
								totalAmt = totalAmt.add(totalAmtIh16a);
								ih16a.setTotalAmt(totalAmtIh16a);
							}else if(AppUtils.getBigDecimal(priceIh16a).compareTo(BigDecimal.ZERO)>0 &&
									AppUtils.getBigDecimal(totalAmtIh16a).compareTo(BigDecimal.ZERO)==0){
								totalAmtIh16a = priceIh16a.multiply(ih16a.getBcKdl());
								totalAmt = totalAmt.add(totalAmtIh16a);
								ih16a.setTotalAmt(totalAmtIh16a);
							}else{
								List<Map<String,Object>> listIh21b = ihjcComm01Dao.getSumPrice(paramIh21b);
								if(listIh21b.size()>=1){
									if(listIh21b.size()==1){//找到唯一的一条价格记录
										Map<String,Object> ih21bMap=listIh21b.get(0);	
										price=AppUtils.getBigDecimal(ih21bMap.get("price"));
										priceIh16a = price;
										overdueAmt=overdueAmt.add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt")));
										totalAmt=totalAmt.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
										totalAmtIh16a = totalAmtIh16a.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
										priceIh16a = totalAmtIh16a.divide(ih16a.getBcKdl(),2,RoundingMode.HALF_UP);
										if(Dprice.compareTo(new BigDecimal("0"))==0){
											Dprice=price;
										}else{
											Dprice=Dprice.compareTo(price)>=0?price:Dprice;
										}
									}else{
										for(Map<String,Object> ih21bMap:listIh21b){//找到多个品种对应的不同价格
											if((StringHelper.isNotEmpty(ih16a.getProductNo())&&ih16a.getProductNo().equals(AppUtils.toValidString(ih21bMap.get("productNo"))))||
											(StringHelper.isNotEmpty(ih16a.getProductName())&&ih16a.getProductName().equals(AppUtils.toValidString(ih21bMap.get("productName"))))||
											(StringHelper.isNotEmpty(ih16a.getProdType())&&ih16a.getProdType().equals(AppUtils.toValidString(ih21bMap.get("prodType"))))||
											(StringHelper.isNotEmpty(ih16a.getProdTypeName())&&ih16a.getProdTypeName().equals(AppUtils.toValidString(ih21bMap.get("prodTypeName"))))){
												price=AppUtils.getBigDecimal(ih21bMap.get("price"));
												priceIh16a = price;
												overdueAmt=overdueAmt.add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt")));
												totalAmt=totalAmt.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
												totalAmtIh16a = totalAmtIh16a.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
												priceIh16a = totalAmtIh16a.divide(ih16a.getBcKdl(),2,RoundingMode.HALF_UP);
												if(Dprice.compareTo(new BigDecimal("0"))==0){
													Dprice=price;
												}else{
													Dprice=Dprice.compareTo(price)>=0?price:Dprice;
												}
											}
										}
									}
									
								}else{
									throw new RuntimeException("没有找到对应的价格定义");
								}
							}
						}
						
					}
					
				}else if("N".equals(ih16a.getSfxzztxc())){
					Map<String,Object> paramIh30 = new HashMap<String,Object>();
					paramIh30.put("custNo", ih16.getCustNo());
					paramIh30.put("custName", ih16.getCustName());
					paramIh30.put("contNo", ih16.getContNo());
					paramIh30.put("ladingNo", ih16.getLadingNo());
					paramIh30.put("labelNo", ih16a.getLabelNo());
					listIh30 = ihjc30Dao.queryListPH(paramIh30);
					for(Tbih30 ih30:listIh30){
						wgt=wgt.add(ih30.getWgt());
						AppUtils.copyProperties(ih30, paramIh21b);
						AppUtils.copyProperties(ih16, paramIh21b);
						Long ts=ihjcComm01Dao.getBetweenDay(ih30);
						kb = ihjcComm01Dao.getKB(ih30);
						paramIh21b.put("ts", BigDecimal.valueOf(ts));
						paramIh21b.put("kb", kb);
						//如果填了缴款确认总金额，以输入的总金额为准
						if(AppUtils.getBigDecimal(ih16.getJkqrtjZfy()).compareTo(BigDecimal.ZERO)>0){
							totalAmt = ih16.getJkqrtjZfy();
						}else{
							//如果没有选择价格定义，只输入单价，以输入的单价为准
							if(StringHelper.isEmpty(ih16.getSno())&&AppUtils.getBigDecimal(ih16.getContPrice()).compareTo(BigDecimal.ZERO)>0){
								totalAmt = totalAmt.add(AppUtils.getBigDecimal(ih16.getContPrice()).multiply(ih30.getWgt()));
								totalAmtIh16a =totalAmtIh16a.add(AppUtils.getBigDecimal(ih16.getContPrice()).multiply(ih30.getWgt()));
							}else{
								//如果Tbih16a委托函明细档中直接录入了金额，以录入的为准
								if(AppUtils.getBigDecimal(totalAmtIh16a).compareTo(BigDecimal.ZERO)>0){
									totalAmt = totalAmt.add(totalAmtIh16a);
								}else if(AppUtils.getBigDecimal(priceIh16a).compareTo(BigDecimal.ZERO)>0 &&
										AppUtils.getBigDecimal(totalAmtIh16a).compareTo(BigDecimal.ZERO)==0){
									totalAmtIh16a = priceIh16a.multiply(ih30.getWgt());
									totalAmt = totalAmt.add(totalAmtIh16a);
								}else{
									List<Map<String,Object>> listIh21b = ihjcComm01Dao.getSumPrice(paramIh21b);
									if(listIh21b.size()>=1){
										if(listIh21b.size()==1){//找到唯一的一条价格记录
											Map<String,Object> ih21bMap=listIh21b.get(0);
											price=AppUtils.getBigDecimal(ih21bMap.get("price"));
											priceIh16a= price;
											overdueAmt=overdueAmt.add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt")));
											totalAmt=totalAmt.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
											totalAmtIh16a = totalAmtIh16a.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
											priceIh16a = totalAmtIh16a.divide(ih30.getWgt(),2,RoundingMode.HALF_UP);
											if(Dprice.compareTo(new BigDecimal("0"))==0){
												Dprice=price;
											}else{
												Dprice=Dprice.compareTo(price)>=0?price:Dprice;
											}	
										}else{
											for(Map<String,Object> ih21bMap:listIh21b){//找到多个品种对应的不同价格
												if((StringHelper.isNotEmpty(ih30.getProductNo())&&ih30.getProductNo().equals(AppUtils.toValidString(ih21bMap.get("productNo"))))||
												(StringHelper.isNotEmpty(ih30.getProductName())&&ih30.getProductName().equals(AppUtils.toValidString(ih21bMap.get("productName"))))||
												(StringHelper.isNotEmpty(ih30.getProdType())&&ih30.getProdType().equals(AppUtils.toValidString(ih21bMap.get("prodType"))))||
												(StringHelper.isNotEmpty(ih30.getProdTypeName())&&ih30.getProdTypeName().equals(AppUtils.toValidString(ih21bMap.get("prodTypeName")))))
												{
													price=AppUtils.getBigDecimal(ih21bMap.get("price"));
													priceIh16a= price;
													overdueAmt=overdueAmt.add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt")));
													totalAmt=totalAmt.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
													totalAmtIh16a = totalAmtIh16a.add(AppUtils.getBigDecimal(ih21bMap.get("totalAmt")).add(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"))));
													priceIh16a = totalAmtIh16a.divide(ih30.getWgt(),2,RoundingMode.HALF_UP);
													if(Dprice.compareTo(new BigDecimal("0"))==0){
														Dprice=price;
													}else{
														Dprice=Dprice.compareTo(price)>=0?price:Dprice;
													}
													
												}
											}
											if(totalAmt.compareTo(BigDecimal.ZERO)==0){
												throw new RuntimeException("没有产品大类"+ih30.getProdTypeName()+"或产品"+ih30.getProductName()+"找到对应的价格定义");
											}
										}
									}else{
										throw new RuntimeException("没有找到对应的价格定义");
									}
								}			
							}
						}
						
						if(StringHelper.isEmpty(ih30.getLadingNo())){
							ih30.setLadingNo(ih16.getLadingNo());
							ihjc16Dao.update(ih30);
							
							Map<String,Object> param = new HashMap<String,Object>();
							param.put("ih30", ih30);
							param.put("appId", "ihjc16Service");
							param.put("appidAction", "Update");
							param.put("changeNo", "委托函明细按标签号新增");
							ihjcComm01Dao.saveTbih31(param);
						}
					}
				}
				ih16a.setContPrice(priceIh16a);	
				ih16a.setTotalAmt(totalAmtIh16a);	
				ihjc16Dao.update(ih16a);
			
				//更新南钢提单中实提量和未提量
				Map<String,Object> paramIh16b = new HashMap<String,Object>();
				AppUtils.copyProperties(ih16a, paramIh16b);
				List<Tbih16b> listIh16b  = ihjc16bDao.queryList(paramIh16b);
				if(CollectionUtils.isNotEmpty(listIh16b)&&listIh16b.get(0)!=null){
					Tbih16b ih16b = listIh16b.get(0);
					ih16b.setStl(ih16b.getStl().add(ih16a.getBcKdl()));
					ih16b.setWtl(ih16b.getWtl().subtract(ih16a.getBcKdl()));
					if(ih16b.getLadingWgt().compareTo(ih16b.getStl())<0){
						throw new RuntimeException("提单号"+ih16b.getLadingNo()+"实提量"+ih16b.getStl()+"大于提单总量"+ih16b.getLadingWgt());
					}
					ihjc16Dao.update(ih16b);
					ihjc16Dao.getSession().flush();
					
					
					if(StringHelper.isNotEmpty(ih16b.getLadingNoF())){
						Map<String,Object> paramIh16bF = new HashMap<String,Object>();
						paramIh16bF.put("ladingNo", ih16b.getLadingNoF());
						paramIh16bF.put("compId", ih16b.getCompId());
						List<Tbih16b> listIh16bF  = ihjc16bDao.queryList(paramIh16bF);
						if(CollectionUtils.isNotEmpty(listIh16bF)&&listIh16bF.get(0)!=null){
							Tbih16b ih16bF = listIh16bF.get(0);
							ih16bF.setStl(ih16bF.getStl().add(ih16a.getBcKdl()));
							ih16bF.setWtl(ih16bF.getWtl().subtract(ih16a.getBcKdl()));
							ihjc16Dao.update(ih16bF);
						}
					}
					ihjc16Dao.getSession().evict(ih16b);
				}
			}
			BigDecimal xs=(wgt.setScale(0, RoundingMode.UP)).subtract(wgt);
			//小数点进位计算金额=小数点后的数量*单价
//			if(xs.compareTo(BigDecimal.ZERO)>=0){
//				totalAmt=totalAmt.add(xs.multiply(Dprice));
//			}
			
			ih16.setOverdueAmt(overdueAmt);
			ih16.setJkqrtjZfy(totalAmt.setScale(0, RoundingMode.UP));
			if(StringHelper.isEmpty(ih16.getLadingEmp())){
				ih16.setLadingEmp(AppUtils.getUserInfo().getCname());
			}
			ih16.setStatus(status);//确认提交
			ihjc16Dao.update(ih16);
			ihjc16Dao.getSession().flush();
		prop.put("flag", flag);
		return prop;
		
	}
	@SuppressWarnings("unchecked")
	@Expose
	public void saveTbih16a(Map<String,Object> parameter) throws Exception {
			Collection<Map<String,Object>> dataOrderItems = (Collection<Map<String, Object>>) parameter.get("dataOrderItems");
			Collection<Tbih30> ListIh30 = (Collection<Tbih30>) parameter.get("ListIh30");
			String deliveryNo = (String) parameter.get("deliveryNo");
			final String ih16Id = (String) parameter.get("ih16Id");
			Tbih16 ih16=ihjc16Dao.queryList(new HashMap(){{put("ih16Id",ih16Id);}}).get(0);
			String sfxzztxc = (String) parameter.get("sfxzztxc");
			//整体项次(品种、产品)新增
			if("Y".equals(sfxzztxc)){
				for (Map<String,Object> mapOrderItem : dataOrderItems) {
					AppUtils.copyProperties(parameter, mapOrderItem);
					List<Tbih16a> listIh16a = ihjc16aDao.queryList(mapOrderItem);
					if(!CollectionUtils.isEmpty(listIh16a)&&listIh16a.get(0)!=null){
						Tbih16a ih16a = listIh16a.get(0);
						ih16a.setKdl(ih16a.getKdl().add(AppUtils.getBigDecimal(mapOrderItem.get("kdl"))));
						ihjc16Dao.update(ih16a);
					}else{
						Tbih16a ih16aNew = new Tbih16a();
						AppUtils.copyProperties(mapOrderItem, ih16aNew);
						ih16aNew.setIh16aId(AppUtils.generateUniqueKey());
						ih16aNew.setCompId(AppUtils.getCompId());
						ih16aNew.setDeliveryNo(deliveryNo);
						ih16aNew.setIh16Id(ih16Id);
						ih16aNew.setSfxzztxc(sfxzztxc);
						ihjc16Dao.save(ih16aNew);
					}
					
				}
			}else{//标签号(明细)新增
				for (Tbih30 ih30 : ListIh30) {
					Map<String,Object> param = new HashMap<String,Object>();
					AppUtils.copyProperties(ih30, param);
					AppUtils.copyProperties(parameter, param);
					List<Tbih16a> listIh16a = ihjc16aDao.queryList(param);
					if(!CollectionUtils.isEmpty(listIh16a)&&listIh16a.get(0)!=null){
						
					}else{
						Tbih16a ih16aNew = new Tbih16a();
						AppUtils.copyProperties(ih30, ih16aNew);
						ih16aNew.setIh16aId(AppUtils.generateUniqueKey());
						ih16aNew.setCompId(AppUtils.getCompId());
						ih16aNew.setDeliveryNo(deliveryNo);
						ih16aNew.setIh16Id(ih16Id);
						ih16aNew.setSfxzztxc(sfxzztxc);
						ih16aNew.setBcKdl(ih30.getWgt());
						ih16aNew.setBcKdlNum(AppUtils.getBigDecimal(ih30.getNum()).compareTo(BigDecimal.ZERO)==0?new BigDecimal("1"):AppUtils.getBigDecimal(ih30.getNum()));
						ih16aNew.setKdl(ih30.getWgt());
						ih16aNew.setTs(ihjcComm01Dao.getBetweenDay(ih30).toString());
						Map<String,Object> paramIh16b = new HashMap<String,Object>();
						AppUtils.copyProperties(ih16aNew, paramIh16b);
						List<Tbih16b> listIh16b  = ihjc16bDao.queryList(paramIh16b);
						if(CollectionUtils.isNotEmpty(listIh16b)&&listIh16b.get(0)!=null){
							Tbih16b ih16b = listIh16b.get(0);
							ih16aNew.setLadingWgt(ih16b.getLadingWgt());
						}
						ihjc16Dao.save(ih16aNew);
					}
					ih30.setDeliveryNo(deliveryNo);
					ihjc16Dao.update(ih30);
					
					Map<String,Object> param30 = new HashMap<String,Object>();
					param30.put("ih30", ih30);
					param30.put("appId", "ihjc16Service");
					param30.put("appidAction", "Update");
					param30.put("changeNo", "委托函明细按标签号新增");
					ihjcComm01Dao.saveTbih31(param30);
				}
			}
			ihjc16Dao.getSession().flush();
			
			Map<String,Object> ih16aSumMap = ihjc16aDao.queryIh16aSumWgt(parameter);
			ih16.setLadingWgt(AppUtils.getBigDecimal(ih16aSumMap.get("sumWgt")));
			ih16.setLadingNum(AppUtils.getBigDecimal(ih16aSumMap.get("sumNum")));
			ihjc16Dao.update(ih16);
			ihjc16Dao.getSession().flush();
	}
	
	@DataResolver
	public Properties updateOrDeleteTbih16a(Collection<Tbih16a> datas) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		
			for (Tbih16a ih16a : datas) {
				EntityState state = EntityUtils.getState(ih16a);
				if (state.equals(EntityState.MODIFIED)) {
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih16Id", ih16a.getIh16Id());
					List<Tbih16> listIh16 = ihjc16Dao.queryList(mapParam);
					if(!CollectionUtils.isEmpty(listIh16)&&listIh16.get(0)!=null){
						if(StringHelper.isNotEmpty(listIh16.get(0).getStatus())&& !"00".equals(listIh16.get(0).getStatus())){
							flag = false;
							prop.put("msg", "提单状态不是初始状态，不能修改");
							break;
						}
					}
					ihjc16Dao.update(ih16a);
				}
				if (state.equals(EntityState.DELETED)) {
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih16Id", ih16a.getIh16Id());
					List<Tbih16> listIh16 = ihjc16Dao.queryList(mapParam);
					if(!CollectionUtils.isEmpty(listIh16)&&listIh16.get(0)!=null){
						if(StringHelper.isNotEmpty(listIh16.get(0).getStatus())&& !"00".equals(listIh16.get(0).getStatus())){
							flag = false;
							prop.put("msg", "提单状态不是初始状态，不能删除");
							break;
						}
						
					}
					if("N".equals(ih16a.getSfxzztxc())){
						mapParam.put("labelNo", ih16a.getLabelNo());
						mapParam.put("orderItem", ih16a.getOrderItem());
						mapParam.put("compId", ih16a.getCompId());
						List<Tbih30> listIh30 = ihjc30Dao.queryList(mapParam);
						if(CollectionUtils.isNotEmpty(listIh30)&&listIh30.get(0)!=null){
							Tbih30 ih30 = listIh30.get(0);
							ih30.setDeliveryNo("");
							ihjc16Dao.update(ih30);
							
							Map<String,Object> param = new HashMap<String,Object>();
							param.put("ih30", ih30);
							param.put("appId", "ihjc16Service");
							param.put("appidAction", "Update");
							param.put("changeNo", "委托函明细按标签号新增撤销");
							ihjcComm01Dao.saveTbih31(param);
						}
					}
					ihjc16Dao.delete(ih16a);
					
				}
			}

	
		
		prop.put("flag", flag);
		return prop;
	}
	
	@DataResolver
	public Properties updatePrintIh16(Collection<Tbih16> datas) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
			for (Tbih16 ih16 : datas) {
				Map<String,Object> mapParam = new HashMap<String,Object>();
				mapParam.put("ih16Id", ih16.getIh16Id());
				ihjc16Dao.getSession().evict(ih16);
				List<Tbih16> listIh16 = ihjc16Dao.queryList(mapParam);
				if(!CollectionUtils.isEmpty(listIh16)&&listIh16.get(0)!=null){
					Tbih16 tbih16  = listIh16.get(0);
					tbih16.setSfydy("Y");
					ihjc16Dao.update(tbih16);
				}
			}
		ihjc16Dao.getSession().flush();
		prop.put("flag", flag);
		return prop;
	}
}
package com.jghz.ih.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc03aDao;
import com.jghz.ih.dao.Ihjc16Dao;
import com.jghz.ih.dao.Ihjc16aDao;
import com.jghz.ih.dao.Ihjc19Dao;
import com.jghz.ih.dao.Ihjc21bDao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.Ihjc40Dao;
import com.jghz.ih.dao.Ihjc40aDao;
import com.jghz.ih.dao.Ihjc60Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih02a;
import com.jghz.ih.entity.Tbih16;
import com.jghz.ih.entity.Tbih16a;
import com.jghz.ih.entity.Tbih19;
import com.jghz.ih.entity.Tbih30;
import com.jghz.ih.entity.Tbih40;
import com.jghz.ih.entity.Tbih40a;
import com.jghz.ih.entity.Tbih60;
import com.jghz.sh.api.ShjcApiService;
import com.jghz.sh.dao.Shjc22Dao;
import com.jghz.sh.entity.Tbsh22;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih16对象信息的保存操作
 */
@Transactional
@Component("ihjc19Service")
public class Ihjc19Service {
	@Resource
	private Ihjc16Dao ihjc16Dao;
	
	@Resource
	private Ihjc16aDao ihjc16aDao;
	
	@Resource
	private Ihjc19Dao ihjc19Dao;
	
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	@Resource
	private Ihjc21bDao ihjc21bDao;
	
	@Resource
	private Ihjc03aDao ihjc03aDao;
	
	@Resource
	private Ihjc40aDao ihjc40aDao;
	
	@Resource
	private Ihjc40Dao ihjc40Dao;
	
	@Resource
	private Ihjc60Dao ihjc60Dao;
	
	@Resource
	private Ihjc02Dao ihjc02Dao;
	
	@Resource
	private Shjc22Dao shjc22Dao;
	
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	@Resource
	private ShjcApiService shjcApiService;
	
	@DataProvider
	public Collection<Tbih16> loadTbih16(Map<String, Object> parameter) throws Exception{
		List<Tbih16> listIh16= new ArrayList<Tbih16>();
		listIh16=ihjc16Dao.queryList(parameter);
		return listIh16;
	}
	
	@DataProvider
	public Collection<Tbih16a> loadTbih16a(Map<String, Object> parameter) throws Exception{
		List<Tbih16a> listIh16a = new ArrayList<Tbih16a>();
		listIh16a=ihjc16aDao.queryList(parameter);
		return listIh16a;
		
	}
	
	@DataProvider
	public Collection<Tbih30> loadTbih30(Map<String, Object> parameter) throws Exception{
		List<Tbih30> listIh30 = new ArrayList<Tbih30>();
		List<Tbih16a> listIh16a = ihjc16aDao.queryList(parameter);
		for(Tbih16a ih16a:listIh16a){
			parameter.put("deliveryNo", ih16a.getDeliveryNo());
			parameter.put("ladingNo", ih16a.getLadingNo());
			parameter.put("labelNo", ih16a.getLabelNo());
			parameter.put("orderItem", ih16a.getOrderItem());
			parameter.put("orderItemArry", "('"+ih16a.getOrderItem()+"')");
			parameter.put("sfxzztxc", ih16a.getSfxzztxc());
			listIh30.addAll(ihjc30Dao.queryListPH(parameter));
		}
		
		return listIh30;
	}
	
	//出库单打印上面form中的出库单信息
	@DataProvider
	public Collection<Map<String,Object>> loadTbih19Info(Map<String, Object> parameter) throws Exception{
		List<Map<String,Object>> listIh19Info=new ArrayList<Map<String,Object>>();
		listIh19Info=ihjc19Dao.queryTbih19Info(parameter);
		return listIh19Info;
	}
	
	//出库单打印下面表格中的明细信息
	@DataProvider
	public void loadTbih19(Page<Tbih19> page, Map<String, Object> parameter) throws Exception{
		ihjc19Dao.pagingQuery(page,parameter);
	}
	
	//出库单customDropdown中的数据
	@DataProvider
	public void loadTbih19CustDrop(Page<Tbih19> page, Criteria criteria) throws Exception{
		ihjc19Dao.pagingQueryCustDrop(page,criteria);
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public Properties saveTbih16PH(Map<String,Object> parameters) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		String deliveryNo = (String) parameters.get("deliveryNo");
		String syhch = (String) parameters.get("syhch");
		List<Tbih30> ListIh30 = (List<Tbih30>) parameters.get("ListIh30");
		
		
			List<Tbih16> listIh16=ihjc16Dao.queryList(parameters);
			if(CollectionUtils.isEmpty(listIh16)||listIh16.get(0)==null){
				throw new RuntimeException("该委托函" + deliveryNo+ "不存在");
			}
			Tbih16 ih16 = listIh16.get(0);
			String outNo=ihjcComm01Dao.getOutNo(new HashMap(){{put("compId",AppUtils.getCompId());}});
			int count = 0;// 出库件数
			BigDecimal wgt = new BigDecimal("0");// 配货总重量
			
			//水运航次号不为空，添加配船信息
			Tbsh22 sh22 = null;
			if(StringHelper.isNotEmpty(syhch)){
				Map<String,Object> mapHc= new HashMap<String,Object>();
				mapHc.put("hc", syhch);
				sh22 = shjc22Dao.queryShip(mapHc);
				BigDecimal kzl = sh22.getYsKzl() == null ? new BigDecimal("0"): sh22.getYsKzl();
				if (kzl.compareTo(wgt) < 0
						&& (wgt.subtract(kzl)).compareTo(new BigDecimal("20")) > 0) {
					throw new RuntimeException("配货量不能超过船运量20吨");
				}
			}
			List<Map<String,Object>> listIh16a = ihjc16aDao.queryListOrderItem(parameters);
			for(Map<String,Object> ih16a:listIh16a){
				String sfxzztxc = AppUtils.toValidString(ih16a.get("sfxzztxc"));
				String orderItem = AppUtils.toValidString(ih16a.get("orderItem"));
				String prodTypeName = AppUtils.toValidString(ih16a.get("prodTypeName"));
				String productName = AppUtils.toValidString(ih16a.get("roductName"));
				BigDecimal bcKdl = AppUtils.getBigDecimal(ih16a.get("kdl"));
				BigDecimal wgtXc = new BigDecimal("0");// 来函项次申请重量	
				for (Tbih30 ih30 :ListIh30) {
					Tbih19 ih19 = new Tbih19();
					AppUtils.copyProperties(ih30, ih19);
					AppUtils.copyProperties(ih16, ih19);
					
					ih19.setProdType(ih30.getProdType());
					ih19.setProdTypeName(ih30.getProdTypeName());
					ih19.setProductNo(ih30.getProductNo());
					ih19.setProductName(ih30.getProductName());
					ih19.setProductDetail(ih30.getProductDetail());
					
					ih19.setIh19Id(AppUtils.generateUniqueKey());
					ih19.setCompId(AppUtils.getCompId());	
					ih19.setOutNo(outNo);
					ih19.setOutType("A");
					ih19.setSyhch(syhch);
					ih19.setPhDate(AppUtils.getCurrentDateString("yyyyMMdd"));
					ih19.setPhEmp(AppUtils.getUserInfo().getCname());
					if((StringHelper.isNotEmpty(ih30.getOrderItem())&&ih30.getOrderItem().equals(orderItem))
						||(StringHelper.isNotEmpty(ih30.getProdTypeName())&&ih30.getProdTypeName().equals(prodTypeName))
						||(StringHelper.isNotEmpty(ih30.getProductName())&&ih30.getProductName().equals(productName))){
						//整体项次新增
						if("Y".equals(sfxzztxc)){
							
							if(StringHelper.isEmpty(ih30.getDeliveryNo())){
								ih30.setDeliveryNo(ih16.getDeliveryNo());
								ih30.setOutNo(ih19.getOutNo());
								ih30.setReceiptCompName(ih16.getReceiptCompName());
								ih30.setReceiptCompNo(ih16.getReceiptCompNo());
								ih30.setSfxcbj("Y");//标记是提单是按照项次新增，进行配货的
								ihjc16Dao.update(ih30);
								
								wgtXc = wgtXc.add(ih30.getWgt());
								wgt=wgt.add(ih30.getWgt());
								count++;
							}else{
								continue;
							}
							
							if (wgtXc.compareTo(bcKdl.multiply(new BigDecimal(1.05))) > 0) {
								throw new RuntimeException("该委托函" + ih16.getDeliveryNo()+ "项次号为"+orderItem+"开单总量为" + bcKdl + ",实际配单量为"+ wgtXc);
						    }
							
							if(wgtXc.compareTo(new BigDecimal("0"))!=0){
								Map<String,Object> map61Wgt = new HashMap<String,Object>();
								map61Wgt.put("compId", ih16.getCompId());
								map61Wgt.put("ladingNo", ih16.getLadingNo());
								map61Wgt.put("deliveryNo", ih16.getDeliveryNo());
								map61Wgt.put("orderItem", orderItem);
								map61Wgt.put("prodTypeName", prodTypeName);
								map61Wgt.put("productName", productName);
								List<Map<String,Object>> ListIh30Wgt = ihjc30Dao.queryListOrderItemDone(map61Wgt);
								BigDecimal sum = new BigDecimal(ListIh30Wgt.get(0).get("sumWgt")==null?"0":ListIh30Wgt.get(0).get("sumWgt").toString());
								if((sum.add(wgtXc)).compareTo(bcKdl.multiply(new BigDecimal(1.05)))>0){
									throw new RuntimeException("该委托函" + ih16.getLadingNo()+ "项次号为"+orderItem+"开单总量为" + bcKdl + ",货物已经配完,请重新确认勾选货物");
								}
							 }	
						}else if("N".equals(sfxzztxc)){//按照labelNo明细项新增
							if(StringHelper.isNotEmpty(ih30.getDeliveryNo())){
								ih30.setOutNo(ih19.getOutNo());
								ih30.setReceiptCompName(ih16.getReceiptCompName());
								ih30.setReceiptCompNo(ih16.getReceiptCompNo());
								ihjc16Dao.update(ih30);
								
								wgt=wgt.add(ih30.getWgt());
								count++;
							}else{
								continue;
							}
						}
					}else{
						continue;
					}
					
					//船运
					if(sh22!=null){
						ih19.setShipNo(sh22.getShipNo());
						ih19.setCarrierNo(sh22.getCarrierNo());
					}
					
					ih19.setOutWareCode(ih30.getWareQwCode().substring(0, 2));
					ih19.setLadingNo(ih30.getLadingNo());
					ih19.setStatus("00");
					ih19.setCreateEmp(AppUtils.getUserName());
					ih19.setCreateTime(AppUtils.getCurrentDate());
					ihjc16Dao.save(ih19);
				}
				
			}
					
//			if (wgt.compareTo(AppUtils.getBigDecimal(ih16.getLadingWgt()).multiply(new BigDecimal(1.05))) > 0) {
//				throw new RuntimeException("该委托函" + ih16.getLadingNo()+ "开单总量为" + ih16.getLadingWgt() + ",实际配单量为"+ wgt);
//			}
			//修改船运的现有可载量
			if(sh22!=null){
				sh22.setXyKzl(sh22.getXyKzl().subtract(wgt));
				ihjc16Dao.update(sh22);
			}
			prop.put("outNo", outNo);
			ihjc16Dao.getSession().flush();
		prop.put("flag", flag);
		return prop;
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public Properties saveTbih19Detail(Map<String,Object> parameters) throws Exception {
		Properties prop = new Properties();
		StringBuffer msg=new StringBuffer();
		boolean flag = true;
		String outNo="";
		String carNo="";
		
			 String settleNo=ihjcComm01Dao.getSettleNo(new HashMap(){{put("compId",AppUtils.getCompId());}});
				String ih40Id=AppUtils.generateUniqueKey();
				Tbih40 ih40 = new Tbih40();
				Tbih19 ih19Info = (Tbih19) parameters.get("ih19Info");
				outNo = ih19Info.getOutNo();
				carNo = ih19Info.getCarNo();
				String cmdType = (String) parameters.get("cmdType");
				String compId = AppUtils.getCompId();
				List<Tbih19> ListIh19 = (List<Tbih19>) parameters.get("ListIh19");
				Map<String,Object> map30 = new HashMap<String,Object>();
				Map<String,Object> map19 = new HashMap<String,Object>();
				Map<String,Object> map16 = new HashMap<String,Object>();
				Tbih16 ih16 = new Tbih16();
				map16.put("compId", compId);
				map16.put("deliveryNo", ih19Info.getDeliveryNo());
				List<Tbih16> listIh16=ihjc16Dao.queryList(map16);
				if(CollectionUtils.isNotEmpty(listIh16)&& listIh16.get(0)!=null){
					ih16=listIh16.get(0);
					if(StringHelper.isNotEmpty(ih16.getCarNo())){
						carNo = ih16.getCarNo();
					}
				}else{
					throw new RuntimeException("没有找到来函流水号是"+ih19Info.getDeliveryNo()+"的委托函");
				}
				BigDecimal price=new BigDecimal("0");//基本单价
				BigDecimal Dprice=new BigDecimal("0");//单价最低的单价
				BigDecimal overdueAmt=new BigDecimal("0");//超期费
				BigDecimal storageAmt=new BigDecimal("0");//仓储费
				BigDecimal totalAmt=new BigDecimal("0");
				BigDecimal dj=new BigDecimal("0");
				BigDecimal discountAmt=new BigDecimal("0");
				
				String iscq="";
				for(Tbih19 tbih19 :ListIh19){
					AppUtils.copyProperties(tbih19, map19);
					Tbih19 ih19 = ihjc19Dao.getOneTbih19(map19);
					AppUtils.copyProperties(ih19, map30);
					
					//将页面录入的信息存入出库单Tbih19每一笔明细中
					ih19.setTotalAmt(ih19Info.getTotalAmt());
					ih19.setZz(ih19Info.getZz());
					ih19.setCarNo(carNo);
					ih19.setDriverLicense(ih19Info.getDriverLicense());
					ih19.setZcr(ih19Info.getZcr());
					ih19.setLiftingTeam(ih19Info.getLiftingTeam());
					ih19.setLiftingEmp(ih19Info.getLiftingEmp());
					ih19.setCraneDriver(ih19Info.getCraneDriver());
				
					Tbih30 ih30 = ihjc30Dao.getOneTbih30(map30);
					
					//配货确认操作
					if("PHQR".equals(cmdType)){
						if(ih19.getStatus().compareTo("10")>=0){
							throw new RuntimeException("该单据已经配货销帐确认过，不能重复确认");
						}
						Tbih40a ih40a = new Tbih40a();
						AppUtils.copyProperties(ih19, ih40a);
						if(StringHelper.isEmpty(ih19.getXzTime())){//销帐时间为空，没有销帐过
							
							AppUtils.copyProperties(ih16, ih40a);
							
							//获取协议中价格定义的价格
							Map<String,Object> paramIh21b = new HashMap<String,Object>();
							Long ts=ihjcComm01Dao.getBetweenDay(ih30);
							String kb = ihjcComm01Dao.getKB(ih30);
							AppUtils.copyProperties(ih16, paramIh21b);
							AppUtils.copyProperties(ih19, paramIh21b);
							paramIh21b.put("deliveryDate", ih16.getDeliveryDate().substring(0, 8));
							paramIh21b.put("deliveryTime", ih16.getDeliveryDate().substring(9, 17));
							paramIh21b.put("ts", BigDecimal.valueOf(ts));
							paramIh21b.put("kb", kb);
							Map<String,Object> ih21bMap= new HashMap<String,Object>();
							//如果填了出库总金额，以输入的总金额为准
							if(AppUtils.getBigDecimal(ih19.getTotalAmt()).compareTo(BigDecimal.ZERO)>0){
								totalAmt = ih19.getTotalAmt();
								if(AppUtils.getBigDecimal(ih30.getWgt()).compareTo(BigDecimal.ZERO)>0){
									price = totalAmt.divide(ih30.getWgt(), 6, RoundingMode.HALF_UP);
								}
								ih21bMap.put("totalAmt", totalAmt);
								ih21bMap.put("price", price);
							}else{
								List<Map<String,Object>> listIh21b = ihjcComm01Dao.getSumPrice(paramIh21b);
								if(listIh21b.size()>=1){
									if(listIh21b.size()==1){//找到唯一的一条价格记录
										ih21bMap=listIh21b.get(0);
										
										price=AppUtils.getBigDecimal(ih21bMap.get("price"));
										overdueAmt=AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"));
										storageAmt=AppUtils.getBigDecimal(ih21bMap.get("storageAmt"));
										totalAmt=AppUtils.getBigDecimal(ih21bMap.get("totalAmt"));
										discountAmt=AppUtils.getBigDecimal(ih21bMap.get("discountAmt"));
										ih21bMap.remove("prodType");
										ih21bMap.remove("prodTypeName");
										ih21bMap.remove("productNo");
										ih21bMap.remove("productName");
									}else{
										for(Map<String,Object> Map21b:listIh21b){//找到多个品种对应的不同价格
											if((StringHelper.isNotEmpty(ih30.getProductNo())&&ih30.getProductNo().equals(AppUtils.toValidString(Map21b.get("productNo"))))||
											(StringHelper.isNotEmpty(ih30.getProductName())&&ih30.getProductName().equals(AppUtils.toValidString(Map21b.get("productName"))))||
											(StringHelper.isNotEmpty(ih30.getProdType())&&ih30.getProdType().equals(AppUtils.toValidString(Map21b.get("prodType"))))||
											(StringHelper.isNotEmpty(ih30.getProdTypeName())&&ih30.getProdTypeName().equals(AppUtils.toValidString(Map21b.get("prodTypeName")))))
											{
												AppUtils.copyProperties(Map21b, ih21bMap);
												price=AppUtils.getBigDecimal(ih21bMap.get("price"));
												overdueAmt=AppUtils.getBigDecimal(ih21bMap.get("overdueAmt"));
												storageAmt=AppUtils.getBigDecimal(ih21bMap.get("storageAmt"));
												totalAmt=AppUtils.getBigDecimal(ih21bMap.get("totalAmt"));
												discountAmt=AppUtils.getBigDecimal(ih21bMap.get("discountAmt"));
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
							if(Dprice.compareTo(new BigDecimal("0"))==0){
								Dprice=price;
							}else{
								Dprice=Dprice.compareTo(price)>=0?price:Dprice;
							}
							
							AppUtils.copyProperties(ih21bMap, ih40a);
							
							AppUtils.copyProperties(ih21bMap, ih30);
							
							AppUtils.copyProperties(ih21bMap, ih19);
					
							if(ts<0){
								ts=Long.valueOf("0");
							}
							ih30.setAge(ts.toString());
							ih30.setSettleType(ih16.getSettleType());
							
							if(AppUtils.getBigDecimal(ih21bMap.get("overdueAmt")).compareTo(BigDecimal.ZERO)!=0){
								ih30.setIsCq("Y");
							}
							
							//货权转授费用收取
							Map<String,Object> map60 = new HashMap<String,Object>();
							AppUtils.copyProperties(ih30, map60);
							map60.put("overdueFlag", "N");
							map60.put("outNo", null);
							List<Tbih60> listIh60=ihjc60Dao.queryList(map60);
							if(CollectionUtils.isNotEmpty(listIh60)&&listIh60.get(0)!=null){
								totalAmt=totalAmt.add(listIh60.get(0).getZsOverdueAmt());
							}
							
							//实际应付金额=协议价+超期费-优惠价
							totalAmt=totalAmt.add(overdueAmt).subtract(discountAmt);
							ih30.setSfe(totalAmt);//收费额
							
							//实际单价=实际应付金额/重量
							if(totalAmt.compareTo(BigDecimal.ZERO)>0 && ih30.getWgt().compareTo(BigDecimal.ZERO)>0){
								dj=totalAmt.divide(ih30.getWgt(),6,RoundingMode.HALF_UP);
							}
							
							ih30.setJsdr("0");
							ih30.setStatus("10");//设置“是否确认配货”状态
							ih30.setHpZt("10");//货品状态	
							ih30.setSettleType(ih19.getSettleType());
							ihjc16Dao.update(ih30);
							
							Map<String,Object> param31 = new HashMap<String,Object>();
							param31.put("ih30", ih30);
							param31.put("appId", "ihjc19Service");
							param31.put("appidAction", "Update");
							param31.put("changeNo", "出库配货");
							ihjcComm01Dao.saveTbih31(param31);
							
							ih19.setXzEmp(AppUtils.getUserInfo().getCname());
							ih19.setXzTime(AppUtils.getCurrentDateString("yyyyMMdd"));
							ih19.setTotalAmt(totalAmt);
							ih19.setSettleNo(settleNo);
							ih19.setSettleType(ih16.getSettleType());
							ih19.setTs(BigDecimal.valueOf(ts));
							ih19.setPrice(dj.compareTo(BigDecimal.ZERO)>=0?dj:price);
							ih19.setStatus("10");
							
							ih40a.setIh40aId(AppUtils.generateUniqueKey());
							ih40a.setIh40Id(ih40Id);
							ih40a.setCompId(AppUtils.getCompId());
							ih40a.setYearMonth(AppUtils.getCurrentDateString("yyyyMM"));
							ih40a.setSettleNo(settleNo);
							ih40a.setSettleType(ih19.getSettleType());
							ih40a.setOutNo(ih19.getOutNo());
							ih40a.setLadingNo(ih19.getLadingNo());
							ih40a.setTs(BigDecimal.valueOf(ts));
							ih40a.setTotalAmt(totalAmt);
							ih40a.setPrice(dj.compareTo(BigDecimal.ZERO)>=0?dj:price);
							if("RJ".equals(ih16.getSettleType())){
								ih40a.setStatus("10");
							}else{
								ih40a.setStatus("00");
							}
							AppUtils.copyProperties(ih16, ih40);
							AppUtils.copyProperties(ih40a, ih40);
							ihjc16Dao.save(ih40a);
						
						}
							
					}else if("CKQR".equals(cmdType)){
						ih19.setStatus("20");
						ih19.setOutDate(AppUtils.getCurrentDateString("yyyyMMdd"));
						ih19.setOutEmp(AppUtils.getUserInfo().getCname());
						
						ih30.setStatus("20");
						ih30.setHpZt("20");
						ih30.setOutLiftingTeam(ih19.getLiftingTeam());
						ih30.setOutLiftingEmp(ih19.getLiftingEmp());
						ih30.setOutCraneDriver(ih19.getCraneDriver());
						ih30.setOutWgt(ih19.getWgt());
						ih30.setOutDate(AppUtils.getCurrentDateString("yyyyMMdd"));
						ih30.setOutEmp(AppUtils.getUserInfo().getCname());
						ih30.setSettleNo(ih19.getSettleNo());
						ihjc16Dao.update(ih30);
						
						Map<String,Object> param31 = new HashMap<String,Object>();
						param31.put("ih30", ih30);
						param31.put("appId", "ihjc19Service");
						param31.put("appidAction", "Update");
						param31.put("changeNo", "出库确认");
						ihjcComm01Dao.saveTbih31(param31);
						
					}
					ihjc16Dao.update(ih19);
					ihjc16Dao.getSession().flush();
				}
				
				if("PHQR".equals(cmdType)){
					//汇总Tbih40a中的结算数据到Tbih40中
					Map<String,Object> map40 = new HashMap<String,Object>();
					AppUtils.copyProperties(ih19Info, map40);
					Map<String,Object> mapSum40a = ihjc40aDao.queryIh40aSumWgt(map40);
					AppUtils.copyProperties(mapSum40a, ih40);
					ih40.setIh40Id(ih40Id);
					ih40.setSettleNo(settleNo);
					ih40.setSettleDate(AppUtils.getCurrentDateString("yyyyMMdd"));
					ih40.setSettleEmp(AppUtils.getUserInfo().getCname());
					ih40.setYearMonth(AppUtils.getCurrentDateString("yyyyMM"));
					ih40.setYsyf("S");//应收应付标志:S应收  F应付
					ih40.setStatus("00");
					
					Map<String,Object> map16Sum40a = ihjc40aDao.queryIh40aSumWgt(map16);
					ih16.setQrphZfy(AppUtils.getBigDecimal(map16Sum40a.get("totalAmt")));
					ih16.setStl(AppUtils.getBigDecimal(map16Sum40a.get("wgt")));
					ihjc16Dao.update(ih16);
					//如果是日结的话，扣除付款单位账户内的余额
					if(StringHelper.isNotEmpty(ih16.getSettleType())&&"RJ".equals(ih16.getSettleType())){
						Map<String,Object> mapParam02 = new HashMap<String,Object>();
						mapParam02.put("compId", compId);
						mapParam02.put("custNo", ih16.getPayCompNo());
						mapParam02.put("custName", ih16.getPayCompName());
						List<Tbih02> listIh02 = ihjc02Dao.queryList02(mapParam02);	
						if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
							Tbih02 ih02 = listIh02.get(0);
							if(ih02.getBalancenum()!=null){
								if(ih02.getBalancenum().compareTo(ih40.getTotalAmt())>=0){
									Tbih02a ih02a = new Tbih02a();
									ih02a.setIh02aId(AppUtils.generateUniqueKey());
									ih02a.setCompId(compId);
									ih02a.setCustNo(ih02.getCustNo());
									ih02a.setCustName(ih02.getCustName());
									ih02a.setLadingNo(ih16.getLadingNo());
									ih02a.setOutNo(ih40.getOutNo());
									ih02a.setOutDate(ih40.getOutDate());
									ih02a.setOutAmt(ih40.getTotalAmt());
									ih02a.setSettleDate(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
									ih02a.setSettleNo(settleNo);
									ih02a.setReason("01");//扣款原因：01配货出库
									ih02a.setBalancenum(AppUtils.getBigDecimal(ih02.getBalancenum()).subtract(ih02a.getOutAmt()));
									ihjc16Dao.save(ih02a);
									
									ih02.setBalancenum(ih02.getBalancenum().subtract(ih40.getTotalAmt()));//设置付款单位的余额
									ihjc16Dao.update(ih02);
									
									ih40.setIszj("N");//不是滞结
									ih40.setStatus("10");//已扣款
								}else{
									throw new RuntimeException("付款单位"+ih02.getCustName()+"费用不足,欠款" + ih40.getTotalAmt().subtract(ih02.getBalancenum()));
								}
							}else{
								throw new RuntimeException("付款单位"+ih02.getCustName()+"费用不足,欠款" + ih40.getTotalAmt());
							}
						}else{
							throw new RuntimeException("付款单位"+ih16.getPayCompName()+"不在往来单位的中，请先维护" );
						}
					}
					
					
					ihjc16Dao.save(ih40);
					ihjc16Dao.getSession().flush();
				
			}
				
			//调用TMS接口
			if(StringHelper.isNotEmpty(ih16.getTransNo())){
				Map<String,Object> mapTms=new HashMap<String,Object>();
				mapTms.put("transNo", ih16.getTransNo());
				mapTms.put("carNo", ih16.getTransNo());
				mapTms.put("compId", ih16.getCompId());
				if("PHQR".equals(cmdType)){
					shjcApiService.executePh(mapTms);
				}else if("CKQR".equals(cmdType)){
					shjcApiService.executeOut(mapTms);
				}
			}
		/*catch (Exception e) {
			e.printStackTrace();
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
			return prop;
		}*/
		 
		prop.put("outNo", outNo);
		prop.put("flag", flag);
		return prop;
	}
	@SuppressWarnings("unchecked")
	@Expose
	public Properties deleteTbih19Detail(Map<String,Object> parameters) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		BigDecimal wgt = BigDecimal.ZERO;
		BigDecimal amt = BigDecimal.ZERO;
		BigDecimal storageAmt = BigDecimal.ZERO;
		BigDecimal overDueAmt = BigDecimal.ZERO;
		BigDecimal discountAmt = BigDecimal.ZERO;
		Map<String,Object> map40 = new HashMap<String,Object>();
		String settleStatus = "";
		String outNo = "";
		Map<String,Object> map19=new HashMap<String,Object>();
			List<Tbih19> ListIh19 = (List<Tbih19>) parameters.get("ListIh19");
			for(Tbih19 tbih19 :ListIh19){
				outNo=tbih19.getOutNo();
				AppUtils.copyProperties(tbih19, map19);
				Tbih19 ih19 = ihjc19Dao.getOneTbih19(map19);
				Tbih30 ih30 = ihjc30Dao.getOneTbih30(map19);
				if(StringHelper.isEmpty(ih19.getStatus())||"00".equals(ih19.getStatus())){
					ihjc16Dao.delete(ih19);
					
					if("Y".equals(ih30.getSfxcbj())){
						ih30.setDeliveryNo("");
					}
					ih30.setOutNo("");
					ih30.setOutCraneDriver("");
					ih30.setOutLiftingTeam("");
					ih30.setOutLiftingEmp("");
					ih30.setReceiptCompName("");
					ih30.setReceiptCompNo("");
					ih30.setSettleNo("");
					ihjc16Dao.update(ih30);
					
				}else if(ih19.getStatus().compareTo("10")>=0&&StringHelper.isNotEmpty(ih19.getSettleNo())){
					Map<String,Object> map40a = new HashMap<String,Object>();
					map40a.put("compId", ih19.getCompId());
					map40a.put("outNo", ih19.getOutNo());
					map40a.put("settleNo", ih19.getSettleNo());
					map40a.put("labelNo", ih19.getLabelNo());
					Tbih40a ih40a = new Tbih40a();
					AppUtils.copyProperties(map40a, map40);
					List<Tbih40a> list40a=ihjc40aDao.queryList(map40a);
					if(CollectionUtils.isNotEmpty(list40a)&&list40a.get(0)!=null){
						ih40a = list40a.get(0);
						settleStatus = ih40a.getStatus();
						wgt = wgt.add(ih40a.getWgt());
						amt = amt.add(ih40a.getTotalAmt());
						storageAmt =  amt.add(AppUtils.getBigDecimal(ih40a.getStorageAmt()));
						overDueAmt =  amt.add(AppUtils.getBigDecimal(ih40a.getOverdueAmt()));
						discountAmt =  amt.add(AppUtils.getBigDecimal(ih40a.getDiscountAmt()));
					}else{
						throw new RuntimeException("没有找到出库单号"+ih19.getOutNo()+"对应的结算单"+ih19.getSettleNo()+"数据");
					}
					
					//判断出库时间跟撤销时间，当天作废，隔天冲红
					if(AppUtils.toValidString(ih19.getXzTime()).compareTo(AppUtils.getCurrentDateString("yyyyMMdd"))==0){
						ih19.setStatus("31");//出库明细状态设置成撤销状态
						ih19.setCdTime(AppUtils.getCurrentDateString("yyyyMMdd"));
						ihjc16Dao.update(ih19);
						
						ih40a.setStatus("31");
						ihjc16Dao.update(ih40a);
						
					}else{
						ih19.setStatus("30");//出库明细状态设置成冲红状态
						ih19.setCdTime(AppUtils.getCurrentDateString("yyyyMMdd"));
						ihjc16Dao.update(ih19);
						
						Tbih19 ih19Ch = new Tbih19();
						AppUtils.copyProperties(ih19, ih19Ch);
						ih19Ch.setIh19Id(AppUtils.generateUniqueKey());
						ih19Ch.setOutNo(ih19.getOutNo()+"X");
						ih19Ch.setNum(AppUtils.getBigDecimal(ih19.getNum()).negate());
						ih19Ch.setWgt(AppUtils.getBigDecimal(ih19.getWgt()).negate());
						ih19Ch.setPieceNum(AppUtils.getBigDecimal(ih19.getPieceNum()).negate());
						ih19Ch.setStorageAmt(AppUtils.getBigDecimal(ih19.getStorageAmt()).negate());
						ih19Ch.setOverdueAmt(AppUtils.getBigDecimal(ih19.getOverdueAmt()).negate());
						ih19Ch.setTotalAmt(AppUtils.getBigDecimal(ih19.getTotalAmt()).negate());
						ih19Ch.setDiscountAmt(AppUtils.getBigDecimal(ih19.getDiscountAmt()).negate());
						ih19Ch.setOutDate(AppUtils.getCurrentDateString("yyyyMMdd"));
						ih19Ch.setOutEmp(AppUtils.getUserInfo().getCname());
						ih19Ch.setXzTime(AppUtils.getCurrentDateString("yyyyMMdd"));
						ih19Ch.setXzEmp(AppUtils.getUserInfo().getCname());
						ih19Ch.setStatus("30");
						ihjc16Dao.save(ih19Ch);
						
						ih40a.setStatus("30");
						ih40a.setCancleEmp(AppUtils.getUserInfo().getCname());
						ih40a.setCancleDate(AppUtils.getCurrentDateString("yyyyMMdd"));
						ihjc16Dao.update(ih40a);
						
						Tbih40a ih40aCh = new Tbih40a();
						AppUtils.copyProperties(ih40a, ih40aCh);
						ih40aCh.setIh40aId(AppUtils.generateUniqueKey());
						ih40aCh.setOutNo(ih19.getOutNo()+"X");
						ih40aCh.setNum(AppUtils.getBigDecimal(ih40aCh.getNum()).negate());
						ih40aCh.setWgt(AppUtils.getBigDecimal(ih40aCh.getWgt()).negate());
						ih40aCh.setStorageAmt(AppUtils.getBigDecimal(ih40aCh.getStorageAmt()).negate());
						ih40aCh.setOverdueAmt(AppUtils.getBigDecimal(ih40aCh.getOverdueAmt()).negate());
						ih40aCh.setTotalAmt(AppUtils.getBigDecimal(ih40aCh.getTotalAmt()).negate());
						ih40aCh.setDiscountAmt(AppUtils.getBigDecimal(ih40aCh.getDiscountAmt()).negate());
						ih40aCh.setOutDate(AppUtils.getCurrentDateString("yyyyMMdd"));
						ih40aCh.setSettleEmp(AppUtils.getUserInfo().getCname());
						ih40aCh.setSettleDate(AppUtils.getCurrentDateString("yyyyMMdd"));
						ih40aCh.setStatus("30");
						ihjc16Dao.save(ih40aCh);
						
					}
						
					if("Y".equals(ih30.getSfxcbj())){
						ih30.setDeliveryNo("");
					}
					ih30.setJsdr("");//结算导入？
					ih30.setStatus("00");//设置“是否确认配货”状态
					ih30.setHpZt("00");//货品状态
					ih30.setAge("0");
					ih30.setSfe(BigDecimal.ZERO);//
					ih30.setOutWgt(BigDecimal.ZERO);
					ih30.setOutDate("");
					ih30.setOutEmp("");
					ih30.setOutNo("");
					ih30.setOutCraneDriver("");
					ih30.setOutLiftingTeam("");
					ih30.setOutLiftingEmp("");
					ih30.setSettleNo("");
					ih30.setUpdateDate(AppUtils.getCurrentDate());
					ih30.setUpdateEmp(AppUtils.getUserName());
					ihjc16Dao.update(ih30);
					
					Map<String,Object> param31 = new HashMap<String,Object>();
					param31.put("ih30", ih30);
					param31.put("appId", "ihjc19Service");
					param31.put("appidAction", "Update");
					param31.put("changeNo", "出库撤销");
					ihjcComm01Dao.saveTbih31(param31);
				}
			}
			ihjc16Dao.getSession().flush();
			if(StringHelper.isNotEmpty(settleStatus)&&settleStatus.compareTo("10")>=0){
				String settleNo="";
				List<Tbih40> list40=ihjc40Dao.queryList(map40);
				if(CollectionUtils.isNotEmpty(list40)&&list40.get(0)!=null){
					Tbih40 ih40 = list40.get(0);
					settleNo=ih40.getSettleNo();
					//判断出库时间跟撤销时间，当天作废，隔天冲红
					if(ih40.getSettleDate().compareTo(AppUtils.getCurrentDateString("yyyyMMdd"))==0){
						//比较结算量跟撤销结算量的差异,相等的话说明是整单作废
						if(wgt.compareTo(ih40.getWgt())==0||ih40.getPieceCount().compareTo(BigDecimal.valueOf(ListIh19.size()))==0){
							ih40.setStatus("31");
							ihjc16Dao.update(ih40);
						}else{
							ih40.setWgt(ih40.getWgt().subtract(wgt));
							ih40.setTotalAmt(ih40.getTotalAmt().subtract(amt));
							ih40.setStorageAmt(AppUtils.getBigDecimal(ih40.getStorageAmt()).subtract(storageAmt));
							ih40.setOverdueAmt(AppUtils.getBigDecimal(ih40.getOverdueAmt()).subtract(overDueAmt));
							ih40.setDiscountAmt(AppUtils.getBigDecimal(ih40.getDiscountAmt()).subtract(discountAmt));
							ihjc16Dao.update(ih40);
						}

					}else{
						//比较结算量跟撤销结算量的差异,相等的话说明是整单作废
						if(wgt.compareTo(ih40.getWgt())==0||ih40.getPieceCount().compareTo(BigDecimal.valueOf(ListIh19.size()))==0){
							ih40.setChAmt(amt);
							ih40.setChWgt(wgt);
							ih40.setChFlag("1");
							ih40.setStatus("30");
							ihjc16Dao.update(ih40);
							
							Tbih40 ih40Ch = new Tbih40();
							AppUtils.copyProperties(ih40, ih40Ch);
							ih40Ch.setIh40Id(AppUtils.generateUniqueKey());
							ih40Ch.setSettleNo(ih40.getSettleNo()+"X");
							ih40Ch.setOutNo(ih40.getOutNo()+"X");
							ih40Ch.setNum(AppUtils.getBigDecimal(ih40.getNum()).negate());
							ih40Ch.setWgt(AppUtils.getBigDecimal(ih40.getWgt()).negate());
							ih40Ch.setStorageAmt(AppUtils.getBigDecimal(ih40.getStorageAmt()).negate());
							ih40Ch.setOverdueAmt(AppUtils.getBigDecimal(ih40.getOverdueAmt()).negate());
							ih40Ch.setTotalAmt(AppUtils.getBigDecimal(ih40.getTotalAmt()).negate());
							ih40Ch.setDiscountAmt(AppUtils.getBigDecimal(ih40.getDiscountAmt()).negate());
							ih40Ch.setOutDate(AppUtils.getCurrentDateString("yyyyMMdd"));
							ih40Ch.setSettleEmp(AppUtils.getUserInfo().getCname());
							ih40Ch.setSettleDate(AppUtils.getCurrentDateString("yyyyMMdd"));
							ih40Ch.setStatus("30");
							ihjc16Dao.save(ih40Ch);
							
							settleNo=ih40Ch.getSettleNo();
						}else{
							ih40.setChAmt(ih40.getChAmt().add(amt));
							ih40.setChWgt(ih40.getChWgt().add(wgt));
							ih40.setChFlag("1");
							ihjc16Dao.update(ih40);
							
							Tbih40 ih40Ch = new Tbih40();
							AppUtils.copyProperties(ih40, ih40Ch);
							ih40Ch.setIh40Id(AppUtils.generateUniqueKey());
							ih40Ch.setSettleNo(ih40.getSettleNo()+"X");
							ih40Ch.setOutNo(ih40.getOutNo()+"X");
							ih40Ch.setNum(AppUtils.getBigDecimal(ih40.getNum()).negate());
							ih40Ch.setWgt(AppUtils.getBigDecimal(wgt).negate());
							ih40Ch.setStorageAmt(AppUtils.getBigDecimal(storageAmt).negate());
							ih40Ch.setOverdueAmt(AppUtils.getBigDecimal(overDueAmt).negate());
							ih40Ch.setTotalAmt(AppUtils.getBigDecimal(amt).negate());
							ih40Ch.setDiscountAmt(AppUtils.getBigDecimal(discountAmt).negate());
							ih40Ch.setOutDate(AppUtils.getCurrentDateString("yyyyMMdd"));
							ih40Ch.setSettleEmp(AppUtils.getUserInfo().getCname());
							ih40Ch.setSettleDate(AppUtils.getCurrentDateString("yyyyMMdd"));
							ih40Ch.setStatus("30");
							ihjc16Dao.save(ih40Ch);
							
							settleNo=ih40Ch.getSettleNo();
						}
					}
					
					if("10".equals(ih40.getStatus())){//已经扣款，将扣款金额补上
						Map<String,Object> mapParam02 = new HashMap<String,Object>();
						mapParam02.put("compId", ih40.getCompId());
						mapParam02.put("custNo", ih40.getPayCompNo());
						mapParam02.put("custName", ih40.getPayCompName());
						List<Tbih02> listIh02 = ihjc02Dao.queryList02(mapParam02);	
						if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
							Tbih02 ih02 = listIh02.get(0);
							if(ih02.getBalancenum()!=null){
								Tbih02a ih02a = new Tbih02a();
								ih02a.setIh02aId(AppUtils.generateUniqueKey());
								ih02a.setCompId(ih40.getCompId());
								ih02a.setCustNo(ih02.getCustNo());
								ih02a.setCustName(ih02.getCustName());
								ih02a.setLadingNo(ih40.getLadingNo());
								ih02a.setOutNo(ih40.getOutNo());
								ih02a.setOutDate(ih40.getOutDate());
								ih02a.setOutAmt(amt.negate());
								ih02a.setSettleDate(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
								ih02a.setSettleNo(settleNo);
								ih02a.setReason("02");//扣款原因：01配货出库 02冲红 03撤销
								ih02a.setBalancenum(AppUtils.getBigDecimal(ih02.getBalancenum()).add(ih02a.getOutAmt()));
								ihjc16Dao.save(ih02a);
								
								ih02.setBalancenum(ih02.getBalancenum().add(amt));//设置付款单位的余额
								ihjc16Dao.update(ih02);
									
							}else{
								throw new RuntimeException("付款单位"+ih02.getCustName()+"费用不足,欠款" + ih40.getTotalAmt());
							}
						}else{
							throw new RuntimeException("付款单位"+ih40.getPayCompName()+"不在往来单位的中，请先维护" );
						}
						
					}
				}
			}
			ihjc16Dao.getSession().flush();
		prop.put("outNo", outNo);
		prop.put("flag", flag);
		return prop;
	}
}
	

package com.jghz.ih.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.exception.AppException;
import com.base.util.AppUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.bstek.ureport.el.exception.ParseException;


import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.Ihjc60Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih11;
import com.jghz.ih.entity.Tbih16;
import com.jghz.ih.entity.Tbih16a;
import com.jghz.ih.entity.Tbih30;
import com.jghz.ih.entity.Tbih50;
import com.jghz.ih.entity.Tbih60;
import com.jghz.ih.entity.Tbih60a;

@Transactional
@Component
public class Ihjc60Service {
	@Resource
	private Ihjc60Dao ihjc60Dao;
	
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	@Resource
	private Ihjc02Dao ihjc02Dao;
	
	@DataProvider
	public void loadTbih30(Page<Tbih30> page, Map<String, Object> parameter)
			throws Exception {
		if(parameter==null){		
			parameter=new HashMap<String, Object>();
		}
		parameter.put("status", "IN");
		ihjc30Dao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih60(Page<Tbih60> page, Map<String, Object> parameter)
			throws Exception {
		ihjc60Dao.pagingQuery60(page,parameter);
	}
	
	@DataProvider
	public void loadTbih60a(Page<Tbih60a> page, Map<String, Object> parameter)
			throws Exception {
		ihjc60Dao.pagingQuery60a(page,parameter);
	}
	
	@DataResolver
	public Properties saveConfirm(Collection<Tbih60a> datasTbih60a,Map<String,Object> parameter) throws Exception {
		Session session = ihjc60Dao.getSession();
		Properties prop = new Properties();
		boolean flag = true;
		String msg = "";
		try {
			String compId=AppUtils.getCompId();
			String jfr="";
			String ladingDate="";
			for(Tbih60a ih60a:datasTbih60a){
				if(StringHelper.isNotEmpty(ih60a.getStatus())&&"10".equals(ih60a.getStatus())){
					flag = false;
					prop.put("msg", "转授单已经确认，不能重复确认");
					break;
				}else{
					String sqlIh30 = " from "+Tbih30.class.getName() +" where compId= '"+compId+"' and labelNo = '"+ih60a.getLabelNo()+"' ";
					List<Tbih30> listIh30 = ihjc30Dao.query(sqlIh30);
					if(CollectionUtils.isEmpty(listIh30)||listIh30.get(0)==null){
						if(StringHelper.isEmpty(ih60a.getWareQwCode())){
							flag = false;
							msg += ih60a.getLabelNo()+ "新增入库的货权转授产品需要录入库位信息";
							continue;
						}
						
						Tbih11 ih11 = new Tbih11();
						AppUtils.copyProperties(ih60a, ih11);
						ih11.setIh11Id(AppUtils.generateUniqueKey());
						ih11.setCompId(compId);
						ih11.setCreateEmp(AppUtils.getUserName());
						ih11.setCreateDate(AppUtils.getCurrentDate()); 
						ih11.setInNo(ih60a.getInNo());
						ih11.setStatus("10");
						ih11.setCustName(ih60a.getNewCustName());
						ih11.setCustNo(ih60a.getNewCustNo());
						ih11.setInEmp(AppUtils.getUserName());
						ih11.setInDate(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
						ih11.setInType("B");
						session.save(ih11);
						
						Tbih60 ih60 = new Tbih60();
						AppUtils.copyProperties(ih60a, ih60);
						ih60.setIh60Id(AppUtils.generateUniqueKey());
						ih60.setCompId(compId);
						ih60.setCreateEmp(AppUtils.getUserName());
						ih60.setCreateDate(AppUtils.getCurrentDate()); 
						ih60.setOldCustName("");
						ih60.setOldCustNo("");
						ih60.setNewCustName(ih60a.getNewCustName());
						ih60.setNewCustNo(ih60a.getNewCustNo());
						ih60.setZsTime(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
						ih60.setZsEmp(AppUtils.getUserName());
						if(ih60a.getLadingNo().length()>=10){//计费日
							ladingDate = "20"+ih60a.getLadingNo().substring(ih60a.getLadingNo().length()-10, ih60a.getLadingNo().length()-4);
						}
						ih60.setLadingDate(ladingDate);
						ih60.setJfr(ladingDate);
						ih60.setAge("0");
						ih60.setBatchFlag("Y");
						session.save(ih60);
						
						Tbih30 ih30New = new Tbih30();
						AppUtils.copyProperties(ih11, ih30New);
						ih30New.setIh30Id(AppUtils.generateUniqueKey());
						ih30New.setInUnitWgt(ih11.getUnitWgt());
						ih30New.setInWgt(ih11.getWgt());
						ih30New.setMaxWgt(ih11.getWgt());
						if(StringHelper.isNotEmpty(ih30New.getLadingNo())&&ih30New.getLadingNo().length()>=10){//计费日
							jfr = "20"+ih30New.getLadingNo().substring(ih30New.getLadingNo().length()-10, ih30New.getLadingNo().length()-4);
						}else{
							jfr =ih11.getInDate().length()>8?ih11.getInDate().substring(0, 8):ih11.getInDate();
						}
						Map<String,Object> mapParam = new HashMap<String,Object>();
						mapParam.put("compId", compId);
						mapParam.put("wareQwCode", ih11.getWareQwCode());
						//计算所在层数
						String layerCode = "";
						if(StringHelper.isNotEmpty(ih11.getLayerCode())){
							layerCode = String.valueOf((Integer.valueOf(ih11.getLayerCode())+Integer.valueOf(ihjc30Dao.queryMaxLayerCode(mapParam))));
						}
						
						ih30New.setJfr(jfr);
						ih30New.setWareQwCode(ih11.getWareQwCode());
						ih30New.setLayerCode(layerCode);
						ih30New.setStatus("00");
						ih30New.setIfImport("B");
						session.save(ih30New);
						
						Map<String,Object> param = new HashMap<String,Object>();
						param.put("ih30", ih30New);
						param.put("appId", "ihjc11Service");
						param.put("appidAction", "ADD");
						param.put("changeNo", "买断入库");
						ihjcComm01Dao.saveTbih31(param);
					}else{
						Tbih30 ih30 = listIh30.get(0);

						if(ih30.getCustName().equals(ih60a.getNewCustName())){
							flag = false;
							msg += ih60a.getLabelNo()+ "新货主名称与旧货主相同，不发生变化";
							continue;
						}
						Tbih60 ih60 = new Tbih60();
						AppUtils.copyProperties(ih60a, ih60);
						ih60.setIh60Id(AppUtils.generateUniqueKey());
						ih60.setCompId(compId);
						ih60.setCreateEmp(AppUtils.getUserName());
						ih60.setCreateDate(AppUtils.getCurrentDate()); 
						ih60.setOldCustName(ih30.getCustName());
						ih60.setOldCustNo(ih30.getCustNo());
						ih60.setNewCustName(ih60a.getNewCustName());
						ih60.setNewCustNo(ih60a.getNewCustNo());
						ih60.setZsTime(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
						ih60.setZsEmp(AppUtils.getUserName());
						if(ih60a.getLadingNo().length()>=10){//计费日
							ladingDate = "20"+ih60a.getLadingNo().substring(ih60a.getLadingNo().length()-10, ih60a.getLadingNo().length()-4);
						}
						ih60.setLadingDate(ladingDate);
						ih60.setJfr(ladingDate);
						ih60.setAge(ihjcComm01Dao.getBetweenDay(ih30).toString());
						ih60.setBatchFlag("Y");
						session.save(ih60);
						
						ih30.setCustName(ih60a.getNewCustName());
						ih30.setCustNo(ih60a.getNewCustNo());
						ih30.setLadingNo(ih60a.getLadingNo());
						ih30.setJfr(ladingDate);					
						session.update(ih30);
						
						Map<String,Object> param = new HashMap<String,Object>();
						param.put("ih30", ih30);
						param.put("appId", "ihjc60Service");
						param.put("appidAction", "UPDATE");
						param.put("changeNo", "货权转授");
						ihjcComm01Dao.saveTbih31(param);
					}
				}
				
				ih60a.setStatus("10");
				session.update(ih60a);
			}
		} finally {
			session.flush();
			
		}
		prop.put("flag", flag);
		prop.put("msg", msg);
		return prop;
	}
	
	@DataResolver
	public Properties saveTbih60a(Collection<Tbih60a> datasTbih60a,Map<String,Object> parameter) throws Exception {
		Session session = ihjc60Dao.getSession();
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for (Tbih60a ih60a : datasTbih60a) {
				EntityState state = EntityUtils.getState(ih60a);
				if (state.equals(EntityState.DELETED)) {
					if(StringHelper.isNotEmpty(ih60a.getStatus())&& "10".equals(ih60a.getStatus())){
						flag = false;
						prop.put("msg", "转授单已经确认，不能删除");
						break;
					}
					session.delete(ih60a);
				}
			}
		}finally {
			session.flush();
			
		}
		
		prop.put("flag", flag);
		return prop;
	}
	@DataResolver
	public void saveTbih30(Collection<Tbih30> datasTbih30,Map<String,Object> parameter) throws Exception {
		String nhz = AppUtils.toValidString(parameter.get("nhz"));//新货主
		String nhzName = AppUtils.toValidString(parameter.get("nhzName"));//新货主
		String fkdwmc = AppUtils.toValidString(parameter.get("fkdwmc"));//付款单位名称
		String zhd = AppUtils.toValidString(parameter.get("zhd"));//转授单号
		String lhRq = AppUtils.toValidString(parameter.get("lhRq"));//来函日期
		BigDecimal jg =AppUtils.getBigDecimal(parameter.get("jg"));//变更价格
		String ifJs = AppUtils.toValidString(parameter.get("ifJs"));//是否结算
		String jsCqfy = AppUtils.toValidString(parameter.get("jsCqfy"));//结算超期费
		String cqfFkdwmc = AppUtils.toValidString(parameter.get("cqfFkdwmc"));//超期费用付款单位名称
		String cqfFkdwbh = AppUtils.toValidString(parameter.get("cqfFkdwbh"));//超期费用付款单位编号
		String compId = AppUtils.getCompId();
		BigDecimal cqf = BigDecimal.ZERO;
		BigDecimal zfy = BigDecimal.ZERO;
		String currentTime = AppUtils.getCurrentDateString("yyyyMMdd hh:mm:ss");
		String ownnerCompNo = "";
		Session session = ihjc60Dao.getSession();
		try {
			String sqlMaxZhd = "select max(zhd_) as zhd from Tbih60 where comp_Id_ = ? and substr(zs_sj_,1,8)=?";
			List<Map<String,Object>> listMaxZhd = ihjc60Dao.getJdbcTemplate().queryForList(sqlMaxZhd,
					compId,currentTime.substring(0, 8));
			if(StringHelper.isEmpty(zhd)){
			if (!CollectionUtils.isEmpty(listMaxZhd) && listMaxZhd.get(0).get("zhd") != null) {
				String max = listMaxZhd.get(0).toString();
				int i = Integer.valueOf(max.substring(9)) + 1;
				String len = ("000" + i).substring(("000" + i).length() - 3,
						("000" + i).length());
				zhd = max.substring(0, 9) + len;
			    } else {
				zhd = "Z" + AppUtils.getCurrentDateString("yyyyMMdd") + "001";
			   }
			}
			for (Tbih30 ih30 : datasTbih30) {
				ownnerCompNo = ih30.getOwnnerCompNo();
				Long ts=getBetweenDay(ih30);
				Tbih60 ih60 = new Tbih60();
				AppUtils.copyProperties(ih30, ih60);
				ih60.setIh60Id(AppUtils.generateUniqueKey());
				ih60.setCompId(AppUtils.getCompId());
				ih60.setZhd(zhd);//转授单号
				ih60.setLabelNo(ih30.getLabelNo());//标签号
				ih60.setNewCustNo(nhz);//新货主
				ih60.setOldCustNo(ih30.getOwnnerCompNo());//老货主
				ih60.setWgt(ih30.getWgt());//件重
				ih60.setFlag("B");// 标签号转授标志
				ih60.setZsEmp(AppUtils.getUserName());
				ih60.setZsTime(AppUtils.getCurrentDateString("yyyyMMdd HHmmss"));
				ih60.setLadingDate(lhRq);//来函日期
				ih60.setZsPrice(jg);//变更价格
                BigDecimal sum = (AppUtils.getBigDecimal(ih30.getWgt())).multiply(jg);//计算转授费用
				if(sum.intValue() < sum.doubleValue())
				{
					sum = new BigDecimal(sum.intValue() + 1);//如果不满一块钱则按一块钱算
				}
				ih60.setZsAmt(sum);//转授费用
				ih60.setOverdueFlag(jsCqfy);//是否结算超期费
				ih60.setOverdueSettleType(ih30.getIsCq());//超期费用结算方式
				ih60.setAge(ts.toString());//库龄
				ih60.setArea(ih30.getArea());//区域
				ih60.setZsFlag(ifJs);//是否结算变更费
				if(jsCqfy.equals("Y")){
					ih60.setOverduePayCompNo(cqfFkdwmc);
					ih60.setOverduePayCompName(cqfFkdwmc);
					Map<String,Object> mapParam03a = new HashMap<String,Object>();
					mapParam03a.put("compId", compId);
					mapParam03a.put("cuscode", ih30.getOwnnerCompNo());
					mapParam03a.put("startdate", Integer.valueOf(ts.toString()));
					mapParam03a.put("stopdate", Integer.valueOf(ts.toString()));
					List<Tbih03a> listIh03a=ihjc60Dao.queryList03a(mapParam03a);
					if(listIh03a.size()==1){//找到唯一的一条价格记录
						Tbih03a ih03a=listIh03a.get(0);
						//超期单价=超期基价+超期单价
						BigDecimal cqPrice=ih03a.getOverdueStdPrice().add(ih03a.getOverduePrice());
						//超期费= 超期单价*重量
						cqf=cqf.add(cqPrice).multiply(ih30.getWgt());
						
						ih30.setJfr(currentTime.substring(0, 8));
					}else if(listIh03a.size()>1){
						throw new AppException("找到多条超期费定义，请先检查定义价格");
					}
				}
				ih30.setOwnnerCompNo(nhz);//转授后的货主
				ih30.setOwnnerCompName(nhzName);//转授后的货主名称
				ih30.setIfzdbj("Z");//标记，已经进行过一次转单 占时无此字段
				zfy = zfy.add(ih60.getZsPrice().multiply(ih60.getWgt()));
				session.save(ih60);
				session.update(ih30);
			}
			
			if(jsCqfy.equals("Y")){
				Map<String,Object> mapParam02 = new HashMap<String,Object>();
				mapParam02.put("compId", compId);
				mapParam02.put("custNo", ownnerCompNo);
				List<Tbih02> listIh02 = ihjc02Dao.queryList02(mapParam02);	
				for(Tbih02 ih02 : listIh02){
					if(ih02.getBalancenum()!=null){
						if(ih02.getBalancenum().compareTo(cqf)>=0){
							Tbih50 ih50 = new Tbih50();
							ih50.setIh50Id(AppUtils.generateUniqueKey());
							ih50.setCompId(compId);
							ih50.setCustNo(ih02.getCustNo());
							ih50.setJkje(new BigDecimal(0).subtract(cqf));
							ih50.setJkrq(AppUtils
									.getCurrentDateString("yyyyMMdd HH:mm:ss"));
							ih50.setSkr(AppUtils.getUserName());
							ih50.setSy("3");
							ih50.setBalance(ih02.getBalancenum() == null ? new BigDecimal(
									"0") : ih02.getBalancenum().add(ih50.getJkje()));
							ih02.setBalancenum(ih02.getBalancenum().subtract(cqf));//设置付款单位的余额
							session.update(ih02);
							session.save(ih50);
						}else{
							throw new AppException("超期费支付单位"+ih02.getCustNo()+"费用不足,欠款" + cqf.subtract(ih02.getBalancenum()));
						}
					}else{
						throw new AppException("超期费支付单位"+ih02.getCustNo()+"费用不足,欠款" + cqf);
					}
				}
			}
			
			if(ifJs.equals("1")){
				Map<String,Object> mapParam02 = new HashMap<String,Object>();
				mapParam02.put("compId", compId);
				mapParam02.put("custNo", ownnerCompNo);
				List<Tbih02> listIh02 = ihjc02Dao.queryList02(mapParam02);	
				for (Tbih02 ih02 : listIh02) {
					if (ih02.getBalancenum() != null){
						if(ih02.getBalancenum().compareTo(zfy) >= 0) {
							Tbih50 ih50 = new Tbih50();
							ih50.setIh50Id(AppUtils.generateUniqueKey());
							ih50.setCompId(compId);
							ih50.setCustNo(ih02.getCustNo());
							ih50.setJkje(new BigDecimal(0).subtract(zfy));
							ih50.setJkrq(AppUtils
									.getCurrentDateString("yyyyMMdd HH:mm:ss"));
							ih50.setSkr(AppUtils.getUserName());
							ih50.setSy("3");
							ih50.setBalance(ih02.getBalancenum() == null ? new BigDecimal(
									"0") : ih02.getBalancenum().add(ih50.getJkje()));
							
							ih02.setBalancenum(ih02.getBalancenum() == null ? new BigDecimal(
									"0") : ih02.getBalancenum().add(ih50.getJkje()));// 设置付款单位"资金余额"
							session.update(ih02);
							session.save(ih50);
						} else {
							throw new AppException("过户费支付单位:"+ih02.getCustNo()+"费用不足，欠款"
									+ zfy.subtract(ih02.getBalancenum()) + ".");
						}
					}else{
						throw new AppException("过户费支付单位:"+ih02.getCustNo()+"费用不足，欠款"+ zfy+ ".");
					}
				}
			}
		} finally {
			session.flush();
			
		}
	}
	/**
	 * 获取"货品"至当前(如果已出库,则为出库时间)的间隔天数(库龄)
	 * @param ih16
	 * @param ih30
	 * @throws ParseException
	 * @throws Exception 
	 */
	public Long getBetweenDay(Tbih30 ih30) throws ParseException, Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		//TODO 对于人工输入的，目前直接跳过
		if (ih30.getInDate() == null && ih30.getJfr()==null){//入库时间和计费日为空
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
		List<Tbih16> listih16=ihjc60Dao.query("from Tbih16 where ladingNo='"+ih30.getLadingNo()+"'");//根据提货号
		if(!CollectionUtils.isEmpty(listih16)&&listih16.get(0)!=null){
			Tbih16 ih16=listih16.get(0);//用户委托函整体信息表
			if(StringHelper.isNotEmpty(ih16.getFkfs())&&ih16.getFkfs().equals("RJ")){
				if(StringHelper.isNotEmpty(ih16.getDeliveryDate())&& StringHelper.isEmpty(ih16.getStatus())){
					dateNow=df.parse(ih16.getDeliveryDate());
					ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
				}else{
					ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
					ts=ts-NumberUtils.toLong(listih16.get(0).getThkxr());
				}
			}else{
				dateNow=df.parse(ih16.getDeliveryDate());
				ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
			}
			
//			ihjc60Dao.evict(listih16.get(0));
		}else{
			ts=(dateNow.getTime() - dateJFR.getTime()) / (1000 * 24 * 3600);
		}
		ts=ts>=0?ts:0;
		return ts+1;//间隔天
	}	

}

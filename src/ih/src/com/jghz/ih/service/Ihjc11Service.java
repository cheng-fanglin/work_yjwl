package com.jghz.ih.service;

import java.math.BigDecimal;
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

import com.base.exception.AppException;
import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc11Dao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih11;
import com.jghz.ih.entity.Tbih30;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih11对象信息的保存操作
 */
@Transactional
@Component("ihjc11Service")
public class Ihjc11Service {
	@Resource
	private Ihjc11Dao ihjc11Dao;
	
	@Resource
	private Ihjc30Dao ihjc30Dao;

	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	@DataProvider
	public void loadTbih11(Page<Tbih11> page, Map<String, Object> parameter) throws Exception {
		ihjc11Dao.pagingQuery(page,parameter);
	}
	
	@DataResolver
	public Properties saveTbih11(Collection<Tbih11> datas) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		Map<String,Object> mapNo = new HashMap<String,Object>();
		mapNo.put("compId", AppUtils.getCompId());
		for (Tbih11 ih11 : datas) {
				EntityState state = EntityUtils.getState(ih11);
				if (state.equals(EntityState.NEW)) {
					ih11.setIh11Id(AppUtils.generateUniqueKey());
					ih11.setCompId(AppUtils.getCompId());
					if(StringHelper.isNotEmpty(ih11.getCustNo())){
						ih11.setOwnnerCompNo(ih11.getCustNo());
					}
					if(StringHelper.isNotEmpty(ih11.getCustName())){
						ih11.setOwnnerCompName(ih11.getCustName());
					}
					if(StringHelper.isEmpty(ih11.getInNo())){
						ih11.setInNo(ihjcComm01Dao.getInNo(mapNo));
					}
					if(StringHelper.isEmpty(ih11.getLabelNo())){
						ih11.setLabelNo(ihjcComm01Dao.getLabelNo(mapNo));
					}
					if(StringHelper.isEmpty(ih11.getInType())){
						ih11.setInType("A");
					}
					if(StringHelper.isEmpty(ih11.getInDate())){
						ih11.setInDate(AppUtils.getCurrentDateString("yyyyMMdd"));
					}
					if(StringHelper.isEmpty(ih11.getInEmp())){
						ih11.setInEmp(AppUtils.getUserName());
					}
					ih11.setStatus("00");
					ihjc11Dao.save(ih11);
				}
				if (state.equals(EntityState.MODIFIED)) {
					if(!"10".equals(ih11.getStatus())){
						ihjc11Dao.update(ih11);
					}else{
						throw new AppException("标签号"+ih11.getLabelNo()+"已确认状态，不能修改");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc11Dao.delete(ih11);
				}
			}

		prop.put("flag", flag);
		return prop;
	}
	
	@Expose
	public Properties savewareQwCode(Map<String,Object> parameters) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		Collection<Tbih11> ListIh11 = (Collection<Tbih11>) parameters.get("ListIh11");
		String wareQwCode = (String) parameters.get("wareQwCode");
		String liftingEmp = (String) parameters.get("liftingEmp");
		String craneDriver = (String) parameters.get("craneDriver");
		String liftingTeam = (String) parameters.get("liftingTeam");
		String productName = (String) parameters.get("productName");
		
		for (Tbih11 ih11 : ListIh11) {
				if(!"10".equals(ih11.getStatus())){
					if(StringHelper.isNotEmpty(wareQwCode)){
						ih11.setWareQwCode(wareQwCode);
					}
					if(StringHelper.isNotEmpty(liftingEmp)){
						ih11.setLiftingEmp(liftingEmp);
					}
					if(StringHelper.isNotEmpty(craneDriver)){
						ih11.setCraneDriver(craneDriver);
					}
					if(StringHelper.isNotEmpty(liftingTeam)){
						ih11.setLiftingTeam(liftingTeam);
					}
					if(StringHelper.isNotEmpty(productName)){
						ih11.setProductName(productName);
					}
					ihjc11Dao.update(ih11);
				}
			}

		
		prop.put("flag", flag);
		return prop;
	}
	@Expose
	public Properties saveConfirm(Map<String,Object> parameters) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		Collection<Tbih11> ListIh11 = (Collection<Tbih11>) parameters.get("ListIh11");
		String status = (String) parameters.get("status");
		String jfr="";
		String kb="";
		for (Tbih11 ih11 : ListIh11) {
				if("10".equals(ih11.getStatus())){
					throw new AppException("已确认，不能重复操作");
				}
				if(StringHelper.isEmpty(ih11.getWareQwCode())){
					throw new AppException("库位为空，不能确认");
				}
				Map<String,Object> mapParam = new HashMap<String,Object>();
				mapParam.put("inNo", ih11.getInNo());
				mapParam.put("labelNo", ih11.getLabelNo());
				mapParam.put("wareQwCode", ih11.getWareQwCode());
				
				//计算所在层数
				String layerCode = "";
				if(StringHelper.isNotEmpty(ih11.getLayerCode())){
					layerCode =String.valueOf((Integer.valueOf(ih11.getLayerCode())+Integer.valueOf(ihjc30Dao.queryMaxLayerCode(mapParam))));
				}
				
				List<Tbih30> listIh30 = ihjc30Dao.queryList(mapParam);
				if(CollectionUtils.isEmpty(listIh30)){
					Tbih30 ih30New = new Tbih30();
					AppUtils.copyProperties(ih11, ih30New);
					ih30New.setIh30Id(AppUtils.generateUniqueKey());
					ih30New.setInUnitWgt(ih11.getUnitWgt());
					ih30New.setInWgt(ih11.getWgt());
					ih30New.setMaxWgt(ih11.getWgt());
					if(ih11.getNum()==null||ih11.getNum().compareTo(BigDecimal.ZERO)==0){
						ih30New.setNum(new BigDecimal("1"));
					}
					if(StringHelper.isNotEmpty(ih30New.getLadingNo())&&ih30New.getLadingNo().length()>=10){//计费日
						jfr = "20"+ih30New.getLadingNo().substring(ih30New.getLadingNo().length()-10, ih30New.getLadingNo().length()-4);
					}else{
						jfr =ih11.getInDate().length()>8?ih11.getInDate().substring(0, 8):ih11.getInDate();
					}
					
					ih30New.setJfr(jfr);
					ih30New.setWareQwCode(ih11.getWareQwCode());
					ih30New.setLayerCode(layerCode);
					kb = ihjcComm01Dao.getKB(ih30New);
					ih30New.setKb(kb);
					ih30New.setStatus("00");
					ih30New.setIfImport("A");
					
					ihjc11Dao.save(ih30New);
					
					Map<String,Object> param = new HashMap<String,Object>();
					param.put("ih30", ih30New);
					param.put("appId", "ihjc11Service");
					param.put("appidAction", "Add");
					param.put("changeNo", "转库接收");
					ihjcComm01Dao.saveTbih31(param);
				}else{
					Tbih30 ih30 = listIh30.get(0);
					ih30.setInUnitWgt(ih11.getUnitWgt());
					ih30.setInWgt(ih11.getWgt());
					ih30.setMaxWgt(ih11.getWgt());
					if(StringHelper.isNotEmpty(ih30.getLadingNo())&&ih30.getLadingNo().length()>=10){//计费日
						jfr = "20"+ih30.getLadingNo().substring(ih30.getLadingNo().length()-10, ih30.getLadingNo().length()-4);
					}else{
						jfr =ih11.getInDate().length()>8?ih11.getInDate().substring(0, 8):ih11.getInDate();
					}
					ih30.setJfr(jfr);
					ih30.setWareQwCode(ih11.getWareQwCode());
					ih30.setLayerCode(layerCode);
					kb = ihjcComm01Dao.getKB(ih30);
					ih30.setKb(kb);
					ih30.setStatus("00");
					ih30.setOutCraneDriver("");
					ih30.setOutDate("");
					ih30.setOutEmp("");
					ih30.setOutLiftingEmp("");
					ih30.setOutLiftingTeam("");
					ih30.setOutNo("");
					ih30.setOutWgt(BigDecimal.ZERO);
					ih30.setIfImport("A");
					ihjc11Dao.update(ih30);
					
					Map<String,Object> param = new HashMap<String,Object>();
					param.put("ih30", ih30);
					param.put("appId", "ihjc11Service");
					param.put("appidAction", "Update");
					param.put("changeNo", "转库接收");
					ihjcComm01Dao.saveTbih31(param);
				}
				
				ih11.setLayerCode(layerCode);
				ih11.setStatus(status);
				ihjc11Dao.update(ih11);
				
			}

		
		prop.put("flag", flag);
		return prop;
	}

	@Expose
	public Properties saveCancle(Map<String,Object> parameters) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		Collection<Tbih11> ListIh11 = (Collection<Tbih11>) parameters.get("ListIh11");
		String status = (String) parameters.get("status");
		for (Tbih11 ih11 : ListIh11) {
				if("10".equals(ih11.getStatus())){
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("inNo", ih11.getInNo());
					mapParam.put("labelNo", ih11.getLabelNo());
					List<Tbih30> listIh30 = ihjc30Dao.queryList(mapParam);
					for(Tbih30 ih30:listIh30){
						if("00".equals(ih30.getStatus())){
							ihjc11Dao.delete(ih30);
						}else{
							throw new AppException("存货不是初始状态，不能取消确认");
						}
					}
				}
				ih11.setStatus(status);
				ihjc11Dao.update(ih11);
			}
		
		prop.put("flag", flag);
		return prop;
	}
	
}
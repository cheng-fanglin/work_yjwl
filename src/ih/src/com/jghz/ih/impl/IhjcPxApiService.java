package com.jghz.ih.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.exception.AppException;
import com.base.util.AppUtils;
import com.jghz.ih.dao.Ihjc11Dao;
import com.jghz.ih.dao.Ihjc13Dao;
import com.jghz.ih.dao.Ihjc19Dao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih11;
import com.jghz.ih.entity.Tbih13;
import com.jghz.ih.entity.Tbih19;
import com.jghz.ih.entity.Tbih30;


@Component
public class IhjcPxApiService extends BaseDao{
	@Resource
	private Ihjc19Dao ihjc19Dao;
	
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	@Resource
	private Ihjc13Dao ihjc13Dao;
	
	@Resource
	private Ihjc11Dao ihjc11Dao;
	
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	/**
	 * 喷涂生产
	 * 生产完后标签号还是原来的标签号，仅外观发生变化
	 * 在库存中做移库处理，从保存仓库到加工仓库
	 * */
	public void saveTbihPT(List<Map<String, Object>> datas30,Map<String, Object> parameter) throws Exception {
		String zkCraneDriver = (String) parameter.get("craneDriver");
		String zkLiftingEmp = (String) parameter.get("liftingEmp");
		String zkLiftingTeam = (String) parameter.get("liftingTeam");
		String zkEmp = (String) parameter.get("emp");
		String zkDate = (String) parameter.get("date");
			for (Map<String, Object> OldIh30 : datas30) {
				String wareQwCodeOld = (String) OldIh30.get("wareQwCodeOld");
				Map<String,Object> map30 = new HashMap<String,Object>();
				AppUtils.copyProperties(OldIh30, map30);
				Tbih30 ih30 = ihjc30Dao.getOneTbih30(map30);
				if("00".equals(ih30.getStatus())){
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("compId", ih30.getCompId());
					mapParam.put("wareQwCode", wareQwCodeOld);
					//计算所在层数
					String layerCode = "";
					if(StringHelper.isNotEmpty(ih30.getLayerCodeOld())){
						layerCode =String.valueOf((Integer.valueOf(ih30.getLayerCodeOld())+Integer.valueOf(ihjc30Dao.queryMaxLayerCode(mapParam))));
					}
					Tbih13 tbih13 = new Tbih13();
					AppUtils.copyProperties(ih30, tbih13);
					tbih13.setIh13Id(AppUtils.generateUniqueKey());
					tbih13.setCompId(AppUtils.getCompId());
					tbih13.setWareQwCodeOld(ih30.getWareQwCode());
					tbih13.setWareQwCode(wareQwCodeOld);
					tbih13.setLayerCodeOld(ih30.getLayerCode());
					tbih13.setLayerCode(layerCode);
					tbih13.setZkDate(zkDate);
					tbih13.setZkEmp(zkEmp);
					tbih13.setZkCraneDriver(zkCraneDriver);
					tbih13.setZkLiftingEmp(zkLiftingEmp);
					tbih13.setZkLiftingTeam(zkLiftingTeam);
					tbih13.setCreateDate(AppUtils.getCurrentDate());
					tbih13.setCreateEmp(AppUtils.getUserName());
					tbih13.setUpdateDate(null);
					tbih13.setUpdateEmp(null);
					tbih13.setVersion(0);
					ihjc13Dao.save(tbih13);
					
					ih30.setLayerCode(layerCode);
					ih30.setWareQwCode(wareQwCodeOld);
					ihjc13Dao.update(ih30);
					
					Map<String,Object> param = new HashMap<String,Object>();
					param.put("ih30", ih30);
					param.put("appId", "ihjcPxApiService");
					param.put("appidAction", "Update");
					param.put("changeNo", "生产喷涂");
					ihjcComm01Dao.saveTbih31(param);
				}
			}
	}
	
	/**
	 * 喷涂生产取消
	 * 喷涂生产逆向操作
	 * */
	public void saveTbihPTCancle(List<Map<String, Object>> datas30,Map<String, Object> parameter) throws Exception {
		for (Map<String, Object> OldIh30 : datas30) {
			Map<String,Object> map30 = new HashMap<String,Object>();
			AppUtils.copyProperties(OldIh30, map30);
			Tbih30 ih30 = ihjc30Dao.getOneTbih30(map30);
			if("00".equals(ih30.getStatus())){
				List<Tbih13> listIh13=ihjc13Dao.queryList(OldIh30);
				if(CollectionUtils.isNotEmpty(listIh13)&&listIh13.get(0)!=null){
					Tbih13 ih13 = listIh13.get(0);
					ih30.setLayerCode(ih13.getLayerCodeOld());
					ih30.setWareQwCode(ih13.getWareQwCodeOld());
					ihjc13Dao.update(ih30);
					ihjc13Dao.delete(ih13);
					Map<String,Object> param = new HashMap<String,Object>();
					param.put("ih30", ih30);
					param.put("appId", "ihjcPxApiService");
					param.put("appidAction", "Update");
					param.put("changeNo", "生产喷涂取消");
					ihjcComm01Dao.saveTbih31(param);
				}
			}else{
				throw new AppException("标签号"+ih30.getLabelNo()+"已配货或出库，不能撤销");
			}
		}
	}
	
	/**
	 * 剪切生产
	 * 生产会将一个标签的钢板分为多个不同的标签
	 * 在库存中，原钢卷做生产出库，新钢卷做生产入库
	 * */
	public void saveTbihJQ(List<Map<String, Object>> datas30,Map<String, Object> parameter) throws Exception {
		String labelNo = (String) parameter.get("labelNo");
		String craneDriver = (String) parameter.get("craneDriver");
		String liftingEmp = (String) parameter.get("liftingEmp");
		String liftingTeam = (String) parameter.get("liftingTeam");
		String emp = (String) parameter.get("emp");
		String date = (String) parameter.get("date");
		//原钢卷号出库
		if(StringHelper.isNotEmpty(labelNo)){
			Map<String,Object> map30 = new HashMap<String,Object>();
			map30.put("labelNo", labelNo);
			map30.put("compId", AppUtils.getCompId());
			Tbih30 ih30F = ihjc30Dao.getOneTbih30(map30);
			if("00".equals(ih30F.getStatus())){
				String outNo=ihjcComm01Dao.getOutNo(new HashMap(){{put("compId",AppUtils.getCompId());}});
				Tbih19 ih19 = new Tbih19();
				AppUtils.copyProperties(ih30F, ih19);
				ih19.setIh19Id(AppUtils.generateUniqueKey());
				ih19.setCompId(AppUtils.getCompId());	
				ih19.setOutNo(outNo);
				ih19.setOutType("S");//生产出库
				ih19.setOutWareCode(ih30F.getWareQwCode().substring(0, 2));
				ih19.setLadingNo(ih30F.getLadingNo());
				ih19.setZcr(emp);
				ih19.setLiftingTeam(liftingTeam);
				ih19.setLiftingEmp(liftingEmp);
				ih19.setCraneDriver(craneDriver);
				ih19.setOutEmp(emp);
				ih19.setOutDate(date);
				ih19.setStatus("20");
				ih19.setCreateEmp(AppUtils.getUserName());
				ih19.setCreateTime(AppUtils.getCurrentDate());
				ihjc30Dao.save(ih19);
				
				ih30F.setStatus("30");//生产消耗
				ih30F.setHpZt("30");//生产消耗
				ih30F.setOutLiftingTeam(ih19.getLiftingTeam());
				ih30F.setOutLiftingEmp(ih19.getLiftingEmp());
				ih30F.setOutCraneDriver(ih19.getCraneDriver());
				ih30F.setOutWgt(ih19.getWgt());
				ih30F.setOutDate(AppUtils.getCurrentDateString("yyyyMMdd"));
				ih30F.setOutEmp(AppUtils.getUserInfo().getCname());
				ih30F.setSettleNo(ih19.getSettleNo());
				ihjc30Dao.update(ih30F);
				
				Map<String,Object> param31 = new HashMap<String,Object>();
				param31.put("ih30", ih30F);
				param31.put("appId", "ihjcPxApiService");
				param31.put("appidAction", "Update");
				param31.put("changeNo", "生产剪切");
				ihjcComm01Dao.saveTbih31(param31);
			}else{
				throw new AppException("原标签号"+ih30F.getLabelNo()+"已经配货或出库");
			}
			//新生成的标签号入库
			String jfr="";
			String kb="";
			for (Map<String, Object> mapIh30 : datas30) {
				String wareQwCode = (String) mapIh30.get("wareQwCode");
				Tbih30 ih30= new Tbih30();
				AppUtils.copyProperties(ih30F, ih30);
				AppUtils.copyProperties(mapIh30, ih30);
				ih30.setIh30Id(AppUtils.generateUniqueKey());
				ih30.setCompId(AppUtils.getCompId());
				ih30.setLabelNoF(ih30F.getLabelNo());
				ih30.setInWgt(ih30.getWgt());
				ih30.setMaxWgt(ih30.getWgt());
				if(ih30.getNum()==null||ih30.getNum().compareTo(BigDecimal.ZERO)==0){
					ih30.setNum(new BigDecimal("1"));
				}
				
				if(StringHelper.isNotEmpty(ih30.getLadingNo())&&ih30.getLadingNo().length()>=10){//计费日
					jfr = "20"+ih30.getLadingNo().substring(ih30.getLadingNo().length()-10, ih30.getLadingNo().length()-4);
				}else{
					jfr =ih30.getInDate().length()>8?ih30.getInDate().substring(0, 8):ih30.getInDate();
				}
				
				ih30.setJfr(jfr);
				ih30.setWareQwCode(wareQwCode);
				Map<String,Object> mapParam = new HashMap<String,Object>();
				mapParam.put("wareQwCode", wareQwCode);
				
				//计算所在层数
				String layerCode = "";
				if(StringHelper.isNotEmpty(ih30.getLayerCode())){
					layerCode =String.valueOf((Integer.valueOf(ih30.getLayerCode())+Integer.valueOf(ihjc30Dao.queryMaxLayerCode(mapParam))));
				}
				ih30.setLayerCode(layerCode);
				kb = ihjcComm01Dao.getKB(ih30);
				ih30.setKb(kb);
				ih30.setStatus("00");
				
				ihjc30Dao.save(ih30);
				
				Map<String,Object> param = new HashMap<String,Object>();
				param.put("ih30", ih30);
				param.put("appId", "ihjcPxApiService");
				param.put("appidAction", "Add");
				param.put("changeNo", "生产剪切");
				ihjcComm01Dao.saveTbih31(param);
				
				Tbih11 tbih11 = new Tbih11();
				AppUtils.copyProperties(ih30, tbih11);
				tbih11.setIh11Id(AppUtils.generateUniqueKey());
				tbih11.setCompId(AppUtils.getCompId());
				tbih11.setLayerCode(layerCode);
				tbih11.setInDate(date);
				tbih11.setInEmp(emp);
				tbih11.setCraneDriver(craneDriver);
				tbih11.setLiftingEmp(liftingEmp);
				tbih11.setLiftingTeam(liftingTeam);
				tbih11.setCreateDate(AppUtils.getCurrentDate());
				tbih11.setCreateEmp(AppUtils.getUserName());
				tbih11.setStatus("10");
				tbih11.setUpdateDate(null);
				tbih11.setUpdateEmp(null);
				tbih11.setVersion(0);
				ihjc11Dao.save(tbih11);
			}
		}else{
			throw new AppException("生产传入的标签号为空");
		}
	}
	
	/**
	 * 剪切生产取消
	 * 生产会将一个标签的钢板分为多个不同的标签
	 * 在库存中，原钢卷做生产出库撤销，新钢卷做生产入库撤销
	 * */
	public void saveTbihJQCancle(List<Map<String, Object>> datas30,Map<String, Object> parameter) throws Exception {
		String labelNo = (String) parameter.get("labelNo");
			//原钢卷号出库
			if(StringHelper.isNotEmpty(labelNo)){
				Map<String,Object> map30 = new HashMap<String,Object>();
				map30.put("labelNo", labelNo);
				map30.put("compId", AppUtils.getCompId());
				Tbih30 ih30F = ihjc30Dao.getOneTbih30(map30);
				if("30".equals(ih30F.getStatus())){
					map30.put("outNo", ih30F.getOutNo());
					Tbih19 ih19 = ihjc19Dao.getOneTbih19(map30);
					ih19.setStatus("31");//撤销状态
					ih19.setUpdateEmp(AppUtils.getUserName());
					ih19.setUpdateTime(AppUtils.getCurrentDate());
					ihjc30Dao.update(ih19);
					
					ih30F.setStatus("00");//生产消耗
					ih30F.setHpZt("00");//生产消耗
					ih30F.setOutLiftingTeam("");
					ih30F.setOutLiftingEmp("");
					ih30F.setOutCraneDriver("");
					ih30F.setOutWgt(BigDecimal.ZERO);
					ih30F.setOutDate("");
					ih30F.setOutEmp("");
					ih30F.setSettleNo("");
					ihjc30Dao.update(ih30F);
					
					Map<String,Object> param31 = new HashMap<String,Object>();
					param31.put("ih30", ih30F);
					param31.put("appId", "ihjcPxApiService");
					param31.put("appidAction", "Update");
					param31.put("changeNo", "生产剪切取消");
					ihjcComm01Dao.saveTbih31(param31);
				}else{
					throw new AppException("原标签号"+ih30F.getLabelNo()+"不是生产消耗状态，不能取消");
				}
				//新生成的标签号入库
				for (Map<String, Object> mapIh30 : datas30) {
					Tbih30 ih30 = ihjc30Dao.getOneTbih30(mapIh30);
					ihjc30Dao.delete(ih30);
					
					Map<String,Object> param = new HashMap<String,Object>();
					param.put("ih30", ih30);
					param.put("appId", "ihjcPxApiService");
					param.put("appidAction", "Delete");
					param.put("changeNo", "生产剪切取消");
					ihjcComm01Dao.saveTbih31(param);
					
					Tbih11 ih11 = ihjc11Dao.getOneTbih11(mapIh30);
					ihjc11Dao.delete(ih11);
							
				}
			}else{
				throw new AppException("生产传入的标签号为空");
			}
			
		
	}
}

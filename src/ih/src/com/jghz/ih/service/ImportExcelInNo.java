/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.jghz.dc.service
 *
 *    Filename:    uploadExcelCustNo.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     Administrator
 *
 *    @version:    1.0.0
 *
 *    Create at:   2016-12-5 下午3:53:58
 *
 *    Revision:
 *
 *    2016-12-5 下午3:53:58
 *        - first revision
 *
 *****************************************************************/
package com.jghz.ih.service;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.exception.AppException;
import com.base.util.AppUtils;
import com.bstek.bdf2.importexcel.model.CellWrapper;
import com.bstek.bdf2.importexcel.model.ExcelDataWrapper;
import com.bstek.bdf2.importexcel.model.ExcelModel;
import com.bstek.bdf2.importexcel.model.RowWrapper;
import com.bstek.bdf2.importexcel.processor.IExcelProcessor;
import com.bstek.bdf2.importexcel.processor.impl.DefaultExcelProcessor;
import com.jghz.dc.dao.Dcjcd1Dao;
import com.jghz.dc.entity.Tbdcd1;
import com.jghz.ih.dao.Ihjc01Dao;
import com.jghz.ih.dao.Ihjc01aDao;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc11Dao;
import com.jghz.ih.dao.Ihjc22Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih01;
import com.jghz.ih.entity.Tbih01a;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih11;
import com.jghz.ih.entity.Tbih22;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelInNo.BEAN_ID)
public class ImportExcelInNo implements IExcelProcessor {
	public static final String BEAN_ID = "ih.ImportExcelInNo";
	public final Log logger = LogFactory.getLog(ImportExcelInNo.class);
	@Resource
	private Ihjc11Dao ihjc11Dao;
	@Resource
	private Ihjc02Dao ihjc02Dao;
	@Resource
	private Dcjcd1Dao dcjcd1Dao;
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "入库信息导入模板";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek.bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		Session session = ihjc11Dao.getSession();
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		int count = 0;
		int rowIndex = 0;
		String compId=AppUtils.getCompId();
		Map<String,Object> mapNo = new HashMap<String,Object>();
		mapNo.put("compId", compId);
		String inNo=ihjcComm01Dao.getInNo(mapNo);
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();//获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbih11 tbih11 = new Tbih11();
			rowIndex =rowIndex+1;
			if(rowIndex ==1){
				continue;//第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();//获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {
				
				cellIndex = cellIndex +1;
				tbih11.setIh11Id(AppUtils.generateUniqueKey());
				tbih11.setCompId(compId);
				tbih11.setCreateEmp(AppUtils.getUserName());
				tbih11.setCreateDate(AppUtils.getCurrentDate()); 
				tbih11.setInNo(inNo);
				tbih11.setStatus("00");
				tbih11.setInType("A");
				tbih11.setInEmp(AppUtils.getUserName());
				tbih11.setInDate(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
				//设定每个字段的值
				if(cellIndex==1){ //标签编号2
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						if(AppUtils.isENum(AppUtils.toValidStringTrim(columnValue))){
							tbih11.setLabelNo(AppUtils.getBigDecimal(columnValue).toString());
						}else{
							tbih11.setLabelNo(AppUtils.toValidStringTrim(columnValue));
						}
					}
				}
				if(cellIndex==2){ //钢种6
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setSteelNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==3){//厚度7
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setThick(AppUtils.getBigDecimal(columnValue));
					}
				}
				if(cellIndex==4){ //宽度8
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setWidth(AppUtils.getBigDecimal(columnValue));
					}
				} 
				if(cellIndex==5){ //长度9
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setLength(AppUtils.getBigDecimal(columnValue));
					}
				}
				//规格 = 厚*宽*长
				tbih11.setSize(tbih11.getThick()+"*"+tbih11.getWidth()+"*"+tbih11.getLength());
				
				if(cellIndex==6){ //重量10
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setWgt(AppUtils.getBigDecimal(columnValue));
					}
				}
				
				if(cellIndex==7){//切/毛边11
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setQb(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==8){//尺寸信息(单定尺/双定尺)12
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setDc(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==9){ //客户名称14
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setCustName(AppUtils.toValidStringTrim(columnValue));
						
						//获取客户编码，不存在客户编码，就新增一个
						mapNo.put("custName", tbih11.getCustName());
						List<Tbih02> listIh02=ihjc02Dao.queryList02(mapNo);
						if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
							tbih11.setCustNo(listIh02.get(0).getCustNo());
						}else{
							String custNo=ihjc02Dao.genNo("Tbdcd1" ,"cust_No_",compId,"",4);
							tbih11.setCustNo(custNo);
							
							Tbih02 ih02 =new Tbih02();
							ih02.setIh02Id(AppUtils.generateUniqueKey());
							ih02.setCompId(compId);
							ih02.setCustNo(custNo);
							ih02.setCustName(AppUtils.toValidStringTrim(columnValue));
							session.save(ih02);
							
							Tbdcd1 dcd1 =new Tbdcd1();
							dcd1.setDcd1Id(AppUtils.generateUniqueKey());
							dcd1.setCompId(compId);
							dcd1.setCustNo(custNo);
							dcd1.setCustName(AppUtils.toValidStringTrim(columnValue));
							session.save(dcd1);
							
						}
						
					}
				}
	 			if(cellIndex==10){//订单编号15
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setOrderNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==11){ //订单编号+项次16
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setOrderItem(tbih11.getOrderNo()+"-"+AppUtils.addZero(AppUtils.getBigDecimal(columnValue).toString(),3));
					}
				}
				if(cellIndex==12){//库别19
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setInIx01No(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==13){//储位20
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setWareQwCode(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==14){//牌号22
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setGradeNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==15){//装车单号28
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setCheckNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==16){//接收日期30
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
						tbih11.setDeliveryTime(sd.format(columnValue));
						
						tbih11.setInDate(sd.format(columnValue));
					}
				}
				if(cellIndex==17){//车号31
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setCarNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==18){//层号32
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih11.setLayerCode(AppUtils.toValidStringTrim(columnValue));
					}
				}
			}
			String sqlIh11 = " from "+Tbih11.class.getName() +" where compId= '"+compId+"' and labelNo = '"+tbih11.getLabelNo()+"' " +
					" and inDate like '%"+AppUtils.getCurrentDateString("yyyyMMdd")+"%'  ";
			List<Tbih11> listIh11 = ihjc11Dao.query(sqlIh11);
			if(CollectionUtils.isEmpty(listIh11)){
				session.save(tbih11);
			}
			count++;
			
			session.flush();
		}
		
		logger.info("解析excel入库成功，导入[" + count + "]条数据！");
		
		session.flush();
		
		
		return count;
	}

}

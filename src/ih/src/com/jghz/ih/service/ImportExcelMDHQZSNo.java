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

import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.bdf2.importexcel.model.CellWrapper;
import com.bstek.bdf2.importexcel.model.ExcelDataWrapper;
import com.bstek.bdf2.importexcel.model.RowWrapper;
import com.bstek.bdf2.importexcel.processor.IExcelProcessor;
import com.jghz.dc.dao.Dcjcd1Dao;
import com.jghz.dc.entity.Tbdcd1;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc11Dao;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.Ihjc60Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih60a;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelMDHQZSNo.BEAN_ID)
public class ImportExcelMDHQZSNo implements IExcelProcessor {
	public static final String BEAN_ID = "ih.ImportExcelMDHQZSNo";
	public final Log logger = LogFactory.getLog(ImportExcelMDHQZSNo.class);
	@Resource
	private Ihjc11Dao ihjc11Dao;
	@Resource
	private Ihjc30Dao ihjc30Dao;
	@Resource
	private Ihjc02Dao ihjc02Dao;
	@Resource
	private Ihjc60Dao ihjc60Dao;
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
		return "货权转授信息(买断)导入模板";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek.bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		Session session = ihjc60Dao.getSession();
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		int count = 0;
		int rowIndex = 0;
		String compId=AppUtils.getCompId();
		Map<String,Object> mapNo = new HashMap<String,Object>();
		mapNo.put("compId", compId);
		String inNo=ihjcComm01Dao.getInNo(mapNo);
		String zhd=ihjc60Dao.genNo("Tbih60" ,"zhd_",compId,AppUtils.getCurrentDateString("yyMMdd"),3);
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();//获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbih60a tbih60a = new Tbih60a();
			rowIndex =rowIndex+1;
			if(rowIndex ==1){
				continue;//第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();//获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {
				
				cellIndex = cellIndex +1;
				
				//设定每个字段的值
				if(cellIndex==3){ //供货商3
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setOldCustName(AppUtils.toValidStringTrim(columnValue));
					}
				}
				
				if(cellIndex==4){ //材料名称4
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setProdTypeName(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==6){ //型号6
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setGradeNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==7){//厚度7
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setThick(AppUtils.getBigDecimal(columnValue));
					}
				}
				if(cellIndex==8){ //宽度8
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setWidth(AppUtils.getBigDecimal(columnValue));
					}
				} 
				if(cellIndex==9){ //长度9
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						String length=columnValue.toString();
						if(length.contains(",")){
							String leng[] = length.split(",");
							length="";
							for(int i=0;i<leng.length;i++){
								length=length+leng[i];
							}
						}
						tbih60a.setLength(AppUtils.getBigDecimal(length));
					}
				}
				//规格 = 厚*宽*长
				tbih60a.setSize(AppUtils.getPrettyNumber(tbih60a.getThick())
						+"*"+AppUtils.getPrettyNumber(tbih60a.getWidth())
						+"*"+AppUtils.getPrettyNumber(tbih60a.getLength()));
				
				if(cellIndex==11){ //数量11
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setNum(AppUtils.getBigDecimal(columnValue));
					}
				}
				if(cellIndex==12){ //重量12
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setWgt(AppUtils.getBigDecimal(columnValue));
					}
				}
				
				if(cellIndex==13){ //客户名称13
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setNewCustName(AppUtils.toValidStringTrim(columnValue));
						
						//获取客户编码，不存在客户编码，就新增一个
						mapNo.put("custName", tbih60a.getNewCustName());
						List<Tbih02> listIh02=ihjc02Dao.queryList02(mapNo);
						if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
							tbih60a.setNewCustNo(listIh02.get(0).getCustNo());
						}else{
							String custNo=ihjc02Dao.genNo("Tbdcd1" ,"cust_No_",compId,"",4);
							tbih60a.setNewCustNo(custNo);
							
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
				if(cellIndex==16){ //标签编号16
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						if(AppUtils.isENum(AppUtils.toValidStringTrim(columnValue))){
							tbih60a.setLabelNo(AppUtils.getBigDecimal(columnValue).toString());
						}else{
							tbih60a.setLabelNo(AppUtils.toValidStringTrim(columnValue));
						}
						
					}
				}
				
	 			if(cellIndex==17){//订单编号17
					Object columnValue = cellWrapper.getValue(); 
					if (AppUtils.isNotEmpty(columnValue)) {
						String orderItem= AppUtils.toValidStringTrim(columnValue);
						if(orderItem.contains("-")){
							String order[] = orderItem.split("-");
							tbih60a.setOrderNo(order[0]);
							tbih60a.setOrderItem(orderItem);
						}else{
							if(orderItem.length()>3){
								tbih60a.setOrderNo(orderItem.substring(0, orderItem.length()-3));
								tbih60a.setOrderItem(orderItem.substring(0, orderItem.length()-3)+"-"+orderItem.substring(orderItem.length()-3));
							}else{
								tbih60a.setOrderItem(orderItem);
							}	
						}	
					}
				}
				if(cellIndex==18){ //提单号
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih60a.setLadingNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				
			}
			
			tbih60a.setIh60aId(AppUtils.generateUniqueKey());
			tbih60a.setCompId(compId);
			tbih60a.setCreateEmp(AppUtils.getUserName());
			tbih60a.setCreateDate(AppUtils.getCurrentDate()); 
			tbih60a.setInNo(inNo);
			tbih60a.setZhd(zhd);
			tbih60a.setStatus("00");
			tbih60a.setZsEmp(AppUtils.getUserName());
			tbih60a.setZsTime(AppUtils.getCurrentDateString("yyyyMMdd HH:mm:ss"));
			if(StringHelper.isNotEmpty(tbih60a.getLabelNo())){
				session.save(tbih60a);
			}
			
			
			count++;
			
			session.flush();
		}
		
		logger.info("解析excel入库成功，导入[" + count + "]条数据！");
		
		session.flush();
		
		
		return count;
	}

}

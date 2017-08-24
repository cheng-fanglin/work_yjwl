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
import com.jghz.ih.dao.Ihjc43Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih01;
import com.jghz.ih.entity.Tbih01a;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih43;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelBillNo.BEAN_ID)
public class ImportExcelBillNo implements IExcelProcessor {
	public static final String BEAN_ID = "ih.ImportExcelBillNo";
	public final Log logger = LogFactory.getLog(ImportExcelBillNo.class);
	@Resource
	private Ihjc43Dao ihjc43Dao;
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
		return "发票信息导入模板";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek.bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		Session session = ihjc43Dao.getSession();
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		int count = 0;
		int rowIndex = 0;
		String compId=AppUtils.getCompId();
		Map<String,Object> mapNo = new HashMap<String,Object>();
		mapNo.put("compId", compId);
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();//获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbih43 tbih43 = new Tbih43();
			rowIndex =rowIndex+1;
			if(rowIndex ==1){
				continue;//第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();//获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {
				
				cellIndex = cellIndex +1;
				tbih43.setIh43Id(AppUtils.generateUniqueKey());
				tbih43.setCompId(compId);
				tbih43.setCreateEmp(AppUtils.getUserName());
				tbih43.setCreateDate(AppUtils.getCurrentDate()); 
	 			if(cellIndex==1){//设定每个字段的值
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setBillCompName(AppUtils.toValidStringTrim(columnValue));
						
						//获取客户编码，不存在客户编码，就新增一个
						mapNo.put("custName", tbih43.getBillCompName());
						List<Tbih02> listIh02=ihjc02Dao.queryList02(mapNo);
						if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
							tbih43.setBillCompNo(listIh02.get(0).getCustNo());
						}else{
							String custNo=ihjc02Dao.genNo("Tbdcd1" ,"cust_No_",compId,"",4);
							tbih43.setBillCompNo(custNo);
							
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
				if(cellIndex==2){ 
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setBillNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==3){ 
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setBillDate(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==4){
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setAmt(AppUtils.getBigDecimal(columnValue));
					}
				}
				if(cellIndex==5){ 
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setTax(AppUtils.getBigDecimal(columnValue));
					}
				} 
				if(cellIndex==6){ 
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setNoTaxAmt(AppUtils.getBigDecimal(columnValue));
					}
				} 
				if(cellIndex==7){ 
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setTaxAmt(AppUtils.getBigDecimal(columnValue));
					}
				} 
				if(cellIndex==8){//设定每个字段的值
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setGetCompName(AppUtils.toValidStringTrim(columnValue));
						
						//获取客户编码，不存在客户编码，就新增一个
						mapNo.put("custName", tbih43.getBillCompName());
						List<Tbih02> listIh02=ihjc02Dao.queryList02(mapNo);
						if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
							tbih43.setGetCompNo(listIh02.get(0).getCustNo());
						}else{
							String custNo=ihjc02Dao.genNo("Tbdcd1" ,"cust_No_",compId,"",4);
							tbih43.setGetCompNo(custNo);
							
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
				if(cellIndex==9){ 
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih43.setBillDate(AppUtils.toValidStringTrim(columnValue));
					}
				} 
			}
			String sqlIh01a = " from "+Tbih43.class.getName() +" where compId= '"+compId+"' and billNo = '"+tbih43.getBillNo()+"'";
			List<Tbih01a> listIh01a = ihjc43Dao.query(sqlIh01a);
			if(CollectionUtils.isEmpty(listIh01a)){
				session.save(tbih43);
			}
			count++;
		}
		
		session.flush();
		
		logger.info("解析excel入库成功，导入[" + count + "]条数据！");
		session.flush();
		
		return count;
	}

}

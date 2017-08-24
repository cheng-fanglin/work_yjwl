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
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc16bDao;
import com.jghz.ih.dao.Ihjc60Dao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih16b;
import com.jghz.ih.entity.Tbih22;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelNGTD.BEAN_ID)
public class ImportExcelNGTD implements IExcelProcessor {
	public static final String BEAN_ID = "ih.ImportExcelNGTD";
	public final Log logger = LogFactory.getLog(ImportExcelNGTD.class);
	@Resource
	private Ihjc16bDao ihjc16bDao;
	@Resource
	private Ihjc02Dao ihjc02Dao;
	@Resource
	private Dcjcd1Dao dcjcd1Dao;
	/*
	 * (非 Javadoc) Description:
	 * 
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "南钢提单导入模板";
	}

	/*
	 * (非 Javadoc) Description:
	 * 
	 * @see
	 * com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek
	 * .bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		Session session = ihjc16bDao.getSession();
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析导入！");
		}
		int count = 0;
		int rowIndex = 0;
		String compId = AppUtils.getCompId();
		Map<String,Object> mapNo = new HashMap<String,Object>();
		mapNo.put("compId", compId);
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();// 获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			rowIndex = rowIndex + 1;
			if (rowIndex == 1) {
				continue;// 第一条数据不导入
			}
			int cellIndex = 0;
			Tbih16b tbih16b = new Tbih16b();
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();// 获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {

				cellIndex = cellIndex + 1;
				tbih16b.setIh16bId(AppUtils.generateUniqueKey());
				tbih16b.setCompId(compId);
				tbih16b.setCreateEmp(AppUtils.getUserName());
				tbih16b.setCreateDate(AppUtils.getCurrentDate());
				if (cellIndex == 1) {// 设定每个字段的值
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setLadingNo(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 3) {//订单项次号
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						String orderItem= AppUtils.toValidStringTrim(columnValue);
						if(orderItem.contains("-")){
							String order[] = orderItem.split("-");
							tbih16b.setOrderNo(order[0]);
							tbih16b.setOrderItem(order[1]);
						}else{
							if(orderItem.length()>3){
								tbih16b.setOrderNo(orderItem.substring(0, orderItem.length()-3));
								tbih16b.setOrderItem(orderItem.substring(0, orderItem.length()-3)+"-"+orderItem.substring(orderItem.length()-3));
							}else{
								tbih16b.setOrderItem(orderItem);
							}	
						}	
					}
				}
				if (cellIndex == 5) {//收货地址
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setEndAddress(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 7) {//产品细分类
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setProdTypeName(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 8) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						String gradeNo=AppUtils.toValidStringTrim(columnValue);
						if(gradeNo.contains(";")){
							String grade[] = gradeNo.split(";");
							tbih16b.setGradeNo(grade[1]);
						}else{
							tbih16b.setGradeNo(gradeNo);
						}
					}
				}
				if (cellIndex == 9) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setThick(AppUtils.getBigDecimal(columnValue));
					}
				}
				if (cellIndex == 10) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setWidth(AppUtils.getBigDecimal(columnValue));
					}
				}
				if (cellIndex == 11) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setLength(AppUtils.getBigDecimal(columnValue));
					}
				}
				
				tbih16b.setSize(tbih16b.getThick()+"*"+tbih16b.getWidth()+"*"+tbih16b.getLength());
				
				if (cellIndex == 13) {//尺寸信息
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setDc(AppUtils.toValidStringTrim(columnValue));
					}
				}
				
				if (cellIndex == 14) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setCustName(AppUtils.toValidStringTrim(columnValue));
					
						//获取客户编码，不存在客户编码，就新增一个
						mapNo.put("custName", tbih16b.getCustName());
						List<Tbih02> listIh02=ihjc02Dao.queryList02(mapNo);
						if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
							tbih16b.setCustNo(listIh02.get(0).getCustNo());
						}else{
							String custNo=ihjc02Dao.genNo("Tbdcd1" ,"cust_No_",compId,"",4);
							tbih16b.setCustNo(custNo);
							
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
				if (cellIndex == 15) {//提单确认日期
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setLadingDate(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 16) {//提单确认日期
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setLadingEffectS(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 17) {//提单有效期
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setLadingEffectE(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 18) {//提单结案日期
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setLadingWgt(AppUtils.getBigDecimal(columnValue));
					}
				}
				if (cellIndex == 19) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setStl(AppUtils.getBigDecimal(columnValue));
					}
				}
				if (cellIndex == 20) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih16b.setWtl(AppUtils.getBigDecimal(columnValue));
					}
				}
			}
			String sqlIh16b = " from "+Tbih16b.class.getName() +" where compId= '"+compId+"' and ladingNo = '"+tbih16b.getLadingNo()+"' " +
					" and orderItem = '"+tbih16b.getOrderItem()+"' ";
			List<Tbih16b> listIh16b = ihjc16bDao.query(sqlIh16b);
			if(CollectionUtils.isEmpty(listIh16b)){
				session.save(tbih16b);
			}else{
				Tbih16b ih16b =listIh16b.get(0);
				if(ih16b.getLadingWgt().compareTo(tbih16b.getLadingWgt())<=0){
					ih16b.setLadingWgt(tbih16b.getLadingWgt());
				}
				if(ih16b.getStl().compareTo(tbih16b.getStl())<=0){
					ih16b.setStl(tbih16b.getStl());
				}
				ih16b.setWtl(ih16b.getLadingWgt().subtract(ih16b.getStl()));
				session.update(ih16b);
			}
			count++;
			session.flush();
		}
		session.flush();
		
		logger.info("解析excel提单导入成功，导入[" + count + "]条数据！");
		session.flush();
		
		return count;
	}
}

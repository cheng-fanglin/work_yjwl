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
import com.jghz.ih.dao.Ihjc60Dao;
import com.jghz.ih.entity.Tbih16b;
import com.jghz.ih.entity.Tbih30;
import com.jghz.ih.entity.Tbih60;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelHQZS.BEAN_ID)
public class ImportExcelHQZS implements IExcelProcessor {
	public static final String BEAN_ID = "ih.ImportExcelHQZS";
	public final Log logger = LogFactory.getLog(ImportExcelHQZS.class);
	@Resource
	private Ihjc60Dao ihjc60Dao;

	/*
	 * (非 Javadoc) Description:
	 * 
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "转授信息导入模板";
	}

	/*
	 * (非 Javadoc) Description:
	 * 
	 * @see
	 * com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek
	 * .bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		Session session = ihjc60Dao.getSession();
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		int count = 0;
		int rowIndex = 0;
		String compId = AppUtils.getCompId();
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();// 获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbih60 tbih60 = new Tbih60();
			rowIndex = rowIndex + 1;
			if (rowIndex == 1||rowIndex == 2||rowIndex == 3||rowIndex == 4) {
				continue;// 第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();// 获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {

				cellIndex = cellIndex + 1;
				tbih60.setIh60Id(AppUtils.generateUniqueKey());
				tbih60.setCompId(compId);
				tbih60.setCreateEmp(AppUtils.getUserName());
				tbih60.setCreateDate(AppUtils.getCurrentDate());
				String jfr = "";
				if (cellIndex == 1) {// 设定每个字段的值
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setLadingNo(AppUtils
								.toValidStringTrim(columnValue));
						jfr = "20"+tbih60.getLadingNo().substring(3, 9);
					}
				}
				if (cellIndex == 2) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setOrderItem(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 3) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setNewCustName(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 4) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setSteelNo(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 5) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setGradeNo(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 6) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setLabelNo(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 7) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setSize(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				if (cellIndex == 8) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setWgt(AppUtils.getBigDecimal(columnValue));
					}
				}
				if (cellIndex == 9) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						tbih60.setArea(AppUtils
								.toValidStringTrim(columnValue));
					}
				}
				String layerCode = "";
				if (cellIndex == 10) {
					Object columnValue = cellWrapper.getValue();
					if (AppUtils.isNotEmpty(columnValue)) {
						layerCode = AppUtils.toValidStringTrim(columnValue);
					}
				}
				tbih60.setZsTime(AppUtils.getCurrentDateString("yyyyMMdd"));
				tbih60.setZsEmp(AppUtils.getUserName());
				tbih60.setJfr(jfr);
				String sqlIh30 = " from " + Tbih30.class.getName()
						+ " where compId= '" + compId + "' and lableNo = '"
						+ tbih60.getLabelNo() + "' ";
				List<Tbih30> listIh30 = ihjc60Dao.query(sqlIh30);
				String sqlIh16b = " from " + Tbih16b.class.getName()
						+ " where compId= '" + compId + "' and ladingNo = '"
						+ tbih60.getLadingNo() + "' ";
				List<Tbih16b> listIh16b = ihjc60Dao.query(sqlIh16b);
				if(listIh30.size()>0){
					for (Tbih30 ih30 : listIh30) {
						tbih60.setOldCustName(ih30.getCustName());
						tbih60.setOldCustNo(ih30.getCustNo());
						ih30.setLadingNo(tbih60.getLadingNo());
						ih30.setCustName(tbih60.getNewCustName());
						ih30.setJfr(jfr);
						session.update(ih30);
					}
				}else{
					Tbih30 tbih30 = new Tbih30();
					tbih30.setIh30Id(AppUtils.generateUniqueKey());
					tbih30.setCompId(AppUtils.getCompId());
					tbih30.setLabelNo(tbih60.getLabelNo());
					tbih30.setWareQwCode(tbih60.getArea());
					tbih30.setLayerCode(layerCode);
					tbih30.setGradeNo(tbih60.getGradeNo());
					tbih30.setSteelNo(tbih60.getSteelNo());
					tbih30.setSize(tbih60.getSize());
					tbih30.setWgt(tbih60.getWgt());
					tbih30.setCustName(tbih60.getNewCustName());
					if(listIh16b.size()>0){
						
					}
				}
				session.save(tbih60);
			}

		}
		logger.info("解析excel入库成功，导入[" + count + "]条数据！");
		session.flush();
		
		return count;
	}
}

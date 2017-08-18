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
package com.jghz.dc.service;

import java.util.Collection;
import java.util.Iterator;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

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

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Service(ImportExcelCustNo.BEAN_ID)
public class ImportExcelCustNo implements IExcelProcessor {
	public static final String BEAN_ID = "jghz.ImportExcelCustNo";
	public final Log logger = LogFactory.getLog(ImportExcelCustNo.class);
	@Resource
	private Dcjcd1Dao tbdcd1Dao;
	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "客户信息导入模板";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek.bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception { 
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		int count = 0;
		int rowIndex = 0;
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();//获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbdcd1 tbdcd1 = new Tbdcd1();
			rowIndex =rowIndex+1;
			if(rowIndex ==1){
				continue;//第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();//获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {
				cellIndex = cellIndex +1;
				tbdcd1.setDcd1Id(AppUtils.generateUniqueKey());
				tbdcd1.setCompId(AppUtils.getCompId());
				tbdcd1.setCreateEmp(AppUtils.getUserName());
				tbdcd1.setCreateTime(AppUtils.getCurrentDate()); 
	 			if(cellIndex==1){//设定每个字段的值
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbdcd1.setCustNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==2){ 
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbdcd1.setCustName(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==3){ 
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbdcd1.setCustSname(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==4){
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbdcd1.setCustAttr(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==5){ 
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbdcd1.setSearchName(AppUtils.toValidStringTrim(columnValue));
					}
				} 
			}
			if (tbdcd1Dao.save(tbdcd1)) {
				count++;
			}
		}
		logger.info("解析excel入库成功，导入[" + count + "]条数据！");
		return count;
	}

}

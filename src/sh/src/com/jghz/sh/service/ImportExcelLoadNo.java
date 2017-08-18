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
package com.jghz.sh.service;

import java.text.DecimalFormat;
import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.bdf2.importexcel.model.CellWrapper;
import com.bstek.bdf2.importexcel.model.ExcelDataWrapper;
import com.bstek.bdf2.importexcel.model.RowWrapper;
import com.bstek.bdf2.importexcel.processor.IExcelProcessor;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc10bDao;
import com.jghz.sh.entity.Tbsh10b;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelLoadNo.BEAN_ID)
public class ImportExcelLoadNo implements IExcelProcessor {
	public static final String BEAN_ID = "sh.ImportExcelLoadNo";
	public final Log logger = LogFactory.getLog(ImportExcelLoadNo.class);
	@Resource
	private Shjc10Dao shjc10Dao;
	@Resource
	private Shjc10aDao shjc10aDao;
	@Resource
	private Shjc10bDao shjc10bDao;
	
	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "装车单导入模板";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek.bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		//初始化
		shjc10bDao.getJdbcTemplate().execute("delete from Tbsh10b");
		
		int count = 0;
		int rowIndex = 0;
		String compId=AppUtils.getCompId();
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();//获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbsh10b sh10b = new Tbsh10b();
			rowIndex =rowIndex+1;
			if(rowIndex ==1){
				continue;//第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();//获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {
				cellIndex = cellIndex +1;
				sh10b.setSh10bId(AppUtils.generateUniqueKey());
				sh10b.setCompId(compId);
				sh10b.setCreateEmp(AppUtils.getUserName());
				sh10b.setCreateDate(AppUtils.getCurrentDate()); 
				
				//设定每个字段的值
	 			if(cellIndex==1){//产品型号1
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						sh10b.setModel(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==2){ //厚度2
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						String val = AppUtils.toValidStringForZero(columnValue);
						sh10b.setHeight(AppUtils.getBigDecimal(new DecimalFormat().parse(val)));
					}
				}
				if(cellIndex==3){ //宽度5
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						String val = AppUtils.toValidStringForZero(columnValue);
						sh10b.setWidth(AppUtils.getBigDecimal(new DecimalFormat().parse(val)));
					}
				}
				if(cellIndex==4){//长度8
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						String val = AppUtils.toValidStringForZero(columnValue);
						sh10b.setLength(AppUtils.getBigDecimal(new DecimalFormat().parse(val)));
					}
				}
				if(cellIndex==5){ //数量9
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						String val = AppUtils.toValidStringForZero(columnValue);
						sh10b.setNum(AppUtils.getBigDecimal(new DecimalFormat().parse(val)));
					}
				} 
				if(cellIndex==6){ //重量10
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						String val = AppUtils.toValidStringForZero(columnValue);
						sh10b.setWeight(AppUtils.getBigDecimal(new DecimalFormat().parse(val)));
					}
				}
				if(cellIndex==7){ //客户
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						sh10b.setCustName(AppUtils.toValidStringTrim(columnValue));;
					}
				}
				if(cellIndex==8){ //车船号
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						sh10b.setCarNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==9){ //批号
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						sh10b.setBatchNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==10){ //订单编号项次
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						String orderItem = AppUtils.toValidStringTrim(columnValue);
						sh10b.setOrderItemNg(orderItem);
						sh10b.setOrderNoNg(orderItem.substring(0,orderItem.length()-4));
					}
				}
				if(cellIndex==11){//通知单号
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						sh10b.setLaddingNoNg(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==12){//装车单号
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						sh10b.setLoadingNoNg(AppUtils.toValidStringTrim(columnValue));
					}
				}
			}
			
			shjc10bDao.save(sh10b);
			count++;
		}
		
		logger.info("解析excel入库成功，导入[" + count + "]条数据！"); 
		return count;
	}

	public static void main(String[] args) {
		System.out.println("OM716120034-046".substring(0,"OM716120034-046".length()-4));
	}
}

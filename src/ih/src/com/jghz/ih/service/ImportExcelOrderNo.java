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
import com.jghz.ih.dao.Ihjc01Dao;
import com.jghz.ih.dao.Ihjc01aDao;
import com.jghz.ih.dao.Ihjc22Dao;
import com.jghz.ih.entity.Tbih01;
import com.jghz.ih.entity.Tbih01a;
import com.jghz.ih.entity.Tbih22;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelOrderNo.BEAN_ID)
public class ImportExcelOrderNo implements IExcelProcessor {
	public static final String BEAN_ID = "ih.ImportExcelOrderNo";
	public final Log logger = LogFactory.getLog(ImportExcelOrderNo.class);
	@Resource
	private Ihjc22Dao ihjc22Dao;
	
	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "订单信息导入模板";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek.bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		Session session = ihjc22Dao.getSession();
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		int count = 0;
		int rowIndex = 0;
		String compId=AppUtils.getCompId();
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();//获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbih22 tbih22 = new Tbih22();
			rowIndex =rowIndex+1;
			if(rowIndex ==1){
				continue;//第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();//获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {
				
				cellIndex = cellIndex +1;
				tbih22.setIh22Id(AppUtils.generateUniqueKey());
				tbih22.setCompId(compId);
				tbih22.setCreateEmp(AppUtils.getUserName());
				tbih22.setCreateDate(AppUtils.getCurrentDate()); 
				//设定每个字段的值
	 			if(cellIndex==1){//订单编号1
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setOrderNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==2){ //订单编号+项次2
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setOrderItem(tbih22.getOrderNo()+"-"+AppUtils.addZero(AppUtils.getBigDecimal(columnValue).toString(),3));
					}
				}
				if(cellIndex==3){ //客户编号5
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setCustNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==4){//厚度8
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setThick(AppUtils.getBigDecimal(columnValue));
					}
				}
				if(cellIndex==5){ //宽度9
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setWidth(AppUtils.getBigDecimal(columnValue));
					}
				} 
				if(cellIndex==6){ //长度10
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setLength(AppUtils.getBigDecimal(columnValue));
					}
				}
				//规格 = 厚*宽*长
				tbih22.setSize(tbih22.getThick()+"*"+tbih22.getWidth()+"*"+tbih22.getLength());
				
				if(cellIndex==7){ //生产厂11
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setFactory(AppUtils.toValidStringTrim(columnValue));;
					}
				}
				if(cellIndex==8){ //标准全名12
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setStandardName(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==9){ //交期14
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
						tbih22.setDeliveryDate(sd.format(columnValue));
					}
				}
				if(cellIndex==10){ //订单量15
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setOrderWgt(AppUtils.getBigDecimal(columnValue));
					}
				}
				if(cellIndex==11){//尺寸信息19
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setSize(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==12){//加喷内容24
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setSprayContext(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==13){ //计重方式28
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setUnit(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==14){ //喷漆颜色33
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setSprayColor(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==15){ //收货人名称34
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setReceiptCompName(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==16){ //到站地点35
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setEndStation(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==17){ //运输方式36
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setTranType(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==18){ //客户名称37
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setCustName(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==19){//合同编号38
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setNgContNo(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==20){//是否直销44
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setIfZx(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==21){ //车型45
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setCarType(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==22){ //备注55
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setMemo(AppUtils.toValidStringTrim(columnValue));
					}
				} 
				if(cellIndex==23){ //一票制运输价格58
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setTransPriceYpz(AppUtils.getBigDecimal(columnValue));
					}
				}
				if(cellIndex==24){ //一票制加工业务价格59
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setProPriceYpz(AppUtils.getBigDecimal(columnValue));
					}
				}
				
				if(cellIndex==25){ //合同月份94
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih22.setContYm(AppUtils.getBigDecimal(columnValue).toString());
					}
				} 
			}
			String sqlIh22 = " from "+Tbih22.class.getName() +" where compId= '"+compId+"' and orderNo = '"+tbih22.getOrderNo()+"'  ";
			List<Tbih22> listIh22 = ihjc22Dao.query(sqlIh22);
			if(CollectionUtils.isEmpty(listIh22)){
				session.save(tbih22);
			}
			count++;
		}
		
		session.flush();
		
		
		
		logger.info("解析excel入库成功，导入[" + count + "]条数据！");
		session.flush();
		
		return count;
	}

}

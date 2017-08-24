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
import org.hibernate.annotations.common.util.StringHelper;
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
import com.jghz.ih.entity.Tbih01;
import com.jghz.ih.entity.Tbih01a;

/**
 * @ClassName uploadExcelCustNo
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2016-12-5 下午3:53:58
 * @version 1.0.0
 */
@Transactional
@Service(ImportExcelWareQwNo.BEAN_ID)
public class ImportExcelWareQwNo implements IExcelProcessor {
	public static final String BEAN_ID = "ih.ImportExcelWareQwNo";
	public final Log logger = LogFactory.getLog(ImportExcelWareQwNo.class);
	@Resource
	private Ihjc01aDao ihjc01aDao;
	@Resource
	private Ihjc01Dao ihjc01Dao;
	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "库位信息导入模板";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.processor.IExcelProcessor#execute(com.bstek.bdf2.importexcel.model.ExcelDataWrapper)
	 */
	public int execute(ExcelDataWrapper excelDataWrapper) throws Exception {
		Session session = ihjc01Dao.getSession();
		if (!excelDataWrapper.isValidate()) {
			throw new RuntimeException("当前数据没有通过验证,不能解析入库！");
		}
		int count = 0;
		int rowIndex = 0;
		String compId=AppUtils.getCompId();
		Collection<RowWrapper> rowWrappers = excelDataWrapper.getRowWrappers();//获得row数据集合
		for (RowWrapper rowWrapper : rowWrappers) {
			Tbih01 tbih01 = new Tbih01();
			rowIndex =rowIndex+1;
			if(rowIndex ==1){
				continue;//第一条数据不导入
			}
			int cellIndex = 0;
			Collection<CellWrapper> cellWrappers = rowWrapper.getCellWrappers();//获得cell数据集合
			for (CellWrapper cellWrapper : cellWrappers) {
				
				cellIndex = cellIndex +1;
				tbih01.setIh01Id(AppUtils.generateUniqueKey());
				tbih01.setCompId(compId);
				tbih01.setCreateEmp(AppUtils.getUserName());
				tbih01.setCreateDate(AppUtils.getCurrentDate()); 
	 			if(cellIndex==1){//设定每个字段的值
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih01.setQwCode(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==2){ 
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih01.setWareCode(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==3){ 
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih01.setQwName(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==4){
					Object columnValue = cellWrapper.getValue(); 
					if(AppUtils.isNotEmpty(columnValue)){
						tbih01.setKb(AppUtils.toValidStringTrim(columnValue));
					}
				}
				if(cellIndex==5){ 
					Object columnValue = cellWrapper.getValue();
					if(AppUtils.isNotEmpty(columnValue)){
						tbih01.setWareAddress(AppUtils.toValidStringTrim(columnValue));
					}
				} 
				
			}
			String sqlIh01 = " from "+Tbih01.class.getName() +" where compId= '"+compId+"' and qwCode = '"+tbih01.getQwCode()+"'  ";
			List<Tbih01> listIh01 = ihjc01Dao.query(sqlIh01);
			if(CollectionUtils.isEmpty(listIh01)){
				if(StringHelper.isNotEmpty(tbih01.getWareCode())){
					String sqlIh01Father = " from "+Tbih01.class.getName() +" where compId= '"+compId+"' and qwCode = '"+tbih01.getWareCode()+"'  ";
					List<Tbih01> listIh01Father = ihjc01Dao.query(sqlIh01Father);
					if(CollectionUtils.isNotEmpty(listIh01Father)){
						tbih01.setFatherId(listIh01Father.get(0).getIh01Id());
					}
				}else{
					tbih01.setFatherId("root");
				}
				session.save(tbih01);
				session.flush();
			}
			count++;
		}
		
		
		/*String sqlIh01a = " select distinct ware_Code_ wareCode,ware_Name_ wareName,by1_ by1,kb_ kb " +
				"from Tbih01a where comp_id_='"+AppUtils.getCompId()+"'";
		List<Map<String,Object>> listMap01a = ihjc01aDao.getJdbcTemplate().queryForList(sqlIh01a);
		for(Map<String,Object> map01a:listMap01a){
			String wareCode=AppUtils.toValidString(map01a.get("wareCode"));
			String sqlIh01 = " from "+Tbih01.class.getName() +" where compId= '"+compId+"' and wareCode = '"+wareCode+"'  ";
			List<Tbih01> listIh01 = ihjc01Dao.query(sqlIh01);
			if(CollectionUtils.isEmpty(listIh01)){
				Tbih01 ih01 = new Tbih01();
				String ih01Id=AppUtils.generateUniqueKey();
				ih01.setIh01Id(ih01Id);
				ih01.setCompId(compId);
				ih01.setCreateEmp(AppUtils.getUserName());
				ih01.setCreateDate(AppUtils.getCurrentDate()); 
	 			ih01.setWareCode(wareCode);
	 			ih01.setWareName(AppUtils.toValidString(map01a.get("wareName")));
	 			ih01.setWareAddress(AppUtils.toValidString(map01a.get("by1")));
	 			ih01.setKb(AppUtils.toValidString(map01a.get("kb")));
	 			session.save(ih01);
	 			
	 			String sqlupdateIh01a="update Tbih01a set ih01_id_='"+ih01Id+"' where comp_id_='"+compId+"' and ware_Code_ = '"+wareCode+"'";
	 			ihjc01aDao.getJdbcTemplate().execute(sqlupdateIh01a);
			}
		}
		*/
		
		logger.info("解析excel入库成功，导入[" + count + "]条数据！");
		session.flush();
		
		return count;
	}

}

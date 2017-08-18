  
/**  
* 文件名：shjcApiService.java  
*  
* 版本信息：  
* 日期：2016-11-24  
* Copyright 足下 Corporation 2016  
* 版权所有  
*  
*/  

package com.jghz.sh.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.base.util.DateUtil;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh10a;

  
/**  
 *  
 * 项目名称：jghz  
 * 类名称：shjcApiService  
 * 类描述：  
 * 创建人：Tom  
 * 创建时间：2016-11-24 下午7:47:13  
 * 修改人：Tom  
 * 修改时间：2016-11-24 下午7:47:13  
 * 修改备注：  
 * @version  
 *  
 */
@Transactional
@Component
public class ShjcApiService {
	
	@Resource
	private Shjc10aDao shjc10aDao;
	
	@Resource
	private Shjc10Dao shjc10Dao;
	
	  
	/**  
	* executePh 给IH调用的配货接口，修改运单项次的配货状态
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-24 下午8:10:33 
	* 修改时间：2016-11-24 下午8:10:33 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	public Map executePh(Map inMap){
		Map map = new HashMap();
		String msg = "";
		boolean boo = true;
		try {
			List sh10aList = shjc10aDao.querySh10aIH(inMap);
			//如果按运单号、公司别、车号查有资料，说明是运单录入时已确定的车号
			if(!CollectionUtils.isEmpty(sh10aList)){
				Tbsh10a sh10a = (Tbsh10a)sh10aList.get(0);
				String phDate = sh10a.getPhDate();
				if(AppUtils.isNotEmpty(phDate)){
					msg = "运单"+inMap.get("carNo")+"已配货";
					throw new Exception(msg);
				}else{
					sh10a.setWeight(AppUtils.getBigDecimal((inMap.get("wgt"))));
					sh10a.setPhDate(DateUtil.getToday("yyMMdd HH:mm:ss"));
					shjc10aDao.save(sh10a);
				}
				//如果按运单号、公司别、车号查无资料，说明无预先设定的车号，换用手机号查询，根据inMap修改查得的资料
			}else{
				String transNo = AppUtils.toValidString(inMap.get("transNo"));
				String phoneNo = AppUtils.toValidString(inMap.get("phoneNo")); 
				String hql = " from Tbsh10a where transNo ='"+transNo+"' and phoneNo='"+phoneNo+"' and compId='"+AppUtils.getCompId()+"' ";
				sh10aList = shjc10aDao.query(hql);
				if(!CollectionUtils.isEmpty(sh10aList)){
					Tbsh10a sh10a = (Tbsh10a)sh10aList.get(0);
					sh10a.setWeight(AppUtils.getBigDecimal((inMap.get("wgt"))));
					sh10a.setPhDate(DateUtil.getToday("yyMMdd HH:mm:ss"));
					sh10a.setCarNo(AppUtils.toValidString(inMap.get("carNo")));
					shjc10aDao.update(sh10a);
				}
			}
		} catch (Exception e) {
			map.put("msg", e.getMessage());
			map.put("boo", boo);
			return map;
		}
		map.put("msg", msg);
		map.put("boo", boo);
		return map;
	}
	
	  
	/**  
	* executeOut 给IH调用的配货接口，修改运单项次的装车状态
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-24 下午8:11:08 
	* 修改时间：2016-11-24 下午8:11:08 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	public Map executeOut(Map inMap){
		Map map = new HashMap();
		String msg = "";
		boolean boo = true;
		List sh10aList = shjc10aDao.querySh10aIH(inMap);
		if(!CollectionUtils.isEmpty(sh10aList)){
			Tbsh10a sh10a = (Tbsh10a)sh10aList.get(0);
			String outDate = sh10a.getOutDate();
			if(AppUtils.isNotEmpty(outDate)){
				msg = "运单"+inMap.get("carNo")+"已装车";
				boo= false;
			}else{
				sh10a.setOutDate(DateUtil.getToday("yyMMdd HH:mm:ss"));
				shjc10aDao.save(sh10a);
			}
		}
		map.put("msg", msg);
		map.put("boo", boo);
		return map;
	}
}

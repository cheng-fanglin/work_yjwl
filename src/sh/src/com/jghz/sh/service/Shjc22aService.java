package com.jghz.sh.service;

import java.math.BigDecimal;
import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc22Dao;
import com.jghz.sh.dao.Shjc22aDao;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh22;
import com.jghz.sh.entity.Tbsh22a;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc22aaService  
* 类描述：  
* 创建人：Tom  
* 创建时间：2226-22-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：2226-22-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc22aService {
	
	@Resource
	private Shjc22aDao shjc22aDao;
	@Resource
	private Shjc22Dao shjc22Dao;
	@Resource
	private Shjc10aDao shjc10aDao;

	/**  
	* loadSh22 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2226-22-29 下午2:17:25 
	* 修改时间：2226-22-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
 
	@DataProvider
	public void loadSh22a(Page<Tbsh22a> page,  Map<String, Object> paramater) throws Exception {
		shjc22aDao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh22
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2226-22-29 下午2:17:35 
	* 修改时间：2226-22-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh22a(List<Tbsh22a> sh22as,String flag){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			Tbsh22 sh22 = new Tbsh22();
			for (Tbsh22a sh22a : sh22as) {
				String shipListNo = AppUtils.toValidString(sh22a.getShipListNo());
				String loadingNoNg = AppUtils.toValidString(sh22a.getLoadingNoNg()); 
				//TODO  判断装车单号和水单号，有则修改，无则新增
				List shipList = shjc22Dao.queryByShipNoList(shipListNo);
				if(CollectionUtils.isNotEmpty(shipList)){
					sh22 =(Tbsh22) shipList.get(0);
					BeanUtils.copyProperties(sh22, sh22a);
				}else{
					msg.append("请先填写水单号");
					break;
				}
				Map inMap = new HashMap();
				inMap.put("shipListNo", shipListNo);
				inMap.put("loadingNoNg", loadingNoNg);
				List sh22aList = shjc22aDao.querySh22a(inMap);
				
				if(CollectionUtils.isEmpty(sh22aList)){
					sh22a.setCompId(AppUtils.getCompId());
					sh22a.setTbsh22aId(new VMID().toString());
					sh22a.setCreateDate(new Date());
					boo=shjc22aDao.save(sh22a);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						
						msg.append("新增成功");
					}
				} 
			}
			if(boo){
				Tbsh22 upSh22 = calWgt(sh22as, sh22);
				shjc22Dao.update(upSh22);
			}
			prop.put("msg", msg.toString());
			prop.put("flag", boo);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties delSh22a(List<Tbsh22a> sh22as){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh22a sh22a : sh22as) {
				String transItem = AppUtils.toValidString(sh22a.getTransItem());
				//delSh22a
				shjc22aDao.delete(sh22a);
				//给sh10a赋空值
				List sh10aList = shjc10aDao.querySh10aByTransItem(transItem, AppUtils.getCompId());
				for(int i=0;i<sh10aList.size();i++){
					Tbsh10a sh10a =(Tbsh10a) sh10aList.get(i);
					sh10a.setShipListNo("");
					shjc10aDao.update(sh10a);
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
	/**  
	* calWgt 更新sh22的重量
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-26 下午7:17:37 
	* 修改时间：2016-12-26 下午7:17:37 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	private Tbsh22 calWgt(Collection<Tbsh22a> sh22as,Tbsh22 sh22 ){
		BigDecimal sh22Wgt = BigDecimal.ZERO;
		String shipListNo= "";
		for (Tbsh22a sh22a : sh22as) {
			shipListNo = sh22a.getShipListNo();
			BigDecimal weight = sh22a.getWeight();
			sh22Wgt= sh22Wgt.add(weight);
		}
		List shipList = shjc22Dao.queryByShipNoList(shipListNo);
		if(CollectionUtils.isNotEmpty(shipList)){
			sh22 =(Tbsh22) shipList.get(0);
			BigDecimal ysKzl = AppUtils.getBigDecimal(sh22.getYsKzl());
			BigDecimal xyKzl = AppUtils.getBigDecimal(sh22.getXyKzl());
			xyKzl = xyKzl.subtract(sh22Wgt);
			sh22.setXyKzl(xyKzl);
			sh22.setCarWgt(sh22Wgt);
			sh22.setBackShipWgt(sh22Wgt);
			sh22.setShipWgt(ysKzl.subtract(xyKzl));
		}
		return sh22;
	}
	 
}

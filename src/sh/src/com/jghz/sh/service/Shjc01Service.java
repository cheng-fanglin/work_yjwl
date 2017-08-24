package com.jghz.sh.service;

import java.rmi.dgc.VMID;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc01Dao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc01Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：2016-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：2016-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc01Service {
	
	@Resource
	private Shjc01Dao shjc01Dao;

	/**  
	* loadSh01 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-10-29 下午2:17:25 
	* 修改时间：2016-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh01(Page<Tbsh01> page, Map<String, Object> paramater)
			throws Exception {
		shjc01Dao.pagingQuery(page, paramater);
	}

	  

	  
	/**  
	* saveSh01
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-10-29 下午2:17:35 
	* 修改时间：2016-10-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws ParseException 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh01(Collection<Tbsh01> sh01s) throws ParseException{
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh01 sh01 : sh01s) {
			EntityState state = EntityUtils.getState(sh01);
			if (state.equals(EntityState.NEW)) {
				sh01.setSh01Id(AppUtils.generateUniqueKey());
				sh01.setStatus("0");
				sh01.setCreateDate(new Date());
				sh01.setCreateEmp(AppUtils.getUserName());
				boo=shjc01Dao.save(sh01);
				if(boo == false){
					msg.append("无新增数据");
					break;
				}
			}
			if (state.equals(EntityState.MODIFIED)) {
				boo=shjc01Dao.update(sh01);
				if(boo == false){
					msg.append("无修改数据");
					break;
				}
			}
			if (state.equals(EntityState.DELETED)) {
				boo=shjc01Dao.delete(sh01);
				if(boo == false){
					msg.append("无删除数据");
					break;
				}
			}
		}
		prop.put("msg", msg.toString());
		prop.put("flag", boo);
		return prop;
	}
	

	  
	/**  
	* saveSh01
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-10-29 下午2:18:15 
	* 修改时间：2016-10-29 下午2:18:15 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh01b(Collection<Tbsh01b> sh01bs){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh01b sh01b : sh01bs) {
			EntityState state = EntityUtils.getState(sh01b);
			if (state.equals(EntityState.NEW)) {
				sh01b.setStatus("0");
				sh01b.setSh01bId(AppUtils.generateUniqueKey());
				boo=shjc01Dao.save(sh01b);
				if(boo == false){
					msg.append("无新增数据");
					break;
				}
			}
			if (state.equals(EntityState.MODIFIED)) {
				boo=shjc01Dao.update(sh01b);
				if(boo == false){
					msg.append("无修改数据");
					break;
				}
			}
			if (state.equals(EntityState.DELETED)) {
				boo=shjc01Dao.delete(sh01b);
				if(boo == false){
					msg.append("无删除数据");
					break;
				}
			}
		}
		prop.put("msg", msg.toString());
		prop.put("flag", boo);
		return prop;
	}
	
	@DataProvider
	public void loadSh01b(Page<Tbsh01b> page, Map<String, Object> paramater) throws Exception{
		shjc01Dao.pagingQueryb(page, paramater);
	}
	
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh01> sh01s){
		Properties prop = new Properties();
		boolean flag = true;
		for(Tbsh01 sh01 : sh01s){
			shjc01Dao.update(sh01);
		}
		prop.put("msg", "审核成功");
		prop.put("flag", flag);
		return prop;
	}
}

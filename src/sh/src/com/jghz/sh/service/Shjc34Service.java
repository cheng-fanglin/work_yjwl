package com.jghz.sh.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc34Dao;
import com.jghz.sh.entity.Tbsh34;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc34Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：3426-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：3426-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc34Service {
	
	@Resource
	private Shjc34Dao shjc34Dao;

	/**  
	* loadSh34 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3426-10-29 下午2:17:25 
	* 修改时间：3426-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh34(Page<Tbsh34> page, Map<String, Object> paramater)
			throws Exception {
		shjc34Dao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh34
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3426-10-29 下午2:17:35 
	* 修改时间：3426-10-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh34(Collection<Tbsh34> sh34s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh34 sh34 : sh34s) {
			//首先是要新增
		}
		prop.put("msg", msg.toString());
		prop.put("flag", boo);
		return prop;
	}
	
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh34> sh34s){
		Properties prop = new Properties();
		boolean flag = true;
		for(Tbsh34 sh34 : sh34s){
			shjc34Dao.update(sh34);
		}
		prop.put("msg", "审核成功");
		prop.put("flag", flag);
		return prop;
	}
}

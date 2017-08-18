package com.jghz.sh.service;

import java.rmi.dgc.VMID;
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
import com.jghz.sh.dao.Shjc31Dao;
import com.jghz.sh.entity.Tbsh31;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc31Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：3126-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：3126-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc31Service {
	
	@Resource
	private Shjc31Dao shjc31Dao;

	/**  
	* loadSh31 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3126-10-29 下午2:17:25 
	* 修改时间：3126-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh31(Page<Tbsh31> page, Map<String, Object> paramater)
			throws Exception {
		shjc31Dao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh31
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3126-10-29 下午2:17:35 
	* 修改时间：3126-10-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh31(Collection<Tbsh31> sh31s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh31 sh31 : sh31s) {
			EntityState state = EntityUtils.getState(sh31);
			if (state.equals(EntityState.NEW)) {
				sh31.setCompId(AppUtils.getCompId());
				sh31.setCreateDate(new Date());
				sh31.setSh31Id(new VMID().toString());
				boo=shjc31Dao.save(sh31);
				if(boo == false){
					msg.append("无新增数据");
					break;
				}
			}
			if (state.equals(EntityState.MODIFIED)) {
				sh31.setUpdateDate(new Date());
				boo=shjc31Dao.update(sh31);
				if(boo == false){
					msg.append("无修改数据");
					break;
				}
			}
			if (state.equals(EntityState.DELETED)) {
				boo=shjc31Dao.delete(sh31);
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
	
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh31> sh31s){
		Properties prop = new Properties();
		boolean flag = true;
		for(Tbsh31 sh31 : sh31s){
			shjc31Dao.update(sh31);
		}
		prop.put("msg", "确认成功");
		prop.put("flag", flag);
		return prop;
	}
}

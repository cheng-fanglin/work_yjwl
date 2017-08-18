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
import com.jghz.sh.dao.Shjc23Dao;
import com.jghz.sh.entity.Tbsh23;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc23Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：2326-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：2326-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc23Service {
	
	@Resource
	private Shjc23Dao shjc23Dao;

	/**  
	* loadSh23 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2326-10-29 下午2:17:25 
	* 修改时间：2326-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh23(Page<Tbsh23> page, Map<String, Object> paramater)
			throws Exception {
		shjc23Dao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh23
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2326-10-29 下午2:17:35 
	* 修改时间：2326-10-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh23(Collection<Tbsh23> sh23s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh23 sh23 : sh23s) {
			EntityState state = EntityUtils.getState(sh23);
			if (state.equals(EntityState.NEW)) {
				sh23.setSh23Id(new VMID().toString());
				boo=shjc23Dao.save(sh23);
				if(boo == false){
					msg.append("无新增数据");
					break;
				}
			}
			if (state.equals(EntityState.MODIFIED)) {
				boo=shjc23Dao.update(sh23);
				if(boo == false){
					msg.append("无修改数据");
					break;
				}
			}
			if (state.equals(EntityState.DELETED)) {
				boo=shjc23Dao.delete(sh23);
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
	public Properties executeConfirm(Collection<Tbsh23> sh23s){
		Properties prop = new Properties();
		boolean flag = true;
		for(Tbsh23 sh23 : sh23s){
			shjc23Dao.update(sh23);
		}
		prop.put("msg", "审核成功");
		prop.put("flag", flag);
		return prop;
	}
}

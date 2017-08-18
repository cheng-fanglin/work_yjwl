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
import com.jghz.sh.dao.Shjc10cDao;
import com.jghz.sh.entity.Tbsh10c;
import com.jghz.sh.entity.Tbwd02;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc10caService  
* 类描述：  
* 创建人：Tom  
* 创建时间：1326-13-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：1326-13-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc10cService {
	
	@Resource
	private Shjc10cDao shjc10cDao;

	/**  
	* loadSh10c 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：1326-13-29 下午2:17:25 
	* 修改时间：1326-13-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh10c(Page<Tbsh10c> page, Map<String, Object> paramater)
			throws Exception {
		shjc10cDao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh13
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：1326-13-29 下午2:17:35 
	* 修改时间：1326-13-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh10c(Collection<Tbsh10c> sh10cs){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh10c sh10c : sh10cs) {
				EntityState state = EntityUtils.getState(sh10c);
				if (state.equals(EntityState.NEW)) {
					sh10c.setCompId(AppUtils.getCompId());
					sh10c.setSh10cId(new VMID().toString());
					sh10c.setCreateDate(new Date());
					boo=shjc10cDao.save(sh10c);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						msg.append("新增成功");
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					sh10c.setUpdateDate(new Date());
					boo=shjc10cDao.update(sh10c);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}else{
						msg.append("修改成功");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					boo=shjc10cDao.delete(sh10c);
					if(boo == false){
						msg.append("无删除数据");
						break;
					}else{
						msg.append("删除成功");
					}
				}
			}
			prop.put("msg", msg.toString());
			prop.put("flag", boo);
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	 
}

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
import com.jghz.sh.dao.Shjc10dDao;
import com.jghz.sh.entity.Tbsh10d;
import com.jghz.sh.entity.Tbwd02;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc10daService  
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
public class Shjc10dService {
	
	@Resource
	private Shjc10dDao shjc10dDao;

	/**  
	* loadSh10d 
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
	public void loadSh10d(Page<Tbsh10d> page, Map<String, Object> paramater)
			throws Exception {
		shjc10dDao.pagingQuery(page, paramater);
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
	public Properties saveSh10d(Collection<Tbsh10d> sh10ds){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh10d sh10d : sh10ds) {
				EntityState state = EntityUtils.getState(sh10d);
				if (state.equals(EntityState.NEW)) {
					sh10d.setCompId(AppUtils.getCompId());
					sh10d.setSh10dId(new VMID().toString());
					sh10d.setCreateDate(new Date());
					boo=shjc10dDao.save(sh10d);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						msg.append("新增成功");
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					sh10d.setUpdateDate(new Date());
					boo=shjc10dDao.update(sh10d);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}else{
						msg.append("修改成功");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					boo=shjc10dDao.delete(sh10d);
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

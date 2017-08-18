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
import com.jghz.sh.dao.Shjc13aDao;
import com.jghz.sh.entity.Tbsh13a;
import com.jghz.sh.entity.Tbwd02;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc13aaService  
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
public class Shjc13aService {
	
	@Resource
	private Shjc13aDao shjc13aDao;

	/**  
	* loadSh13 
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
	public void loadSh13a(Page<Tbsh13a> page, Map<String, Object> paramater)
			throws Exception {
		shjc13aDao.pagingQuery(page, paramater);
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
	public Properties saveSh13a(Collection<Tbsh13a> sh13as){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh13a sh13a : sh13as) {
				EntityState state = EntityUtils.getState(sh13a);
				if (state.equals(EntityState.NEW)) {
					String transItem= shjc13aDao.genTransItem(sh13a.getTransNo());
					sh13a.setStatus("0");
					sh13a.setTransItem(transItem);
					sh13a.setCompId(AppUtils.getCompId());
					sh13a.setSh13aId(new VMID().toString());
					sh13a.setCreateDate(new Date());
					boo=shjc13aDao.save(sh13a);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						msg.append("新增成功");
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					sh13a.setUpdateDate(new Date());
					boo=shjc13aDao.update(sh13a);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}else{
						msg.append("修改成功");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					boo=shjc13aDao.delete(sh13a);
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
	
	@DataResolver
	public Properties executePublish(Collection<Tbsh13a> sh13as){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh13a sh13a : sh13as){
				String status = sh13a.getStatus();
				if("0".equals(status)){
					prop.put("msg", "取消成功");
					prop.put("flag", flag);
					shjc13aDao.update(sh13a);
				}else if("1".equals(status)){
					prop.put("msg", "挂价成功");
					prop.put("flag", flag);
					shjc13aDao.update(sh13a);
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
	@DataProvider
	public void queryWdsh02(Page<Tbwd02> page, String paramater)
			throws Exception {
		shjc13aDao.queryWdsh02(page, paramater);
	}
	 
}

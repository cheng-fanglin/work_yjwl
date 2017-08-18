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
import com.base.util.DateUtil;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc13aDao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh13;
import com.jghz.sh.entity.Tbwd01;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc13Service  
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
public class Shjc13Service {
	
	@Resource
	private Shjc10Dao shjc10Dao;
	
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
	public void loadSh10Ec(Page<Tbsh10> page, Map<String, Object> paramater)
			throws Exception {
		shjc10Dao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh10
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：1026-10-29 下午2:17:35 
	* 修改时间：1026-10-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh10(Collection<Tbsh10> sh10s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh10 sh10 : sh10s) {
				EntityState state = EntityUtils.getState(sh10);
				if (state.equals(EntityState.NEW)) {
					String transNo = shjc10Dao.genTransNo();
					sh10.setStatus("0");
					sh10.setEcStatus("0");
					sh10.setTransNo(transNo);
					sh10.setCompId(AppUtils.getCompId());
					sh10.setSh10Id(new VMID().toString());
					sh10.setCreateDate(new Date());
					boo=shjc10Dao.save(sh10);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						msg.append("新增成功");
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					sh10.setUpdateDate(new Date());
					boo=shjc10Dao.update(sh10);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}else{
						msg.append("修改成功");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					boo=shjc10Dao.delete(sh10);
					if(boo == false){
						msg.append("无删除数据");
						break;
					}else{
						msg.append("删除成功");
					}
				}
			}
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		prop.put("msg", msg.toString());
		prop.put("flag", boo);
		return prop;
	}
	
	@DataResolver
	public Properties executePublish(Collection<Tbsh10> sh10s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh10 sh10 : sh10s){
				String status = sh10.getStatus();
				//确认判断
				if("1".equals(status)){
					sh10.setReleaseTime(DateUtil.getToday("yyMMdd HH:mm:ss"));
					sh10.setStatus("4");//发布成功
					sh10.setEcStatus("1");
					shjc10Dao.update(sh10);
					prop.put("msg", "发布成功");
					prop.put("flag", flag);
					//取消确认判断
				}else if("0".equals(status)){
					sh10.setStatus("0");//取消发布成功
					sh10.setEcStatus("0");
					shjc10Dao.update(sh10);
					prop.put("msg", "取消确认成功");
					prop.put("flag", flag);
				}else{
					prop.put("msg", "状态异常");
					prop.put("flag", false);
				}
			}
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
}

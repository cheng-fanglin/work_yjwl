package com.jghz.sh.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
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
import com.jghz.sh.dao.Shjc06Dao;
import com.jghz.sh.entity.Tbsh06;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc06Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：2016-10-29 下午2:09:30  
* 修改人：Tom  
* 修改时间：2016-10-29 下午2:09:30  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc06Service {
	
	@Resource
	private Shjc06Dao shjc06Dao;
	  
	/**  
	* getAreaByAreaId
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-10-29 下午2:09:55 
	* 修改时间：2016-10-29 下午2:09:55 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void getAreaByAreaId(Page<Tbsh06> page, Map<String, Object> paramater)
			throws Exception {
		shjc06Dao.pagingQuery(page, paramater);
	}
	
	@DataProvider
	public List<Tbsh06> getAreaAll(String parentId)
			throws Exception {
		List<Tbsh06> rtnList = shjc06Dao.getAreaAll(parentId);
		return rtnList;
	}
	
	@DataProvider
	public List<Tbsh06> getAreaRoot(String parentId)
			throws Exception {
		List<Tbsh06> rtnList = shjc06Dao.getAreaRoot(parentId);
		return rtnList;
	}
	
	@DataProvider
	public List<Tbsh06> getAreaByParentId(String parentId)
			throws Exception {
		List<Tbsh06> rtnList = shjc06Dao.getAreaByParentId(parentId);
		return rtnList;
	}
	  

	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh06(Collection<Tbsh06> sh06s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh06 sh06 : sh06s) {
			EntityState state = EntityUtils.getState(sh06);
			if (state.equals(EntityState.NEW)) {
				boo = shjc06Dao.checkTbsh06Index(sh06);
				if(boo == true){
					msg.append("新增数据已存在");
					break;
				}
				String areaCode = shjc06Dao.createCode(sh06);
				sh06.setAreacode(areaCode);
				sh06.setCompId(AppUtils.getCompId());
				sh06.setSh06Id(AppUtils.generateUniqueKey());
				sh06.setCreateDate(new Date());
				boo=shjc06Dao.save(sh06);
				if(boo == false){
					msg.append("无新增数据");
					break;
				}
			}
			if (state.equals(EntityState.MODIFIED)) {
				boo = shjc06Dao.checkTbsh06Modif(sh06);
				if(boo == true){
					msg.append("修改数据已存在");
					break;
				}
				sh06.setUpdateDate(new Date());
				boo=shjc06Dao.update(sh06);
				if(boo == false){
					msg.append("无修改数据");
					break;
				}
			}
			if (state.equals(EntityState.DELETED)) {
				boo=shjc06Dao.delete(sh06);
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
	public Properties executeConfirm(Collection<Tbsh06> sh06s){
		Properties prop = new Properties();
//		boolean flag = true;
//		for(Tbsh06 sh06 : sh06s){
//			shjc06Dao.update(sh06);
//		}
//		prop.put("msg", "��˳ɹ�");
//		prop.put("flag", flag);
		return prop;
	}
}

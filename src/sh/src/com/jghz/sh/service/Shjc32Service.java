package com.jghz.sh.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc32Dao;
import com.jghz.sh.dao.Shjc32aDao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh30a;
import com.jghz.sh.entity.Tbsh32;
import com.jghz.sh.entity.Tbsh32a;
import com.jghz.sh.entity.Tbwd01;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc32Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：3226-32-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：3226-32-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc32Service {
	
	@Resource
	private Shjc32Dao shjc32Dao;
	
	@Resource
	private Shjc32aDao shjc32aDao;
	
	@Resource
	private Shjc10aDao shjc10aDao;

	/**  
	* loadSh32 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3226-32-29 下午2:17:25 
	* 修改时间：3226-32-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh32(Page<Tbsh32> page, Map<String, Object> paramater)
			throws Exception {
		shjc32Dao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh32
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3226-32-29 下午2:17:35 
	* 修改时间：3226-32-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh32(Collection<Tbsh32> sh32s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh32 sh32 : sh32s) {
			EntityState state = EntityUtils.getState(sh32);
			if (state.equals(EntityState.NEW)) {
				String settleNo = shjc32Dao.genSettleNo();
				sh32.setStatus("0");
				sh32.setSettleNo(settleNo);
				sh32.setCompId(AppUtils.getCompId());
				sh32.setSh32Id(new VMID().toString());
				sh32.setCreateDate(new Date());
				boo=shjc32Dao.save(sh32);
				if(boo == false){
					msg.append("无新增数据");
					break;
				}else{
					msg.append("新增成功");
				}
			}
			if (state.equals(EntityState.MODIFIED)) {
				sh32.setUpdateDate(new Date());
				String billNo = sh32.getBillNo();
				String payNo = sh32.getPayNo();
				if(StringHelper.isNotEmpty(billNo)){
					sh32.setIsBill("Y");
				}
				if(StringHelper.isNotEmpty(payNo)){
					sh32.setIsPay("Y");
				}
				boo=shjc32Dao.update(sh32);
				if(boo == false){
					msg.append("无修改数据");
					break;
				}else{
					msg.append("修改成功");
				}
			}
			if (state.equals(EntityState.DELETED)) {
				boo=shjc32Dao.delete(sh32);
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
		return prop;
	}
	
	
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh32> sh32s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh32 sh32 : sh32s){
				String settleNo = sh32.getSettleNo();
				String status = sh32.getStatus();
				//TODO 判断子档的状态
				List<Tbsh32a> sh32aList = shjc32aDao.querySh32aBySettleNo(settleNo);
				if(sh32aList.size()==0){
					prop.put("msg", "无结算项次");
					prop.put("flag", false);
					break;
				}
				//确认判断
				if("1".equals(status)){
					for(Tbsh32a sh32a :sh32aList){
						String statusa = sh32a.getStatus();
						if(!"1".equals(statusa)){
							prop.put("msg",  "未审核");
							prop.put("flag", false);
							break;
						}
						sh32.setStatus("1");//确认成功
						shjc32Dao.update(sh32);
						prop.put("msg", "确认成功");
						prop.put("flag", flag);
					}
					//取消确认判断
				}else if("0".equals(status)){
					for(Tbsh32a sh32a :sh32aList){
						String statusa = sh32a.getStatus();
						if("1".equals(statusa)){
							prop.put("msg", "已审核");
							prop.put("flag", false);
							break;
						}
						sh32.setStatus("0");//取消确认成功
						shjc32Dao.update(sh32);
						prop.put("msg", "取消确认成功");
						prop.put("flag", flag);
					}
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	} 
	
	  
	/**  
	* queryWdsh01 承运商下拉 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-4 下午2:31:35 
	* 修改时间：2016-11-4 下午2:31:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void queryWdsh01(Page<Tbwd01> page, String paramater)
			throws Exception {
		shjc32Dao.queryWdsh01(page, paramater);
	}
	
	@DataProvider
	public void queryLine(Page<Tbsh01b> page,  String paramater)
			throws Exception {
		shjc32Dao.querySh01b(page, paramater);
	}
	
	@DataProvider
	public void queryCont(Page<Tbih21> page,  Map<String, Object> paramater)
			throws Exception {
		shjc32Dao.queryCont(page, paramater);
	}
	
	@DataProvider
	public void queryStation(Page<Tbsh01> page,  String paramater)
			throws Exception {
		shjc32Dao.querySh01(page, paramater);
	}
}

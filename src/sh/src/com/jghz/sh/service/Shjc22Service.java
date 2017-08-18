package com.jghz.sh.service;

import java.math.BigDecimal;
import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.base.util.DateUtil;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc22Dao;
import com.jghz.sh.dao.Shjc22aDao;
import com.jghz.sh.dao.Shjc35Dao;
import com.jghz.sh.dao.Shjc35aDao;
import com.jghz.sh.entity.Tbsh22;
import com.jghz.sh.entity.Tbsh35;
import com.jghz.sh.entity.Tbsh35a;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc22Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：2226-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：2226-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc22Service {
	
	@Resource
	private Shjc22Dao shjc22Dao;
	@Resource
	private Shjc35Dao shjc35Dao;
	@Resource
	private Shjc22aDao shjc22aDao;
	@Resource
	private Shjc35aDao shjc35aDao;
	@Resource
	private Shjc22aService shjc22aService;

	/**  
	* loadSh22 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2226-10-29 下午2:17:25 
	* 修改时间：2226-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh22(Page<Tbsh22> page, Map<String, Object> paramater)
			throws Exception {
		shjc22Dao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh22
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2226-10-29 下午2:17:35 
	* 修改时间：2226-10-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh22(Collection<Tbsh22> sh22s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh22 sh22 : sh22s) {
				EntityState state = EntityUtils.getState(sh22);
				if (state.equals(EntityState.NEW)) {
					List list = this.queryByShipListNo(sh22.getShipListNo());
					if(!CollectionUtils.isEmpty(list)){
						throw new Exception(sh22.getShipListNo()+"已存在");
					}
					sh22.setCompId(AppUtils.getCompId());
					sh22.setCreateDate(new Date());
					sh22.setCreateEmp(AppUtils.getUserName());
					sh22.setTbsh22Id(new VMID().toString());
					sh22.setStatus("0");
					boo=shjc22Dao.save(sh22);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					
					boo=shjc22Dao.update(sh22);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}
				}
				if (state.equals(EntityState.DELETED)) {
					String shipListNo = sh22.getShipListNo();
					String status = sh22.getStatus();
					if(!status.equals("0")){
						msg.append("请回退到新建状态");
						break;
					}
					Map inMap = new HashMap();
					inMap.put("shipListNo", shipListNo);
					boo=shjc22Dao.delete(sh22);
					List sh22aList = shjc22aDao.querySh22a(inMap);
					shjc22aService.delSh22a(sh22aList);
					if(boo == false){
						msg.append("无删除数据");
						break;
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
	
	/**  
	* saveSettle22 货主结算
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-29 上午22:43:57 
	* 修改时间：2016-12-29 上午22:43:57 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties saveSettle22(Collection<Tbsh22> sh22s){
		Properties prop = new Properties();
		try {
			String flag = "";
			Tbsh35 sh35 = new Tbsh35();
			Tbsh35 sh35_sh22 = new Tbsh35();
			BigDecimal actMount_sh35 = BigDecimal.ZERO;//结算总金额
			BigDecimal actWgt_sh35 = BigDecimal.ZERO;//结算总重量
			String settleNo = shjc35Dao.genSettleNo();
			for(Tbsh22 sh22 : sh22s){
				//先判断是否在原结算单上新增
				String settleNo_sh22 = sh22.getSettleNo();
				sh35_sh22 = shjc35Dao.queryBySettleNo(settleNo_sh22);
				if(sh35_sh22!=null){
					//如果是在原结算单上新增明细，原结算单修改重量
					flag = "U";
					settleNo = settleNo_sh22;
					
				}else{
					flag = "I";
				}
				//判断数据库中状态，避免重复操作
				String shipListNo = sh22.getShipListNo();
				List sh22List_tmp = shjc22Dao.queryByShipNoList(shipListNo);
				if(CollectionUtils.isNotEmpty(sh22List_tmp)){
					Tbsh22 sh22_tmp =(Tbsh22) sh22List_tmp.get(0);
					String status = sh22_tmp.getStatus();
					if("11".equals(status)){
						throw new Exception("已挑选，请勿重复操作！");
					}
				}
				//TODO 更改sh22的状态为11结算待确认
				sh22.setStatus("11");//结算待确认 
				shjc22Dao.update(sh22);
				//TODO copy到sh35a，并新增sh35a
				Tbsh35a sh35a = new Tbsh35a();
				BeanUtils.copyProperties(sh22, sh35a);
				BeanUtils.copyProperties(sh22, sh35);
				sh35a.setSh35Id(AppUtils.generateUniqueKey());
				sh35a.setSh35aId(AppUtils.generateUniqueKey());
				//计算每个运单的实际金额
				BigDecimal backWgt =AppUtils.getBigDecimal(sh35a.getBackShipWgt()) ;
				BigDecimal arUnitPrice = AppUtils.getBigDecimal(sh35a.getApUnitPrice());
				BigDecimal arActMount = backWgt.multiply(arUnitPrice);
				//累加实际运单的实际金额
				actMount_sh35 = actMount_sh35.add(arActMount);
				actWgt_sh35 = actWgt_sh35.add(backWgt);
				sh35a.setArActMount(arActMount);
				sh35a.setStatus("0");//结算待确认
				sh35a.setSettleNo(settleNo);
				sh35a.setSh35Id(AppUtils.generateUniqueKey());
				shjc35aDao.save(sh35a);
				
			}
			if("I".equals(flag)){
				sh35.setSh35Id(AppUtils.generateUniqueKey());
				sh35.setSettleAmtTotal(actMount_sh35);
				sh35.setSettleWgtTotal(actWgt_sh35);
				sh35.setSettleDay(DateUtil.getDateString(new Date(), "yyyyMMdd"));
				sh35.setYearMonth(DateUtil.getMonth(0,""));
				sh35.setSettleNo(settleNo);
				sh35.setStatus("0");//结算待确认
				shjc35Dao.save(sh35);
			}else if("U".equals(flag)){
				BigDecimal settleAmtTotal = AppUtils.getBigDecimal(sh35_sh22.getSettleAmtTotal());
				BigDecimal settleWgtTotal = AppUtils.getBigDecimal(sh35_sh22.getSettleWgtTotal());
				settleAmtTotal = settleAmtTotal.add(actMount_sh35);
				settleWgtTotal = settleWgtTotal.add(actWgt_sh35);
				sh35_sh22.setSettleAmtTotal(settleAmtTotal);
				sh35_sh22.setSettleWgtTotal(settleWgtTotal);
				shjc35Dao.update(sh35_sh22);
			}
			prop.put("msg", "挑选成功");
			prop.put("flag", true);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh22> sh22s){
		Properties prop = new Properties();
		boolean flag = true;
		for(Tbsh22 sh22 : sh22s){
			shjc22Dao.update(sh22);
		}
		prop.put("msg", "审核成功");
		prop.put("flag", flag);
		return prop;
	}
	
	private List queryByShipListNo(String shipListNo){
		return shjc22Dao.queryByShipNoList(shipListNo);
	}
}

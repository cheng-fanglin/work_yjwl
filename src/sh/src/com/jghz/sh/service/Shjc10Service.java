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
import org.hibernate.annotations.common.util.StringHelper;
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
import com.jghz.ih.entity.Tbih21;
import com.jghz.ih.impl.IhjcShApiService;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc10bDao;
import com.jghz.sh.dao.Shjc22Dao;
import com.jghz.sh.dao.Shjc31Dao;
import com.jghz.sh.dao.Shjc32Dao;
import com.jghz.sh.dao.Shjc32aDao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh10b;
import com.jghz.sh.entity.Tbsh32;
import com.jghz.sh.entity.Tbsh32a;
import com.jghz.sh.entity.Tbwd01;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc10Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：1026-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：1026-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc10Service {
	
	@Resource
	private Shjc10Dao shjc10Dao;
	@Resource
	private Shjc10bDao shjc10bDao;
	@Resource
	private Shjc22Dao shjc22Dao;
	
	@Resource
	private Shjc10aDao shjc10aDao;
	
	@Resource
	private Shjc31Dao shjc31Dao;
	
	@Resource
	private Shjc32Dao shjc32Dao;
	
	@Resource
	private Shjc32aDao shjc32aDao;
	@Resource
	private Shjc10aService shjc10aService;
	@Resource
	private IhjcShApiService ihjcShApiService;

	/**  
	* loadSh10 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：1026-10-29 下午2:17:25 
	* 修改时间：1026-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh10(Page<Tbsh10> page, Map<String, Object> paramater)
			throws Exception {
		shjc10Dao.pagingQuery(page, paramater);
	}
	
	@DataProvider
	public void loadUnSettleSh10(Page<Tbsh10> page, Map<String, Object> paramater)
			throws Exception {
		shjc10Dao.pagingQueryUnSettleSh10(page, paramater);
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
					BigDecimal transWgt_Total = BigDecimal.ZERO; 
					String transNo = shjc10Dao.genTransNo();
					String contNo = sh10.getContNo();
					String transType = sh10.getTransType();
					BigDecimal contWgt = sh10.getOrderWgt();
					sh10.setStatus("0");
					sh10.setTransNo(transNo);
					sh10.setCompId(AppUtils.getCompId());
					sh10.setSh10Id(new VMID().toString());
					sh10.setCreateDate(new Date());
					//统计该协议号下的剩余重量，如果大于剩余重量则不能新增
					List list = shjc10Dao.queryByContNo(contNo);
					for(int i =0;i<list.size();i++){
						BigDecimal transWgt = sh10.getLadingWgt();
						transWgt_Total.add(transWgt);
					}
					if(contWgt.compareTo(transWgt_Total)<0){
						throw new Exception("运单总量大于协议量！");
					}
					//判断运输方式
					if("W".equals(transType)||"U".equals(transType)){
						String unloadingDock = sh10.getUnloadingDock();
						String loadingDock = sh10.getLoadingDock();
						if(StringHelper.isEmpty(unloadingDock)||StringHelper.isEmpty(loadingDock)){
							throw new Exception("请填写码头！");
						}
					}
					//================
					boo=shjc10Dao.save(sh10);;
					if(boo == false){
						msg.append("无新增数据！");
						boo=false;
						break;
					}else{
						msg.append("新增成功！");
					}
				}
				if (state.equals(EntityState.MODIFIED)) { 
					String transNo = sh10.getTransNo();
					String compId = sh10.getCompId();
					sh10.setStatus(sh10.getStatus());
					sh10.setUpdateDate(new Date());
					boo=shjc10Dao.update(sh10);
					if(boo == false){
						msg.append("无修改数据！");
						boo=false;
						break;
					}else{
						//TODO 结算申请
						if("10".equals(sh10.getStatus())){
							//1..判断有关车辆有没有回单
							boo = shjc10aService.ifAllBack(transNo);
							if(!boo){
								msg.append("车辆未全部回单，不能结算申请！");
								boo=false;
								break;
							} 
							//2..判断运单规定到港有否挂单
							//不管中转港
							String loadDock = sh10.getLoadingDock();
							String unloadDock = sh10.getUnloadingDock();
							Map inMap = new HashMap();
							inMap.put("compId", compId);
							inMap.put("transNo", transNo);
							inMap.put("startDock", loadDock);
							inMap.put("endDock", unloadDock);
							//判断装货码头和卸货码头有无维护
							List startDock = shjc22Dao.queryDock(inMap);
							List endDock = shjc22Dao.queryDock(inMap);
							if(CollectionUtils.isEmpty(startDock)){
								msg.append("船运管理未维护装货码头！");
								boo=false;
								break;
							}
							if(CollectionUtils.isEmpty(endDock)){
								msg.append("船运管理未维护卸货码头！");
								boo=false;
								break;
							}
							//判断运单下所有船只是否待结算
							List unSettleList = shjc22Dao.queryUnSettleList(inMap);
							if(CollectionUtils.isNotEmpty(unSettleList)){
								msg.append("请所有船运做结算申请！");
								boo=false;
								break;
							}
							msg.append("结算申请成功");
						}else if("3".equals(sh10.getStatus())){
							msg.append("结算申请取消成功");
						}else{
							msg.append("修改成功");
						}
					}
				}
				if (state.equals(EntityState.DELETED)) {
					boo=shjc10Dao.delete(sh10);
					shjc10aService.delSh10a(sh10);
					List sh10bList = shjc10bDao.queryByTransNo(sh10.getTransNo());
					for(int i =0;i<sh10bList.size();i++){
						Tbsh10b sh10b = (Tbsh10b)sh10bList;
						sh10b.setTransItem("");
						sh10b.setTransNo("");
						shjc10bDao.update(sh10b);
					}
					if(boo == false){
						msg.append("无删除数据");
						break;
					}else{
						msg.append("删除成功");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
			return prop;
		}
		prop.put("msg", msg.toString());
		prop.put("flag", boo);
		return prop;
	}
	 
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh10> sh10s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh10 sh10 : sh10s){
				String transNo = sh10.getTransNo();
				String status = sh10.getStatus();
				//TODO 判断子档的状态
				List<Tbsh10a> sh10aList = shjc10aDao.querySh10a(transNo);
				if(sh10aList.size()==0){
					prop.put("msg", "无运单项次");
					prop.put("flag", false);
					break;
				}
				//确认判断
				if("1".equals(status)){
					for(Tbsh10a sh10a :sh10aList){
						String statusa = sh10a.getStatus();
						String phoneNo = sh10a.getPhoneNo();
						if(!"1".equals(statusa)){
							prop.put("msg", phoneNo + "未审核");
							prop.put("flag", false);
							break;
						}
						sh10.setStatus("1");//确认成功
						shjc10Dao.update(sh10);
						prop.put("msg", "确认成功");
						prop.put("flag", flag);
					}
					//取消确认判断
				}else if("0".equals(status)){
					for(Tbsh10a sh10a :sh10aList){
						String statusa = sh10a.getStatus();
						String phoneNo = sh10a.getPhoneNo();
						if("1".equals(statusa)){
							prop.put("msg", phoneNo + "已审核");
							prop.put("flag", false);
							break;
						}
						sh10.setStatus("0");//取消确认成功
						shjc10Dao.update(sh10);
						prop.put("msg", "取消确认成功");
						prop.put("flag", flag);
					}
				}
			}
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
			return prop;
		}
		return prop;
	}
	
	
	
	  
	/**  
	* executeLadding 生成提单
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2017-1-10 下午3:04:11 
	* 修改时间：2017-1-10 下午3:04:11 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties executeLadding(Collection<Tbsh10> sh10s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh10 sh10 : sh10s){
				boolean boo = shjc10Dao.update(sh10);
				if(boo){
					Map sh10Map = new HashMap();
					AppUtils.copyProperties(sh10, sh10Map);
					ihjcShApiService.saveTbih16LadingNo(sh10Map);
					prop.put("msg", "提交成功");
					prop.put("flag", true);
				}
				
			}
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
			return prop;
		}
		return prop;
	}

	private Tbsh10 getPrice(Tbsh10 sh10){
		String contNo = sh10 .getContNo();
		String productNo = sh10 .getProductNo();
		String custNo = sh10 .getCustNo();
		String startStationCode = sh10.getStartStationCode();
		String endStationCode = sh10.getEndStationCode();
		String startLine = sh10.getStartLine();
		String endLine = sh10.getEndLine();
		String transType= sh10.getTransType();
		String payType= sh10.getPayType();
		Map inMap = new HashMap();
		inMap.put("contNo", contNo);
		inMap.put("startStationCode", startStationCode);
		inMap.put("endStationCode", endStationCode);
		inMap.put("startLine", startLine);
		inMap.put("endLine", endLine);
		inMap.put("transType", transType);
		inMap.put("payType", payType);
		inMap.put("productNo", productNo);
		inMap.put("productNo", productNo);
		inMap.put("custNo", custNo);
		List list = shjc31Dao.queryPrice(inMap);
		if(!CollectionUtils.isEmpty(list)){
			Map sh31Map =(Map) list.get(0);
			BigDecimal price = AppUtils.getBigDecimal(sh31Map.get("transPrice"));
			BigDecimal cargoMoney = price.multiply(AppUtils.getBigDecimal(sh31Map.get("ladingWgt")));
			sh10.setUnitPrice(price);
			sh10.setCargoMoney(cargoMoney);
		}
		return sh10;
	}
	
	  
	/**  
	* saveSettle10 货主结算
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-29 上午10:43:57 
	* 修改时间：2016-12-29 上午10:43:57 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties saveSettle10(Collection<Tbsh10> sh10s){
		Properties prop = new Properties();
		try {
			Tbsh32 sh32 = new Tbsh32();
			BigDecimal actMount_sh32 = BigDecimal.ZERO;//结算总金额
			BigDecimal actWgt_sh32 = BigDecimal.ZERO;//结算总重量
			String settleNo = shjc32Dao.genSettleNo();
			for(Tbsh10 sh10 : sh10s){
				//TODO 更改sh10的状态为11结算待确认
				sh10.setStatus("11");//结算待确认 
				shjc10Dao.update(sh10);
				//TODO copy到sh32a，并新增sh32a
				Tbsh32a sh32a = new Tbsh32a();
				BeanUtils.copyProperties(sh10, sh32a);
				BeanUtils.copyProperties(sh10, sh32);
				sh32a.setSh32aId(AppUtils.generateUniqueKey());
				//计算每个运单的实际金额
				BigDecimal backWgt =AppUtils.getBigDecimal(sh32a.getBackWgt()) ;
				BigDecimal arUnitPrice = AppUtils.getBigDecimal(sh32a.getArUnitPrice());
				BigDecimal arActMount = backWgt.multiply(arUnitPrice);
				//累加实际运单的实际金额
				actMount_sh32 = actMount_sh32.add(arActMount);
				actWgt_sh32 = actWgt_sh32.add(backWgt);
				sh32a.setArActMount(arActMount);
				sh32a.setStatus("0");//结算待确认
				sh32a.setSettleNo(settleNo);
				sh32a.setSh32Id(AppUtils.generateUniqueKey());
				shjc32aDao.save(sh32a);
				
			}
			sh32.setSh32Id(AppUtils.generateUniqueKey());
			sh32.setSettleAmtTotal(actMount_sh32);
			sh32.setSettleWgtTotal(actWgt_sh32);
			sh32.setSettleDay(DateUtil.getDateString(new Date(), "yyyyMMdd"));
			sh32.setYearMonth(DateUtil.getMonth(0,""));
			sh32.setSettleNo(settleNo);
			sh32.setStatus("0");//结算待确认
			shjc32Dao.save(sh32);
			prop.put("msg", "挑选成功");
			prop.put("flag", true);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
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
		shjc10Dao.queryWdsh01(page, paramater);
	}
	
	@DataProvider
	public void queryLine(Page<Tbsh01b> page,  String paramater)
			throws Exception {
		shjc10Dao.querySh01b(page, paramater);
	}
	
	@DataProvider
	public void queryCont(Page<Tbih21> page,  Map<String, Object> paramater)
			throws Exception {
		shjc10Dao.queryCont(page, paramater);
	}
	
	@DataProvider
	public void queryStation(Page<Tbsh01> page,  String paramater)
			throws Exception {
		shjc10Dao.querySh01(page, paramater);
	}
}

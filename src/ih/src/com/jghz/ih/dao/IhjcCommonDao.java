package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.DcjcCommonDao;
import com.jghz.ih.entity.Tbih01a;

/**
 * 获取通用代码档中的数据
 * */
@Component
public class IhjcCommonDao extends BaseDao{
	@Resource
	private DcjcCommonDao dcjcCommonDao;
	
	
	@Expose
    public String uniqueCheckKW(String Id){
          String hql = "select count(*) from " + Tbih01a.class.getName() + " d where d.compId = :compId and d.qwCode = :qwCode";
          Map<String, Object> parameterMap = new HashMap<String, Object>();
          parameterMap.put("compId", AppUtils.getCompId());
          parameterMap.put("qwCode", Id);
          if(this.queryForInt(hql, parameterMap)>0){
               return null;
          }else{
               return "当前库位不存在！";
          }
    }

	
	/**经营属性
	 * 01 自有仓库   02 租用仓库   03 虚拟仓库
	 * */
	@DataProvider
	public Map<String,Object> loadBusinature() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","BUSINATURE_");
		return parameter;
	}
	
	/**运输方式
	 * R 铁路    T 公路    W 水路
	 * */
	@DataProvider
	public Map<String,Object> loadTranType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","TRAN_TYPE_");
		return parameter;
	}
	
	/**往来单位身份
	 * 00 客户   01 承运商   02 供应商   03 需求客户
	 * */
	@DataProvider
	public Map<String,Object> loadIdentityType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","IDENTITY_TYPE_");
		return parameter;
	}
	
	/**货源
	 * Y南钢   N非南钢
	 * */
	@DataProvider
	public Map<String,Object> loadHY() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","HY_");
		return parameter;
	}
	
	/**服务分类
	 * 1 运输   2 仓储   3 装卸   4 包干   5 其他服务
	 * */
	@DataProvider
	public Map<String,Object> loadFWFL() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","FWFL_");
		return parameter;
	}
	
	/**服务类型
	 * 01 装卸    02 仓储   03 仓储配送   04 直取配送    05 无 
	 * */
	@DataProvider
	public Map<String,Object> loadFWLX() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","FWLX_");
		return parameter;
	}
	
	/**结算方式
	 * RJ 日结     YJ 月结    W 无
	 * */
	@DataProvider
	public Map<String,Object> loadSettleType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","SETTLE_TYPE_");
		return parameter;
	}
	
	/**结算方
	 * RJ 日结     YJ 月结    W 无
	 * */
	@DataProvider
	public Map<String,Object> loadSettleComp() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","SETTLE_COMP_");
		return parameter;
	}
	
	/**结算项目
	 * D 吊装费    L 物流服务费    Q 其他费用    T 运费     W 仓储费
	 * */
	@DataProvider
	public Map<String,Object> loadJSXM() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","JSXM_");
		return parameter;
	}
	
	/**库零计算方式
	 * 0 按提单日期   1 按出库日期
	 * */
	@DataProvider
	public Map<String,Object> loadKLJS() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","KLJS_");
		return parameter;
	}
	
	/**库别
	 * SN 室内    SW 室外
	 * */
	@DataProvider
	public Map<String,Object> loadKB() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","KB_");
		return parameter;
	}
	
	/**基础资料状态
	 * 01 启用    10 停用
	 * */
	@DataProvider
	public Map<String,Object> loadBasicStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","BASIC_STATUS_");
		return parameter;
	}
	
	/**入库单类型
	 * A 到货入库      B 盘点入库     C 退货入库
	 * */
	@DataProvider
	public Map<String,Object> loadInType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","IN_TYPE_");
		return parameter;
	}
	
	/**入库单状态
	 * 00 建立    10 已确认
	 * */
	@DataProvider
	public Map<String,Object> loadInStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","IN_STATUS_");
		return parameter;
	}
	
	/**出库单状态
	 * 00 建立    10 配货销帐确认    20出厂确认
	 * */
	@DataProvider
	public Map<String,Object> loadOutStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","OUT_STATUS_");
		return parameter;
	}
	
	/**提单状态
	 * 00 建立    01 已提交    02 缴款确认  10 结案
	 * */
	@DataProvider
	public Map<String,Object> loadLadingStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","LADING_STATUS_");
		return parameter;
	}
	
	/**存户状态
	 * 00 在库    10 配货确认    20出库
	 * */
	@DataProvider
	public Map<String,Object> loadStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","STATUS_");
		return parameter;
	}
	
	/**结算状态
	 * 00 新建    01已审核    10已作废
	 * */
	@DataProvider
	public Map<String,Object> loadSettleStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","SETTLE_STATUS_");
		return parameter;
	}
	
	/**计量单位
	 *   
	 * */
	@DataProvider
	public Map<String,Object> loadUnit() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","UNIT_");
		return parameter;
	}
	
	/**类别
	 * ZY 自营     JY 经营
	 * */
	@DataProvider
	public Map<String,Object> loadLb() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","LB_");
		return parameter;
	}
	
	/**是否
	 * Y 是     N 否
	 * */
	@DataProvider
	public Map<String,Object> loadYN() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","YN_");
		return parameter;
	}
	
	/**缴款方式
	 * Y 是     N 否
	 * */
	@DataProvider
	public Map<String,Object> loadPayType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","PAY_TYPE_");
		return parameter;
	}
	
	/**盘点类型
	 * A 盘盈  B 盘亏
	 * */
	@DataProvider
	public Map<String,Object> loadInventoryType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("IH","INVENTORY_TYPE_");
		return parameter;
	}
}

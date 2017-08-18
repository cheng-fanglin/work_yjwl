package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih40a:TBIH40A结算单明细档)
 */
@Entity
@Table(name = "tbih40a")
public class Tbih40a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih40aId;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih40Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 结算单ID:结算单ID
	 */
	@PropertyDef(label = "结算单ID", description = "结算单ID:结算单ID")
	private String settleNo;

	/**
	 * 结算年月:结算年月
	 */
	@PropertyDef(label = "结算年月", description = "结算年月:结算年月")
	private String yearMonth;

	/**
	 * 结算日期:结算日期
	 */
	@PropertyDef(label = "结算日期", description = "结算日期:结算日期")
	private String settleDate;

	/**
	 * 结算人:结算人
	 */
	@PropertyDef(label = "结算人", description = "结算人:结算人")
	private String settleEmp;

	/**
	 * 取消结算日期:取消结算日期
	 */
	@PropertyDef(label = "取消结算日期", description = "取消结算日期:取消结算日期")
	private String cancleDate;

	/**
	 * 取消结算人:取消结算人
	 */
	@PropertyDef(label = "取消结算人", description = "取消结算人:取消结算人")
	private String cancleEmp;

	/**
	 * 结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)
	 */
	@PropertyDef(label = "结算方式(1日结2月结3自定义日期)", description = "结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)")
	private String settleType;

	/**
	 * 价格编号:价格编号
	 */
	@PropertyDef(label = "价格编号", description = "价格编号:价格编号")
	private String priceSno;

	/**
	 * 费用类别:费用类别
	 */
	@PropertyDef(label = "费用类别", description = "费用类别:费用类别")
	private String ftype;

	/**
	 * 结算项目:结算项目
	 */
	@PropertyDef(label = "结算项目", description = "结算项目:结算项目")
	private String jsxm;

	/**
	 * 客户编号:客户编号
	 */
	@PropertyDef(label = "客户编号", description = "客户编号:客户编号")
	private String custNo;

	/**
	 * 客户名称:客户名称
	 */
	@PropertyDef(label = "客户名称", description = "客户名称:客户名称")
	private String custName;

	/**
	 * 付款公司编码:付款公司编码
	 */
	@PropertyDef(label = "付款公司编码", description = "付款公司编码:付款公司编码")
	private String payCompNo;

	/**
	 * 付款公司名称:付款公司名称
	 */
	@PropertyDef(label = "付款公司名称", description = "付款公司名称:付款公司名称")
	private String payCompName;

	/**
	 * 开票单位编码:开票单位编码
	 */
	@PropertyDef(label = "开票单位编码", description = "开票单位编码:开票单位编码")
	private String billCompNo;

	/**
	 * 开票单位:开票单位
	 */
	@PropertyDef(label = "开票单位", description = "开票单位:开票单位")
	private String billCompName;

	/**
	 * 开票编号:开票编号
	 */
	@PropertyDef(label = "开票编号", description = "开票编号:开票编号")
	private String billNo;

	/**
	 * 协议号:协议号
	 */
	@PropertyDef(label = "协议号", description = "协议号:协议号")
	private String contNo;

	/**
	 * 订单号:订单号
	 */
	@PropertyDef(label = "订单号", description = "订单号:订单号")
	private String orderNo;

	/**
	 * 出场订单项次号:出场订单项次号
	 */
	@PropertyDef(label = "出场订单项次号", description = "出场订单项次号:出场订单项次号")
	private String orderItem;

	/**
	 * 来函流水号:来函流水号
	 */
	@PropertyDef(label = "来函流水号", description = "来函流水号:来函流水号")
	private String deliveryNo;

	/**
	 * 提货号:提货号
	 */
	@PropertyDef(label = "提货号", description = "提货号:提货号")
	private String ladingNo;

	/**
	 * 出库单号:出库单号
	 */
	@PropertyDef(label = "出库单号", description = "出库单号:出库单号")
	private String outNo;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 产品大类:产品大类
	 */
	@PropertyDef(label = "产品大类", description = "产品大类:产品大类")
	private String prodType;

	/**
	 * 产品大类名称:产品大类名称
	 */
	@PropertyDef(label = "产品大类名称", description = "产品大类名称:产品大类名称")
	private String prodTypeName;

	/**
	 * 产品编码:产品编码
	 */
	@PropertyDef(label = "产品编码", description = "产品编码:产品编码")
	private String productNo;

	/**
	 * 产品名称:产品名称
	 */
	@PropertyDef(label = "产品名称", description = "产品名称:产品名称")
	private String productName;

	/**
	 * 产品描述:产品描述
	 */
	@PropertyDef(label = "产品描述", description = "产品描述:产品描述")
	private String productDetail;

	/**
	 * 总数量:总数量
	 */
	@PropertyDef(label = "总数量", description = "总数量:总数量")
	private BigDecimal num;

	/**
	 * 总重量:总重量
	 */
	@PropertyDef(label = "总重量", description = "总重量:总重量")
	private BigDecimal wgt;

	/**
	 * 协议价格:协议价格
	 */
	@PropertyDef(label = "协议价格", description = "协议价格:协议价格")
	private BigDecimal price;

	/**
	 * 总费用:总费用
	 */
	@PropertyDef(label = "总费用", description = "总费用:总费用")
	private BigDecimal totalAmt;

	/**
	 * 税额:税额
	 */
	@PropertyDef(label = "税额", description = "税额:税额")
	private BigDecimal taxAmt;

	/**
	 * 缴款确认提交费用:缴款确认提交费用
	 */
	@PropertyDef(label = "缴款确认提交费用", description = "缴款确认提交费用:缴款确认提交费用")
	private BigDecimal jkqrtjFy;

	/**
	 * 确认配货费用:确认配货费用
	 */
	@PropertyDef(label = "确认配货费用", description = "确认配货费用:确认配货费用")
	private BigDecimal qrphFy;

	/**
	 * 天数:天数
	 */
	@PropertyDef(label = "天数", description = "天数:天数")
	private BigDecimal ts;

	/**
	 * 仓储价:仓储价
	 */
	@PropertyDef(label = "仓储价", description = "仓储价:仓储价")
	private BigDecimal storagePrice;

	/**
	 * 仓储费:仓储费
	 */
	@PropertyDef(label = "仓储费", description = "仓储费:仓储费")
	private BigDecimal storageAmt;

	/**
	 * 吊装价:吊装价
	 */
	@PropertyDef(label = "吊装价", description = "吊装价:吊装价")
	private BigDecimal liftingPrice;

	/**
	 * 吊装费:吊装费
	 */
	@PropertyDef(label = "吊装费", description = "吊装费:吊装费")
	private BigDecimal liftingAmt;

	/**
	 * 运输价:运输价
	 */
	@PropertyDef(label = "运输价", description = "运输价:运输价")
	private BigDecimal tranPrice;

	/**
	 * 运输费:运输费
	 */
	@PropertyDef(label = "运输费", description = "运输费:运输费")
	private BigDecimal tranAmt;

	/**
	 * 优惠单价:优惠单价
	 */
	@PropertyDef(label = "优惠单价", description = "优惠单价:优惠单价")
	private BigDecimal discountPrice;

	/**
	 * 优惠价:优惠价
	 */
	@PropertyDef(label = "优惠价", description = "优惠价:优惠价")
	private BigDecimal discountAmt;

	/**
	 * 特殊加收费用单价:特殊加收费用单价
	 */
	@PropertyDef(label = "特殊加收费用单价", description = "特殊加收费用单价:特殊加收费用单价")
	private BigDecimal orderPrice;

	/**
	 * 特殊加收费用金额:特殊加收费用金额
	 */
	@PropertyDef(label = "特殊加收费用金额", description = "特殊加收费用金额:特殊加收费用金额")
	private BigDecimal orderAmt;

	/**
	 * 保险费:保险费
	 */
	@PropertyDef(label = "保险费", description = "保险费:保险费")
	private BigDecimal premiumsAmt;

	/**
	 * 返回价单价:返回价单价
	 */
	@PropertyDef(label = "返回价单价", description = "返回价单价:返回价单价")
	private BigDecimal returnPrice;

	/**
	 * 返回金额:返回金额
	 */
	@PropertyDef(label = "返回金额", description = "返回金额:返回金额")
	private BigDecimal returnAmt;

	/**
	 * 翻堆价格:翻堆价格
	 */
	@PropertyDef(label = "翻堆价格", description = "翻堆价格:翻堆价格")
	private BigDecimal turnningPrice;

	/**
	 * 翻堆金额:翻堆金额
	 */
	@PropertyDef(label = "翻堆金额", description = "翻堆金额:翻堆金额")
	private BigDecimal turnningAmt;

	/**
	 * 超期单价:超期单价
	 */
	@PropertyDef(label = "超期单价", description = "超期单价:超期单价")
	private BigDecimal overduePrice;

	/**
	 * 超期费:超期费
	 */
	@PropertyDef(label = "超期费", description = "超期费:超期费")
	private BigDecimal overdueAmt;

	/**
	 * 超期费用付款单位编号:超期费用付款单位编号
	 */
	@PropertyDef(label = "超期费用付款单位编号", description = "超期费用付款单位编号:超期费用付款单位编号")
	private String overduePayCompNo;

	/**
	 * 超期费用付款单位:超期费用付款单位
	 */
	@PropertyDef(label = "超期费用付款单位", description = "超期费用付款单位:超期费用付款单位")
	private String overduePayCompName;

	/**
	 * 超期月结标记:超期月结标记
	 */
	@PropertyDef(label = "超期月结标记", description = "超期月结标记:超期月结标记")
	private String overdueSettleType;

	/**
	 * 超期结算单ID:超期结算单ID
	 */
	@PropertyDef(label = "超期结算单ID", description = "超期结算单ID:超期结算单ID")
	private String overdueSettleNo;

	/**
	 * 超期费是否结算:超期费是否结算
	 */
	@PropertyDef(label = "超期费是否结算", description = "超期费是否结算:超期费是否结算")
	private String overdueSettleFlag;

	/**
	 * 超期开票编号:超期开票编号
	 */
	@PropertyDef(label = "超期开票编号", description = "超期开票编号:超期开票编号")
	private String overdueSettleBill;

	/**
	 * 仓储管理费单价:仓储管理费单价
	 */
	@PropertyDef(label = "仓储管理费单价", description = "仓储管理费单价:仓储管理费单价")
	private BigDecimal managerPrice;

	/**
	 * 仓储管理费:仓储管理费
	 */
	@PropertyDef(label = "仓储管理费", description = "仓储管理费:仓储管理费")
	private BigDecimal managerAmt;

	/**
	 * 仓储管理月结标记:仓储管理月结标记
	 */
	@PropertyDef(label = "仓储管理月结标记", description = "仓储管理月结标记:仓储管理月结标记")
	private String managerSettleType;

	/**
	 * 仓储管理付款单位编号:仓储管理付款单位编号
	 */
	@PropertyDef(label = "仓储管理付款单位编号", description = "仓储管理付款单位编号:仓储管理付款单位编号")
	private String managerPayCompNo;

	/**
	 * 仓储管理付款单位:仓储管理付款单位
	 */
	@PropertyDef(label = "仓储管理付款单位", description = "仓储管理付款单位:仓储管理付款单位")
	private String managerPayCompName;

	/**
	 * 仓储管理结算单ID:仓储管理结算单ID
	 */
	@PropertyDef(label = "仓储管理结算单ID", description = "仓储管理结算单ID:仓储管理结算单ID")
	private String managerSettleNo;

	/**
	 * 仓储管理费是否结算:仓储管理费是否结算
	 */
	@PropertyDef(label = "仓储管理费是否结算", description = "仓储管理费是否结算:仓储管理费是否结算")
	private String managerSettleFlag;

	/**
	 * 仓储管理开票编号:仓储管理开票编号
	 */
	@PropertyDef(label = "仓储管理开票编号", description = "仓储管理开票编号:仓储管理开票编号")
	private String managerSettleBill;

	/**
	 * 备用单价1:备用单价1
	 */
	@PropertyDef(label = "备用单价1", description = "备用单价1:备用单价1")
	private BigDecimal byprice12;

	/**
	 * 备用单价2:备用单价2
	 */
	@PropertyDef(label = "备用单价2", description = "备用单价2:备用单价2")
	private BigDecimal byprice22;

	/**
	 * 备用费用1:备用费用1
	 */
	@PropertyDef(label = "备用费用1", description = "备用费用1:备用费用1")
	private BigDecimal byamt1;

	/**
	 * 备用费用2:备用费用2
	 */
	@PropertyDef(label = "备用费用2", description = "备用费用2:备用费用2")
	private BigDecimal byamt2;

	/**
	 * 出库日期:出库日期
	 */
	@PropertyDef(label = "出库日期", description = "出库日期:出库日期")
	private String outDate;

	/**
	 * 滞结标志:滞结标志
	 */
	@PropertyDef(label = "滞结标志", description = "滞结标志:滞结标志")
	private String iszj;

	/**
	 * 结算状态:结算状态
	 */
	@PropertyDef(label = "结算状态", description = "结算状态:结算状态")
	private String status;

	/**
	 * 应收应付标志:应收应付标志
	 */
	@PropertyDef(label = "应收应付标志", description = "应收应付标志:应收应付标志")
	private String ysyf;

	/**
	 * 方案号:方案号
	 */
	@PropertyDef(label = "方案号", description = "方案号:方案号")
	private String fno;

	/**
	 * 是否成本计算:是否成本计算
	 */
	@PropertyDef(label = "是否成本计算", description = "是否成本计算:是否成本计算")
	private String iscbjs;

	/**
	 * 航次号:航次号
	 */
	@PropertyDef(label = "航次号", description = "航次号:航次号")
	private String syhch;

	/**
	 * 船名:船名
	 */
	@PropertyDef(label = "船名", description = "船名:船名")
	private String shipNo;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

	/**
	 * 终点专用线编码:终点专用线编码
	 */
	@PropertyDef(label = "终点专用线编码", description = "终点专用线编码:终点专用线编码")
	private String lineCode;

	/**
	 * 到站:到站
	 */
	@PropertyDef(label = "到站", description = "到站:到站")
	private String stationCode;

	/**
	 * 承运商编号:承运商编号
	 */
	@PropertyDef(label = "承运商编号", description = "承运商编号:承运商编号")
	private String carrierNo;

	/**
	 * 承运商名称:承运商名称
	 */
	@PropertyDef(label = "承运商名称", description = "承运商名称:承运商名称")
	private String carrierName;

	/**
	 * 备用价1:备用价1
	 */
	@PropertyDef(label = "备用价1", description = "备用价1:备用价1")
	private BigDecimal byprice1;

	/**
	 * 备用价2:备用价2
	 */
	@PropertyDef(label = "备用价2", description = "备用价2:备用价2")
	private BigDecimal byprice2;

	/**
	 * 备用费1:备用费1
	 */
	@PropertyDef(label = "备用费1", description = "备用费1:备用费1")
	private BigDecimal bynum1;

	/**
	 * 备用费2:备用费2
	 */
	@PropertyDef(label = "备用费2", description = "备用费2:备用费2")
	private BigDecimal bynum2;

	/**
	 * 备用1:备用1
	 */
	@PropertyDef(label = "备用1", description = "备用1:备用1")
	private String by1;

	/**
	 * 备用2:备用2
	 */
	@PropertyDef(label = "备用2", description = "备用2:备用2")
	private String by2;

	/**
	 * 备用3:备用3
	 */
	@PropertyDef(label = "备用3", description = "备用3:备用3")
	private String by3;

	/**
	 * 备用4:备用4
	 */
	@PropertyDef(label = "备用4", description = "备用4:备用4")
	private String by4;

	/**
	 * 备用5:备用5
	 */
	@PropertyDef(label = "备用5", description = "备用5:备用5")
	private BigDecimal by5;

	/**
	 * 创建人:创建人
	 */
	@PropertyDef(label = "创建人", description = "创建人:创建人")
	private String createEmp;

	/**
	 * 创建时间:创建时间
	 */
	@PropertyDef(label = "创建时间", description = "创建时间:创建时间")
	private Date createDate;

	/**
	 * 修改人:修改人
	 */
	@PropertyDef(label = "修改人", description = "修改人:修改人")
	private String updateEmp;

	/**
	 * 修改时间:修改时间
	 */
	@PropertyDef(label = "修改时间", description = "修改时间:修改时间")
	private Date updateDate;

	/**
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;

	public Tbih40a() {
		super();
	}

	public Tbih40a(String ih40aId, String ih40Id, String compId,
			String settleNo, String yearMonth, String settleDate,
			String settleEmp, String cancleDate, String cancleEmp,
			String settleType, String priceSno, String ftype, String jsxm,
			String custNo, String custName, String payCompNo,
			String payCompName, String billCompNo, String billCompName,
			String billNo, String contNo, String orderNo, String orderItem,
			String deliveryNo, String ladingNo, String outNo, String tranType,
			String labelNo, String prodType, String prodTypeName,
			String productNo, String productName, String productDetail,
			BigDecimal num, BigDecimal wgt, BigDecimal price,
			BigDecimal totalAmt, BigDecimal taxAmt, BigDecimal jkqrtjFy,
			BigDecimal qrphFy, BigDecimal ts, BigDecimal storagePrice,
			BigDecimal storageAmt, BigDecimal liftingPrice,
			BigDecimal liftingAmt, BigDecimal tranPrice, BigDecimal tranAmt,
			BigDecimal discountPrice, BigDecimal discountAmt,
			BigDecimal orderPrice, BigDecimal orderAmt, BigDecimal premiumsAmt,
			BigDecimal returnPrice, BigDecimal returnAmt,
			BigDecimal turnningPrice, BigDecimal turnningAmt,
			BigDecimal overduePrice, BigDecimal overdueAmt,
			String overduePayCompNo, String overduePayCompName,
			String overdueSettleType, String overdueSettleNo,
			String overdueSettleFlag, String overdueSettleBill,
			BigDecimal managerPrice, BigDecimal managerAmt,
			String managerSettleType, String managerPayCompNo,
			String managerPayCompName, String managerSettleNo,
			String managerSettleFlag, String managerSettleBill,
			BigDecimal byprice12, BigDecimal byprice22, BigDecimal byamt1,
			BigDecimal byamt2, String outDate, String iszj, String status,
			String ysyf, String fno, String iscbjs, String syhch,
			String shipNo, String carNo, String lineCode, String stationCode,
			String carrierNo, String carrierName, BigDecimal byprice1,
			BigDecimal byprice2, BigDecimal bynum1, BigDecimal bynum2,
			String by1, String by2, String by3, String by4, BigDecimal by5,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.ih40aId = ih40aId;
		this.ih40Id = ih40Id;
		this.compId = compId;
		this.settleNo = settleNo;
		this.yearMonth = yearMonth;
		this.settleDate = settleDate;
		this.settleEmp = settleEmp;
		this.cancleDate = cancleDate;
		this.cancleEmp = cancleEmp;
		this.settleType = settleType;
		this.priceSno = priceSno;
		this.ftype = ftype;
		this.jsxm = jsxm;
		this.custNo = custNo;
		this.custName = custName;
		this.payCompNo = payCompNo;
		this.payCompName = payCompName;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.billNo = billNo;
		this.contNo = contNo;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.deliveryNo = deliveryNo;
		this.ladingNo = ladingNo;
		this.outNo = outNo;
		this.tranType = tranType;
		this.labelNo = labelNo;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.num = num;
		this.wgt = wgt;
		this.price = price;
		this.totalAmt = totalAmt;
		this.taxAmt = taxAmt;
		this.jkqrtjFy = jkqrtjFy;
		this.qrphFy = qrphFy;
		this.ts = ts;
		this.storagePrice = storagePrice;
		this.storageAmt = storageAmt;
		this.liftingPrice = liftingPrice;
		this.liftingAmt = liftingAmt;
		this.tranPrice = tranPrice;
		this.tranAmt = tranAmt;
		this.discountPrice = discountPrice;
		this.discountAmt = discountAmt;
		this.orderPrice = orderPrice;
		this.orderAmt = orderAmt;
		this.premiumsAmt = premiumsAmt;
		this.returnPrice = returnPrice;
		this.returnAmt = returnAmt;
		this.turnningPrice = turnningPrice;
		this.turnningAmt = turnningAmt;
		this.overduePrice = overduePrice;
		this.overdueAmt = overdueAmt;
		this.overduePayCompNo = overduePayCompNo;
		this.overduePayCompName = overduePayCompName;
		this.overdueSettleType = overdueSettleType;
		this.overdueSettleNo = overdueSettleNo;
		this.overdueSettleFlag = overdueSettleFlag;
		this.overdueSettleBill = overdueSettleBill;
		this.managerPrice = managerPrice;
		this.managerAmt = managerAmt;
		this.managerSettleType = managerSettleType;
		this.managerPayCompNo = managerPayCompNo;
		this.managerPayCompName = managerPayCompName;
		this.managerSettleNo = managerSettleNo;
		this.managerSettleFlag = managerSettleFlag;
		this.managerSettleBill = managerSettleBill;
		this.byprice12 = byprice12;
		this.byprice22 = byprice22;
		this.byamt1 = byamt1;
		this.byamt2 = byamt2;
		this.outDate = outDate;
		this.iszj = iszj;
		this.status = status;
		this.ysyf = ysyf;
		this.fno = fno;
		this.iscbjs = iscbjs;
		this.syhch = syhch;
		this.shipNo = shipNo;
		this.carNo = carNo;
		this.lineCode = lineCode;
		this.stationCode = stationCode;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.byprice1 = byprice1;
		this.byprice2 = byprice2;
		this.bynum1 = bynum1;
		this.bynum2 = bynum2;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.by4 = by4;
		this.by5 = by5;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh40aId(String ih40aId) {
		this.ih40aId = ih40aId;
	}

	@Id
	@Column(name = "IH40A_ID_", length = 50, nullable = false)
	public String getIh40aId() {
		return ih40aId;
	}

	public void setIh40Id(String ih40Id) {
		this.ih40Id = ih40Id;
	}

	@Column(name = "IH40_ID_", length = 50)
	public String getIh40Id() {
		return ih40Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20, unique = true)
	public String getSettleNo() {
		return settleNo;
	}

	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	@Column(name = "YEAR_MONTH_", length = 20)
	public String getYearMonth() {
		return yearMonth;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	@Column(name = "SETTLE_DATE_", length = 20)
	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleEmp(String settleEmp) {
		this.settleEmp = settleEmp;
	}

	@Column(name = "SETTLE_EMP_", length = 50)
	public String getSettleEmp() {
		return settleEmp;
	}

	public void setCancleDate(String cancleDate) {
		this.cancleDate = cancleDate;
	}

	@Column(name = "CANCLE_DATE_", length = 20)
	public String getCancleDate() {
		return cancleDate;
	}

	public void setCancleEmp(String cancleEmp) {
		this.cancleEmp = cancleEmp;
	}

	@Column(name = "CANCLE_EMP_", length = 50)
	public String getCancleEmp() {
		return cancleEmp;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setPriceSno(String priceSno) {
		this.priceSno = priceSno;
	}

	@Column(name = "PRICE_SNO_", length = 20, unique = true)
	public String getPriceSno() {
		return priceSno;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	@Column(name = "FTYPE_", length = 20, unique = true)
	public String getFtype() {
		return ftype;
	}

	public void setJsxm(String jsxm) {
		this.jsxm = jsxm;
	}

	@Column(name = "JSXM_", length = 200, unique = true)
	public String getJsxm() {
		return jsxm;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 20, unique = true)
	public String getCustNo() {
		return custNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CUST_NAME_", length = 200)
	public String getCustName() {
		return custName;
	}

	public void setPayCompNo(String payCompNo) {
		this.payCompNo = payCompNo;
	}

	@Column(name = "PAY_COMP_NO_", length = 20)
	public String getPayCompNo() {
		return payCompNo;
	}

	public void setPayCompName(String payCompName) {
		this.payCompName = payCompName;
	}

	@Column(name = "PAY_COMP_NAME_", length = 200)
	public String getPayCompName() {
		return payCompName;
	}

	public void setBillCompNo(String billCompNo) {
		this.billCompNo = billCompNo;
	}

	@Column(name = "BILL_COMP_NO_", length = 20)
	public String getBillCompNo() {
		return billCompNo;
	}

	public void setBillCompName(String billCompName) {
		this.billCompName = billCompName;
	}

	@Column(name = "BILL_COMP_NAME_", length = 200)
	public String getBillCompName() {
		return billCompName;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILL_NO_", length = 20)
	public String getBillNo() {
		return billNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "ORDER_NO_", length = 20)
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	@Column(name = "ORDER_ITEM_", length = 20)
	public String getOrderItem() {
		return orderItem;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	@Column(name = "DELIVERY_NO_", length = 20)
	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20)
	public String getOutNo() {
		return outNo;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 45)
	public String getTranType() {
		return tranType;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20, unique = true)
	public String getLabelNo() {
		return labelNo;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	@Column(name = "PROD_TYPE_", length = 20)
	public String getProdType() {
		return prodType;
	}

	public void setProdTypeName(String prodTypeName) {
		this.prodTypeName = prodTypeName;
	}

	@Column(name = "PROD_TYPE_NAME_", length = 100)
	public String getProdTypeName() {
		return prodTypeName;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	@Column(name = "PRODUCT_NO_", length = 20)
	public String getProductNo() {
		return productNo;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_NAME_", length = 100)
	public String getProductName() {
		return productName;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	@Column(name = "PRODUCT_DETAIL_", length = 200)
	public String getProductDetail() {
		return productDetail;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "NUM_")
	public BigDecimal getNum() {
		return num;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	@Column(name = "WGT_")
	public BigDecimal getWgt() {
		return wgt;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Column(name = "TOTAL_AMT_")
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Column(name = "TAX_AMT_")
	public BigDecimal getTaxAmt() {
		return taxAmt;
	}

	public void setJkqrtjFy(BigDecimal jkqrtjFy) {
		this.jkqrtjFy = jkqrtjFy;
	}

	@Column(name = "JKQRTJ_FY_")
	public BigDecimal getJkqrtjFy() {
		return jkqrtjFy;
	}

	public void setQrphFy(BigDecimal qrphFy) {
		this.qrphFy = qrphFy;
	}

	@Column(name = "QRPH_FY_")
	public BigDecimal getQrphFy() {
		return qrphFy;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	@Column(name = "TS_")
	public BigDecimal getTs() {
		return ts;
	}

	public void setStoragePrice(BigDecimal storagePrice) {
		this.storagePrice = storagePrice;
	}

	@Column(name = "STORAGE_PRICE_")
	public BigDecimal getStoragePrice() {
		return storagePrice;
	}

	public void setStorageAmt(BigDecimal storageAmt) {
		this.storageAmt = storageAmt;
	}

	@Column(name = "STORAGE_AMT_")
	public BigDecimal getStorageAmt() {
		return storageAmt;
	}

	public void setLiftingPrice(BigDecimal liftingPrice) {
		this.liftingPrice = liftingPrice;
	}

	@Column(name = "LIFTING_PRICE_")
	public BigDecimal getLiftingPrice() {
		return liftingPrice;
	}

	public void setLiftingAmt(BigDecimal liftingAmt) {
		this.liftingAmt = liftingAmt;
	}

	@Column(name = "LIFTING_AMT_")
	public BigDecimal getLiftingAmt() {
		return liftingAmt;
	}

	public void setTranPrice(BigDecimal tranPrice) {
		this.tranPrice = tranPrice;
	}

	@Column(name = "TRAN_PRICE_")
	public BigDecimal getTranPrice() {
		return tranPrice;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	@Column(name = "TRAN_AMT_")
	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Column(name = "DISCOUNT_PRICE_")
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountAmt(BigDecimal discountAmt) {
		this.discountAmt = discountAmt;
	}

	@Column(name = "DISCOUNT_AMT_")
	public BigDecimal getDiscountAmt() {
		return discountAmt;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Column(name = "ORDER_PRICE_")
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderAmt(BigDecimal orderAmt) {
		this.orderAmt = orderAmt;
	}

	@Column(name = "ORDER_AMT_")
	public BigDecimal getOrderAmt() {
		return orderAmt;
	}

	public void setPremiumsAmt(BigDecimal premiumsAmt) {
		this.premiumsAmt = premiumsAmt;
	}

	@Column(name = "PREMIUMS_AMT_")
	public BigDecimal getPremiumsAmt() {
		return premiumsAmt;
	}

	public void setReturnPrice(BigDecimal returnPrice) {
		this.returnPrice = returnPrice;
	}

	@Column(name = "RETURN_PRICE_")
	public BigDecimal getReturnPrice() {
		return returnPrice;
	}

	public void setReturnAmt(BigDecimal returnAmt) {
		this.returnAmt = returnAmt;
	}

	@Column(name = "RETURN_AMT_")
	public BigDecimal getReturnAmt() {
		return returnAmt;
	}

	public void setTurnningPrice(BigDecimal turnningPrice) {
		this.turnningPrice = turnningPrice;
	}

	@Column(name = "TURNNING_PRICE_")
	public BigDecimal getTurnningPrice() {
		return turnningPrice;
	}

	public void setTurnningAmt(BigDecimal turnningAmt) {
		this.turnningAmt = turnningAmt;
	}

	@Column(name = "TURNNING_AMT_")
	public BigDecimal getTurnningAmt() {
		return turnningAmt;
	}

	public void setOverduePrice(BigDecimal overduePrice) {
		this.overduePrice = overduePrice;
	}

	@Column(name = "OVERDUE_PRICE_")
	public BigDecimal getOverduePrice() {
		return overduePrice;
	}

	public void setOverdueAmt(BigDecimal overdueAmt) {
		this.overdueAmt = overdueAmt;
	}

	@Column(name = "OVERDUE_AMT_")
	public BigDecimal getOverdueAmt() {
		return overdueAmt;
	}

	public void setOverduePayCompNo(String overduePayCompNo) {
		this.overduePayCompNo = overduePayCompNo;
	}

	@Column(name = "OVERDUE_PAY_COMP_NO_", length = 20)
	public String getOverduePayCompNo() {
		return overduePayCompNo;
	}

	public void setOverduePayCompName(String overduePayCompName) {
		this.overduePayCompName = overduePayCompName;
	}

	@Column(name = "OVERDUE_PAY_COMP_NAME_", length = 200)
	public String getOverduePayCompName() {
		return overduePayCompName;
	}

	public void setOverdueSettleType(String overdueSettleType) {
		this.overdueSettleType = overdueSettleType;
	}

	@Column(name = "OVERDUE_SETTLE_TYPE_", length = 20)
	public String getOverdueSettleType() {
		return overdueSettleType;
	}

	public void setOverdueSettleNo(String overdueSettleNo) {
		this.overdueSettleNo = overdueSettleNo;
	}

	@Column(name = "OVERDUE_SETTLE_NO_", length = 20)
	public String getOverdueSettleNo() {
		return overdueSettleNo;
	}

	public void setOverdueSettleFlag(String overdueSettleFlag) {
		this.overdueSettleFlag = overdueSettleFlag;
	}

	@Column(name = "OVERDUE_SETTLE_FLAG_", length = 20)
	public String getOverdueSettleFlag() {
		return overdueSettleFlag;
	}

	public void setOverdueSettleBill(String overdueSettleBill) {
		this.overdueSettleBill = overdueSettleBill;
	}

	@Column(name = "OVERDUE_SETTLE_BILL_", length = 20)
	public String getOverdueSettleBill() {
		return overdueSettleBill;
	}

	public void setManagerPrice(BigDecimal managerPrice) {
		this.managerPrice = managerPrice;
	}

	@Column(name = "MANAGER_PRICE_")
	public BigDecimal getManagerPrice() {
		return managerPrice;
	}

	public void setManagerAmt(BigDecimal managerAmt) {
		this.managerAmt = managerAmt;
	}

	@Column(name = "MANAGER_AMT_")
	public BigDecimal getManagerAmt() {
		return managerAmt;
	}

	public void setManagerSettleType(String managerSettleType) {
		this.managerSettleType = managerSettleType;
	}

	@Column(name = "MANAGER_SETTLE_TYPE_", length = 20)
	public String getManagerSettleType() {
		return managerSettleType;
	}

	public void setManagerPayCompNo(String managerPayCompNo) {
		this.managerPayCompNo = managerPayCompNo;
	}

	@Column(name = "MANAGER_PAY_COMP_NO_", length = 20)
	public String getManagerPayCompNo() {
		return managerPayCompNo;
	}

	public void setManagerPayCompName(String managerPayCompName) {
		this.managerPayCompName = managerPayCompName;
	}

	@Column(name = "MANAGER_PAY_COMP_NAME_", length = 200)
	public String getManagerPayCompName() {
		return managerPayCompName;
	}

	public void setManagerSettleNo(String managerSettleNo) {
		this.managerSettleNo = managerSettleNo;
	}

	@Column(name = "MANAGER_SETTLE_NO_", length = 20)
	public String getManagerSettleNo() {
		return managerSettleNo;
	}

	public void setManagerSettleFlag(String managerSettleFlag) {
		this.managerSettleFlag = managerSettleFlag;
	}

	@Column(name = "MANAGER_SETTLE_FLAG_", length = 20)
	public String getManagerSettleFlag() {
		return managerSettleFlag;
	}

	public void setManagerSettleBill(String managerSettleBill) {
		this.managerSettleBill = managerSettleBill;
	}

	@Column(name = "MANAGER_SETTLE_BILL_", length = 20)
	public String getManagerSettleBill() {
		return managerSettleBill;
	}

	public void setByprice12(BigDecimal byprice12) {
		this.byprice12 = byprice12;
	}

	@Column(name = "BYPRICE1_2")
	public BigDecimal getByprice12() {
		return byprice12;
	}

	public void setByprice22(BigDecimal byprice22) {
		this.byprice22 = byprice22;
	}

	@Column(name = "BYPRICE2_2")
	public BigDecimal getByprice22() {
		return byprice22;
	}

	public void setByamt1(BigDecimal byamt1) {
		this.byamt1 = byamt1;
	}

	@Column(name = "BYAMT1_")
	public BigDecimal getByamt1() {
		return byamt1;
	}

	public void setByamt2(BigDecimal byamt2) {
		this.byamt2 = byamt2;
	}

	@Column(name = "BYAMT2_")
	public BigDecimal getByamt2() {
		return byamt2;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	@Column(name = "OUT_DATE_", length = 20)
	public String getOutDate() {
		return outDate;
	}

	public void setIszj(String iszj) {
		this.iszj = iszj;
	}

	@Column(name = "ISZJ_", length = 4)
	public String getIszj() {
		return iszj;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 4)
	public String getStatus() {
		return status;
	}

	public void setYsyf(String ysyf) {
		this.ysyf = ysyf;
	}

	@Column(name = "YSYF_", length = 10)
	public String getYsyf() {
		return ysyf;
	}

	public void setFno(String fno) {
		this.fno = fno;
	}

	@Column(name = "FNO_", length = 20)
	public String getFno() {
		return fno;
	}

	public void setIscbjs(String iscbjs) {
		this.iscbjs = iscbjs;
	}

	@Column(name = "ISCBJS_", length = 5)
	public String getIscbjs() {
		return iscbjs;
	}

	public void setSyhch(String syhch) {
		this.syhch = syhch;
	}

	@Column(name = "SYHCH_", length = 20)
	public String getSyhch() {
		return syhch;
	}

	public void setShipNo(String shipNo) {
		this.shipNo = shipNo;
	}

	@Column(name = "SHIP_NO_", length = 45)
	public String getShipNo() {
		return shipNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 45)
	public String getCarNo() {
		return carNo;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	@Column(name = "LINE_CODE_", length = 50)
	public String getLineCode() {
		return lineCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	@Column(name = "STATION_CODE_", length = 50)
	public String getStationCode() {
		return stationCode;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	@Column(name = "CARRIER_NO_", length = 20)
	public String getCarrierNo() {
		return carrierNo;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	@Column(name = "CARRIER_NAME_", length = 200)
	public String getCarrierName() {
		return carrierName;
	}

	public void setByprice1(BigDecimal byprice1) {
		this.byprice1 = byprice1;
	}

	@Column(name = "BYPRICE1_")
	public BigDecimal getByprice1() {
		return byprice1;
	}

	public void setByprice2(BigDecimal byprice2) {
		this.byprice2 = byprice2;
	}

	@Column(name = "BYPRICE2_")
	public BigDecimal getByprice2() {
		return byprice2;
	}

	public void setBynum1(BigDecimal bynum1) {
		this.bynum1 = bynum1;
	}

	@Column(name = "BYNUM1_")
	public BigDecimal getBynum1() {
		return bynum1;
	}

	public void setBynum2(BigDecimal bynum2) {
		this.bynum2 = bynum2;
	}

	@Column(name = "BYNUM2_")
	public BigDecimal getBynum2() {
		return bynum2;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 45)
	public String getBy1() {
		return by1;
	}

	public void setBy2(String by2) {
		this.by2 = by2;
	}

	@Column(name = "BY2_", length = 45)
	public String getBy2() {
		return by2;
	}

	public void setBy3(String by3) {
		this.by3 = by3;
	}

	@Column(name = "BY3_", length = 45)
	public String getBy3() {
		return by3;
	}

	public void setBy4(String by4) {
		this.by4 = by4;
	}

	@Column(name = "BY4_", length = 100)
	public String getBy4() {
		return by4;
	}

	public void setBy5(BigDecimal by5) {
		this.by5 = by5;
	}

	@Column(name = "BY5_")
	public BigDecimal getBy5() {
		return by5;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 50)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE_")
	public Date getCreateDate() {
		return createDate;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 50)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE_")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbih40a [ih40aId=" + ih40aId + ",ih40Id=" + ih40Id + ",compId="
				+ compId + ",settleNo=" + settleNo + ",yearMonth=" + yearMonth
				+ ",settleDate=" + settleDate + ",settleEmp=" + settleEmp
				+ ",cancleDate=" + cancleDate + ",cancleEmp=" + cancleEmp
				+ ",settleType=" + settleType + ",priceSno=" + priceSno
				+ ",ftype=" + ftype + ",jsxm=" + jsxm + ",custNo=" + custNo
				+ ",custName=" + custName + ",payCompNo=" + payCompNo
				+ ",payCompName=" + payCompName + ",billCompNo=" + billCompNo
				+ ",billCompName=" + billCompName + ",billNo=" + billNo
				+ ",contNo=" + contNo + ",orderNo=" + orderNo + ",orderItem="
				+ orderItem + ",deliveryNo=" + deliveryNo + ",ladingNo="
				+ ladingNo + ",outNo=" + outNo + ",tranType=" + tranType
				+ ",labelNo=" + labelNo + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",productDetail="
				+ productDetail + ",num=" + num + ",wgt=" + wgt + ",price="
				+ price + ",totalAmt=" + totalAmt + ",taxAmt=" + taxAmt
				+ ",jkqrtjFy=" + jkqrtjFy + ",qrphFy=" + qrphFy + ",ts=" + ts
				+ ",storagePrice=" + storagePrice + ",storageAmt=" + storageAmt
				+ ",liftingPrice=" + liftingPrice + ",liftingAmt=" + liftingAmt
				+ ",tranPrice=" + tranPrice + ",tranAmt=" + tranAmt
				+ ",discountPrice=" + discountPrice + ",discountAmt="
				+ discountAmt + ",orderPrice=" + orderPrice + ",orderAmt="
				+ orderAmt + ",premiumsAmt=" + premiumsAmt + ",returnPrice="
				+ returnPrice + ",returnAmt=" + returnAmt + ",turnningPrice="
				+ turnningPrice + ",turnningAmt=" + turnningAmt
				+ ",overduePrice=" + overduePrice + ",overdueAmt=" + overdueAmt
				+ ",overduePayCompNo=" + overduePayCompNo
				+ ",overduePayCompName=" + overduePayCompName
				+ ",overdueSettleType=" + overdueSettleType
				+ ",overdueSettleNo=" + overdueSettleNo + ",overdueSettleFlag="
				+ overdueSettleFlag + ",overdueSettleBill=" + overdueSettleBill
				+ ",managerPrice=" + managerPrice + ",managerAmt=" + managerAmt
				+ ",managerSettleType=" + managerSettleType
				+ ",managerPayCompNo=" + managerPayCompNo
				+ ",managerPayCompName=" + managerPayCompName
				+ ",managerSettleNo=" + managerSettleNo + ",managerSettleFlag="
				+ managerSettleFlag + ",managerSettleBill=" + managerSettleBill
				+ ",byprice12=" + byprice12 + ",byprice22=" + byprice22
				+ ",byamt1=" + byamt1 + ",byamt2=" + byamt2 + ",outDate="
				+ outDate + ",iszj=" + iszj + ",status=" + status + ",ysyf="
				+ ysyf + ",fno=" + fno + ",iscbjs=" + iscbjs + ",syhch="
				+ syhch + ",shipNo=" + shipNo + ",carNo=" + carNo
				+ ",lineCode=" + lineCode + ",stationCode=" + stationCode
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",byprice1=" + byprice1 + ",byprice2=" + byprice2
				+ ",bynum1=" + bynum1 + ",bynum2=" + bynum2 + ",by1=" + by1
				+ ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

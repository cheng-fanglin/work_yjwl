package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh10:运单信息表TBSH10
 */
@Entity
@Table(name = "tbsh10")
public class Tbsh10 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh10Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 分公司别:分公司别
	 */
	@PropertyDef(label = "分公司别", description = "分公司别:分公司别")
	private String compCode;

	/**
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

	/**
	 * 协议号:协议号
	 */
	@PropertyDef(label = "协议号", description = "协议号:协议号")
	private String contNo;

	/**
	 * 承运协议号:承运协议号
	 */
	@PropertyDef(label = "承运协议号", description = "承运协议号:承运协议号")
	private String transContNo;

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
	 * 货主单位编码:货主单位编码
	 */
	@PropertyDef(label = "货主单位编码", description = "货主单位编码:货主单位编码")
	private String ownerCompNo;

	/**
	 * 货主单位:货主单位
	 */
	@PropertyDef(label = "货主单位", description = "货主单位:货主单位")
	private String ownerCompName;

	/**
	 * 车型要求:车型要求
	 */
	@PropertyDef(label = "车型要求", description = "车型要求:车型要求")
	private String carType;

	/**
	 * 车长要求:车长要求
	 */
	@PropertyDef(label = "车长要求", description = "车长要求:车长要求")
	private String carLength;

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
	 * 货物编号:货物编号
	 */
	@PropertyDef(label = "货物编号", description = "货物编号:货物编号")
	private String productNo;

	/**
	 * 货物名称:货物名称
	 */
	@PropertyDef(label = "货物名称", description = "货物名称:货物名称")
	private String productName;

	/**
	 * 产品描述:产品描述
	 */
	@PropertyDef(label = "产品描述", description = "产品描述:产品描述")
	private String productDetail;

	/**
	 * 多产品标记:多产品标记
	 */
	@PropertyDef(label = "多产品标记", description = "多产品标记:多产品标记")
	private String mutiProd;

	/**
	 * 钢质:钢质
	 */
	@PropertyDef(label = "钢质", description = "钢质:钢质")
	private String steel;

	/**
	 * 件数:件数
	 */
	@PropertyDef(label = "件数", description = "件数:件数")
	private String orderNum;

	/**
	 * 协议重量:协议重量
	 */
	@PropertyDef(label = "协议重量", description = "协议重量:协议重量")
	private BigDecimal orderWgt;

	/**
	 * 运单重量:运单重量
	 */
	@PropertyDef(label = "运单重量", description = "运单重量:运单重量")
	private BigDecimal ladingWgt;

	/**
	 * 开票单位编号:开票单位编号
	 */
	@PropertyDef(label = "开票单位编号", description = "开票单位编号:开票单位编号")
	private String billCompNo;

	/**
	 * 开票单位:开票单位
	 */
	@PropertyDef(label = "开票单位", description = "开票单位:开票单位")
	private String billCompName;

	/**
	 * 规格:规格
	 */
	@PropertyDef(label = "规格", description = "规格:规格")
	private String size;

	/**
	 * 标题:标题
	 */
	@PropertyDef(label = "标题", description = "标题:标题")
	private String title;

	/**
	 * 特别提示:特别提示
	 */
	@PropertyDef(label = "特别提示", description = "特别提示:特别提示")
	private String memo;

	/**
	 * 税率:税率
	 */
	@PropertyDef(label = "税率", description = "税率:税率")
	private BigDecimal tax;

	/**
	 * 运距:运距
	 */
	@PropertyDef(label = "运距", description = "运距:运距")
	private BigDecimal distance;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String transType;

	/**
	 * 起点编码:起点编码
	 */
	@PropertyDef(label = "起点编码", description = "起点编码:起点编码")
	private String startStationCode;

	/**
	 * 起点:起点
	 */
	@PropertyDef(label = "起点", description = "起点:起点")
	private String startStation;

	/**
	 * 起点专用线编码:起点专用线编码
	 */
	@PropertyDef(label = "起点专用线编码", description = "起点专用线编码:起点专用线编码")
	private String startLineCode;

	/**
	 * 起点专用线:起点专用线
	 */
	@PropertyDef(label = "起点专用线", description = "起点专用线:起点专用线")
	private String startLine;

	/**
	 * 具体发货地址:具体发货地址
	 */
	@PropertyDef(label = "具体发货地址", description = "具体发货地址:具体发货地址")
	private String despatchAddress;

	/**
	 * 发货人编号:发货人编号
	 */
	@PropertyDef(label = "发货人编号", description = "发货人编号:发货人编号")
	private String despatchNo;

	/**
	 * 发货人姓名:发货人姓名
	 */
	@PropertyDef(label = "发货人姓名", description = "发货人姓名:发货人姓名")
	private String despatchName;

	/**
	 * 发货人电话:发货人电话
	 */
	@PropertyDef(label = "发货人电话", description = "发货人电话:发货人电话")
	private String despatchMobile;

	/**
	 * 装货时间起:装货时间起
	 */
	@PropertyDef(label = "装货时间起", description = "装货时间起:装货时间起")
	private String despatchStart;

	/**
	 * 装货时间止:装货时间止
	 */
	@PropertyDef(label = "装货时间止", description = "装货时间止:装货时间止")
	private String despatchEnd;

	/**
	 * 终点编码:终点编码
	 */
	@PropertyDef(label = "终点编码", description = "终点编码:终点编码")
	private String endStationCode;

	/**
	 * 终点:终点
	 */
	@PropertyDef(label = "终点", description = "终点:终点")
	private String endStation;

	/**
	 * 终点专用线编码:终点专用线编码
	 */
	@PropertyDef(label = "终点专用线编码", description = "终点专用线编码:终点专用线编码")
	private String endLineCode;

	/**
	 * 终点专用线:终点专用线
	 */
	@PropertyDef(label = "终点专用线", description = "终点专用线:终点专用线")
	private String endLine;

	/**
	 * 具体收货地址:具体收货地址
	 */
	@PropertyDef(label = "具体收货地址", description = "具体收货地址:具体收货地址")
	private String deliveryAddress;

	/**
	 * 收货单位编号:收货单位编号
	 */
	@PropertyDef(label = "收货单位编号", description = "收货单位编号:收货单位编号")
	private String receiptCompNo;

	/**
	 * 收货人姓名:收货人姓名
	 */
	@PropertyDef(label = "收货人姓名", description = "收货人姓名:收货人姓名")
	private String receiptCompName;

	/**
	 * 收货人电话:收货人电话
	 */
	@PropertyDef(label = "收货人电话", description = "收货人电话:收货人电话")
	private String receiptPhone;

	/**
	 * 收货开始时间:收货开始时间
	 */
	@PropertyDef(label = "收货开始时间", description = "收货开始时间:收货开始时间")
	private String receiptStart;

	/**
	 * 收货结束时间:收货结束时间
	 */
	@PropertyDef(label = "收货结束时间", description = "收货结束时间:收货结束时间")
	private String receiptEnd;

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
	 * 付款单位:付款单位
	 */
	@PropertyDef(label = "付款单位", description = "付款单位:付款单位")
	private String payCompNo;

	/**
	 * 付款单位名称:付款单位名称
	 */
	@PropertyDef(label = "付款单位名称", description = "付款单位名称:付款单位名称")
	private String payCompName;

	/**
	 * 发布价格:发布价格
	 */
	@PropertyDef(label = "发布价格", description = "发布价格:发布价格")
	private BigDecimal quote;

	/**
	 * 货值:货值
	 */
	@PropertyDef(label = "货值", description = "货值:货值")
	private BigDecimal cargoMoney;

	/**
	 * 是否指定承运方:是否指定承运方
	 */
	@PropertyDef(label = "是否指定承运方", description = "是否指定承运方:是否指定承运方")
	private String idDestineOrder;

	/**
	 * 发布单价:发布单价
	 */
	@PropertyDef(label = "发布单价", description = "发布单价:发布单价")
	private BigDecimal unitFreight;

	/**
	 * 发布时间:发布时间
	 */
	@PropertyDef(label = "发布时间", description = "发布时间:发布时间")
	private String publishTime;

	/**
	 * 违约追加运费:违约追加运费
	 */
	@PropertyDef(label = "违约追加运费", description = "违约追加运费:违约追加运费")
	private BigDecimal breachAddMoney;

	/**
	 * 已发布运单量:已发布运单量
	 */
	@PropertyDef(label = "已发布运单量", description = "已发布运单量:已发布运单量")
	private BigDecimal publishedWgt;

	/**
	 * 发布接单量:发布接单量
	 */
	@PropertyDef(label = "发布接单量", description = "发布接单量:发布接单量")
	private BigDecimal ecWgt;

	/**
	 * 已发货量:已发货量
	 */
	@PropertyDef(label = "已发货量", description = "已发货量:已发货量")
	private BigDecimal deliveredWgt;

	/**
	 * 已回单量:已回单量
	 */
	@PropertyDef(label = "已回单量", description = "已回单量:已回单量")
	private BigDecimal backWgt;

	/**
	 * 计价方式（1包车价2重量）:计价方式（1包车价2重量）
	 */
	@PropertyDef(label = "计价方式（1包车价2重量）", description = "计价方式（1包车价2重量）:计价方式（1包车价2重量）")
	private String payType;

	/**
	 * 单价:单价
	 */
	@PropertyDef(label = "单价", description = "单价:单价")
	private BigDecimal unitPrice;

	/**
	 * 结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)
	 */
	@PropertyDef(label = "结算方式(1日结2月结3自定义日期)", description = "结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)")
	private String settleType;

	/**
	 * 结算宽限日:结算宽限日
	 */
	@PropertyDef(label = "结算宽限日", description = "结算宽限日:结算宽限日")
	private BigDecimal settleTimeLimit;

	/**
	 * 预付款:预付款
	 */
	@PropertyDef(label = "预付款", description = "预付款:预付款")
	private BigDecimal prePayments;

	/**
	 * 预付款类型:预付款类型
	 */
	@PropertyDef(label = "预付款类型", description = "预付款类型:预付款类型")
	private String prePayType;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 新增人:新增人
	 */
	@PropertyDef(label = "新增人", description = "新增人:新增人")
	private String createEmp;

	/**
	 * 新增时间:新增时间
	 */
	@PropertyDef(label = "新增时间", description = "新增时间:新增时间")
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

	/**
	 * 实际发布价格:实际发布价格
	 */
	@PropertyDef(label = "实际发布价格", description = "实际发布价格:实际发布价格")
	private BigDecimal realQuote;

	/**
	 * 承运计价方式:承运计价方式
	 */
	@PropertyDef(label = "承运计价方式", description = "承运计价方式:承运计价方式")
	private String apPayType;

	/**
	 * 承运预付款:承运预付款
	 */
	@PropertyDef(label = "承运预付款", description = "承运预付款:承运预付款")
	private BigDecimal apPrePayments;

	/**
	 * 是否带票:是否带票
	 */
	@PropertyDef(label = "是否带票", description = "是否带票:是否带票")
	private String cfDealType;

	/**
	 * 包装要求:包装要求
	 */
	@PropertyDef(label = "包装要求", description = "包装要求:包装要求")
	private String packDemand;

	/**
	 * 货物类型:货物类型
	 */
	@PropertyDef(label = "货物类型", description = "货物类型:货物类型")
	private String cargoStyle;

	/**
	 * 发布时间:发布时间
	 */
	@PropertyDef(label = "发布时间", description = "发布时间:发布时间")
	private String releaseTime;

	/**
	 * 挂价时间:挂价时间
	 */
	@PropertyDef(label = "挂价时间", description = "挂价时间:挂价时间")
	private String handTime;

	/**
	 * 有效期:有效期
	 */
	@PropertyDef(label = "有效期", description = "有效期:有效期")
	private Date periodValidity;

	/**
	 * EC运单状态:EC运单状态
	 */
	@PropertyDef(label = "EC运单状态", description = "EC运单状态:EC运单状态")
	private String ecStatus;

	/**
	 * 承运结算方式:承运结算方式
	 */
	@PropertyDef(label = "承运结算方式", description = "承运结算方式:承运结算方式")
	private String apSettleType;

	/**
	 * 承运单价:承运单价
	 */
	@PropertyDef(label = "承运单价", description = "承运单价:承运单价")
	private BigDecimal apUnitPrice;

	/**
	 * 货主计价方式:货主计价方式
	 */
	@PropertyDef(label = "货主计价方式", description = "货主计价方式:货主计价方式")
	private String arPayType;

	/**
	 * 货主结算方式:货主结算方式
	 */
	@PropertyDef(label = "货主结算方式", description = "货主结算方式:货主结算方式")
	private String arSettleType;

	/**
	 * 货主单价:货主单价
	 */
	@PropertyDef(label = "货主单价", description = "货主单价:货主单价")
	private BigDecimal arUnitPrice;

	/**
	 * 装货码头:装货码头
	 */
	@PropertyDef(label = "装货码头", description = "装货码头:装货码头")
	private String loadingDock;

	/**
	 * SETTLE_TIME_LIMIT_2:
	 */
	@PropertyDef(label = "SETTLE_TIME_LIMIT_2", description = "SETTLE_TIME_LIMIT_2:")
	private BigDecimal settleTimeLimit2;

	/**
	 * 中转码头:中转码头
	 */
	@PropertyDef(label = "中转码头", description = "中转码头:中转码头")
	private String transferDock;

	/**
	 * 卸货码头:卸货码头
	 */
	@PropertyDef(label = "卸货码头", description = "卸货码头:卸货码头")
	private String unloadingDock;

	public Tbsh10() {
		super();
	}

	public Tbsh10(String sh10Id, String compId, String compCode,
			String transNo, String contNo, String transContNo, String custNo,
			String custName, String ownerCompNo, String ownerCompName,
			String carType, String carLength, String prodType,
			String prodTypeName, String productNo, String productName,
			String productDetail, String mutiProd, String steel,
			String orderNum, BigDecimal orderWgt, BigDecimal ladingWgt,
			String billCompNo, String billCompName, String size, String title,
			String memo, BigDecimal tax, BigDecimal distance, String transType,
			String startStationCode, String startStation, String startLineCode,
			String startLine, String despatchAddress, String despatchNo,
			String despatchName, String despatchMobile, String despatchStart,
			String despatchEnd, String endStationCode, String endStation,
			String endLineCode, String endLine, String deliveryAddress,
			String receiptCompNo, String receiptCompName, String receiptPhone,
			String receiptStart, String receiptEnd, String carrierNo,
			String carrierName, String payCompNo, String payCompName,
			BigDecimal quote, BigDecimal cargoMoney, String idDestineOrder,
			BigDecimal unitFreight, String publishTime,
			BigDecimal breachAddMoney, BigDecimal publishedWgt,
			BigDecimal ecWgt, BigDecimal deliveredWgt, BigDecimal backWgt,
			String payType, BigDecimal unitPrice, String settleType,
			BigDecimal settleTimeLimit, BigDecimal prePayments,
			String prePayType, String status, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version,
			BigDecimal realQuote, String apPayType, BigDecimal apPrePayments,
			String cfDealType, String packDemand, String cargoStyle,
			String releaseTime, String handTime, Date periodValidity,
			String ecStatus, String apSettleType, BigDecimal apUnitPrice,
			String arPayType, String arSettleType, BigDecimal arUnitPrice,
			String loadingDock, BigDecimal settleTimeLimit2,
			String transferDock, String unloadingDock) {
		super();
		this.sh10Id = sh10Id;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.contNo = contNo;
		this.transContNo = transContNo;
		this.custNo = custNo;
		this.custName = custName;
		this.ownerCompNo = ownerCompNo;
		this.ownerCompName = ownerCompName;
		this.carType = carType;
		this.carLength = carLength;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.mutiProd = mutiProd;
		this.steel = steel;
		this.orderNum = orderNum;
		this.orderWgt = orderWgt;
		this.ladingWgt = ladingWgt;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.size = size;
		this.title = title;
		this.memo = memo;
		this.tax = tax;
		this.distance = distance;
		this.transType = transType;
		this.startStationCode = startStationCode;
		this.startStation = startStation;
		this.startLineCode = startLineCode;
		this.startLine = startLine;
		this.despatchAddress = despatchAddress;
		this.despatchNo = despatchNo;
		this.despatchName = despatchName;
		this.despatchMobile = despatchMobile;
		this.despatchStart = despatchStart;
		this.despatchEnd = despatchEnd;
		this.endStationCode = endStationCode;
		this.endStation = endStation;
		this.endLineCode = endLineCode;
		this.endLine = endLine;
		this.deliveryAddress = deliveryAddress;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.receiptPhone = receiptPhone;
		this.receiptStart = receiptStart;
		this.receiptEnd = receiptEnd;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.payCompNo = payCompNo;
		this.payCompName = payCompName;
		this.quote = quote;
		this.cargoMoney = cargoMoney;
		this.idDestineOrder = idDestineOrder;
		this.unitFreight = unitFreight;
		this.publishTime = publishTime;
		this.breachAddMoney = breachAddMoney;
		this.publishedWgt = publishedWgt;
		this.ecWgt = ecWgt;
		this.deliveredWgt = deliveredWgt;
		this.backWgt = backWgt;
		this.payType = payType;
		this.unitPrice = unitPrice;
		this.settleType = settleType;
		this.settleTimeLimit = settleTimeLimit;
		this.prePayments = prePayments;
		this.prePayType = prePayType;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.realQuote = realQuote;
		this.apPayType = apPayType;
		this.apPrePayments = apPrePayments;
		this.cfDealType = cfDealType;
		this.packDemand = packDemand;
		this.cargoStyle = cargoStyle;
		this.releaseTime = releaseTime;
		this.handTime = handTime;
		this.periodValidity = periodValidity;
		this.ecStatus = ecStatus;
		this.apSettleType = apSettleType;
		this.apUnitPrice = apUnitPrice;
		this.arPayType = arPayType;
		this.arSettleType = arSettleType;
		this.arUnitPrice = arUnitPrice;
		this.loadingDock = loadingDock;
		this.settleTimeLimit2 = settleTimeLimit2;
		this.transferDock = transferDock;
		this.unloadingDock = unloadingDock;
	}

	public void setSh10Id(String sh10Id) {
		this.sh10Id = sh10Id;
	}

	@Id
	@Column(name = "SH10_ID_", length = 50, nullable = false)
	public String getSh10Id() {
		return sh10Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	@Column(name = "COMP_CODE_", length = 10)
	public String getCompCode() {
		return compCode;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setTransContNo(String transContNo) {
		this.transContNo = transContNo;
	}

	@Column(name = "TRANS_CONT_NO_", length = 20)
	public String getTransContNo() {
		return transContNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 10)
	public String getCustNo() {
		return custNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CUST_NAME_", length = 50)
	public String getCustName() {
		return custName;
	}

	public void setOwnerCompNo(String ownerCompNo) {
		this.ownerCompNo = ownerCompNo;
	}

	@Column(name = "OWNER_COMP_NO_", length = 50)
	public String getOwnerCompNo() {
		return ownerCompNo;
	}

	public void setOwnerCompName(String ownerCompName) {
		this.ownerCompName = ownerCompName;
	}

	@Column(name = "OWNER_COMP_NAME_", length = 200)
	public String getOwnerCompName() {
		return ownerCompName;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Column(name = "CAR_TYPE_", length = 10)
	public String getCarType() {
		return carType;
	}

	public void setCarLength(String carLength) {
		this.carLength = carLength;
	}

	@Column(name = "CAR_LENGTH_", length = 10)
	public String getCarLength() {
		return carLength;
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

	@Column(name = "PROD_TYPE_NAME_", length = 50)
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

	@Column(name = "PRODUCT_NAME_", length = 50)
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

	public void setMutiProd(String mutiProd) {
		this.mutiProd = mutiProd;
	}

	@Column(name = "MUTI_PROD_", length = 10)
	public String getMutiProd() {
		return mutiProd;
	}

	public void setSteel(String steel) {
		this.steel = steel;
	}

	@Column(name = "STEEL_", length = 20)
	public String getSteel() {
		return steel;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name = "ORDER_NUM_", length = 20)
	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderWgt(BigDecimal orderWgt) {
		this.orderWgt = orderWgt;
	}

	@Column(name = "ORDER_WGT_")
	public BigDecimal getOrderWgt() {
		return orderWgt;
	}

	public void setLadingWgt(BigDecimal ladingWgt) {
		this.ladingWgt = ladingWgt;
	}

	@Column(name = "LADING_WGT_")
	public BigDecimal getLadingWgt() {
		return ladingWgt;
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

	@Column(name = "BILL_COMP_NAME_", length = 50)
	public String getBillCompName() {
		return billCompName;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SIZE_", length = 50)
	public String getSize() {
		return size;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "TITLE_", length = 20)
	public String getTitle() {
		return title;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 20)
	public String getMemo() {
		return memo;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	@Column(name = "TAX_")
	public BigDecimal getTax() {
		return tax;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	@Column(name = "DISTANCE_")
	public BigDecimal getDistance() {
		return distance;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	@Column(name = "TRANS_TYPE_", length = 10)
	public String getTransType() {
		return transType;
	}

	public void setStartStationCode(String startStationCode) {
		this.startStationCode = startStationCode;
	}

	@Column(name = "START_STATION_CODE_", length = 20)
	public String getStartStationCode() {
		return startStationCode;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	@Column(name = "START_STATION_", length = 50)
	public String getStartStation() {
		return startStation;
	}

	public void setStartLineCode(String startLineCode) {
		this.startLineCode = startLineCode;
	}

	@Column(name = "START_LINE_CODE_", length = 50)
	public String getStartLineCode() {
		return startLineCode;
	}

	public void setStartLine(String startLine) {
		this.startLine = startLine;
	}

	@Column(name = "START_LINE_", length = 50)
	public String getStartLine() {
		return startLine;
	}

	public void setDespatchAddress(String despatchAddress) {
		this.despatchAddress = despatchAddress;
	}

	@Column(name = "DESPATCH_ADDRESS_", length = 200)
	public String getDespatchAddress() {
		return despatchAddress;
	}

	public void setDespatchNo(String despatchNo) {
		this.despatchNo = despatchNo;
	}

	@Column(name = "DESPATCH_NO_", length = 50)
	public String getDespatchNo() {
		return despatchNo;
	}

	public void setDespatchName(String despatchName) {
		this.despatchName = despatchName;
	}

	@Column(name = "DESPATCH_NAME_", length = 200)
	public String getDespatchName() {
		return despatchName;
	}

	public void setDespatchMobile(String despatchMobile) {
		this.despatchMobile = despatchMobile;
	}

	@Column(name = "DESPATCH_MOBILE_", length = 20)
	public String getDespatchMobile() {
		return despatchMobile;
	}

	public void setDespatchStart(String despatchStart) {
		this.despatchStart = despatchStart;
	}

	@Column(name = "DESPATCH_START_", length = 50)
	public String getDespatchStart() {
		return despatchStart;
	}

	public void setDespatchEnd(String despatchEnd) {
		this.despatchEnd = despatchEnd;
	}

	@Column(name = "DESPATCH_END_", length = 50)
	public String getDespatchEnd() {
		return despatchEnd;
	}

	public void setEndStationCode(String endStationCode) {
		this.endStationCode = endStationCode;
	}

	@Column(name = "END_STATION_CODE_", length = 20)
	public String getEndStationCode() {
		return endStationCode;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Column(name = "END_STATION_", length = 50)
	public String getEndStation() {
		return endStation;
	}

	public void setEndLineCode(String endLineCode) {
		this.endLineCode = endLineCode;
	}

	@Column(name = "END_LINE_CODE_", length = 50)
	public String getEndLineCode() {
		return endLineCode;
	}

	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}

	@Column(name = "END_LINE_", length = 50)
	public String getEndLine() {
		return endLine;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Column(name = "DELIVERY_ADDRESS_", length = 200)
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setReceiptCompNo(String receiptCompNo) {
		this.receiptCompNo = receiptCompNo;
	}

	@Column(name = "RECEIPT_COMP_NO_", length = 50)
	public String getReceiptCompNo() {
		return receiptCompNo;
	}

	public void setReceiptCompName(String receiptCompName) {
		this.receiptCompName = receiptCompName;
	}

	@Column(name = "RECEIPT_COMP_NAME_", length = 200)
	public String getReceiptCompName() {
		return receiptCompName;
	}

	public void setReceiptPhone(String receiptPhone) {
		this.receiptPhone = receiptPhone;
	}

	@Column(name = "RECEIPT_PHONE_", length = 20)
	public String getReceiptPhone() {
		return receiptPhone;
	}

	public void setReceiptStart(String receiptStart) {
		this.receiptStart = receiptStart;
	}

	@Column(name = "RECEIPT_START_", length = 50)
	public String getReceiptStart() {
		return receiptStart;
	}

	public void setReceiptEnd(String receiptEnd) {
		this.receiptEnd = receiptEnd;
	}

	@Column(name = "RECEIPT_END_", length = 50)
	public String getReceiptEnd() {
		return receiptEnd;
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

	@Column(name = "CARRIER_NAME_", length = 50)
	public String getCarrierName() {
		return carrierName;
	}

	public void setPayCompNo(String payCompNo) {
		this.payCompNo = payCompNo;
	}

	@Column(name = "PAY_COMP_NO_", length = 50)
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

	public void setQuote(BigDecimal quote) {
		this.quote = quote;
	}

	@Column(name = "QUOTE_")
	public BigDecimal getQuote() {
		return quote;
	}

	public void setCargoMoney(BigDecimal cargoMoney) {
		this.cargoMoney = cargoMoney;
	}

	@Column(name = "CARGO_MONEY_")
	public BigDecimal getCargoMoney() {
		return cargoMoney;
	}

	public void setIdDestineOrder(String idDestineOrder) {
		this.idDestineOrder = idDestineOrder;
	}

	@Column(name = "ID_DESTINE_ORDER_", length = 10)
	public String getIdDestineOrder() {
		return idDestineOrder;
	}

	public void setUnitFreight(BigDecimal unitFreight) {
		this.unitFreight = unitFreight;
	}

	@Column(name = "UNIT_FREIGHT_")
	public BigDecimal getUnitFreight() {
		return unitFreight;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	@Column(name = "PUBLISH_TIME_", length = 20)
	public String getPublishTime() {
		return publishTime;
	}

	public void setBreachAddMoney(BigDecimal breachAddMoney) {
		this.breachAddMoney = breachAddMoney;
	}

	@Column(name = "BREACH_ADD_MONEY_")
	public BigDecimal getBreachAddMoney() {
		return breachAddMoney;
	}

	public void setPublishedWgt(BigDecimal publishedWgt) {
		this.publishedWgt = publishedWgt;
	}

	@Column(name = "PUBLISHED_WGT_")
	public BigDecimal getPublishedWgt() {
		return publishedWgt;
	}

	public void setEcWgt(BigDecimal ecWgt) {
		this.ecWgt = ecWgt;
	}

	@Column(name = "EC_WGT_")
	public BigDecimal getEcWgt() {
		return ecWgt;
	}

	public void setDeliveredWgt(BigDecimal deliveredWgt) {
		this.deliveredWgt = deliveredWgt;
	}

	@Column(name = "DELIVERED_WGT_")
	public BigDecimal getDeliveredWgt() {
		return deliveredWgt;
	}

	public void setBackWgt(BigDecimal backWgt) {
		this.backWgt = backWgt;
	}

	@Column(name = "BACK_WGT_")
	public BigDecimal getBackWgt() {
		return backWgt;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "PAY_TYPE_", length = 10)
	public String getPayType() {
		return payType;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "UNIT_PRICE_")
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 50)
	public String getSettleType() {
		return settleType;
	}

	public void setSettleTimeLimit(BigDecimal settleTimeLimit) {
		this.settleTimeLimit = settleTimeLimit;
	}

	@Column(name = "SETTLE_TIME_LIMIT_")
	public BigDecimal getSettleTimeLimit() {
		return settleTimeLimit;
	}

	public void setPrePayments(BigDecimal prePayments) {
		this.prePayments = prePayments;
	}

	@Column(name = "PRE_PAYMENTS_")
	public BigDecimal getPrePayments() {
		return prePayments;
	}

	public void setPrePayType(String prePayType) {
		this.prePayType = prePayType;
	}

	@Column(name = "PRE_PAY_TYPE_", length = 10)
	public String getPrePayType() {
		return prePayType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 20)
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

	@Column(name = "UPDATE_EMP_", length = 20)
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

	public void setRealQuote(BigDecimal realQuote) {
		this.realQuote = realQuote;
	}

	@Column(name = "REAL_QUOTE_")
	public BigDecimal getRealQuote() {
		return realQuote;
	}

	public void setApPayType(String apPayType) {
		this.apPayType = apPayType;
	}

	@Column(name = "AP_PAY_TYPE_", length = 10)
	public String getApPayType() {
		return apPayType;
	}

	public void setApPrePayments(BigDecimal apPrePayments) {
		this.apPrePayments = apPrePayments;
	}

	@Column(name = "AP_PRE_PAYMENTS_")
	public BigDecimal getApPrePayments() {
		return apPrePayments;
	}

	public void setCfDealType(String cfDealType) {
		this.cfDealType = cfDealType;
	}

	@Column(name = "CF_DEAL_TYPE_", length = 10)
	public String getCfDealType() {
		return cfDealType;
	}

	public void setPackDemand(String packDemand) {
		this.packDemand = packDemand;
	}

	@Column(name = "PACK_DEMAND_", length = 10)
	public String getPackDemand() {
		return packDemand;
	}

	public void setCargoStyle(String cargoStyle) {
		this.cargoStyle = cargoStyle;
	}

	@Column(name = "CARGO_STYLE_", length = 10)
	public String getCargoStyle() {
		return cargoStyle;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	@Column(name = "RELEASE_TIME_", length = 50)
	public String getReleaseTime() {
		return releaseTime;
	}

	public void setHandTime(String handTime) {
		this.handTime = handTime;
	}

	@Column(name = "HAND_TIME_", length = 50)
	public String getHandTime() {
		return handTime;
	}

	public void setPeriodValidity(Date periodValidity) {
		this.periodValidity = periodValidity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PERIOD_VALIDITY_")
	public Date getPeriodValidity() {
		return periodValidity;
	}

	public void setEcStatus(String ecStatus) {
		this.ecStatus = ecStatus;
	}

	@Column(name = "EC_STATUS_", length = 10)
	public String getEcStatus() {
		return ecStatus;
	}

	public void setApSettleType(String apSettleType) {
		this.apSettleType = apSettleType;
	}

	@Column(name = "AP_SETTLE_TYPE_", length = 50)
	public String getApSettleType() {
		return apSettleType;
	}

	public void setApUnitPrice(BigDecimal apUnitPrice) {
		this.apUnitPrice = apUnitPrice;
	}

	@Column(name = "AP_UNIT_PRICE_")
	public BigDecimal getApUnitPrice() {
		return apUnitPrice;
	}

	public void setArPayType(String arPayType) {
		this.arPayType = arPayType;
	}

	@Column(name = "AR_PAY_TYPE_", length = 10)
	public String getArPayType() {
		return arPayType;
	}

	public void setArSettleType(String arSettleType) {
		this.arSettleType = arSettleType;
	}

	@Column(name = "AR_SETTLE_TYPE_", length = 50)
	public String getArSettleType() {
		return arSettleType;
	}

	public void setArUnitPrice(BigDecimal arUnitPrice) {
		this.arUnitPrice = arUnitPrice;
	}

	@Column(name = "AR_UNIT_PRICE_")
	public BigDecimal getArUnitPrice() {
		return arUnitPrice;
	}

	public void setLoadingDock(String loadingDock) {
		this.loadingDock = loadingDock;
	}

	@Column(name = "LOADING_DOCK_", length = 10)
	public String getLoadingDock() {
		return loadingDock;
	}

	public void setSettleTimeLimit2(BigDecimal settleTimeLimit2) {
		this.settleTimeLimit2 = settleTimeLimit2;
	}

	@Column(name = "SETTLE_TIME_LIMIT_2")
	public BigDecimal getSettleTimeLimit2() {
		return settleTimeLimit2;
	}

	public void setTransferDock(String transferDock) {
		this.transferDock = transferDock;
	}

	@Column(name = "TRANSFER_DOCK_", length = 10)
	public String getTransferDock() {
		return transferDock;
	}

	public void setUnloadingDock(String unloadingDock) {
		this.unloadingDock = unloadingDock;
	}

	@Column(name = "UNLOADING_DOCK_", length = 10)
	public String getUnloadingDock() {
		return unloadingDock;
	}

	public String toString() {
		return "Tbsh10 [sh10Id=" + sh10Id + ",compId=" + compId + ",compCode="
				+ compCode + ",transNo=" + transNo + ",contNo=" + contNo
				+ ",transContNo=" + transContNo + ",custNo=" + custNo
				+ ",custName=" + custName + ",ownerCompNo=" + ownerCompNo
				+ ",ownerCompName=" + ownerCompName + ",carType=" + carType
				+ ",carLength=" + carLength + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",productDetail="
				+ productDetail + ",mutiProd=" + mutiProd + ",steel=" + steel
				+ ",orderNum=" + orderNum + ",orderWgt=" + orderWgt
				+ ",ladingWgt=" + ladingWgt + ",billCompNo=" + billCompNo
				+ ",billCompName=" + billCompName + ",size=" + size + ",title="
				+ title + ",memo=" + memo + ",tax=" + tax + ",distance="
				+ distance + ",transType=" + transType + ",startStationCode="
				+ startStationCode + ",startStation=" + startStation
				+ ",startLineCode=" + startLineCode + ",startLine=" + startLine
				+ ",despatchAddress=" + despatchAddress + ",despatchNo="
				+ despatchNo + ",despatchName=" + despatchName
				+ ",despatchMobile=" + despatchMobile + ",despatchStart="
				+ despatchStart + ",despatchEnd=" + despatchEnd
				+ ",endStationCode=" + endStationCode + ",endStation="
				+ endStation + ",endLineCode=" + endLineCode + ",endLine="
				+ endLine + ",deliveryAddress=" + deliveryAddress
				+ ",receiptCompNo=" + receiptCompNo + ",receiptCompName="
				+ receiptCompName + ",receiptPhone=" + receiptPhone
				+ ",receiptStart=" + receiptStart + ",receiptEnd=" + receiptEnd
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",payCompNo=" + payCompNo + ",payCompName=" + payCompName
				+ ",quote=" + quote + ",cargoMoney=" + cargoMoney
				+ ",idDestineOrder=" + idDestineOrder + ",unitFreight="
				+ unitFreight + ",publishTime=" + publishTime
				+ ",breachAddMoney=" + breachAddMoney + ",publishedWgt="
				+ publishedWgt + ",ecWgt=" + ecWgt + ",deliveredWgt="
				+ deliveredWgt + ",backWgt=" + backWgt + ",payType=" + payType
				+ ",unitPrice=" + unitPrice + ",settleType=" + settleType
				+ ",settleTimeLimit=" + settleTimeLimit + ",prePayments="
				+ prePayments + ",prePayType=" + prePayType + ",status="
				+ status + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + ",realQuote="
				+ realQuote + ",apPayType=" + apPayType + ",apPrePayments="
				+ apPrePayments + ",cfDealType=" + cfDealType + ",packDemand="
				+ packDemand + ",cargoStyle=" + cargoStyle + ",releaseTime="
				+ releaseTime + ",handTime=" + handTime + ",periodValidity="
				+ periodValidity + ",ecStatus=" + ecStatus + ",apSettleType="
				+ apSettleType + ",apUnitPrice=" + apUnitPrice + ",arPayType="
				+ arPayType + ",arSettleType=" + arSettleType + ",arUnitPrice="
				+ arUnitPrice + ",loadingDock=" + loadingDock
				+ ",settleTimeLimit2=" + settleTimeLimit2 + ",transferDock="
				+ transferDock + ",unloadingDock=" + unloadingDock + "]";
	}

}

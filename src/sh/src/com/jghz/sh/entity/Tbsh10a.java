package com.jghz.sh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh10a:运单明细表 TBSH10A
 */
@Entity
@Table(name = "tbsh10a")
public class Tbsh10a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh10aId;

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
	 * 运单项次号:运单项次号
	 */
	@PropertyDef(label = "运单项次号", description = "运单项次号:运单项次号")
	private String transItem;

	/**
	 * 水单号:水单号
	 */
	@PropertyDef(label = "水单号", description = "水单号:水单号")
	private String shipListNo;

	/**
	 * 协议编号:协议编号
	 */
	@PropertyDef(label = "协议编号", description = "协议编号:协议编号")
	private String contNo;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

	/**
	 * 挂车号:挂车号
	 */
	@PropertyDef(label = "挂车号", description = "挂车号:挂车号")
	private String trailerNo;

	/**
	 * 司机手机:司机手机
	 */
	@PropertyDef(label = "司机手机", description = "司机手机:司机手机")
	private String phoneNo;

	/**
	 * 司机姓名:司机姓名
	 */
	@PropertyDef(label = "司机姓名", description = "司机姓名:司机姓名")
	private String userName;

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
	 * 承运人名称:承运人名称
	 */
	@PropertyDef(label = "承运人名称", description = "承运人名称:承运人名称")
	private String driverName;

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
	 * 竞标价格:竞标价格
	 */
	@PropertyDef(label = "竞标价格", description = "竞标价格:竞标价格")
	private BigDecimal bidPrice;

	/**
	 * 竞标时间:竞标时间
	 */
	@PropertyDef(label = "竞标时间", description = "竞标时间:竞标时间")
	private String bidTime;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 载重:载重
	 */
	@PropertyDef(label = "载重", description = "载重:载重")
	private BigDecimal weight;

	/**
	 * 件数:件数
	 */
	@PropertyDef(label = "件数", description = "件数:件数")
	private BigDecimal number;

	/**
	 * 金额:金额
	 */
	@PropertyDef(label = "金额", description = "金额:金额")
	private BigDecimal money;

	/**
	 * 支付方式（1包车价2单价）:支付方式（1包车价2单价）
	 */
	@PropertyDef(label = "支付方式（1包车价2单价）", description = "支付方式（1包车价2单价）:支付方式（1包车价2单价）")
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
	 * 预付说明:预付说明
	 */
	@PropertyDef(label = "预付说明", description = "预付说明:预付说明")
	private String prePayMemo;

	/**
	 * 预付款:预付款
	 */
	@PropertyDef(label = "预付款", description = "预付款:预付款")
	private BigDecimal prePayments;

	/**
	 * 运费状态:运费状态
	 */
	@PropertyDef(label = "运费状态", description = "运费状态:运费状态")
	private String state;

	/**
	 * 发货时间:发货时间
	 */
	@PropertyDef(label = "发货时间", description = "发货时间:发货时间")
	private String startTime;

	/**
	 * 收货时间:收货时间
	 */
	@PropertyDef(label = "收货时间", description = "收货时间:收货时间")
	private String endTime;

	/**
	 * 发货状态:发货状态
	 */
	@PropertyDef(label = "发货状态", description = "发货状态:发货状态")
	private String deliverStatus;

	/**
	 * 配货时间:配货时间
	 */
	@PropertyDef(label = "配货时间", description = "配货时间:配货时间")
	private String phDate;

	/**
	 * 装车时间:装车时间
	 */
	@PropertyDef(label = "装车时间", description = "装车时间:装车时间")
	private String outDate;

	/**
	 * 回单重量:回单重量
	 */
	@PropertyDef(label = "回单重量", description = "回单重量:回单重量")
	private BigDecimal backWgt;

	/**
	 * 回单确认状态:回单确认状态
	 */
	@PropertyDef(label = "回单确认状态", description = "回单确认状态:回单确认状态")
	private String backStatus;

	/**
	 * 回单时间:回单时间
	 */
	@PropertyDef(label = "回单时间", description = "回单时间:回单时间")
	private String backTime;

	/**
	 * 应收标记:应收标记
	 */
	@PropertyDef(label = "应收标记", description = "应收标记:应收标记")
	private String isAr;

	/**
	 * 回执号:回执号
	 */
	@PropertyDef(label = "回执号", description = "回执号:回执号")
	private String receiptNo;

	/**
	 * 应付标记:应付标记
	 */
	@PropertyDef(label = "应付标记", description = "应付标记:应付标记")
	private String isAp;

	/**
	 * 南钢装车单号:南钢装车单号
	 */
	@PropertyDef(label = "南钢装车单号", description = "南钢装车单号:南钢装车单号")
	private String loadingNoNg;

	/**
	 * 南钢订单号:南钢订单号
	 */
	@PropertyDef(label = "南钢订单号", description = "南钢订单号:南钢订单号")
	private String orderNoNg;

	/**
	 * 南钢订单项次:南钢订单项次
	 */
	@PropertyDef(label = "南钢订单项次", description = "南钢订单项次:南钢订单项次")
	private String orderItemNg;

	/**
	 * 南钢发货通知单:南钢发货通知单
	 */
	@PropertyDef(label = "南钢发货通知单", description = "南钢发货通知单:南钢发货通知单")
	private String laddingNoNg;

	/**
	 * 是否在途:是否在途
	 */
	@PropertyDef(label = "是否在途", description = "是否在途:是否在途")
	private String onWay;

	/**
	 * 承运计价方式:承运计价方式
	 */
	@PropertyDef(label = "承运计价方式", description = "承运计价方式:承运计价方式")
	private BigDecimal apPayType;

	/**
	 * 承运单价:承运单价
	 */
	@PropertyDef(label = "承运单价", description = "承运单价:承运单价")
	private BigDecimal apUnitPrice;

	/**
	 * 承运金额:承运金额
	 */
	@PropertyDef(label = "承运金额", description = "承运金额:承运金额")
	private BigDecimal apMount;

	/**
	 * 承运结算方式:承运结算方式
	 */
	@PropertyDef(label = "承运结算方式", description = "承运结算方式:承运结算方式")
	private String apSettleType;

	/**
	 * 承运预付款:承运预付款
	 */
	@PropertyDef(label = "承运预付款", description = "承运预付款:承运预付款")
	private BigDecimal apPrePayments;

	/**
	 * 承运付款方式:承运付款方式
	 */
	@PropertyDef(label = "承运付款方式", description = "承运付款方式:承运付款方式")
	private String apPayment;

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
	 * DELIVER_TIME_:
	 */
	@PropertyDef(label = "DELIVER_TIME_", description = "DELIVER_TIME_:")
	private String deliverTime;

	public Tbsh10a() {
		super();
	}

	public Tbsh10a(String sh10aId, String compId, String compCode,
			String transNo, String transItem, String shipListNo, String contNo,
			String carNo, String trailerNo, String phoneNo, String userName,
			String carrierNo, String carrierName, String driverName,
			String prodType, String prodTypeName, String productNo,
			String productName, String productDetail, BigDecimal bidPrice,
			String bidTime, String status, BigDecimal weight,
			BigDecimal number, BigDecimal money, String payType,
			BigDecimal unitPrice, String settleType,
			BigDecimal settleTimeLimit, String prePayMemo,
			BigDecimal prePayments, String state, String startTime,
			String endTime, String deliverStatus, String phDate,
			String outDate, BigDecimal backWgt, String backStatus,
			String backTime, String isAr, String receiptNo, String isAp,
			String loadingNoNg, String orderNoNg, String orderItemNg,
			String laddingNoNg, String onWay, BigDecimal apPayType,
			BigDecimal apUnitPrice, BigDecimal apMount, String apSettleType,
			BigDecimal apPrePayments, String apPayment, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version,
			String deliverTime) {
		super();
		this.sh10aId = sh10aId;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.transItem = transItem;
		this.shipListNo = shipListNo;
		this.contNo = contNo;
		this.carNo = carNo;
		this.trailerNo = trailerNo;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.driverName = driverName;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.bidPrice = bidPrice;
		this.bidTime = bidTime;
		this.status = status;
		this.weight = weight;
		this.number = number;
		this.money = money;
		this.payType = payType;
		this.unitPrice = unitPrice;
		this.settleType = settleType;
		this.settleTimeLimit = settleTimeLimit;
		this.prePayMemo = prePayMemo;
		this.prePayments = prePayments;
		this.state = state;
		this.startTime = startTime;
		this.endTime = endTime;
		this.deliverStatus = deliverStatus;
		this.phDate = phDate;
		this.outDate = outDate;
		this.backWgt = backWgt;
		this.backStatus = backStatus;
		this.backTime = backTime;
		this.isAr = isAr;
		this.receiptNo = receiptNo;
		this.isAp = isAp;
		this.loadingNoNg = loadingNoNg;
		this.orderNoNg = orderNoNg;
		this.orderItemNg = orderItemNg;
		this.laddingNoNg = laddingNoNg;
		this.onWay = onWay;
		this.apPayType = apPayType;
		this.apUnitPrice = apUnitPrice;
		this.apMount = apMount;
		this.apSettleType = apSettleType;
		this.apPrePayments = apPrePayments;
		this.apPayment = apPayment;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.deliverTime = deliverTime;
	}

	public void setSh10aId(String sh10aId) {
		this.sh10aId = sh10aId;
	}

	@Id
	@Column(name = "SH10A_ID_", length = 50, nullable = false)
	public String getSh10aId() {
		return sh10aId;
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

	public void setTransItem(String transItem) {
		this.transItem = transItem;
	}

	@Column(name = "TRANS_ITEM_", length = 20)
	public String getTransItem() {
		return transItem;
	}

	public void setShipListNo(String shipListNo) {
		this.shipListNo = shipListNo;
	}

	@Column(name = "SHIP_LIST_NO_", length = 20)
	public String getShipListNo() {
		return shipListNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
	}

	public void setTrailerNo(String trailerNo) {
		this.trailerNo = trailerNo;
	}

	@Column(name = "TRAILER_NO_", length = 20)
	public String getTrailerNo() {
		return trailerNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_", length = 20)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_NAME_", length = 20)
	public String getUserName() {
		return userName;
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

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Column(name = "DRIVER_NAME_", length = 50)
	public String getDriverName() {
		return driverName;
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

	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}

	@Column(name = "BID_PRICE_")
	public BigDecimal getBidPrice() {
		return bidPrice;
	}

	public void setBidTime(String bidTime) {
		this.bidTime = bidTime;
	}

	@Column(name = "BID_TIME_", length = 20)
	public String getBidTime() {
		return bidTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "WEIGHT_")
	public BigDecimal getWeight() {
		return weight;
	}

	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	@Column(name = "NUMBER_")
	public BigDecimal getNumber() {
		return number;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Column(name = "MONEY_")
	public BigDecimal getMoney() {
		return money;
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

	public void setPrePayMemo(String prePayMemo) {
		this.prePayMemo = prePayMemo;
	}

	@Column(name = "PRE_PAY_MEMO_", length = 200)
	public String getPrePayMemo() {
		return prePayMemo;
	}

	public void setPrePayments(BigDecimal prePayments) {
		this.prePayments = prePayments;
	}

	@Column(name = "PRE_PAYMENTS_")
	public BigDecimal getPrePayments() {
		return prePayments;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "STATE_", length = 10)
	public String getState() {
		return state;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Column(name = "START_TIME_", length = 50)
	public String getStartTime() {
		return startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Column(name = "END_TIME_", length = 50)
	public String getEndTime() {
		return endTime;
	}

	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}

	@Column(name = "DELIVER_STATUS_", length = 10)
	public String getDeliverStatus() {
		return deliverStatus;
	}

	public void setPhDate(String phDate) {
		this.phDate = phDate;
	}

	@Column(name = "PH_DATE_", length = 50)
	public String getPhDate() {
		return phDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	@Column(name = "OUT_DATE_", length = 50)
	public String getOutDate() {
		return outDate;
	}

	public void setBackWgt(BigDecimal backWgt) {
		this.backWgt = backWgt;
	}

	@Column(name = "BACK_WGT_")
	public BigDecimal getBackWgt() {
		return backWgt;
	}

	public void setBackStatus(String backStatus) {
		this.backStatus = backStatus;
	}

	@Column(name = "BACK_STATUS_", length = 10)
	public String getBackStatus() {
		return backStatus;
	}

	public void setBackTime(String backTime) {
		this.backTime = backTime;
	}

	@Column(name = "BACK_TIME_", length = 50)
	public String getBackTime() {
		return backTime;
	}

	public void setIsAr(String isAr) {
		this.isAr = isAr;
	}

	@Column(name = "IS_AR_", length = 10)
	public String getIsAr() {
		return isAr;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	@Column(name = "RECEIPT_NO_", length = 20)
	public String getReceiptNo() {
		return receiptNo;
	}

	public void setIsAp(String isAp) {
		this.isAp = isAp;
	}

	@Column(name = "IS_AP_", length = 10)
	public String getIsAp() {
		return isAp;
	}

	public void setLoadingNoNg(String loadingNoNg) {
		this.loadingNoNg = loadingNoNg;
	}

	@Column(name = "LOADING_NO_NG_", length = 20)
	public String getLoadingNoNg() {
		return loadingNoNg;
	}

	public void setOrderNoNg(String orderNoNg) {
		this.orderNoNg = orderNoNg;
	}

	@Column(name = "ORDER_NO_NG_", length = 20)
	public String getOrderNoNg() {
		return orderNoNg;
	}

	public void setOrderItemNg(String orderItemNg) {
		this.orderItemNg = orderItemNg;
	}

	@Column(name = "ORDER_ITEM_NG_", length = 20)
	public String getOrderItemNg() {
		return orderItemNg;
	}

	public void setLaddingNoNg(String laddingNoNg) {
		this.laddingNoNg = laddingNoNg;
	}

	@Column(name = "LADDING_NO_NG_", length = 20)
	public String getLaddingNoNg() {
		return laddingNoNg;
	}

	public void setOnWay(String onWay) {
		this.onWay = onWay;
	}

	@Column(name = "ON_WAY_", length = 10)
	public String getOnWay() {
		return onWay;
	}

	public void setApPayType(BigDecimal apPayType) {
		this.apPayType = apPayType;
	}

	@Column(name = "AP_PAY_TYPE_")
	public BigDecimal getApPayType() {
		return apPayType;
	}

	public void setApUnitPrice(BigDecimal apUnitPrice) {
		this.apUnitPrice = apUnitPrice;
	}

	@Column(name = "AP_UNIT_PRICE_")
	public BigDecimal getApUnitPrice() {
		return apUnitPrice;
	}

	public void setApMount(BigDecimal apMount) {
		this.apMount = apMount;
	}

	@Column(name = "AP_MOUNT_")
	public BigDecimal getApMount() {
		return apMount;
	}

	public void setApSettleType(String apSettleType) {
		this.apSettleType = apSettleType;
	}

	@Column(name = "AP_SETTLE_TYPE_", length = 10)
	public String getApSettleType() {
		return apSettleType;
	}

	public void setApPrePayments(BigDecimal apPrePayments) {
		this.apPrePayments = apPrePayments;
	}

	@Column(name = "AP_PRE_PAYMENTS_")
	public BigDecimal getApPrePayments() {
		return apPrePayments;
	}

	public void setApPayment(String apPayment) {
		this.apPayment = apPayment;
	}

	@Column(name = "AP_PAYMENT_", length = 10)
	public String getApPayment() {
		return apPayment;
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

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	@Column(name = "DELIVER_TIME_", length = 50)
	public String getDeliverTime() {
		return deliverTime;
	}

	public String toString() {
		return "Tbsh10a [sh10aId=" + sh10aId + ",compId=" + compId
				+ ",compCode=" + compCode + ",transNo=" + transNo
				+ ",transItem=" + transItem + ",shipListNo=" + shipListNo
				+ ",contNo=" + contNo + ",carNo=" + carNo + ",trailerNo="
				+ trailerNo + ",phoneNo=" + phoneNo + ",userName=" + userName
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",driverName=" + driverName + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",productDetail="
				+ productDetail + ",bidPrice=" + bidPrice + ",bidTime="
				+ bidTime + ",status=" + status + ",weight=" + weight
				+ ",number=" + number + ",money=" + money + ",payType="
				+ payType + ",unitPrice=" + unitPrice + ",settleType="
				+ settleType + ",settleTimeLimit=" + settleTimeLimit
				+ ",prePayMemo=" + prePayMemo + ",prePayments=" + prePayments
				+ ",state=" + state + ",startTime=" + startTime + ",endTime="
				+ endTime + ",deliverStatus=" + deliverStatus + ",phDate="
				+ phDate + ",outDate=" + outDate + ",backWgt=" + backWgt
				+ ",backStatus=" + backStatus + ",backTime=" + backTime
				+ ",isAr=" + isAr + ",receiptNo=" + receiptNo + ",isAp=" + isAp
				+ ",loadingNoNg=" + loadingNoNg + ",orderNoNg=" + orderNoNg
				+ ",orderItemNg=" + orderItemNg + ",laddingNoNg=" + laddingNoNg
				+ ",onWay=" + onWay + ",apPayType=" + apPayType
				+ ",apUnitPrice=" + apUnitPrice + ",apMount=" + apMount
				+ ",apSettleType=" + apSettleType + ",apPrePayments="
				+ apPrePayments + ",apPayment=" + apPayment + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + ",deliverTime=" + deliverTime + "]";
	}

}

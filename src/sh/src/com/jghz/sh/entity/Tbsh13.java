package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh13:运单发布表TBSH13
 */
@Entity
@Table(name = "tbsh13")
public class Tbsh13 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh13Id;

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
	 * 产品大类名称:产品大类名称
	 */
	@PropertyDef(label = "产品大类名称", description = "产品大类名称:产品大类名称")
	private String prodTypeName;

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
	 * 发布重量:发布重量
	 */
	@PropertyDef(label = "发布重量", description = "发布重量:发布重量")
	private BigDecimal publishWgt;

	/**
	 * 发布价格:发布价格
	 */
	@PropertyDef(label = "发布价格", description = "发布价格:发布价格")
	private BigDecimal quote;

	/**
	 * 规格:规格
	 */
	@PropertyDef(label = "规格", description = "规格:规格")
	private String size;

	/**
	 * 标题:标题
	 */
	@PropertyDef(label = "标题 ", description = "标题:标题")
	private String title;

	/**
	 * 特别提示:特别提示
	 */
	@PropertyDef(label = "特别提示", description = "特别提示:特别提示")
	private String memo;

	/**
	 * 运距:运距
	 */
	@PropertyDef(label = "运距", description = "运距:运距")
	private BigDecimal distance;

	/**
	 * 货值:货值
	 */
	@PropertyDef(label = "货值", description = "货值:货值")
	private BigDecimal cargoMoney;

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
	 * 具体发货地址:具体发货地址
	 */
	@PropertyDef(label = "具体发货地址", description = "具体发货地址:具体发货地址")
	private String despatchAddress;

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
	 * 装货时间:装货时间
	 */
	@PropertyDef(label = "装货时间", description = "装货时间:装货时间")
	private String outDate;

	/**
	 * 具体收货地址:具体收货地址
	 */
	@PropertyDef(label = "具体收货地址", description = "具体收货地址:具体收货地址")
	private String deliveryAddress;

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
	 * 收货时间:收货时间
	 */
	@PropertyDef(label = "收货时间", description = "收货时间:收货时间")
	private String receiptTime;

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
	 * 起点:起点
	 */
	@PropertyDef(label = "起点", description = "起点:起点")
	private String startStation;

	/**
	 * 起点编码:起点编码
	 */
	@PropertyDef(label = "起点编码", description = "起点编码:起点编码")
	private String startStationCode;

	/**
	 * 起点专用线:起点专用线
	 */
	@PropertyDef(label = "起点专用线", description = "起点专用线:起点专用线")
	private String startLine;

	/**
	 * 终点:终点
	 */
	@PropertyDef(label = "终点", description = "终点:终点")
	private String endStation;

	/**
	 * 终点编码:终点编码
	 */
	@PropertyDef(label = "终点编码", description = "终点编码:终点编码")
	private String endStationCode;

	/**
	 * 终点专用线:终点专用线
	 */
	@PropertyDef(label = "终点专用线", description = "终点专用线:终点专用线")
	private String endLine;

	/**
	 * 配货时间:配货时间
	 */
	@PropertyDef(label = "配货时间", description = "配货时间:配货时间")
	private String phDate;

	/**
	 * 有效期:有效期
	 */
	@PropertyDef(label = "有效期", description = "有效期:有效期")
	private Date periodValidity;

	/**
	 * DESPATCH_TIME_:
	 */
	@PropertyDef(label = "DESPATCH_TIME_", description = "DESPATCH_TIME_:")
	private String despatchTime;

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
	 * 计价方式:计价方式
	 */
	@PropertyDef(label = "计价方式", description = "计价方式:计价方式")
	private String apPayType;

	public Tbsh13() {
		super();
	}

	public Tbsh13(String sh13Id, String compId, String compCode,
			String transNo, String carType, String carLength,
			String prodTypeName, String productName, String productDetail,
			BigDecimal publishWgt, BigDecimal quote, String size, String title,
			String memo, BigDecimal distance, BigDecimal cargoMoney,
			String cfDealType, String packDemand, String cargoStyle,
			String despatchAddress, String despatchName, String despatchMobile,
			String outDate, String deliveryAddress, String receiptCompName,
			String receiptPhone, String receiptTime, String releaseTime,
			String handTime, String status, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version,
			String startStation, String startStationCode, String startLine,
			String endStation, String endStationCode, String endLine,
			String phDate, Date periodValidity, String despatchTime,
			String ownerCompNo, String ownerCompName, String apPayType) {
		super();
		this.sh13Id = sh13Id;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.carType = carType;
		this.carLength = carLength;
		this.prodTypeName = prodTypeName;
		this.productName = productName;
		this.productDetail = productDetail;
		this.publishWgt = publishWgt;
		this.quote = quote;
		this.size = size;
		this.title = title;
		this.memo = memo;
		this.distance = distance;
		this.cargoMoney = cargoMoney;
		this.cfDealType = cfDealType;
		this.packDemand = packDemand;
		this.cargoStyle = cargoStyle;
		this.despatchAddress = despatchAddress;
		this.despatchName = despatchName;
		this.despatchMobile = despatchMobile;
		this.outDate = outDate;
		this.deliveryAddress = deliveryAddress;
		this.receiptCompName = receiptCompName;
		this.receiptPhone = receiptPhone;
		this.receiptTime = receiptTime;
		this.releaseTime = releaseTime;
		this.handTime = handTime;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.startStation = startStation;
		this.startStationCode = startStationCode;
		this.startLine = startLine;
		this.endStation = endStation;
		this.endStationCode = endStationCode;
		this.endLine = endLine;
		this.phDate = phDate;
		this.periodValidity = periodValidity;
		this.despatchTime = despatchTime;
		this.ownerCompNo = ownerCompNo;
		this.ownerCompName = ownerCompName;
		this.apPayType = apPayType;
	}

	public void setSh13Id(String sh13Id) {
		this.sh13Id = sh13Id;
	}

	@Id
	@Column(name = "SH13_ID_", length = 50, nullable = false)
	public String getSh13Id() {
		return sh13Id;
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

	public void setProdTypeName(String prodTypeName) {
		this.prodTypeName = prodTypeName;
	}

	@Column(name = "PROD_TYPE_NAME_", length = 50)
	public String getProdTypeName() {
		return prodTypeName;
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

	public void setPublishWgt(BigDecimal publishWgt) {
		this.publishWgt = publishWgt;
	}

	@Column(name = "PUBLISH_WGT_")
	public BigDecimal getPublishWgt() {
		return publishWgt;
	}

	public void setQuote(BigDecimal quote) {
		this.quote = quote;
	}

	@Column(name = "QUOTE_")
	public BigDecimal getQuote() {
		return quote;
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

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	@Column(name = "DISTANCE_")
	public BigDecimal getDistance() {
		return distance;
	}

	public void setCargoMoney(BigDecimal cargoMoney) {
		this.cargoMoney = cargoMoney;
	}

	@Column(name = "CARGO_MONEY_")
	public BigDecimal getCargoMoney() {
		return cargoMoney;
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

	public void setDespatchAddress(String despatchAddress) {
		this.despatchAddress = despatchAddress;
	}

	@Column(name = "DESPATCH_ADDRESS_", length = 200)
	public String getDespatchAddress() {
		return despatchAddress;
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

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	@Column(name = "OUT_DATE_", length = 50)
	public String getOutDate() {
		return outDate;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Column(name = "DELIVERY_ADDRESS_", length = 200)
	public String getDeliveryAddress() {
		return deliveryAddress;
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

	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
	}

	@Column(name = "RECEIPT_TIME_", length = 50)
	public String getReceiptTime() {
		return receiptTime;
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

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	@Column(name = "START_STATION_", length = 50)
	public String getStartStation() {
		return startStation;
	}

	public void setStartStationCode(String startStationCode) {
		this.startStationCode = startStationCode;
	}

	@Column(name = "START_STATION_CODE_", length = 10)
	public String getStartStationCode() {
		return startStationCode;
	}

	public void setStartLine(String startLine) {
		this.startLine = startLine;
	}

	@Column(name = "START_LINE_", length = 50)
	public String getStartLine() {
		return startLine;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Column(name = "END_STATION_", length = 50)
	public String getEndStation() {
		return endStation;
	}

	public void setEndStationCode(String endStationCode) {
		this.endStationCode = endStationCode;
	}

	@Column(name = "END_STATION_CODE_", length = 10)
	public String getEndStationCode() {
		return endStationCode;
	}

	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}

	@Column(name = "END_LINE_", length = 50)
	public String getEndLine() {
		return endLine;
	}

	public void setPhDate(String phDate) {
		this.phDate = phDate;
	}

	@Column(name = "PH_DATE_", length = 50)
	public String getPhDate() {
		return phDate;
	}

	public void setPeriodValidity(Date periodValidity) {
		this.periodValidity = periodValidity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PERIOD_VALIDITY_")
	public Date getPeriodValidity() {
		return periodValidity;
	}

	public void setDespatchTime(String despatchTime) {
		this.despatchTime = despatchTime;
	}

	@Column(name = "DESPATCH_TIME_", length = 50)
	public String getDespatchTime() {
		return despatchTime;
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

	@Column(name = "OWNER_COMP_NAME_", length = 50)
	public String getOwnerCompName() {
		return ownerCompName;
	}

	public void setApPayType(String apPayType) {
		this.apPayType = apPayType;
	}

	@Column(name = "AP_PAY_TYPE_", length = 10)
	public String getApPayType() {
		return apPayType;
	}

	public String toString() {
		return "Tbsh13 [sh13Id=" + sh13Id + ",compId=" + compId + ",compCode="
				+ compCode + ",transNo=" + transNo + ",carType=" + carType
				+ ",carLength=" + carLength + ",prodTypeName=" + prodTypeName
				+ ",productName=" + productName + ",productDetail="
				+ productDetail + ",publishWgt=" + publishWgt + ",quote="
				+ quote + ",size=" + size + ",title=" + title + ",memo=" + memo
				+ ",distance=" + distance + ",cargoMoney=" + cargoMoney
				+ ",cfDealType=" + cfDealType + ",packDemand=" + packDemand
				+ ",cargoStyle=" + cargoStyle + ",despatchAddress="
				+ despatchAddress + ",despatchName=" + despatchName
				+ ",despatchMobile=" + despatchMobile + ",outDate=" + outDate
				+ ",deliveryAddress=" + deliveryAddress + ",receiptCompName="
				+ receiptCompName + ",receiptPhone=" + receiptPhone
				+ ",receiptTime=" + receiptTime + ",releaseTime=" + releaseTime
				+ ",handTime=" + handTime + ",status=" + status + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + ",startStation=" + startStation
				+ ",startStationCode=" + startStationCode + ",startLine="
				+ startLine + ",endStation=" + endStation + ",endStationCode="
				+ endStationCode + ",endLine=" + endLine + ",phDate=" + phDate
				+ ",periodValidity=" + periodValidity + ",despatchTime="
				+ despatchTime + ",ownerCompNo=" + ownerCompNo
				+ ",ownerCompName=" + ownerCompName + ",apPayType=" + apPayType
				+ "]";
	}

}

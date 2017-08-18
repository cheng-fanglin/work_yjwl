package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh32a:
 */
@Entity
@Table(name = "tbsh32a")
public class Tbsh32a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh32aId;

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
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh32Id;

	/**
	 * 结算单ID:结算单ID
	 */
	@PropertyDef(label = "结算单ID", description = "结算单ID:结算单ID")
	private String settleNo;

	/**
	 * 货主协议号:货主协议号
	 */
	@PropertyDef(label = "货主协议号", description = "货主协议号:货主协议号")
	private String contNo;

	/**
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

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
	 * 具体发货地址:具体发货地址
	 */
	@PropertyDef(label = "具体发货地址", description = "具体发货地址:具体发货地址")
	private String despatchAddress;

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
	 * 具体收货地址:具体收货地址
	 */
	@PropertyDef(label = "具体收货地址", description = "具体收货地址:具体收货地址")
	private String deliveryAddress;

	/**
	 * 发货时间:发货时间
	 */
	@PropertyDef(label = "发货时间", description = "发货时间:发货时间")
	private String deliverTime;

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
	 * 已回单量:已回单量
	 */
	@PropertyDef(label = "已回单量", description = "已回单量:已回单量")
	private BigDecimal backWgt;

	/**
	 * 货主计价方式:货主计价方式
	 */
	@PropertyDef(label = "货主计价方式", description = "货主计价方式:货主计价方式")
	private String arPayType;

	/**
	 * 货主单价:货主单价
	 */
	@PropertyDef(label = "货主单价", description = "货主单价:货主单价")
	private BigDecimal arUnitPrice;

	/**
	 * 货主金额:货主金额
	 */
	@PropertyDef(label = "货主金额", description = "货主金额:货主金额")
	private BigDecimal arMount;

	/**
	 * 货主结算方式:货主结算方式
	 */
	@PropertyDef(label = "货主结算方式", description = "货主结算方式:货主结算方式")
	private String arSettleType;

	/**
	 * 实际金额:实际金额
	 */
	@PropertyDef(label = "实际金额", description = "实际金额:实际金额")
	private BigDecimal arActMount;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String transType;

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

	public Tbsh32a() {
		super();
	}

	public Tbsh32a(String sh32aId, String compId, String compCode,
			String sh32Id, String settleNo, String contNo, String transNo,
			String custNo, String custName, String startStationCode,
			String startStation, String despatchAddress, String endStationCode,
			String endStation, String deliveryAddress, String deliverTime,
			BigDecimal orderWgt, BigDecimal ladingWgt, BigDecimal backWgt,
			String arPayType, BigDecimal arUnitPrice, BigDecimal arMount,
			String arSettleType, BigDecimal arActMount, String transType,
			String status, String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.sh32aId = sh32aId;
		this.compId = compId;
		this.compCode = compCode;
		this.sh32Id = sh32Id;
		this.settleNo = settleNo;
		this.contNo = contNo;
		this.transNo = transNo;
		this.custNo = custNo;
		this.custName = custName;
		this.startStationCode = startStationCode;
		this.startStation = startStation;
		this.despatchAddress = despatchAddress;
		this.endStationCode = endStationCode;
		this.endStation = endStation;
		this.deliveryAddress = deliveryAddress;
		this.deliverTime = deliverTime;
		this.orderWgt = orderWgt;
		this.ladingWgt = ladingWgt;
		this.backWgt = backWgt;
		this.arPayType = arPayType;
		this.arUnitPrice = arUnitPrice;
		this.arMount = arMount;
		this.arSettleType = arSettleType;
		this.arActMount = arActMount;
		this.transType = transType;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh32aId(String sh32aId) {
		this.sh32aId = sh32aId;
	}

	@Id
	@Column(name = "SH32A_ID_", length = 50, nullable = false)
	public String getSh32aId() {
		return sh32aId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 20)
	public String getCompId() {
		return compId;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	@Column(name = "COMP_CODE_", length = 20)
	public String getCompCode() {
		return compCode;
	}

	public void setSh32Id(String sh32Id) {
		this.sh32Id = sh32Id;
	}

	@Column(name = "SH32_ID_", length = 50, nullable = false)
	public String getSh32Id() {
		return sh32Id;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
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

	public void setDespatchAddress(String despatchAddress) {
		this.despatchAddress = despatchAddress;
	}

	@Column(name = "DESPATCH_ADDRESS_", length = 200)
	public String getDespatchAddress() {
		return despatchAddress;
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

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Column(name = "DELIVERY_ADDRESS_", length = 200)
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	@Column(name = "DELIVER_TIME_", length = 50)
	public String getDeliverTime() {
		return deliverTime;
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

	public void setBackWgt(BigDecimal backWgt) {
		this.backWgt = backWgt;
	}

	@Column(name = "BACK_WGT_")
	public BigDecimal getBackWgt() {
		return backWgt;
	}

	public void setArPayType(String arPayType) {
		this.arPayType = arPayType;
	}

	@Column(name = "AR_PAY_TYPE_", length = 10)
	public String getArPayType() {
		return arPayType;
	}

	public void setArUnitPrice(BigDecimal arUnitPrice) {
		this.arUnitPrice = arUnitPrice;
	}

	@Column(name = "AR_UNIT_PRICE_")
	public BigDecimal getArUnitPrice() {
		return arUnitPrice;
	}

	public void setArMount(BigDecimal arMount) {
		this.arMount = arMount;
	}

	@Column(name = "AR_MOUNT_")
	public BigDecimal getArMount() {
		return arMount;
	}

	public void setArSettleType(String arSettleType) {
		this.arSettleType = arSettleType;
	}

	@Column(name = "AR_SETTLE_TYPE_", length = 50)
	public String getArSettleType() {
		return arSettleType;
	}

	public void setArActMount(BigDecimal arActMount) {
		this.arActMount = arActMount;
	}

	@Column(name = "AR_ACT_MOUNT_")
	public BigDecimal getArActMount() {
		return arActMount;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	@Column(name = "TRANS_TYPE_", length = 10)
	public String getTransType() {
		return transType;
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

	public String toString() {
		return "Tbsh32a [sh32aId=" + sh32aId + ",compId=" + compId
				+ ",compCode=" + compCode + ",sh32Id=" + sh32Id + ",settleNo="
				+ settleNo + ",contNo=" + contNo + ",transNo=" + transNo
				+ ",custNo=" + custNo + ",custName=" + custName
				+ ",startStationCode=" + startStationCode + ",startStation="
				+ startStation + ",despatchAddress=" + despatchAddress
				+ ",endStationCode=" + endStationCode + ",endStation="
				+ endStation + ",deliveryAddress=" + deliveryAddress
				+ ",deliverTime=" + deliverTime + ",orderWgt=" + orderWgt
				+ ",ladingWgt=" + ladingWgt + ",backWgt=" + backWgt
				+ ",arPayType=" + arPayType + ",arUnitPrice=" + arUnitPrice
				+ ",arMount=" + arMount + ",arSettleType=" + arSettleType
				+ ",arActMount=" + arActMount + ",transType=" + transType
				+ ",status=" + status + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

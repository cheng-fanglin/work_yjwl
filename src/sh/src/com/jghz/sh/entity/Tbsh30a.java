package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh30a:
 */
@Entity
@Table(name = "tbsh30a")
public class Tbsh30a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh30aId;

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
	private String sh30Id;

	/**
	 * 结算单ID:结算单ID
	 */
	@PropertyDef(label = "结算单ID", description = "结算单ID:结算单ID")
	private String settleNo;

	/**
	 * 结算单项次:结算单项次
	 */
	@PropertyDef(label = "结算单项次", description = "结算单项次:结算单项次")
	private String settleItem;

	/**
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

	/**
	 * 运单项次:运单项次
	 */
	@PropertyDef(label = "运单项次", description = "运单项次:运单项次")
	private String transItem;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

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
	 * 回执号:回执号
	 */
	@PropertyDef(label = "回执号", description = "回执号:回执号")
	private String receiptNo;

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
	 * 发货时间:发货时间
	 */
	@PropertyDef(label = "发货时间", description = "发货时间:发货时间")
	private String deliverTime;

	/**
	 * 回单时间:回单时间
	 */
	@PropertyDef(label = "回单时间", description = "回单时间:回单时间")
	private String backTime;

	/**
	 * 回单重量:回单重量
	 */
	@PropertyDef(label = "回单重量", description = "回单重量:回单重量")
	private BigDecimal weight;

	/**
	 * 回单件数:回单件数
	 */
	@PropertyDef(label = "回单件数", description = "回单件数:回单件数")
	private BigDecimal number;

	/**
	 * 单价:单价
	 */
	@PropertyDef(label = "单价", description = "单价:单价")
	private BigDecimal unitPrice;

	/**
	 * 总金额:总金额
	 */
	@PropertyDef(label = "总金额", description = "总金额:总金额")
	private BigDecimal money;

	/**
	 * 待付款:待付款
	 */
	@PropertyDef(label = "待付款", description = "待付款:待付款")
	private BigDecimal obigation;

	/**
	 * 特殊金额:特殊金额
	 */
	@PropertyDef(label = "特殊金额", description = "特殊金额:特殊金额")
	private BigDecimal specialMoney;

	/**
	 * 说明:说明
	 */
	@PropertyDef(label = "说明", description = "说明:说明")
	private String memo;

	/**
	 * 预付款:预付款
	 */
	@PropertyDef(label = "预付款", description = "预付款:预付款")
	private BigDecimal prePayments;

	/**
	 * 预付款说明:预付款说明
	 */
	@PropertyDef(label = "预付款说明", description = "预付款说明:预付款说明")
	private String prePayMemo;

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
	 * 结算对象:结算对象
	 */
	@PropertyDef(label = "结算对象", description = "结算对象:结算对象")
	private String settleRole;

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
	 * HC_:
	 */
	@PropertyDef(label = "HC_", description = "HC_:")
	private String hc;

	/**
	 * IS_AP_:
	 */
	@PropertyDef(label = "IS_AP_", description = "IS_AP_:")
	private String isAp;

	/**
	 * IS_AR_:
	 */
	@PropertyDef(label = "IS_AR_", description = "IS_AR_:")
	private String isAr;

	/**
	 * LGR_:
	 */
	@PropertyDef(label = "LGR_", description = "LGR_:")
	private String lgr;

	/**
	 * NUM_:
	 */
	@PropertyDef(label = "NUM_", description = "NUM_:")
	private BigDecimal num;

	/**
	 * QSR_:
	 */
	@PropertyDef(label = "QSR_", description = "QSR_:")
	private String qsr;

	/**
	 * SETTLE_PROJECT_:
	 */
	@PropertyDef(label = "SETTLE_PROJECT_", description = "SETTLE_PROJECT_:")
	private String settleProject;

	/**
	 * SHIP_NO_:
	 */
	@PropertyDef(label = "SHIP_NO_", description = "SHIP_NO_:")
	private String shipNo;

	/**
	 * TRAIN_NO_:
	 */
	@PropertyDef(label = "TRAIN_NO_", description = "TRAIN_NO_:")
	private String trainNo;

	/**
	 * ZDR_:
	 */
	@PropertyDef(label = "ZDR_", description = "ZDR_:")
	private String zdr;

	public Tbsh30a() {
		super();
	}

	public Tbsh30a(String sh30aId, String compId, String compCode,
			String sh30Id, String settleNo, String settleItem, String transNo,
			String transItem, String carNo, String phoneNo, String userName,
			String receiptNo, String carrierNo, String carrierName,
			String deliverTime, String backTime, BigDecimal weight,
			BigDecimal number, BigDecimal unitPrice, BigDecimal money,
			BigDecimal obigation, BigDecimal specialMoney, String memo,
			BigDecimal prePayments, String prePayMemo, String transType,
			String status, String settleRole, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version,
			String hc, String isAp, String isAr, String lgr, BigDecimal num,
			String qsr, String settleProject, String shipNo, String trainNo,
			String zdr) {
		super();
		this.sh30aId = sh30aId;
		this.compId = compId;
		this.compCode = compCode;
		this.sh30Id = sh30Id;
		this.settleNo = settleNo;
		this.settleItem = settleItem;
		this.transNo = transNo;
		this.transItem = transItem;
		this.carNo = carNo;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.receiptNo = receiptNo;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.deliverTime = deliverTime;
		this.backTime = backTime;
		this.weight = weight;
		this.number = number;
		this.unitPrice = unitPrice;
		this.money = money;
		this.obigation = obigation;
		this.specialMoney = specialMoney;
		this.memo = memo;
		this.prePayments = prePayments;
		this.prePayMemo = prePayMemo;
		this.transType = transType;
		this.status = status;
		this.settleRole = settleRole;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.hc = hc;
		this.isAp = isAp;
		this.isAr = isAr;
		this.lgr = lgr;
		this.num = num;
		this.qsr = qsr;
		this.settleProject = settleProject;
		this.shipNo = shipNo;
		this.trainNo = trainNo;
		this.zdr = zdr;
	}

	public void setSh30aId(String sh30aId) {
		this.sh30aId = sh30aId;
	}

	@Id
	@Column(name = "SH30A_ID_", length = 50, nullable = false)
	public String getSh30aId() {
		return sh30aId;
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

	public void setSh30Id(String sh30Id) {
		this.sh30Id = sh30Id;
	}

	@Column(name = "SH30_ID_", length = 50, nullable = false)
	public String getSh30Id() {
		return sh30Id;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
	}

	public void setSettleItem(String settleItem) {
		this.settleItem = settleItem;
	}

	@Column(name = "SETTLE_ITEM_", length = 20)
	public String getSettleItem() {
		return settleItem;
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

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 10)
	public String getCarNo() {
		return carNo;
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

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	@Column(name = "RECEIPT_NO_", length = 50)
	public String getReceiptNo() {
		return receiptNo;
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

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	@Column(name = "DELIVER_TIME_", length = 50)
	public String getDeliverTime() {
		return deliverTime;
	}

	public void setBackTime(String backTime) {
		this.backTime = backTime;
	}

	@Column(name = "BACK_TIME_", length = 50)
	public String getBackTime() {
		return backTime;
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

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "UNIT_PRICE_")
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Column(name = "MONEY_")
	public BigDecimal getMoney() {
		return money;
	}

	public void setObigation(BigDecimal obigation) {
		this.obigation = obigation;
	}

	@Column(name = "OBIGATION_")
	public BigDecimal getObigation() {
		return obigation;
	}

	public void setSpecialMoney(BigDecimal specialMoney) {
		this.specialMoney = specialMoney;
	}

	@Column(name = "SPECIAL_MONEY_")
	public BigDecimal getSpecialMoney() {
		return specialMoney;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 200)
	public String getMemo() {
		return memo;
	}

	public void setPrePayments(BigDecimal prePayments) {
		this.prePayments = prePayments;
	}

	@Column(name = "PRE_PAYMENTS_")
	public BigDecimal getPrePayments() {
		return prePayments;
	}

	public void setPrePayMemo(String prePayMemo) {
		this.prePayMemo = prePayMemo;
	}

	@Column(name = "PRE_PAY_MEMO_", length = 200)
	public String getPrePayMemo() {
		return prePayMemo;
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

	public void setSettleRole(String settleRole) {
		this.settleRole = settleRole;
	}

	@Column(name = "SETTLE_ROLE_", length = 10)
	public String getSettleRole() {
		return settleRole;
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

	public void setHc(String hc) {
		this.hc = hc;
	}

	@Column(name = "HC_", length = 20)
	public String getHc() {
		return hc;
	}

	public void setIsAp(String isAp) {
		this.isAp = isAp;
	}

	@Column(name = "IS_AP_", length = 10)
	public String getIsAp() {
		return isAp;
	}

	public void setIsAr(String isAr) {
		this.isAr = isAr;
	}

	@Column(name = "IS_AR_", length = 10)
	public String getIsAr() {
		return isAr;
	}

	public void setLgr(String lgr) {
		this.lgr = lgr;
	}

	@Column(name = "LGR_", length = 50)
	public String getLgr() {
		return lgr;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "NUM_")
	public BigDecimal getNum() {
		return num;
	}

	public void setQsr(String qsr) {
		this.qsr = qsr;
	}

	@Column(name = "QSR_", length = 50)
	public String getQsr() {
		return qsr;
	}

	public void setSettleProject(String settleProject) {
		this.settleProject = settleProject;
	}

	@Column(name = "SETTLE_PROJECT_", length = 10)
	public String getSettleProject() {
		return settleProject;
	}

	public void setShipNo(String shipNo) {
		this.shipNo = shipNo;
	}

	@Column(name = "SHIP_NO_", length = 20)
	public String getShipNo() {
		return shipNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	@Column(name = "TRAIN_NO_", length = 20)
	public String getTrainNo() {
		return trainNo;
	}

	public void setZdr(String zdr) {
		this.zdr = zdr;
	}

	@Column(name = "ZDR_", length = 50)
	public String getZdr() {
		return zdr;
	}

	public String toString() {
		return "Tbsh30a [sh30aId=" + sh30aId + ",compId=" + compId
				+ ",compCode=" + compCode + ",sh30Id=" + sh30Id + ",settleNo="
				+ settleNo + ",settleItem=" + settleItem + ",transNo="
				+ transNo + ",transItem=" + transItem + ",carNo=" + carNo
				+ ",phoneNo=" + phoneNo + ",userName=" + userName
				+ ",receiptNo=" + receiptNo + ",carrierNo=" + carrierNo
				+ ",carrierName=" + carrierName + ",deliverTime=" + deliverTime
				+ ",backTime=" + backTime + ",weight=" + weight + ",number="
				+ number + ",unitPrice=" + unitPrice + ",money=" + money
				+ ",obigation=" + obigation + ",specialMoney=" + specialMoney
				+ ",memo=" + memo + ",prePayments=" + prePayments
				+ ",prePayMemo=" + prePayMemo + ",transType=" + transType
				+ ",status=" + status + ",settleRole=" + settleRole
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + ",hc=" + hc + ",isAp=" + isAp
				+ ",isAr=" + isAr + ",lgr=" + lgr + ",num=" + num + ",qsr="
				+ qsr + ",settleProject=" + settleProject + ",shipNo=" + shipNo
				+ ",trainNo=" + trainNo + ",zdr=" + zdr + "]";
	}

}

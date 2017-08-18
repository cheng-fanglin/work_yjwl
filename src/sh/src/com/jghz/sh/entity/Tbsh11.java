package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh11:
 */
@Entity
@Table(name = "tbsh11")
public class Tbsh11 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh11Id;

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
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh10aId;

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
	 * 承运人ID:承运人ID
	 */
	@PropertyDef(label = "承运人ID", description = "承运人ID:承运人ID")
	private String phoneNo;

	/**
	 * 收货人姓名:收货人姓名
	 */
	@PropertyDef(label = "收货人姓名", description = "收货人姓名:收货人姓名")
	private String deliveryName;

	/**
	 * 载重:载重
	 */
	@PropertyDef(label = "载重", description = "载重:载重")
	private BigDecimal weight;

	/**
	 * 金额:金额
	 */
	@PropertyDef(label = "金额", description = "金额:金额")
	private BigDecimal money;

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
	 * 回单状态:回单状态
	 */
	@PropertyDef(label = "回单状态", description = "回单状态:回单状态")
	private String deliverStatus;

	/**
	 * 发货确认时间:发货确认时间
	 */
	@PropertyDef(label = "发货确认时间", description = "发货确认时间:发货确认时间")
	private String deliverConfTime;

	/**
	 * 回单确认状态:回单确认状态
	 */
	@PropertyDef(label = "回单确认状态", description = "回单确认状态:回单确认状态")
	private String backStatus;

	/**
	 * 回单确认时间:回单确认时间
	 */
	@PropertyDef(label = "回单确认时间", description = "回单确认时间:回单确认时间")
	private String backConfTime;

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

	public Tbsh11() {
		super();
	}

	public Tbsh11(String sh11Id, String compId, String compCode,
			String sh10aId, String carrierNo, String carrierName,
			String phoneNo, String deliveryName, BigDecimal weight,
			BigDecimal money, String state, String startTime, String endTime,
			String deliverStatus, String deliverConfTime, String backStatus,
			String backConfTime, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.sh11Id = sh11Id;
		this.compId = compId;
		this.compCode = compCode;
		this.sh10aId = sh10aId;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.phoneNo = phoneNo;
		this.deliveryName = deliveryName;
		this.weight = weight;
		this.money = money;
		this.state = state;
		this.startTime = startTime;
		this.endTime = endTime;
		this.deliverStatus = deliverStatus;
		this.deliverConfTime = deliverConfTime;
		this.backStatus = backStatus;
		this.backConfTime = backConfTime;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh11Id(String sh11Id) {
		this.sh11Id = sh11Id;
	}

	@Id
	@Column(name = "SH11_ID_", length = 50, nullable = false)
	public String getSh11Id() {
		return sh11Id;
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

	public void setSh10aId(String sh10aId) {
		this.sh10aId = sh10aId;
	}

	@Column(name = "SH10A_ID_", length = 20)
	public String getSh10aId() {
		return sh10aId;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	@Column(name = "CARRIER_NO_", length = 50)
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

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_", length = 20)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	@Column(name = "DELIVERY_NAME_", length = 50)
	public String getDeliveryName() {
		return deliveryName;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "WEIGHT_")
	public BigDecimal getWeight() {
		return weight;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Column(name = "MONEY_")
	public BigDecimal getMoney() {
		return money;
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

	public void setDeliverConfTime(String deliverConfTime) {
		this.deliverConfTime = deliverConfTime;
	}

	@Column(name = "DELIVER_CONF_TIME_", length = 50)
	public String getDeliverConfTime() {
		return deliverConfTime;
	}

	public void setBackStatus(String backStatus) {
		this.backStatus = backStatus;
	}

	@Column(name = "BACK_STATUS_", length = 10)
	public String getBackStatus() {
		return backStatus;
	}

	public void setBackConfTime(String backConfTime) {
		this.backConfTime = backConfTime;
	}

	@Column(name = "BACK_CONF_TIME_", length = 50)
	public String getBackConfTime() {
		return backConfTime;
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
		return "Tbsh11 [sh11Id=" + sh11Id + ",compId=" + compId + ",compCode="
				+ compCode + ",sh10aId=" + sh10aId + ",carrierNo=" + carrierNo
				+ ",carrierName=" + carrierName + ",phoneNo=" + phoneNo
				+ ",deliveryName=" + deliveryName + ",weight=" + weight
				+ ",money=" + money + ",state=" + state + ",startTime="
				+ startTime + ",endTime=" + endTime + ",deliverStatus="
				+ deliverStatus + ",deliverConfTime=" + deliverConfTime
				+ ",backStatus=" + backStatus + ",backConfTime=" + backConfTime
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh13a:运单挂价表TBSH13A
 */
@Entity
@Table(name = "tbsh13a")
public class Tbsh13a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh13aId;

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
	 * 挂价:挂价
	 */
	@PropertyDef(label = "挂价", description = "挂价:挂价")
	private BigDecimal money;

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
	 * DELIVER_CAR_NO_:
	 */
	@PropertyDef(label = "DELIVER_CAR_NO_", description = "DELIVER_CAR_NO_:")
	private String deliverCarNo;

	/**
	 * 装货时间:装货时间
	 */
	@PropertyDef(label = "装货时间", description = "装货时间:装货时间")
	private String outDate;

	/**
	 * 配货时间:配货时间
	 */
	@PropertyDef(label = "配货时间", description = "配货时间:配货时间")
	private String phDate;

	/**
	 * 回单时间:回单时间
	 */
	@PropertyDef(label = "回单时间", description = "回单时间:回单时间")
	private String backTime;

	/**
	 * 是否指定承运方:是否指定承运方
	 */
	@PropertyDef(label = "是否指定承运方", description = "是否指定承运方:是否指定承运方")
	private String idDestineOrder;

	public Tbsh13a() {
		super();
	}

	public Tbsh13a(String sh13aId, String compId, String compCode,
			String transNo, String transItem, BigDecimal money, String carNo,
			String phoneNo, String userName, String carrierNo,
			String carrierName, String driverName, BigDecimal bidPrice,
			String bidTime, String status, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version,
			String deliverCarNo, String outDate, String phDate,
			String backTime, String idDestineOrder) {
		super();
		this.sh13aId = sh13aId;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.transItem = transItem;
		this.money = money;
		this.carNo = carNo;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.driverName = driverName;
		this.bidPrice = bidPrice;
		this.bidTime = bidTime;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.deliverCarNo = deliverCarNo;
		this.outDate = outDate;
		this.phDate = phDate;
		this.backTime = backTime;
		this.idDestineOrder = idDestineOrder;
	}

	public void setSh13aId(String sh13aId) {
		this.sh13aId = sh13aId;
	}

	@Id
	@Column(name = "SH13A_ID_", length = 50, nullable = false)
	public String getSh13aId() {
		return sh13aId;
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

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Column(name = "MONEY_")
	public BigDecimal getMoney() {
		return money;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
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

	public void setDeliverCarNo(String deliverCarNo) {
		this.deliverCarNo = deliverCarNo;
	}

	@Column(name = "DELIVER_CAR_NO_", length = 20)
	public String getDeliverCarNo() {
		return deliverCarNo;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	@Column(name = "OUT_DATE_", length = 10)
	public String getOutDate() {
		return outDate;
	}

	public void setPhDate(String phDate) {
		this.phDate = phDate;
	}

	@Column(name = "PH_DATE_", length = 10)
	public String getPhDate() {
		return phDate;
	}

	public void setBackTime(String backTime) {
		this.backTime = backTime;
	}

	@Column(name = "BACK_TIME_", length = 10)
	public String getBackTime() {
		return backTime;
	}

	public void setIdDestineOrder(String idDestineOrder) {
		this.idDestineOrder = idDestineOrder;
	}

	@Column(name = "ID_DESTINE_ORDER_", length = 10)
	public String getIdDestineOrder() {
		return idDestineOrder;
	}

	public String toString() {
		return "Tbsh13a [sh13aId=" + sh13aId + ",compId=" + compId
				+ ",compCode=" + compCode + ",transNo=" + transNo
				+ ",transItem=" + transItem + ",money=" + money + ",carNo="
				+ carNo + ",phoneNo=" + phoneNo + ",userName=" + userName
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",driverName=" + driverName + ",bidPrice=" + bidPrice
				+ ",bidTime=" + bidTime + ",status=" + status + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + ",deliverCarNo=" + deliverCarNo + ",outDate="
				+ outDate + ",phDate=" + phDate + ",backTime=" + backTime
				+ ",idDestineOrder=" + idDestineOrder + "]";
	}

}

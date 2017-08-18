package com.jghz.sh.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbwd09:驾驶员违章记录
 */
@Entity
@Table(name = "tbwd09")
public class Tbwd09 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String wd09Id;

	/**
	 * 司机名称:司机名称
	 */
	@PropertyDef(label = "司机名称", description = "司机名称:司机名称")
	private String driverName;

	/**
	 * 手机号:手机号
	 */
	@PropertyDef(label = "手机号", description = "手机号:手机号")
	private BigDecimal phoneNo;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

	/**
	 * 违章日期:违章日期
	 */
	@PropertyDef(label = "违章日期", description = "违章日期:违章日期")
	private String date;

	/**
	 * 违章金额:违章金额
	 */
	@PropertyDef(label = "违章金额", description = "违章金额:违章金额")
	private BigDecimal amt;

	/**
	 * 违章原因:违章原因
	 */
	@PropertyDef(label = "违章原因", description = "违章原因:违章原因")
	private String reason;

	
	/**
	 * 新增人员:新增人员
	 */
	@PropertyDef(label = "新增人员", description = "新增人员:新增人员")
	private String createEmp;

	/**
	 * 新增时间:新增时间
	 */
	@PropertyDef(label = "新增时间", description = "新增时间:新增时间")
	private Date createTime;

	/**
	 * 更新人员:更新人员
	 */
	@PropertyDef(label = "更新人员", description = "更新人员:更新人员")
	private String updateEmp;

	/**
	 * 更新时间:更新时间
	 */
	@PropertyDef(label = "更新时间", description = "更新时间:更新时间")
	private Date updateTime;

	/**
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;
	
	public Tbwd09() {
		super();
	}

	public Tbwd09(String wd09Id, String driverName, BigDecimal phoneNo,
			String carNo, String date, BigDecimal amt, String reason) {
		super();
		this.wd09Id = wd09Id;
		this.driverName = driverName;
		this.phoneNo = phoneNo;
		this.carNo = carNo;
		this.date = date;
		this.amt = amt;
		this.reason = reason;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setWd09Id(String wd09Id) {
		this.wd09Id = wd09Id;
	}

	@Id
	@Column(name = "WD09_ID_", length = 50, nullable = false)
	public String getWd09Id() {
		return wd09Id;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Column(name = "DRIVER_NAME_", length = 50)
	public String getDriverName() {
		return driverName;
	}

	public void setPhoneNo(BigDecimal phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_")
	public BigDecimal getPhoneNo() {
		return phoneNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "DATE_", length = 20)
	public String getDate() {
		return date;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	@Column(name = "AMT_")
	public BigDecimal getAmt() {
		return amt;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "REASON_", length = 500)
	public String getReason() {
		return reason;
	}

	
	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 10)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_", nullable = false)
	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 10)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME_", nullable = false)
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION_")
	public int getVersion() {
		return version;
	}
	
	public String toString() {
		return "Tbwd09 [wd09Id=" + wd09Id + ",driverName=" + driverName
				+ ",phoneNo=" + phoneNo + ",carNo=" + carNo + ",date=" + date
				+ ",amt=" + amt + ",reason=" + reason + ",createEmp=" + createEmp
				+ ",createTime=" + createTime + ",updateEmp=" + updateEmp
				+ ",updateTime=" + updateTime + "]";
	}

}

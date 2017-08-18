package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbwd07:
 */
@Entity
@Table(name = "tbwd07")
public class Tbwd07 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String wd07Id;

	/**
	 * 车船号:车船号
	 */
	@PropertyDef(label = "车船号", description = "车船号:车船号")
	private String carNo;

	/**
	 * 日期:日期
	 */
	@PropertyDef(label = "日期", description = "日期:日期")
	private String date;

	/**
	 * 加油费:加油费
	 */
	@PropertyDef(label = "加油费", description = "加油费:加油费")
	private BigDecimal addOil;

	/**
	 * 维修费:维修费
	 */
	@PropertyDef(label = "维修费", description = "维修费:维修费")
	private BigDecimal upkeep;

	/**
	 * 年审费:年审费
	 */
	@PropertyDef(label = "年审费", description = "年审费:年审费")
	private BigDecimal annualFee;

	/**
	 * 加油费:加油费
	 */
	@PropertyDef(label = "加油费", description = "加油费:加油费")
	private BigDecimal addGass;

	/**
	 * 保险费:保险费
	 */
	@PropertyDef(label = "保险费", description = "保险费:保险费")
	private BigDecimal insurance;

	/**
	 * 配件:配件
	 */
	@PropertyDef(label = "配件", description = "配件:配件")
	private BigDecimal parts;

	/**
	 * 罚款:罚款
	 */
	@PropertyDef(label = "罚款", description = "罚款:罚款")
	private BigDecimal fine;

	/**
	 * 赔偿:赔偿
	 */
	@PropertyDef(label = "赔偿", description = "赔偿:赔偿")
	private BigDecimal payFor;

	/**
	 * 路桥费:路桥费
	 */
	@PropertyDef(label = "路桥费", description = "路桥费:路桥费")
	private BigDecimal roadFee;

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

	public Tbwd07() {
		super();
	}

	public Tbwd07(String wd07Id, String carNo, String date, BigDecimal addOil,
			BigDecimal upkeep, BigDecimal annualFee, BigDecimal addGass,
			BigDecimal insurance, BigDecimal parts, BigDecimal fine,
			BigDecimal payFor, BigDecimal roadFee, String createEmp,
			Date createTime, String updateEmp, Date updateTime, int version) {
		super();
		this.wd07Id = wd07Id;
		this.carNo = carNo;
		this.date = date;
		this.addOil = addOil;
		this.upkeep = upkeep;
		this.annualFee = annualFee;
		this.addGass = addGass;
		this.insurance = insurance;
		this.parts = parts;
		this.fine = fine;
		this.payFor = payFor;
		this.roadFee = roadFee;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setWd07Id(String wd07Id) {
		this.wd07Id = wd07Id;
	}

	@Id
	@Column(name = "WD07_ID_", length = 50, nullable = false)
	public String getWd07Id() {
		return wd07Id;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 50)
	public String getCarNo() {
		return carNo;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "DATE_", length = 10)
	public String getDate() {
		return date;
	}

	public void setAddOil(BigDecimal addOil) {
		this.addOil = addOil;
	}

	@Column(name = "ADD_OIL_")
	public BigDecimal getAddOil() {
		return addOil;
	}

	public void setUpkeep(BigDecimal upkeep) {
		this.upkeep = upkeep;
	}

	@Column(name = "UPKEEP_")
	public BigDecimal getUpkeep() {
		return upkeep;
	}

	public void setAnnualFee(BigDecimal annualFee) {
		this.annualFee = annualFee;
	}

	@Column(name = "ANNUAL_FEE_")
	public BigDecimal getAnnualFee() {
		return annualFee;
	}

	public void setAddGass(BigDecimal addGass) {
		this.addGass = addGass;
	}

	@Column(name = "ADD_GASS_")
	public BigDecimal getAddGass() {
		return addGass;
	}

	public void setInsurance(BigDecimal insurance) {
		this.insurance = insurance;
	}

	@Column(name = "INSURANCE_")
	public BigDecimal getInsurance() {
		return insurance;
	}

	public void setParts(BigDecimal parts) {
		this.parts = parts;
	}

	@Column(name = "PARTS_")
	public BigDecimal getParts() {
		return parts;
	}

	public void setFine(BigDecimal fine) {
		this.fine = fine;
	}

	@Column(name = "FINE_")
	public BigDecimal getFine() {
		return fine;
	}

	public void setPayFor(BigDecimal payFor) {
		this.payFor = payFor;
	}

	@Column(name = "PAY_FOR_")
	public BigDecimal getPayFor() {
		return payFor;
	}

	public void setRoadFee(BigDecimal roadFee) {
		this.roadFee = roadFee;
	}

	@Column(name = "ROAD_FEE_")
	public BigDecimal getRoadFee() {
		return roadFee;
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
		return "Tbwd07 [wd07Id=" + wd07Id + ",carNo=" + carNo + ",date=" + date
				+ ",addOil=" + addOil + ",upkeep=" + upkeep + ",annualFee="
				+ annualFee + ",addGass=" + addGass + ",insurance=" + insurance
				+ ",parts=" + parts + ",fine=" + fine + ",payFor=" + payFor
				+ ",roadFee=" + roadFee + ",createEmp=" + createEmp
				+ ",createTime=" + createTime + ",updateEmp=" + updateEmp
				+ ",updateTime=" + updateTime + ",version=" + version + "]";
	}

}

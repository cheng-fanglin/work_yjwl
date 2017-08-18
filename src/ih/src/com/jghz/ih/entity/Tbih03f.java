package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih03f:TBIH03F(特殊收费时段设置)
 */
@Entity
@Table(name = "tbih03f")
public class Tbih03f implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih03fId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 时段起始时间:时段起始时间
	 */
	@PropertyDef(label = "时段起始时间", description = "时段起始时间:时段起始时间")
	private String startTime;

	/**
	 * 时段截止时间:时段截止时间
	 */
	@PropertyDef(label = "时段截止时间", description = "时段截止时间:时段截止时间")
	private String endTime;

	/**
	 * 周几:周几
	 */
	@PropertyDef(label = "周几", description = "周几:周几")
	private String weekDay;

	/**
	 * 增补费用:增补费用
	 */
	@PropertyDef(label = "增补费用", description = "增补费用:增补费用")
	private BigDecimal addMoney;

	/**
	 * 启用时间:启用时间
	 */
	@PropertyDef(label = "启用时间", description = "启用时间:启用时间")
	private String startDate;

	/**
	 * 启用人:启用人
	 */
	@PropertyDef(label = "启用人", description = "启用人:启用人")
	private String startEmp;

	/**
	 * 停用时间:停用时间
	 */
	@PropertyDef(label = "停用时间", description = "停用时间:停用时间")
	private String endDate;

	/**
	 * 停用人:停用人
	 */
	@PropertyDef(label = "停用人", description = "停用人:停用人")
	private String endEmp;

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
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String state;

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

	public Tbih03f() {
		super();
	}

	public Tbih03f(String ih03fId, String compId, String startTime,
			String endTime, String weekDay, BigDecimal addMoney,
			String startDate, String startEmp, String endDate, String endEmp,
			String by1, String by2, String by3, String state, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih03fId = ih03fId;
		this.compId = compId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.weekDay = weekDay;
		this.addMoney = addMoney;
		this.startDate = startDate;
		this.startEmp = startEmp;
		this.endDate = endDate;
		this.endEmp = endEmp;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.state = state;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh03fId(String ih03fId) {
		this.ih03fId = ih03fId;
	}

	@Id
	@Column(name = "IH03F_ID_", length = 50, nullable = false)
	public String getIh03fId() {
		return ih03fId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Column(name = "START_TIME_", length = 20)
	public String getStartTime() {
		return startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Column(name = "END_TIME_", length = 20)
	public String getEndTime() {
		return endTime;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	@Column(name = "WEEK_DAY_", length = 20)
	public String getWeekDay() {
		return weekDay;
	}

	public void setAddMoney(BigDecimal addMoney) {
		this.addMoney = addMoney;
	}

	@Column(name = "ADD_MONEY_")
	public BigDecimal getAddMoney() {
		return addMoney;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Column(name = "START_DATE_", length = 20)
	public String getStartDate() {
		return startDate;
	}

	public void setStartEmp(String startEmp) {
		this.startEmp = startEmp;
	}

	@Column(name = "START_EMP_", length = 50)
	public String getStartEmp() {
		return startEmp;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Column(name = "END_DATE_", length = 20)
	public String getEndDate() {
		return endDate;
	}

	public void setEndEmp(String endEmp) {
		this.endEmp = endEmp;
	}

	@Column(name = "END_EMP_", length = 50)
	public String getEndEmp() {
		return endEmp;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 50)
	public String getBy1() {
		return by1;
	}

	public void setBy2(String by2) {
		this.by2 = by2;
	}

	@Column(name = "BY2_", length = 50)
	public String getBy2() {
		return by2;
	}

	public void setBy3(String by3) {
		this.by3 = by3;
	}

	@Column(name = "BY3_", length = 50)
	public String getBy3() {
		return by3;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "STATE_", length = 20)
	public String getState() {
		return state;
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
		return "Tbih03f [ih03fId=" + ih03fId + ",compId=" + compId
				+ ",startTime=" + startTime + ",endTime=" + endTime
				+ ",weekDay=" + weekDay + ",addMoney=" + addMoney
				+ ",startDate=" + startDate + ",startEmp=" + startEmp
				+ ",endDate=" + endDate + ",endEmp=" + endEmp + ",by1=" + by1
				+ ",by2=" + by2 + ",by3=" + by3 + ",state=" + state
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

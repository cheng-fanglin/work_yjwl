package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh12:
 */
@Entity
@Table(name = "tbsh12")
public class Tbsh12 implements Serializable {

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
	 * 运单项次号:运单项次号
	 */
	@PropertyDef(label = "运单项次号", description = "运单项次号:运单项次号")
	private String transItem;

	/**
	 * 标题:标题
	 */
	@PropertyDef(label = "标题", description = "标题:标题")
	private String title;

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
	 * 发布价格:发布价格
	 */
	@PropertyDef(label = "发布价格", description = "发布价格:发布价格")
	private BigDecimal quote;

	/**
	 * 挂价:挂价
	 */
	@PropertyDef(label = "挂价", description = "挂价:挂价")
	private BigDecimal money;

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

	public Tbsh12() {
		super();
	}

	public Tbsh12(String sh11Id, String compId, String compCode,
			String transItem, String title, String despatchName,
			String despatchMobile, String despatchStart, String despatchEnd,
			String carType, String carLength, BigDecimal quote,
			BigDecimal money, String phoneNo, String userName,
			String carrierNo, String carrierName, String driverName,
			BigDecimal bidPrice, String bidTime, String status,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.sh11Id = sh11Id;
		this.compId = compId;
		this.compCode = compCode;
		this.transItem = transItem;
		this.title = title;
		this.despatchName = despatchName;
		this.despatchMobile = despatchMobile;
		this.despatchStart = despatchStart;
		this.despatchEnd = despatchEnd;
		this.carType = carType;
		this.carLength = carLength;
		this.quote = quote;
		this.money = money;
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

	public void setTransItem(String transItem) {
		this.transItem = transItem;
	}

	@Column(name = "TRANS_ITEM_", length = 20)
	public String getTransItem() {
		return transItem;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "TITLE_", length = 20)
	public String getTitle() {
		return title;
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

	public void setQuote(BigDecimal quote) {
		this.quote = quote;
	}

	@Column(name = "QUOTE_")
	public BigDecimal getQuote() {
		return quote;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Column(name = "MONEY_")
	public BigDecimal getMoney() {
		return money;
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

	public String toString() {
		return "Tbsh12 [sh11Id=" + sh11Id + ",compId=" + compId + ",compCode="
				+ compCode + ",transItem=" + transItem + ",title=" + title
				+ ",despatchName=" + despatchName + ",despatchMobile="
				+ despatchMobile + ",despatchStart=" + despatchStart
				+ ",despatchEnd=" + despatchEnd + ",carType=" + carType
				+ ",carLength=" + carLength + ",quote=" + quote + ",money="
				+ money + ",phoneNo=" + phoneNo + ",userName=" + userName
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",driverName=" + driverName + ",bidPrice=" + bidPrice
				+ ",bidTime=" + bidTime + ",status=" + status + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + "]";
	}

}

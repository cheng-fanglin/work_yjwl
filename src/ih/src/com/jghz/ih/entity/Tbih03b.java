package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih03b:TBIH03B(基本价格维护-仓储管理费)
 */
@Entity
@Table(name = "tbih03b")
public class Tbih03b implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih03bId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 合同号:合同号
	 */
	@PropertyDef(label = "合同号", description = "合同号:合同号")
	private String contNo;

	/**
	 * 客户编码:客户编码
	 */
	@PropertyDef(label = "客户编码", description = "客户编码:客户编码")
	private String custNo;

	/**
	 * 客户:客户
	 */
	@PropertyDef(label = "客户", description = "客户:客户")
	private String custName;

	/**
	 * 起始库龄:起始库龄
	 */
	@PropertyDef(label = "起始库龄", description = "起始库龄:起始库龄")
	private BigDecimal startDate;

	/**
	 * 结束库龄:结束库龄
	 */
	@PropertyDef(label = "结束库龄", description = "结束库龄:结束库龄")
	private BigDecimal endDate;

	/**
	 * 仓储单价:仓储单价
	 */
	@PropertyDef(label = "仓储单价", description = "仓储单价:仓储单价")
	private BigDecimal storagePrice;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 启用时间:启用时间
	 */
	@PropertyDef(label = "启用时间", description = "启用时间:启用时间")
	private String usedate;

	/**
	 * 经营属性:经营属性
	 */
	@PropertyDef(label = "经营属性", description = "经营属性:经营属性")
	private String businature;

	/**
	 * 所在城市:所在城市
	 */
	@PropertyDef(label = "所在城市", description = "所在城市:所在城市")
	private String city;

	/**
	 * 库别:库别
	 */
	@PropertyDef(label = "库别", description = "库别:库别")
	private String kb;

	/**
	 * 包干:包干
	 */
	@PropertyDef(label = "包干", description = "包干:包干")
	private String isall;

	/**
	 * 到站:到站
	 */
	@PropertyDef(label = "到站", description = "到站:到站")
	private String stationCode;

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
	 * 备用4:备用4
	 */
	@PropertyDef(label = "备用4", description = "备用4:备用4")
	private String by4;

	/**
	 * 备用5:备用5
	 */
	@PropertyDef(label = "备用5", description = "备用5:备用5")
	private String by5;

	/**
	 * 备用6:备用6
	 */
	@PropertyDef(label = "备用6", description = "备用6:备用6")
	private String by6;

	/**
	 * 备用7:备用7
	 */
	@PropertyDef(label = "备用7", description = "备用7:备用7")
	private String by7;

	/**
	 * 备用8:备用8
	 */
	@PropertyDef(label = "备用8", description = "备用8:备用8")
	private BigDecimal by8;

	/**
	 * 备用9:备用9
	 */
	@PropertyDef(label = "备用9", description = "备用9:备用9")
	private BigDecimal by9;

	/**
	 * 备用10:备用10
	 */
	@PropertyDef(label = "备用10", description = "备用10:备用10")
	private BigDecimal by10;

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

	public Tbih03b() {
		super();
	}

	public Tbih03b(String ih03bId, String compId, String contNo, String custNo,
			String custName, BigDecimal startDate, BigDecimal endDate,
			BigDecimal storagePrice, String status, String usedate,
			String businature, String city, String kb, String isall,
			String stationCode, String by1, String by2, String by3, String by4,
			String by5, String by6, String by7, BigDecimal by8, BigDecimal by9,
			BigDecimal by10, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih03bId = ih03bId;
		this.compId = compId;
		this.contNo = contNo;
		this.custNo = custNo;
		this.custName = custName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.storagePrice = storagePrice;
		this.status = status;
		this.usedate = usedate;
		this.businature = businature;
		this.city = city;
		this.kb = kb;
		this.isall = isall;
		this.stationCode = stationCode;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.by4 = by4;
		this.by5 = by5;
		this.by6 = by6;
		this.by7 = by7;
		this.by8 = by8;
		this.by9 = by9;
		this.by10 = by10;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh03bId(String ih03bId) {
		this.ih03bId = ih03bId;
	}

	@Id
	@Column(name = "IH03B_ID_", length = 50, nullable = false)
	public String getIh03bId() {
		return ih03bId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 20)
	public String getCustNo() {
		return custNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CUST_NAME_", length = 200)
	public String getCustName() {
		return custName;
	}

	public void setStartDate(BigDecimal startDate) {
		this.startDate = startDate;
	}

	@Column(name = "START_DATE_")
	public BigDecimal getStartDate() {
		return startDate;
	}

	public void setEndDate(BigDecimal endDate) {
		this.endDate = endDate;
	}

	@Column(name = "END_DATE_")
	public BigDecimal getEndDate() {
		return endDate;
	}

	public void setStoragePrice(BigDecimal storagePrice) {
		this.storagePrice = storagePrice;
	}

	@Column(name = "STORAGE_PRICE_")
	public BigDecimal getStoragePrice() {
		return storagePrice;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setUsedate(String usedate) {
		this.usedate = usedate;
	}

	@Column(name = "USEDATE_", length = 20)
	public String getUsedate() {
		return usedate;
	}

	public void setBusinature(String businature) {
		this.businature = businature;
	}

	@Column(name = "BUSINATURE_", length = 50)
	public String getBusinature() {
		return businature;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "CITY_", length = 20)
	public String getCity() {
		return city;
	}

	public void setKb(String kb) {
		this.kb = kb;
	}

	@Column(name = "KB_", length = 20)
	public String getKb() {
		return kb;
	}

	public void setIsall(String isall) {
		this.isall = isall;
	}

	@Column(name = "ISALL_", length = 5)
	public String getIsall() {
		return isall;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	@Column(name = "STATION_CODE_", length = 50)
	public String getStationCode() {
		return stationCode;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 30)
	public String getBy1() {
		return by1;
	}

	public void setBy2(String by2) {
		this.by2 = by2;
	}

	@Column(name = "BY2_", length = 30)
	public String getBy2() {
		return by2;
	}

	public void setBy3(String by3) {
		this.by3 = by3;
	}

	@Column(name = "BY3_", length = 30)
	public String getBy3() {
		return by3;
	}

	public void setBy4(String by4) {
		this.by4 = by4;
	}

	@Column(name = "BY4_", length = 50)
	public String getBy4() {
		return by4;
	}

	public void setBy5(String by5) {
		this.by5 = by5;
	}

	@Column(name = "BY5_", length = 100)
	public String getBy5() {
		return by5;
	}

	public void setBy6(String by6) {
		this.by6 = by6;
	}

	@Column(name = "BY6_", length = 100)
	public String getBy6() {
		return by6;
	}

	public void setBy7(String by7) {
		this.by7 = by7;
	}

	@Column(name = "BY7_", length = 200)
	public String getBy7() {
		return by7;
	}

	public void setBy8(BigDecimal by8) {
		this.by8 = by8;
	}

	@Column(name = "BY8_")
	public BigDecimal getBy8() {
		return by8;
	}

	public void setBy9(BigDecimal by9) {
		this.by9 = by9;
	}

	@Column(name = "BY9_")
	public BigDecimal getBy9() {
		return by9;
	}

	public void setBy10(BigDecimal by10) {
		this.by10 = by10;
	}

	@Column(name = "BY10_")
	public BigDecimal getBy10() {
		return by10;
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
		return "Tbih03b [ih03bId=" + ih03bId + ",compId=" + compId + ",contNo="
				+ contNo + ",custNo=" + custNo + ",custName=" + custName
				+ ",startDate=" + startDate + ",endDate=" + endDate
				+ ",storagePrice=" + storagePrice + ",status=" + status
				+ ",usedate=" + usedate + ",businature=" + businature
				+ ",city=" + city + ",kb=" + kb + ",isall=" + isall
				+ ",stationCode=" + stationCode + ",by1=" + by1 + ",by2=" + by2
				+ ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5 + ",by6=" + by6
				+ ",by7=" + by7 + ",by8=" + by8 + ",by9=" + by9 + ",by10="
				+ by10 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

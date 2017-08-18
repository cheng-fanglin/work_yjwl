package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih02b:TBIH02B(抵税维护)
 */
@Entity
@Table(name = "tbih02b")
public class Tbih02b implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
	private String ih02bId;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String ih02Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)
	 */
	@PropertyDef(label = "类别(JY-经营/ZY-自营)", description = "类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)")
	private String lb;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 税号:税号
	 */
	@PropertyDef(label = "税号", description = "税号:税号")
	private String taxNo;

	/**
	 * 抵税单位名称:抵税单位名称
	 */
	@PropertyDef(label = "抵税单位名称", description = "抵税单位名称:抵税单位名称")
	private String dsName;

	/**
	 * 抵税单位编号:抵税单位编号
	 */
	@PropertyDef(label = "抵税单位编号", description = "抵税单位编号:抵税单位编号")
	private String dsNo;

	/**
	 * 客户编码:客户编码
	 */
	@PropertyDef(label = "客户编码", description = "客户编码:客户编码")
	private String custNo;

	/**
	 * 客户全称:客户全称
	 */
	@PropertyDef(label = "客户全称", description = "客户全称:客户全称")
	private String custName;

	/**
	 * 地址:地址
	 */
	@PropertyDef(label = "地址", description = "地址:地址")
	private String address;

	/**
	 * 开户行:开户行
	 */
	@PropertyDef(label = "开户行", description = "开户行:开户行")
	private String openedBank;

	/**
	 * 账号:账号
	 */
	@PropertyDef(label = "账号", description = "账号:账号")
	private String bankAcct;

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
	private BigDecimal by4;

	/**
	 * 创建者:创建者
	 */
	@PropertyDef(label = "创建者", description = "创建者:创建者")
	private String createEmp;

	/**
	 * 创建时间:创建时间
	 */
	@PropertyDef(label = "创建时间", description = "创建时间:创建时间")
	private Date createDate;

	/**
	 * 修改者:修改者
	 */
	@PropertyDef(label = "修改者", description = "修改者:修改者")
	private String updateEmp;

	/**
	 * 修改时间:修改时间
	 */
	@PropertyDef(label = "修改时间", description = "修改时间:修改时间")
	private Date updateDate;

	/**
	 * VERSION:VERSION
	 */
	@PropertyDef(label = "VERSION", description = "VERSION:VERSION")
	private int version;

	public Tbih02b() {
		super();
	}

	public Tbih02b(String ih02bId, String ih02Id, String compId, String lb,
			String area, String taxNo, String dsName, String dsNo,
			String custNo, String custName, String address, String openedBank,
			String bankAcct, String by1, String by2, String by3,
			BigDecimal by4, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih02bId = ih02bId;
		this.ih02Id = ih02Id;
		this.compId = compId;
		this.lb = lb;
		this.area = area;
		this.taxNo = taxNo;
		this.dsName = dsName;
		this.dsNo = dsNo;
		this.custNo = custNo;
		this.custName = custName;
		this.address = address;
		this.openedBank = openedBank;
		this.bankAcct = bankAcct;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.by4 = by4;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh02bId(String ih02bId) {
		this.ih02bId = ih02bId;
	}

	@Id
	@Column(name = "IH02B_ID_", length = 50, nullable = false)
	public String getIh02bId() {
		return ih02bId;
	}

	public void setIh02Id(String ih02Id) {
		this.ih02Id = ih02Id;
	}

	@Column(name = "IH02_ID_", length = 50)
	public String getIh02Id() {
		return ih02Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 50)
	public String getLb() {
		return lb;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 100)
	public String getArea() {
		return area;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	@Column(name = "TAX_NO_", length = 20)
	public String getTaxNo() {
		return taxNo;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	@Column(name = "DS_NAME_", length = 200)
	public String getDsName() {
		return dsName;
	}

	public void setDsNo(String dsNo) {
		this.dsNo = dsNo;
	}

	@Column(name = "DS_NO_", length = 20)
	public String getDsNo() {
		return dsNo;
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

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "ADDRESS_", length = 100)
	public String getAddress() {
		return address;
	}

	public void setOpenedBank(String openedBank) {
		this.openedBank = openedBank;
	}

	@Column(name = "OPENED_BANK_", length = 200)
	public String getOpenedBank() {
		return openedBank;
	}

	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}

	@Column(name = "BANK_ACCT_", length = 200)
	public String getBankAcct() {
		return bankAcct;
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

	public void setBy4(BigDecimal by4) {
		this.by4 = by4;
	}

	@Column(name = "BY4_")
	public BigDecimal getBy4() {
		return by4;
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
		return "Tbih02b [ih02bId=" + ih02bId + ",ih02Id=" + ih02Id + ",compId="
				+ compId + ",lb=" + lb + ",area=" + area + ",taxNo=" + taxNo
				+ ",dsName=" + dsName + ",dsNo=" + dsNo + ",custNo=" + custNo
				+ ",custName=" + custName + ",address=" + address
				+ ",openedBank=" + openedBank + ",bankAcct=" + bankAcct
				+ ",by1=" + by1 + ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

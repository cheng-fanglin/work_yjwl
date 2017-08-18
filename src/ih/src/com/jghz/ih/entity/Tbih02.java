package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih02:TBIH02(往来单位)
 */
@Entity
@Table(name = "tbih02")
public class Tbih02 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih02Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

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
	 * 客户简称:客户简称
	 */
	@PropertyDef(label = "客户简称", description = "客户简称:客户简称")
	private String custSname;

	/**
	 * 客户属性:客户属性
	 */
	@PropertyDef(label = "客户属性", description = "客户属性:客户属性")
	private String custAttr;

	/**
	 * 搜索名:搜索名
	 */
	@PropertyDef(label = "搜索名", description = "搜索名:搜索名")
	private String searchName;

	/**
	 * 承运商编号:承运商编号
	 */
	@PropertyDef(label = "承运商编号", description = "承运商编号:承运商编号")
	private String carrierNo;

	/**
	 * 法人:法人
	 */
	@PropertyDef(label = "法人", description = "法人:法人")
	private String lawMan;

	/**
	 * 企业税号:企业税号
	 */
	@PropertyDef(label = "企业税号", description = "企业税号:企业税号")
	private String taxNo;

	/**
	 * 邮政编码:邮政编码
	 */
	@PropertyDef(label = "邮政编码", description = "邮政编码:邮政编码")
	private String postNo;

	/**
	 * 客户地址:客户地址
	 */
	@PropertyDef(label = "客户地址", description = "客户地址:客户地址")
	private String address;

	/**
	 * 资金余额:资金余额
	 */
	@PropertyDef(label = "资金余额", description = "资金余额:资金余额")
	private BigDecimal balancenum;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 身份:身份
	 */
	@PropertyDef(label = "身份", description = "身份:身份")
	private String identity;

	/**
	 * 客户分类:客户分类
	 */
	@PropertyDef(label = "客户分类", description = "客户分类:客户分类")
	private String custType;

	/**
	 * 重点客户:重点客户
	 */
	@PropertyDef(label = "重点客户", description = "重点客户:重点客户")
	private String iscusfous;

	/**
	 * 信用等级:信用等级
	 */
	@PropertyDef(label = "信用等级", description = "信用等级:信用等级")
	private String creadit;

	/**
	 * 产销客户:产销客户
	 */
	@PropertyDef(label = "产销客户", description = "产销客户:产销客户")
	private String ispmcus;

	/**
	 * 承运商名称:承运商名称
	 */
	@PropertyDef(label = "承运商名称", description = "承运商名称:承运商名称")
	private String carrierName;

	/**
	 * 货主单位编号:货主单位编号
	 */
	@PropertyDef(label = "货主单位编号", description = "货主单位编号:货主单位编号")
	private String ownnerCompNo;

	/**
	 * 货主单位名称:货主单位名称
	 */
	@PropertyDef(label = "货主单位名称", description = "货主单位名称:货主单位名称")
	private String ownnerCompName;

	/**
	 * 开户银行:开户银行
	 */
	@PropertyDef(label = "开户银行", description = "开户银行:开户银行")
	private String openedBank;

	/**
	 * 开户行账号:开户行账号
	 */
	@PropertyDef(label = "开户行账号", description = "开户行账号:开户行账号")
	private String bankAcct;

	/**
	 * 开票单位编号:开票单位编号
	 */
	@PropertyDef(label = "开票单位编号", description = "开票单位编号:开票单位编号")
	private String invCustNo;

	/**
	 * 开票单位名称:开票单位名称
	 */
	@PropertyDef(label = "开票单位名称", description = "开票单位名称:开票单位名称")
	private String invCustName;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String transport;

	/**
	 * 产销承运单位:产销承运单位
	 */
	@PropertyDef(label = "产销承运单位", description = "产销承运单位:产销承运单位")
	private String isacccom;

	/**
	 * 供应商编码:供应商编码
	 */
	@PropertyDef(label = "供应商编码", description = "供应商编码:供应商编码")
	private String vendorNo;

	/**
	 * 供应商:供应商
	 */
	@PropertyDef(label = "供应商", description = "供应商:供应商")
	private String vendorName;

	/**
	 * 抵税人编码:抵税人编码
	 */
	@PropertyDef(label = "抵税人编码", description = "抵税人编码:抵税人编码")
	private String dsNo;

	/**
	 * 抵税人名称:抵税人名称
	 */
	@PropertyDef(label = "抵税人名称", description = "抵税人名称:抵税人名称")
	private String dsName;

	/**
	 * 联系电话:联系电话
	 */
	@PropertyDef(label = "联系电话", description = "联系电话:联系电话")
	private String telphone;

	/**
	 * 联系电话2:联系电话2
	 */
	@PropertyDef(label = "联系电话2", description = "联系电话2:联系电话2")
	private String telphone2;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

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

	/**
	 * COMP_ADDERSS_:
	 */
	@PropertyDef(label = "COMP_ADDERSS_", description = "COMP_ADDERSS_:")
	private String compAdderss;

	/**
	 * COMP_NAME_:
	 */
	@PropertyDef(label = "COMP_NAME_", description = "COMP_NAME_:")
	private String compName;

	/**
	 * COMP_NO_:
	 */
	@PropertyDef(label = "COMP_NO_", description = "COMP_NO_:")
	private String compNo;

	/**
	 * COMP_SNAME_:
	 */
	@PropertyDef(label = "COMP_SNAME_", description = "COMP_SNAME_:")
	private String compSname;

	/**
	 * LEGALPERSON_:
	 */
	@PropertyDef(label = "LEGALPERSON_", description = "LEGALPERSON_:")
	private String legalperson;

	/**
	 * ZCODE_:
	 */
	@PropertyDef(label = "ZCODE_", description = "ZCODE_:")
	private String zcode;

	public Tbih02() {
		super();
	}

	public Tbih02(String ih02Id, String compId, String custNo, String custName,
			String custSname, String custAttr, String searchName,
			String carrierNo, String lawMan, String taxNo, String postNo,
			String address, BigDecimal balancenum, String area,
			String identity, String custType, String iscusfous, String creadit,
			String ispmcus, String carrierName, String ownnerCompNo,
			String ownnerCompName, String openedBank, String bankAcct,
			String invCustNo, String invCustName, String transport,
			String isacccom, String vendorNo, String vendorName, String dsNo,
			String dsName, String telphone, String telphone2, String status,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version, String compAdderss, String compName,
			String compNo, String compSname, String legalperson, String zcode) {
		super();
		this.ih02Id = ih02Id;
		this.compId = compId;
		this.custNo = custNo;
		this.custName = custName;
		this.custSname = custSname;
		this.custAttr = custAttr;
		this.searchName = searchName;
		this.carrierNo = carrierNo;
		this.lawMan = lawMan;
		this.taxNo = taxNo;
		this.postNo = postNo;
		this.address = address;
		this.balancenum = balancenum;
		this.area = area;
		this.identity = identity;
		this.custType = custType;
		this.iscusfous = iscusfous;
		this.creadit = creadit;
		this.ispmcus = ispmcus;
		this.carrierName = carrierName;
		this.ownnerCompNo = ownnerCompNo;
		this.ownnerCompName = ownnerCompName;
		this.openedBank = openedBank;
		this.bankAcct = bankAcct;
		this.invCustNo = invCustNo;
		this.invCustName = invCustName;
		this.transport = transport;
		this.isacccom = isacccom;
		this.vendorNo = vendorNo;
		this.vendorName = vendorName;
		this.dsNo = dsNo;
		this.dsName = dsName;
		this.telphone = telphone;
		this.telphone2 = telphone2;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.compAdderss = compAdderss;
		this.compName = compName;
		this.compNo = compNo;
		this.compSname = compSname;
		this.legalperson = legalperson;
		this.zcode = zcode;
	}

	public void setIh02Id(String ih02Id) {
		this.ih02Id = ih02Id;
	}

	@Id
	@Column(name = "IH02_ID_", length = 50, nullable = false)
	public String getIh02Id() {
		return ih02Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 20, unique = true)
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

	public void setCustSname(String custSname) {
		this.custSname = custSname;
	}

	@Column(name = "CUST_SNAME_", length = 50)
	public String getCustSname() {
		return custSname;
	}

	public void setCustAttr(String custAttr) {
		this.custAttr = custAttr;
	}

	@Column(name = "CUST_ATTR_", length = 10)
	public String getCustAttr() {
		return custAttr;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	@Column(name = "SEARCH_NAME_", length = 10)
	public String getSearchName() {
		return searchName;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	@Column(name = "CARRIER_NO_", length = 20)
	public String getCarrierNo() {
		return carrierNo;
	}

	public void setLawMan(String lawMan) {
		this.lawMan = lawMan;
	}

	@Column(name = "LAW_MAN_", length = 50)
	public String getLawMan() {
		return lawMan;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	@Column(name = "TAX_NO_", length = 20)
	public String getTaxNo() {
		return taxNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	@Column(name = "POST_NO_", length = 10)
	public String getPostNo() {
		return postNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "ADDRESS_", length = 200)
	public String getAddress() {
		return address;
	}

	public void setBalancenum(BigDecimal balancenum) {
		this.balancenum = balancenum;
	}

	@Column(name = "BALANCENUM_")
	public BigDecimal getBalancenum() {
		return balancenum;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 50)
	public String getArea() {
		return area;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Column(name = "IDENTITY_", length = 20)
	public String getIdentity() {
		return identity;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	@Column(name = "CUST_TYPE_", length = 20)
	public String getCustType() {
		return custType;
	}

	public void setIscusfous(String iscusfous) {
		this.iscusfous = iscusfous;
	}

	@Column(name = "ISCUSFOUS_", length = 5)
	public String getIscusfous() {
		return iscusfous;
	}

	public void setCreadit(String creadit) {
		this.creadit = creadit;
	}

	@Column(name = "CREADIT_", length = 20)
	public String getCreadit() {
		return creadit;
	}

	public void setIspmcus(String ispmcus) {
		this.ispmcus = ispmcus;
	}

	@Column(name = "ISPMCUS_", length = 5)
	public String getIspmcus() {
		return ispmcus;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	@Column(name = "CARRIER_NAME_", length = 200)
	public String getCarrierName() {
		return carrierName;
	}

	public void setOwnnerCompNo(String ownnerCompNo) {
		this.ownnerCompNo = ownnerCompNo;
	}

	@Column(name = "OWNNER_COMP_NO_", length = 20)
	public String getOwnnerCompNo() {
		return ownnerCompNo;
	}

	public void setOwnnerCompName(String ownnerCompName) {
		this.ownnerCompName = ownnerCompName;
	}

	@Column(name = "OWNNER_COMP_NAME_", length = 200)
	public String getOwnnerCompName() {
		return ownnerCompName;
	}

	public void setOpenedBank(String openedBank) {
		this.openedBank = openedBank;
	}

	@Column(name = "OPENED_BANK_", length = 100)
	public String getOpenedBank() {
		return openedBank;
	}

	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}

	@Column(name = "BANK_ACCT_", length = 202)
	public String getBankAcct() {
		return bankAcct;
	}

	public void setInvCustNo(String invCustNo) {
		this.invCustNo = invCustNo;
	}

	@Column(name = "INV_CUST_NO_", length = 20)
	public String getInvCustNo() {
		return invCustNo;
	}

	public void setInvCustName(String invCustName) {
		this.invCustName = invCustName;
	}

	@Column(name = "INV_CUST_NAME_", length = 200)
	public String getInvCustName() {
		return invCustName;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	@Column(name = "TRANSPORT_", length = 30)
	public String getTransport() {
		return transport;
	}

	public void setIsacccom(String isacccom) {
		this.isacccom = isacccom;
	}

	@Column(name = "ISACCCOM_", length = 5)
	public String getIsacccom() {
		return isacccom;
	}

	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}

	@Column(name = "VENDOR_NO_", length = 20)
	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Column(name = "VENDOR_NAME_", length = 200)
	public String getVendorName() {
		return vendorName;
	}

	public void setDsNo(String dsNo) {
		this.dsNo = dsNo;
	}

	@Column(name = "DS_NO_", length = 20)
	public String getDsNo() {
		return dsNo;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	@Column(name = "DS_NAME_", length = 200)
	public String getDsName() {
		return dsName;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	@Column(name = "TELPHONE_", length = 50)
	public String getTelphone() {
		return telphone;
	}

	public void setTelphone2(String telphone2) {
		this.telphone2 = telphone2;
	}

	@Column(name = "TELPHONE2_", length = 20)
	public String getTelphone2() {
		return telphone2;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
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

	public void setCompAdderss(String compAdderss) {
		this.compAdderss = compAdderss;
	}

	@Column(name = "COMP_ADDERSS_", length = 100)
	public String getCompAdderss() {
		return compAdderss;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	@Column(name = "COMP_NAME_", length = 200, unique = true)
	public String getCompName() {
		return compName;
	}

	public void setCompNo(String compNo) {
		this.compNo = compNo;
	}

	@Column(name = "COMP_NO_", length = 20, unique = true)
	public String getCompNo() {
		return compNo;
	}

	public void setCompSname(String compSname) {
		this.compSname = compSname;
	}

	@Column(name = "COMP_SNAME_", length = 200)
	public String getCompSname() {
		return compSname;
	}

	public void setLegalperson(String legalperson) {
		this.legalperson = legalperson;
	}

	@Column(name = "LEGALPERSON_", length = 50)
	public String getLegalperson() {
		return legalperson;
	}

	public void setZcode(String zcode) {
		this.zcode = zcode;
	}

	@Column(name = "ZCODE_", length = 10)
	public String getZcode() {
		return zcode;
	}

	public String toString() {
		return "Tbih02 [ih02Id=" + ih02Id + ",compId=" + compId + ",custNo="
				+ custNo + ",custName=" + custName + ",custSname=" + custSname
				+ ",custAttr=" + custAttr + ",searchName=" + searchName
				+ ",carrierNo=" + carrierNo + ",lawMan=" + lawMan + ",taxNo="
				+ taxNo + ",postNo=" + postNo + ",address=" + address
				+ ",balancenum=" + balancenum + ",area=" + area + ",identity="
				+ identity + ",custType=" + custType + ",iscusfous="
				+ iscusfous + ",creadit=" + creadit + ",ispmcus=" + ispmcus
				+ ",carrierName=" + carrierName + ",ownnerCompNo="
				+ ownnerCompNo + ",ownnerCompName=" + ownnerCompName
				+ ",openedBank=" + openedBank + ",bankAcct=" + bankAcct
				+ ",invCustNo=" + invCustNo + ",invCustName=" + invCustName
				+ ",transport=" + transport + ",isacccom=" + isacccom
				+ ",vendorNo=" + vendorNo + ",vendorName=" + vendorName
				+ ",dsNo=" + dsNo + ",dsName=" + dsName + ",telphone="
				+ telphone + ",telphone2=" + telphone2 + ",status=" + status
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + ",compAdderss=" + compAdderss
				+ ",compName=" + compName + ",compNo=" + compNo + ",compSname="
				+ compSname + ",legalperson=" + legalperson + ",zcode=" + zcode
				+ "]";
	}

}

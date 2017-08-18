package com.jghz.dc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdcd1:客户基础资料表
 */
@Entity
@Table(name = "tbdcd1")
public class Tbdcd1 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String dcd1Id;

	/**
	 * 公司编号:公司编号
	 */
	@PropertyDef(label = "公司编号", description = "公司编号:公司编号")
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
	 * 客户地址:客户地址
	 */
	@PropertyDef(label = "客户地址", description = "客户地址:客户地址")
	private String address;

	/**
	 * 法人代表:法人代表
	 */
	@PropertyDef(label = "法人代表", description = "法人代表:法人代表")
	private String lawMan;

	/**
	 * 邮政编码:邮政编码
	 */
	@PropertyDef(label = "邮政编码", description = "邮政编码:邮政编码")
	private String postNo;

	/**
	 * 国家:国家
	 */
	@PropertyDef(label = "国家", description = "国家:国家")
	private String country;

	/**
	 * 省份:省份
	 */
	@PropertyDef(label = "省份", description = "省份:省份")
	private String province;

	/**
	 * 地区:地区
	 */
	@PropertyDef(label = "地区", description = "地区:地区")
	private String area;

	/**
	 * 企业税号:企业税号
	 */
	@PropertyDef(label = "企业税号", description = "企业税号:企业税号")
	private String taxNo;

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
	 * 联系电话:联系电话
	 */
	@PropertyDef(label = "联系电话", description = "联系电话:联系电话")
	private String telNum;

	/**
	 * 联系电话2:联系电话2
	 */
	@PropertyDef(label = "联系电话2", description = "联系电话2:联系电话2")
	private String telNum2;

	/**
	 * 状态(0=停用1=启用):状态(0=停用1=启用)
	 */
	@PropertyDef(label = "状态(0=停用1=启用)", description = "状态(0=停用1=启用):状态(0=停用1=启用)")
	private String status;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String memo;

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
	 * 修改人员:修改人员
	 */
	@PropertyDef(label = "修改人员", description = "修改人员:修改人员")
	private String updateEmp;

	/**
	 * 修改时间:修改时间
	 */
	@PropertyDef(label = "修改时间", description = "修改时间:修改时间")
	private Date updateTime;

	/**
	 * 删除标记:删除标记
	 */
	@PropertyDef(label = "删除标记", description = "删除标记:删除标记")
	private String deleteFlag;

	/**
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;

	public Tbdcd1() {
		super();
	}

	public Tbdcd1(String dcd1Id, String compId, String custNo, String custName,
			String custSname, String custAttr, String searchName,
			String address, String lawMan, String postNo, String country,
			String province, String area, String taxNo, String openedBank,
			String bankAcct, String invCustNo, String invCustName,
			String telNum, String telNum2, String status, String memo,
			String createEmp, Date createTime, String updateEmp,
			Date updateTime, String deleteFlag, int version) {
		super();
		this.dcd1Id = dcd1Id;
		this.compId = compId;
		this.custNo = custNo;
		this.custName = custName;
		this.custSname = custSname;
		this.custAttr = custAttr;
		this.searchName = searchName;
		this.address = address;
		this.lawMan = lawMan;
		this.postNo = postNo;
		this.country = country;
		this.province = province;
		this.area = area;
		this.taxNo = taxNo;
		this.openedBank = openedBank;
		this.bankAcct = bankAcct;
		this.invCustNo = invCustNo;
		this.invCustName = invCustName;
		this.telNum = telNum;
		this.telNum2 = telNum2;
		this.status = status;
		this.memo = memo;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	public void setDcd1Id(String dcd1Id) {
		this.dcd1Id = dcd1Id;
	}

	@Id
	@Column(name = "DCD1_ID_", length = 50, nullable = false)
	public String getDcd1Id() {
		return dcd1Id;
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

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "ADDRESS_", length = 200)
	public String getAddress() {
		return address;
	}

	public void setLawMan(String lawMan) {
		this.lawMan = lawMan;
	}

	@Column(name = "LAW_MAN_", length = 20)
	public String getLawMan() {
		return lawMan;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	@Column(name = "POST_NO_", length = 10)
	public String getPostNo() {
		return postNo;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "COUNTRY_", length = 20)
	public String getCountry() {
		return country;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "PROVINCE_", length = 50)
	public String getProvince() {
		return province;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 50)
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

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Column(name = "TEL_NUM_", length = 20)
	public String getTelNum() {
		return telNum;
	}

	public void setTelNum2(String telNum2) {
		this.telNum2 = telNum2;
	}

	@Column(name = "TEL_NUM2_", length = 20)
	public String getTelNum2() {
		return telNum2;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 4)
	public String getStatus() {
		return status;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 200)
	public String getMemo() {
		return memo;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 20)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_")
	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 20)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME_")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Column(name = "DELETE_FLAG_", length = 10)
	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbdcd1 [dcd1Id=" + dcd1Id + ",compId=" + compId + ",custNo="
				+ custNo + ",custName=" + custName + ",custSname=" + custSname
				+ ",custAttr=" + custAttr + ",searchName=" + searchName
				+ ",address=" + address + ",lawMan=" + lawMan + ",postNo="
				+ postNo + ",country=" + country + ",province=" + province
				+ ",area=" + area + ",taxNo=" + taxNo + ",openedBank="
				+ openedBank + ",bankAcct=" + bankAcct + ",invCustNo="
				+ invCustNo + ",invCustName=" + invCustName + ",telNum="
				+ telNum + ",telNum2=" + telNum2 + ",status=" + status
				+ ",memo=" + memo + ",createEmp=" + createEmp + ",createTime="
				+ createTime + ",updateEmp=" + updateEmp + ",updateTime="
				+ updateTime + ",deleteFlag=" + deleteFlag + ",version="
				+ version + "]";
	}

}

package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih04:
 */
@Entity
@Table(name = "tbih04")
public class Tbih04 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String ih04Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 经销商:经销商
	 */
	@PropertyDef(label = "经销商", description = "经销商:经销商")
	private String custNo;

	/**
	 * 收货单位编号:收货单位编号
	 */
	@PropertyDef(label = "收货单位编号", description = "收货单位编号:收货单位编号")
	private String receiptCompNo;

	/**
	 * 收货单位名称:收货单位名称
	 */
	@PropertyDef(label = "收货单位名称", description = "收货单位名称:收货单位名称")
	private String receiptCompName;

	/**
	 * 收货人:收货人
	 */
	@PropertyDef(label = "收货人", description = "收货人:收货人")
	private String receiptEmp;

	/**
	 * 抵税人:抵税人
	 */
	@PropertyDef(label = "抵税人", description = "抵税人:抵税人")
	private String offsetMan;

	/**
	 * 税号:税号
	 */
	@PropertyDef(label = "税号", description = "税号:税号")
	private String impostNo;

	/**
	 * 类别:类别
	 */
	@PropertyDef(label = "类别", description = "类别:类别")
	private String lb;

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

	public Tbih04() {
		super();
	}

	public Tbih04(String ih04Id, String compId, String custNo,
			String receiptCompNo, String receiptCompName, String receiptEmp,
			String offsetMan, String impostNo, String lb, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih04Id = ih04Id;
		this.compId = compId;
		this.custNo = custNo;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.receiptEmp = receiptEmp;
		this.offsetMan = offsetMan;
		this.impostNo = impostNo;
		this.lb = lb;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh04Id(String ih04Id) {
		this.ih04Id = ih04Id;
	}

	@Id
	@Column(name = "IH04_ID_", length = 50, nullable = false)
	public String getIh04Id() {
		return ih04Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 10)
	public String getCustNo() {
		return custNo;
	}

	public void setReceiptCompNo(String receiptCompNo) {
		this.receiptCompNo = receiptCompNo;
	}

	@Column(name = "RECEIPT_COMP_NO_", length = 10)
	public String getReceiptCompNo() {
		return receiptCompNo;
	}

	public void setReceiptCompName(String receiptCompName) {
		this.receiptCompName = receiptCompName;
	}

	@Column(name = "RECEIPT_COMP_NAME_", length = 10)
	public String getReceiptCompName() {
		return receiptCompName;
	}

	public void setReceiptEmp(String receiptEmp) {
		this.receiptEmp = receiptEmp;
	}

	@Column(name = "RECEIPT_EMP_", length = 10)
	public String getReceiptEmp() {
		return receiptEmp;
	}

	public void setOffsetMan(String offsetMan) {
		this.offsetMan = offsetMan;
	}

	@Column(name = "OFFSET_MAN_", length = 10)
	public String getOffsetMan() {
		return offsetMan;
	}

	public void setImpostNo(String impostNo) {
		this.impostNo = impostNo;
	}

	@Column(name = "IMPOST_NO_", length = 10)
	public String getImpostNo() {
		return impostNo;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 10)
	public String getLb() {
		return lb;
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
		return "Tbih04 [ih04Id=" + ih04Id + ",compId=" + compId + ",custNo="
				+ custNo + ",receiptCompNo=" + receiptCompNo
				+ ",receiptCompName=" + receiptCompName + ",receiptEmp="
				+ receiptEmp + ",offsetMan=" + offsetMan + ",impostNo="
				+ impostNo + ",lb=" + lb + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

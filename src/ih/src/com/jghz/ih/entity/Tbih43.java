package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih43:TBIH43(发票维护表)
 */
@Entity
@Table(name = "tbih43")
public class Tbih43 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih43Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 开票单位编码:开票单位编码
	 */
	@PropertyDef(label = "开票单位编码", description = "开票单位编码:开票单位编码")
	private String billCompNo;

	/**
	 * 开票单位:开票单位
	 */
	@PropertyDef(label = "开票单位", description = "开票单位:开票单位")
	private String billCompName;

	/**
	 * 收票单位编码:收票单位编码
	 */
	@PropertyDef(label = "收票单位编码", description = "收票单位编码:收票单位编码")
	private String getCompNo;

	/**
	 * 收票单位名称:收票单位名称
	 */
	@PropertyDef(label = "收票单位名称", description = "收票单位名称:收票单位名称")
	private String getCompName;

	/**
	 * 开票编号:开票编号
	 */
	@PropertyDef(label = "开票编号", description = "开票编号:开票编号")
	private String billNo;

	/**
	 * 开票日期:开票日期
	 */
	@PropertyDef(label = "开票日期", description = "开票日期:开票日期")
	private String billDate;

	/**
	 * 收票日期:收票日期
	 */
	@PropertyDef(label = "收票日期", description = "收票日期:收票日期")
	private String getDate;

	/**
	 * 开票金额:开票金额
	 */
	@PropertyDef(label = "开票金额", description = "开票金额:开票金额")
	private BigDecimal amt;

	/**
	 * 不含税金额:不含税金额
	 */
	@PropertyDef(label = "不含税金额", description = "不含税金额:不含税金额")
	private BigDecimal noTaxAmt;

	/**
	 * 税额:税额
	 */
	@PropertyDef(label = "税额", description = "税额:税额")
	private BigDecimal taxAmt;

	/**
	 * 税率:税率
	 */
	@PropertyDef(label = "税率", description = "税率:税率")
	private BigDecimal tax;

	/**
	 * 扣款金额:扣款金额
	 */
	@PropertyDef(label = "扣款金额", description = "扣款金额:扣款金额")
	private BigDecimal discontAmt;

	/**
	 * 特殊金额:特殊金额
	 */
	@PropertyDef(label = "特殊金额", description = "特殊金额:特殊金额")
	private BigDecimal orderAmt;

	/**
	 * 延付金额:延付金额
	 */
	@PropertyDef(label = "延付金额", description = "延付金额:延付金额")
	private BigDecimal delayAmt;

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

	public Tbih43() {
		super();
	}

	public Tbih43(String ih43Id, String compId, String billCompNo,
			String billCompName, String getCompNo, String getCompName,
			String billNo, String billDate, String getDate, BigDecimal amt,
			BigDecimal noTaxAmt, BigDecimal taxAmt, BigDecimal tax,
			BigDecimal discontAmt, BigDecimal orderAmt, BigDecimal delayAmt,
			String by1, String by2, String by3, String by4, String by5,
			String by6, String by7, BigDecimal by8, BigDecimal by9,
			BigDecimal by10, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih43Id = ih43Id;
		this.compId = compId;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.getCompNo = getCompNo;
		this.getCompName = getCompName;
		this.billNo = billNo;
		this.billDate = billDate;
		this.getDate = getDate;
		this.amt = amt;
		this.noTaxAmt = noTaxAmt;
		this.taxAmt = taxAmt;
		this.tax = tax;
		this.discontAmt = discontAmt;
		this.orderAmt = orderAmt;
		this.delayAmt = delayAmt;
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

	public void setIh43Id(String ih43Id) {
		this.ih43Id = ih43Id;
	}

	@Id
	@Column(name = "IH43_ID_", length = 50, nullable = false)
	public String getIh43Id() {
		return ih43Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setBillCompNo(String billCompNo) {
		this.billCompNo = billCompNo;
	}

	@Column(name = "BILL_COMP_NO_", length = 20)
	public String getBillCompNo() {
		return billCompNo;
	}

	public void setBillCompName(String billCompName) {
		this.billCompName = billCompName;
	}

	@Column(name = "BILL_COMP_NAME_", length = 200)
	public String getBillCompName() {
		return billCompName;
	}

	public void setGetCompNo(String getCompNo) {
		this.getCompNo = getCompNo;
	}

	@Column(name = "GET_COMP_NO_", length = 20)
	public String getGetCompNo() {
		return getCompNo;
	}

	public void setGetCompName(String getCompName) {
		this.getCompName = getCompName;
	}

	@Column(name = "GET_COMP_NAME_", length = 200)
	public String getGetCompName() {
		return getCompName;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILL_NO_", length = 20)
	public String getBillNo() {
		return billNo;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	@Column(name = "BILL_DATE_", length = 20)
	public String getBillDate() {
		return billDate;
	}

	public void setGetDate(String getDate) {
		this.getDate = getDate;
	}

	@Column(name = "GET_DATE_", length = 20)
	public String getGetDate() {
		return getDate;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	@Column(name = "AMT_")
	public BigDecimal getAmt() {
		return amt;
	}

	public void setNoTaxAmt(BigDecimal noTaxAmt) {
		this.noTaxAmt = noTaxAmt;
	}

	@Column(name = "NO_TAX_AMT_")
	public BigDecimal getNoTaxAmt() {
		return noTaxAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Column(name = "TAX_AMT_")
	public BigDecimal getTaxAmt() {
		return taxAmt;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	@Column(name = "TAX_")
	public BigDecimal getTax() {
		return tax;
	}

	public void setDiscontAmt(BigDecimal discontAmt) {
		this.discontAmt = discontAmt;
	}

	@Column(name = "DISCONT_AMT_")
	public BigDecimal getDiscontAmt() {
		return discontAmt;
	}

	public void setOrderAmt(BigDecimal orderAmt) {
		this.orderAmt = orderAmt;
	}

	@Column(name = "ORDER_AMT_")
	public BigDecimal getOrderAmt() {
		return orderAmt;
	}

	public void setDelayAmt(BigDecimal delayAmt) {
		this.delayAmt = delayAmt;
	}

	@Column(name = "DELAY_AMT_")
	public BigDecimal getDelayAmt() {
		return delayAmt;
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
		return "Tbih43 [ih43Id=" + ih43Id + ",compId=" + compId
				+ ",billCompNo=" + billCompNo + ",billCompName=" + billCompName
				+ ",getCompNo=" + getCompNo + ",getCompName=" + getCompName
				+ ",billNo=" + billNo + ",billDate=" + billDate + ",getDate="
				+ getDate + ",amt=" + amt + ",noTaxAmt=" + noTaxAmt
				+ ",taxAmt=" + taxAmt + ",tax=" + tax + ",discontAmt="
				+ discontAmt + ",orderAmt=" + orderAmt + ",delayAmt="
				+ delayAmt + ",by1=" + by1 + ",by2=" + by2 + ",by3=" + by3
				+ ",by4=" + by4 + ",by5=" + by5 + ",by6=" + by6 + ",by7=" + by7
				+ ",by8=" + by8 + ",by9=" + by9 + ",by10=" + by10
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

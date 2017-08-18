package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh32:
 */
@Entity
@Table(name = "tbsh32")
public class Tbsh32 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh32Id;

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
	 * 结算单ID:结算单ID
	 */
	@PropertyDef(label = "结算单ID", description = "结算单ID:结算单ID")
	private String settleNo;

	/**
	 * 结算年月:结算年月
	 */
	@PropertyDef(label = "结算年月", description = "结算年月:结算年月")
	private String yearMonth;

	/**
	 * 结算日期:结算日期
	 */
	@PropertyDef(label = "结算日期", description = "结算日期:结算日期")
	private String settleDay;

	/**
	 * 客户编号:客户编号
	 */
	@PropertyDef(label = "客户编号", description = "客户编号:客户编号")
	private String custNo;

	/**
	 * 客户名称:客户名称
	 */
	@PropertyDef(label = "客户名称", description = "客户名称:客户名称")
	private String custName;

	/**
	 * 货主单位编码:货主单位编码
	 */
	@PropertyDef(label = "货主单位编码", description = "货主单位编码:货主单位编码")
	private String ownerCompNo;

	/**
	 * 货主单位:货主单位
	 */
	@PropertyDef(label = "货主单位", description = "货主单位:货主单位")
	private String ownerCompName;

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
	 * 付款公司编码:付款公司编码
	 */
	@PropertyDef(label = "付款公司编码", description = "付款公司编码:付款公司编码")
	private String payCompNo;

	/**
	 * 付款公司名称:付款公司名称
	 */
	@PropertyDef(label = "付款公司名称", description = "付款公司名称:付款公司名称")
	private String payCompName;

	/**
	 * 发货人编号:发货人编号
	 */
	@PropertyDef(label = "发货人编号", description = "发货人编号:发货人编号")
	private String despatchNo;

	/**
	 * 发货人姓名:发货人姓名
	 */
	@PropertyDef(label = "发货人姓名", description = "发货人姓名:发货人姓名")
	private String despatchName;

	/**
	 * 总件数:总件数
	 */
	@PropertyDef(label = "总件数", description = "总件数:总件数")
	private BigDecimal settleNumTotal;

	/**
	 * 总重量:总重量
	 */
	@PropertyDef(label = "总重量", description = "总重量:总重量")
	private BigDecimal settleWgtTotal;

	/**
	 * 总费用:总费用
	 */
	@PropertyDef(label = "总费用", description = "总费用:总费用")
	private BigDecimal settleAmtTotal;

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
	 * 是否月结:是否月结
	 */
	@PropertyDef(label = "是否月结", description = "是否月结:是否月结")
	private String ismonth;

	/**
	 * 审核标志:审核标志
	 */
	@PropertyDef(label = "审核标志", description = "审核标志:审核标志")
	private String isConfirm;

	/**
	 * 审核人:审核人
	 */
	@PropertyDef(label = "审核人", description = "审核人:审核人")
	private String confirmEmp;

	/**
	 * 审核时间:审核时间
	 */
	@PropertyDef(label = "审核时间", description = "审核时间:审核时间")
	private String confirmTime;

	/**
	 * 是否开票:是否开票
	 */
	@PropertyDef(label = "是否开票", description = "是否开票:是否开票")
	private String isBill;

	/**
	 * 收票人:收票人
	 */
	@PropertyDef(label = "收票人", description = "收票人:收票人")
	private String billReiceiver;

	/**
	 * 收票时间:收票时间
	 */
	@PropertyDef(label = "收票时间", description = "收票时间:收票时间")
	private String billReiceiverTime;

	/**
	 * 发票号:发票号
	 */
	@PropertyDef(label = "发票号", description = "发票号:发票号")
	private String billNo;

	/**
	 * 开票重量:开票重量
	 */
	@PropertyDef(label = "开票重量", description = "开票重量:开票重量")
	private BigDecimal billWgt;

	/**
	 * 是否付款:是否付款
	 */
	@PropertyDef(label = "是否付款", description = "是否付款:是否付款")
	private String isPay;

	/**
	 * 付款人:付款人
	 */
	@PropertyDef(label = "付款人", description = "付款人:付款人")
	private String payer;

	/**
	 * 付款时间:付款时间
	 */
	@PropertyDef(label = "付款时间", description = "付款时间:付款时间")
	private String payTime;

	/**
	 * 付款单号:付款单号
	 */
	@PropertyDef(label = "付款单号", description = "付款单号:付款单号")
	private String payNo;

	/**
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String tranNo;

	/**
	 * 协议号:协议号
	 */
	@PropertyDef(label = "协议号", description = "协议号:协议号")
	private String contNo;

	/**
	 * 折扣:折扣
	 */
	@PropertyDef(label = "折扣", description = "折扣:折扣")
	private BigDecimal discount;

	/**
	 * 税率:税率
	 */
	@PropertyDef(label = "税率", description = "税率:税率")
	private BigDecimal tax;

	/**
	 * 价税合计:价税合计
	 */
	@PropertyDef(label = "价税合计", description = "价税合计:价税合计")
	private BigDecimal taxSum;

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

	public Tbsh32() {
		super();
	}

	public Tbsh32(String sh32Id, String compId, String compCode,
			String settleNo, String yearMonth, String settleDay, String custNo,
			String custName, String ownerCompNo, String ownerCompName,
			String billCompNo, String billCompName, String payCompNo,
			String payCompName, String despatchNo, String despatchName,
			BigDecimal settleNumTotal, BigDecimal settleWgtTotal,
			BigDecimal settleAmtTotal, String taxNo, String openedBank,
			String bankAcct, String ismonth, String isConfirm,
			String confirmEmp, String confirmTime, String isBill,
			String billReiceiver, String billReiceiverTime, String billNo,
			BigDecimal billWgt, String isPay, String payer, String payTime,
			String payNo, String tranNo, String contNo, BigDecimal discount,
			BigDecimal tax, BigDecimal taxSum, String status, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.sh32Id = sh32Id;
		this.compId = compId;
		this.compCode = compCode;
		this.settleNo = settleNo;
		this.yearMonth = yearMonth;
		this.settleDay = settleDay;
		this.custNo = custNo;
		this.custName = custName;
		this.ownerCompNo = ownerCompNo;
		this.ownerCompName = ownerCompName;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.payCompNo = payCompNo;
		this.payCompName = payCompName;
		this.despatchNo = despatchNo;
		this.despatchName = despatchName;
		this.settleNumTotal = settleNumTotal;
		this.settleWgtTotal = settleWgtTotal;
		this.settleAmtTotal = settleAmtTotal;
		this.taxNo = taxNo;
		this.openedBank = openedBank;
		this.bankAcct = bankAcct;
		this.ismonth = ismonth;
		this.isConfirm = isConfirm;
		this.confirmEmp = confirmEmp;
		this.confirmTime = confirmTime;
		this.isBill = isBill;
		this.billReiceiver = billReiceiver;
		this.billReiceiverTime = billReiceiverTime;
		this.billNo = billNo;
		this.billWgt = billWgt;
		this.isPay = isPay;
		this.payer = payer;
		this.payTime = payTime;
		this.payNo = payNo;
		this.tranNo = tranNo;
		this.contNo = contNo;
		this.discount = discount;
		this.tax = tax;
		this.taxSum = taxSum;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh32Id(String sh32Id) {
		this.sh32Id = sh32Id;
	}

	@Id
	@Column(name = "SH32_ID_", length = 50, nullable = false)
	public String getSh32Id() {
		return sh32Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 20)
	public String getCompId() {
		return compId;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	@Column(name = "COMP_CODE_", length = 20)
	public String getCompCode() {
		return compCode;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
	}

	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	@Column(name = "YEAR_MONTH_", length = 20)
	public String getYearMonth() {
		return yearMonth;
	}

	public void setSettleDay(String settleDay) {
		this.settleDay = settleDay;
	}

	@Column(name = "SETTLE_DAY_", length = 20)
	public String getSettleDay() {
		return settleDay;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 10)
	public String getCustNo() {
		return custNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CUST_NAME_", length = 50)
	public String getCustName() {
		return custName;
	}

	public void setOwnerCompNo(String ownerCompNo) {
		this.ownerCompNo = ownerCompNo;
	}

	@Column(name = "OWNER_COMP_NO_", length = 50)
	public String getOwnerCompNo() {
		return ownerCompNo;
	}

	public void setOwnerCompName(String ownerCompName) {
		this.ownerCompName = ownerCompName;
	}

	@Column(name = "OWNER_COMP_NAME_", length = 200)
	public String getOwnerCompName() {
		return ownerCompName;
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

	@Column(name = "BILL_COMP_NAME_", length = 20)
	public String getBillCompName() {
		return billCompName;
	}

	public void setPayCompNo(String payCompNo) {
		this.payCompNo = payCompNo;
	}

	@Column(name = "PAY_COMP_NO_", length = 50)
	public String getPayCompNo() {
		return payCompNo;
	}

	public void setPayCompName(String payCompName) {
		this.payCompName = payCompName;
	}

	@Column(name = "PAY_COMP_NAME_", length = 50)
	public String getPayCompName() {
		return payCompName;
	}

	public void setDespatchNo(String despatchNo) {
		this.despatchNo = despatchNo;
	}

	@Column(name = "DESPATCH_NO_", length = 50)
	public String getDespatchNo() {
		return despatchNo;
	}

	public void setDespatchName(String despatchName) {
		this.despatchName = despatchName;
	}

	@Column(name = "DESPATCH_NAME_", length = 200)
	public String getDespatchName() {
		return despatchName;
	}

	public void setSettleNumTotal(BigDecimal settleNumTotal) {
		this.settleNumTotal = settleNumTotal;
	}

	@Column(name = "SETTLE_NUM_TOTAL_")
	public BigDecimal getSettleNumTotal() {
		return settleNumTotal;
	}

	public void setSettleWgtTotal(BigDecimal settleWgtTotal) {
		this.settleWgtTotal = settleWgtTotal;
	}

	@Column(name = "SETTLE_WGT_TOTAL_")
	public BigDecimal getSettleWgtTotal() {
		return settleWgtTotal;
	}

	public void setSettleAmtTotal(BigDecimal settleAmtTotal) {
		this.settleAmtTotal = settleAmtTotal;
	}

	@Column(name = "SETTLE_AMT_TOTAL_")
	public BigDecimal getSettleAmtTotal() {
		return settleAmtTotal;
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

	public void setIsmonth(String ismonth) {
		this.ismonth = ismonth;
	}

	@Column(name = "ISMONTH_", length = 10)
	public String getIsmonth() {
		return ismonth;
	}

	public void setIsConfirm(String isConfirm) {
		this.isConfirm = isConfirm;
	}

	@Column(name = "IS_CONFIRM_", length = 10)
	public String getIsConfirm() {
		return isConfirm;
	}

	public void setConfirmEmp(String confirmEmp) {
		this.confirmEmp = confirmEmp;
	}

	@Column(name = "CONFIRM_EMP_", length = 20)
	public String getConfirmEmp() {
		return confirmEmp;
	}

	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	@Column(name = "CONFIRM_TIME_", length = 50)
	public String getConfirmTime() {
		return confirmTime;
	}

	public void setIsBill(String isBill) {
		this.isBill = isBill;
	}

	@Column(name = "IS_BILL_", length = 10)
	public String getIsBill() {
		return isBill;
	}

	public void setBillReiceiver(String billReiceiver) {
		this.billReiceiver = billReiceiver;
	}

	@Column(name = "BILL_REICEIVER_", length = 20)
	public String getBillReiceiver() {
		return billReiceiver;
	}

	public void setBillReiceiverTime(String billReiceiverTime) {
		this.billReiceiverTime = billReiceiverTime;
	}

	@Column(name = "BILL_REICEIVER_TIME_", length = 50)
	public String getBillReiceiverTime() {
		return billReiceiverTime;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILL_NO_", length = 200)
	public String getBillNo() {
		return billNo;
	}

	public void setBillWgt(BigDecimal billWgt) {
		this.billWgt = billWgt;
	}

	@Column(name = "BILL_WGT_")
	public BigDecimal getBillWgt() {
		return billWgt;
	}

	public void setIsPay(String isPay) {
		this.isPay = isPay;
	}

	@Column(name = "IS_PAY_", length = 10)
	public String getIsPay() {
		return isPay;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	@Column(name = "PAYER_", length = 20)
	public String getPayer() {
		return payer;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	@Column(name = "PAY_TIME_", length = 50)
	public String getPayTime() {
		return payTime;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	@Column(name = "PAY_NO_", length = 50)
	public String getPayNo() {
		return payNo;
	}

	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}

	@Column(name = "TRAN_NO_", length = 20)
	public String getTranNo() {
		return tranNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Column(name = "DISCOUNT_")
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	@Column(name = "TAX_")
	public BigDecimal getTax() {
		return tax;
	}

	public void setTaxSum(BigDecimal taxSum) {
		this.taxSum = taxSum;
	}

	@Column(name = "TAX_SUM_")
	public BigDecimal getTaxSum() {
		return taxSum;
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
		return "Tbsh32 [sh32Id=" + sh32Id + ",compId=" + compId + ",compCode="
				+ compCode + ",settleNo=" + settleNo + ",yearMonth="
				+ yearMonth + ",settleDay=" + settleDay + ",custNo=" + custNo
				+ ",custName=" + custName + ",ownerCompNo=" + ownerCompNo
				+ ",ownerCompName=" + ownerCompName + ",billCompNo="
				+ billCompNo + ",billCompName=" + billCompName + ",payCompNo="
				+ payCompNo + ",payCompName=" + payCompName + ",despatchNo="
				+ despatchNo + ",despatchName=" + despatchName
				+ ",settleNumTotal=" + settleNumTotal + ",settleWgtTotal="
				+ settleWgtTotal + ",settleAmtTotal=" + settleAmtTotal
				+ ",taxNo=" + taxNo + ",openedBank=" + openedBank
				+ ",bankAcct=" + bankAcct + ",ismonth=" + ismonth
				+ ",isConfirm=" + isConfirm + ",confirmEmp=" + confirmEmp
				+ ",confirmTime=" + confirmTime + ",isBill=" + isBill
				+ ",billReiceiver=" + billReiceiver + ",billReiceiverTime="
				+ billReiceiverTime + ",billNo=" + billNo + ",billWgt="
				+ billWgt + ",isPay=" + isPay + ",payer=" + payer + ",payTime="
				+ payTime + ",payNo=" + payNo + ",tranNo=" + tranNo
				+ ",contNo=" + contNo + ",discount=" + discount + ",tax=" + tax
				+ ",taxSum=" + taxSum + ",status=" + status + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + "]";
	}

}

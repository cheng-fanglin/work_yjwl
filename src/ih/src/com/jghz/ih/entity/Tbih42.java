package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih42:TBIH42(应收表)
 */
@Entity
@Table(name = "tbih42")
public class Tbih42 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih42Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 结算时间:结算时间
	 */
	@PropertyDef(label = "结算时间", description = "结算时间:结算时间")
	private String settleDate;

	/**
	 * 结算年月:结算年月
	 */
	@PropertyDef(label = "结算年月", description = "结算年月:结算年月")
	private String settleYm;

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
	 * 订货单位编号:订货单位编号
	 */
	@PropertyDef(label = "订货单位编号", description = "订货单位编号:订货单位编号")
	private String orderCompNo;

	/**
	 * 订货单位:订货单位
	 */
	@PropertyDef(label = "订货单位", description = "订货单位:订货单位")
	private String orderCompName;

	/**
	 * 开票单位编码:开票单位编码
	 */
	@PropertyDef(label = "开票单位编码", description = "开票单位编码:开票单位编码")
	private String invCustNo;

	/**
	 * 开票单位:开票单位
	 */
	@PropertyDef(label = "开票单位", description = "开票单位:开票单位")
	private String invCustName;

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
	 * 结算单ID:结算单ID
	 */
	@PropertyDef(label = "结算单ID", description = "结算单ID:结算单ID")
	private String settleNo;

	/**
	 * 开票编号:开票编号
	 */
	@PropertyDef(label = "开票编号", description = "开票编号:开票编号")
	private String billNo;

	/**
	 * 开票类型:开票类型
	 */
	@PropertyDef(label = "开票类型", description = "开票类型:开票类型")
	private String billType;

	/**
	 * 付款项目:付款项目
	 */
	@PropertyDef(label = "付款项目", description = "付款项目:付款项目")
	private String fkxm;

	/**
	 * 发货重量:发货重量
	 */
	@PropertyDef(label = "发货重量", description = "发货重量:发货重量")
	private BigDecimal wgt;

	/**
	 * 发货数量:发货数量
	 */
	@PropertyDef(label = "发货数量", description = "发货数量:发货数量")
	private BigDecimal num;

	/**
	 * 结算价:结算价
	 */
	@PropertyDef(label = "结算价", description = "结算价:结算价")
	private BigDecimal price;

	/**
	 * 金额:金额
	 */
	@PropertyDef(label = "金额", description = "金额:金额")
	private BigDecimal totalAmt;

	/**
	 * 税号:税号
	 */
	@PropertyDef(label = "税号", description = "税号:税号")
	private String taxNo;

	/**
	 * 开户行名称:开户行名称
	 */
	@PropertyDef(label = "开户行名称", description = "开户行名称:开户行名称")
	private String openedBank;

	/**
	 * 账号:账号
	 */
	@PropertyDef(label = "账号", description = "账号:账号")
	private String bankAcct;

	/**
	 * 开票单位地址:开票单位地址
	 */
	@PropertyDef(label = "开票单位地址", description = "开票单位地址:开票单位地址")
	private String adderss;

	/**
	 * 审核标志:审核标志
	 */
	@PropertyDef(label = "审核标志", description = "审核标志:审核标志")
	private String falg;

	/**
	 * 审核人:审核人
	 */
	@PropertyDef(label = "审核人", description = "审核人:审核人")
	private String checkMan;

	/**
	 * 审核日期:审核日期
	 */
	@PropertyDef(label = "审核日期", description = "审核日期:审核日期")
	private String checkDate;

	/**
	 * 是否开票:是否开票
	 */
	@PropertyDef(label = "是否开票", description = "是否开票:是否开票")
	private String isBill;

	/**
	 * 收票人:收票人
	 */
	@PropertyDef(label = "收票人", description = "收票人:收票人")
	private String spEmp;

	/**
	 * 收票日期:收票日期
	 */
	@PropertyDef(label = "收票日期", description = "收票日期:收票日期")
	private String spDate;

	/**
	 * 是否付款:是否付款
	 */
	@PropertyDef(label = "是否付款", description = "是否付款:是否付款")
	private String isfk;

	/**
	 * 结算方式:结算方式
	 */
	@PropertyDef(label = "结算方式", description = "结算方式:结算方式")
	private String settleType;

	/**
	 * 付款人:付款人
	 */
	@PropertyDef(label = "付款人", description = "付款人:付款人")
	private String payEmp;

	/**
	 * 付款日期:付款日期
	 */
	@PropertyDef(label = "付款日期", description = "付款日期:付款日期")
	private String payDate;

	/**
	 * 应收应付标志:应收应付标志
	 */
	@PropertyDef(label = "应收应付标志", description = "应收应付标志:应收应付标志")
	private String ysyf;

	/**
	 * 订单号:订单号
	 */
	@PropertyDef(label = "订单号", description = "订单号:订单号")
	private String orderNo;

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
	 * 承运部门:承运部门
	 */
	@PropertyDef(label = "承运部门", description = "承运部门:承运部门")
	private String carrierDept;

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

	public Tbih42() {
		super();
	}

	public Tbih42(String ih42Id, String compId, String settleDate,
			String settleYm, String custNo, String custName,
			String orderCompNo, String orderCompName, String invCustNo,
			String invCustName, String payCompNo, String payCompName,
			String settleNo, String billNo, String billType, String fkxm,
			BigDecimal wgt, BigDecimal num, BigDecimal price,
			BigDecimal totalAmt, String taxNo, String openedBank,
			String bankAcct, String adderss, String falg, String checkMan,
			String checkDate, String isBill, String spEmp, String spDate,
			String isfk, String settleType, String payEmp, String payDate,
			String ysyf, String orderNo, String contNo, BigDecimal discount,
			BigDecimal tax, BigDecimal taxSum, String carrierNo,
			String carrierName, String carrierDept, String by1, String by2,
			String by3, String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.ih42Id = ih42Id;
		this.compId = compId;
		this.settleDate = settleDate;
		this.settleYm = settleYm;
		this.custNo = custNo;
		this.custName = custName;
		this.orderCompNo = orderCompNo;
		this.orderCompName = orderCompName;
		this.invCustNo = invCustNo;
		this.invCustName = invCustName;
		this.payCompNo = payCompNo;
		this.payCompName = payCompName;
		this.settleNo = settleNo;
		this.billNo = billNo;
		this.billType = billType;
		this.fkxm = fkxm;
		this.wgt = wgt;
		this.num = num;
		this.price = price;
		this.totalAmt = totalAmt;
		this.taxNo = taxNo;
		this.openedBank = openedBank;
		this.bankAcct = bankAcct;
		this.adderss = adderss;
		this.falg = falg;
		this.checkMan = checkMan;
		this.checkDate = checkDate;
		this.isBill = isBill;
		this.spEmp = spEmp;
		this.spDate = spDate;
		this.isfk = isfk;
		this.settleType = settleType;
		this.payEmp = payEmp;
		this.payDate = payDate;
		this.ysyf = ysyf;
		this.orderNo = orderNo;
		this.contNo = contNo;
		this.discount = discount;
		this.tax = tax;
		this.taxSum = taxSum;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.carrierDept = carrierDept;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh42Id(String ih42Id) {
		this.ih42Id = ih42Id;
	}

	@Id
	@Column(name = "IH42_ID_", length = 50, nullable = false)
	public String getIh42Id() {
		return ih42Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	@Column(name = "SETTLE_DATE_", length = 20)
	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleYm(String settleYm) {
		this.settleYm = settleYm;
	}

	@Column(name = "SETTLE_YM_", length = 20)
	public String getSettleYm() {
		return settleYm;
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

	public void setOrderCompNo(String orderCompNo) {
		this.orderCompNo = orderCompNo;
	}

	@Column(name = "ORDER_COMP_NO_", length = 20)
	public String getOrderCompNo() {
		return orderCompNo;
	}

	public void setOrderCompName(String orderCompName) {
		this.orderCompName = orderCompName;
	}

	@Column(name = "ORDER_COMP_NAME_", length = 200)
	public String getOrderCompName() {
		return orderCompName;
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

	public void setPayCompNo(String payCompNo) {
		this.payCompNo = payCompNo;
	}

	@Column(name = "PAY_COMP_NO_", length = 20)
	public String getPayCompNo() {
		return payCompNo;
	}

	public void setPayCompName(String payCompName) {
		this.payCompName = payCompName;
	}

	@Column(name = "PAY_COMP_NAME_", length = 200)
	public String getPayCompName() {
		return payCompName;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILL_NO_", length = 20)
	public String getBillNo() {
		return billNo;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	@Column(name = "BILL_TYPE_", length = 20)
	public String getBillType() {
		return billType;
	}

	public void setFkxm(String fkxm) {
		this.fkxm = fkxm;
	}

	@Column(name = "FKXM_", length = 30)
	public String getFkxm() {
		return fkxm;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	@Column(name = "WGT_")
	public BigDecimal getWgt() {
		return wgt;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "NUM_")
	public BigDecimal getNum() {
		return num;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Column(name = "TOTAL_AMT_")
	public BigDecimal getTotalAmt() {
		return totalAmt;
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

	@Column(name = "OPENED_BANK_", length = 50)
	public String getOpenedBank() {
		return openedBank;
	}

	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}

	@Column(name = "BANK_ACCT_", length = 30)
	public String getBankAcct() {
		return bankAcct;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}

	@Column(name = "ADDERSS_", length = 50)
	public String getAdderss() {
		return adderss;
	}

	public void setFalg(String falg) {
		this.falg = falg;
	}

	@Column(name = "FALG_", length = 6)
	public String getFalg() {
		return falg;
	}

	public void setCheckMan(String checkMan) {
		this.checkMan = checkMan;
	}

	@Column(name = "CHECK_MAN_", length = 50)
	public String getCheckMan() {
		return checkMan;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	@Column(name = "CHECK_DATE_", length = 20)
	public String getCheckDate() {
		return checkDate;
	}

	public void setIsBill(String isBill) {
		this.isBill = isBill;
	}

	@Column(name = "IS_BILL_", length = 20)
	public String getIsBill() {
		return isBill;
	}

	public void setSpEmp(String spEmp) {
		this.spEmp = spEmp;
	}

	@Column(name = "SP_EMP_", length = 50)
	public String getSpEmp() {
		return spEmp;
	}

	public void setSpDate(String spDate) {
		this.spDate = spDate;
	}

	@Column(name = "SP_DATE_", length = 20)
	public String getSpDate() {
		return spDate;
	}

	public void setIsfk(String isfk) {
		this.isfk = isfk;
	}

	@Column(name = "ISFK_", length = 20)
	public String getIsfk() {
		return isfk;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setPayEmp(String payEmp) {
		this.payEmp = payEmp;
	}

	@Column(name = "PAY_EMP_", length = 50)
	public String getPayEmp() {
		return payEmp;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	@Column(name = "PAY_DATE_", length = 20)
	public String getPayDate() {
		return payDate;
	}

	public void setYsyf(String ysyf) {
		this.ysyf = ysyf;
	}

	@Column(name = "YSYF_", length = 20)
	public String getYsyf() {
		return ysyf;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "ORDER_NO_", length = 20)
	public String getOrderNo() {
		return orderNo;
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

	@Column(name = "CARRIER_NAME_", length = 200)
	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierDept(String carrierDept) {
		this.carrierDept = carrierDept;
	}

	@Column(name = "CARRIER_DEPT_", length = 20)
	public String getCarrierDept() {
		return carrierDept;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 100)
	public String getBy1() {
		return by1;
	}

	public void setBy2(String by2) {
		this.by2 = by2;
	}

	@Column(name = "BY2_", length = 100)
	public String getBy2() {
		return by2;
	}

	public void setBy3(String by3) {
		this.by3 = by3;
	}

	@Column(name = "BY3_", length = 100)
	public String getBy3() {
		return by3;
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
		return "Tbih42 [ih42Id=" + ih42Id + ",compId=" + compId
				+ ",settleDate=" + settleDate + ",settleYm=" + settleYm
				+ ",custNo=" + custNo + ",custName=" + custName
				+ ",orderCompNo=" + orderCompNo + ",orderCompName="
				+ orderCompName + ",invCustNo=" + invCustNo + ",invCustName="
				+ invCustName + ",payCompNo=" + payCompNo + ",payCompName="
				+ payCompName + ",settleNo=" + settleNo + ",billNo=" + billNo
				+ ",billType=" + billType + ",fkxm=" + fkxm + ",wgt=" + wgt
				+ ",num=" + num + ",price=" + price + ",totalAmt=" + totalAmt
				+ ",taxNo=" + taxNo + ",openedBank=" + openedBank
				+ ",bankAcct=" + bankAcct + ",adderss=" + adderss + ",falg="
				+ falg + ",checkMan=" + checkMan + ",checkDate=" + checkDate
				+ ",isBill=" + isBill + ",spEmp=" + spEmp + ",spDate=" + spDate
				+ ",isfk=" + isfk + ",settleType=" + settleType + ",payEmp="
				+ payEmp + ",payDate=" + payDate + ",ysyf=" + ysyf
				+ ",orderNo=" + orderNo + ",contNo=" + contNo + ",discount="
				+ discount + ",tax=" + tax + ",taxSum=" + taxSum
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",carrierDept=" + carrierDept + ",by1=" + by1 + ",by2=" + by2
				+ ",by3=" + by3 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

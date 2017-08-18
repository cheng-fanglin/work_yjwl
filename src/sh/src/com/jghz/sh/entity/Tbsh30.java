package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh30:
 */
@Entity
@Table(name = "tbsh30")
public class Tbsh30 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh30Id;

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
	 * 结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)
	 */
	@PropertyDef(label = "结算方式(1日结2月结3自定义日期)", description = "结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)")
	private String settleType;

	/**
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

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
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

	/**
	 * 预付款:预付款
	 */
	@PropertyDef(label = "预付款", description = "预付款:预付款")
	private BigDecimal prePayments;

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
	 * 天数:天数
	 */
	@PropertyDef(label = "天数", description = "天数:天数")
	private BigDecimal dayCount;

	/**
	 * 滞结标志:滞结标志
	 */
	@PropertyDef(label = "滞结标志", description = "滞结标志:滞结标志")
	private String detaindFlag;

	/**
	 * 是否结算:是否结算
	 */
	@PropertyDef(label = "是否结算", description = "是否结算:是否结算")
	private String isSettleed;

	/**
	 * 应收应付标志:应收应付标志
	 */
	@PropertyDef(label = "应收应付标志", description = "应收应付标志:应收应付标志")
	private String arAp;

	/**
	 * 方案号:方案号
	 */
	@PropertyDef(label = "方案号", description = "方案号:方案号")
	private String fno;

	/**
	 * 价格序号:价格序号
	 */
	@PropertyDef(label = "价格序号", description = "价格序号:价格序号")
	private String prNo;

	/**
	 * 是否成本计算:是否成本计算
	 */
	@PropertyDef(label = "是否成本计算", description = "是否成本计算:是否成本计算")
	private String iscbjs;

	/**
	 * 航次号:航次号
	 */
	@PropertyDef(label = "航次号", description = "航次号:航次号")
	private String hc;

	/**
	 * 船名:船名
	 */
	@PropertyDef(label = "船名", description = "船名:船名")
	private String shipNo;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String transType;

	/**
	 * 起点:起点
	 */
	@PropertyDef(label = "起点", description = "起点:起点")
	private String startStation;

	/**
	 * 终点:终点
	 */
	@PropertyDef(label = "终点", description = "终点:终点")
	private String endStation;

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
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 审核状态:审核状态
	 */
	@PropertyDef(label = "审核状态", description = "审核状态:审核状态")
	private String checkStatus;

	/**
	 * 发票号:发票号
	 */
	@PropertyDef(label = "发票号", description = "发票号:发票号")
	private String billNo;

	/**
	 * 收款单号:收款单号
	 */
	@PropertyDef(label = "收款单号", description = "收款单号:收款单号")
	private String arBillNo;

	/**
	 * 发票吨位:发票吨位
	 */
	@PropertyDef(label = "发票吨位", description = "发票吨位:发票吨位")
	private BigDecimal billWgt;

	/**
	 * 收款人:收款人
	 */
	@PropertyDef(label = "收款人", description = "收款人:收款人")
	private String payer;

	/**
	 * 收款单号:收款单号
	 */
	@PropertyDef(label = "收款单号", description = "收款单号:收款单号")
	private String arPayNo;

	/**
	 * 付款单号:付款单号
	 */
	@PropertyDef(label = "付款单号", description = "付款单号:付款单号")
	private String payNo;

	/**
	 * 付款时间:付款时间
	 */
	@PropertyDef(label = "付款时间", description = "付款时间:付款时间")
	private String payTime;

	/**
	 * 付款合计:付款合计
	 */
	@PropertyDef(label = "付款合计", description = "付款合计:付款合计")
	private BigDecimal payAmount;

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

	public Tbsh30() {
		super();
	}

	public Tbsh30(String sh30Id, String compId, String compCode,
			String settleNo, String yearMonth, String settleDay,
			String settleType, String transNo, String custNo, String custName,
			String ownerCompNo, String ownerCompName, String payCompNo,
			String payCompName, String billCompNo, String billCompName,
			String tranType, BigDecimal prePayments, BigDecimal settleNumTotal,
			BigDecimal settleWgtTotal, BigDecimal settleAmtTotal,
			BigDecimal dayCount, String detaindFlag, String isSettleed,
			String arAp, String fno, String prNo, String iscbjs, String hc,
			String shipNo, String transType, String startStation,
			String endStation, String carrierNo, String carrierName,
			String status, String checkStatus, String billNo, String arBillNo,
			BigDecimal billWgt, String payer, String arPayNo, String payNo,
			String payTime, BigDecimal payAmount, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.sh30Id = sh30Id;
		this.compId = compId;
		this.compCode = compCode;
		this.settleNo = settleNo;
		this.yearMonth = yearMonth;
		this.settleDay = settleDay;
		this.settleType = settleType;
		this.transNo = transNo;
		this.custNo = custNo;
		this.custName = custName;
		this.ownerCompNo = ownerCompNo;
		this.ownerCompName = ownerCompName;
		this.payCompNo = payCompNo;
		this.payCompName = payCompName;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.tranType = tranType;
		this.prePayments = prePayments;
		this.settleNumTotal = settleNumTotal;
		this.settleWgtTotal = settleWgtTotal;
		this.settleAmtTotal = settleAmtTotal;
		this.dayCount = dayCount;
		this.detaindFlag = detaindFlag;
		this.isSettleed = isSettleed;
		this.arAp = arAp;
		this.fno = fno;
		this.prNo = prNo;
		this.iscbjs = iscbjs;
		this.hc = hc;
		this.shipNo = shipNo;
		this.transType = transType;
		this.startStation = startStation;
		this.endStation = endStation;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.status = status;
		this.checkStatus = checkStatus;
		this.billNo = billNo;
		this.arBillNo = arBillNo;
		this.billWgt = billWgt;
		this.payer = payer;
		this.arPayNo = arPayNo;
		this.payNo = payNo;
		this.payTime = payTime;
		this.payAmount = payAmount;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh30Id(String sh30Id) {
		this.sh30Id = sh30Id;
	}

	@Id
	@Column(name = "SH30_ID_", length = 50, nullable = false)
	public String getSh30Id() {
		return sh30Id;
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

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 50)
	public String getSettleType() {
		return settleType;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
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

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 10)
	public String getTranType() {
		return tranType;
	}

	public void setPrePayments(BigDecimal prePayments) {
		this.prePayments = prePayments;
	}

	@Column(name = "PRE_PAYMENTS_")
	public BigDecimal getPrePayments() {
		return prePayments;
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

	public void setDayCount(BigDecimal dayCount) {
		this.dayCount = dayCount;
	}

	@Column(name = "DAY_COUNT_")
	public BigDecimal getDayCount() {
		return dayCount;
	}

	public void setDetaindFlag(String detaindFlag) {
		this.detaindFlag = detaindFlag;
	}

	@Column(name = "DETAIND_FLAG_", length = 10)
	public String getDetaindFlag() {
		return detaindFlag;
	}

	public void setIsSettleed(String isSettleed) {
		this.isSettleed = isSettleed;
	}

	@Column(name = "IS_SETTLEED_", length = 10)
	public String getIsSettleed() {
		return isSettleed;
	}

	public void setArAp(String arAp) {
		this.arAp = arAp;
	}

	@Column(name = "AR_AP_", length = 10)
	public String getArAp() {
		return arAp;
	}

	public void setFno(String fno) {
		this.fno = fno;
	}

	@Column(name = "FNO_", length = 20)
	public String getFno() {
		return fno;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	@Column(name = "PR_NO_", length = 20)
	public String getPrNo() {
		return prNo;
	}

	public void setIscbjs(String iscbjs) {
		this.iscbjs = iscbjs;
	}

	@Column(name = "ISCBJS_", length = 10)
	public String getIscbjs() {
		return iscbjs;
	}

	public void setHc(String hc) {
		this.hc = hc;
	}

	@Column(name = "HC_", length = 20)
	public String getHc() {
		return hc;
	}

	public void setShipNo(String shipNo) {
		this.shipNo = shipNo;
	}

	@Column(name = "SHIP_NO_", length = 20)
	public String getShipNo() {
		return shipNo;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	@Column(name = "TRANS_TYPE_", length = 10)
	public String getTransType() {
		return transType;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	@Column(name = "START_STATION_", length = 50)
	public String getStartStation() {
		return startStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Column(name = "END_STATION_", length = 50)
	public String getEndStation() {
		return endStation;
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

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	@Column(name = "CHECK_STATUS_", length = 50)
	public String getCheckStatus() {
		return checkStatus;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILL_NO_", length = 20)
	public String getBillNo() {
		return billNo;
	}

	public void setArBillNo(String arBillNo) {
		this.arBillNo = arBillNo;
	}

	@Column(name = "AR_BILL_NO_", length = 50)
	public String getArBillNo() {
		return arBillNo;
	}

	public void setBillWgt(BigDecimal billWgt) {
		this.billWgt = billWgt;
	}

	@Column(name = "BILL_WGT_")
	public BigDecimal getBillWgt() {
		return billWgt;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	@Column(name = "PAYER_", length = 50)
	public String getPayer() {
		return payer;
	}

	public void setArPayNo(String arPayNo) {
		this.arPayNo = arPayNo;
	}

	@Column(name = "AR_PAY_NO_", length = 50)
	public String getArPayNo() {
		return arPayNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	@Column(name = "PAY_NO_", length = 20)
	public String getPayNo() {
		return payNo;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	@Column(name = "PAY_TIME_", length = 20)
	public String getPayTime() {
		return payTime;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	@Column(name = "PAY_AMOUNT_")
	public BigDecimal getPayAmount() {
		return payAmount;
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
		return "Tbsh30 [sh30Id=" + sh30Id + ",compId=" + compId + ",compCode="
				+ compCode + ",settleNo=" + settleNo + ",yearMonth="
				+ yearMonth + ",settleDay=" + settleDay + ",settleType="
				+ settleType + ",transNo=" + transNo + ",custNo=" + custNo
				+ ",custName=" + custName + ",ownerCompNo=" + ownerCompNo
				+ ",ownerCompName=" + ownerCompName + ",payCompNo=" + payCompNo
				+ ",payCompName=" + payCompName + ",billCompNo=" + billCompNo
				+ ",billCompName=" + billCompName + ",tranType=" + tranType
				+ ",prePayments=" + prePayments + ",settleNumTotal="
				+ settleNumTotal + ",settleWgtTotal=" + settleWgtTotal
				+ ",settleAmtTotal=" + settleAmtTotal + ",dayCount=" + dayCount
				+ ",detaindFlag=" + detaindFlag + ",isSettleed=" + isSettleed
				+ ",arAp=" + arAp + ",fno=" + fno + ",prNo=" + prNo
				+ ",iscbjs=" + iscbjs + ",hc=" + hc + ",shipNo=" + shipNo
				+ ",transType=" + transType + ",startStation=" + startStation
				+ ",endStation=" + endStation + ",carrierNo=" + carrierNo
				+ ",carrierName=" + carrierName + ",status=" + status
				+ ",checkStatus=" + checkStatus + ",billNo=" + billNo
				+ ",arBillNo=" + arBillNo + ",billWgt=" + billWgt + ",payer="
				+ payer + ",arPayNo=" + arPayNo + ",payNo=" + payNo
				+ ",payTime=" + payTime + ",payAmount=" + payAmount
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

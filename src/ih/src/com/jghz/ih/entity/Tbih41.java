package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih41:TBIH41(应付表)
 */
@Entity
@Table(name = "tbih41")
public class Tbih41 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih41Id;

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
	private String getCompNo;

	/**
	 * 付款公司名称:付款公司名称
	 */
	@PropertyDef(label = "付款公司名称", description = "付款公司名称:付款公司名称")
	private String getCompName;

	/**
	 * 开票编号:开票编号
	 */
	@PropertyDef(label = "开票编号", description = "开票编号:开票编号")
	private String billNo;

	/**
	 * 付款项目:付款项目
	 */
	@PropertyDef(label = "付款项目", description = "付款项目:付款项目")
	private String fkxm;

	/**
	 * 控制标记:控制标记
	 */
	@PropertyDef(label = "控制标记", description = "控制标记:控制标记")
	private String kzbj;

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
	 * 应付金额:应付金额
	 */
	@PropertyDef(label = "应付金额", description = "应付金额:应付金额")
	private BigDecimal yfAmt;

	/**
	 * 预支付金额:预支付金额
	 */
	@PropertyDef(label = "预支付金额", description = "预支付金额:预支付金额")
	private BigDecimal preAmt;

	/**
	 * 明细金额:明细金额
	 */
	@PropertyDef(label = "明细金额", description = "明细金额:明细金额")
	private BigDecimal detailAmt;

	/**
	 * 延付金额:延付金额
	 */
	@PropertyDef(label = "延付金额", description = "延付金额:延付金额")
	private BigDecimal delayAmt;

	/**
	 * 付款日期:付款日期
	 */
	@PropertyDef(label = "付款日期", description = "付款日期:付款日期")
	private String payDate;

	/**
	 * 生产日期:生产日期
	 */
	@PropertyDef(label = "生产日期", description = "生产日期:生产日期")
	private String cdate;

	/**
	 * 是否结算:是否结算
	 */
	@PropertyDef(label = "是否结算", description = "是否结算:是否结算")
	private String isjs;

	/**
	 * 结算单ID:结算单ID
	 */
	@PropertyDef(label = "结算单ID", description = "结算单ID:结算单ID")
	private String settleNo;

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

	public Tbih41() {
		super();
	}

	public Tbih41(String ih41Id, String compId, String settleDate,
			String settleYm, String custNo, String custName,
			String orderCompNo, String orderCompName, String billCompNo,
			String billCompName, String getCompNo, String getCompName,
			String billNo, String fkxm, String kzbj, BigDecimal wgt,
			BigDecimal num, BigDecimal yfAmt, BigDecimal preAmt,
			BigDecimal detailAmt, BigDecimal delayAmt, String payDate,
			String cdate, String isjs, String settleNo, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih41Id = ih41Id;
		this.compId = compId;
		this.settleDate = settleDate;
		this.settleYm = settleYm;
		this.custNo = custNo;
		this.custName = custName;
		this.orderCompNo = orderCompNo;
		this.orderCompName = orderCompName;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.getCompNo = getCompNo;
		this.getCompName = getCompName;
		this.billNo = billNo;
		this.fkxm = fkxm;
		this.kzbj = kzbj;
		this.wgt = wgt;
		this.num = num;
		this.yfAmt = yfAmt;
		this.preAmt = preAmt;
		this.detailAmt = detailAmt;
		this.delayAmt = delayAmt;
		this.payDate = payDate;
		this.cdate = cdate;
		this.isjs = isjs;
		this.settleNo = settleNo;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh41Id(String ih41Id) {
		this.ih41Id = ih41Id;
	}

	@Id
	@Column(name = "IH41_ID_", length = 50, nullable = false)
	public String getIh41Id() {
		return ih41Id;
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

	public void setFkxm(String fkxm) {
		this.fkxm = fkxm;
	}

	@Column(name = "FKXM_", length = 30)
	public String getFkxm() {
		return fkxm;
	}

	public void setKzbj(String kzbj) {
		this.kzbj = kzbj;
	}

	@Column(name = "KZBJ_", length = 20)
	public String getKzbj() {
		return kzbj;
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

	public void setYfAmt(BigDecimal yfAmt) {
		this.yfAmt = yfAmt;
	}

	@Column(name = "YF_AMT_")
	public BigDecimal getYfAmt() {
		return yfAmt;
	}

	public void setPreAmt(BigDecimal preAmt) {
		this.preAmt = preAmt;
	}

	@Column(name = "PRE_AMT_")
	public BigDecimal getPreAmt() {
		return preAmt;
	}

	public void setDetailAmt(BigDecimal detailAmt) {
		this.detailAmt = detailAmt;
	}

	@Column(name = "DETAIL_AMT_")
	public BigDecimal getDetailAmt() {
		return detailAmt;
	}

	public void setDelayAmt(BigDecimal delayAmt) {
		this.delayAmt = delayAmt;
	}

	@Column(name = "DELAY_AMT_")
	public BigDecimal getDelayAmt() {
		return delayAmt;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	@Column(name = "PAY_DATE_", length = 20)
	public String getPayDate() {
		return payDate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	@Column(name = "CDATE_", length = 20)
	public String getCdate() {
		return cdate;
	}

	public void setIsjs(String isjs) {
		this.isjs = isjs;
	}

	@Column(name = "ISJS_", length = 20)
	public String getIsjs() {
		return isjs;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
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
		return "Tbih41 [ih41Id=" + ih41Id + ",compId=" + compId
				+ ",settleDate=" + settleDate + ",settleYm=" + settleYm
				+ ",custNo=" + custNo + ",custName=" + custName
				+ ",orderCompNo=" + orderCompNo + ",orderCompName="
				+ orderCompName + ",billCompNo=" + billCompNo
				+ ",billCompName=" + billCompName + ",getCompNo=" + getCompNo
				+ ",getCompName=" + getCompName + ",billNo=" + billNo
				+ ",fkxm=" + fkxm + ",kzbj=" + kzbj + ",wgt=" + wgt + ",num="
				+ num + ",yfAmt=" + yfAmt + ",preAmt=" + preAmt + ",detailAmt="
				+ detailAmt + ",delayAmt=" + delayAmt + ",payDate=" + payDate
				+ ",cdate=" + cdate + ",isjs=" + isjs + ",settleNo=" + settleNo
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

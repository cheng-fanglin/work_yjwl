package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih02a:TBIH02A(往来单位-扣款记录)
 */
@Entity
@Table(name = "tbih02a")
public class Tbih02a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih02aId;

	/**
	 * 子表主键:子表主键
	 */
	@PropertyDef(label = "子表主键", description = "子表主键:子表主键")
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
	 * 来函流水号:来函流水号
	 */
	@PropertyDef(label = "来函流水号", description = "来函流水号:来函流水号")
	private String deliveryNo;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 订单号:订单号
	 */
	@PropertyDef(label = "订单号", description = "订单号:订单号")
	private String orderNo;

	/**
	 * 订单项次号:订单项次号
	 */
	@PropertyDef(label = "订单项次号", description = "订单项次号:订单项次号")
	private String orderItem;

	/**
	 * 提单号:提单号
	 */
	@PropertyDef(label = "提单号", description = "提单号:提单号")
	private String ladingNo;

	/**
	 * 结算单号:结算单号
	 */
	@PropertyDef(label = "结算单号", description = "结算单号:结算单号")
	private String settleNo;

	/**
	 * 出库单号:出库单号
	 */
	@PropertyDef(label = "出库单号", description = "出库单号:出库单号")
	private String outNo;

	/**
	 * 出库时间:出库时间
	 */
	@PropertyDef(label = "出库时间", description = "出库时间:出库时间")
	private String outDate;

	/**
	 * 出库费用:出库费用
	 */
	@PropertyDef(label = "出库费用", description = "出库费用:出库费用")
	private BigDecimal outAmt;

	/**
	 * 资金余额:资金余额
	 */
	@PropertyDef(label = "资金余额", description = "资金余额:资金余额")
	private BigDecimal balancenum;

	/**
	 * 扣款日期:扣款日期
	 */
	@PropertyDef(label = "扣款日期", description = "扣款日期:扣款日期")
	private String settleDate;

	/**
	 * 扣款原因:扣款原因
	 */
	@PropertyDef(label = "扣款原因", description = "扣款原因:扣款原因")
	private String reason;

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

	public Tbih02a() {
		super();
	}

	public Tbih02a(String ih02aId, String ih02Id, String compId, String custNo,
			String custName, String deliveryNo, String labelNo, String orderNo,
			String orderItem, String ladingNo, String settleNo, String outNo,
			String outDate, BigDecimal outAmt, BigDecimal balancenum,
			String settleDate, String reason, String by1, String by2,
			String by3, String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.ih02aId = ih02aId;
		this.ih02Id = ih02Id;
		this.compId = compId;
		this.custNo = custNo;
		this.custName = custName;
		this.deliveryNo = deliveryNo;
		this.labelNo = labelNo;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.ladingNo = ladingNo;
		this.settleNo = settleNo;
		this.outNo = outNo;
		this.outDate = outDate;
		this.outAmt = outAmt;
		this.balancenum = balancenum;
		this.settleDate = settleDate;
		this.reason = reason;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh02aId(String ih02aId) {
		this.ih02aId = ih02aId;
	}

	@Id
	@Column(name = "IH02A_ID_", length = 50, nullable = false)
	public String getIh02aId() {
		return ih02aId;
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

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	@Column(name = "DELIVERY_NO_", length = 20)
	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20)
	public String getLabelNo() {
		return labelNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "ORDER_NO_", length = 20)
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	@Column(name = "ORDER_ITEM_", length = 20)
	public String getOrderItem() {
		return orderItem;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20)
	public String getOutNo() {
		return outNo;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	@Column(name = "OUT_DATE_", length = 20)
	public String getOutDate() {
		return outDate;
	}

	public void setOutAmt(BigDecimal outAmt) {
		this.outAmt = outAmt;
	}

	@Column(name = "OUT_AMT_")
	public BigDecimal getOutAmt() {
		return outAmt;
	}

	public void setBalancenum(BigDecimal balancenum) {
		this.balancenum = balancenum;
	}

	@Column(name = "BALANCENUM_")
	public BigDecimal getBalancenum() {
		return balancenum;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	@Column(name = "SETTLE_DATE_", length = 20)
	public String getSettleDate() {
		return settleDate;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "REASON_", length = 20)
	public String getReason() {
		return reason;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 20)
	public String getBy1() {
		return by1;
	}

	public void setBy2(String by2) {
		this.by2 = by2;
	}

	@Column(name = "BY2_", length = 20)
	public String getBy2() {
		return by2;
	}

	public void setBy3(String by3) {
		this.by3 = by3;
	}

	@Column(name = "BY3_", length = 20)
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
		return "Tbih02a [ih02aId=" + ih02aId + ",ih02Id=" + ih02Id + ",compId="
				+ compId + ",custNo=" + custNo + ",custName=" + custName
				+ ",deliveryNo=" + deliveryNo + ",labelNo=" + labelNo
				+ ",orderNo=" + orderNo + ",orderItem=" + orderItem
				+ ",ladingNo=" + ladingNo + ",settleNo=" + settleNo + ",outNo="
				+ outNo + ",outDate=" + outDate + ",outAmt=" + outAmt
				+ ",balancenum=" + balancenum + ",settleDate=" + settleDate
				+ ",reason=" + reason + ",by1=" + by1 + ",by2=" + by2 + ",by3="
				+ by3 + ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih50:TBIH50(客户缴款记录表)
 */
@Entity
@Table(name = "tbih50")
public class Tbih50 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
	private String ih50Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

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
	 * 缴款日期:缴款日期
	 */
	@PropertyDef(label = "缴款日期", description = "缴款日期:缴款日期")
	private String jkrq;

	/**
	 * 缴款金额:缴款金额
	 */
	@PropertyDef(label = "缴款金额", description = "缴款金额:缴款金额")
	private BigDecimal jkje;

	/**
	 * 收款人:收款人
	 */
	@PropertyDef(label = "收款人", description = "收款人:收款人")
	private String skr;

	/**
	 * 仓储费:仓储费
	 */
	@PropertyDef(label = "仓储费", description = "仓储费:仓储费")
	private BigDecimal storageAmt;

	/**
	 * 待办费:待办费
	 */
	@PropertyDef(label = "待办费", description = "待办费:待办费")
	private BigDecimal dbAmt;

	/**
	 * 运杂费:运杂费
	 */
	@PropertyDef(label = "运杂费", description = "运杂费:运杂费")
	private BigDecimal yzAmt;

	/**
	 * 来函流水号:来函流水号
	 */
	@PropertyDef(label = "来函流水号", description = "来函流水号:来函流水号")
	private String deliveryNo;

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
	 * 提货号:提货号
	 */
	@PropertyDef(label = "提货号", description = "提货号:提货号")
	private String ladingNo;

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
	 * 重量:重量
	 */
	@PropertyDef(label = "重量", description = "重量:重量")
	private BigDecimal wgt;

	/**
	 * 数量:数量
	 */
	@PropertyDef(label = "数量", description = "数量:数量")
	private BigDecimal num;

	/**
	 * 合计:合计
	 */
	@PropertyDef(label = "合计", description = "合计:合计")
	private BigDecimal totalAmt;

	/**
	 * 当前余额:当前余额
	 */
	@PropertyDef(label = "当前余额", description = "当前余额:当前余额")
	private BigDecimal balance;

	/**
	 * 缴款方式:缴款方式
	 */
	@PropertyDef(label = "缴款方式", description = "缴款方式:缴款方式")
	private String payType;

	/**
	 * 类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)
	 */
	@PropertyDef(label = "类别(JY-经营/ZY-自营)", description = "类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)")
	private String lb;

	/**
	 * 事由:事由
	 */
	@PropertyDef(label = "事由", description = "事由:事由")
	private String sy;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

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
	private BigDecimal by5;

	/**
	 * 备用6:备用6
	 */
	@PropertyDef(label = "备用6", description = "备用6:备用6")
	private BigDecimal by6;

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

	public Tbih50() {
		super();
	}

	public Tbih50(String ih50Id, String compId, String custNo, String custName,
			String jkrq, BigDecimal jkje, String skr, BigDecimal storageAmt,
			BigDecimal dbAmt, BigDecimal yzAmt, String deliveryNo,
			String billCompNo, String billCompName, String billNo,
			String billDate, String getCompNo, String getCompName,
			String ladingNo, String labelNo, String orderNo, String orderItem,
			BigDecimal wgt, BigDecimal num, BigDecimal totalAmt,
			BigDecimal balance, String payType, String lb, String sy,
			String area, String status, String by1, String by2, String by3,
			String by4, BigDecimal by5, BigDecimal by6, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih50Id = ih50Id;
		this.compId = compId;
		this.custNo = custNo;
		this.custName = custName;
		this.jkrq = jkrq;
		this.jkje = jkje;
		this.skr = skr;
		this.storageAmt = storageAmt;
		this.dbAmt = dbAmt;
		this.yzAmt = yzAmt;
		this.deliveryNo = deliveryNo;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.billNo = billNo;
		this.billDate = billDate;
		this.getCompNo = getCompNo;
		this.getCompName = getCompName;
		this.ladingNo = ladingNo;
		this.labelNo = labelNo;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.wgt = wgt;
		this.num = num;
		this.totalAmt = totalAmt;
		this.balance = balance;
		this.payType = payType;
		this.lb = lb;
		this.sy = sy;
		this.area = area;
		this.status = status;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.by4 = by4;
		this.by5 = by5;
		this.by6 = by6;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh50Id(String ih50Id) {
		this.ih50Id = ih50Id;
	}

	@Id
	@Column(name = "IH50_ID_", length = 50, nullable = false)
	public String getIh50Id() {
		return ih50Id;
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

	public void setJkrq(String jkrq) {
		this.jkrq = jkrq;
	}

	@Column(name = "JKRQ_", length = 20)
	public String getJkrq() {
		return jkrq;
	}

	public void setJkje(BigDecimal jkje) {
		this.jkje = jkje;
	}

	@Column(name = "JKJE_")
	public BigDecimal getJkje() {
		return jkje;
	}

	public void setSkr(String skr) {
		this.skr = skr;
	}

	@Column(name = "SKR_", length = 50)
	public String getSkr() {
		return skr;
	}

	public void setStorageAmt(BigDecimal storageAmt) {
		this.storageAmt = storageAmt;
	}

	@Column(name = "STORAGE_AMT_")
	public BigDecimal getStorageAmt() {
		return storageAmt;
	}

	public void setDbAmt(BigDecimal dbAmt) {
		this.dbAmt = dbAmt;
	}

	@Column(name = "DB_AMT_")
	public BigDecimal getDbAmt() {
		return dbAmt;
	}

	public void setYzAmt(BigDecimal yzAmt) {
		this.yzAmt = yzAmt;
	}

	@Column(name = "YZ_AMT_")
	public BigDecimal getYzAmt() {
		return yzAmt;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	@Column(name = "DELIVERY_NO_", length = 20)
	public String getDeliveryNo() {
		return deliveryNo;
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

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILL_NO_", length = 200)
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

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
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

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Column(name = "TOTAL_AMT_")
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Column(name = "BALANCE_")
	public BigDecimal getBalance() {
		return balance;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "PAY_TYPE_", length = 50)
	public String getPayType() {
		return payType;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 50)
	public String getLb() {
		return lb;
	}

	public void setSy(String sy) {
		this.sy = sy;
	}

	@Column(name = "SY_", length = 200)
	public String getSy() {
		return sy;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
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

	public void setBy4(String by4) {
		this.by4 = by4;
	}

	@Column(name = "BY4_", length = 200)
	public String getBy4() {
		return by4;
	}

	public void setBy5(BigDecimal by5) {
		this.by5 = by5;
	}

	@Column(name = "BY5_")
	public BigDecimal getBy5() {
		return by5;
	}

	public void setBy6(BigDecimal by6) {
		this.by6 = by6;
	}

	@Column(name = "BY6_")
	public BigDecimal getBy6() {
		return by6;
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
		return "Tbih50 [ih50Id=" + ih50Id + ",compId=" + compId + ",custNo="
				+ custNo + ",custName=" + custName + ",jkrq=" + jkrq + ",jkje="
				+ jkje + ",skr=" + skr + ",storageAmt=" + storageAmt
				+ ",dbAmt=" + dbAmt + ",yzAmt=" + yzAmt + ",deliveryNo="
				+ deliveryNo + ",billCompNo=" + billCompNo + ",billCompName="
				+ billCompName + ",billNo=" + billNo + ",billDate=" + billDate
				+ ",getCompNo=" + getCompNo + ",getCompName=" + getCompName
				+ ",ladingNo=" + ladingNo + ",labelNo=" + labelNo + ",orderNo="
				+ orderNo + ",orderItem=" + orderItem + ",wgt=" + wgt + ",num="
				+ num + ",totalAmt=" + totalAmt + ",balance=" + balance
				+ ",payType=" + payType + ",lb=" + lb + ",sy=" + sy + ",area="
				+ area + ",status=" + status + ",by1=" + by1 + ",by2=" + by2
				+ ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5 + ",by6=" + by6
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

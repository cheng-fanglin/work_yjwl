package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih03:TBIH03(临时价格定义)
 */
@Entity
@Table(name = "tbih03")
public class Tbih03 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih03Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 合同号:合同号
	 */
	@PropertyDef(label = "合同号", description = "合同号:合同号")
	private String contNo;

	/**
	 * 客户:客户
	 */
	@PropertyDef(label = "客户", description = "客户:客户")
	private String custNo;

	/**
	 * 客户名称:客户名称
	 */
	@PropertyDef(label = "客户名称", description = "客户名称:客户名称")
	private String custName;

	/**
	 * 合同年月:合同年月
	 */
	@PropertyDef(label = "合同年月", description = "合同年月:合同年月")
	private String yearMonth;

	/**
	 * 产品大类:产品大类
	 */
	@PropertyDef(label = "产品大类", description = "产品大类:产品大类")
	private String prodType;

	/**
	 * 产品大类名称:产品大类名称
	 */
	@PropertyDef(label = "产品大类名称", description = "产品大类名称:产品大类名称")
	private String prodTypeName;

	/**
	 * 产品编码:产品编码
	 */
	@PropertyDef(label = "产品编码", description = "产品编码:产品编码")
	private String productNo;

	/**
	 * 产品名称:产品名称
	 */
	@PropertyDef(label = "产品名称", description = "产品名称:产品名称")
	private String productName;

	/**
	 * 结算方式:结算方式
	 */
	@PropertyDef(label = "结算方式", description = "结算方式:结算方式")
	private String settleType;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

	/**
	 * 仓储价:仓储价
	 */
	@PropertyDef(label = "仓储价", description = "仓储价:仓储价")
	private BigDecimal storagePrice;

	/**
	 * 库别:库别
	 */
	@PropertyDef(label = "库别", description = "库别:库别")
	private String kb;

	/**
	 * 存储周期:存储周期
	 */
	@PropertyDef(label = "存储周期", description = "存储周期:存储周期")
	private BigDecimal cycle;

	/**
	 * 超期费:超期费
	 */
	@PropertyDef(label = "超期费", description = "超期费:超期费")
	private BigDecimal overduePrice;

	/**
	 * 起始库龄:起始库龄
	 */
	@PropertyDef(label = "起始库龄", description = "起始库龄:起始库龄")
	private BigDecimal startDate;

	/**
	 * 结束库龄:结束库龄
	 */
	@PropertyDef(label = "结束库龄", description = "结束库龄:结束库龄")
	private BigDecimal endDate;

	/**
	 * 超期基价:超期基价
	 */
	@PropertyDef(label = "超期基价", description = "超期基价:超期基价")
	private BigDecimal overdueStdPrice;

	/**
	 * 超期单价累计方式:超期单价累计方式
	 */
	@PropertyDef(label = "超期单价累计方式", description = "超期单价累计方式:超期单价累计方式")
	private String overdueType;

	/**
	 * 优惠价格:优惠价格
	 */
	@PropertyDef(label = "优惠价格", description = "优惠价格:优惠价格")
	private BigDecimal discountPrice;

	/**
	 * 仓库编码:仓库编码
	 */
	@PropertyDef(label = "仓库编码", description = "仓库编码:仓库编码")
	private String wareCode;

	/**
	 * 仓库名称:仓库名称
	 */
	@PropertyDef(label = "仓库名称", description = "仓库名称:仓库名称")
	private String wareName;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 启用时间:启用时间
	 */
	@PropertyDef(label = "启用时间", description = "启用时间:启用时间")
	private String usedate;

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
	private BigDecimal version;

	public Tbih03() {
		super();
	}

	public Tbih03(String ih03Id, String compId, String contNo, String custNo,
			String custName, String yearMonth, String prodType,
			String prodTypeName, String productNo, String productName,
			String settleType, String tranType, BigDecimal storagePrice,
			String kb, BigDecimal cycle, BigDecimal overduePrice,
			BigDecimal startDate, BigDecimal endDate,
			BigDecimal overdueStdPrice, String overdueType,
			BigDecimal discountPrice, String wareCode, String wareName,
			String status, String usedate, String by1, String by2, String by3,
			String by4, String by5, String by6, String by7, BigDecimal by8,
			BigDecimal by9, BigDecimal by10, String createEmp, Date createDate,
			String updateEmp, Date updateDate, BigDecimal version) {
		super();
		this.ih03Id = ih03Id;
		this.compId = compId;
		this.contNo = contNo;
		this.custNo = custNo;
		this.custName = custName;
		this.yearMonth = yearMonth;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.settleType = settleType;
		this.tranType = tranType;
		this.storagePrice = storagePrice;
		this.kb = kb;
		this.cycle = cycle;
		this.overduePrice = overduePrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.overdueStdPrice = overdueStdPrice;
		this.overdueType = overdueType;
		this.discountPrice = discountPrice;
		this.wareCode = wareCode;
		this.wareName = wareName;
		this.status = status;
		this.usedate = usedate;
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

	public void setIh03Id(String ih03Id) {
		this.ih03Id = ih03Id;
	}

	@Id
	@Column(name = "IH03_ID_", length = 50, nullable = false)
	public String getIh03Id() {
		return ih03Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
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

	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	@Column(name = "YEAR_MONTH_", length = 20)
	public String getYearMonth() {
		return yearMonth;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	@Column(name = "PROD_TYPE_", length = 20)
	public String getProdType() {
		return prodType;
	}

	public void setProdTypeName(String prodTypeName) {
		this.prodTypeName = prodTypeName;
	}

	@Column(name = "PROD_TYPE_NAME_", length = 100)
	public String getProdTypeName() {
		return prodTypeName;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	@Column(name = "PRODUCT_NO_", length = 20)
	public String getProductNo() {
		return productNo;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_NAME_", length = 100)
	public String getProductName() {
		return productName;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE__", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 20)
	public String getTranType() {
		return tranType;
	}

	public void setStoragePrice(BigDecimal storagePrice) {
		this.storagePrice = storagePrice;
	}

	@Column(name = "STORAGE_PRICE_")
	public BigDecimal getStoragePrice() {
		return storagePrice;
	}

	public void setKb(String kb) {
		this.kb = kb;
	}

	@Column(name = "KB_", length = 5)
	public String getKb() {
		return kb;
	}

	public void setCycle(BigDecimal cycle) {
		this.cycle = cycle;
	}

	@Column(name = "CYCLE_")
	public BigDecimal getCycle() {
		return cycle;
	}

	public void setOverduePrice(BigDecimal overduePrice) {
		this.overduePrice = overduePrice;
	}

	@Column(name = "OVERDUE_PRICE_")
	public BigDecimal getOverduePrice() {
		return overduePrice;
	}

	public void setStartDate(BigDecimal startDate) {
		this.startDate = startDate;
	}

	@Column(name = "START_DATE_")
	public BigDecimal getStartDate() {
		return startDate;
	}

	public void setEndDate(BigDecimal endDate) {
		this.endDate = endDate;
	}

	@Column(name = "END_DATE_")
	public BigDecimal getEndDate() {
		return endDate;
	}

	public void setOverdueStdPrice(BigDecimal overdueStdPrice) {
		this.overdueStdPrice = overdueStdPrice;
	}

	@Column(name = "OVERDUE_STD_PRICE_")
	public BigDecimal getOverdueStdPrice() {
		return overdueStdPrice;
	}

	public void setOverdueType(String overdueType) {
		this.overdueType = overdueType;
	}

	@Column(name = "OVERDUE_TYPE_", length = 20)
	public String getOverdueType() {
		return overdueType;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Column(name = "DISCOUNT_PRICE_")
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setWareCode(String wareCode) {
		this.wareCode = wareCode;
	}

	@Column(name = "WARE_CODE_", length = 20)
	public String getWareCode() {
		return wareCode;
	}

	public void setWareName(String wareName) {
		this.wareName = wareName;
	}

	@Column(name = "WARE_NAME_", length = 100)
	public String getWareName() {
		return wareName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setUsedate(String usedate) {
		this.usedate = usedate;
	}

	@Column(name = "USEDATE_", length = 20)
	public String getUsedate() {
		return usedate;
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
	@Column(name = "CREATE_DATE_", nullable = false)
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
	@Column(name = "UPDATE_DATE_", nullable = false)
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	@Column(name = "VERSION")
	public BigDecimal getVersion() {
		return version;
	}

	public String toString() {
		return "Tbih03 [ih03Id=" + ih03Id + ",compId=" + compId + ",contNo="
				+ contNo + ",custNo=" + custNo + ",custName=" + custName
				+ ",yearMonth=" + yearMonth + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",settleType=" + settleType
				+ ",tranType=" + tranType + ",storagePrice=" + storagePrice
				+ ",kb=" + kb + ",cycle=" + cycle + ",overduePrice="
				+ overduePrice + ",startDate=" + startDate + ",endDate="
				+ endDate + ",overdueStdPrice=" + overdueStdPrice
				+ ",overdueType=" + overdueType + ",discountPrice="
				+ discountPrice + ",wareCode=" + wareCode + ",wareName="
				+ wareName + ",status=" + status + ",usedate=" + usedate
				+ ",by1=" + by1 + ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4
				+ ",by5=" + by5 + ",by6=" + by6 + ",by7=" + by7 + ",by8=" + by8
				+ ",by9=" + by9 + ",by10=" + by10 + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

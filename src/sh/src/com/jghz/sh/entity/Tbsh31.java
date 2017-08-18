package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh31:
 */
@Entity
@Table(name = "tbsh31")
public class Tbsh31 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh31Id;

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
	 * 合同编号:合同编号
	 */
	@PropertyDef(label = "合同编号", description = "合同编号:合同编号")
	private String contNo;

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
	 * 产品大类名称:产品大类名称
	 */
	@PropertyDef(label = "产品大类名称", description = "产品大类名称:产品大类名称")
	private String prodTypeName;

	/**
	 * 货物名称:货物名称
	 */
	@PropertyDef(label = "货物名称", description = "货物名称:货物名称")
	private String productName;

	/**
	 * 产品描述:产品描述
	 */
	@PropertyDef(label = "产品描述", description = "产品描述:产品描述")
	private String productDetail;

	/**
	 * 起点:起点
	 */
	@PropertyDef(label = "起点", description = "起点:起点")
	private String startStation;

	/**
	 * 起点专用线:起点专用线
	 */
	@PropertyDef(label = "起点专用线", description = "起点专用线:起点专用线")
	private String startLine;

	/**
	 * 具体发货地址:具体发货地址
	 */
	@PropertyDef(label = "具体发货地址", description = "具体发货地址:具体发货地址")
	private String despatchAddress;

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
	 * 终点:终点
	 */
	@PropertyDef(label = "终点", description = "终点:终点")
	private String endStation;

	/**
	 * 终点专用线:终点专用线
	 */
	@PropertyDef(label = "终点专用线", description = "终点专用线:终点专用线")
	private String endLine;

	/**
	 * 具体收货地址:具体收货地址
	 */
	@PropertyDef(label = "具体收货地址", description = "具体收货地址:具体收货地址")
	private String deliveryAddress;

	/**
	 * 收货单位编号:收货单位编号
	 */
	@PropertyDef(label = "收货单位编号", description = "收货单位编号:收货单位编号")
	private String receiptCompNo;

	/**
	 * 收货人姓名:收货人姓名
	 */
	@PropertyDef(label = "收货人姓名", description = "收货人姓名:收货人姓名")
	private String receiptCompName;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String transType;

	/**
	 * 运输价格:运输价格
	 */
	@PropertyDef(label = "运输价格", description = "运输价格:运输价格")
	private BigDecimal transPrice;

	/**
	 * 计价方式:计价方式
	 */
	@PropertyDef(label = "计价方式", description = "计价方式:计价方式")
	private String chargeType;

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

	public Tbsh31() {
		super();
	}

	public Tbsh31(String sh31Id, String compId, String compCode, String contNo,
			String transNo, String custNo, String custName,
			String prodTypeName, String productName, String productDetail,
			String startStation, String startLine, String despatchAddress,
			String despatchNo, String despatchName, String endStation,
			String endLine, String deliveryAddress, String receiptCompNo,
			String receiptCompName, String transType, BigDecimal transPrice,
			String chargeType, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.sh31Id = sh31Id;
		this.compId = compId;
		this.compCode = compCode;
		this.contNo = contNo;
		this.transNo = transNo;
		this.custNo = custNo;
		this.custName = custName;
		this.prodTypeName = prodTypeName;
		this.productName = productName;
		this.productDetail = productDetail;
		this.startStation = startStation;
		this.startLine = startLine;
		this.despatchAddress = despatchAddress;
		this.despatchNo = despatchNo;
		this.despatchName = despatchName;
		this.endStation = endStation;
		this.endLine = endLine;
		this.deliveryAddress = deliveryAddress;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.transType = transType;
		this.transPrice = transPrice;
		this.chargeType = chargeType;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh31Id(String sh31Id) {
		this.sh31Id = sh31Id;
	}

	@Id
	@Column(name = "SH31_ID_", length = 50, nullable = false)
	public String getSh31Id() {
		return sh31Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	@Column(name = "COMP_CODE_", length = 10)
	public String getCompCode() {
		return compCode;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 50)
	public String getContNo() {
		return contNo;
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

	public void setProdTypeName(String prodTypeName) {
		this.prodTypeName = prodTypeName;
	}

	@Column(name = "PROD_TYPE_NAME_", length = 50)
	public String getProdTypeName() {
		return prodTypeName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_NAME_", length = 50)
	public String getProductName() {
		return productName;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	@Column(name = "PRODUCT_DETAIL_", length = 200)
	public String getProductDetail() {
		return productDetail;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	@Column(name = "START_STATION_", length = 50)
	public String getStartStation() {
		return startStation;
	}

	public void setStartLine(String startLine) {
		this.startLine = startLine;
	}

	@Column(name = "START_LINE_", length = 50)
	public String getStartLine() {
		return startLine;
	}

	public void setDespatchAddress(String despatchAddress) {
		this.despatchAddress = despatchAddress;
	}

	@Column(name = "DESPATCH_ADDRESS_", length = 200)
	public String getDespatchAddress() {
		return despatchAddress;
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

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Column(name = "END_STATION_", length = 50)
	public String getEndStation() {
		return endStation;
	}

	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}

	@Column(name = "END_LINE_", length = 50)
	public String getEndLine() {
		return endLine;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Column(name = "DELIVERY_ADDRESS_", length = 200)
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setReceiptCompNo(String receiptCompNo) {
		this.receiptCompNo = receiptCompNo;
	}

	@Column(name = "RECEIPT_COMP_NO_", length = 50)
	public String getReceiptCompNo() {
		return receiptCompNo;
	}

	public void setReceiptCompName(String receiptCompName) {
		this.receiptCompName = receiptCompName;
	}

	@Column(name = "RECEIPT_COMP_NAME_", length = 200)
	public String getReceiptCompName() {
		return receiptCompName;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	@Column(name = "TRANS_TYPE_", length = 10)
	public String getTransType() {
		return transType;
	}

	public void setTransPrice(BigDecimal transPrice) {
		this.transPrice = transPrice;
	}

	@Column(name = "TRANS_PRICE_")
	public BigDecimal getTransPrice() {
		return transPrice;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	@Column(name = "CHARGE_TYPE_", length = 10)
	public String getChargeType() {
		return chargeType;
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
		return "Tbsh31 [sh31Id=" + sh31Id + ",compId=" + compId + ",compCode="
				+ compCode + ",contNo=" + contNo + ",transNo=" + transNo
				+ ",custNo=" + custNo + ",custName=" + custName
				+ ",prodTypeName=" + prodTypeName + ",productName="
				+ productName + ",productDetail=" + productDetail
				+ ",startStation=" + startStation + ",startLine=" + startLine
				+ ",despatchAddress=" + despatchAddress + ",despatchNo="
				+ despatchNo + ",despatchName=" + despatchName + ",endStation="
				+ endStation + ",endLine=" + endLine + ",deliveryAddress="
				+ deliveryAddress + ",receiptCompNo=" + receiptCompNo
				+ ",receiptCompName=" + receiptCompName + ",transType="
				+ transType + ",transPrice=" + transPrice + ",chargeType="
				+ chargeType + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

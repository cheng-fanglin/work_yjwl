package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh10c:运单产品表TBSH10C
 */
@Entity
@Table(name = "tbsh10c")
public class Tbsh10c implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh10cId;

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
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

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
	 * 货物编号:货物编号
	 */
	@PropertyDef(label = "货物编号", description = "货物编号:货物编号")
	private String productNo;

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
	 * 产品长度:产品长度
	 */
	@PropertyDef(label = "产品长度", description = "产品长度:产品长度")
	private BigDecimal prodLong;

	/**
	 * 产品宽度:产品宽度
	 */
	@PropertyDef(label = "产品宽度", description = "产品宽度:产品宽度")
	private BigDecimal prdoWidth;

	/**
	 * 产品高度:产品高度
	 */
	@PropertyDef(label = "产品高度", description = "产品高度:产品高度")
	private BigDecimal prodHight;

	/**
	 * 产品体积:产品体积
	 */
	@PropertyDef(label = "产品体积", description = "产品体积:产品体积")
	private BigDecimal prodVolume;

	/**
	 * 运单重量:运单重量
	 */
	@PropertyDef(label = "运单重量", description = "运单重量:运单重量")
	private BigDecimal wgt;

	/**
	 * 已发货量:已发货量
	 */
	@PropertyDef(label = "已发货量", description = "已发货量:已发货量")
	private BigDecimal deliveredWgt;

	/**
	 * 已回单量:已回单量
	 */
	@PropertyDef(label = "已回单量", description = "已回单量:已回单量")
	private BigDecimal backWgt;

	/**
	 * 数量:数量
	 */
	@PropertyDef(label = "数量", description = "数量:数量")
	private BigDecimal num;

	/**
	 * 仓库地址:仓库地址
	 */
	@PropertyDef(label = "仓库地址", description = "仓库地址:仓库地址")
	private String warehouseAddress;

	/**
	 * 包装:包装
	 */
	@PropertyDef(label = "包装", description = "包装:包装")
	private String packing;

	/**
	 * 仓库ID:仓库ID
	 */
	@PropertyDef(label = "仓库ID", description = "仓库ID:仓库ID")
	private String warehouseId;

	/**
	 * 仓库名称:仓库名称
	 */
	@PropertyDef(label = "仓库名称", description = "仓库名称:仓库名称")
	private String warehouseName;

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

	public Tbsh10c() {
		super();
	}

	public Tbsh10c(String sh10cId, String compId, String compCode,
			String transNo, String prodType, String prodTypeName,
			String productNo, String productName, String productDetail,
			BigDecimal prodLong, BigDecimal prdoWidth, BigDecimal prodHight,
			BigDecimal prodVolume, BigDecimal wgt, BigDecimal deliveredWgt,
			BigDecimal backWgt, BigDecimal num, String warehouseAddress,
			String packing, String warehouseId, String warehouseName,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.sh10cId = sh10cId;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.prodLong = prodLong;
		this.prdoWidth = prdoWidth;
		this.prodHight = prodHight;
		this.prodVolume = prodVolume;
		this.wgt = wgt;
		this.deliveredWgt = deliveredWgt;
		this.backWgt = backWgt;
		this.num = num;
		this.warehouseAddress = warehouseAddress;
		this.packing = packing;
		this.warehouseId = warehouseId;
		this.warehouseName = warehouseName;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh10cId(String sh10cId) {
		this.sh10cId = sh10cId;
	}

	@Id
	@Column(name = "SH10C_ID_", length = 50, nullable = false)
	public String getSh10cId() {
		return sh10cId;
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

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
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

	@Column(name = "PROD_TYPE_NAME_", length = 50)
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

	public void setProdLong(BigDecimal prodLong) {
		this.prodLong = prodLong;
	}

	@Column(name = "PROD_LONG_")
	public BigDecimal getProdLong() {
		return prodLong;
	}

	public void setPrdoWidth(BigDecimal prdoWidth) {
		this.prdoWidth = prdoWidth;
	}

	@Column(name = "PRDO_WIDTH_")
	public BigDecimal getPrdoWidth() {
		return prdoWidth;
	}

	public void setProdHight(BigDecimal prodHight) {
		this.prodHight = prodHight;
	}

	@Column(name = "PROD_HIGHT_")
	public BigDecimal getProdHight() {
		return prodHight;
	}

	public void setProdVolume(BigDecimal prodVolume) {
		this.prodVolume = prodVolume;
	}

	@Column(name = "PROD_VOLUME_")
	public BigDecimal getProdVolume() {
		return prodVolume;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	@Column(name = "WGT_")
	public BigDecimal getWgt() {
		return wgt;
	}

	public void setDeliveredWgt(BigDecimal deliveredWgt) {
		this.deliveredWgt = deliveredWgt;
	}

	@Column(name = "DELIVERED_WGT_")
	public BigDecimal getDeliveredWgt() {
		return deliveredWgt;
	}

	public void setBackWgt(BigDecimal backWgt) {
		this.backWgt = backWgt;
	}

	@Column(name = "BACK_WGT_")
	public BigDecimal getBackWgt() {
		return backWgt;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "NUM_")
	public BigDecimal getNum() {
		return num;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	@Column(name = "WAREHOUSE_ADDRESS_", length = 50)
	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	@Column(name = "PACKING_", length = 1000)
	public String getPacking() {
		return packing;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	@Column(name = "WAREHOUSE_ID_", length = 50)
	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	@Column(name = "WAREHOUSE_NAME_", length = 50)
	public String getWarehouseName() {
		return warehouseName;
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
		return "Tbsh10c [sh10cId=" + sh10cId + ",compId=" + compId
				+ ",compCode=" + compCode + ",transNo=" + transNo
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",prodLong=" + prodLong
				+ ",prdoWidth=" + prdoWidth + ",prodHight=" + prodHight
				+ ",prodVolume=" + prodVolume + ",wgt=" + wgt
				+ ",deliveredWgt=" + deliveredWgt + ",backWgt=" + backWgt
				+ ",num=" + num + ",warehouseAddress=" + warehouseAddress
				+ ",packing=" + packing + ",warehouseId=" + warehouseId
				+ ",warehouseName=" + warehouseName + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

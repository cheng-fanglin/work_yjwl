package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih61:TBIH61货品盘点表
 */
@Entity
@Table(name = "tbih61")
public class Tbih61 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String ih61Id;

	/**
	 * 公司编码:公司编码
	 */
	@PropertyDef(label = "公司编码", description = "公司编码:公司编码")
	private String compId;

	/**
	 * 盘点日期:盘点日期
	 */
	@PropertyDef(label = "盘点日期", description = "盘点日期:盘点日期")
	private String inventoryDate;

	/**
	 * 盘点单号:盘点单号
	 */
	@PropertyDef(label = "盘点单号", description = "盘点单号:盘点单号")
	private String inventoryNo;

	/**
	 * 盘点人:盘点人
	 */
	@PropertyDef(label = "盘点人", description = "盘点人:盘点人")
	private String inventoryEmp;

	/**
	 * 盘点类型:盘点类型
	 */
	@PropertyDef(label = "盘点类型", description = "盘点类型:盘点类型")
	private String inventoryType;

	/**
	 * 关联单号:关联单号
	 */
	@PropertyDef(label = "关联单号", description = "关联单号:关联单号")
	private String checkNo;

	/**
	 * 客户编码:客户编码
	 */
	@PropertyDef(label = "客户编码", description = "客户编码:客户编码")
	private String custNo;

	/**
	 * 客户名称:客户名称
	 */
	@PropertyDef(label = "客户名称", description = "客户名称:客户名称")
	private String custName;

	/**
	 * 出厂订单号:出厂订单号
	 */
	@PropertyDef(label = "出厂订单号", description = "出厂订单号:出厂订单号")
	private String orderNo;

	/**
	 * 出厂订单项次号:出厂订单项次号
	 */
	@PropertyDef(label = "出厂订单项次号", description = "出厂订单项次号:出厂订单项次号")
	private String orderItem;

	/**
	 * 提货号:提货号
	 */
	@PropertyDef(label = "提货号", description = "提货号:提货号")
	private String ladingNo;

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
	 * 产品描述:产品描述
	 */
	@PropertyDef(label = "产品描述", description = "产品描述:产品描述")
	private String productDetail;

	/**
	 * 牌号:牌号
	 */
	@PropertyDef(label = "牌号", description = "牌号:牌号")
	private String gradeNo;

	/**
	 * 钢种:钢种
	 */
	@PropertyDef(label = "钢种", description = "钢种:钢种")
	private String steelNo;

	/**
	 * 切边:切边
	 */
	@PropertyDef(label = "切边", description = "切边:切边")
	private String qb;

	/**
	 * 定尺信息:定尺信息
	 */
	@PropertyDef(label = "定尺信息", description = "定尺信息:定尺信息")
	private String dc;

	/**
	 * 厚度:厚度
	 */
	@PropertyDef(label = "厚度", description = "厚度:厚度")
	private BigDecimal thick;

	/**
	 * 宽度:宽度
	 */
	@PropertyDef(label = "宽度", description = "宽度:宽度")
	private BigDecimal width;

	/**
	 * 长度:长度
	 */
	@PropertyDef(label = "长度", description = "长度:长度")
	private BigDecimal length;

	/**
	 * 尺寸信息:尺寸信息
	 */
	@PropertyDef(label = "尺寸信息", description = "尺寸信息:尺寸信息")
	private String size;

	/**
	 * 市场:市场
	 */
	@PropertyDef(label = "市场", description = "市场:市场")
	private String area;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 产品状态:产品状态
	 */
	@PropertyDef(label = "产品状态", description = "产品状态:产品状态")
	private String productStatus;

	/**
	 * 计量单位:计量单位
	 */
	@PropertyDef(label = "计量单位", description = "计量单位:计量单位")
	private String unit;

	/**
	 * 库位:库位
	 */
	@PropertyDef(label = "库位", description = "库位:库位")
	private String wareQwCode;

	/**
	 * 层号:层号
	 */
	@PropertyDef(label = "层号", description = "层号:层号")
	private String layerCode;

	/**
	 * 数量:数量
	 */
	@PropertyDef(label = "数量", description = "数量:数量")
	private BigDecimal pieceNum;

	/**
	 * 库位重量:库位重量
	 */
	@PropertyDef(label = "库位重量", description = "库位重量:库位重量")
	private BigDecimal wgt;

	/**
	 * 成本单价:成本单价
	 */
	@PropertyDef(label = "成本单价", description = "成本单价:成本单价")
	private BigDecimal costPrice;

	/**
	 * 实盘数量:实盘数量
	 */
	@PropertyDef(label = "实盘数量", description = "实盘数量:实盘数量")
	private BigDecimal inventoryNum;

	/**
	 * 实盘重量:实盘重量
	 */
	@PropertyDef(label = "实盘重量", description = "实盘重量:实盘重量")
	private BigDecimal inventoryWgt;

	/**
	 * 盘盈数量:盘盈数量
	 */
	@PropertyDef(label = "盘盈数量", description = "盘盈数量:盘盈数量")
	private BigDecimal surplusNum;

	/**
	 * 盘盈重量:盘盈重量
	 */
	@PropertyDef(label = "盘盈重量", description = "盘盈重量:盘盈重量")
	private BigDecimal surplusWgt;

	/**
	 * 盘亏数量:盘亏数量
	 */
	@PropertyDef(label = "盘亏数量", description = "盘亏数量:盘亏数量")
	private BigDecimal loseNum;

	/**
	 * 盘亏重量:盘亏重量
	 */
	@PropertyDef(label = "盘亏重量", description = "盘亏重量:盘亏重量")
	private BigDecimal loseWgt;

	/**
	 * 重量保留:重量保留
	 */
	@PropertyDef(label = "重量保留", description = "重量保留:重量保留")
	private String weightKeep;

	/**
	 * 磅差调整:磅差调整
	 */
	@PropertyDef(label = "磅差调整", description = "磅差调整:磅差调整")
	private BigDecimal differenceWgt;

	/**
	 * 核准状态:核准状态
	 */
	@PropertyDef(label = "核准状态", description = "核准状态:核准状态")
	private String checkStatus;

	/**
	 * 是否新增成品:是否新增成品
	 */
	@PropertyDef(label = "是否新增成品", description = "是否新增成品:是否新增成品")
	private String isAdd;

	/**
	 * 原因:原因
	 */
	@PropertyDef(label = "原因", description = "原因:原因")
	private String reason;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String demo;

	/**
	 * 新增人:新增人
	 */
	@PropertyDef(label = "新增人", description = "新增人:新增人")
	private String createEmp;

	/**
	 * 新增时间:新增时间
	 */
	@PropertyDef(label = "新增时间", description = "新增时间:新增时间")
	private Date createTime;

	/**
	 * 修改人:修改人
	 */
	@PropertyDef(label = "修改人", description = "修改人:修改人")
	private String updateEmp;

	/**
	 * 修改时间:修改时间
	 */
	@PropertyDef(label = "修改时间", description = "修改时间:修改时间")
	private Date updateTime;

	/**
	 * VERSION:VERSION
	 */
	@PropertyDef(label = "VERSION", description = "VERSION:VERSION")
	private int version;

	public Tbih61() {
		super();
	}

	public Tbih61(String ih61Id, String compId, String inventoryDate,
			String inventoryNo, String inventoryEmp, String inventoryType,
			String checkNo, String custNo, String custName, String orderNo,
			String orderItem, String ladingNo, String prodType,
			String prodTypeName, String productNo, String productName,
			String productDetail, String gradeNo, String steelNo, String qb,
			String dc, BigDecimal thick, BigDecimal width, BigDecimal length,
			String size, String area, String labelNo, String productStatus,
			String unit, String wareQwCode, String layerCode,
			BigDecimal pieceNum, BigDecimal wgt, BigDecimal costPrice,
			BigDecimal inventoryNum, BigDecimal inventoryWgt,
			BigDecimal surplusNum, BigDecimal surplusWgt, BigDecimal loseNum,
			BigDecimal loseWgt, String weightKeep, BigDecimal differenceWgt,
			String checkStatus, String isAdd, String reason, String demo,
			String createEmp, Date createTime, String updateEmp,
			Date updateTime, int version) {
		super();
		this.ih61Id = ih61Id;
		this.compId = compId;
		this.inventoryDate = inventoryDate;
		this.inventoryNo = inventoryNo;
		this.inventoryEmp = inventoryEmp;
		this.inventoryType = inventoryType;
		this.checkNo = checkNo;
		this.custNo = custNo;
		this.custName = custName;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.ladingNo = ladingNo;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.gradeNo = gradeNo;
		this.steelNo = steelNo;
		this.qb = qb;
		this.dc = dc;
		this.thick = thick;
		this.width = width;
		this.length = length;
		this.size = size;
		this.area = area;
		this.labelNo = labelNo;
		this.productStatus = productStatus;
		this.unit = unit;
		this.wareQwCode = wareQwCode;
		this.layerCode = layerCode;
		this.pieceNum = pieceNum;
		this.wgt = wgt;
		this.costPrice = costPrice;
		this.inventoryNum = inventoryNum;
		this.inventoryWgt = inventoryWgt;
		this.surplusNum = surplusNum;
		this.surplusWgt = surplusWgt;
		this.loseNum = loseNum;
		this.loseWgt = loseWgt;
		this.weightKeep = weightKeep;
		this.differenceWgt = differenceWgt;
		this.checkStatus = checkStatus;
		this.isAdd = isAdd;
		this.reason = reason;
		this.demo = demo;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setIh61Id(String ih61Id) {
		this.ih61Id = ih61Id;
	}

	@Id
	@Column(name = "IH61_ID_", length = 50, nullable = false)
	public String getIh61Id() {
		return ih61Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	@Column(name = "INVENTORY_DATE_", length = 20)
	public String getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryNo(String inventoryNo) {
		this.inventoryNo = inventoryNo;
	}

	@Column(name = "INVENTORY_NO_", length = 20)
	public String getInventoryNo() {
		return inventoryNo;
	}

	public void setInventoryEmp(String inventoryEmp) {
		this.inventoryEmp = inventoryEmp;
	}

	@Column(name = "INVENTORY_EMP_", length = 50)
	public String getInventoryEmp() {
		return inventoryEmp;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	@Column(name = "INVENTORY_TYPE_", length = 20)
	public String getInventoryType() {
		return inventoryType;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	@Column(name = "CHECK_NO_", length = 20)
	public String getCheckNo() {
		return checkNo;
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

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	@Column(name = "PRODUCT_DETAIL_", length = 200)
	public String getProductDetail() {
		return productDetail;
	}

	public void setGradeNo(String gradeNo) {
		this.gradeNo = gradeNo;
	}

	@Column(name = "GRADE_NO_", length = 200)
	public String getGradeNo() {
		return gradeNo;
	}

	public void setSteelNo(String steelNo) {
		this.steelNo = steelNo;
	}

	@Column(name = "STEEL_NO_", length = 200)
	public String getSteelNo() {
		return steelNo;
	}

	public void setQb(String qb) {
		this.qb = qb;
	}

	@Column(name = "QB_", length = 200)
	public String getQb() {
		return qb;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	@Column(name = "DC_", length = 200)
	public String getDc() {
		return dc;
	}

	public void setThick(BigDecimal thick) {
		this.thick = thick;
	}

	@Column(name = "THICK_")
	public BigDecimal getThick() {
		return thick;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	@Column(name = "WIDTH_")
	public BigDecimal getWidth() {
		return width;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	@Column(name = "LENGTH_")
	public BigDecimal getLength() {
		return length;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SIZE_", length = 50)
	public String getSize() {
		return size;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20)
	public String getLabelNo() {
		return labelNo;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	@Column(name = "PRODUCT_STATUS_", length = 20)
	public String getProductStatus() {
		return productStatus;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "UNIT_", length = 20)
	public String getUnit() {
		return unit;
	}

	public void setWareQwCode(String wareQwCode) {
		this.wareQwCode = wareQwCode;
	}

	@Column(name = "WARE_QW_CODE_", length = 20)
	public String getWareQwCode() {
		return wareQwCode;
	}

	public void setLayerCode(String layerCode) {
		this.layerCode = layerCode;
	}

	@Column(name = "LAYER_CODE_", length = 20)
	public String getLayerCode() {
		return layerCode;
	}

	public void setPieceNum(BigDecimal pieceNum) {
		this.pieceNum = pieceNum;
	}

	@Column(name = "PIECE_NUM_")
	public BigDecimal getPieceNum() {
		return pieceNum;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	@Column(name = "WGT_")
	public BigDecimal getWgt() {
		return wgt;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	@Column(name = "COST_PRICE_")
	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setInventoryNum(BigDecimal inventoryNum) {
		this.inventoryNum = inventoryNum;
	}

	@Column(name = "INVENTORY_NUM_")
	public BigDecimal getInventoryNum() {
		return inventoryNum;
	}

	public void setInventoryWgt(BigDecimal inventoryWgt) {
		this.inventoryWgt = inventoryWgt;
	}

	@Column(name = "INVENTORY_WGT_")
	public BigDecimal getInventoryWgt() {
		return inventoryWgt;
	}

	public void setSurplusNum(BigDecimal surplusNum) {
		this.surplusNum = surplusNum;
	}

	@Column(name = "SURPLUS_NUM_")
	public BigDecimal getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusWgt(BigDecimal surplusWgt) {
		this.surplusWgt = surplusWgt;
	}

	@Column(name = "SURPLUS_WGT_")
	public BigDecimal getSurplusWgt() {
		return surplusWgt;
	}

	public void setLoseNum(BigDecimal loseNum) {
		this.loseNum = loseNum;
	}

	@Column(name = "LOSE_NUM_")
	public BigDecimal getLoseNum() {
		return loseNum;
	}

	public void setLoseWgt(BigDecimal loseWgt) {
		this.loseWgt = loseWgt;
	}

	@Column(name = "LOSE_WGT_")
	public BigDecimal getLoseWgt() {
		return loseWgt;
	}

	public void setWeightKeep(String weightKeep) {
		this.weightKeep = weightKeep;
	}

	@Column(name = "WEIGHT_KEEP_", length = 20)
	public String getWeightKeep() {
		return weightKeep;
	}

	public void setDifferenceWgt(BigDecimal differenceWgt) {
		this.differenceWgt = differenceWgt;
	}

	@Column(name = "DIFFERENCE_WGT_")
	public BigDecimal getDifferenceWgt() {
		return differenceWgt;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	@Column(name = "CHECK_STATUS_", length = 20)
	public String getCheckStatus() {
		return checkStatus;
	}

	public void setIsAdd(String isAdd) {
		this.isAdd = isAdd;
	}

	@Column(name = "IS_ADD_", length = 20)
	public String getIsAdd() {
		return isAdd;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "REASON_", length = 200)
	public String getReason() {
		return reason;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}

	@Column(name = "DEMO_", length = 200)
	public String getDemo() {
		return demo;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 50)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_")
	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 50)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME_")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbih61 [ih61Id=" + ih61Id + ",compId=" + compId
				+ ",inventoryDate=" + inventoryDate + ",inventoryNo="
				+ inventoryNo + ",inventoryEmp=" + inventoryEmp
				+ ",inventoryType=" + inventoryType + ",checkNo=" + checkNo
				+ ",custNo=" + custNo + ",custName=" + custName + ",orderNo="
				+ orderNo + ",orderItem=" + orderItem + ",ladingNo=" + ladingNo
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",gradeNo=" + gradeNo
				+ ",steelNo=" + steelNo + ",qb=" + qb + ",dc=" + dc + ",thick="
				+ thick + ",width=" + width + ",length=" + length + ",size="
				+ size + ",area=" + area + ",labelNo=" + labelNo
				+ ",productStatus=" + productStatus + ",unit=" + unit
				+ ",wareQwCode=" + wareQwCode + ",layerCode=" + layerCode
				+ ",pieceNum=" + pieceNum + ",wgt=" + wgt + ",costPrice="
				+ costPrice + ",inventoryNum=" + inventoryNum
				+ ",inventoryWgt=" + inventoryWgt + ",surplusNum=" + surplusNum
				+ ",surplusWgt=" + surplusWgt + ",loseNum=" + loseNum
				+ ",loseWgt=" + loseWgt + ",weightKeep=" + weightKeep
				+ ",differenceWgt=" + differenceWgt + ",checkStatus="
				+ checkStatus + ",isAdd=" + isAdd + ",reason=" + reason
				+ ",demo=" + demo + ",createEmp=" + createEmp + ",createTime="
				+ createTime + ",updateEmp=" + updateEmp + ",updateTime="
				+ updateTime + ",version=" + version + "]";
	}

}

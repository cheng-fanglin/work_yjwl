package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih16a:TBIH16A (配货单明细档)
 */
@Entity
@Table(name = "tbih16a")
public class Tbih16a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
	private String ih16aId;

	/**
	 * 用户委托函ID:用户委托函ID
	 */
	@PropertyDef(label = "用户委托函ID", description = "用户委托函ID:用户委托函ID")
	private String ih16Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 来函流水号:来函流水号
	 */
	@PropertyDef(label = "来函流水号", description = "来函流水号:来函流水号")
	private String deliveryNo;

	/**
	 * 来函审核人:来函审核人
	 */
	@PropertyDef(label = "来函审核人", description = "来函审核人:来函审核人")
	private String deliveryEmp;

	/**
	 * 来函日期:来函日期
	 */
	@PropertyDef(label = "来函日期", description = "来函日期:来函日期")
	private String deliveryDate;

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
	 * 产品型号:产品型号
	 */
	@PropertyDef(label = "产品型号", description = "产品型号:产品型号")
	private String size;

	/**
	 * 提单总量:提单总量
	 */
	@PropertyDef(label = "提单总量", description = "提单总量:提单总量")
	private BigDecimal ladingWgt;

	/**
	 * 未提件数:未提件数
	 */
	@PropertyDef(label = "未提件数", description = "未提件数:未提件数")
	private BigDecimal wtlNum;

	/**
	 * 未提量:未提量
	 */
	@PropertyDef(label = "未提量", description = "未提量:未提量")
	private BigDecimal wtl;

	/**
	 * 开单件数:开单件数
	 */
	@PropertyDef(label = "开单件数", description = "开单件数:开单件数")
	private BigDecimal kdlNum;

	/**
	 * 开单量:开单量
	 */
	@PropertyDef(label = "开单量", description = "开单量:开单量")
	private BigDecimal kdl;

	/**
	 * 本次开单件数:本次开单件数
	 */
	@PropertyDef(label = "本次开单件数", description = "本次开单件数:本次开单件数")
	private BigDecimal bcKdlNum;

	/**
	 * 本次开单量:本次开单量
	 */
	@PropertyDef(label = "本次开单量", description = "本次开单量:本次开单量")
	private BigDecimal bcKdl;

	/**
	 * 是否选择整体项次:是否选择整体项次
	 */
	@PropertyDef(label = "是否选择整体项次", description = "是否选择整体项次:是否选择整体项次")
	private String sfxzztxc;

	/**
	 * 类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)
	 */
	@PropertyDef(label = "类别(JY-经营/ZY-自营)", description = "类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)")
	private String lb;

	/**
	 * 库位:库位
	 */
	@PropertyDef(label = "库位", description = "库位:库位")
	private String wareQwCode;

	/**
	 * 层数:层数
	 */
	@PropertyDef(label = "层数", description = "层数:层数")
	private String layerCode;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 是否直取:是否直取
	 */
	@PropertyDef(label = "是否直取", description = "是否直取:是否直取")
	private String ifZq;

	/**
	 * 出库单号:出库单号
	 */
	@PropertyDef(label = "出库单号", description = "出库单号:出库单号")
	private String outNo;

	/**
	 * 运费担当:运费担当
	 */
	@PropertyDef(label = "运费担当", description = "运费担当:运费担当")
	private String yfdd;

	/**
	 * 协议价:协议价
	 */
	@PropertyDef(label = "协议价", description = "协议价:协议价")
	private BigDecimal contPrice;

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
	 * 合计:合计
	 */
	@PropertyDef(label = "合计", description = "合计:合计")
	private BigDecimal totalAmt;

	/**
	 * 超期费用:超期费用
	 */
	@PropertyDef(label = "超期费用", description = "超期费用:超期费用")
	private BigDecimal overdueAmt;

	/**
	 * 超期费用付款单位编号:超期费用付款单位编号
	 */
	@PropertyDef(label = "超期费用付款单位编号", description = "超期费用付款单位编号:超期费用付款单位编号")
	private String overduePayCompNo;

	/**
	 * 超期费用付款单位:超期费用付款单位
	 */
	@PropertyDef(label = "超期费用付款单位", description = "超期费用付款单位:超期费用付款单位")
	private String overduePayCompName;

	/**
	 * 超期单价:超期单价
	 */
	@PropertyDef(label = "超期单价", description = "超期单价:超期单价")
	private BigDecimal overduePrice;

	/**
	 * 仓储管理费:仓储管理费
	 */
	@PropertyDef(label = "仓储管理费", description = "仓储管理费:仓储管理费")
	private BigDecimal managerPrice;

	/**
	 * 优惠单价:优惠单价
	 */
	@PropertyDef(label = "优惠单价", description = "优惠单价:优惠单价")
	private BigDecimal discountPrice;

	/**
	 * 保险费:保险费
	 */
	@PropertyDef(label = "保险费", description = "保险费:保险费")
	private BigDecimal premiumsPrice;

	/**
	 * 库龄计算方式:库龄计算方式
	 */
	@PropertyDef(label = "库龄计算方式", description = "库龄计算方式:库龄计算方式")
	private String jfrq;

	/**
	 * 天数:天数
	 */
	@PropertyDef(label = "天数", description = "天数:天数")
	private String ts;

	/**
	 * 运单单号:运单单号
	 */
	@PropertyDef(label = "运单单号", description = "运单单号:运单单号")
	private String transNo;

	/**
	 * 库龄计费日:库龄计费日
	 */
	@PropertyDef(label = "库龄计费日", description = "库龄计费日:库龄计费日")
	private String jfr;

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
	 * VERSION:
	 */
	@PropertyDef(label = "VERSION", description = "VERSION:")
	private int version;

	public Tbih16a() {
		super();
	}

	public Tbih16a(String ih16aId, String ih16Id, String compId,
			String deliveryNo, String deliveryEmp, String deliveryDate,
			String ladingNo, String labelNo, String orderNo, String orderItem,
			String prodType, String prodTypeName, String productNo,
			String productName, String productDetail, String gradeNo,
			String steelNo, String size, BigDecimal ladingWgt,
			BigDecimal wtlNum, BigDecimal wtl, BigDecimal kdlNum,
			BigDecimal kdl, BigDecimal bcKdlNum, BigDecimal bcKdl,
			String sfxzztxc, String lb, String wareQwCode, String layerCode,
			String area, String ifZq, String outNo, String yfdd,
			BigDecimal contPrice, BigDecimal storageAmt, BigDecimal dbAmt,
			BigDecimal yzAmt, BigDecimal totalAmt, BigDecimal overdueAmt,
			String overduePayCompNo, String overduePayCompName,
			BigDecimal overduePrice, BigDecimal managerPrice,
			BigDecimal discountPrice, BigDecimal premiumsPrice, String jfrq,
			String ts, String transNo, String jfr, String by1, String by2,
			String by3, String by4, BigDecimal by5, BigDecimal by6,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.ih16aId = ih16aId;
		this.ih16Id = ih16Id;
		this.compId = compId;
		this.deliveryNo = deliveryNo;
		this.deliveryEmp = deliveryEmp;
		this.deliveryDate = deliveryDate;
		this.ladingNo = ladingNo;
		this.labelNo = labelNo;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.gradeNo = gradeNo;
		this.steelNo = steelNo;
		this.size = size;
		this.ladingWgt = ladingWgt;
		this.wtlNum = wtlNum;
		this.wtl = wtl;
		this.kdlNum = kdlNum;
		this.kdl = kdl;
		this.bcKdlNum = bcKdlNum;
		this.bcKdl = bcKdl;
		this.sfxzztxc = sfxzztxc;
		this.lb = lb;
		this.wareQwCode = wareQwCode;
		this.layerCode = layerCode;
		this.area = area;
		this.ifZq = ifZq;
		this.outNo = outNo;
		this.yfdd = yfdd;
		this.contPrice = contPrice;
		this.storageAmt = storageAmt;
		this.dbAmt = dbAmt;
		this.yzAmt = yzAmt;
		this.totalAmt = totalAmt;
		this.overdueAmt = overdueAmt;
		this.overduePayCompNo = overduePayCompNo;
		this.overduePayCompName = overduePayCompName;
		this.overduePrice = overduePrice;
		this.managerPrice = managerPrice;
		this.discountPrice = discountPrice;
		this.premiumsPrice = premiumsPrice;
		this.jfrq = jfrq;
		this.ts = ts;
		this.transNo = transNo;
		this.jfr = jfr;
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

	public void setIh16aId(String ih16aId) {
		this.ih16aId = ih16aId;
	}

	@Id
	@Column(name = "IH16A_ID_", length = 50, nullable = false)
	public String getIh16aId() {
		return ih16aId;
	}

	public void setIh16Id(String ih16Id) {
		this.ih16Id = ih16Id;
	}

	@Column(name = "IH16_ID_", length = 50, unique = true)
	public String getIh16Id() {
		return ih16Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	@Column(name = "DELIVERY_NO_", length = 20, unique = true)
	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setDeliveryEmp(String deliveryEmp) {
		this.deliveryEmp = deliveryEmp;
	}

	@Column(name = "DELIVERY_EMP_", length = 50)
	public String getDeliveryEmp() {
		return deliveryEmp;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Column(name = "DELIVERY_DATE_", length = 20)
	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20, unique = true)
	public String getLadingNo() {
		return ladingNo;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20, unique = true)
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

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SIZE_", length = 200)
	public String getSize() {
		return size;
	}

	public void setLadingWgt(BigDecimal ladingWgt) {
		this.ladingWgt = ladingWgt;
	}

	@Column(name = "LADING_WGT_")
	public BigDecimal getLadingWgt() {
		return ladingWgt;
	}

	public void setWtlNum(BigDecimal wtlNum) {
		this.wtlNum = wtlNum;
	}

	@Column(name = "WTL_NUM_")
	public BigDecimal getWtlNum() {
		return wtlNum;
	}

	public void setWtl(BigDecimal wtl) {
		this.wtl = wtl;
	}

	@Column(name = "WTL_")
	public BigDecimal getWtl() {
		return wtl;
	}

	public void setKdlNum(BigDecimal kdlNum) {
		this.kdlNum = kdlNum;
	}

	@Column(name = "KDL_NUM_")
	public BigDecimal getKdlNum() {
		return kdlNum;
	}

	public void setKdl(BigDecimal kdl) {
		this.kdl = kdl;
	}

	@Column(name = "KDL_")
	public BigDecimal getKdl() {
		return kdl;
	}

	public void setBcKdlNum(BigDecimal bcKdlNum) {
		this.bcKdlNum = bcKdlNum;
	}

	@Column(name = "BC_KDL_NUM_")
	public BigDecimal getBcKdlNum() {
		return bcKdlNum;
	}

	public void setBcKdl(BigDecimal bcKdl) {
		this.bcKdl = bcKdl;
	}

	@Column(name = "BC_KDL_")
	public BigDecimal getBcKdl() {
		return bcKdl;
	}

	public void setSfxzztxc(String sfxzztxc) {
		this.sfxzztxc = sfxzztxc;
	}

	@Column(name = "SFXZZTXC_", length = 20, unique = true)
	public String getSfxzztxc() {
		return sfxzztxc;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 20)
	public String getLb() {
		return lb;
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

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
	}

	public void setIfZq(String ifZq) {
		this.ifZq = ifZq;
	}

	@Column(name = "IF_ZQ_", length = 20)
	public String getIfZq() {
		return ifZq;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20)
	public String getOutNo() {
		return outNo;
	}

	public void setYfdd(String yfdd) {
		this.yfdd = yfdd;
	}

	@Column(name = "YFDD_", length = 20)
	public String getYfdd() {
		return yfdd;
	}

	public void setContPrice(BigDecimal contPrice) {
		this.contPrice = contPrice;
	}

	@Column(name = "CONT_PRICE_")
	public BigDecimal getContPrice() {
		return contPrice;
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

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Column(name = "TOTAL_AMT__")
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setOverdueAmt(BigDecimal overdueAmt) {
		this.overdueAmt = overdueAmt;
	}

	@Column(name = "OVERDUE_AMT_")
	public BigDecimal getOverdueAmt() {
		return overdueAmt;
	}

	public void setOverduePayCompNo(String overduePayCompNo) {
		this.overduePayCompNo = overduePayCompNo;
	}

	@Column(name = "OVERDUE_PAY_COMP_NO_", length = 20)
	public String getOverduePayCompNo() {
		return overduePayCompNo;
	}

	public void setOverduePayCompName(String overduePayCompName) {
		this.overduePayCompName = overduePayCompName;
	}

	@Column(name = "OVERDUE_PAY_COMP_NAME_", length = 200)
	public String getOverduePayCompName() {
		return overduePayCompName;
	}

	public void setOverduePrice(BigDecimal overduePrice) {
		this.overduePrice = overduePrice;
	}

	@Column(name = "OVERDUE_PRICE_")
	public BigDecimal getOverduePrice() {
		return overduePrice;
	}

	public void setManagerPrice(BigDecimal managerPrice) {
		this.managerPrice = managerPrice;
	}

	@Column(name = "MANAGER_PRICE_")
	public BigDecimal getManagerPrice() {
		return managerPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Column(name = "DISCOUNT_PRICE_")
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setPremiumsPrice(BigDecimal premiumsPrice) {
		this.premiumsPrice = premiumsPrice;
	}

	@Column(name = "PREMIUMS_PRICE_")
	public BigDecimal getPremiumsPrice() {
		return premiumsPrice;
	}

	public void setJfrq(String jfrq) {
		this.jfrq = jfrq;
	}

	@Column(name = "JFRQ_", length = 20)
	public String getJfrq() {
		return jfrq;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Column(name = "TS_", length = 20)
	public String getTs() {
		return ts;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
	}

	public void setJfr(String jfr) {
		this.jfr = jfr;
	}

	@Column(name = "JFR_", length = 20)
	public String getJfr() {
		return jfr;
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
		return "Tbih16a [ih16aId=" + ih16aId + ",ih16Id=" + ih16Id + ",compId="
				+ compId + ",deliveryNo=" + deliveryNo + ",deliveryEmp="
				+ deliveryEmp + ",deliveryDate=" + deliveryDate + ",ladingNo="
				+ ladingNo + ",labelNo=" + labelNo + ",orderNo=" + orderNo
				+ ",orderItem=" + orderItem + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",productDetail="
				+ productDetail + ",gradeNo=" + gradeNo + ",steelNo=" + steelNo
				+ ",size=" + size + ",ladingWgt=" + ladingWgt + ",wtlNum="
				+ wtlNum + ",wtl=" + wtl + ",kdlNum=" + kdlNum + ",kdl=" + kdl
				+ ",bcKdlNum=" + bcKdlNum + ",bcKdl=" + bcKdl + ",sfxzztxc="
				+ sfxzztxc + ",lb=" + lb + ",wareQwCode=" + wareQwCode
				+ ",layerCode=" + layerCode + ",area=" + area + ",ifZq=" + ifZq
				+ ",outNo=" + outNo + ",yfdd=" + yfdd + ",contPrice="
				+ contPrice + ",storageAmt=" + storageAmt + ",dbAmt=" + dbAmt
				+ ",yzAmt=" + yzAmt + ",totalAmt=" + totalAmt + ",overdueAmt="
				+ overdueAmt + ",overduePayCompNo=" + overduePayCompNo
				+ ",overduePayCompName=" + overduePayCompName
				+ ",overduePrice=" + overduePrice + ",managerPrice="
				+ managerPrice + ",discountPrice=" + discountPrice
				+ ",premiumsPrice=" + premiumsPrice + ",jfrq=" + jfrq + ",ts="
				+ ts + ",transNo=" + transNo + ",jfr=" + jfr + ",by1=" + by1
				+ ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5
				+ ",by6=" + by6 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih16b:TBIH16B(南钢提单数据导入表)
 */
@Entity
@Table(name = "tbih16b")
public class Tbih16b implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
	private String ih16bId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 提单号:提单号
	 */
	@PropertyDef(label = "提单号", description = "提单号:提单号")
	private String ladingNo;

	/**
	 * 母提单号:母提单号
	 */
	@PropertyDef(label = "母提单号", description = "母提单号:母提单号")
	private String ladingNoF;

	/**
	 * 提单确认日期:提单确认日期
	 */
	@PropertyDef(label = "提单确认日期", description = "提单确认日期:提单确认日期")
	private String ladingDate;

	/**
	 * 提单有效日期:提单有效日期
	 */
	@PropertyDef(label = "提单有效日期", description = "提单有效日期:提单有效日期")
	private String ladingEffectS;

	/**
	 * 提单结案日期:提单结案日期
	 */
	@PropertyDef(label = "提单结案日期", description = "提单结案日期:提单结案日期")
	private String ladingEffectE;

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
	 * 产品编号:产品编号
	 */
	@PropertyDef(label = "产品编号", description = "产品编号:产品编号")
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
	 * 货主单位编号:货主单位编号
	 */
	@PropertyDef(label = "货主单位编号", description = "货主单位编号:货主单位编号")
	private String ownnerCompNo;

	/**
	 * 货主单位名称:货主单位名称
	 */
	@PropertyDef(label = "货主单位名称", description = "货主单位名称:货主单位名称")
	private String ownnerCompName;

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
	 * 收货单位编号:收货单位编号
	 */
	@PropertyDef(label = "收货单位编号", description = "收货单位编号:收货单位编号")
	private String receiptCompNo;

	/**
	 * 收货单位:收货单位
	 */
	@PropertyDef(label = "收货单位", description = "收货单位:收货单位")
	private String receiptCompName;

	/**
	 * 抵税单位编号:抵税单位编号
	 */
	@PropertyDef(label = "抵税单位编号", description = "抵税单位编号:抵税单位编号")
	private String dsNo;

	/**
	 * 抵税单位名称:抵税单位名称
	 */
	@PropertyDef(label = "抵税单位名称", description = "抵税单位名称:抵税单位名称")
	private String dsName;

	/**
	 * 合同协议号:合同协议号
	 */
	@PropertyDef(label = "合同协议号", description = "合同协议号:合同协议号")
	private String contNo;

	/**
	 * 采购合同号:采购合同号
	 */
	@PropertyDef(label = "采购合同号", description = "采购合同号:采购合同号")
	private String contractNo;

	/**
	 * 运输订单号:运输订单号
	 */
	@PropertyDef(label = "运输订单号", description = "运输订单号:运输订单号")
	private String tranOrderNo;

	/**
	 * 订货单位:订货单位
	 */
	@PropertyDef(label = "订货单位", description = "订货单位:订货单位")
	private String orderCompNo;

	/**
	 * 订货单位名称:订货单位名称
	 */
	@PropertyDef(label = "订货单位名称", description = "订货单位名称:订货单位名称")
	private String orderCompName;

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
	 * 收货人:收货人
	 */
	@PropertyDef(label = "收货人", description = "收货人:收货人")
	private String shr;

	/**
	 * 序号:序号
	 */
	@PropertyDef(label = "序号", description = "序号:序号")
	private String sno;

	/**
	 * 发出仓库:发出仓库
	 */
	@PropertyDef(label = "发出仓库", description = "发出仓库:发出仓库")
	private String outWareCode;

	/**
	 * 发运地:发运地
	 */
	@PropertyDef(label = "发运地", description = "发运地:发运地")
	private String startAddress;

	/**
	 * 收货地:收货地
	 */
	@PropertyDef(label = "收货地", description = "收货地:收货地")
	private String endAddress;

	/**
	 * 收货仓库:收货仓库
	 */
	@PropertyDef(label = "收货仓库", description = "收货仓库:收货仓库")
	private String receiptWareCode;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

	/**
	 * 结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)
	 */
	@PropertyDef(label = "结算方式(1日结2月结3自定义日期)", description = "结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)")
	private String settleType;

	/**
	 * 开单总量:开单总量
	 */
	@PropertyDef(label = "开单总量", description = "开单总量:开单总量")
	private BigDecimal ladingWgt;

	/**
	 * 实提量:实提量
	 */
	@PropertyDef(label = "实提量", description = "实提量:实提量")
	private BigDecimal stl;

	/**
	 * 未提量:未提量
	 */
	@PropertyDef(label = "未提量", description = "未提量:未提量")
	private BigDecimal wtl;

	/**
	 * 开单总项次数:开单总项次数
	 */
	@PropertyDef(label = "开单总项次数", description = "开单总项次数:开单总项次数")
	private BigDecimal kdzxcs;

	/**
	 * 缴款确认提交总费用:缴款确认提交总费用
	 */
	@PropertyDef(label = "缴款确认提交总费用", description = "缴款确认提交总费用:缴款确认提交总费用")
	private BigDecimal jkqrtjZfy;

	/**
	 * 确认配货总费用:确认配货总费用
	 */
	@PropertyDef(label = "确认配货总费用", description = "确认配货总费用:确认配货总费用")
	private BigDecimal qrphZfy;

	/**
	 * 优惠（是/否）:优惠（是/否）
	 */
	@PropertyDef(label = "优惠（是/否）", description = "优惠（是/否）:优惠（是/否）")
	private String yh;

	/**
	 * 提货宽限日:提货宽限日
	 */
	@PropertyDef(label = "提货宽限日", description = "提货宽限日:提货宽限日")
	private String thkxr;

	/**
	 * 提货人:提货人
	 */
	@PropertyDef(label = "提货人", description = "提货人:提货人")
	private String ladingEmp;

	/**
	 * 提货人联系电话/手机:提货人联系电话/手机
	 */
	@PropertyDef(label = "提货人联系电话/手机", description = "提货人联系电话/手机:提货人联系电话/手机")
	private String ladingPhoneno;

	/**
	 * 协议价:协议价
	 */
	@PropertyDef(label = "协议价", description = "协议价:协议价")
	private BigDecimal contPrice;

	/**
	 * 付款方式:付款方式
	 */
	@PropertyDef(label = "付款方式", description = "付款方式:付款方式")
	private String fkfs;

	/**
	 * 合计:合计
	 */
	@PropertyDef(label = "合计", description = "合计:合计")
	private BigDecimal totalAmt;

	/**
	 * 状态(1是否已提交2是否确认付款3是否已结案):状态(1是否已提交2是否确认付款3是否已结案)
	 */
	@PropertyDef(label = "状态(1是否已提交2是否确认付款3是否已结案)", description = "状态(1是否已提交2是否确认付款3是否已结案):状态(1是否已提交2是否确认付款3是否已结案)")
	private String status;

	/**
	 * 出库单号:出库单号
	 */
	@PropertyDef(label = "出库单号", description = "出库单号:出库单号")
	private String outNo;

	/**
	 * 运单单号:运单单号
	 */
	@PropertyDef(label = "运单单号", description = "运单单号:运单单号")
	private String transNo;

	/**
	 * 备注1:备注1
	 */
	@PropertyDef(label = "备注1", description = "备注1:备注1")
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

	public Tbih16b() {
		super();
	}

	public Tbih16b(String ih16bId, String compId, String ladingNo,
			String ladingNoF, String ladingDate, String ladingEffectS,
			String ladingEffectE, String orderNo, String orderItem,
			String prodType, String prodTypeName, String productNo,
			String productName, String productDetail, String qb, String dc,
			String gradeNo, String steelNo, String size, BigDecimal thick,
			BigDecimal width, BigDecimal length, String ownnerCompNo,
			String ownnerCompName, String custNo, String custName,
			String carrierNo, String carrierName, String receiptCompNo,
			String receiptCompName, String dsNo, String dsName, String contNo,
			String contractNo, String tranOrderNo, String orderCompNo,
			String orderCompName, String payCompNo, String payCompName,
			String shr, String sno, String outWareCode, String startAddress,
			String endAddress, String receiptWareCode, String tranType,
			String settleType, BigDecimal ladingWgt, BigDecimal stl,
			BigDecimal wtl, BigDecimal kdzxcs, BigDecimal jkqrtjZfy,
			BigDecimal qrphZfy, String yh, String thkxr, String ladingEmp,
			String ladingPhoneno, BigDecimal contPrice, String fkfs,
			BigDecimal totalAmt, String status, String outNo, String transNo,
			String by1, String by2, String by3, String by4, BigDecimal by5,
			BigDecimal by6, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih16bId = ih16bId;
		this.compId = compId;
		this.ladingNo = ladingNo;
		this.ladingNoF = ladingNoF;
		this.ladingDate = ladingDate;
		this.ladingEffectS = ladingEffectS;
		this.ladingEffectE = ladingEffectE;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.qb = qb;
		this.dc = dc;
		this.gradeNo = gradeNo;
		this.steelNo = steelNo;
		this.size = size;
		this.thick = thick;
		this.width = width;
		this.length = length;
		this.ownnerCompNo = ownnerCompNo;
		this.ownnerCompName = ownnerCompName;
		this.custNo = custNo;
		this.custName = custName;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.dsNo = dsNo;
		this.dsName = dsName;
		this.contNo = contNo;
		this.contractNo = contractNo;
		this.tranOrderNo = tranOrderNo;
		this.orderCompNo = orderCompNo;
		this.orderCompName = orderCompName;
		this.payCompNo = payCompNo;
		this.payCompName = payCompName;
		this.shr = shr;
		this.sno = sno;
		this.outWareCode = outWareCode;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
		this.receiptWareCode = receiptWareCode;
		this.tranType = tranType;
		this.settleType = settleType;
		this.ladingWgt = ladingWgt;
		this.stl = stl;
		this.wtl = wtl;
		this.kdzxcs = kdzxcs;
		this.jkqrtjZfy = jkqrtjZfy;
		this.qrphZfy = qrphZfy;
		this.yh = yh;
		this.thkxr = thkxr;
		this.ladingEmp = ladingEmp;
		this.ladingPhoneno = ladingPhoneno;
		this.contPrice = contPrice;
		this.fkfs = fkfs;
		this.totalAmt = totalAmt;
		this.status = status;
		this.outNo = outNo;
		this.transNo = transNo;
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

	public void setIh16bId(String ih16bId) {
		this.ih16bId = ih16bId;
	}

	@Id
	@Column(name = "IH16B_ID_", length = 50, nullable = false)
	public String getIh16bId() {
		return ih16bId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20, unique = true)
	public String getLadingNo() {
		return ladingNo;
	}

	public void setLadingNoF(String ladingNoF) {
		this.ladingNoF = ladingNoF;
	}

	@Column(name = "LADING_NO_F_", length = 20)
	public String getLadingNoF() {
		return ladingNoF;
	}

	public void setLadingDate(String ladingDate) {
		this.ladingDate = ladingDate;
	}

	@Column(name = "LADING_DATE_", length = 20)
	public String getLadingDate() {
		return ladingDate;
	}

	public void setLadingEffectS(String ladingEffectS) {
		this.ladingEffectS = ladingEffectS;
	}

	@Column(name = "LADING_EFFECT_S_", length = 20)
	public String getLadingEffectS() {
		return ladingEffectS;
	}

	public void setLadingEffectE(String ladingEffectE) {
		this.ladingEffectE = ladingEffectE;
	}

	@Column(name = "LADING_EFFECT_E_", length = 20)
	public String getLadingEffectE() {
		return ladingEffectE;
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

	@Column(name = "ORDER_ITEM_", length = 20, unique = true)
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

	public void setOwnnerCompNo(String ownnerCompNo) {
		this.ownnerCompNo = ownnerCompNo;
	}

	@Column(name = "OWNNER_COMP_NO_", length = 20)
	public String getOwnnerCompNo() {
		return ownnerCompNo;
	}

	public void setOwnnerCompName(String ownnerCompName) {
		this.ownnerCompName = ownnerCompName;
	}

	@Column(name = "OWNNER_COMP_NAME_", length = 200)
	public String getOwnnerCompName() {
		return ownnerCompName;
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

	public void setReceiptCompNo(String receiptCompNo) {
		this.receiptCompNo = receiptCompNo;
	}

	@Column(name = "RECEIPT_COMP_NO_", length = 20)
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

	public void setDsNo(String dsNo) {
		this.dsNo = dsNo;
	}

	@Column(name = "DS_NO_", length = 20)
	public String getDsNo() {
		return dsNo;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	@Column(name = "DS_NAME_", length = 200)
	public String getDsName() {
		return dsName;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	@Column(name = "CONTRACT_NO_", length = 20)
	public String getContractNo() {
		return contractNo;
	}

	public void setTranOrderNo(String tranOrderNo) {
		this.tranOrderNo = tranOrderNo;
	}

	@Column(name = "TRAN_ORDER_NO_", length = 20)
	public String getTranOrderNo() {
		return tranOrderNo;
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

	public void setShr(String shr) {
		this.shr = shr;
	}

	@Column(name = "SHR_", length = 50)
	public String getShr() {
		return shr;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	@Column(name = "SNO_", length = 20)
	public String getSno() {
		return sno;
	}

	public void setOutWareCode(String outWareCode) {
		this.outWareCode = outWareCode;
	}

	@Column(name = "OUT_WARE_CODE_", length = 20)
	public String getOutWareCode() {
		return outWareCode;
	}

	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	@Column(name = "START_ADDRESS_", length = 100)
	public String getStartAddress() {
		return startAddress;
	}

	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	@Column(name = "END_ADDRESS_", length = 100)
	public String getEndAddress() {
		return endAddress;
	}

	public void setReceiptWareCode(String receiptWareCode) {
		this.receiptWareCode = receiptWareCode;
	}

	@Column(name = "RECEIPT_WARE_CODE_", length = 20)
	public String getReceiptWareCode() {
		return receiptWareCode;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 20)
	public String getTranType() {
		return tranType;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setLadingWgt(BigDecimal ladingWgt) {
		this.ladingWgt = ladingWgt;
	}

	@Column(name = "LADING_WGT_")
	public BigDecimal getLadingWgt() {
		return ladingWgt;
	}

	public void setStl(BigDecimal stl) {
		this.stl = stl;
	}

	@Column(name = "STL_")
	public BigDecimal getStl() {
		return stl;
	}

	public void setWtl(BigDecimal wtl) {
		this.wtl = wtl;
	}

	@Column(name = "WTL_")
	public BigDecimal getWtl() {
		return wtl;
	}

	public void setKdzxcs(BigDecimal kdzxcs) {
		this.kdzxcs = kdzxcs;
	}

	@Column(name = "KDZXCS_")
	public BigDecimal getKdzxcs() {
		return kdzxcs;
	}

	public void setJkqrtjZfy(BigDecimal jkqrtjZfy) {
		this.jkqrtjZfy = jkqrtjZfy;
	}

	@Column(name = "JKQRTJ_ZFY_")
	public BigDecimal getJkqrtjZfy() {
		return jkqrtjZfy;
	}

	public void setQrphZfy(BigDecimal qrphZfy) {
		this.qrphZfy = qrphZfy;
	}

	@Column(name = "QRPH_ZFY_")
	public BigDecimal getQrphZfy() {
		return qrphZfy;
	}

	public void setYh(String yh) {
		this.yh = yh;
	}

	@Column(name = "YH_", length = 20)
	public String getYh() {
		return yh;
	}

	public void setThkxr(String thkxr) {
		this.thkxr = thkxr;
	}

	@Column(name = "THKXR_", length = 20)
	public String getThkxr() {
		return thkxr;
	}

	public void setLadingEmp(String ladingEmp) {
		this.ladingEmp = ladingEmp;
	}

	@Column(name = "LADING_EMP_", length = 50)
	public String getLadingEmp() {
		return ladingEmp;
	}

	public void setLadingPhoneno(String ladingPhoneno) {
		this.ladingPhoneno = ladingPhoneno;
	}

	@Column(name = "LADING_PHONENO_", length = 50)
	public String getLadingPhoneno() {
		return ladingPhoneno;
	}

	public void setContPrice(BigDecimal contPrice) {
		this.contPrice = contPrice;
	}

	@Column(name = "CONT_PRICE_")
	public BigDecimal getContPrice() {
		return contPrice;
	}

	public void setFkfs(String fkfs) {
		this.fkfs = fkfs;
	}

	@Column(name = "FKFS_", length = 20)
	public String getFkfs() {
		return fkfs;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Column(name = "TOTAL_AMT__")
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20)
	public String getOutNo() {
		return outNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
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
		return "Tbih16b [ih16bId=" + ih16bId + ",compId=" + compId
				+ ",ladingNo=" + ladingNo + ",ladingNoF=" + ladingNoF
				+ ",ladingDate=" + ladingDate + ",ladingEffectS="
				+ ladingEffectS + ",ladingEffectE=" + ladingEffectE
				+ ",orderNo=" + orderNo + ",orderItem=" + orderItem
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",qb=" + qb + ",dc=" + dc
				+ ",gradeNo=" + gradeNo + ",steelNo=" + steelNo + ",size="
				+ size + ",thick=" + thick + ",width=" + width + ",length="
				+ length + ",ownnerCompNo=" + ownnerCompNo + ",ownnerCompName="
				+ ownnerCompName + ",custNo=" + custNo + ",custName="
				+ custName + ",carrierNo=" + carrierNo + ",carrierName="
				+ carrierName + ",receiptCompNo=" + receiptCompNo
				+ ",receiptCompName=" + receiptCompName + ",dsNo=" + dsNo
				+ ",dsName=" + dsName + ",contNo=" + contNo + ",contractNo="
				+ contractNo + ",tranOrderNo=" + tranOrderNo + ",orderCompNo="
				+ orderCompNo + ",orderCompName=" + orderCompName
				+ ",payCompNo=" + payCompNo + ",payCompName=" + payCompName
				+ ",shr=" + shr + ",sno=" + sno + ",outWareCode=" + outWareCode
				+ ",startAddress=" + startAddress + ",endAddress=" + endAddress
				+ ",receiptWareCode=" + receiptWareCode + ",tranType="
				+ tranType + ",settleType=" + settleType + ",ladingWgt="
				+ ladingWgt + ",stl=" + stl + ",wtl=" + wtl + ",kdzxcs="
				+ kdzxcs + ",jkqrtjZfy=" + jkqrtjZfy + ",qrphZfy=" + qrphZfy
				+ ",yh=" + yh + ",thkxr=" + thkxr + ",ladingEmp=" + ladingEmp
				+ ",ladingPhoneno=" + ladingPhoneno + ",contPrice=" + contPrice
				+ ",fkfs=" + fkfs + ",totalAmt=" + totalAmt + ",status="
				+ status + ",outNo=" + outNo + ",transNo=" + transNo + ",by1="
				+ by1 + ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5="
				+ by5 + ",by6=" + by6 + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

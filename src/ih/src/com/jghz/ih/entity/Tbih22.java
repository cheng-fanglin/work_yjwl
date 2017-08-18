package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih22:TBIH22(物流订单表)
 */
@Entity
@Table(name = "tbih22")
public class Tbih22 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih22Id;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih21Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 协议号:协议号
	 */
	@PropertyDef(label = "协议号", description = "协议号:协议号")
	private String contNo;

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
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 订单类型:订单类型
	 */
	@PropertyDef(label = "订单类型", description = "订单类型:订单类型")
	private String orderType;

	/**
	 * 订货方式:订货方式
	 */
	@PropertyDef(label = "订货方式", description = "订货方式:订货方式")
	private String orderMethod;

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
	 * 产品形态:产品形态
	 */
	@PropertyDef(label = "产品形态", description = "产品形态:产品形态")
	private String productModality;

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
	 * 生产厂:生产厂
	 */
	@PropertyDef(label = "生产厂", description = "生产厂:生产厂")
	private String factory;

	/**
	 * 标准全名:标准全名
	 */
	@PropertyDef(label = "标准全名", description = "标准全名:标准全名")
	private String standardName;

	/**
	 * 用途码:用途码
	 */
	@PropertyDef(label = "用途码", description = "用途码:用途码")
	private String useType;

	/**
	 * 交货日期:交货日期
	 */
	@PropertyDef(label = "交货日期", description = "交货日期:交货日期")
	private String deliveryDate;

	/**
	 * 订单量:订单量
	 */
	@PropertyDef(label = "订单量", description = "订单量:订单量")
	private BigDecimal orderWgt;

	/**
	 * 已开发货量:已开发货量
	 */
	@PropertyDef(label = "已开发货量", description = "已开发货量:已开发货量")
	private BigDecimal ladingWgt;

	/**
	 * 已出货量:已出货量
	 */
	@PropertyDef(label = "已出货量", description = "已出货量:已出货量")
	private BigDecimal outWgt;

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
	 * 重点合同类型:重点合同类型
	 */
	@PropertyDef(label = "重点合同类型", description = "重点合同类型:重点合同类型")
	private String impContType;

	/**
	 * 钢质:钢质
	 */
	@PropertyDef(label = "钢质", description = "钢质:钢质")
	private String steel;

	/**
	 * 尺寸信息:尺寸信息
	 */
	@PropertyDef(label = "尺寸信息", description = "尺寸信息:尺寸信息")
	private String size;

	/**
	 * 交货状态:交货状态
	 */
	@PropertyDef(label = "交货状态", description = "交货状态:交货状态")
	private String deliveryStatus;

	/**
	 * 加喷内容:加喷内容
	 */
	@PropertyDef(label = "加喷内容", description = "加喷内容:加喷内容")
	private String sprayContext;

	/**
	 * 计重方式:计重方式
	 */
	@PropertyDef(label = "计重方式", description = "计重方式:计重方式")
	private String unit;

	/**
	 * 指定长度:指定长度
	 */
	@PropertyDef(label = "指定长度", description = "指定长度:指定长度")
	private BigDecimal zdLength;

	/**
	 * 喷漆颜色:喷漆颜色
	 */
	@PropertyDef(label = "喷漆颜色", description = "喷漆颜色:喷漆颜色")
	private String sprayColor;

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
	 * 终点:终点
	 */
	@PropertyDef(label = "终点", description = "终点:终点")
	private String endStation;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

	/**
	 * 南钢合同编号:南钢合同编号
	 */
	@PropertyDef(label = "南钢合同编号", description = "南钢合同编号:南钢合同编号")
	private String ngContNo;

	/**
	 * 承运商编号:承运商编号
	 */
	@PropertyDef(label = "承运商编号", description = "承运商编号:承运商编号")
	private String carrierNo;

	/**
	 * 承运商:承运商
	 */
	@PropertyDef(label = "承运商", description = "承运商:承运商")
	private String carrierName;

	/**
	 * 是否直销:是否直销
	 */
	@PropertyDef(label = "是否直销", description = "是否直销:是否直销")
	private String ifZx;

	/**
	 * 车型:车型
	 */
	@PropertyDef(label = "车型", description = "车型:车型")
	private String carType;

	/**
	 * 运费单价:运费单价
	 */
	@PropertyDef(label = "运费单价", description = "运费单价:运费单价")
	private BigDecimal transPrice;

	/**
	 * 块数:块数
	 */
	@PropertyDef(label = "块数", description = "块数:块数")
	private BigDecimal orderNum;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String memo;

	/**
	 * 销售人员:销售人员
	 */
	@PropertyDef(label = "销售人员", description = "销售人员:销售人员")
	private String saleEmp;

	/**
	 * 一票制运费单价:一票制运费单价
	 */
	@PropertyDef(label = "一票制运费单价", description = "一票制运费单价:一票制运费单价")
	private BigDecimal transPriceYpz;

	/**
	 * 一票制加工单价:一票制加工单价
	 */
	@PropertyDef(label = "一票制加工单价", description = "一票制加工单价:一票制加工单价")
	private BigDecimal proPriceYpz;

	/**
	 * 毛边板:毛边板
	 */
	@PropertyDef(label = "毛边板", description = "毛边板:毛边板")
	private BigDecimal mbb;

	/**
	 * 单价:单价
	 */
	@PropertyDef(label = "单价", description = "单价:单价")
	private BigDecimal price;

	/**
	 * 接单注意事项:接单注意事项
	 */
	@PropertyDef(label = "接单注意事项", description = "接单注意事项:接单注意事项")
	private String memoImpor;

	/**
	 * 是否为重点客户:是否为重点客户
	 */
	@PropertyDef(label = "是否为重点客户", description = "是否为重点客户:是否为重点客户")
	private String ifImporCust;

	/**
	 * 产品规范编号:产品规范编号
	 */
	@PropertyDef(label = "产品规范编号", description = "产品规范编号:产品规范编号")
	private String prodStandNo;

	/**
	 * 侧喷内容:侧喷内容
	 */
	@PropertyDef(label = "侧喷内容", description = "侧喷内容:侧喷内容")
	private String sideSpray;

	/**
	 * 检查机关手动输入:检查机关手动输入
	 */
	@PropertyDef(label = "检查机关手动输入", description = "检查机关手动输入:检查机关手动输入")
	private String jcjgsdsr;

	/**
	 * 检查机关:检查机关
	 */
	@PropertyDef(label = "检查机关", description = "检查机关:检查机关")
	private String jcjg;

	/**
	 * 是否第三方认证:是否第三方认证
	 */
	@PropertyDef(label = "是否第三方认证", description = "是否第三方认证:是否第三方认证")
	private String ifThree;

	/**
	 * 船号:船号
	 */
	@PropertyDef(label = "船号", description = "船号:船号")
	private String shipNo;

	/**
	 * 是否重点订单:是否重点订单
	 */
	@PropertyDef(label = "是否重点订单", description = "是否重点订单:是否重点订单")
	private String ifImporOrder;

	/**
	 * 订单项次总价:订单项次总价
	 */
	@PropertyDef(label = "订单项次总价", description = "订单项次总价:订单项次总价")
	private String orderItemAmt;

	/**
	 * 指定厂:指定厂
	 */
	@PropertyDef(label = "指定厂", description = "指定厂:指定厂")
	private String assignFactory;

	/**
	 * 质量设计返回生产厂:质量设计返回生产厂
	 */
	@PropertyDef(label = "质量设计返回生产厂", description = "质量设计返回生产厂:质量设计返回生产厂")
	private String returnFactory;

	/**
	 * 合同月份:合同月份
	 */
	@PropertyDef(label = "合同月份", description = "合同月份:合同月份")
	private String contYm;

	/**
	 * 仓库:仓库
	 */
	@PropertyDef(label = "仓库", description = "仓库:仓库")
	private String wareName;

	/**
	 * 仓库编码:仓库编码
	 */
	@PropertyDef(label = "仓库编码", description = "仓库编码:仓库编码")
	private String wareCode;

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
	 * 终点专用线:终点专用线
	 */
	@PropertyDef(label = "终点专用线", description = "终点专用线:终点专用线")
	private String endLine;

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
	 * 生产日期:生产日期
	 */
	@PropertyDef(label = "生产日期", description = "生产日期:生产日期")
	private String productDate;

	/**
	 * 质量防护:质量防护
	 */
	@PropertyDef(label = "质量防护", description = "质量防护:质量防护")
	private String qfh;

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
	 * 联系人:联系人
	 */
	@PropertyDef(label = "联系人", description = "联系人:联系人")
	private String pemp;

	/**
	 * 电话:电话
	 */
	@PropertyDef(label = "电话", description = "电话:电话")
	private String telephone;

	/**
	 * 操作人员:操作人员
	 */
	@PropertyDef(label = "操作人员", description = "操作人员:操作人员")
	private String czemp;

	/**
	 * 货源:货源
	 */
	@PropertyDef(label = "货源", description = "货源:货源")
	private String source;

	/**
	 * 提单号:提单号
	 */
	@PropertyDef(label = "提单号", description = "提单号:提单号")
	private String ladingNo;

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

	public Tbih22() {
		super();
	}

	public Tbih22(String ih22Id, String ih21Id, String compId, String contNo,
			String orderNo, String orderItem, String status, String orderType,
			String orderMethod, String custNo, String custName,
			String productModality, String gradeNo, String steelNo,
			BigDecimal thick, BigDecimal width, BigDecimal length,
			String factory, String standardName, String useType,
			String deliveryDate, BigDecimal orderWgt, BigDecimal ladingWgt,
			BigDecimal outWgt, String prodType, String prodTypeName,
			String productNo, String productName, String productDetail,
			String impContType, String steel, String size,
			String deliveryStatus, String sprayContext, String unit,
			BigDecimal zdLength, String sprayColor, String receiptCompNo,
			String receiptCompName, String endStation, String tranType,
			String ngContNo, String carrierNo, String carrierName, String ifZx,
			String carType, BigDecimal transPrice, BigDecimal orderNum,
			String memo, String saleEmp, BigDecimal transPriceYpz,
			BigDecimal proPriceYpz, BigDecimal mbb, BigDecimal price,
			String memoImpor, String ifImporCust, String prodStandNo,
			String sideSpray, String jcjgsdsr, String jcjg, String ifThree,
			String shipNo, String ifImporOrder, String orderItemAmt,
			String assignFactory, String returnFactory, String contYm,
			String wareName, String wareCode, String startStation,
			String startLine, String endLine, String orderCompNo,
			String orderCompName, String productDate, String qfh,
			String billCompNo, String billCompName, String pemp,
			String telephone, String czemp, String source, String ladingNo,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.ih22Id = ih22Id;
		this.ih21Id = ih21Id;
		this.compId = compId;
		this.contNo = contNo;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.status = status;
		this.orderType = orderType;
		this.orderMethod = orderMethod;
		this.custNo = custNo;
		this.custName = custName;
		this.productModality = productModality;
		this.gradeNo = gradeNo;
		this.steelNo = steelNo;
		this.thick = thick;
		this.width = width;
		this.length = length;
		this.factory = factory;
		this.standardName = standardName;
		this.useType = useType;
		this.deliveryDate = deliveryDate;
		this.orderWgt = orderWgt;
		this.ladingWgt = ladingWgt;
		this.outWgt = outWgt;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.impContType = impContType;
		this.steel = steel;
		this.size = size;
		this.deliveryStatus = deliveryStatus;
		this.sprayContext = sprayContext;
		this.unit = unit;
		this.zdLength = zdLength;
		this.sprayColor = sprayColor;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.endStation = endStation;
		this.tranType = tranType;
		this.ngContNo = ngContNo;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.ifZx = ifZx;
		this.carType = carType;
		this.transPrice = transPrice;
		this.orderNum = orderNum;
		this.memo = memo;
		this.saleEmp = saleEmp;
		this.transPriceYpz = transPriceYpz;
		this.proPriceYpz = proPriceYpz;
		this.mbb = mbb;
		this.price = price;
		this.memoImpor = memoImpor;
		this.ifImporCust = ifImporCust;
		this.prodStandNo = prodStandNo;
		this.sideSpray = sideSpray;
		this.jcjgsdsr = jcjgsdsr;
		this.jcjg = jcjg;
		this.ifThree = ifThree;
		this.shipNo = shipNo;
		this.ifImporOrder = ifImporOrder;
		this.orderItemAmt = orderItemAmt;
		this.assignFactory = assignFactory;
		this.returnFactory = returnFactory;
		this.contYm = contYm;
		this.wareName = wareName;
		this.wareCode = wareCode;
		this.startStation = startStation;
		this.startLine = startLine;
		this.endLine = endLine;
		this.orderCompNo = orderCompNo;
		this.orderCompName = orderCompName;
		this.productDate = productDate;
		this.qfh = qfh;
		this.billCompNo = billCompNo;
		this.billCompName = billCompName;
		this.pemp = pemp;
		this.telephone = telephone;
		this.czemp = czemp;
		this.source = source;
		this.ladingNo = ladingNo;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh22Id(String ih22Id) {
		this.ih22Id = ih22Id;
	}

	@Id
	@Column(name = "IH22_ID_", length = 50, nullable = false)
	public String getIh22Id() {
		return ih22Id;
	}

	public void setIh21Id(String ih21Id) {
		this.ih21Id = ih21Id;
	}

	@Column(name = "IH21_ID_", length = 50)
	public String getIh21Id() {
		return ih21Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20, unique = true)
	public String getContNo() {
		return contNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "ORDER_NO_", length = 20, unique = true)
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

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Column(name = "ORDER_TYPE_", length = 8, unique = true)
	public String getOrderType() {
		return orderType;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	@Column(name = "ORDER_METHOD_", length = 8)
	public String getOrderMethod() {
		return orderMethod;
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

	public void setProductModality(String productModality) {
		this.productModality = productModality;
	}

	@Column(name = "PRODUCT_MODALITY_", length = 40)
	public String getProductModality() {
		return productModality;
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

	public void setFactory(String factory) {
		this.factory = factory;
	}

	@Column(name = "FACTORY_", length = 50)
	public String getFactory() {
		return factory;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

	@Column(name = "STANDARD_NAME_", length = 50)
	public String getStandardName() {
		return standardName;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	@Column(name = "USE_TYPE_", length = 50)
	public String getUseType() {
		return useType;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Column(name = "DELIVERY_DATE_", length = 20)
	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setOrderWgt(BigDecimal orderWgt) {
		this.orderWgt = orderWgt;
	}

	@Column(name = "ORDER_WGT_")
	public BigDecimal getOrderWgt() {
		return orderWgt;
	}

	public void setLadingWgt(BigDecimal ladingWgt) {
		this.ladingWgt = ladingWgt;
	}

	@Column(name = "LADING_WGT_")
	public BigDecimal getLadingWgt() {
		return ladingWgt;
	}

	public void setOutWgt(BigDecimal outWgt) {
		this.outWgt = outWgt;
	}

	@Column(name = "OUT_WGT_")
	public BigDecimal getOutWgt() {
		return outWgt;
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

	public void setImpContType(String impContType) {
		this.impContType = impContType;
	}

	@Column(name = "IMP_CONT_TYPE_", length = 50)
	public String getImpContType() {
		return impContType;
	}

	public void setSteel(String steel) {
		this.steel = steel;
	}

	@Column(name = "STEEL_", length = 40)
	public String getSteel() {
		return steel;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SIZE_", length = 40)
	public String getSize() {
		return size;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Column(name = "DELIVERY_STATUS_", length = 20)
	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setSprayContext(String sprayContext) {
		this.sprayContext = sprayContext;
	}

	@Column(name = "SPRAY_CONTEXT_", length = 500)
	public String getSprayContext() {
		return sprayContext;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "UNIT_", length = 20)
	public String getUnit() {
		return unit;
	}

	public void setZdLength(BigDecimal zdLength) {
		this.zdLength = zdLength;
	}

	@Column(name = "ZD_LENGTH_")
	public BigDecimal getZdLength() {
		return zdLength;
	}

	public void setSprayColor(String sprayColor) {
		this.sprayColor = sprayColor;
	}

	@Column(name = "SPRAY_COLOR_", length = 100)
	public String getSprayColor() {
		return sprayColor;
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

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Column(name = "END_STATION_", length = 50)
	public String getEndStation() {
		return endStation;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 50)
	public String getTranType() {
		return tranType;
	}

	public void setNgContNo(String ngContNo) {
		this.ngContNo = ngContNo;
	}

	@Column(name = "NG_CONT_NO_", length = 50)
	public String getNgContNo() {
		return ngContNo;
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

	public void setIfZx(String ifZx) {
		this.ifZx = ifZx;
	}

	@Column(name = "IF_ZX_", length = 50)
	public String getIfZx() {
		return ifZx;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Column(name = "CAR_TYPE_", length = 50)
	public String getCarType() {
		return carType;
	}

	public void setTransPrice(BigDecimal transPrice) {
		this.transPrice = transPrice;
	}

	@Column(name = "TRANS_PRICE_")
	public BigDecimal getTransPrice() {
		return transPrice;
	}

	public void setOrderNum(BigDecimal orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name = "ORDER_NUM_")
	public BigDecimal getOrderNum() {
		return orderNum;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 500)
	public String getMemo() {
		return memo;
	}

	public void setSaleEmp(String saleEmp) {
		this.saleEmp = saleEmp;
	}

	@Column(name = "SALE_EMP_", length = 50)
	public String getSaleEmp() {
		return saleEmp;
	}

	public void setTransPriceYpz(BigDecimal transPriceYpz) {
		this.transPriceYpz = transPriceYpz;
	}

	@Column(name = "TRANS_PRICE_YPZ_")
	public BigDecimal getTransPriceYpz() {
		return transPriceYpz;
	}

	public void setProPriceYpz(BigDecimal proPriceYpz) {
		this.proPriceYpz = proPriceYpz;
	}

	@Column(name = "PRO_PRICE_YPZ_")
	public BigDecimal getProPriceYpz() {
		return proPriceYpz;
	}

	public void setMbb(BigDecimal mbb) {
		this.mbb = mbb;
	}

	@Column(name = "MBB_")
	public BigDecimal getMbb() {
		return mbb;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setMemoImpor(String memoImpor) {
		this.memoImpor = memoImpor;
	}

	@Column(name = "MEMO_IMPOR_", length = 500)
	public String getMemoImpor() {
		return memoImpor;
	}

	public void setIfImporCust(String ifImporCust) {
		this.ifImporCust = ifImporCust;
	}

	@Column(name = "IF_IMPOR_CUST_", length = 20)
	public String getIfImporCust() {
		return ifImporCust;
	}

	public void setProdStandNo(String prodStandNo) {
		this.prodStandNo = prodStandNo;
	}

	@Column(name = "PROD_STAND_NO_", length = 100)
	public String getProdStandNo() {
		return prodStandNo;
	}

	public void setSideSpray(String sideSpray) {
		this.sideSpray = sideSpray;
	}

	@Column(name = "SIDE_SPRAY_", length = 100)
	public String getSideSpray() {
		return sideSpray;
	}

	public void setJcjgsdsr(String jcjgsdsr) {
		this.jcjgsdsr = jcjgsdsr;
	}

	@Column(name = "JCJGSDSR_", length = 100)
	public String getJcjgsdsr() {
		return jcjgsdsr;
	}

	public void setJcjg(String jcjg) {
		this.jcjg = jcjg;
	}

	@Column(name = "JCJG_", length = 100)
	public String getJcjg() {
		return jcjg;
	}

	public void setIfThree(String ifThree) {
		this.ifThree = ifThree;
	}

	@Column(name = "IF_THREE_", length = 100)
	public String getIfThree() {
		return ifThree;
	}

	public void setShipNo(String shipNo) {
		this.shipNo = shipNo;
	}

	@Column(name = "SHIP_NO_", length = 20)
	public String getShipNo() {
		return shipNo;
	}

	public void setIfImporOrder(String ifImporOrder) {
		this.ifImporOrder = ifImporOrder;
	}

	@Column(name = "IF_IMPOR_ORDER_", length = 20)
	public String getIfImporOrder() {
		return ifImporOrder;
	}

	public void setOrderItemAmt(String orderItemAmt) {
		this.orderItemAmt = orderItemAmt;
	}

	@Column(name = "ORDER_ITEM_AMT_", length = 20)
	public String getOrderItemAmt() {
		return orderItemAmt;
	}

	public void setAssignFactory(String assignFactory) {
		this.assignFactory = assignFactory;
	}

	@Column(name = "ASSIGN_FACTORY_", length = 20)
	public String getAssignFactory() {
		return assignFactory;
	}

	public void setReturnFactory(String returnFactory) {
		this.returnFactory = returnFactory;
	}

	@Column(name = "RETURN_FACTORY_", length = 20)
	public String getReturnFactory() {
		return returnFactory;
	}

	public void setContYm(String contYm) {
		this.contYm = contYm;
	}

	@Column(name = "CONT_YM_", length = 20)
	public String getContYm() {
		return contYm;
	}

	public void setWareName(String wareName) {
		this.wareName = wareName;
	}

	@Column(name = "WARE_NAME_", length = 100)
	public String getWareName() {
		return wareName;
	}

	public void setWareCode(String wareCode) {
		this.wareCode = wareCode;
	}

	@Column(name = "WARE_CODE_", length = 20)
	public String getWareCode() {
		return wareCode;
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

	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}

	@Column(name = "END_LINE_", length = 50)
	public String getEndLine() {
		return endLine;
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

	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	@Column(name = "PRODUCT_DATE", length = 20)
	public String getProductDate() {
		return productDate;
	}

	public void setQfh(String qfh) {
		this.qfh = qfh;
	}

	@Column(name = "QFH_", length = 10)
	public String getQfh() {
		return qfh;
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

	public void setPemp(String pemp) {
		this.pemp = pemp;
	}

	@Column(name = "PEMP_", length = 50)
	public String getPemp() {
		return pemp;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "TELEPHONE_", length = 50)
	public String getTelephone() {
		return telephone;
	}

	public void setCzemp(String czemp) {
		this.czemp = czemp;
	}

	@Column(name = "CZEMP_", length = 50)
	public String getCzemp() {
		return czemp;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "SOURCE_", length = 50)
	public String getSource() {
		return source;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
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
		return "Tbih22 [ih22Id=" + ih22Id + ",ih21Id=" + ih21Id + ",compId="
				+ compId + ",contNo=" + contNo + ",orderNo=" + orderNo
				+ ",orderItem=" + orderItem + ",status=" + status
				+ ",orderType=" + orderType + ",orderMethod=" + orderMethod
				+ ",custNo=" + custNo + ",custName=" + custName
				+ ",productModality=" + productModality + ",gradeNo=" + gradeNo
				+ ",steelNo=" + steelNo + ",thick=" + thick + ",width=" + width
				+ ",length=" + length + ",factory=" + factory
				+ ",standardName=" + standardName + ",useType=" + useType
				+ ",deliveryDate=" + deliveryDate + ",orderWgt=" + orderWgt
				+ ",ladingWgt=" + ladingWgt + ",outWgt=" + outWgt
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",impContType="
				+ impContType + ",steel=" + steel + ",size=" + size
				+ ",deliveryStatus=" + deliveryStatus + ",sprayContext="
				+ sprayContext + ",unit=" + unit + ",zdLength=" + zdLength
				+ ",sprayColor=" + sprayColor + ",receiptCompNo="
				+ receiptCompNo + ",receiptCompName=" + receiptCompName
				+ ",endStation=" + endStation + ",tranType=" + tranType
				+ ",ngContNo=" + ngContNo + ",carrierNo=" + carrierNo
				+ ",carrierName=" + carrierName + ",ifZx=" + ifZx + ",carType="
				+ carType + ",transPrice=" + transPrice + ",orderNum="
				+ orderNum + ",memo=" + memo + ",saleEmp=" + saleEmp
				+ ",transPriceYpz=" + transPriceYpz + ",proPriceYpz="
				+ proPriceYpz + ",mbb=" + mbb + ",price=" + price
				+ ",memoImpor=" + memoImpor + ",ifImporCust=" + ifImporCust
				+ ",prodStandNo=" + prodStandNo + ",sideSpray=" + sideSpray
				+ ",jcjgsdsr=" + jcjgsdsr + ",jcjg=" + jcjg + ",ifThree="
				+ ifThree + ",shipNo=" + shipNo + ",ifImporOrder="
				+ ifImporOrder + ",orderItemAmt=" + orderItemAmt
				+ ",assignFactory=" + assignFactory + ",returnFactory="
				+ returnFactory + ",contYm=" + contYm + ",wareName=" + wareName
				+ ",wareCode=" + wareCode + ",startStation=" + startStation
				+ ",startLine=" + startLine + ",endLine=" + endLine
				+ ",orderCompNo=" + orderCompNo + ",orderCompName="
				+ orderCompName + ",productDate=" + productDate + ",qfh=" + qfh
				+ ",billCompNo=" + billCompNo + ",billCompName=" + billCompName
				+ ",pemp=" + pemp + ",telephone=" + telephone + ",czemp="
				+ czemp + ",source=" + source + ",ladingNo=" + ladingNo
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih21b:TBIH21B(协议价格定义)
 */
@Entity
@Table(name = "tbih21b")
public class Tbih21b implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih21bId;

	/**
	 * 主表主键:主表主键
	 */
	@PropertyDef(label = "主表主键", description = "主表主键:主表主键")
	private String ih21Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 序号:序号
	 */
	@PropertyDef(label = "序号", description = "序号:序号")
	private String sno;

	/**
	 * 协议号:协议号
	 */
	@PropertyDef(label = "协议号", description = "协议号:协议号")
	private String contNo;

	/**
	 * 客户编码:客户编码
	 */
	@PropertyDef(label = "客户编码", description = "客户编码:客户编码")
	private String custNo;

	/**
	 * 客户:客户
	 */
	@PropertyDef(label = "客户", description = "客户:客户")
	private String custName;

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
	 * 协议量:协议量
	 */
	@PropertyDef(label = "协议量", description = "协议量:协议量")
	private BigDecimal contWgt;

	/**
	 * 存储周期:存储周期
	 */
	@PropertyDef(label = "存储周期", description = "存储周期:存储周期")
	private BigDecimal cycle;

	/**
	 * 仓储单价:仓储单价
	 */
	@PropertyDef(label = "仓储单价", description = "仓储单价:仓储单价")
	private BigDecimal storagePrice;

	/**
	 * 运输单价:运输单价
	 */
	@PropertyDef(label = "运输单价", description = "运输单价:运输单价")
	private BigDecimal tranPrice;

	/**
	 * 优惠单价:优惠单价
	 */
	@PropertyDef(label = "优惠单价", description = "优惠单价:优惠单价")
	private BigDecimal discountPrice;

	/**
	 * 超期价:超期价
	 */
	@PropertyDef(label = "超期价", description = "超期价:超期价")
	private BigDecimal overduePrice;

	/**
	 * 吊装价格:吊装价格
	 */
	@PropertyDef(label = "吊装价格", description = "吊装价格:吊装价格")
	private BigDecimal liftingPrice;

	/**
	 * 保险价格:保险价格
	 */
	@PropertyDef(label = "保险价格", description = "保险价格:保险价格")
	private BigDecimal premiumsPrice;

	/**
	 * 特殊加收费用单价:特殊加收费用单价
	 */
	@PropertyDef(label = "特殊加收费用单价", description = "特殊加收费用单价:特殊加收费用单价")
	private BigDecimal orderPrice;

	/**
	 * 返还价格:返还价格
	 */
	@PropertyDef(label = "返还价格", description = "返还价格:返还价格")
	private BigDecimal returnPrice;

	/**
	 * 翻堆价格:翻堆价格
	 */
	@PropertyDef(label = "翻堆价格", description = "翻堆价格:翻堆价格")
	private BigDecimal turnningPrice;

	/**
	 * 备用单价1:备用单价1
	 */
	@PropertyDef(label = "备用单价1", description = "备用单价1:备用单价1")
	private BigDecimal bprice1;

	/**
	 * 备用单价2:备用单价2
	 */
	@PropertyDef(label = "备用单价2", description = "备用单价2:备用单价2")
	private BigDecimal bprice2;

	/**
	 * 协议价:协议价
	 */
	@PropertyDef(label = "协议价", description = "协议价:协议价")
	private BigDecimal price;

	/**
	 * 服务类型:服务类型
	 */
	@PropertyDef(label = "服务类型", description = "服务类型:服务类型")
	private String fwlx;

	/**
	 * 价格类型:价格类型
	 */
	@PropertyDef(label = "价格类型", description = "价格类型:价格类型")
	private String priceType;

	/**
	 * 结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)
	 */
	@PropertyDef(label = "结算方式(1日结2月结3自定义日期)", description = "结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)")
	private String settleType;

	/**
	 * 付款方式:付款方式
	 */
	@PropertyDef(label = "付款方式", description = "付款方式:付款方式")
	private String payType;

	/**
	 * 库别:库别
	 */
	@PropertyDef(label = "库别", description = "库别:库别")
	private String kb;

	/**
	 * 超期标志:超期标志
	 */
	@PropertyDef(label = "超期标志", description = "超期标志:超期标志")
	private String isOverdue;

	/**
	 * 仓储管理标志:仓储管理标志
	 */
	@PropertyDef(label = "仓储管理标志", description = "仓储管理标志:仓储管理标志")
	private String isStorage;

	/**
	 * 优惠政策标志:优惠政策标志
	 */
	@PropertyDef(label = "优惠政策标志", description = "优惠政策标志:优惠政策标志")
	private String isDiscount;

	/**
	 * 保险费标志:保险费标志
	 */
	@PropertyDef(label = "保险费标志", description = "保险费标志:保险费标志")
	private String isPremiums;

	/**
	 * 运输费标志:运输费标志
	 */
	@PropertyDef(label = "运输费标志", description = "运输费标志:运输费标志")
	private String isTran;

	/**
	 * 吊装标志:吊装标志
	 */
	@PropertyDef(label = "吊装标志", description = "吊装标志:吊装标志")
	private String isLifting;

	/**
	 * 仓储管理费状态:仓储管理费状态
	 */
	@PropertyDef(label = "仓储管理费状态", description = "仓储管理费状态:仓储管理费状态")
	private String isManager;

	/**
	 * 翻堆费结算状态:翻堆费结算状态
	 */
	@PropertyDef(label = "翻堆费结算状态", description = "翻堆费结算状态:翻堆费结算状态")
	private String isTurnning;

	/**
	 * 特殊价格费结算状态:特殊价格费结算状态
	 */
	@PropertyDef(label = "特殊价格费结算状态", description = "特殊价格费结算状态:特殊价格费结算状态")
	private String isOrder;

	/**
	 * 是否启用:是否启用
	 */
	@PropertyDef(label = "是否启用", description = "是否启用:是否启用")
	private String isuse;

	/**
	 * 启用时间:启用时间
	 */
	@PropertyDef(label = "启用时间", description = "启用时间:启用时间")
	private String useDate;

	/**
	 * 启用人:启用人
	 */
	@PropertyDef(label = "启用人", description = "启用人:启用人")
	private String useEmp;

	/**
	 * 停用时间:停用时间
	 */
	@PropertyDef(label = "停用时间", description = "停用时间:停用时间")
	private String stopDate;

	/**
	 * 停用人:停用人
	 */
	@PropertyDef(label = "停用人", description = "停用人:停用人")
	private String stopEmp;

	/**
	 * 方案号:方案号
	 */
	@PropertyDef(label = "方案号", description = "方案号:方案号")
	private String fno;

	/**
	 * 物流线路:物流线路
	 */
	@PropertyDef(label = "物流线路", description = "物流线路:物流线路")
	private String troad;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

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

	public Tbih21b() {
		super();
	}

	public Tbih21b(String ih21bId, String ih21Id, String compId, String sno,
			String contNo, String custNo, String custName, String prodType,
			String prodTypeName, String productNo, String productName,
			String productDetail, String gradeNo, String steelNo,
			BigDecimal contWgt, BigDecimal cycle, BigDecimal storagePrice,
			BigDecimal tranPrice, BigDecimal discountPrice,
			BigDecimal overduePrice, BigDecimal liftingPrice,
			BigDecimal premiumsPrice, BigDecimal orderPrice,
			BigDecimal returnPrice, BigDecimal turnningPrice,
			BigDecimal bprice1, BigDecimal bprice2, BigDecimal price,
			String fwlx, String priceType, String settleType, String payType,
			String kb, String isOverdue, String isStorage, String isDiscount,
			String isPremiums, String isTran, String isLifting,
			String isManager, String isTurnning, String isOrder, String isuse,
			String useDate, String useEmp, String stopDate, String stopEmp,
			String fno, String troad, String tranType, String startStation,
			String startLine, String endStation, String endLine, String by1,
			String by2, String by3, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version,
			BigDecimal startDate, BigDecimal endDate,
			BigDecimal overdueStdPrice, String overdueType) {
		super();
		this.ih21bId = ih21bId;
		this.ih21Id = ih21Id;
		this.compId = compId;
		this.sno = sno;
		this.contNo = contNo;
		this.custNo = custNo;
		this.custName = custName;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.gradeNo = gradeNo;
		this.steelNo = steelNo;
		this.contWgt = contWgt;
		this.cycle = cycle;
		this.storagePrice = storagePrice;
		this.tranPrice = tranPrice;
		this.discountPrice = discountPrice;
		this.overduePrice = overduePrice;
		this.liftingPrice = liftingPrice;
		this.premiumsPrice = premiumsPrice;
		this.orderPrice = orderPrice;
		this.returnPrice = returnPrice;
		this.turnningPrice = turnningPrice;
		this.bprice1 = bprice1;
		this.bprice2 = bprice2;
		this.price = price;
		this.fwlx = fwlx;
		this.priceType = priceType;
		this.settleType = settleType;
		this.payType = payType;
		this.kb = kb;
		this.isOverdue = isOverdue;
		this.isStorage = isStorage;
		this.isDiscount = isDiscount;
		this.isPremiums = isPremiums;
		this.isTran = isTran;
		this.isLifting = isLifting;
		this.isManager = isManager;
		this.isTurnning = isTurnning;
		this.isOrder = isOrder;
		this.isuse = isuse;
		this.useDate = useDate;
		this.useEmp = useEmp;
		this.stopDate = stopDate;
		this.stopEmp = stopEmp;
		this.fno = fno;
		this.troad = troad;
		this.tranType = tranType;
		this.startStation = startStation;
		this.startLine = startLine;
		this.endStation = endStation;
		this.endLine = endLine;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.startDate = startDate;
		this.endDate = endDate;
		this.overdueStdPrice = overdueStdPrice;
		this.overdueType = overdueType;
	}

	public void setIh21bId(String ih21bId) {
		this.ih21bId = ih21bId;
	}

	@Id
	@Column(name = "IH21B_ID_", length = 50, nullable = false)
	public String getIh21bId() {
		return ih21bId;
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

	public void setSno(String sno) {
		this.sno = sno;
	}

	@Column(name = "SNO_", length = 20, unique = true)
	public String getSno() {
		return sno;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20, unique = true)
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

	public void setContWgt(BigDecimal contWgt) {
		this.contWgt = contWgt;
	}

	@Column(name = "CONT_WGT_")
	public BigDecimal getContWgt() {
		return contWgt;
	}

	public void setCycle(BigDecimal cycle) {
		this.cycle = cycle;
	}

	@Column(name = "CYCLE_")
	public BigDecimal getCycle() {
		return cycle;
	}

	public void setStoragePrice(BigDecimal storagePrice) {
		this.storagePrice = storagePrice;
	}

	@Column(name = "STORAGE_PRICE_")
	public BigDecimal getStoragePrice() {
		return storagePrice;
	}

	public void setTranPrice(BigDecimal tranPrice) {
		this.tranPrice = tranPrice;
	}

	@Column(name = "TRAN_PRICE_")
	public BigDecimal getTranPrice() {
		return tranPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Column(name = "DISCOUNT_PRICE_")
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setOverduePrice(BigDecimal overduePrice) {
		this.overduePrice = overduePrice;
	}

	@Column(name = "OVERDUE_PRICE_")
	public BigDecimal getOverduePrice() {
		return overduePrice;
	}

	public void setLiftingPrice(BigDecimal liftingPrice) {
		this.liftingPrice = liftingPrice;
	}

	@Column(name = "LIFTING_PRICE_")
	public BigDecimal getLiftingPrice() {
		return liftingPrice;
	}

	public void setPremiumsPrice(BigDecimal premiumsPrice) {
		this.premiumsPrice = premiumsPrice;
	}

	@Column(name = "PREMIUMS_PRICE_")
	public BigDecimal getPremiumsPrice() {
		return premiumsPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Column(name = "ORDER_PRICE_")
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setReturnPrice(BigDecimal returnPrice) {
		this.returnPrice = returnPrice;
	}

	@Column(name = "RETURN_PRICE_")
	public BigDecimal getReturnPrice() {
		return returnPrice;
	}

	public void setTurnningPrice(BigDecimal turnningPrice) {
		this.turnningPrice = turnningPrice;
	}

	@Column(name = "TURNNING_PRICE_")
	public BigDecimal getTurnningPrice() {
		return turnningPrice;
	}

	public void setBprice1(BigDecimal bprice1) {
		this.bprice1 = bprice1;
	}

	@Column(name = "BPRICE1_")
	public BigDecimal getBprice1() {
		return bprice1;
	}

	public void setBprice2(BigDecimal bprice2) {
		this.bprice2 = bprice2;
	}

	@Column(name = "BPRICE2_")
	public BigDecimal getBprice2() {
		return bprice2;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setFwlx(String fwlx) {
		this.fwlx = fwlx;
	}

	@Column(name = "FWLX_", length = 20)
	public String getFwlx() {
		return fwlx;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	@Column(name = "PRICE_TYPE_", length = 20)
	public String getPriceType() {
		return priceType;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "PAY_TYPE_", length = 500)
	public String getPayType() {
		return payType;
	}

	public void setKb(String kb) {
		this.kb = kb;
	}

	@Column(name = "KB_", length = 20)
	public String getKb() {
		return kb;
	}

	public void setIsOverdue(String isOverdue) {
		this.isOverdue = isOverdue;
	}

	@Column(name = "IS_OVERDUE_", length = 2)
	public String getIsOverdue() {
		return isOverdue;
	}

	public void setIsStorage(String isStorage) {
		this.isStorage = isStorage;
	}

	@Column(name = "IS_STORAGE_", length = 2)
	public String getIsStorage() {
		return isStorage;
	}

	public void setIsDiscount(String isDiscount) {
		this.isDiscount = isDiscount;
	}

	@Column(name = "IS_DISCOUNT_", length = 2)
	public String getIsDiscount() {
		return isDiscount;
	}

	public void setIsPremiums(String isPremiums) {
		this.isPremiums = isPremiums;
	}

	@Column(name = "IS_PREMIUMS_", length = 2)
	public String getIsPremiums() {
		return isPremiums;
	}

	public void setIsTran(String isTran) {
		this.isTran = isTran;
	}

	@Column(name = "IS_TRAN_", length = 2)
	public String getIsTran() {
		return isTran;
	}

	public void setIsLifting(String isLifting) {
		this.isLifting = isLifting;
	}

	@Column(name = "IS_LIFTING_", length = 2)
	public String getIsLifting() {
		return isLifting;
	}

	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}

	@Column(name = "IS_MANAGER_", length = 20)
	public String getIsManager() {
		return isManager;
	}

	public void setIsTurnning(String isTurnning) {
		this.isTurnning = isTurnning;
	}

	@Column(name = "IS_TURNNING", length = 20)
	public String getIsTurnning() {
		return isTurnning;
	}

	public void setIsOrder(String isOrder) {
		this.isOrder = isOrder;
	}

	@Column(name = "IS_ORDER_", length = 20)
	public String getIsOrder() {
		return isOrder;
	}

	public void setIsuse(String isuse) {
		this.isuse = isuse;
	}

	@Column(name = "ISUSE_", length = 5)
	public String getIsuse() {
		return isuse;
	}

	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

	@Column(name = "USE_DATE_", length = 20)
	public String getUseDate() {
		return useDate;
	}

	public void setUseEmp(String useEmp) {
		this.useEmp = useEmp;
	}

	@Column(name = "USE_EMP_", length = 50)
	public String getUseEmp() {
		return useEmp;
	}

	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}

	@Column(name = "STOP_DATE_", length = 20)
	public String getStopDate() {
		return stopDate;
	}

	public void setStopEmp(String stopEmp) {
		this.stopEmp = stopEmp;
	}

	@Column(name = "STOP_EMP_", length = 50)
	public String getStopEmp() {
		return stopEmp;
	}

	public void setFno(String fno) {
		this.fno = fno;
	}

	@Column(name = "FNO_", length = 20)
	public String getFno() {
		return fno;
	}

	public void setTroad(String troad) {
		this.troad = troad;
	}

	@Column(name = "TROAD_", length = 20)
	public String getTroad() {
		return troad;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 50)
	public String getTranType() {
		return tranType;
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

	public String toString() {
		return "Tbih21b [ih21bId=" + ih21bId + ",ih21Id=" + ih21Id + ",compId="
				+ compId + ",sno=" + sno + ",contNo=" + contNo + ",custNo="
				+ custNo + ",custName=" + custName + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",productDetail="
				+ productDetail + ",gradeNo=" + gradeNo + ",steelNo=" + steelNo
				+ ",contWgt=" + contWgt + ",cycle=" + cycle + ",storagePrice="
				+ storagePrice + ",tranPrice=" + tranPrice + ",discountPrice="
				+ discountPrice + ",overduePrice=" + overduePrice
				+ ",liftingPrice=" + liftingPrice + ",premiumsPrice="
				+ premiumsPrice + ",orderPrice=" + orderPrice + ",returnPrice="
				+ returnPrice + ",turnningPrice=" + turnningPrice + ",bprice1="
				+ bprice1 + ",bprice2=" + bprice2 + ",price=" + price
				+ ",fwlx=" + fwlx + ",priceType=" + priceType + ",settleType="
				+ settleType + ",payType=" + payType + ",kb=" + kb
				+ ",isOverdue=" + isOverdue + ",isStorage=" + isStorage
				+ ",isDiscount=" + isDiscount + ",isPremiums=" + isPremiums
				+ ",isTran=" + isTran + ",isLifting=" + isLifting
				+ ",isManager=" + isManager + ",isTurnning=" + isTurnning
				+ ",isOrder=" + isOrder + ",isuse=" + isuse + ",useDate="
				+ useDate + ",useEmp=" + useEmp + ",stopDate=" + stopDate
				+ ",stopEmp=" + stopEmp + ",fno=" + fno + ",troad=" + troad
				+ ",tranType=" + tranType + ",startStation=" + startStation
				+ ",startLine=" + startLine + ",endStation=" + endStation
				+ ",endLine=" + endLine + ",by1=" + by1 + ",by2=" + by2
				+ ",by3=" + by3 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + ",startDate="
				+ startDate + ",endDate=" + endDate + ",overdueStdPrice="
				+ overdueStdPrice + ",overdueType=" + overdueType + "]";
	}

}

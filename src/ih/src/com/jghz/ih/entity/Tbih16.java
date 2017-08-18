package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih16:TBIH16(用户委托函整体信息表)
 */
@Entity
@Table(name = "tbih16")
public class Tbih16 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
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
	 * 提单号:提单号
	 */
	@PropertyDef(label = "提单号", description = "提单号:提单号")
	private String ladingNo;

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
	 * 发货时间:发货时间
	 */
	@PropertyDef(label = "发货时间", description = "发货时间:发货时间")
	private String deliveryTime;

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
	 * 开单数量:开单数量
	 */
	@PropertyDef(label = "开单数量", description = "开单数量:开单数量")
	private BigDecimal ladingNum;

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
	 * 是否已打印:是否已打印
	 */
	@PropertyDef(label = "是否已打印", description = "是否已打印:是否已打印")
	private String sfydy;

	/**
	 * 结案时间:结案时间
	 */
	@PropertyDef(label = "结案时间", description = "结案时间:结案时间")
	private String closeTime;

	/**
	 * 撤销结案时间:撤销结案时间
	 */
	@PropertyDef(label = "撤销结案时间", description = "撤销结案时间:撤销结案时间")
	private String cxTime;

	/**
	 * 日价:日价
	 */
	@PropertyDef(label = "日价", description = "日价:日价")
	private BigDecimal dayPrice;

	/**
	 * 抵税号:抵税号
	 */
	@PropertyDef(label = "抵税号", description = "抵税号:抵税号")
	private String dsTaxNo;

	/**
	 * 转单:转单
	 */
	@PropertyDef(label = "转单", description = "转单:转单")
	private String zdNo;

	/**
	 * 协议超期终:协议超期终
	 */
	@PropertyDef(label = "协议超期终", description = "协议超期终:协议超期终")
	private BigDecimal contOverdueEnd;

	/**
	 * 协议超期价:协议超期价
	 */
	@PropertyDef(label = "协议超期价", description = "协议超期价:协议超期价")
	private BigDecimal contOverduePrice;

	/**
	 * 协议超期始:协议超期始
	 */
	@PropertyDef(label = "协议超期始", description = "协议超期始:协议超期始")
	private BigDecimal contOverdueStart;

	/**
	 * 类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)
	 */
	@PropertyDef(label = "类别(JY-经营/ZY-自营)", description = "类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)")
	private String lb;

	/**
	 * 手动协议价(手动输入货品价格):手动协议价(手动输入货品价格)
	 */
	@PropertyDef(label = "手动协议价(手动输入货品价格)", description = "手动协议价(手动输入货品价格):手动协议价(手动输入货品价格)")
	private BigDecimal sdxyj;

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
	 * 是否直取:是否直取
	 */
	@PropertyDef(label = "是否直取", description = "是否直取:是否直取")
	private String ifzq;

	/**
	 * 是否生成装车作业单:是否生成装车作业单
	 */
	@PropertyDef(label = "是否生成装车作业单", description = "是否生成装车作业单:是否生成装车作业单")
	private String ifzcd;

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
	 * 出库费用:出库费用
	 */
	@PropertyDef(label = "出库费用", description = "出库费用:出库费用")
	private BigDecimal outAmt;

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
	 * 库别:库别
	 */
	@PropertyDef(label = "库别", description = "库别:库别")
	private String kb;

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
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 服务类型:服务类型
	 */
	@PropertyDef(label = "服务类型", description = "服务类型:服务类型")
	private String fwlx;

	/**
	 * 转运港:转运港
	 */
	@PropertyDef(label = "转运港", description = "转运港:转运港")
	private String zyg;

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
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

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

	public Tbih16() {
		super();
	}

	public Tbih16(String ih16Id, String compId, String deliveryNo,
			String deliveryEmp, String deliveryDate, String ladingNo,
			String ownnerCompNo, String ownnerCompName, String custNo,
			String custName, String carrierNo, String carrierName,
			String receiptCompNo, String receiptCompName, String dsNo,
			String dsName, String contNo, String contractNo,
			String tranOrderNo, String orderCompNo, String orderCompName,
			String payCompNo, String payCompName, String shr, String sno,
			String outWareCode, String deliveryTime, String startAddress,
			String endAddress, String receiptWareCode, String tranType,
			String settleType, BigDecimal ladingNum, BigDecimal ladingWgt,
			BigDecimal stl, BigDecimal kdzxcs, BigDecimal jkqrtjZfy,
			BigDecimal qrphZfy, String yh, String thkxr, String ladingEmp,
			String ladingPhoneno, BigDecimal contPrice, BigDecimal storageAmt,
			BigDecimal dbAmt, BigDecimal yzAmt, String fkfs,
			BigDecimal totalAmt, String status, String sfydy, String closeTime,
			String cxTime, BigDecimal dayPrice, String dsTaxNo, String zdNo,
			BigDecimal contOverdueEnd, BigDecimal contOverduePrice,
			BigDecimal contOverdueStart, String lb, BigDecimal sdxyj,
			String prodType, String prodTypeName, String productNo,
			String productName, String productDetail, String ifzq,
			String ifzcd, BigDecimal overdueAmt, String overduePayCompNo,
			String overduePayCompName, BigDecimal outAmt, String startStation,
			String startLine, String endStation, String endLine, String kb,
			BigDecimal overduePrice, BigDecimal managerPrice,
			BigDecimal discountPrice, BigDecimal premiumsPrice, String jfrq,
			String ts, String area, String fwlx, String zyg, String outNo,
			String transNo, String carNo, String by1, String by2, String by3,
			String by4, BigDecimal by5, BigDecimal by6, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih16Id = ih16Id;
		this.compId = compId;
		this.deliveryNo = deliveryNo;
		this.deliveryEmp = deliveryEmp;
		this.deliveryDate = deliveryDate;
		this.ladingNo = ladingNo;
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
		this.deliveryTime = deliveryTime;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
		this.receiptWareCode = receiptWareCode;
		this.tranType = tranType;
		this.settleType = settleType;
		this.ladingNum = ladingNum;
		this.ladingWgt = ladingWgt;
		this.stl = stl;
		this.kdzxcs = kdzxcs;
		this.jkqrtjZfy = jkqrtjZfy;
		this.qrphZfy = qrphZfy;
		this.yh = yh;
		this.thkxr = thkxr;
		this.ladingEmp = ladingEmp;
		this.ladingPhoneno = ladingPhoneno;
		this.contPrice = contPrice;
		this.storageAmt = storageAmt;
		this.dbAmt = dbAmt;
		this.yzAmt = yzAmt;
		this.fkfs = fkfs;
		this.totalAmt = totalAmt;
		this.status = status;
		this.sfydy = sfydy;
		this.closeTime = closeTime;
		this.cxTime = cxTime;
		this.dayPrice = dayPrice;
		this.dsTaxNo = dsTaxNo;
		this.zdNo = zdNo;
		this.contOverdueEnd = contOverdueEnd;
		this.contOverduePrice = contOverduePrice;
		this.contOverdueStart = contOverdueStart;
		this.lb = lb;
		this.sdxyj = sdxyj;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.ifzq = ifzq;
		this.ifzcd = ifzcd;
		this.overdueAmt = overdueAmt;
		this.overduePayCompNo = overduePayCompNo;
		this.overduePayCompName = overduePayCompName;
		this.outAmt = outAmt;
		this.startStation = startStation;
		this.startLine = startLine;
		this.endStation = endStation;
		this.endLine = endLine;
		this.kb = kb;
		this.overduePrice = overduePrice;
		this.managerPrice = managerPrice;
		this.discountPrice = discountPrice;
		this.premiumsPrice = premiumsPrice;
		this.jfrq = jfrq;
		this.ts = ts;
		this.area = area;
		this.fwlx = fwlx;
		this.zyg = zyg;
		this.outNo = outNo;
		this.transNo = transNo;
		this.carNo = carNo;
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

	public void setIh16Id(String ih16Id) {
		this.ih16Id = ih16Id;
	}

	@Id
	@Column(name = "IH16_ID_", length = 50, nullable = false)
	public String getIh16Id() {
		return ih16Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
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

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
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

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Column(name = "DELIVERY_TIME_", length = 20)
	public String getDeliveryTime() {
		return deliveryTime;
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

	public void setLadingNum(BigDecimal ladingNum) {
		this.ladingNum = ladingNum;
	}

	@Column(name = "LADING_NUM_")
	public BigDecimal getLadingNum() {
		return ladingNum;
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

	public void setSfydy(String sfydy) {
		this.sfydy = sfydy;
	}

	@Column(name = "SFYDY_", length = 20)
	public String getSfydy() {
		return sfydy;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	@Column(name = "CLOSE_TIME_", length = 20)
	public String getCloseTime() {
		return closeTime;
	}

	public void setCxTime(String cxTime) {
		this.cxTime = cxTime;
	}

	@Column(name = "CX_TIME_", length = 20)
	public String getCxTime() {
		return cxTime;
	}

	public void setDayPrice(BigDecimal dayPrice) {
		this.dayPrice = dayPrice;
	}

	@Column(name = "DAY_PRICE_")
	public BigDecimal getDayPrice() {
		return dayPrice;
	}

	public void setDsTaxNo(String dsTaxNo) {
		this.dsTaxNo = dsTaxNo;
	}

	@Column(name = "DS_TAX_NO_", length = 20)
	public String getDsTaxNo() {
		return dsTaxNo;
	}

	public void setZdNo(String zdNo) {
		this.zdNo = zdNo;
	}

	@Column(name = "ZD_NO_", length = 20)
	public String getZdNo() {
		return zdNo;
	}

	public void setContOverdueEnd(BigDecimal contOverdueEnd) {
		this.contOverdueEnd = contOverdueEnd;
	}

	@Column(name = "CONT_OVERDUE_END_")
	public BigDecimal getContOverdueEnd() {
		return contOverdueEnd;
	}

	public void setContOverduePrice(BigDecimal contOverduePrice) {
		this.contOverduePrice = contOverduePrice;
	}

	@Column(name = "CONT_OVERDUE_PRICE_")
	public BigDecimal getContOverduePrice() {
		return contOverduePrice;
	}

	public void setContOverdueStart(BigDecimal contOverdueStart) {
		this.contOverdueStart = contOverdueStart;
	}

	@Column(name = "CONT_OVERDUE_START_")
	public BigDecimal getContOverdueStart() {
		return contOverdueStart;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 20)
	public String getLb() {
		return lb;
	}

	public void setSdxyj(BigDecimal sdxyj) {
		this.sdxyj = sdxyj;
	}

	@Column(name = "SDXYJ_")
	public BigDecimal getSdxyj() {
		return sdxyj;
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

	public void setIfzq(String ifzq) {
		this.ifzq = ifzq;
	}

	@Column(name = "IFZQ_", length = 20)
	public String getIfzq() {
		return ifzq;
	}

	public void setIfzcd(String ifzcd) {
		this.ifzcd = ifzcd;
	}

	@Column(name = "IFZCD_", length = 20)
	public String getIfzcd() {
		return ifzcd;
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

	public void setOutAmt(BigDecimal outAmt) {
		this.outAmt = outAmt;
	}

	@Column(name = "OUT_AMT_")
	public BigDecimal getOutAmt() {
		return outAmt;
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

	public void setKb(String kb) {
		this.kb = kb;
	}

	@Column(name = "KB_", length = 20)
	public String getKb() {
		return kb;
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

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
	}

	public void setFwlx(String fwlx) {
		this.fwlx = fwlx;
	}

	@Column(name = "FWLX_", length = 20)
	public String getFwlx() {
		return fwlx;
	}

	public void setZyg(String zyg) {
		this.zyg = zyg;
	}

	@Column(name = "ZYG_", length = 50)
	public String getZyg() {
		return zyg;
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

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
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
		return "Tbih16 [ih16Id=" + ih16Id + ",compId=" + compId
				+ ",deliveryNo=" + deliveryNo + ",deliveryEmp=" + deliveryEmp
				+ ",deliveryDate=" + deliveryDate + ",ladingNo=" + ladingNo
				+ ",ownnerCompNo=" + ownnerCompNo + ",ownnerCompName="
				+ ownnerCompName + ",custNo=" + custNo + ",custName="
				+ custName + ",carrierNo=" + carrierNo + ",carrierName="
				+ carrierName + ",receiptCompNo=" + receiptCompNo
				+ ",receiptCompName=" + receiptCompName + ",dsNo=" + dsNo
				+ ",dsName=" + dsName + ",contNo=" + contNo + ",contractNo="
				+ contractNo + ",tranOrderNo=" + tranOrderNo + ",orderCompNo="
				+ orderCompNo + ",orderCompName=" + orderCompName
				+ ",payCompNo=" + payCompNo + ",payCompName=" + payCompName
				+ ",shr=" + shr + ",sno=" + sno + ",outWareCode=" + outWareCode
				+ ",deliveryTime=" + deliveryTime + ",startAddress="
				+ startAddress + ",endAddress=" + endAddress
				+ ",receiptWareCode=" + receiptWareCode + ",tranType="
				+ tranType + ",settleType=" + settleType + ",ladingNum="
				+ ladingNum + ",ladingWgt=" + ladingWgt + ",stl=" + stl
				+ ",kdzxcs=" + kdzxcs + ",jkqrtjZfy=" + jkqrtjZfy + ",qrphZfy="
				+ qrphZfy + ",yh=" + yh + ",thkxr=" + thkxr + ",ladingEmp="
				+ ladingEmp + ",ladingPhoneno=" + ladingPhoneno + ",contPrice="
				+ contPrice + ",storageAmt=" + storageAmt + ",dbAmt=" + dbAmt
				+ ",yzAmt=" + yzAmt + ",fkfs=" + fkfs + ",totalAmt=" + totalAmt
				+ ",status=" + status + ",sfydy=" + sfydy + ",closeTime="
				+ closeTime + ",cxTime=" + cxTime + ",dayPrice=" + dayPrice
				+ ",dsTaxNo=" + dsTaxNo + ",zdNo=" + zdNo + ",contOverdueEnd="
				+ contOverdueEnd + ",contOverduePrice=" + contOverduePrice
				+ ",contOverdueStart=" + contOverdueStart + ",lb=" + lb
				+ ",sdxyj=" + sdxyj + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",productDetail="
				+ productDetail + ",ifzq=" + ifzq + ",ifzcd=" + ifzcd
				+ ",overdueAmt=" + overdueAmt + ",overduePayCompNo="
				+ overduePayCompNo + ",overduePayCompName="
				+ overduePayCompName + ",outAmt=" + outAmt + ",startStation="
				+ startStation + ",startLine=" + startLine + ",endStation="
				+ endStation + ",endLine=" + endLine + ",kb=" + kb
				+ ",overduePrice=" + overduePrice + ",managerPrice="
				+ managerPrice + ",discountPrice=" + discountPrice
				+ ",premiumsPrice=" + premiumsPrice + ",jfrq=" + jfrq + ",ts="
				+ ts + ",area=" + area + ",fwlx=" + fwlx + ",zyg=" + zyg
				+ ",outNo=" + outNo + ",transNo=" + transNo + ",carNo=" + carNo
				+ ",by1=" + by1 + ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4
				+ ",by5=" + by5 + ",by6=" + by6 + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

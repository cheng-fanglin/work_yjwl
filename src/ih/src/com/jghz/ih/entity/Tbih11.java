package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih11:TBIH11(入库表)
 */
@Entity
@Table(name = "tbih11")
public class Tbih11 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String ih11Id;

	/**
	 * 公司编码:公司编码
	 */
	@PropertyDef(label = "公司编码", description = "公司编码:公司编码")
	private String compId;

	/**
	 * 入库单编号:入库单编号
	 */
	@PropertyDef(label = "入库单编号", description = "入库单编号:入库单编号")
	private String inNo;

	/**
	 * 入库单类型:入库单类型
	 */
	@PropertyDef(label = "入库单类型", description = "入库单类型:入库单类型")
	private String inType;

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
	 * 通知单号:通知单号
	 */
	@PropertyDef(label = "通知单号", description = "通知单号:通知单号")
	private String forecastNo;

	/**
	 * 提单号:提单号
	 */
	@PropertyDef(label = "提单号", description = "提单号:提单号")
	private String ladingNo;

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
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 检验批号:检验批号
	 */
	@PropertyDef(label = "检验批号", description = "检验批号:检验批号")
	private String batchNo;

	/**
	 * 数据来源:数据来源
	 */
	@PropertyDef(label = "数据来源", description = "数据来源:数据来源")
	private String soure;

	/**
	 * 关联单号:关联单号
	 */
	@PropertyDef(label = "关联单号", description = "关联单号:关联单号")
	private String checkNo;

	/**
	 * 单据类别:单据类别
	 */
	@PropertyDef(label = "单据类别", description = "单据类别:单据类别")
	private String applyMode;

	/**
	 * 计量单位:计量单位
	 */
	@PropertyDef(label = "计量单位", description = "计量单位:计量单位")
	private String unit;

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
	 * 入库件数:入库件数
	 */
	@PropertyDef(label = "入库件数", description = "入库件数:入库件数")
	private BigDecimal pieceNum;

	/**
	 * 入库数量:入库数量
	 */
	@PropertyDef(label = "入库数量", description = "入库数量:入库数量")
	private BigDecimal num;

	/**
	 * 入库重量:入库重量
	 */
	@PropertyDef(label = "入库重量", description = "入库重量:入库重量")
	private BigDecimal wgt;

	/**
	 * 体积:体积
	 */
	@PropertyDef(label = "体积", description = "体积:体积")
	private BigDecimal volume;

	/**
	 * 单重:单重
	 */
	@PropertyDef(label = "单重", description = "单重:单重")
	private BigDecimal unitWgt;

	/**
	 * 入库日期:入库日期
	 */
	@PropertyDef(label = "入库日期", description = "入库日期:入库日期")
	private String inDate;

	/**
	 * 货值单价:货值单价
	 */
	@PropertyDef(label = "货值单价", description = "货值单价:货值单价")
	private BigDecimal cargoPrice;

	/**
	 * 货值金额:货值金额
	 */
	@PropertyDef(label = "货值金额", description = "货值金额:货值金额")
	private BigDecimal cargoAmt;

	/**
	 * 单据状态:单据状态
	 */
	@PropertyDef(label = "单据状态", description = "单据状态:单据状态")
	private String applyStatus;

	/**
	 * 发出仓库:发出仓库
	 */
	@PropertyDef(label = "发出仓库", description = "发出仓库:发出仓库")
	private String outIx01No;

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
	private String arrivalAddress;

	/**
	 * 收货仓库:收货仓库
	 */
	@PropertyDef(label = "收货仓库", description = "收货仓库:收货仓库")
	private String inIx01No;

	/**
	 * 收货人:收货人
	 */
	@PropertyDef(label = "收货人", description = "收货人:收货人")
	private String inEmp;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

	/**
	 * 车行:车行
	 */
	@PropertyDef(label = "车行", description = "车行:车行")
	private String carTeam;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

	/**
	 * 联系电话:联系电话
	 */
	@PropertyDef(label = "联系电话", description = "联系电话:联系电话")
	private String telephone;

	/**
	 * 运费:运费
	 */
	@PropertyDef(label = "运费", description = "运费:运费")
	private BigDecimal carriageAmt;

	/**
	 * 过磅皮重:过磅皮重
	 */
	@PropertyDef(label = "过磅皮重", description = "过磅皮重:过磅皮重")
	private BigDecimal tareWgt;

	/**
	 * 过磅毛重:过磅毛重
	 */
	@PropertyDef(label = "过磅毛重", description = "过磅毛重:过磅毛重")
	private BigDecimal grossWgt;

	/**
	 * 过磅净重:过磅净重
	 */
	@PropertyDef(label = "过磅净重", description = "过磅净重:过磅净重")
	private BigDecimal netWgt;

	/**
	 * 扣量:扣量
	 */
	@PropertyDef(label = "扣量", description = "扣量:扣量")
	private BigDecimal kwWgt;

	/**
	 * 市场:市场
	 */
	@PropertyDef(label = "市场", description = "市场:市场")
	private String area;

	/**
	 * 单价:单价
	 */
	@PropertyDef(label = "单价", description = "单价:单价")
	private BigDecimal costPrice;

	/**
	 * 金额:金额
	 */
	@PropertyDef(label = "金额", description = "金额:金额")
	private BigDecimal costAmt;

	/**
	 * 结算单号:结算单号
	 */
	@PropertyDef(label = "结算单号", description = "结算单号:结算单号")
	private String settleNo;

	/**
	 * 发票号:发票号
	 */
	@PropertyDef(label = "发票号", description = "发票号:发票号")
	private String invoice;

	/**
	 * 理论重量:理论重量
	 */
	@PropertyDef(label = "理论重量", description = "理论重量:理论重量")
	private BigDecimal theoryWgt;

	/**
	 * 重量保留:重量保留
	 */
	@PropertyDef(label = "重量保留", description = "重量保留:重量保留")
	private BigDecimal weightKeep;

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
	 * 是否合格:是否合格
	 */
	@PropertyDef(label = "是否合格", description = "是否合格:是否合格")
	private String checkOut;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 装卸班组:装卸班组
	 */
	@PropertyDef(label = "装卸班组", description = "装卸班组:装卸班组")
	private String liftingTeam;

	/**
	 * 理货员:理货员
	 */
	@PropertyDef(label = "理货员", description = "理货员:理货员")
	private String liftingEmp;

	/**
	 * 行车工:行车工
	 */
	@PropertyDef(label = "行车工", description = "行车工:行车工")
	private String craneDriver;

	/**
	 * 包装物型号:包装物型号
	 */
	@PropertyDef(label = "包装物型号", description = "包装物型号:包装物型号")
	private String packageNo;

	/**
	 * 包装物重量:包装物重量
	 */
	@PropertyDef(label = "包装物重量", description = "包装物重量:包装物重量")
	private BigDecimal packageWgt;

	/**
	 * 包装方式:包装方式
	 */
	@PropertyDef(label = "包装方式", description = "包装方式:包装方式")
	private String packageMode;

	/**
	 * 是否混箱:是否混箱
	 */
	@PropertyDef(label = "是否混箱", description = "是否混箱:是否混箱")
	private String ifMix;

	/**
	 * 入库备注说明:入库备注说明
	 */
	@PropertyDef(label = "入库备注说明", description = "入库备注说明:入库备注说明")
	private String desp;

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

	public Tbih11() {
		super();
	}

	public Tbih11(String ih11Id, String compId, String inNo, String inType,
			String ownnerCompNo, String ownnerCompName, String custNo,
			String custName, String carrierNo, String carrierName,
			String receiptCompNo, String receiptCompName, String contNo,
			String contractNo, String tranOrderNo, String forecastNo,
			String ladingNo, String orderNo, String orderItem, String transNo,
			String labelNo, String batchNo, String soure, String checkNo,
			String applyMode, String unit, String prodType,
			String prodTypeName, String productNo, String productName,
			String productDetail, String qb, String dc, String gradeNo,
			String steelNo, String size, BigDecimal thick, BigDecimal width,
			BigDecimal length, BigDecimal pieceNum, BigDecimal num,
			BigDecimal wgt, BigDecimal volume, BigDecimal unitWgt,
			String inDate, BigDecimal cargoPrice, BigDecimal cargoAmt,
			String applyStatus, String outIx01No, String deliveryTime,
			String startAddress, String arrivalAddress, String inIx01No,
			String inEmp, String tranType, String carTeam, String carNo,
			String telephone, BigDecimal carriageAmt, BigDecimal tareWgt,
			BigDecimal grossWgt, BigDecimal netWgt, BigDecimal kwWgt,
			String area, BigDecimal costPrice, BigDecimal costAmt,
			String settleNo, String invoice, BigDecimal theoryWgt,
			BigDecimal weightKeep, String wareQwCode, String layerCode,
			String checkOut, String status, String liftingTeam,
			String liftingEmp, String craneDriver, String packageNo,
			BigDecimal packageWgt, String packageMode, String ifMix,
			String desp, String by1, String by2, String by3, String by4,
			String by5, String by6, String by7, BigDecimal by8, BigDecimal by9,
			BigDecimal by10, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih11Id = ih11Id;
		this.compId = compId;
		this.inNo = inNo;
		this.inType = inType;
		this.ownnerCompNo = ownnerCompNo;
		this.ownnerCompName = ownnerCompName;
		this.custNo = custNo;
		this.custName = custName;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.contNo = contNo;
		this.contractNo = contractNo;
		this.tranOrderNo = tranOrderNo;
		this.forecastNo = forecastNo;
		this.ladingNo = ladingNo;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.transNo = transNo;
		this.labelNo = labelNo;
		this.batchNo = batchNo;
		this.soure = soure;
		this.checkNo = checkNo;
		this.applyMode = applyMode;
		this.unit = unit;
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
		this.pieceNum = pieceNum;
		this.num = num;
		this.wgt = wgt;
		this.volume = volume;
		this.unitWgt = unitWgt;
		this.inDate = inDate;
		this.cargoPrice = cargoPrice;
		this.cargoAmt = cargoAmt;
		this.applyStatus = applyStatus;
		this.outIx01No = outIx01No;
		this.deliveryTime = deliveryTime;
		this.startAddress = startAddress;
		this.arrivalAddress = arrivalAddress;
		this.inIx01No = inIx01No;
		this.inEmp = inEmp;
		this.tranType = tranType;
		this.carTeam = carTeam;
		this.carNo = carNo;
		this.telephone = telephone;
		this.carriageAmt = carriageAmt;
		this.tareWgt = tareWgt;
		this.grossWgt = grossWgt;
		this.netWgt = netWgt;
		this.kwWgt = kwWgt;
		this.area = area;
		this.costPrice = costPrice;
		this.costAmt = costAmt;
		this.settleNo = settleNo;
		this.invoice = invoice;
		this.theoryWgt = theoryWgt;
		this.weightKeep = weightKeep;
		this.wareQwCode = wareQwCode;
		this.layerCode = layerCode;
		this.checkOut = checkOut;
		this.status = status;
		this.liftingTeam = liftingTeam;
		this.liftingEmp = liftingEmp;
		this.craneDriver = craneDriver;
		this.packageNo = packageNo;
		this.packageWgt = packageWgt;
		this.packageMode = packageMode;
		this.ifMix = ifMix;
		this.desp = desp;
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

	public void setIh11Id(String ih11Id) {
		this.ih11Id = ih11Id;
	}

	@Id
	@Column(name = "IH11_ID_", length = 50, nullable = false)
	public String getIh11Id() {
		return ih11Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setInNo(String inNo) {
		this.inNo = inNo;
	}

	@Column(name = "IN_NO_", length = 20, unique = true)
	public String getInNo() {
		return inNo;
	}

	public void setInType(String inType) {
		this.inType = inType;
	}

	@Column(name = "IN_TYPE_", length = 20)
	public String getInType() {
		return inType;
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

	@Column(name = "CUST_NO_", length = 20, unique = true)
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

	public void setForecastNo(String forecastNo) {
		this.forecastNo = forecastNo;
	}

	@Column(name = "FORECAST_NO_", length = 20)
	public String getForecastNo() {
		return forecastNo;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
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

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20, unique = true)
	public String getLabelNo() {
		return labelNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	@Column(name = "BATCH_NO_", length = 20)
	public String getBatchNo() {
		return batchNo;
	}

	public void setSoure(String soure) {
		this.soure = soure;
	}

	@Column(name = "SOURE_", length = 20)
	public String getSoure() {
		return soure;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	@Column(name = "CHECK_NO_", length = 20)
	public String getCheckNo() {
		return checkNo;
	}

	public void setApplyMode(String applyMode) {
		this.applyMode = applyMode;
	}

	@Column(name = "APPLY_MODE_", length = 20)
	public String getApplyMode() {
		return applyMode;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "UNIT_", length = 20)
	public String getUnit() {
		return unit;
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

	public void setPieceNum(BigDecimal pieceNum) {
		this.pieceNum = pieceNum;
	}

	@Column(name = "PIECE_NUM_")
	public BigDecimal getPieceNum() {
		return pieceNum;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "NUM_")
	public BigDecimal getNum() {
		return num;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	@Column(name = "WGT_")
	public BigDecimal getWgt() {
		return wgt;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	@Column(name = "VOLUME_")
	public BigDecimal getVolume() {
		return volume;
	}

	public void setUnitWgt(BigDecimal unitWgt) {
		this.unitWgt = unitWgt;
	}

	@Column(name = "UNIT_WGT_")
	public BigDecimal getUnitWgt() {
		return unitWgt;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	@Column(name = "IN_DATE_", length = 20)
	public String getInDate() {
		return inDate;
	}

	public void setCargoPrice(BigDecimal cargoPrice) {
		this.cargoPrice = cargoPrice;
	}

	@Column(name = "CARGO_PRICE_")
	public BigDecimal getCargoPrice() {
		return cargoPrice;
	}

	public void setCargoAmt(BigDecimal cargoAmt) {
		this.cargoAmt = cargoAmt;
	}

	@Column(name = "CARGO_AMT_")
	public BigDecimal getCargoAmt() {
		return cargoAmt;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	@Column(name = "APPLY_STATUS_", length = 20)
	public String getApplyStatus() {
		return applyStatus;
	}

	public void setOutIx01No(String outIx01No) {
		this.outIx01No = outIx01No;
	}

	@Column(name = "OUT_IX01_NO_", length = 20)
	public String getOutIx01No() {
		return outIx01No;
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

	public void setArrivalAddress(String arrivalAddress) {
		this.arrivalAddress = arrivalAddress;
	}

	@Column(name = "ARRIVAL_ADDRESS_", length = 100)
	public String getArrivalAddress() {
		return arrivalAddress;
	}

	public void setInIx01No(String inIx01No) {
		this.inIx01No = inIx01No;
	}

	@Column(name = "IN_IX01_NO_", length = 20)
	public String getInIx01No() {
		return inIx01No;
	}

	public void setInEmp(String inEmp) {
		this.inEmp = inEmp;
	}

	@Column(name = "IN_EMP_", length = 50)
	public String getInEmp() {
		return inEmp;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 20)
	public String getTranType() {
		return tranType;
	}

	public void setCarTeam(String carTeam) {
		this.carTeam = carTeam;
	}

	@Column(name = "CAR_TEAM_", length = 20)
	public String getCarTeam() {
		return carTeam;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "TELEPHONE_", length = 50)
	public String getTelephone() {
		return telephone;
	}

	public void setCarriageAmt(BigDecimal carriageAmt) {
		this.carriageAmt = carriageAmt;
	}

	@Column(name = "CARRIAGE_AMT_")
	public BigDecimal getCarriageAmt() {
		return carriageAmt;
	}

	public void setTareWgt(BigDecimal tareWgt) {
		this.tareWgt = tareWgt;
	}

	@Column(name = "TARE_WGT_")
	public BigDecimal getTareWgt() {
		return tareWgt;
	}

	public void setGrossWgt(BigDecimal grossWgt) {
		this.grossWgt = grossWgt;
	}

	@Column(name = "GROSS_WGT_")
	public BigDecimal getGrossWgt() {
		return grossWgt;
	}

	public void setNetWgt(BigDecimal netWgt) {
		this.netWgt = netWgt;
	}

	@Column(name = "NET_WGT_")
	public BigDecimal getNetWgt() {
		return netWgt;
	}

	public void setKwWgt(BigDecimal kwWgt) {
		this.kwWgt = kwWgt;
	}

	@Column(name = "KW_WGT_")
	public BigDecimal getKwWgt() {
		return kwWgt;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	@Column(name = "COST_PRICE_")
	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostAmt(BigDecimal costAmt) {
		this.costAmt = costAmt;
	}

	@Column(name = "COST_AMT_")
	public BigDecimal getCostAmt() {
		return costAmt;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	@Column(name = "INVOICE_", length = 20)
	public String getInvoice() {
		return invoice;
	}

	public void setTheoryWgt(BigDecimal theoryWgt) {
		this.theoryWgt = theoryWgt;
	}

	@Column(name = "THEORY_WGT_")
	public BigDecimal getTheoryWgt() {
		return theoryWgt;
	}

	public void setWeightKeep(BigDecimal weightKeep) {
		this.weightKeep = weightKeep;
	}

	@Column(name = "WEIGHT_KEEP_")
	public BigDecimal getWeightKeep() {
		return weightKeep;
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

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	@Column(name = "CHECK_OUT_", length = 20)
	public String getCheckOut() {
		return checkOut;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setLiftingTeam(String liftingTeam) {
		this.liftingTeam = liftingTeam;
	}

	@Column(name = "LIFTING_TEAM_", length = 50)
	public String getLiftingTeam() {
		return liftingTeam;
	}

	public void setLiftingEmp(String liftingEmp) {
		this.liftingEmp = liftingEmp;
	}

	@Column(name = "LIFTING_EMP_", length = 50)
	public String getLiftingEmp() {
		return liftingEmp;
	}

	public void setCraneDriver(String craneDriver) {
		this.craneDriver = craneDriver;
	}

	@Column(name = "CRANE_DRIVER_", length = 50)
	public String getCraneDriver() {
		return craneDriver;
	}

	public void setPackageNo(String packageNo) {
		this.packageNo = packageNo;
	}

	@Column(name = "PACKAGE_NO_", length = 20)
	public String getPackageNo() {
		return packageNo;
	}

	public void setPackageWgt(BigDecimal packageWgt) {
		this.packageWgt = packageWgt;
	}

	@Column(name = "PACKAGE_WGT_")
	public BigDecimal getPackageWgt() {
		return packageWgt;
	}

	public void setPackageMode(String packageMode) {
		this.packageMode = packageMode;
	}

	@Column(name = "PACKAGE_MODE_", length = 50)
	public String getPackageMode() {
		return packageMode;
	}

	public void setIfMix(String ifMix) {
		this.ifMix = ifMix;
	}

	@Column(name = "IF_MIX_", length = 20)
	public String getIfMix() {
		return ifMix;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	@Column(name = "DESP_", length = 200)
	public String getDesp() {
		return desp;
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
		return "Tbih11 [ih11Id=" + ih11Id + ",compId=" + compId + ",inNo="
				+ inNo + ",inType=" + inType + ",ownnerCompNo=" + ownnerCompNo
				+ ",ownnerCompName=" + ownnerCompName + ",custNo=" + custNo
				+ ",custName=" + custName + ",carrierNo=" + carrierNo
				+ ",carrierName=" + carrierName + ",receiptCompNo="
				+ receiptCompNo + ",receiptCompName=" + receiptCompName
				+ ",contNo=" + contNo + ",contractNo=" + contractNo
				+ ",tranOrderNo=" + tranOrderNo + ",forecastNo=" + forecastNo
				+ ",ladingNo=" + ladingNo + ",orderNo=" + orderNo
				+ ",orderItem=" + orderItem + ",transNo=" + transNo
				+ ",labelNo=" + labelNo + ",batchNo=" + batchNo + ",soure="
				+ soure + ",checkNo=" + checkNo + ",applyMode=" + applyMode
				+ ",unit=" + unit + ",prodType=" + prodType + ",prodTypeName="
				+ prodTypeName + ",productNo=" + productNo + ",productName="
				+ productName + ",productDetail=" + productDetail + ",qb=" + qb
				+ ",dc=" + dc + ",gradeNo=" + gradeNo + ",steelNo=" + steelNo
				+ ",size=" + size + ",thick=" + thick + ",width=" + width
				+ ",length=" + length + ",pieceNum=" + pieceNum + ",num=" + num
				+ ",wgt=" + wgt + ",volume=" + volume + ",unitWgt=" + unitWgt
				+ ",inDate=" + inDate + ",cargoPrice=" + cargoPrice
				+ ",cargoAmt=" + cargoAmt + ",applyStatus=" + applyStatus
				+ ",outIx01No=" + outIx01No + ",deliveryTime=" + deliveryTime
				+ ",startAddress=" + startAddress + ",arrivalAddress="
				+ arrivalAddress + ",inIx01No=" + inIx01No + ",inEmp=" + inEmp
				+ ",tranType=" + tranType + ",carTeam=" + carTeam + ",carNo="
				+ carNo + ",telephone=" + telephone + ",carriageAmt="
				+ carriageAmt + ",tareWgt=" + tareWgt + ",grossWgt=" + grossWgt
				+ ",netWgt=" + netWgt + ",kwWgt=" + kwWgt + ",area=" + area
				+ ",costPrice=" + costPrice + ",costAmt=" + costAmt
				+ ",settleNo=" + settleNo + ",invoice=" + invoice
				+ ",theoryWgt=" + theoryWgt + ",weightKeep=" + weightKeep
				+ ",wareQwCode=" + wareQwCode + ",layerCode=" + layerCode
				+ ",checkOut=" + checkOut + ",status=" + status
				+ ",liftingTeam=" + liftingTeam + ",liftingEmp=" + liftingEmp
				+ ",craneDriver=" + craneDriver + ",packageNo=" + packageNo
				+ ",packageWgt=" + packageWgt + ",packageMode=" + packageMode
				+ ",ifMix=" + ifMix + ",desp=" + desp + ",by1=" + by1 + ",by2="
				+ by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5 + ",by6="
				+ by6 + ",by7=" + by7 + ",by8=" + by8 + ",by9=" + by9
				+ ",by10=" + by10 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih19:TBIH19(出库表)
 */
@Entity
@Table(name = "tbih19")
public class Tbih19 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String ih19Id;

	/**
	 * 公司编码:公司编码
	 */
	@PropertyDef(label = "公司编码", description = "公司编码:公司编码")
	private String compId;

	/**
	 * 出库单编号:出库单编号
	 */
	@PropertyDef(label = "出库单编号", description = "出库单编号:出库单编号")
	private String outNo;

	/**
	 * 出库单类型:出库单类型
	 */
	@PropertyDef(label = "出库单类型", description = "出库单类型:出库单类型")
	private String outType;

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
	 * 合同协议号:合同协议号
	 */
	@PropertyDef(label = "合同协议号", description = "合同协议号:合同协议号")
	private String contNo;

	/**
	 * 通知单号:通知单号
	 */
	@PropertyDef(label = "通知单号", description = "通知单号:通知单号")
	private String forecastNo;

	/**
	 * 来函流水号:来函流水号
	 */
	@PropertyDef(label = "来函流水号", description = "来函流水号:来函流水号")
	private String deliveryNo;

	/**
	 * 提货号:提货号
	 */
	@PropertyDef(label = "提货号", description = "提货号:提货号")
	private String ladingNo;

	/**
	 * 结算方式:结算方式
	 */
	@PropertyDef(label = "结算方式", description = "结算方式:结算方式")
	private String settleType;

	/**
	 * 出厂订单项次号:出厂订单项次号
	 */
	@PropertyDef(label = "出厂订单项次号", description = "出厂订单项次号:出厂订单项次号")
	private String orderItem;

	/**
	 * 出厂订单号:出厂订单号
	 */
	@PropertyDef(label = "出厂订单号", description = "出厂订单号:出厂订单号")
	private String orderNo;

	/**
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String tranNo;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

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
	 * 产品型号:产品型号
	 */
	@PropertyDef(label = "产品型号", description = "产品型号:产品型号")
	private String size;

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
	 * 出库件数:出库件数
	 */
	@PropertyDef(label = "出库件数", description = "出库件数:出库件数")
	private BigDecimal pieceNum;

	/**
	 * 出库数量:出库数量
	 */
	@PropertyDef(label = "出库数量", description = "出库数量:出库数量")
	private BigDecimal num;

	/**
	 * 出库重量:出库重量
	 */
	@PropertyDef(label = "出库重量", description = "出库重量:出库重量")
	private BigDecimal wgt;

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
	 * 出库日期:出库日期
	 */
	@PropertyDef(label = "出库日期", description = "出库日期:出库日期")
	private String outDate;

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
	 * 市场:市场
	 */
	@PropertyDef(label = "市场", description = "市场:市场")
	private String area;

	/**
	 * 结算号:结算号
	 */
	@PropertyDef(label = "结算号", description = "结算号:结算号")
	private String settleNo;

	/**
	 * 发票号:发票号
	 */
	@PropertyDef(label = "发票号", description = "发票号:发票号")
	private String invoice;

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
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 单据状态:单据状态
	 */
	@PropertyDef(label = "单据状态", description = "单据状态:单据状态")
	private String applyStatus;

	/**
	 * 是否混箱:是否混箱
	 */
	@PropertyDef(label = "是否混箱", description = "是否混箱:是否混箱")
	private String ifMix;

	/**
	 * 航次号(水运):航次号(水运)
	 */
	@PropertyDef(label = "航次号(水运)", description = "航次号(水运):航次号(水运)")
	private String syhch;

	/**
	 * 船号:船号
	 */
	@PropertyDef(label = "船号", description = "船号:船号")
	private String shipNo;

	/**
	 * 收货人:收货人
	 */
	@PropertyDef(label = "收货人", description = "收货人:收货人")
	private String shr;

	/**
	 * 驾驶证号:驾驶证号
	 */
	@PropertyDef(label = "驾驶证号", description = "驾驶证号:驾驶证号")
	private String driverLicense;

	/**
	 * 配货时间:配货时间
	 */
	@PropertyDef(label = "配货时间", description = "配货时间:配货时间")
	private String phDate;

	/**
	 * 配货人:配货人
	 */
	@PropertyDef(label = "配货人", description = "配货人:配货人")
	private String phEmp;

	/**
	 * 出库人:出库人
	 */
	@PropertyDef(label = "出库人", description = "出库人:出库人")
	private String outEmp;

	/**
	 * 销帐人:销帐人
	 */
	@PropertyDef(label = "销帐人", description = "销帐人:销帐人")
	private String xzEmp;

	/**
	 * 销帐时间:销帐时间
	 */
	@PropertyDef(label = "销帐时间", description = "销帐时间:销帐时间")
	private String xzTime;

	/**
	 * 到站ID:到站ID
	 */
	@PropertyDef(label = "到站ID", description = "到站ID:到站ID")
	private String stationCode;

	/**
	 * 撤单时间:撤单时间
	 */
	@PropertyDef(label = "撤单时间", description = "撤单时间:撤单时间")
	private String cdTime;

	/**
	 * 装车人:装车人
	 */
	@PropertyDef(label = "装车人", description = "装车人:装车人")
	private String zcr;

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
	 * 配IP:配IP
	 */
	@PropertyDef(label = "配IP", description = "配IP:配IP")
	private String pip;

	/**
	 * 中转:中转
	 */
	@PropertyDef(label = "中转", description = "中转:中转")
	private String zz;

	/**
	 * 天数(库龄):天数(库龄)
	 */
	@PropertyDef(label = "天数(库龄)", description = "天数(库龄):天数(库龄)")
	private BigDecimal ts;

	/**
	 * 代收运费:代收运费
	 */
	@PropertyDef(label = "代收运费", description = "代收运费:代收运费")
	private BigDecimal dsyf;

	/**
	 * 单价:单价
	 */
	@PropertyDef(label = "单价", description = "单价:单价")
	private BigDecimal price;

	/**
	 * 总费用:总费用
	 */
	@PropertyDef(label = "总费用", description = "总费用:总费用")
	private BigDecimal totalAmt;

	/**
	 * 仓储费:仓储费
	 */
	@PropertyDef(label = "仓储费", description = "仓储费:仓储费")
	private BigDecimal storageAmt;

	/**
	 * 吊装费:吊装费
	 */
	@PropertyDef(label = "吊装费", description = "吊装费:吊装费")
	private BigDecimal liftingAmt;

	/**
	 * 优惠价:优惠价
	 */
	@PropertyDef(label = "优惠价", description = "优惠价:优惠价")
	private BigDecimal discountAmt;

	/**
	 * 特殊加收费用金额:特殊加收费用金额
	 */
	@PropertyDef(label = "特殊加收费用金额", description = "特殊加收费用金额:特殊加收费用金额")
	private BigDecimal orderAmt;

	/**
	 * 保险费:保险费
	 */
	@PropertyDef(label = "保险费", description = "保险费:保险费")
	private BigDecimal premiumsAmt;

	/**
	 * 返回金额:返回金额
	 */
	@PropertyDef(label = "返回金额", description = "返回金额:返回金额")
	private BigDecimal returnAmt;

	/**
	 * 超期费:超期费
	 */
	@PropertyDef(label = "超期费", description = "超期费:超期费")
	private BigDecimal overdueAmt;

	/**
	 * 代办费:代办费
	 */
	@PropertyDef(label = "代办费", description = "代办费:代办费")
	private BigDecimal dbAmt;

	/**
	 * 仓储管理费用:仓储管理费用
	 */
	@PropertyDef(label = "仓储管理费用", description = "仓储管理费用:仓储管理费用")
	private BigDecimal managerAmt;

	/**
	 * 运费:运费
	 */
	@PropertyDef(label = "运费", description = "运费:运费")
	private BigDecimal tranAmt;

	/**
	 * 税额:税额
	 */
	@PropertyDef(label = "税额", description = "税额:税额")
	private BigDecimal taxAmt;

	/**
	 * 扣款:扣款
	 */
	@PropertyDef(label = "扣款", description = "扣款:扣款")
	private BigDecimal kk;

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
	 * 类别（ZY自营，JY经营）:类别（ZY自营，JY经营）
	 */
	@PropertyDef(label = "类别（ZY 自营，JY 经营）", description = "类别（ZY自营，JY经营）:类别（ZY自营，JY经营）")
	private String lb;

	/**
	 * 销账时间备用:销账时间备用
	 */
	@PropertyDef(label = "销账时间备用", description = "销账时间备用:销账时间备用")
	private String sjtz;

	/**
	 * 起点:起点
	 */
	@PropertyDef(label = "起点", description = "起点:起点")
	private String startStation;

	/**
	 * 终点专用线:终点专用线
	 */
	@PropertyDef(label = "终点专用线", description = "终点专用线:终点专用线")
	private String endLine;

	/**
	 * 装船确认人:装船确认人
	 */
	@PropertyDef(label = "装船确认人", description = "装船确认人:装船确认人")
	private String zcqrEmp;

	/**
	 * 装船确认时间:装船确认时间
	 */
	@PropertyDef(label = "装船确认时间", description = "装船确认时间:装船确认时间")
	private String zcqrTime;

	/**
	 * 备注说明:备注说明
	 */
	@PropertyDef(label = "备注说明", description = "备注说明:备注说明")
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
	private BigDecimal by3;

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

	public Tbih19() {
		super();
	}

	public Tbih19(String ih19Id, String compId, String outNo, String outType,
			String ownnerCompNo, String ownnerCompName, String custNo,
			String custName, String carrierNo, String carrierName,
			String receiptCompNo, String receiptCompName, String tranOrderNo,
			String orderCompNo, String orderCompName, String payCompNo,
			String payCompName, String contNo, String forecastNo,
			String deliveryNo, String ladingNo, String settleType,
			String orderItem, String orderNo, String tranNo, String labelNo,
			String soure, String checkNo, String unit, String prodType,
			String prodTypeName, String productNo, String productName,
			String productDetail, String gradeNo, String steelNo, String qb,
			String dc, BigDecimal thick, String size, BigDecimal width,
			BigDecimal length, BigDecimal pieceNum, BigDecimal num,
			BigDecimal wgt, BigDecimal tareWgt, BigDecimal grossWgt,
			BigDecimal netWgt, BigDecimal kwWgt, String outDate,
			String outWareCode, String startAddress, String endAddress,
			String receiptWareCode, String tranType, String carTeam,
			String carNo, String telephone, String area, String settleNo,
			String invoice, String wareQwCode, String layerCode, String status,
			String applyStatus, String ifMix, String syhch, String shipNo,
			String shr, String driverLicense, String phDate, String phEmp,
			String outEmp, String xzEmp, String xzTime, String stationCode,
			String cdTime, String zcr, String liftingTeam, String liftingEmp,
			String craneDriver, String pip, String zz, BigDecimal ts,
			BigDecimal dsyf, BigDecimal price, BigDecimal totalAmt,
			BigDecimal storageAmt, BigDecimal liftingAmt,
			BigDecimal discountAmt, BigDecimal orderAmt,
			BigDecimal premiumsAmt, BigDecimal returnAmt,
			BigDecimal overdueAmt, BigDecimal dbAmt, BigDecimal managerAmt,
			BigDecimal tranAmt, BigDecimal taxAmt, BigDecimal kk,
			String startLine, String endStation, String lb, String sjtz,
			String startStation, String endLine, String zcqrEmp,
			String zcqrTime, String desp, String by1, String by2,
			BigDecimal by3, String createEmp, Date createTime,
			String updateEmp, Date updateTime, int version) {
		super();
		this.ih19Id = ih19Id;
		this.compId = compId;
		this.outNo = outNo;
		this.outType = outType;
		this.ownnerCompNo = ownnerCompNo;
		this.ownnerCompName = ownnerCompName;
		this.custNo = custNo;
		this.custName = custName;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.tranOrderNo = tranOrderNo;
		this.orderCompNo = orderCompNo;
		this.orderCompName = orderCompName;
		this.payCompNo = payCompNo;
		this.payCompName = payCompName;
		this.contNo = contNo;
		this.forecastNo = forecastNo;
		this.deliveryNo = deliveryNo;
		this.ladingNo = ladingNo;
		this.settleType = settleType;
		this.orderItem = orderItem;
		this.orderNo = orderNo;
		this.tranNo = tranNo;
		this.labelNo = labelNo;
		this.soure = soure;
		this.checkNo = checkNo;
		this.unit = unit;
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
		this.size = size;
		this.width = width;
		this.length = length;
		this.pieceNum = pieceNum;
		this.num = num;
		this.wgt = wgt;
		this.tareWgt = tareWgt;
		this.grossWgt = grossWgt;
		this.netWgt = netWgt;
		this.kwWgt = kwWgt;
		this.outDate = outDate;
		this.outWareCode = outWareCode;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
		this.receiptWareCode = receiptWareCode;
		this.tranType = tranType;
		this.carTeam = carTeam;
		this.carNo = carNo;
		this.telephone = telephone;
		this.area = area;
		this.settleNo = settleNo;
		this.invoice = invoice;
		this.wareQwCode = wareQwCode;
		this.layerCode = layerCode;
		this.status = status;
		this.applyStatus = applyStatus;
		this.ifMix = ifMix;
		this.syhch = syhch;
		this.shipNo = shipNo;
		this.shr = shr;
		this.driverLicense = driverLicense;
		this.phDate = phDate;
		this.phEmp = phEmp;
		this.outEmp = outEmp;
		this.xzEmp = xzEmp;
		this.xzTime = xzTime;
		this.stationCode = stationCode;
		this.cdTime = cdTime;
		this.zcr = zcr;
		this.liftingTeam = liftingTeam;
		this.liftingEmp = liftingEmp;
		this.craneDriver = craneDriver;
		this.pip = pip;
		this.zz = zz;
		this.ts = ts;
		this.dsyf = dsyf;
		this.price = price;
		this.totalAmt = totalAmt;
		this.storageAmt = storageAmt;
		this.liftingAmt = liftingAmt;
		this.discountAmt = discountAmt;
		this.orderAmt = orderAmt;
		this.premiumsAmt = premiumsAmt;
		this.returnAmt = returnAmt;
		this.overdueAmt = overdueAmt;
		this.dbAmt = dbAmt;
		this.managerAmt = managerAmt;
		this.tranAmt = tranAmt;
		this.taxAmt = taxAmt;
		this.kk = kk;
		this.startLine = startLine;
		this.endStation = endStation;
		this.lb = lb;
		this.sjtz = sjtz;
		this.startStation = startStation;
		this.endLine = endLine;
		this.zcqrEmp = zcqrEmp;
		this.zcqrTime = zcqrTime;
		this.desp = desp;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setIh19Id(String ih19Id) {
		this.ih19Id = ih19Id;
	}

	@Id
	@Column(name = "IH19_ID_", length = 50, nullable = false)
	public String getIh19Id() {
		return ih19Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20, unique = true)
	public String getOutNo() {
		return outNo;
	}

	public void setOutType(String outType) {
		this.outType = outType;
	}

	@Column(name = "OUT_TYPE_", length = 30)
	public String getOutType() {
		return outType;
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

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
	public String getContNo() {
		return contNo;
	}

	public void setForecastNo(String forecastNo) {
		this.forecastNo = forecastNo;
	}

	@Column(name = "FORECAST_NO_", length = 20)
	public String getForecastNo() {
		return forecastNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	@Column(name = "DELIVERY_NO_", length = 20)
	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20, unique = true)
	public String getLadingNo() {
		return ladingNo;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	@Column(name = "ORDER_ITEM_", length = 20)
	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "ORDER_NO_", length = 20)
	public String getOrderNo() {
		return orderNo;
	}

	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}

	@Column(name = "TRAN_NO_", length = 20)
	public String getTranNo() {
		return tranNo;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20, unique = true)
	public String getLabelNo() {
		return labelNo;
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

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SIZE_", length = 200)
	public String getSize() {
		return size;
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

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	@Column(name = "OUT_DATE_", length = 20)
	public String getOutDate() {
		return outDate;
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

	public void setCarTeam(String carTeam) {
		this.carTeam = carTeam;
	}

	@Column(name = "CAR_TEAM_", length = 100)
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

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
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

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20, unique = true)
	public String getStatus() {
		return status;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	@Column(name = "APPLY_STATUS_", length = 20)
	public String getApplyStatus() {
		return applyStatus;
	}

	public void setIfMix(String ifMix) {
		this.ifMix = ifMix;
	}

	@Column(name = "IF_MIX_", length = 20)
	public String getIfMix() {
		return ifMix;
	}

	public void setSyhch(String syhch) {
		this.syhch = syhch;
	}

	@Column(name = "SYHCH_", length = 20)
	public String getSyhch() {
		return syhch;
	}

	public void setShipNo(String shipNo) {
		this.shipNo = shipNo;
	}

	@Column(name = "SHIP_NO_", length = 20)
	public String getShipNo() {
		return shipNo;
	}

	public void setShr(String shr) {
		this.shr = shr;
	}

	@Column(name = "SHR_", length = 50)
	public String getShr() {
		return shr;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	@Column(name = "DRIVER_LICENSE_", length = 50)
	public String getDriverLicense() {
		return driverLicense;
	}

	public void setPhDate(String phDate) {
		this.phDate = phDate;
	}

	@Column(name = "PH_DATE_", length = 20)
	public String getPhDate() {
		return phDate;
	}

	public void setPhEmp(String phEmp) {
		this.phEmp = phEmp;
	}

	@Column(name = "PH_EMP_", length = 50)
	public String getPhEmp() {
		return phEmp;
	}

	public void setOutEmp(String outEmp) {
		this.outEmp = outEmp;
	}

	@Column(name = "OUT_EMP_", length = 50)
	public String getOutEmp() {
		return outEmp;
	}

	public void setXzEmp(String xzEmp) {
		this.xzEmp = xzEmp;
	}

	@Column(name = "XZ_EMP_", length = 50)
	public String getXzEmp() {
		return xzEmp;
	}

	public void setXzTime(String xzTime) {
		this.xzTime = xzTime;
	}

	@Column(name = "XZ_TIME_", length = 20)
	public String getXzTime() {
		return xzTime;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	@Column(name = "STATION_CODE_", length = 50)
	public String getStationCode() {
		return stationCode;
	}

	public void setCdTime(String cdTime) {
		this.cdTime = cdTime;
	}

	@Column(name = "CD_TIME_", length = 20)
	public String getCdTime() {
		return cdTime;
	}

	public void setZcr(String zcr) {
		this.zcr = zcr;
	}

	@Column(name = "ZCR_", length = 50)
	public String getZcr() {
		return zcr;
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

	public void setPip(String pip) {
		this.pip = pip;
	}

	@Column(name = "PIP_", length = 20)
	public String getPip() {
		return pip;
	}

	public void setZz(String zz) {
		this.zz = zz;
	}

	@Column(name = "ZZ_", length = 50)
	public String getZz() {
		return zz;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	@Column(name = "TS_")
	public BigDecimal getTs() {
		return ts;
	}

	public void setDsyf(BigDecimal dsyf) {
		this.dsyf = dsyf;
	}

	@Column(name = "DSYF_")
	public BigDecimal getDsyf() {
		return dsyf;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Column(name = "TOTAL_AMT_")
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setStorageAmt(BigDecimal storageAmt) {
		this.storageAmt = storageAmt;
	}

	@Column(name = "STORAGE_AMT_")
	public BigDecimal getStorageAmt() {
		return storageAmt;
	}

	public void setLiftingAmt(BigDecimal liftingAmt) {
		this.liftingAmt = liftingAmt;
	}

	@Column(name = "LIFTING_AMT_")
	public BigDecimal getLiftingAmt() {
		return liftingAmt;
	}

	public void setDiscountAmt(BigDecimal discountAmt) {
		this.discountAmt = discountAmt;
	}

	@Column(name = "DISCOUNT_AMT_")
	public BigDecimal getDiscountAmt() {
		return discountAmt;
	}

	public void setOrderAmt(BigDecimal orderAmt) {
		this.orderAmt = orderAmt;
	}

	@Column(name = "ORDER_AMT_")
	public BigDecimal getOrderAmt() {
		return orderAmt;
	}

	public void setPremiumsAmt(BigDecimal premiumsAmt) {
		this.premiumsAmt = premiumsAmt;
	}

	@Column(name = "PREMIUMS_AMT_")
	public BigDecimal getPremiumsAmt() {
		return premiumsAmt;
	}

	public void setReturnAmt(BigDecimal returnAmt) {
		this.returnAmt = returnAmt;
	}

	@Column(name = "RETURN_AMT_")
	public BigDecimal getReturnAmt() {
		return returnAmt;
	}

	public void setOverdueAmt(BigDecimal overdueAmt) {
		this.overdueAmt = overdueAmt;
	}

	@Column(name = "OVERDUE_AMT_")
	public BigDecimal getOverdueAmt() {
		return overdueAmt;
	}

	public void setDbAmt(BigDecimal dbAmt) {
		this.dbAmt = dbAmt;
	}

	@Column(name = "DB_AMT_")
	public BigDecimal getDbAmt() {
		return dbAmt;
	}

	public void setManagerAmt(BigDecimal managerAmt) {
		this.managerAmt = managerAmt;
	}

	@Column(name = "MANAGER_AMT_")
	public BigDecimal getManagerAmt() {
		return managerAmt;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	@Column(name = "TRAN_AMT_")
	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Column(name = "TAX_AMT_")
	public BigDecimal getTaxAmt() {
		return taxAmt;
	}

	public void setKk(BigDecimal kk) {
		this.kk = kk;
	}

	@Column(name = "KK_")
	public BigDecimal getKk() {
		return kk;
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

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 50)
	public String getLb() {
		return lb;
	}

	public void setSjtz(String sjtz) {
		this.sjtz = sjtz;
	}

	@Column(name = "SJTZ_", length = 20)
	public String getSjtz() {
		return sjtz;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	@Column(name = "START_STATION_", length = 50)
	public String getStartStation() {
		return startStation;
	}

	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}

	@Column(name = "END_LINE_", length = 50)
	public String getEndLine() {
		return endLine;
	}

	public void setZcqrEmp(String zcqrEmp) {
		this.zcqrEmp = zcqrEmp;
	}

	@Column(name = "ZCQR_EMP_", length = 50)
	public String getZcqrEmp() {
		return zcqrEmp;
	}

	public void setZcqrTime(String zcqrTime) {
		this.zcqrTime = zcqrTime;
	}

	@Column(name = "ZCQR_TIME_", length = 20)
	public String getZcqrTime() {
		return zcqrTime;
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

	public void setBy3(BigDecimal by3) {
		this.by3 = by3;
	}

	@Column(name = "BY3_")
	public BigDecimal getBy3() {
		return by3;
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
		return "Tbih19 [ih19Id=" + ih19Id + ",compId=" + compId + ",outNo="
				+ outNo + ",outType=" + outType + ",ownnerCompNo="
				+ ownnerCompNo + ",ownnerCompName=" + ownnerCompName
				+ ",custNo=" + custNo + ",custName=" + custName + ",carrierNo="
				+ carrierNo + ",carrierName=" + carrierName + ",receiptCompNo="
				+ receiptCompNo + ",receiptCompName=" + receiptCompName
				+ ",tranOrderNo=" + tranOrderNo + ",orderCompNo=" + orderCompNo
				+ ",orderCompName=" + orderCompName + ",payCompNo=" + payCompNo
				+ ",payCompName=" + payCompName + ",contNo=" + contNo
				+ ",forecastNo=" + forecastNo + ",deliveryNo=" + deliveryNo
				+ ",ladingNo=" + ladingNo + ",settleType=" + settleType
				+ ",orderItem=" + orderItem + ",orderNo=" + orderNo
				+ ",tranNo=" + tranNo + ",labelNo=" + labelNo + ",soure="
				+ soure + ",checkNo=" + checkNo + ",unit=" + unit
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",gradeNo=" + gradeNo
				+ ",steelNo=" + steelNo + ",qb=" + qb + ",dc=" + dc + ",thick="
				+ thick + ",size=" + size + ",width=" + width + ",length="
				+ length + ",pieceNum=" + pieceNum + ",num=" + num + ",wgt="
				+ wgt + ",tareWgt=" + tareWgt + ",grossWgt=" + grossWgt
				+ ",netWgt=" + netWgt + ",kwWgt=" + kwWgt + ",outDate="
				+ outDate + ",outWareCode=" + outWareCode + ",startAddress="
				+ startAddress + ",endAddress=" + endAddress
				+ ",receiptWareCode=" + receiptWareCode + ",tranType="
				+ tranType + ",carTeam=" + carTeam + ",carNo=" + carNo
				+ ",telephone=" + telephone + ",area=" + area + ",settleNo="
				+ settleNo + ",invoice=" + invoice + ",wareQwCode="
				+ wareQwCode + ",layerCode=" + layerCode + ",status=" + status
				+ ",applyStatus=" + applyStatus + ",ifMix=" + ifMix + ",syhch="
				+ syhch + ",shipNo=" + shipNo + ",shr=" + shr
				+ ",driverLicense=" + driverLicense + ",phDate=" + phDate
				+ ",phEmp=" + phEmp + ",outEmp=" + outEmp + ",xzEmp=" + xzEmp
				+ ",xzTime=" + xzTime + ",stationCode=" + stationCode
				+ ",cdTime=" + cdTime + ",zcr=" + zcr + ",liftingTeam="
				+ liftingTeam + ",liftingEmp=" + liftingEmp + ",craneDriver="
				+ craneDriver + ",pip=" + pip + ",zz=" + zz + ",ts=" + ts
				+ ",dsyf=" + dsyf + ",price=" + price + ",totalAmt=" + totalAmt
				+ ",storageAmt=" + storageAmt + ",liftingAmt=" + liftingAmt
				+ ",discountAmt=" + discountAmt + ",orderAmt=" + orderAmt
				+ ",premiumsAmt=" + premiumsAmt + ",returnAmt=" + returnAmt
				+ ",overdueAmt=" + overdueAmt + ",dbAmt=" + dbAmt
				+ ",managerAmt=" + managerAmt + ",tranAmt=" + tranAmt
				+ ",taxAmt=" + taxAmt + ",kk=" + kk + ",startLine=" + startLine
				+ ",endStation=" + endStation + ",lb=" + lb + ",sjtz=" + sjtz
				+ ",startStation=" + startStation + ",endLine=" + endLine
				+ ",zcqrEmp=" + zcqrEmp + ",zcqrTime=" + zcqrTime + ",desp="
				+ desp + ",by1=" + by1 + ",by2=" + by2 + ",by3=" + by3
				+ ",createEmp=" + createEmp + ",createTime=" + createTime
				+ ",updateEmp=" + updateEmp + ",updateTime=" + updateTime
				+ ",version=" + version + "]";
	}

}

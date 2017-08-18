package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih30:TBIH30(货品表)
 */
@Entity
@Table(name = "tbih30")
public class Tbih30 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
	private String ih30Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 父标签号:父标签号
	 */
	@PropertyDef(label = "父标签号", description = "父标签号:父标签号")
	private String labelNoF;

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
	 * 件数:件数
	 */
	@PropertyDef(label = "件数", description = "件数:件数")
	private BigDecimal pieceNum;

	/**
	 * 数量:数量
	 */
	@PropertyDef(label = "数量", description = "数量:数量")
	private BigDecimal num;

	/**
	 * 重量:重量
	 */
	@PropertyDef(label = "重量", description = "重量:重量")
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
	 * 入库单重:入库单重
	 */
	@PropertyDef(label = "入库单重", description = "入库单重:入库单重")
	private BigDecimal inUnitWgt;

	/**
	 * 入库重量:入库重量
	 */
	@PropertyDef(label = "入库重量", description = "入库重量:入库重量")
	private BigDecimal inWgt;

	/**
	 * 出库重量:出库重量
	 */
	@PropertyDef(label = "出库重量", description = "出库重量:出库重量")
	private BigDecimal outWgt;

	/**
	 * 可开单总量:可开单总量
	 */
	@PropertyDef(label = "可开单总量", description = "可开单总量:可开单总量")
	private BigDecimal maxWgt;

	/**
	 * 磅差:磅差
	 */
	@PropertyDef(label = "磅差", description = "磅差:磅差")
	private BigDecimal differenceWgt;

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
	 * 服务类型:服务类型
	 */
	@PropertyDef(label = "服务类型", description = "服务类型:服务类型")
	private String fwlx;

	/**
	 * 结算方式:结算方式
	 */
	@PropertyDef(label = "结算方式", description = "结算方式:结算方式")
	private String settleType;

	/**
	 * 水运航次号:水运航次号
	 */
	@PropertyDef(label = "水运航次号", description = "水运航次号:水运航次号")
	private String syhch;

	/**
	 * 方案号:方案号
	 */
	@PropertyDef(label = "方案号", description = "方案号:方案号")
	private String fno;

	/**
	 * 运输单号:运输单号
	 */
	@PropertyDef(label = "运输单号", description = "运输单号:运输单号")
	private String transNo;

	/**
	 * 价格编号:价格编号
	 */
	@PropertyDef(label = "价格编号", description = "价格编号:价格编号")
	private String priceSno;

	/**
	 * 转库单ID:转库单ID
	 */
	@PropertyDef(label = "转库单ID", description = "转库单ID:转库单ID")
	private String zkdNo;

	/**
	 * 入库单ID:入库单ID
	 */
	@PropertyDef(label = "入库单ID", description = "入库单ID:入库单ID")
	private String inNo;

	/**
	 * 入库时间:入库时间
	 */
	@PropertyDef(label = "入库时间", description = "入库时间:入库时间")
	private String inDate;

	/**
	 * 入库人:入库人
	 */
	@PropertyDef(label = "入库人", description = "入库人:入库人")
	private String inEmp;

	/**
	 * 入库装卸班组:入库装卸班组
	 */
	@PropertyDef(label = "入库装卸班组", description = "入库装卸班组:入库装卸班组")
	private String inLiftingTeam;

	/**
	 * 入库理货员:入库理货员
	 */
	@PropertyDef(label = "入库理货员", description = "入库理货员:入库理货员")
	private String inLiftingEmp;

	/**
	 * 入库行车工:入库行车工
	 */
	@PropertyDef(label = "入库行车工", description = "入库行车工:入库行车工")
	private String inCraneDriver;

	/**
	 * 出库单ID:出库单ID
	 */
	@PropertyDef(label = "出库单ID", description = "出库单ID:出库单ID")
	private String outNo;

	/**
	 * 出库时间:出库时间
	 */
	@PropertyDef(label = "出库时间", description = "出库时间:出库时间")
	private String outDate;

	/**
	 * 出库人:出库人
	 */
	@PropertyDef(label = "出库人", description = "出库人:出库人")
	private String outEmp;

	/**
	 * 出库装卸班组:出库装卸班组
	 */
	@PropertyDef(label = "出库装卸班组", description = "出库装卸班组:出库装卸班组")
	private String outLiftingTeam;

	/**
	 * 出库理货员:出库理货员
	 */
	@PropertyDef(label = "出库理货员", description = "出库理货员:出库理货员")
	private String outLiftingEmp;

	/**
	 * 出库行车工:出库行车工
	 */
	@PropertyDef(label = "出库行车工", description = "出库行车工:出库行车工")
	private String outCraneDriver;

	/**
	 * 配货人:配货人
	 */
	@PropertyDef(label = "配货人", description = "配货人:配货人")
	private String phEmp;

	/**
	 * 配货IP:配货IP
	 */
	@PropertyDef(label = "配货IP", description = "配货IP:配货IP")
	private String phIp;

	/**
	 * 装车人:装车人
	 */
	@PropertyDef(label = "装车人", description = "装车人:装车人")
	private String zcr;

	/**
	 * 装车时间:装车时间
	 */
	@PropertyDef(label = "装车时间", description = "装车时间:装车时间")
	private String zcTime;

	/**
	 * 计费日:计费日
	 */
	@PropertyDef(label = "计费日", description = "计费日:计费日")
	private String jfr;

	/**
	 * 类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)
	 */
	@PropertyDef(label = "类别(JY-经营/ZY-自营)", description = "类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)")
	private String lb;

	/**
	 * 库别:库别
	 */
	@PropertyDef(label = "库别", description = "库别:库别")
	private String kb;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 收费额:收费额
	 */
	@PropertyDef(label = "收费额", description = "收费额:收费额")
	private BigDecimal sfe;

	/**
	 * 缴款确认提交费用:缴款确认提交费用
	 */
	@PropertyDef(label = "缴款确认提交费用", description = "缴款确认提交费用:缴款确认提交费用")
	private BigDecimal jkqrtjFy;

	/**
	 * 确认配货费用:确认配货费用
	 */
	@PropertyDef(label = "确认配货费用", description = "确认配货费用:确认配货费用")
	private BigDecimal qrphFy;

	/**
	 * 超期费结算状态:超期费结算状态
	 */
	@PropertyDef(label = "超期费结算状态", description = "超期费结算状态:超期费结算状态")
	private String isOverdue;

	/**
	 * 仓储费结算状态:仓储费结算状态
	 */
	@PropertyDef(label = "仓储费结算状态", description = "仓储费结算状态:仓储费结算状态")
	private String isStorage;

	/**
	 * 仓储管理费结算状态:仓储管理费结算状态
	 */
	@PropertyDef(label = "仓储管理费结算状态", description = "仓储管理费结算状态:仓储管理费结算状态")
	private String isManager;

	/**
	 * 特殊价格费结算状态:特殊价格费结算状态
	 */
	@PropertyDef(label = "特殊价格费结算状态", description = "特殊价格费结算状态:特殊价格费结算状态")
	private String isOrder;

	/**
	 * 翻堆费结算状态:翻堆费结算状态
	 */
	@PropertyDef(label = "翻堆费结算状态", description = "翻堆费结算状态:翻堆费结算状态")
	private String isTurning;

	/**
	 * 仓储管理天数:仓储管理天数
	 */
	@PropertyDef(label = "仓储管理天数", description = "仓储管理天数:仓储管理天数")
	private String managerTs;

	/**
	 * 结算导入标示(已导=1，否则=0):结算导入标示(已导=1，否则=0)
	 */
	@PropertyDef(label = "结算导入标示(已导=1，否则=0)", description = "结算导入标示(已导=1，否则=0):结算导入标示(已导=1，否则=0)")
	private String jsdr;

	/**
	 * 冲红日:冲红日
	 */
	@PropertyDef(label = "冲红日", description = "冲红日:冲红日")
	private String chr;

	/**
	 * 天数:天数
	 */
	@PropertyDef(label = "天数", description = "天数:天数")
	private String age;

	/**
	 * 货品状态:货品状态
	 */
	@PropertyDef(label = "货品状态", description = "货品状态:货品状态")
	private String hpZt;

	/**
	 * 状态(1确认配货2接受确认3打印六联单):状态(1确认配货2接受确认3打印六联单)
	 */
	@PropertyDef(label = "状态(1确认配货2接受确认3打印六联单)", description = "状态(1确认配货2接受确认3打印六联单):状态(1确认配货2接受确认3打印六联单)")
	private String status;

	/**
	 * 交期时间:交期时间
	 */
	@PropertyDef(label = "交期时间", description = "交期时间:交期时间")
	private String deadLine;

	/**
	 * 是否为重点合同:是否为重点合同
	 */
	@PropertyDef(label = "是否为重点合同", description = "是否为重点合同:是否为重点合同")
	private String sfzd;

	/**
	 * 是否导入(A转库入库B货权转授):是否导入(A转库入库B货权转授)
	 */
	@PropertyDef(label = "是否导入(A转库入库B货权转授)", description = "是否导入(A转库入库B货权转授):是否导入(A转库入库B货权转授)")
	private String ifImport;

	/**
	 * 转单次数标记:转单次数标记
	 */
	@PropertyDef(label = "转单次数标记", description = "转单次数标记:转单次数标记")
	private String ifzdbj;

	/**
	 * 是否超期:是否超期
	 */
	@PropertyDef(label = "是否超期", description = "是否超期:是否超期")
	private String isCq;

	/**
	 * 是否项次标记:是否项次标记
	 */
	@PropertyDef(label = "是否项次标记", description = "是否项次标记:是否项次标记")
	private String sfxcbj;

	/**
	 * 是否直取标记:是否直取标记
	 */
	@PropertyDef(label = "是否直取标记", description = "是否直取标记:是否直取标记")
	private String sfzq;

	/**
	 * 标记原因备注:标记原因备注
	 */
	@PropertyDef(label = "标记原因备注", description = "标记原因备注:标记原因备注")
	private String bjyybz;

	/**
	 * 专线:专线
	 */
	@PropertyDef(label = "专线", description = "专线:专线")
	private String lineCode;

	/**
	 * 当前到站:当前到站
	 */
	@PropertyDef(label = "当前到站", description = "当前到站:当前到站")
	private String stationCode;

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

	/**
	 * WARE_QW_CODE_OLD_:
	 */
	@PropertyDef(label = "WARE_QW_CODE_OLD_", description = "WARE_QW_CODE_OLD_:")
	private String wareQwCodeOld;

	/**
	 * LAYER_CODE_OLD_:
	 */
	@PropertyDef(label = "LAYER_CODE_OLD_", description = "LAYER_CODE_OLD_:")
	private String layerCodeOld;

	/**
	 * M_P_CONFRIM_:
	 */
	@PropertyDef(label = "M_P_CONFRIM_", description = "M_P_CONFRIM_:")
	private String mPConfrim;

	/**
	 * M_P_CONFRIM_TIME_:
	 */
	@PropertyDef(label = "M_P_CONFRIM_TIME_", description = "M_P_CONFRIM_TIME_:")
	private String mPConfrimTime;

	/**
	 * BYAMT1_:
	 */
	@PropertyDef(label = "BYAMT1_", description = "BYAMT1_:")
	private BigDecimal byamt1;

	/**
	 * BYAMT2_:
	 */
	@PropertyDef(label = "BYAMT2_", description = "BYAMT2_:")
	private BigDecimal byamt2;

	/**
	 * BYPRICE1_:
	 */
	@PropertyDef(label = "BYPRICE1_", description = "BYPRICE1_:")
	private BigDecimal byprice1;

	/**
	 * BYPRICE2_:
	 */
	@PropertyDef(label = "BYPRICE2_", description = "BYPRICE2_:")
	private BigDecimal byprice2;

	/**
	 * CB_:
	 */
	@PropertyDef(label = "CB_", description = "CB_:")
	private String cb;

	/**
	 * CCGLTS_:
	 */
	@PropertyDef(label = "CCGLTS_", description = "CCGLTS_:")
	private String ccglts;

	/**
	 * CKB_:
	 */
	@PropertyDef(label = "CKB_", description = "CKB_:")
	private String ckb;

	/**
	 * CURRENT_LINE_:
	 */
	@PropertyDef(label = "CURRENT_LINE_", description = "CURRENT_LINE_:")
	private String currentLine;

	/**
	 * CURRENT_STATION_:
	 */
	@PropertyDef(label = "CURRENT_STATION_", description = "CURRENT_STATION_:")
	private String currentStation;

	/**
	 * DISCOUNT_PRICE_:
	 */
	@PropertyDef(label = "DISCOUNT_PRICE_", description = "DISCOUNT_PRICE_:")
	private BigDecimal discountPrice;

	/**
	 * GZ_:
	 */
	@PropertyDef(label = "GZ_", description = "GZ_:")
	private String gz;

	/**
	 * HEIGHT_:
	 */
	@PropertyDef(label = "HEIGHT_", description = "HEIGHT_:")
	private BigDecimal height;

	/**
	 * HPLY_:
	 */
	@PropertyDef(label = "HPLY_", description = "HPLY_:")
	private String hply;

	/**
	 * IF_ACCEPT_:
	 */
	@PropertyDef(label = "IF_ACCEPT_", description = "IF_ACCEPT_:")
	private String ifAccept;

	/**
	 * IF_CONFRIM_:
	 */
	@PropertyDef(label = "IF_CONFRIM_", description = "IF_CONFRIM_:")
	private String ifConfrim;

	/**
	 * IN_TIME_:
	 */
	@PropertyDef(label = "IN_TIME_", description = "IN_TIME_:")
	private String inTime;

	/**
	 * ISCC_:
	 */
	@PropertyDef(label = "ISCC_", description = "ISCC_:")
	private String iscc;

	/**
	 * ISCCGL_:
	 */
	@PropertyDef(label = "ISCCGL_", description = "ISCCGL_:")
	private String isccgl;

	/**
	 * ISCQ_:
	 */
	@PropertyDef(label = "ISCQ_", description = "ISCQ_:")
	private String iscq;

	/**
	 * ISMONTH_:
	 */
	@PropertyDef(label = "ISMONTH_", description = "ISMONTH_:")
	private String ismonth;

	/**
	 * JJ_:
	 */
	@PropertyDef(label = "JJ_", description = "JJ_:")
	private BigDecimal jj;

	/**
	 * JSXM_:
	 */
	@PropertyDef(label = "JSXM_", description = "JSXM_:")
	private String jsxm;

	/**
	 * LIFTING_AMT_:
	 */
	@PropertyDef(label = "LIFTING_AMT_", description = "LIFTING_AMT_:")
	private BigDecimal liftingAmt;

	/**
	 * LIFTING_PRICE_:
	 */
	@PropertyDef(label = "LIFTING_PRICE_", description = "LIFTING_PRICE_:")
	private BigDecimal liftingPrice;

	/**
	 * MANAGER_AMT_:
	 */
	@PropertyDef(label = "MANAGER_AMT_", description = "MANAGER_AMT_:")
	private BigDecimal managerAmt;

	/**
	 * MANAGER_PRICE_:
	 */
	@PropertyDef(label = "MANAGER_PRICE_", description = "MANAGER_PRICE_:")
	private BigDecimal managerPrice;

	/**
	 * NODE_AREA_:
	 */
	@PropertyDef(label = "NODE_AREA_", description = "NODE_AREA_:")
	private String nodeArea;

	/**
	 * NODE_PASS_:
	 */
	@PropertyDef(label = "NODE_PASS_", description = "NODE_PASS_:")
	private String nodePass;

	/**
	 * NOW_SER_TYPE_:
	 */
	@PropertyDef(label = "NOW_SER_TYPE_", description = "NOW_SER_TYPE_:")
	private String nowSerType;

	/**
	 * OUT_AMT_:
	 */
	@PropertyDef(label = "OUT_AMT_", description = "OUT_AMT_:")
	private BigDecimal outAmt;

	/**
	 * OUT_TIME_:
	 */
	@PropertyDef(label = "OUT_TIME_", description = "OUT_TIME_:")
	private String outTime;

	/**
	 * OVERDUE_AMT_:
	 */
	@PropertyDef(label = "OVERDUE_AMT_", description = "OVERDUE_AMT_:")
	private BigDecimal overdueAmt;

	/**
	 * PREMIUMS_AMT_:
	 */
	@PropertyDef(label = "PREMIUMS_AMT_", description = "PREMIUMS_AMT_:")
	private BigDecimal premiumsAmt;

	/**
	 * PRICE_:
	 */
	@PropertyDef(label = "PRICE_", description = "PRICE_:")
	private BigDecimal price;

	/**
	 * PX_:
	 */
	@PropertyDef(label = "PX_", description = "PX_:")
	private String px;

	/**
	 * RETURN_AMT_:
	 */
	@PropertyDef(label = "RETURN_AMT_", description = "RETURN_AMT_:")
	private BigDecimal returnAmt;

	/**
	 * RETURN_PRICE_:
	 */
	@PropertyDef(label = "RETURN_PRICE_", description = "RETURN_PRICE_:")
	private BigDecimal returnPrice;

	/**
	 * RKB_:
	 */
	@PropertyDef(label = "RKB_", description = "RKB_:")
	private String rkb;

	/**
	 * SERVIES_TYPE_:
	 */
	@PropertyDef(label = "SERVIES_TYPE_", description = "SERVIES_TYPE_:")
	private String serviesType;

	/**
	 * SFSDBJ_:
	 */
	@PropertyDef(label = "SFSDBJ_", description = "SFSDBJ_:")
	private String sfsdbj;

	/**
	 * SFWGCP_:
	 */
	@PropertyDef(label = "SFWGCP_", description = "SFWGCP_:")
	private String sfwgcp;

	/**
	 * SFYQRXNYCW_:
	 */
	@PropertyDef(label = "SFYQRXNYCW_", description = "SFYQRXNYCW_:")
	private String sfyqrxnycw;

	/**
	 * STORAGE_AMT_:
	 */
	@PropertyDef(label = "STORAGE_AMT_", description = "STORAGE_AMT_:")
	private BigDecimal storageAmt;

	/**
	 * STORAGE_PRICE_:
	 */
	@PropertyDef(label = "STORAGE_PRICE_", description = "STORAGE_PRICE_:")
	private BigDecimal storagePrice;

	/**
	 * TRAN_AMT_:
	 */
	@PropertyDef(label = "TRAN_AMT_", description = "TRAN_AMT_:")
	private BigDecimal tranAmt;

	/**
	 * TRAN_NO_:
	 */
	@PropertyDef(label = "TRAN_NO_", description = "TRAN_NO_:")
	private String tranNo;

	/**
	 * TRAN_PRICE_:
	 */
	@PropertyDef(label = "TRAN_PRICE_", description = "TRAN_PRICE_:")
	private BigDecimal tranPrice;

	/**
	 * XN_:
	 */
	@PropertyDef(label = "XN_", description = "XN_:")
	private String xn;

	/**
	 * XZ_:
	 */
	@PropertyDef(label = "XZ_", description = "XZ_:")
	private BigDecimal xz;

	public Tbih30() {
		super();
	}

	public Tbih30(String ih30Id, String compId, String labelNo,
			String labelNoF, String wareQwCode, String layerCode,
			String prodType, String prodTypeName, String productNo,
			String productName, String productDetail, String gradeNo,
			String steelNo, String qb, String dc, BigDecimal thick,
			BigDecimal width, BigDecimal length, String size,
			BigDecimal pieceNum, BigDecimal num, BigDecimal wgt,
			BigDecimal volume, BigDecimal unitWgt, BigDecimal inUnitWgt,
			BigDecimal inWgt, BigDecimal outWgt, BigDecimal maxWgt,
			BigDecimal differenceWgt, BigDecimal cargoPrice,
			BigDecimal cargoAmt, String custNo, String custName,
			String ownnerCompNo, String ownnerCompName, String carrierNo,
			String carrierName, String receiptCompNo, String receiptCompName,
			String orderCompNo, String orderCompName, String contNo,
			String contractNo, String tranOrderNo, String orderNo,
			String orderItem, String deliveryNo, String ladingNo,
			String settleNo, String invoice, String fwlx, String settleType,
			String syhch, String fno, String transNo, String priceSno,
			String zkdNo, String inNo, String inDate, String inEmp,
			String inLiftingTeam, String inLiftingEmp, String inCraneDriver,
			String outNo, String outDate, String outEmp, String outLiftingTeam,
			String outLiftingEmp, String outCraneDriver, String phEmp,
			String phIp, String zcr, String zcTime, String jfr, String lb,
			String kb, String area, BigDecimal sfe, BigDecimal jkqrtjFy,
			BigDecimal qrphFy, String isOverdue, String isStorage,
			String isManager, String isOrder, String isTurning,
			String managerTs, String jsdr, String chr, String age, String hpZt,
			String status, String deadLine, String sfzd, String ifImport,
			String ifzdbj, String isCq, String sfxcbj, String sfzq,
			String bjyybz, String lineCode, String stationCode, String by1,
			String by2, String by3, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version,
			String wareQwCodeOld, String layerCodeOld, String mPConfrim,
			String mPConfrimTime, BigDecimal byamt1, BigDecimal byamt2,
			BigDecimal byprice1, BigDecimal byprice2, String cb, String ccglts,
			String ckb, String currentLine, String currentStation,
			BigDecimal discountPrice, String gz, BigDecimal height,
			String hply, String ifAccept, String ifConfrim, String inTime,
			String iscc, String isccgl, String iscq, String ismonth,
			BigDecimal jj, String jsxm, BigDecimal liftingAmt,
			BigDecimal liftingPrice, BigDecimal managerAmt,
			BigDecimal managerPrice, String nodeArea, String nodePass,
			String nowSerType, BigDecimal outAmt, String outTime,
			BigDecimal overdueAmt, BigDecimal premiumsAmt, BigDecimal price,
			String px, BigDecimal returnAmt, BigDecimal returnPrice,
			String rkb, String serviesType, String sfsdbj, String sfwgcp,
			String sfyqrxnycw, BigDecimal storageAmt, BigDecimal storagePrice,
			BigDecimal tranAmt, String tranNo, BigDecimal tranPrice, String xn,
			BigDecimal xz) {
		super();
		this.ih30Id = ih30Id;
		this.compId = compId;
		this.labelNo = labelNo;
		this.labelNoF = labelNoF;
		this.wareQwCode = wareQwCode;
		this.layerCode = layerCode;
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
		this.pieceNum = pieceNum;
		this.num = num;
		this.wgt = wgt;
		this.volume = volume;
		this.unitWgt = unitWgt;
		this.inUnitWgt = inUnitWgt;
		this.inWgt = inWgt;
		this.outWgt = outWgt;
		this.maxWgt = maxWgt;
		this.differenceWgt = differenceWgt;
		this.cargoPrice = cargoPrice;
		this.cargoAmt = cargoAmt;
		this.custNo = custNo;
		this.custName = custName;
		this.ownnerCompNo = ownnerCompNo;
		this.ownnerCompName = ownnerCompName;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.receiptCompNo = receiptCompNo;
		this.receiptCompName = receiptCompName;
		this.orderCompNo = orderCompNo;
		this.orderCompName = orderCompName;
		this.contNo = contNo;
		this.contractNo = contractNo;
		this.tranOrderNo = tranOrderNo;
		this.orderNo = orderNo;
		this.orderItem = orderItem;
		this.deliveryNo = deliveryNo;
		this.ladingNo = ladingNo;
		this.settleNo = settleNo;
		this.invoice = invoice;
		this.fwlx = fwlx;
		this.settleType = settleType;
		this.syhch = syhch;
		this.fno = fno;
		this.transNo = transNo;
		this.priceSno = priceSno;
		this.zkdNo = zkdNo;
		this.inNo = inNo;
		this.inDate = inDate;
		this.inEmp = inEmp;
		this.inLiftingTeam = inLiftingTeam;
		this.inLiftingEmp = inLiftingEmp;
		this.inCraneDriver = inCraneDriver;
		this.outNo = outNo;
		this.outDate = outDate;
		this.outEmp = outEmp;
		this.outLiftingTeam = outLiftingTeam;
		this.outLiftingEmp = outLiftingEmp;
		this.outCraneDriver = outCraneDriver;
		this.phEmp = phEmp;
		this.phIp = phIp;
		this.zcr = zcr;
		this.zcTime = zcTime;
		this.jfr = jfr;
		this.lb = lb;
		this.kb = kb;
		this.area = area;
		this.sfe = sfe;
		this.jkqrtjFy = jkqrtjFy;
		this.qrphFy = qrphFy;
		this.isOverdue = isOverdue;
		this.isStorage = isStorage;
		this.isManager = isManager;
		this.isOrder = isOrder;
		this.isTurning = isTurning;
		this.managerTs = managerTs;
		this.jsdr = jsdr;
		this.chr = chr;
		this.age = age;
		this.hpZt = hpZt;
		this.status = status;
		this.deadLine = deadLine;
		this.sfzd = sfzd;
		this.ifImport = ifImport;
		this.ifzdbj = ifzdbj;
		this.isCq = isCq;
		this.sfxcbj = sfxcbj;
		this.sfzq = sfzq;
		this.bjyybz = bjyybz;
		this.lineCode = lineCode;
		this.stationCode = stationCode;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.wareQwCodeOld = wareQwCodeOld;
		this.layerCodeOld = layerCodeOld;
		this.mPConfrim = mPConfrim;
		this.mPConfrimTime = mPConfrimTime;
		this.byamt1 = byamt1;
		this.byamt2 = byamt2;
		this.byprice1 = byprice1;
		this.byprice2 = byprice2;
		this.cb = cb;
		this.ccglts = ccglts;
		this.ckb = ckb;
		this.currentLine = currentLine;
		this.currentStation = currentStation;
		this.discountPrice = discountPrice;
		this.gz = gz;
		this.height = height;
		this.hply = hply;
		this.ifAccept = ifAccept;
		this.ifConfrim = ifConfrim;
		this.inTime = inTime;
		this.iscc = iscc;
		this.isccgl = isccgl;
		this.iscq = iscq;
		this.ismonth = ismonth;
		this.jj = jj;
		this.jsxm = jsxm;
		this.liftingAmt = liftingAmt;
		this.liftingPrice = liftingPrice;
		this.managerAmt = managerAmt;
		this.managerPrice = managerPrice;
		this.nodeArea = nodeArea;
		this.nodePass = nodePass;
		this.nowSerType = nowSerType;
		this.outAmt = outAmt;
		this.outTime = outTime;
		this.overdueAmt = overdueAmt;
		this.premiumsAmt = premiumsAmt;
		this.price = price;
		this.px = px;
		this.returnAmt = returnAmt;
		this.returnPrice = returnPrice;
		this.rkb = rkb;
		this.serviesType = serviesType;
		this.sfsdbj = sfsdbj;
		this.sfwgcp = sfwgcp;
		this.sfyqrxnycw = sfyqrxnycw;
		this.storageAmt = storageAmt;
		this.storagePrice = storagePrice;
		this.tranAmt = tranAmt;
		this.tranNo = tranNo;
		this.tranPrice = tranPrice;
		this.xn = xn;
		this.xz = xz;
	}

	public void setIh30Id(String ih30Id) {
		this.ih30Id = ih30Id;
	}

	@Id
	@Column(name = "IH30_ID_", length = 50, nullable = false)
	public String getIh30Id() {
		return ih30Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20, unique = true)
	public String getLabelNo() {
		return labelNo;
	}

	public void setLabelNoF(String labelNoF) {
		this.labelNoF = labelNoF;
	}

	@Column(name = "LABEL_NO_F_", length = 20)
	public String getLabelNoF() {
		return labelNoF;
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

	@Column(name = "SIZE_", length = 40)
	public String getSize() {
		return size;
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

	public void setInUnitWgt(BigDecimal inUnitWgt) {
		this.inUnitWgt = inUnitWgt;
	}

	@Column(name = "IN_UNIT_WGT_")
	public BigDecimal getInUnitWgt() {
		return inUnitWgt;
	}

	public void setInWgt(BigDecimal inWgt) {
		this.inWgt = inWgt;
	}

	@Column(name = "IN_WGT_")
	public BigDecimal getInWgt() {
		return inWgt;
	}

	public void setOutWgt(BigDecimal outWgt) {
		this.outWgt = outWgt;
	}

	@Column(name = "OUT_WGT_")
	public BigDecimal getOutWgt() {
		return outWgt;
	}

	public void setMaxWgt(BigDecimal maxWgt) {
		this.maxWgt = maxWgt;
	}

	@Column(name = "MAX_WGT_")
	public BigDecimal getMaxWgt() {
		return maxWgt;
	}

	public void setDifferenceWgt(BigDecimal differenceWgt) {
		this.differenceWgt = differenceWgt;
	}

	@Column(name = "DIFFERENCE_WGT_")
	public BigDecimal getDifferenceWgt() {
		return differenceWgt;
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

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
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

	public void setFwlx(String fwlx) {
		this.fwlx = fwlx;
	}

	@Column(name = "FWLX_", length = 20)
	public String getFwlx() {
		return fwlx;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setSyhch(String syhch) {
		this.syhch = syhch;
	}

	@Column(name = "SYHCH_", length = 20)
	public String getSyhch() {
		return syhch;
	}

	public void setFno(String fno) {
		this.fno = fno;
	}

	@Column(name = "FNO_", length = 20)
	public String getFno() {
		return fno;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
	}

	public void setPriceSno(String priceSno) {
		this.priceSno = priceSno;
	}

	@Column(name = "PRICE_SNO_", length = 20)
	public String getPriceSno() {
		return priceSno;
	}

	public void setZkdNo(String zkdNo) {
		this.zkdNo = zkdNo;
	}

	@Column(name = "ZKD_NO_", length = 20)
	public String getZkdNo() {
		return zkdNo;
	}

	public void setInNo(String inNo) {
		this.inNo = inNo;
	}

	@Column(name = "IN_NO_", length = 20)
	public String getInNo() {
		return inNo;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	@Column(name = "IN_DATE_", length = 20)
	public String getInDate() {
		return inDate;
	}

	public void setInEmp(String inEmp) {
		this.inEmp = inEmp;
	}

	@Column(name = "IN_EMP_", length = 50)
	public String getInEmp() {
		return inEmp;
	}

	public void setInLiftingTeam(String inLiftingTeam) {
		this.inLiftingTeam = inLiftingTeam;
	}

	@Column(name = "IN_LIFTING_TEAM_", length = 50)
	public String getInLiftingTeam() {
		return inLiftingTeam;
	}

	public void setInLiftingEmp(String inLiftingEmp) {
		this.inLiftingEmp = inLiftingEmp;
	}

	@Column(name = "IN_LIFTING_EMP_", length = 50)
	public String getInLiftingEmp() {
		return inLiftingEmp;
	}

	public void setInCraneDriver(String inCraneDriver) {
		this.inCraneDriver = inCraneDriver;
	}

	@Column(name = "IN_CRANE_DRIVER_", length = 50)
	public String getInCraneDriver() {
		return inCraneDriver;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20)
	public String getOutNo() {
		return outNo;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	@Column(name = "OUT_DATE_", length = 20)
	public String getOutDate() {
		return outDate;
	}

	public void setOutEmp(String outEmp) {
		this.outEmp = outEmp;
	}

	@Column(name = "OUT_EMP_", length = 50)
	public String getOutEmp() {
		return outEmp;
	}

	public void setOutLiftingTeam(String outLiftingTeam) {
		this.outLiftingTeam = outLiftingTeam;
	}

	@Column(name = "OUT_LIFTING_TEAM_", length = 50)
	public String getOutLiftingTeam() {
		return outLiftingTeam;
	}

	public void setOutLiftingEmp(String outLiftingEmp) {
		this.outLiftingEmp = outLiftingEmp;
	}

	@Column(name = "OUT_LIFTING_EMP_", length = 50)
	public String getOutLiftingEmp() {
		return outLiftingEmp;
	}

	public void setOutCraneDriver(String outCraneDriver) {
		this.outCraneDriver = outCraneDriver;
	}

	@Column(name = "OUT_CRANE_DRIVER_", length = 50)
	public String getOutCraneDriver() {
		return outCraneDriver;
	}

	public void setPhEmp(String phEmp) {
		this.phEmp = phEmp;
	}

	@Column(name = "PH_EMP_", length = 50)
	public String getPhEmp() {
		return phEmp;
	}

	public void setPhIp(String phIp) {
		this.phIp = phIp;
	}

	@Column(name = "PH_IP_", length = 20)
	public String getPhIp() {
		return phIp;
	}

	public void setZcr(String zcr) {
		this.zcr = zcr;
	}

	@Column(name = "ZCR_", length = 50)
	public String getZcr() {
		return zcr;
	}

	public void setZcTime(String zcTime) {
		this.zcTime = zcTime;
	}

	@Column(name = "ZC_TIME_", length = 20)
	public String getZcTime() {
		return zcTime;
	}

	public void setJfr(String jfr) {
		this.jfr = jfr;
	}

	@Column(name = "JFR_", length = 20)
	public String getJfr() {
		return jfr;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 20)
	public String getLb() {
		return lb;
	}

	public void setKb(String kb) {
		this.kb = kb;
	}

	@Column(name = "KB_", length = 20)
	public String getKb() {
		return kb;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
	}

	public void setSfe(BigDecimal sfe) {
		this.sfe = sfe;
	}

	@Column(name = "SFE_")
	public BigDecimal getSfe() {
		return sfe;
	}

	public void setJkqrtjFy(BigDecimal jkqrtjFy) {
		this.jkqrtjFy = jkqrtjFy;
	}

	@Column(name = "JKQRTJ_FY_")
	public BigDecimal getJkqrtjFy() {
		return jkqrtjFy;
	}

	public void setQrphFy(BigDecimal qrphFy) {
		this.qrphFy = qrphFy;
	}

	@Column(name = "QRPH_FY_")
	public BigDecimal getQrphFy() {
		return qrphFy;
	}

	public void setIsOverdue(String isOverdue) {
		this.isOverdue = isOverdue;
	}

	@Column(name = "IS_OVERDUE_", length = 20)
	public String getIsOverdue() {
		return isOverdue;
	}

	public void setIsStorage(String isStorage) {
		this.isStorage = isStorage;
	}

	@Column(name = "IS_STORAGE_", length = 20)
	public String getIsStorage() {
		return isStorage;
	}

	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}

	@Column(name = "IS_MANAGER_", length = 20)
	public String getIsManager() {
		return isManager;
	}

	public void setIsOrder(String isOrder) {
		this.isOrder = isOrder;
	}

	@Column(name = "IS_ORDER_", length = 20)
	public String getIsOrder() {
		return isOrder;
	}

	public void setIsTurning(String isTurning) {
		this.isTurning = isTurning;
	}

	@Column(name = "IS_TURNING_", length = 20)
	public String getIsTurning() {
		return isTurning;
	}

	public void setManagerTs(String managerTs) {
		this.managerTs = managerTs;
	}

	@Column(name = "MANAGER_TS_", length = 20)
	public String getManagerTs() {
		return managerTs;
	}

	public void setJsdr(String jsdr) {
		this.jsdr = jsdr;
	}

	@Column(name = "JSDR_", length = 20)
	public String getJsdr() {
		return jsdr;
	}

	public void setChr(String chr) {
		this.chr = chr;
	}

	@Column(name = "CHR_", length = 20)
	public String getChr() {
		return chr;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "AGE_", length = 20)
	public String getAge() {
		return age;
	}

	public void setHpZt(String hpZt) {
		this.hpZt = hpZt;
	}

	@Column(name = "HP_ZT_", length = 20)
	public String getHpZt() {
		return hpZt;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	@Column(name = "DEAD_LINE_", length = 20)
	public String getDeadLine() {
		return deadLine;
	}

	public void setSfzd(String sfzd) {
		this.sfzd = sfzd;
	}

	@Column(name = "SFZD_", length = 20)
	public String getSfzd() {
		return sfzd;
	}

	public void setIfImport(String ifImport) {
		this.ifImport = ifImport;
	}

	@Column(name = "IF_IMPORT_", length = 20)
	public String getIfImport() {
		return ifImport;
	}

	public void setIfzdbj(String ifzdbj) {
		this.ifzdbj = ifzdbj;
	}

	@Column(name = "IFZDBJ_", length = 20)
	public String getIfzdbj() {
		return ifzdbj;
	}

	public void setIsCq(String isCq) {
		this.isCq = isCq;
	}

	@Column(name = "IS_CQ_", length = 20)
	public String getIsCq() {
		return isCq;
	}

	public void setSfxcbj(String sfxcbj) {
		this.sfxcbj = sfxcbj;
	}

	@Column(name = "SFXCBJ_", length = 20)
	public String getSfxcbj() {
		return sfxcbj;
	}

	public void setSfzq(String sfzq) {
		this.sfzq = sfzq;
	}

	@Column(name = "SFZQ_", length = 20)
	public String getSfzq() {
		return sfzq;
	}

	public void setBjyybz(String bjyybz) {
		this.bjyybz = bjyybz;
	}

	@Column(name = "BJYYBZ_", length = 200)
	public String getBjyybz() {
		return bjyybz;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	@Column(name = "LINE_CODE_", length = 50)
	public String getLineCode() {
		return lineCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	@Column(name = "STATION_CODE_", length = 50)
	public String getStationCode() {
		return stationCode;
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

	public void setWareQwCodeOld(String wareQwCodeOld) {
		this.wareQwCodeOld = wareQwCodeOld;
	}

	@Column(name = "WARE_QW_CODE_OLD_", length = 50)
	public String getWareQwCodeOld() {
		return wareQwCodeOld;
	}

	public void setLayerCodeOld(String layerCodeOld) {
		this.layerCodeOld = layerCodeOld;
	}

	@Column(name = "LAYER_CODE_OLD_", length = 20)
	public String getLayerCodeOld() {
		return layerCodeOld;
	}

	public void setMPConfrim(String mPConfrim) {
		this.mPConfrim = mPConfrim;
	}

	@Column(name = "M_P_CONFRIM_", length = 50)
	public String getMPConfrim() {
		return mPConfrim;
	}

	public void setMPConfrimTime(String mPConfrimTime) {
		this.mPConfrimTime = mPConfrimTime;
	}

	@Column(name = "M_P_CONFRIM_TIME_", length = 50)
	public String getMPConfrimTime() {
		return mPConfrimTime;
	}

	public void setByamt1(BigDecimal byamt1) {
		this.byamt1 = byamt1;
	}

	@Column(name = "BYAMT1_")
	public BigDecimal getByamt1() {
		return byamt1;
	}

	public void setByamt2(BigDecimal byamt2) {
		this.byamt2 = byamt2;
	}

	@Column(name = "BYAMT2_")
	public BigDecimal getByamt2() {
		return byamt2;
	}

	public void setByprice1(BigDecimal byprice1) {
		this.byprice1 = byprice1;
	}

	@Column(name = "BYPRICE1_")
	public BigDecimal getByprice1() {
		return byprice1;
	}

	public void setByprice2(BigDecimal byprice2) {
		this.byprice2 = byprice2;
	}

	@Column(name = "BYPRICE2_")
	public BigDecimal getByprice2() {
		return byprice2;
	}

	public void setCb(String cb) {
		this.cb = cb;
	}

	@Column(name = "CB_", length = 20)
	public String getCb() {
		return cb;
	}

	public void setCcglts(String ccglts) {
		this.ccglts = ccglts;
	}

	@Column(name = "CCGLTS_", length = 20)
	public String getCcglts() {
		return ccglts;
	}

	public void setCkb(String ckb) {
		this.ckb = ckb;
	}

	@Column(name = "CKB_", length = 50)
	public String getCkb() {
		return ckb;
	}

	public void setCurrentLine(String currentLine) {
		this.currentLine = currentLine;
	}

	@Column(name = "CURRENT_LINE_", length = 50)
	public String getCurrentLine() {
		return currentLine;
	}

	public void setCurrentStation(String currentStation) {
		this.currentStation = currentStation;
	}

	@Column(name = "CURRENT_STATION_", length = 50)
	public String getCurrentStation() {
		return currentStation;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Column(name = "DISCOUNT_PRICE_")
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setGz(String gz) {
		this.gz = gz;
	}

	@Column(name = "GZ_", length = 100)
	public String getGz() {
		return gz;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	@Column(name = "HEIGHT_")
	public BigDecimal getHeight() {
		return height;
	}

	public void setHply(String hply) {
		this.hply = hply;
	}

	@Column(name = "HPLY_", length = 100)
	public String getHply() {
		return hply;
	}

	public void setIfAccept(String ifAccept) {
		this.ifAccept = ifAccept;
	}

	@Column(name = "IF_ACCEPT_", length = 20)
	public String getIfAccept() {
		return ifAccept;
	}

	public void setIfConfrim(String ifConfrim) {
		this.ifConfrim = ifConfrim;
	}

	@Column(name = "IF_CONFRIM_", length = 20)
	public String getIfConfrim() {
		return ifConfrim;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	@Column(name = "IN_TIME_", length = 20)
	public String getInTime() {
		return inTime;
	}

	public void setIscc(String iscc) {
		this.iscc = iscc;
	}

	@Column(name = "ISCC_", length = 20)
	public String getIscc() {
		return iscc;
	}

	public void setIsccgl(String isccgl) {
		this.isccgl = isccgl;
	}

	@Column(name = "ISCCGL_", length = 20)
	public String getIsccgl() {
		return isccgl;
	}

	public void setIscq(String iscq) {
		this.iscq = iscq;
	}

	@Column(name = "ISCQ_", length = 20)
	public String getIscq() {
		return iscq;
	}

	public void setIsmonth(String ismonth) {
		this.ismonth = ismonth;
	}

	@Column(name = "ISMONTH_", length = 20)
	public String getIsmonth() {
		return ismonth;
	}

	public void setJj(BigDecimal jj) {
		this.jj = jj;
	}

	@Column(name = "JJ_")
	public BigDecimal getJj() {
		return jj;
	}

	public void setJsxm(String jsxm) {
		this.jsxm = jsxm;
	}

	@Column(name = "JSXM_", length = 100)
	public String getJsxm() {
		return jsxm;
	}

	public void setLiftingAmt(BigDecimal liftingAmt) {
		this.liftingAmt = liftingAmt;
	}

	@Column(name = "LIFTING_AMT_")
	public BigDecimal getLiftingAmt() {
		return liftingAmt;
	}

	public void setLiftingPrice(BigDecimal liftingPrice) {
		this.liftingPrice = liftingPrice;
	}

	@Column(name = "LIFTING_PRICE_")
	public BigDecimal getLiftingPrice() {
		return liftingPrice;
	}

	public void setManagerAmt(BigDecimal managerAmt) {
		this.managerAmt = managerAmt;
	}

	@Column(name = "MANAGER_AMT_")
	public BigDecimal getManagerAmt() {
		return managerAmt;
	}

	public void setManagerPrice(BigDecimal managerPrice) {
		this.managerPrice = managerPrice;
	}

	@Column(name = "MANAGER_PRICE_")
	public BigDecimal getManagerPrice() {
		return managerPrice;
	}

	public void setNodeArea(String nodeArea) {
		this.nodeArea = nodeArea;
	}

	@Column(name = "NODE_AREA_", length = 20)
	public String getNodeArea() {
		return nodeArea;
	}

	public void setNodePass(String nodePass) {
		this.nodePass = nodePass;
	}

	@Column(name = "NODE_PASS_", length = 20)
	public String getNodePass() {
		return nodePass;
	}

	public void setNowSerType(String nowSerType) {
		this.nowSerType = nowSerType;
	}

	@Column(name = "NOW_SER_TYPE_", length = 20)
	public String getNowSerType() {
		return nowSerType;
	}

	public void setOutAmt(BigDecimal outAmt) {
		this.outAmt = outAmt;
	}

	@Column(name = "OUT_AMT_")
	public BigDecimal getOutAmt() {
		return outAmt;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	@Column(name = "OUT_TIME_", length = 20)
	public String getOutTime() {
		return outTime;
	}

	public void setOverdueAmt(BigDecimal overdueAmt) {
		this.overdueAmt = overdueAmt;
	}

	@Column(name = "OVERDUE_AMT_")
	public BigDecimal getOverdueAmt() {
		return overdueAmt;
	}

	public void setPremiumsAmt(BigDecimal premiumsAmt) {
		this.premiumsAmt = premiumsAmt;
	}

	@Column(name = "PREMIUMS_AMT_")
	public BigDecimal getPremiumsAmt() {
		return premiumsAmt;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setPx(String px) {
		this.px = px;
	}

	@Column(name = "PX_", length = 20)
	public String getPx() {
		return px;
	}

	public void setReturnAmt(BigDecimal returnAmt) {
		this.returnAmt = returnAmt;
	}

	@Column(name = "RETURN_AMT_")
	public BigDecimal getReturnAmt() {
		return returnAmt;
	}

	public void setReturnPrice(BigDecimal returnPrice) {
		this.returnPrice = returnPrice;
	}

	@Column(name = "RETURN_PRICE_")
	public BigDecimal getReturnPrice() {
		return returnPrice;
	}

	public void setRkb(String rkb) {
		this.rkb = rkb;
	}

	@Column(name = "RKB_", length = 50)
	public String getRkb() {
		return rkb;
	}

	public void setServiesType(String serviesType) {
		this.serviesType = serviesType;
	}

	@Column(name = "SERVIES_TYPE_", length = 20)
	public String getServiesType() {
		return serviesType;
	}

	public void setSfsdbj(String sfsdbj) {
		this.sfsdbj = sfsdbj;
	}

	@Column(name = "SFSDBJ_", length = 20)
	public String getSfsdbj() {
		return sfsdbj;
	}

	public void setSfwgcp(String sfwgcp) {
		this.sfwgcp = sfwgcp;
	}

	@Column(name = "SFWGCP_", length = 20)
	public String getSfwgcp() {
		return sfwgcp;
	}

	public void setSfyqrxnycw(String sfyqrxnycw) {
		this.sfyqrxnycw = sfyqrxnycw;
	}

	@Column(name = "SFYQRXNYCW_", length = 20)
	public String getSfyqrxnycw() {
		return sfyqrxnycw;
	}

	public void setStorageAmt(BigDecimal storageAmt) {
		this.storageAmt = storageAmt;
	}

	@Column(name = "STORAGE_AMT_")
	public BigDecimal getStorageAmt() {
		return storageAmt;
	}

	public void setStoragePrice(BigDecimal storagePrice) {
		this.storagePrice = storagePrice;
	}

	@Column(name = "STORAGE_PRICE_")
	public BigDecimal getStoragePrice() {
		return storagePrice;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	@Column(name = "TRAN_AMT_")
	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}

	@Column(name = "TRAN_NO_", length = 20)
	public String getTranNo() {
		return tranNo;
	}

	public void setTranPrice(BigDecimal tranPrice) {
		this.tranPrice = tranPrice;
	}

	@Column(name = "TRAN_PRICE_")
	public BigDecimal getTranPrice() {
		return tranPrice;
	}

	public void setXn(String xn) {
		this.xn = xn;
	}

	@Column(name = "XN_", length = 20)
	public String getXn() {
		return xn;
	}

	public void setXz(BigDecimal xz) {
		this.xz = xz;
	}

	@Column(name = "XZ_")
	public BigDecimal getXz() {
		return xz;
	}

	public String toString() {
		return "Tbih30 [ih30Id=" + ih30Id + ",compId=" + compId + ",labelNo="
				+ labelNo + ",labelNoF=" + labelNoF + ",wareQwCode="
				+ wareQwCode + ",layerCode=" + layerCode + ",prodType="
				+ prodType + ",prodTypeName=" + prodTypeName + ",productNo="
				+ productNo + ",productName=" + productName + ",productDetail="
				+ productDetail + ",gradeNo=" + gradeNo + ",steelNo=" + steelNo
				+ ",qb=" + qb + ",dc=" + dc + ",thick=" + thick + ",width="
				+ width + ",length=" + length + ",size=" + size + ",pieceNum="
				+ pieceNum + ",num=" + num + ",wgt=" + wgt + ",volume="
				+ volume + ",unitWgt=" + unitWgt + ",inUnitWgt=" + inUnitWgt
				+ ",inWgt=" + inWgt + ",outWgt=" + outWgt + ",maxWgt=" + maxWgt
				+ ",differenceWgt=" + differenceWgt + ",cargoPrice="
				+ cargoPrice + ",cargoAmt=" + cargoAmt + ",custNo=" + custNo
				+ ",custName=" + custName + ",ownnerCompNo=" + ownnerCompNo
				+ ",ownnerCompName=" + ownnerCompName + ",carrierNo="
				+ carrierNo + ",carrierName=" + carrierName + ",receiptCompNo="
				+ receiptCompNo + ",receiptCompName=" + receiptCompName
				+ ",orderCompNo=" + orderCompNo + ",orderCompName="
				+ orderCompName + ",contNo=" + contNo + ",contractNo="
				+ contractNo + ",tranOrderNo=" + tranOrderNo + ",orderNo="
				+ orderNo + ",orderItem=" + orderItem + ",deliveryNo="
				+ deliveryNo + ",ladingNo=" + ladingNo + ",settleNo="
				+ settleNo + ",invoice=" + invoice + ",fwlx=" + fwlx
				+ ",settleType=" + settleType + ",syhch=" + syhch + ",fno="
				+ fno + ",transNo=" + transNo + ",priceSno=" + priceSno
				+ ",zkdNo=" + zkdNo + ",inNo=" + inNo + ",inDate=" + inDate
				+ ",inEmp=" + inEmp + ",inLiftingTeam=" + inLiftingTeam
				+ ",inLiftingEmp=" + inLiftingEmp + ",inCraneDriver="
				+ inCraneDriver + ",outNo=" + outNo + ",outDate=" + outDate
				+ ",outEmp=" + outEmp + ",outLiftingTeam=" + outLiftingTeam
				+ ",outLiftingEmp=" + outLiftingEmp + ",outCraneDriver="
				+ outCraneDriver + ",phEmp=" + phEmp + ",phIp=" + phIp
				+ ",zcr=" + zcr + ",zcTime=" + zcTime + ",jfr=" + jfr + ",lb="
				+ lb + ",kb=" + kb + ",area=" + area + ",sfe=" + sfe
				+ ",jkqrtjFy=" + jkqrtjFy + ",qrphFy=" + qrphFy + ",isOverdue="
				+ isOverdue + ",isStorage=" + isStorage + ",isManager="
				+ isManager + ",isOrder=" + isOrder + ",isTurning=" + isTurning
				+ ",managerTs=" + managerTs + ",jsdr=" + jsdr + ",chr=" + chr
				+ ",age=" + age + ",hpZt=" + hpZt + ",status=" + status
				+ ",deadLine=" + deadLine + ",sfzd=" + sfzd + ",ifImport="
				+ ifImport + ",ifzdbj=" + ifzdbj + ",isCq=" + isCq + ",sfxcbj="
				+ sfxcbj + ",sfzq=" + sfzq + ",bjyybz=" + bjyybz + ",lineCode="
				+ lineCode + ",stationCode=" + stationCode + ",by1=" + by1
				+ ",by2=" + by2 + ",by3=" + by3 + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version
				+ ",wareQwCodeOld=" + wareQwCodeOld + ",layerCodeOld="
				+ layerCodeOld + ",mPConfrim=" + mPConfrim + ",mPConfrimTime="
				+ mPConfrimTime + ",byamt1=" + byamt1 + ",byamt2=" + byamt2
				+ ",byprice1=" + byprice1 + ",byprice2=" + byprice2 + ",cb="
				+ cb + ",ccglts=" + ccglts + ",ckb=" + ckb + ",currentLine="
				+ currentLine + ",currentStation=" + currentStation
				+ ",discountPrice=" + discountPrice + ",gz=" + gz + ",height="
				+ height + ",hply=" + hply + ",ifAccept=" + ifAccept
				+ ",ifConfrim=" + ifConfrim + ",inTime=" + inTime + ",iscc="
				+ iscc + ",isccgl=" + isccgl + ",iscq=" + iscq + ",ismonth="
				+ ismonth + ",jj=" + jj + ",jsxm=" + jsxm + ",liftingAmt="
				+ liftingAmt + ",liftingPrice=" + liftingPrice + ",managerAmt="
				+ managerAmt + ",managerPrice=" + managerPrice + ",nodeArea="
				+ nodeArea + ",nodePass=" + nodePass + ",nowSerType="
				+ nowSerType + ",outAmt=" + outAmt + ",outTime=" + outTime
				+ ",overdueAmt=" + overdueAmt + ",premiumsAmt=" + premiumsAmt
				+ ",price=" + price + ",px=" + px + ",returnAmt=" + returnAmt
				+ ",returnPrice=" + returnPrice + ",rkb=" + rkb
				+ ",serviesType=" + serviesType + ",sfsdbj=" + sfsdbj
				+ ",sfwgcp=" + sfwgcp + ",sfyqrxnycw=" + sfyqrxnycw
				+ ",storageAmt=" + storageAmt + ",storagePrice=" + storagePrice
				+ ",tranAmt=" + tranAmt + ",tranNo=" + tranNo + ",tranPrice="
				+ tranPrice + ",xn=" + xn + ",xz=" + xz + "]";
	}
	
}

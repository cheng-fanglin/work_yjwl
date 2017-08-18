package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih33:TBIH33(货品履历表)
 */
@Entity
@Table(name = "tbih33")
public class Tbih33 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
	private String ih33Id;

	/**
	 * 来源:来源
	 */
	@PropertyDef(label = "来源", description = "来源:来源")
	private String ly;

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
	 * 仓库ID:仓库ID
	 */
	@PropertyDef(label = "仓库ID", description = "仓库ID:仓库ID")
	private String wareQwCode;

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
	 * 钢质:钢质
	 */
	@PropertyDef(label = "钢质", description = "钢质:钢质")
	private String gz;

	/**
	 * 高度:高度
	 */
	@PropertyDef(label = "高度", description = "高度:高度")
	private BigDecimal height;

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
	 * 入库单重:入库单重
	 */
	@PropertyDef(label = "入库单重", description = "入库单重:入库单重")
	private BigDecimal inUnitWgt;

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
	 * 日期:日期
	 */
	@PropertyDef(label = "日期", description = "日期:日期")
	private String inDate;

	/**
	 * 选择:选择
	 */
	@PropertyDef(label = "选择", description = "选择:选择")
	private BigDecimal xz;

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
	 * 出厂订单项次号:出厂订单项次号
	 */
	@PropertyDef(label = "出厂订单项次号", description = "出厂订单项次号:出厂订单项次号")
	private String orderItem;

	/**
	 * 厂别:厂别
	 */
	@PropertyDef(label = "厂别", description = "厂别:厂别")
	private String cb;

	/**
	 * 提货号:提货号
	 */
	@PropertyDef(label = "提货号", description = "提货号:提货号")
	private String ladingNo;

	/**
	 * 入库单ID:入库单ID
	 */
	@PropertyDef(label = "入库单ID", description = "入库单ID:入库单ID")
	private String inNo;

	/**
	 * 入库时间:入库时间
	 */
	@PropertyDef(label = "入库时间", description = "入库时间:入库时间")
	private String inTime;

	/**
	 * 入库人:入库人
	 */
	@PropertyDef(label = "入库人", description = "入库人:入库人")
	private String inEmp;

	/**
	 * 出库单ID:出库单ID
	 */
	@PropertyDef(label = "出库单ID", description = "出库单ID:出库单ID")
	private String outNo;

	/**
	 * 出库时间:出库时间
	 */
	@PropertyDef(label = "出库时间", description = "出库时间:出库时间")
	private String outTime;

	/**
	 * 配货IP:配货IP
	 */
	@PropertyDef(label = "配货IP", description = "配货IP:配货IP")
	private String phIp;

	/**
	 * 货品状态:货品状态
	 */
	@PropertyDef(label = "货品状态", description = "货品状态:货品状态")
	private String hpZt;

	/**
	 * 收费额:收费额
	 */
	@PropertyDef(label = "收费额", description = "收费额:收费额")
	private BigDecimal sfe;

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
	 * 计费日:计费日
	 */
	@PropertyDef(label = "计费日", description = "计费日:计费日")
	private String jfr;

	/**
	 * 入库班:入库班
	 */
	@PropertyDef(label = "入库班", description = "入库班:入库班")
	private String rkb;

	/**
	 * 出库班:出库班
	 */
	@PropertyDef(label = "出库班", description = "出库班:出库班")
	private String ckb;

	/**
	 * 计价:计价
	 */
	@PropertyDef(label = "计价", description = "计价:计价")
	private BigDecimal jj;

	/**
	 * 冲红日:冲红日
	 */
	@PropertyDef(label = "冲红日", description = "冲红日:冲红日")
	private String chr;

	/**
	 * 专线:专线
	 */
	@PropertyDef(label = "专线", description = "专线:专线")
	private String lineCode;

	/**
	 * 虚拟:虚拟
	 */
	@PropertyDef(label = "虚拟", description = "虚拟:虚拟")
	private String xn;

	/**
	 * 转库单ID:转库单ID
	 */
	@PropertyDef(label = "转库单ID", description = "转库单ID:转库单ID")
	private String zkdNo;

	/**
	 * 超期费:超期费
	 */
	@PropertyDef(label = "超期费", description = "超期费:超期费")
	private BigDecimal overdueAmt;

	/**
	 * 天数:天数
	 */
	@PropertyDef(label = "天数", description = "天数:天数")
	private String age;

	/**
	 * 片序:片序
	 */
	@PropertyDef(label = "片序", description = "片序:片序")
	private String px;

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
	 * 是否导入:是否导入
	 */
	@PropertyDef(label = "是否导入", description = "是否导入:是否导入")
	private String ifImport;

	/**
	 * 是否主体厂产品:是否主体厂产品
	 */
	@PropertyDef(label = "是否主体厂产品", description = "是否主体厂产品:是否主体厂产品")
	private String sfwgcp;

	/**
	 * 状态(1确认配货2接受确认3打印六联单):状态(1确认配货2接受确认3打印六联单)
	 */
	@PropertyDef(label = "状态(1确认配货2接受确认3打印六联单)", description = "状态(1确认配货2接受确认3打印六联单):状态(1确认配货2接受确认3打印六联单)")
	private String status;

	/**
	 * 类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)
	 */
	@PropertyDef(label = "类别(JY-经营/ZY-自营)", description = "类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)")
	private String lb;

	/**
	 * 是否已确认虚拟原储位:是否已确认虚拟原储位
	 */
	@PropertyDef(label = "是否已确认虚拟原储位", description = "是否已确认虚拟原储位:是否已确认虚拟原储位")
	private String sfyqrxnycw;

	/**
	 * 运单编号:运单编号
	 */
	@PropertyDef(label = "运单编号", description = "运单编号:运单编号")
	private String tranNo;

	/**
	 * 自营材货品来源:自营材货品来源
	 */
	@PropertyDef(label = "自营材货品来源", description = "自营材货品来源:自营材货品来源")
	private String hply;

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
	 * 是否转单标记:是否转单标记
	 */
	@PropertyDef(label = "是否转单标记", description = "是否转单标记:是否转单标记")
	private String ifzdbj;

	/**
	 * 是否项次标记:是否项次标记
	 */
	@PropertyDef(label = "是否项次标记", description = "是否项次标记:是否项次标记")
	private String sfxcbj;

	/**
	 * 是否手动标记:是否手动标记
	 */
	@PropertyDef(label = "是否手动标记", description = "是否手动标记:是否手动标记")
	private String sfsdbj;

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
	 * 水运航次号:水运航次号
	 */
	@PropertyDef(label = "水运航次号", description = "水运航次号:水运航次号")
	private String syhch;

	/**
	 * 出库费用结算方式:出库费用结算方式
	 */
	@PropertyDef(label = "出库费用结算方式", description = "出库费用结算方式:出库费用结算方式")
	private String iscc;

	/**
	 * 超期费用结算方式:超期费用结算方式
	 */
	@PropertyDef(label = "超期费用结算方式", description = "超期费用结算方式:超期费用结算方式")
	private String iscq;

	/**
	 * 仓储管理费用结算方式:仓储管理费用结算方式
	 */
	@PropertyDef(label = "仓储管理费用结算方式", description = "仓储管理费用结算方式:仓储管理费用结算方式")
	private String isccgl;

	/**
	 * 仓储管理天数:仓储管理天数
	 */
	@PropertyDef(label = "仓储管理天数", description = "仓储管理天数:仓储管理天数")
	private String ccglts;

	/**
	 * 仓储管理费用:仓储管理费用
	 */
	@PropertyDef(label = "仓储管理费用", description = "仓储管理费用:仓储管理费用")
	private BigDecimal managerAmt;

	/**
	 * 仓储管理费用单价:仓储管理费用单价
	 */
	@PropertyDef(label = "仓储管理费用单价", description = "仓储管理费用单价:仓储管理费用单价")
	private BigDecimal managerPrice;

	/**
	 * 协议单价:协议单价
	 */
	@PropertyDef(label = "协议单价", description = "协议单价:协议单价")
	private BigDecimal price;

	/**
	 * 出库总费用:出库总费用
	 */
	@PropertyDef(label = "出库总费用", description = "出库总费用:出库总费用")
	private BigDecimal outAmt;

	/**
	 * 是否月结:是否月结
	 */
	@PropertyDef(label = "是否月结", description = "是否月结:是否月结")
	private String ismonth;

	/**
	 * 优惠单价:优惠单价
	 */
	@PropertyDef(label = "优惠单价", description = "优惠单价:优惠单价")
	private BigDecimal discountPrice;

	/**
	 * 保险费:保险费
	 */
	@PropertyDef(label = "保险费", description = "保险费:保险费")
	private BigDecimal premiumsAmt;

	/**
	 * 方案号:方案号
	 */
	@PropertyDef(label = "方案号", description = "方案号:方案号")
	private String fno;

	/**
	 * 结算导入标示(已导=1，否则=0):结算导入标示(已导=1，否则=0)
	 */
	@PropertyDef(label = "结算导入标示(已导=1，否则=0)", description = "结算导入标示(已导=1，否则=0):结算导入标示(已导=1，否则=0)")
	private String jsdr;

	/**
	 * 结算项目:结算项目
	 */
	@PropertyDef(label = "结算项目", description = "结算项目:结算项目")
	private String jsxm;

	/**
	 * 价格编号:价格编号
	 */
	@PropertyDef(label = "价格编号", description = "价格编号:价格编号")
	private String priceSno;

	/**
	 * 仓储单价:仓储单价
	 */
	@PropertyDef(label = "仓储单价", description = "仓储单价:仓储单价")
	private BigDecimal storagePrice;

	/**
	 * 仓储费用（协议）:仓储费用（协议）
	 */
	@PropertyDef(label = "仓储费用（协议）", description = "仓储费用（协议）:仓储费用（协议）")
	private BigDecimal storageAmt;

	/**
	 * 吊装价:吊装价
	 */
	@PropertyDef(label = "吊装价", description = "吊装价:吊装价")
	private BigDecimal liftingPrice;

	/**
	 * 吊装费:吊装费
	 */
	@PropertyDef(label = "吊装费", description = "吊装费:吊装费")
	private BigDecimal liftingAmt;

	/**
	 * 运输单号:运输单号
	 */
	@PropertyDef(label = "运输单号", description = "运输单号:运输单号")
	private String transNo;

	/**
	 * 运输单价:运输单价
	 */
	@PropertyDef(label = "运输单价", description = "运输单价:运输单价")
	private BigDecimal tranPrice;

	/**
	 * 运输费:运输费
	 */
	@PropertyDef(label = "运输费", description = "运输费:运输费")
	private BigDecimal tranAmt;

	/**
	 * 返回价单价:返回价单价
	 */
	@PropertyDef(label = "返回价单价", description = "返回价单价:返回价单价")
	private BigDecimal returnPrice;

	/**
	 * 返回金额:返回金额
	 */
	@PropertyDef(label = "返回金额", description = "返回金额:返回金额")
	private BigDecimal returnAmt;

	/**
	 * 备用单价1:备用单价1
	 */
	@PropertyDef(label = "备用单价1", description = "备用单价1:备用单价1")
	private BigDecimal byprice1;

	/**
	 * 备用单价2:备用单价2
	 */
	@PropertyDef(label = "备用单价2", description = "备用单价2:备用单价2")
	private BigDecimal byprice2;

	/**
	 * 备用费用1:备用费用1
	 */
	@PropertyDef(label = "备用费用1", description = "备用费用1:备用费用1")
	private BigDecimal byamt1;

	/**
	 * 备用费用2:备用费用2
	 */
	@PropertyDef(label = "备用费用2", description = "备用费用2:备用费用2")
	private BigDecimal byamt2;

	/**
	 * 当前到站:当前到站
	 */
	@PropertyDef(label = "当前到站", description = "当前到站:当前到站")
	private String currentStation;

	/**
	 * 库别:库别
	 */
	@PropertyDef(label = "库别", description = "库别:库别")
	private String kb;

	/**
	 * 当前专用线:当前专用线
	 */
	@PropertyDef(label = "当前专用线", description = "当前专用线:当前专用线")
	private String currentLine;

	/**
	 * 多点存放确认标记:多点存放确认标记
	 */
	@PropertyDef(label = "多点存放确认标记", description = "多点存放确认标记:多点存放确认标记")
	private String mPConfrim;

	/**
	 * 多点存放确认时间:多点存放确认时间
	 */
	@PropertyDef(label = "多点存放确认时间", description = "多点存放确认时间:多点存放确认时间")
	private String mPConfrimTime;

	/**
	 * 服务类型:服务类型
	 */
	@PropertyDef(label = "服务类型", description = "服务类型:服务类型")
	private String serviesType;

	/**
	 * 是否接收确认:是否接收确认
	 */
	@PropertyDef(label = "是否接收确认", description = "是否接收确认:是否接收确认")
	private String ifAccept;

	/**
	 * 现服务类型:现服务类型
	 */
	@PropertyDef(label = "现服务类型", description = "现服务类型:现服务类型")
	private String nowSerType;

	/**
	 * 节点区域(打印工作单是根据方案号带过来的):节点区域(打印工作单是根据方案号带过来的)
	 */
	@PropertyDef(label = "节点区域(打印工作单是根据方案号带过来的)", description = "节点区域(打印工作单是根据方案号带过来的):节点区域(打印工作单是根据方案号带过来的)")
	private String nodeArea;

	/**
	 * 是否接收确认:是否接收确认
	 */
	@PropertyDef(label = "是否接收确认", description = "是否接收确认:是否接收确认")
	private String ifConfrim;

	/**
	 * 经过节点标记(1表示不计算费用标记):经过节点标记(1表示不计算费用标记)
	 */
	@PropertyDef(label = "经过节点标记(1表示不计算费用标记)", description = "经过节点标记(1表示不计算费用标记):经过节点标记(1表示不计算费用标记)")
	private String nodePass;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

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

	public Tbih33() {
		super();
	}

	public Tbih33(String ih33Id, String ly, String compId, String labelNo,
			String wareQwCode, String prodType, String prodTypeName,
			String productNo, String productName, String productDetail,
			String gz, BigDecimal height, BigDecimal width, BigDecimal length,
			BigDecimal pieceNum, BigDecimal num, BigDecimal wgt,
			BigDecimal volume, BigDecimal unitWgt, BigDecimal inWgt,
			BigDecimal outWgt, BigDecimal inUnitWgt, BigDecimal maxWgt,
			BigDecimal differenceWgt, String inDate, BigDecimal xz,
			String ownnerCompNo, String ownnerCompName, String custNo,
			String custName, String carrierNo, String carrierName,
			String receiptCompNo, String receiptCompName, String contNo,
			String contractNo, String tranOrderNo, String orderCompNo,
			String orderCompName, String orderItem, String cb, String ladingNo,
			String inNo, String inTime, String inEmp, String outNo,
			String outTime, String phIp, String hpZt, BigDecimal sfe,
			String phEmp, String outEmp, String jfr, String rkb, String ckb,
			BigDecimal jj, String chr, String lineCode, String xn,
			String zkdNo, BigDecimal overdueAmt, String age, String px,
			BigDecimal jkqrtjFy, BigDecimal qrphFy, String ifImport,
			String sfwgcp, String status, String lb, String sfyqrxnycw,
			String tranNo, String hply, String deadLine, String sfzd,
			String ifzdbj, String sfxcbj, String sfsdbj, String sfzq,
			String bjyybz, String syhch, String iscc, String iscq,
			String isccgl, String ccglts, BigDecimal managerAmt,
			BigDecimal managerPrice, BigDecimal price, BigDecimal outAmt,
			String ismonth, BigDecimal discountPrice, BigDecimal premiumsAmt,
			String fno, String jsdr, String jsxm, String priceSno,
			BigDecimal storagePrice, BigDecimal storageAmt,
			BigDecimal liftingPrice, BigDecimal liftingAmt, String transNo,
			BigDecimal tranPrice, BigDecimal tranAmt, BigDecimal returnPrice,
			BigDecimal returnAmt, BigDecimal byprice1, BigDecimal byprice2,
			BigDecimal byamt1, BigDecimal byamt2, String currentStation,
			String kb, String currentLine, String mPConfrim,
			String mPConfrimTime, String serviesType, String ifAccept,
			String nowSerType, String nodeArea, String ifConfrim,
			String nodePass, String area, String zcr, String zcTime,
			String by1, String by2, String by3, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih33Id = ih33Id;
		this.ly = ly;
		this.compId = compId;
		this.labelNo = labelNo;
		this.wareQwCode = wareQwCode;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.gz = gz;
		this.height = height;
		this.width = width;
		this.length = length;
		this.pieceNum = pieceNum;
		this.num = num;
		this.wgt = wgt;
		this.volume = volume;
		this.unitWgt = unitWgt;
		this.inWgt = inWgt;
		this.outWgt = outWgt;
		this.inUnitWgt = inUnitWgt;
		this.maxWgt = maxWgt;
		this.differenceWgt = differenceWgt;
		this.inDate = inDate;
		this.xz = xz;
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
		this.orderCompNo = orderCompNo;
		this.orderCompName = orderCompName;
		this.orderItem = orderItem;
		this.cb = cb;
		this.ladingNo = ladingNo;
		this.inNo = inNo;
		this.inTime = inTime;
		this.inEmp = inEmp;
		this.outNo = outNo;
		this.outTime = outTime;
		this.phIp = phIp;
		this.hpZt = hpZt;
		this.sfe = sfe;
		this.phEmp = phEmp;
		this.outEmp = outEmp;
		this.jfr = jfr;
		this.rkb = rkb;
		this.ckb = ckb;
		this.jj = jj;
		this.chr = chr;
		this.lineCode = lineCode;
		this.xn = xn;
		this.zkdNo = zkdNo;
		this.overdueAmt = overdueAmt;
		this.age = age;
		this.px = px;
		this.jkqrtjFy = jkqrtjFy;
		this.qrphFy = qrphFy;
		this.ifImport = ifImport;
		this.sfwgcp = sfwgcp;
		this.status = status;
		this.lb = lb;
		this.sfyqrxnycw = sfyqrxnycw;
		this.tranNo = tranNo;
		this.hply = hply;
		this.deadLine = deadLine;
		this.sfzd = sfzd;
		this.ifzdbj = ifzdbj;
		this.sfxcbj = sfxcbj;
		this.sfsdbj = sfsdbj;
		this.sfzq = sfzq;
		this.bjyybz = bjyybz;
		this.syhch = syhch;
		this.iscc = iscc;
		this.iscq = iscq;
		this.isccgl = isccgl;
		this.ccglts = ccglts;
		this.managerAmt = managerAmt;
		this.managerPrice = managerPrice;
		this.price = price;
		this.outAmt = outAmt;
		this.ismonth = ismonth;
		this.discountPrice = discountPrice;
		this.premiumsAmt = premiumsAmt;
		this.fno = fno;
		this.jsdr = jsdr;
		this.jsxm = jsxm;
		this.priceSno = priceSno;
		this.storagePrice = storagePrice;
		this.storageAmt = storageAmt;
		this.liftingPrice = liftingPrice;
		this.liftingAmt = liftingAmt;
		this.transNo = transNo;
		this.tranPrice = tranPrice;
		this.tranAmt = tranAmt;
		this.returnPrice = returnPrice;
		this.returnAmt = returnAmt;
		this.byprice1 = byprice1;
		this.byprice2 = byprice2;
		this.byamt1 = byamt1;
		this.byamt2 = byamt2;
		this.currentStation = currentStation;
		this.kb = kb;
		this.currentLine = currentLine;
		this.mPConfrim = mPConfrim;
		this.mPConfrimTime = mPConfrimTime;
		this.serviesType = serviesType;
		this.ifAccept = ifAccept;
		this.nowSerType = nowSerType;
		this.nodeArea = nodeArea;
		this.ifConfrim = ifConfrim;
		this.nodePass = nodePass;
		this.area = area;
		this.zcr = zcr;
		this.zcTime = zcTime;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh33Id(String ih33Id) {
		this.ih33Id = ih33Id;
	}

	@Id
	@Column(name = "IH33_ID_", length = 50, nullable = false)
	public String getIh33Id() {
		return ih33Id;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	@Column(name = "LY_", length = 50)
	public String getLy() {
		return ly;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20)
	public String getLabelNo() {
		return labelNo;
	}

	public void setWareQwCode(String wareQwCode) {
		this.wareQwCode = wareQwCode;
	}

	@Column(name = "WARE_QW_CODE_", length = 20)
	public String getWareQwCode() {
		return wareQwCode;
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

	public void setInUnitWgt(BigDecimal inUnitWgt) {
		this.inUnitWgt = inUnitWgt;
	}

	@Column(name = "IN_UNIT_WGT_")
	public BigDecimal getInUnitWgt() {
		return inUnitWgt;
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

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	@Column(name = "IN_DATE_", length = 20)
	public String getInDate() {
		return inDate;
	}

	public void setXz(BigDecimal xz) {
		this.xz = xz;
	}

	@Column(name = "XZ_")
	public BigDecimal getXz() {
		return xz;
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

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	@Column(name = "ORDER_ITEM_", length = 20)
	public String getOrderItem() {
		return orderItem;
	}

	public void setCb(String cb) {
		this.cb = cb;
	}

	@Column(name = "CB_", length = 20)
	public String getCb() {
		return cb;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
	}

	public void setInNo(String inNo) {
		this.inNo = inNo;
	}

	@Column(name = "IN_NO_", length = 20)
	public String getInNo() {
		return inNo;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	@Column(name = "IN_TIME_", length = 20)
	public String getInTime() {
		return inTime;
	}

	public void setInEmp(String inEmp) {
		this.inEmp = inEmp;
	}

	@Column(name = "IN_EMP_", length = 50)
	public String getInEmp() {
		return inEmp;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20)
	public String getOutNo() {
		return outNo;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	@Column(name = "OUT_TIME_", length = 20)
	public String getOutTime() {
		return outTime;
	}

	public void setPhIp(String phIp) {
		this.phIp = phIp;
	}

	@Column(name = "PH_IP_", length = 20)
	public String getPhIp() {
		return phIp;
	}

	public void setHpZt(String hpZt) {
		this.hpZt = hpZt;
	}

	@Column(name = "HP_ZT_", length = 20)
	public String getHpZt() {
		return hpZt;
	}

	public void setSfe(BigDecimal sfe) {
		this.sfe = sfe;
	}

	@Column(name = "SFE_")
	public BigDecimal getSfe() {
		return sfe;
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

	public void setJfr(String jfr) {
		this.jfr = jfr;
	}

	@Column(name = "JFR_", length = 20)
	public String getJfr() {
		return jfr;
	}

	public void setRkb(String rkb) {
		this.rkb = rkb;
	}

	@Column(name = "RKB_", length = 50)
	public String getRkb() {
		return rkb;
	}

	public void setCkb(String ckb) {
		this.ckb = ckb;
	}

	@Column(name = "CKB_", length = 50)
	public String getCkb() {
		return ckb;
	}

	public void setJj(BigDecimal jj) {
		this.jj = jj;
	}

	@Column(name = "JJ_")
	public BigDecimal getJj() {
		return jj;
	}

	public void setChr(String chr) {
		this.chr = chr;
	}

	@Column(name = "CHR_", length = 20)
	public String getChr() {
		return chr;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	@Column(name = "LINE_CODE_", length = 50)
	public String getLineCode() {
		return lineCode;
	}

	public void setXn(String xn) {
		this.xn = xn;
	}

	@Column(name = "XN_", length = 20)
	public String getXn() {
		return xn;
	}

	public void setZkdNo(String zkdNo) {
		this.zkdNo = zkdNo;
	}

	@Column(name = "ZKD_NO_", length = 20)
	public String getZkdNo() {
		return zkdNo;
	}

	public void setOverdueAmt(BigDecimal overdueAmt) {
		this.overdueAmt = overdueAmt;
	}

	@Column(name = "OVERDUE_AMT_")
	public BigDecimal getOverdueAmt() {
		return overdueAmt;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "AGE_", length = 20)
	public String getAge() {
		return age;
	}

	public void setPx(String px) {
		this.px = px;
	}

	@Column(name = "PX_", length = 20)
	public String getPx() {
		return px;
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

	public void setIfImport(String ifImport) {
		this.ifImport = ifImport;
	}

	@Column(name = "IF_IMPORT__", length = 20)
	public String getIfImport() {
		return ifImport;
	}

	public void setSfwgcp(String sfwgcp) {
		this.sfwgcp = sfwgcp;
	}

	@Column(name = "SFWGCP_", length = 20)
	public String getSfwgcp() {
		return sfwgcp;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 20)
	public String getLb() {
		return lb;
	}

	public void setSfyqrxnycw(String sfyqrxnycw) {
		this.sfyqrxnycw = sfyqrxnycw;
	}

	@Column(name = "SFYQRXNYCW_", length = 20)
	public String getSfyqrxnycw() {
		return sfyqrxnycw;
	}

	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}

	@Column(name = "TRAN_NO_", length = 20)
	public String getTranNo() {
		return tranNo;
	}

	public void setHply(String hply) {
		this.hply = hply;
	}

	@Column(name = "HPLY_", length = 100)
	public String getHply() {
		return hply;
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

	public void setIfzdbj(String ifzdbj) {
		this.ifzdbj = ifzdbj;
	}

	@Column(name = "IFZDBJ_", length = 20)
	public String getIfzdbj() {
		return ifzdbj;
	}

	public void setSfxcbj(String sfxcbj) {
		this.sfxcbj = sfxcbj;
	}

	@Column(name = "SFXCBJ_", length = 20)
	public String getSfxcbj() {
		return sfxcbj;
	}

	public void setSfsdbj(String sfsdbj) {
		this.sfsdbj = sfsdbj;
	}

	@Column(name = "SFSDBJ_", length = 20)
	public String getSfsdbj() {
		return sfsdbj;
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

	public void setSyhch(String syhch) {
		this.syhch = syhch;
	}

	@Column(name = "SYHCH_", length = 20)
	public String getSyhch() {
		return syhch;
	}

	public void setIscc(String iscc) {
		this.iscc = iscc;
	}

	@Column(name = "ISCC_", length = 20)
	public String getIscc() {
		return iscc;
	}

	public void setIscq(String iscq) {
		this.iscq = iscq;
	}

	@Column(name = "ISCQ_", length = 20)
	public String getIscq() {
		return iscq;
	}

	public void setIsccgl(String isccgl) {
		this.isccgl = isccgl;
	}

	@Column(name = "ISCCGL_", length = 20)
	public String getIsccgl() {
		return isccgl;
	}

	public void setCcglts(String ccglts) {
		this.ccglts = ccglts;
	}

	@Column(name = "CCGLTS_", length = 20)
	public String getCcglts() {
		return ccglts;
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

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setOutAmt(BigDecimal outAmt) {
		this.outAmt = outAmt;
	}

	@Column(name = "OUT_AMT_")
	public BigDecimal getOutAmt() {
		return outAmt;
	}

	public void setIsmonth(String ismonth) {
		this.ismonth = ismonth;
	}

	@Column(name = "ISMONTH_", length = 20)
	public String getIsmonth() {
		return ismonth;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Column(name = "DISCOUNT_PRICE_")
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setPremiumsAmt(BigDecimal premiumsAmt) {
		this.premiumsAmt = premiumsAmt;
	}

	@Column(name = "PREMIUMS_AMT_")
	public BigDecimal getPremiumsAmt() {
		return premiumsAmt;
	}

	public void setFno(String fno) {
		this.fno = fno;
	}

	@Column(name = "FNO_", length = 20)
	public String getFno() {
		return fno;
	}

	public void setJsdr(String jsdr) {
		this.jsdr = jsdr;
	}

	@Column(name = "JSDR_", length = 20)
	public String getJsdr() {
		return jsdr;
	}

	public void setJsxm(String jsxm) {
		this.jsxm = jsxm;
	}

	@Column(name = "JSXM_", length = 100)
	public String getJsxm() {
		return jsxm;
	}

	public void setPriceSno(String priceSno) {
		this.priceSno = priceSno;
	}

	@Column(name = "PRICE_SNO_", length = 20)
	public String getPriceSno() {
		return priceSno;
	}

	public void setStoragePrice(BigDecimal storagePrice) {
		this.storagePrice = storagePrice;
	}

	@Column(name = "STORAGE_PRICE_")
	public BigDecimal getStoragePrice() {
		return storagePrice;
	}

	public void setStorageAmt(BigDecimal storageAmt) {
		this.storageAmt = storageAmt;
	}

	@Column(name = "STORAGE_AMT_")
	public BigDecimal getStorageAmt() {
		return storageAmt;
	}

	public void setLiftingPrice(BigDecimal liftingPrice) {
		this.liftingPrice = liftingPrice;
	}

	@Column(name = "LIFTING_PRICE_")
	public BigDecimal getLiftingPrice() {
		return liftingPrice;
	}

	public void setLiftingAmt(BigDecimal liftingAmt) {
		this.liftingAmt = liftingAmt;
	}

	@Column(name = "LIFTING_AMT_")
	public BigDecimal getLiftingAmt() {
		return liftingAmt;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
	}

	public void setTranPrice(BigDecimal tranPrice) {
		this.tranPrice = tranPrice;
	}

	@Column(name = "TRAN_PRICE_")
	public BigDecimal getTranPrice() {
		return tranPrice;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	@Column(name = "TRAN_AMT_")
	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setReturnPrice(BigDecimal returnPrice) {
		this.returnPrice = returnPrice;
	}

	@Column(name = "RETURN_PRICE_")
	public BigDecimal getReturnPrice() {
		return returnPrice;
	}

	public void setReturnAmt(BigDecimal returnAmt) {
		this.returnAmt = returnAmt;
	}

	@Column(name = "RETURN_AMT_")
	public BigDecimal getReturnAmt() {
		return returnAmt;
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

	public void setCurrentStation(String currentStation) {
		this.currentStation = currentStation;
	}

	@Column(name = "CURRENT_STATION_", length = 50)
	public String getCurrentStation() {
		return currentStation;
	}

	public void setKb(String kb) {
		this.kb = kb;
	}

	@Column(name = "KB_", length = 20)
	public String getKb() {
		return kb;
	}

	public void setCurrentLine(String currentLine) {
		this.currentLine = currentLine;
	}

	@Column(name = "CURRENT_LINE_", length = 50)
	public String getCurrentLine() {
		return currentLine;
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

	public void setServiesType(String serviesType) {
		this.serviesType = serviesType;
	}

	@Column(name = "SERVIES_TYPE_", length = 20)
	public String getServiesType() {
		return serviesType;
	}

	public void setIfAccept(String ifAccept) {
		this.ifAccept = ifAccept;
	}

	@Column(name = "IF_ACCEPT_", length = 20)
	public String getIfAccept() {
		return ifAccept;
	}

	public void setNowSerType(String nowSerType) {
		this.nowSerType = nowSerType;
	}

	@Column(name = "NOW_SER_TYPE_", length = 20)
	public String getNowSerType() {
		return nowSerType;
	}

	public void setNodeArea(String nodeArea) {
		this.nodeArea = nodeArea;
	}

	@Column(name = "NODE_AREA_", length = 20)
	public String getNodeArea() {
		return nodeArea;
	}

	public void setIfConfrim(String ifConfrim) {
		this.ifConfrim = ifConfrim;
	}

	@Column(name = "IF_CONFRIM_", length = 20)
	public String getIfConfrim() {
		return ifConfrim;
	}

	public void setNodePass(String nodePass) {
		this.nodePass = nodePass;
	}

	@Column(name = "NODE_PASS_", length = 20)
	public String getNodePass() {
		return nodePass;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
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

	public String toString() {
		return "Tbih33 [ih33Id=" + ih33Id + ",ly=" + ly + ",compId=" + compId
				+ ",labelNo=" + labelNo + ",wareQwCode=" + wareQwCode
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",gz=" + gz + ",height="
				+ height + ",width=" + width + ",length=" + length
				+ ",pieceNum=" + pieceNum + ",num=" + num + ",wgt=" + wgt
				+ ",volume=" + volume + ",unitWgt=" + unitWgt + ",inWgt="
				+ inWgt + ",outWgt=" + outWgt + ",inUnitWgt=" + inUnitWgt
				+ ",maxWgt=" + maxWgt + ",differenceWgt=" + differenceWgt
				+ ",inDate=" + inDate + ",xz=" + xz + ",ownnerCompNo="
				+ ownnerCompNo + ",ownnerCompName=" + ownnerCompName
				+ ",custNo=" + custNo + ",custName=" + custName + ",carrierNo="
				+ carrierNo + ",carrierName=" + carrierName + ",receiptCompNo="
				+ receiptCompNo + ",receiptCompName=" + receiptCompName
				+ ",contNo=" + contNo + ",contractNo=" + contractNo
				+ ",tranOrderNo=" + tranOrderNo + ",orderCompNo=" + orderCompNo
				+ ",orderCompName=" + orderCompName + ",orderItem=" + orderItem
				+ ",cb=" + cb + ",ladingNo=" + ladingNo + ",inNo=" + inNo
				+ ",inTime=" + inTime + ",inEmp=" + inEmp + ",outNo=" + outNo
				+ ",outTime=" + outTime + ",phIp=" + phIp + ",hpZt=" + hpZt
				+ ",sfe=" + sfe + ",phEmp=" + phEmp + ",outEmp=" + outEmp
				+ ",jfr=" + jfr + ",rkb=" + rkb + ",ckb=" + ckb + ",jj=" + jj
				+ ",chr=" + chr + ",lineCode=" + lineCode + ",xn=" + xn
				+ ",zkdNo=" + zkdNo + ",overdueAmt=" + overdueAmt + ",age="
				+ age + ",px=" + px + ",jkqrtjFy=" + jkqrtjFy + ",qrphFy="
				+ qrphFy + ",ifImport=" + ifImport + ",sfwgcp=" + sfwgcp
				+ ",status=" + status + ",lb=" + lb + ",sfyqrxnycw="
				+ sfyqrxnycw + ",tranNo=" + tranNo + ",hply=" + hply
				+ ",deadLine=" + deadLine + ",sfzd=" + sfzd + ",ifzdbj="
				+ ifzdbj + ",sfxcbj=" + sfxcbj + ",sfsdbj=" + sfsdbj + ",sfzq="
				+ sfzq + ",bjyybz=" + bjyybz + ",syhch=" + syhch + ",iscc="
				+ iscc + ",iscq=" + iscq + ",isccgl=" + isccgl + ",ccglts="
				+ ccglts + ",managerAmt=" + managerAmt + ",managerPrice="
				+ managerPrice + ",price=" + price + ",outAmt=" + outAmt
				+ ",ismonth=" + ismonth + ",discountPrice=" + discountPrice
				+ ",premiumsAmt=" + premiumsAmt + ",fno=" + fno + ",jsdr="
				+ jsdr + ",jsxm=" + jsxm + ",priceSno=" + priceSno
				+ ",storagePrice=" + storagePrice + ",storageAmt=" + storageAmt
				+ ",liftingPrice=" + liftingPrice + ",liftingAmt=" + liftingAmt
				+ ",transNo=" + transNo + ",tranPrice=" + tranPrice
				+ ",tranAmt=" + tranAmt + ",returnPrice=" + returnPrice
				+ ",returnAmt=" + returnAmt + ",byprice1=" + byprice1
				+ ",byprice2=" + byprice2 + ",byamt1=" + byamt1 + ",byamt2="
				+ byamt2 + ",currentStation=" + currentStation + ",kb=" + kb
				+ ",currentLine=" + currentLine + ",mPConfrim=" + mPConfrim
				+ ",mPConfrimTime=" + mPConfrimTime + ",serviesType="
				+ serviesType + ",ifAccept=" + ifAccept + ",nowSerType="
				+ nowSerType + ",nodeArea=" + nodeArea + ",ifConfrim="
				+ ifConfrim + ",nodePass=" + nodePass + ",area=" + area
				+ ",zcr=" + zcr + ",zcTime=" + zcTime + ",by1=" + by1 + ",by2="
				+ by2 + ",by3=" + by3 + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

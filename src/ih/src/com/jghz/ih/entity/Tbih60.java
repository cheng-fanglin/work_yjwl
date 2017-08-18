package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih60:TBIH60(货权转授表)
 */
@Entity
@Table(name = "tbih60")
public class Tbih60 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID:ID
	 */
	@PropertyDef(label = "ID", description = "ID:ID")
	private String ih60Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 转授单:转授单
	 */
	@PropertyDef(label = "转授单", description = "转授单:转授单")
	private String zhd;

	/**
	 * 入库单ID:入库单ID
	 */
	@PropertyDef(label = "入库单ID", description = "入库单ID:入库单ID")
	private String inNo;

	/**
	 * 出库单ID:出库单ID
	 */
	@PropertyDef(label = "出库单ID", description = "出库单ID:出库单ID")
	private String outNo;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 出厂订单项次号:出厂订单项次号
	 */
	@PropertyDef(label = "出厂订单项次号", description = "出厂订单项次号:出厂订单项次号")
	private String orderItem;

	/**
	 * 老货主编号:老货主编号
	 */
	@PropertyDef(label = "老货主编号", description = "老货主编号:老货主编号")
	private String oldCustNo;

	/**
	 * 老货主:老货主
	 */
	@PropertyDef(label = "老货主", description = "老货主:老货主")
	private String oldCustName;

	/**
	 * 新货主编号:新货主编号
	 */
	@PropertyDef(label = "新货主编号", description = "新货主编号:新货主编号")
	private String newCustNo;

	/**
	 * 新货主:新货主
	 */
	@PropertyDef(label = "新货主", description = "新货主:新货主")
	private String newCustName;

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
	 * 尺寸信息:尺寸信息
	 */
	@PropertyDef(label = "尺寸信息", description = "尺寸信息:尺寸信息")
	private String size;

	/**
	 * 件重:件重
	 */
	@PropertyDef(label = "件重", description = "件重:件重")
	private BigDecimal wgt;

	/**
	 * 数量:数量
	 */
	@PropertyDef(label = "数量", description = "数量:数量")
	private BigDecimal num;

	/**
	 * 标志位(B,标签号，C，项次号):标志位(B,标签号，C，项次号)
	 */
	@PropertyDef(label = "标志位(B,标签号，C，项次号)", description = "标志位(B,标签号，C，项次号):标志位(B,标签号，C，项次号)")
	private String flag;

	/**
	 * 转授时间:转授时间
	 */
	@PropertyDef(label = "转授时间", description = "转授时间:转授时间")
	private String zsTime;

	/**
	 * 转授人:转授人
	 */
	@PropertyDef(label = "转授人", description = "转授人:转授人")
	private String zsEmp;

	/**
	 * 'ZY'自营，'JY'经营:'ZY'自营，'JY'经营
	 */
	@PropertyDef(label = "'ZY'自营，'JY'经营", description = "'ZY'自营，'JY'经营:'ZY'自营，'JY'经营")
	private String lb;

	/**
	 * 提货号:提货号
	 */
	@PropertyDef(label = "提货号", description = "提货号:提货号")
	private String ladingNo;

	/**
	 * 来函日期:来函日期
	 */
	@PropertyDef(label = "来函日期", description = "来函日期:来函日期")
	private String ladingDate;

	/**
	 * 计费日:计费日
	 */
	@PropertyDef(label = "计费日", description = "计费日:计费日")
	private String jfr;

	/**
	 * 是否结算变更费:是否结算变更费
	 */
	@PropertyDef(label = "是否结算变更费", description = "是否结算变更费:是否结算变更费")
	private String zsFlag;

	/**
	 * 变更价格:变更价格
	 */
	@PropertyDef(label = "变更价格", description = "变更价格:变更价格")
	private BigDecimal zsPrice;

	/**
	 * 变更费用:变更费用
	 */
	@PropertyDef(label = "变更费用", description = "变更费用:变更费用")
	private BigDecimal zsAmt;

	/**
	 * 超期费用:超期费用
	 */
	@PropertyDef(label = "超期费用", description = "超期费用:超期费用")
	private BigDecimal zsOverdueAmt;

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
	 * 是否结算超期费:是否结算超期费
	 */
	@PropertyDef(label = "是否结算超期费", description = "是否结算超期费:是否结算超期费")
	private String overdueFlag;

	/**
	 * 超期费结算方式:超期费结算方式
	 */
	@PropertyDef(label = "超期费结算方式", description = "超期费结算方式:超期费结算方式")
	private String overdueSettleType;

	/**
	 * 库龄:库龄
	 */
	@PropertyDef(label = "库龄", description = "库龄:库龄")
	private String age;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 批量导入标记:批量导入标记
	 */
	@PropertyDef(label = "批量导入标记", description = "批量导入标记:批量导入标记")
	private String batchFlag;

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

	public Tbih60() {
		super();
	}

	public Tbih60(String ih60Id, String compId, String zhd, String inNo,
			String outNo, String labelNo, String orderItem, String oldCustNo,
			String oldCustName, String newCustNo, String newCustName,
			String gradeNo, String steelNo, BigDecimal thick, BigDecimal width,
			BigDecimal length, String size, BigDecimal wgt, BigDecimal num,
			String flag, String zsTime, String zsEmp, String lb,
			String ladingNo, String ladingDate, String jfr, String zsFlag,
			BigDecimal zsPrice, BigDecimal zsAmt, BigDecimal zsOverdueAmt,
			String overduePayCompNo, String overduePayCompName,
			String overdueFlag, String overdueSettleType, String age,
			String area, String batchFlag, String by1, String by2, String by3,
			String by4, BigDecimal by5, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih60Id = ih60Id;
		this.compId = compId;
		this.zhd = zhd;
		this.inNo = inNo;
		this.outNo = outNo;
		this.labelNo = labelNo;
		this.orderItem = orderItem;
		this.oldCustNo = oldCustNo;
		this.oldCustName = oldCustName;
		this.newCustNo = newCustNo;
		this.newCustName = newCustName;
		this.gradeNo = gradeNo;
		this.steelNo = steelNo;
		this.thick = thick;
		this.width = width;
		this.length = length;
		this.size = size;
		this.wgt = wgt;
		this.num = num;
		this.flag = flag;
		this.zsTime = zsTime;
		this.zsEmp = zsEmp;
		this.lb = lb;
		this.ladingNo = ladingNo;
		this.ladingDate = ladingDate;
		this.jfr = jfr;
		this.zsFlag = zsFlag;
		this.zsPrice = zsPrice;
		this.zsAmt = zsAmt;
		this.zsOverdueAmt = zsOverdueAmt;
		this.overduePayCompNo = overduePayCompNo;
		this.overduePayCompName = overduePayCompName;
		this.overdueFlag = overdueFlag;
		this.overdueSettleType = overdueSettleType;
		this.age = age;
		this.area = area;
		this.batchFlag = batchFlag;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.by4 = by4;
		this.by5 = by5;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh60Id(String ih60Id) {
		this.ih60Id = ih60Id;
	}

	@Id
	@Column(name = "IH60_ID_", length = 50, nullable = false)
	public String getIh60Id() {
		return ih60Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setZhd(String zhd) {
		this.zhd = zhd;
	}

	@Column(name = "ZHD_", length = 20)
	public String getZhd() {
		return zhd;
	}

	public void setInNo(String inNo) {
		this.inNo = inNo;
	}

	@Column(name = "IN_NO_", length = 20)
	public String getInNo() {
		return inNo;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	@Column(name = "OUT_NO_", length = 20)
	public String getOutNo() {
		return outNo;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20)
	public String getLabelNo() {
		return labelNo;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	@Column(name = "ORDER_ITEM_", length = 20)
	public String getOrderItem() {
		return orderItem;
	}

	public void setOldCustNo(String oldCustNo) {
		this.oldCustNo = oldCustNo;
	}

	@Column(name = "OLD_CUST_NO_", length = 20)
	public String getOldCustNo() {
		return oldCustNo;
	}

	public void setOldCustName(String oldCustName) {
		this.oldCustName = oldCustName;
	}

	@Column(name = "OLD_CUST_NAME_", length = 200)
	public String getOldCustName() {
		return oldCustName;
	}

	public void setNewCustNo(String newCustNo) {
		this.newCustNo = newCustNo;
	}

	@Column(name = "NEW_CUST_NO_", length = 20)
	public String getNewCustNo() {
		return newCustNo;
	}

	public void setNewCustName(String newCustName) {
		this.newCustName = newCustName;
	}

	@Column(name = "NEW_CUST_NAME_", length = 200)
	public String getNewCustName() {
		return newCustName;
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

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SIZE_", length = 40)
	public String getSize() {
		return size;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	@Column(name = "WGT_")
	public BigDecimal getWgt() {
		return wgt;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "NUM_")
	public BigDecimal getNum() {
		return num;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "FLAG_", length = 10)
	public String getFlag() {
		return flag;
	}

	public void setZsTime(String zsTime) {
		this.zsTime = zsTime;
	}

	@Column(name = "ZS_TIME_", length = 20)
	public String getZsTime() {
		return zsTime;
	}

	public void setZsEmp(String zsEmp) {
		this.zsEmp = zsEmp;
	}

	@Column(name = "ZS_EMP_", length = 50)
	public String getZsEmp() {
		return zsEmp;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 50)
	public String getLb() {
		return lb;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
	}

	public void setLadingDate(String ladingDate) {
		this.ladingDate = ladingDate;
	}

	@Column(name = "LADING_DATE_", length = 20)
	public String getLadingDate() {
		return ladingDate;
	}

	public void setJfr(String jfr) {
		this.jfr = jfr;
	}

	@Column(name = "JFR_", length = 20)
	public String getJfr() {
		return jfr;
	}

	public void setZsFlag(String zsFlag) {
		this.zsFlag = zsFlag;
	}

	@Column(name = "ZS_FLAG_", length = 20)
	public String getZsFlag() {
		return zsFlag;
	}

	public void setZsPrice(BigDecimal zsPrice) {
		this.zsPrice = zsPrice;
	}

	@Column(name = "ZS_PRICE_")
	public BigDecimal getZsPrice() {
		return zsPrice;
	}

	public void setZsAmt(BigDecimal zsAmt) {
		this.zsAmt = zsAmt;
	}

	@Column(name = "ZS_AMT_")
	public BigDecimal getZsAmt() {
		return zsAmt;
	}

	public void setZsOverdueAmt(BigDecimal zsOverdueAmt) {
		this.zsOverdueAmt = zsOverdueAmt;
	}

	@Column(name = "ZS_OVERDUE_AMT_")
	public BigDecimal getZsOverdueAmt() {
		return zsOverdueAmt;
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

	public void setOverdueFlag(String overdueFlag) {
		this.overdueFlag = overdueFlag;
	}

	@Column(name = "OVERDUE_FLAG_", length = 20)
	public String getOverdueFlag() {
		return overdueFlag;
	}

	public void setOverdueSettleType(String overdueSettleType) {
		this.overdueSettleType = overdueSettleType;
	}

	@Column(name = "OVERDUE_SETTLE_TYPE_", length = 20)
	public String getOverdueSettleType() {
		return overdueSettleType;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "AGE_", length = 20)
	public String getAge() {
		return age;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 20)
	public String getArea() {
		return area;
	}

	public void setBatchFlag(String batchFlag) {
		this.batchFlag = batchFlag;
	}

	@Column(name = "BATCH_FLAG_", length = 20)
	public String getBatchFlag() {
		return batchFlag;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 50)
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

	@Column(name = "BY4_", length = 50)
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
		return "Tbih60 [ih60Id=" + ih60Id + ",compId=" + compId + ",zhd=" + zhd
				+ ",inNo=" + inNo + ",outNo=" + outNo + ",labelNo=" + labelNo
				+ ",orderItem=" + orderItem + ",oldCustNo=" + oldCustNo
				+ ",oldCustName=" + oldCustName + ",newCustNo=" + newCustNo
				+ ",newCustName=" + newCustName + ",gradeNo=" + gradeNo
				+ ",steelNo=" + steelNo + ",thick=" + thick + ",width=" + width
				+ ",length=" + length + ",size=" + size + ",wgt=" + wgt
				+ ",num=" + num + ",flag=" + flag + ",zsTime=" + zsTime
				+ ",zsEmp=" + zsEmp + ",lb=" + lb + ",ladingNo=" + ladingNo
				+ ",ladingDate=" + ladingDate + ",jfr=" + jfr + ",zsFlag="
				+ zsFlag + ",zsPrice=" + zsPrice + ",zsAmt=" + zsAmt
				+ ",zsOverdueAmt=" + zsOverdueAmt + ",overduePayCompNo="
				+ overduePayCompNo + ",overduePayCompName="
				+ overduePayCompName + ",overdueFlag=" + overdueFlag
				+ ",overdueSettleType=" + overdueSettleType + ",age=" + age
				+ ",area=" + area + ",batchFlag=" + batchFlag + ",by1=" + by1
				+ ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

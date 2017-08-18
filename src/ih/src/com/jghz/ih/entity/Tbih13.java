package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih13:TBIH13(转库表)
 */
@Entity
@Table(name = "tbih13")
public class Tbih13 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 记录ID:记录ID
	 */
	@PropertyDef(label = "记录ID", description = "记录ID:记录ID")
	private String ih13Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 入库单ID:入库单ID
	 */
	@PropertyDef(label = "入库单ID", description = "入库单ID:入库单ID")
	private String rkdId;

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
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 原储位:原储位
	 */
	@PropertyDef(label = "原储位", description = "原储位:原储位")
	private String wareQwCodeOld;

	/**
	 * 新储位:新储位
	 */
	@PropertyDef(label = "新储位", description = "新储位:新储位")
	private String wareQwCode;

	/**
	 * 原层数:原层数
	 */
	@PropertyDef(label = "原层数", description = "原层数:原层数")
	private String layerCodeOld;

	/**
	 * 新层数:新层数
	 */
	@PropertyDef(label = "新层数", description = "新层数:新层数")
	private String layerCode;

	/**
	 * 项次:项次
	 */
	@PropertyDef(label = "项次", description = "项次:项次")
	private String orderItem;

	/**
	 * 提单号:提单号
	 */
	@PropertyDef(label = "提单号", description = "提单号:提单号")
	private String ladingNo;

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
	 * 入库重量:入库重量
	 */
	@PropertyDef(label = "入库重量", description = "入库重量:入库重量")
	private BigDecimal inWgt;

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
	 * 转库时间:转库时间
	 */
	@PropertyDef(label = "转库时间", description = "转库时间:转库时间")
	private String zkDate;

	/**
	 * 转库人:转库人
	 */
	@PropertyDef(label = "转库人", description = "转库人:转库人")
	private String zkEmp;

	/**
	 * 转库装卸班组:转库装卸班组
	 */
	@PropertyDef(label = "转库装卸班组", description = "转库装卸班组:转库装卸班组")
	private String zkLiftingTeam;

	/**
	 * 转库理货员:转库理货员
	 */
	@PropertyDef(label = "转库理货员", description = "转库理货员:转库理货员")
	private String zkLiftingEmp;

	/**
	 * 转库行车工:转库行车工
	 */
	@PropertyDef(label = "转库行车工", description = "转库行车工:转库行车工")
	private String zkCraneDriver;

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
	 * 是否跨区移储标记:是否跨区移储标记
	 */
	@PropertyDef(label = "是否跨区移储标记", description = "是否跨区移储标记:是否跨区移储标记")
	private String ifCk;

	/**
	 * 类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)
	 */
	@PropertyDef(label = "类别(JY-经营/ZY-自营)", description = "类别(JY-经营/ZY-自营):类别(JY-经营/ZY-自营)")
	private String lb;

	/**
	 * 自营材货品来源:自营材货品来源
	 */
	@PropertyDef(label = "自营材货品来源", description = "自营材货品来源:自营材货品来源")
	private String hply;

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

	public Tbih13() {
		super();
	}

	public Tbih13(String ih13Id, String compId, String rkdId, String custNo,
			String custName, String labelNo, String wareQwCodeOld,
			String wareQwCode, String layerCodeOld, String layerCode,
			String orderItem, String ladingNo, String gradeNo, String steelNo,
			BigDecimal thick, BigDecimal width, BigDecimal length, String size,
			BigDecimal num, BigDecimal wgt, BigDecimal inWgt, String inNo,
			String inDate, String zkDate, String zkEmp, String zkLiftingTeam,
			String zkLiftingEmp, String zkCraneDriver, String outNo,
			String outDate, String outEmp, String ifCk, String lb, String hply,
			String by1, String by2, String by3, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih13Id = ih13Id;
		this.compId = compId;
		this.rkdId = rkdId;
		this.custNo = custNo;
		this.custName = custName;
		this.labelNo = labelNo;
		this.wareQwCodeOld = wareQwCodeOld;
		this.wareQwCode = wareQwCode;
		this.layerCodeOld = layerCodeOld;
		this.layerCode = layerCode;
		this.orderItem = orderItem;
		this.ladingNo = ladingNo;
		this.gradeNo = gradeNo;
		this.steelNo = steelNo;
		this.thick = thick;
		this.width = width;
		this.length = length;
		this.size = size;
		this.num = num;
		this.wgt = wgt;
		this.inWgt = inWgt;
		this.inNo = inNo;
		this.inDate = inDate;
		this.zkDate = zkDate;
		this.zkEmp = zkEmp;
		this.zkLiftingTeam = zkLiftingTeam;
		this.zkLiftingEmp = zkLiftingEmp;
		this.zkCraneDriver = zkCraneDriver;
		this.outNo = outNo;
		this.outDate = outDate;
		this.outEmp = outEmp;
		this.ifCk = ifCk;
		this.lb = lb;
		this.hply = hply;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh13Id(String ih13Id) {
		this.ih13Id = ih13Id;
	}

	@Id
	@Column(name = "IH13_ID_", length = 50, nullable = false)
	public String getIh13Id() {
		return ih13Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setRkdId(String rkdId) {
		this.rkdId = rkdId;
	}

	@Column(name = "RKD_ID_", length = 20)
	public String getRkdId() {
		return rkdId;
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

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 20)
	public String getLabelNo() {
		return labelNo;
	}

	public void setWareQwCodeOld(String wareQwCodeOld) {
		this.wareQwCodeOld = wareQwCodeOld;
	}

	@Column(name = "WARE_QW_CODE_OLD_", length = 20)
	public String getWareQwCodeOld() {
		return wareQwCodeOld;
	}

	public void setWareQwCode(String wareQwCode) {
		this.wareQwCode = wareQwCode;
	}

	@Column(name = "WARE_QW_CODE_", length = 20)
	public String getWareQwCode() {
		return wareQwCode;
	}

	public void setLayerCodeOld(String layerCodeOld) {
		this.layerCodeOld = layerCodeOld;
	}

	@Column(name = "LAYER_CODE_OLD_", length = 20)
	public String getLayerCodeOld() {
		return layerCodeOld;
	}

	public void setLayerCode(String layerCode) {
		this.layerCode = layerCode;
	}

	@Column(name = "LAYER_CODE_", length = 20)
	public String getLayerCode() {
		return layerCode;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	@Column(name = "ORDER_ITEM_", length = 20)
	public String getOrderItem() {
		return orderItem;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	@Column(name = "LADING_NO_", length = 20)
	public String getLadingNo() {
		return ladingNo;
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

	@Column(name = "SIZE_", length = 50)
	public String getSize() {
		return size;
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

	public void setInWgt(BigDecimal inWgt) {
		this.inWgt = inWgt;
	}

	@Column(name = "IN_WGT_")
	public BigDecimal getInWgt() {
		return inWgt;
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

	public void setZkDate(String zkDate) {
		this.zkDate = zkDate;
	}

	@Column(name = "ZK_DATE_", length = 20)
	public String getZkDate() {
		return zkDate;
	}

	public void setZkEmp(String zkEmp) {
		this.zkEmp = zkEmp;
	}

	@Column(name = "ZK_EMP_", length = 50)
	public String getZkEmp() {
		return zkEmp;
	}

	public void setZkLiftingTeam(String zkLiftingTeam) {
		this.zkLiftingTeam = zkLiftingTeam;
	}

	@Column(name = "ZK_LIFTING_TEAM_", length = 50)
	public String getZkLiftingTeam() {
		return zkLiftingTeam;
	}

	public void setZkLiftingEmp(String zkLiftingEmp) {
		this.zkLiftingEmp = zkLiftingEmp;
	}

	@Column(name = "ZK_LIFTING_EMP_", length = 50)
	public String getZkLiftingEmp() {
		return zkLiftingEmp;
	}

	public void setZkCraneDriver(String zkCraneDriver) {
		this.zkCraneDriver = zkCraneDriver;
	}

	@Column(name = "ZK_CRANE_DRIVER_", length = 50)
	public String getZkCraneDriver() {
		return zkCraneDriver;
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

	public void setIfCk(String ifCk) {
		this.ifCk = ifCk;
	}

	@Column(name = "IF_CK_", length = 20)
	public String getIfCk() {
		return ifCk;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 50)
	public String getLb() {
		return lb;
	}

	public void setHply(String hply) {
		this.hply = hply;
	}

	@Column(name = "HPLY_", length = 50)
	public String getHply() {
		return hply;
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
		return "Tbih13 [ih13Id=" + ih13Id + ",compId=" + compId + ",rkdId="
				+ rkdId + ",custNo=" + custNo + ",custName=" + custName
				+ ",labelNo=" + labelNo + ",wareQwCodeOld=" + wareQwCodeOld
				+ ",wareQwCode=" + wareQwCode + ",layerCodeOld=" + layerCodeOld
				+ ",layerCode=" + layerCode + ",orderItem=" + orderItem
				+ ",ladingNo=" + ladingNo + ",gradeNo=" + gradeNo + ",steelNo="
				+ steelNo + ",thick=" + thick + ",width=" + width + ",length="
				+ length + ",size=" + size + ",num=" + num + ",wgt=" + wgt
				+ ",inWgt=" + inWgt + ",inNo=" + inNo + ",inDate=" + inDate
				+ ",zkDate=" + zkDate + ",zkEmp=" + zkEmp + ",zkLiftingTeam="
				+ zkLiftingTeam + ",zkLiftingEmp=" + zkLiftingEmp
				+ ",zkCraneDriver=" + zkCraneDriver + ",outNo=" + outNo
				+ ",outDate=" + outDate + ",outEmp=" + outEmp + ",ifCk=" + ifCk
				+ ",lb=" + lb + ",hply=" + hply + ",by1=" + by1 + ",by2=" + by2
				+ ",by3=" + by3 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

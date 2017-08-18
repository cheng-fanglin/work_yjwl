package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih03c:TBIH03C(基本价格维护-优惠政策)
 */
@Entity
@Table(name = "tbih03c")
public class Tbih03c implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih03cId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 合同号:合同号
	 */
	@PropertyDef(label = "合同号", description = "合同号:合同号")
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
	 * 订货量:订货量
	 */
	@PropertyDef(label = "订货量", description = "订货量:订货量")
	private BigDecimal contWgt;

	/**
	 * 优惠原因:优惠原因
	 */
	@PropertyDef(label = "优惠原因", description = "优惠原因:优惠原因")
	private String discountReason;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String tranType;

	/**
	 * 存储周期:存储周期
	 */
	@PropertyDef(label = "存储周期", description = "存储周期:存储周期")
	private BigDecimal cycle;

	/**
	 * 优惠价格:优惠价格
	 */
	@PropertyDef(label = "优惠价格", description = "优惠价格:优惠价格")
	private BigDecimal discountPrice;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 启用时间:启用时间
	 */
	@PropertyDef(label = "启用时间", description = "启用时间:启用时间")
	private String usedate;

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

	public Tbih03c() {
		super();
	}

	public Tbih03c(String ih03cId, String compId, String contNo, String custNo,
			String custName, BigDecimal contWgt, String discountReason,
			String tranType, BigDecimal cycle, BigDecimal discountPrice,
			String status, String usedate, String by1, String by2, String by3,
			String by4, String by5, String by6, String by7, BigDecimal by8,
			BigDecimal by9, BigDecimal by10, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih03cId = ih03cId;
		this.compId = compId;
		this.contNo = contNo;
		this.custNo = custNo;
		this.custName = custName;
		this.contWgt = contWgt;
		this.discountReason = discountReason;
		this.tranType = tranType;
		this.cycle = cycle;
		this.discountPrice = discountPrice;
		this.status = status;
		this.usedate = usedate;
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

	public void setIh03cId(String ih03cId) {
		this.ih03cId = ih03cId;
	}

	@Id
	@Column(name = "IH03C_ID_", length = 50, nullable = false)
	public String getIh03cId() {
		return ih03cId;
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

	public void setContWgt(BigDecimal contWgt) {
		this.contWgt = contWgt;
	}

	@Column(name = "CONT_WGT_")
	public BigDecimal getContWgt() {
		return contWgt;
	}

	public void setDiscountReason(String discountReason) {
		this.discountReason = discountReason;
	}

	@Column(name = "DISCOUNT_REASON_", length = 20, unique = true)
	public String getDiscountReason() {
		return discountReason;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	@Column(name = "TRAN_TYPE_", length = 20)
	public String getTranType() {
		return tranType;
	}

	public void setCycle(BigDecimal cycle) {
		this.cycle = cycle;
	}

	@Column(name = "CYCLE_")
	public BigDecimal getCycle() {
		return cycle;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Column(name = "DISCOUNT_PRICE_")
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setUsedate(String usedate) {
		this.usedate = usedate;
	}

	@Column(name = "USEDATE_", length = 20, unique = true)
	public String getUsedate() {
		return usedate;
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
		return "Tbih03c [ih03cId=" + ih03cId + ",compId=" + compId + ",contNo="
				+ contNo + ",custNo=" + custNo + ",custName=" + custName
				+ ",contWgt=" + contWgt + ",discountReason=" + discountReason
				+ ",tranType=" + tranType + ",cycle=" + cycle
				+ ",discountPrice=" + discountPrice + ",status=" + status
				+ ",usedate=" + usedate + ",by1=" + by1 + ",by2=" + by2
				+ ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5 + ",by6=" + by6
				+ ",by7=" + by7 + ",by8=" + by8 + ",by9=" + by9 + ",by10="
				+ by10 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

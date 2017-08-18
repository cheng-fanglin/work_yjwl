package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih03a:TBIH03A(基本价格维护-超期费)
 */
@Entity
@Table(name = "tbih03a")
public class Tbih03a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih03aId;

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
	 * 客户:客户
	 */
	@PropertyDef(label = "客户", description = "客户:客户")
	private String custNo;

	/**
	 * 客户名称:客户名称
	 */
	@PropertyDef(label = "客户名称", description = "客户名称:客户名称")
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
	 * 超期单价:超期单价
	 */
	@PropertyDef(label = "超期单价", description = "超期单价:超期单价")
	private BigDecimal overduePrice;

	/**
	 * 超期单价累计方式:超期单价累计方式
	 */
	@PropertyDef(label = "超期单价累计方式", description = "超期单价累计方式:超期单价累计方式")
	private String overdueType;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

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

	public Tbih03a() {
		super();
	}

	public Tbih03a(String ih03aId, String compId, String contNo, String custNo,
			String custName, String prodType, String prodTypeName,
			String productNo, String productName, String productDetail,
			String gradeNo, String steelNo, BigDecimal contWgt,
			BigDecimal startDate, BigDecimal endDate,
			BigDecimal overdueStdPrice, BigDecimal overduePrice,
			String overdueType, String status, String useDate, String useEmp,
			String stopDate, String stopEmp, String by1, String by2,
			String by3, String by4, String by5, String by6, String by7,
			BigDecimal by8, BigDecimal by9, BigDecimal by10, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.ih03aId = ih03aId;
		this.compId = compId;
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
		this.startDate = startDate;
		this.endDate = endDate;
		this.overdueStdPrice = overdueStdPrice;
		this.overduePrice = overduePrice;
		this.overdueType = overdueType;
		this.status = status;
		this.useDate = useDate;
		this.useEmp = useEmp;
		this.stopDate = stopDate;
		this.stopEmp = stopEmp;
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

	public void setIh03aId(String ih03aId) {
		this.ih03aId = ih03aId;
	}

	@Id
	@Column(name = "IH03A_ID_", length = 50, nullable = false)
	public String getIh03aId() {
		return ih03aId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20)
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

	public void setOverduePrice(BigDecimal overduePrice) {
		this.overduePrice = overduePrice;
	}

	@Column(name = "OVERDUE_PRICE_")
	public BigDecimal getOverduePrice() {
		return overduePrice;
	}

	public void setOverdueType(String overdueType) {
		this.overdueType = overdueType;
	}

	@Column(name = "OVERDUE_TYPE_", length = 20)
	public String getOverdueType() {
		return overdueType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
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
		return "Tbih03a [ih03aId=" + ih03aId + ",compId=" + compId + ",contNo="
				+ contNo + ",custNo=" + custNo + ",custName=" + custName
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",gradeNo=" + gradeNo
				+ ",steelNo=" + steelNo + ",contWgt=" + contWgt + ",startDate="
				+ startDate + ",endDate=" + endDate + ",overdueStdPrice="
				+ overdueStdPrice + ",overduePrice=" + overduePrice
				+ ",overdueType=" + overdueType + ",status=" + status
				+ ",useDate=" + useDate + ",useEmp=" + useEmp + ",stopDate="
				+ stopDate + ",stopEmp=" + stopEmp + ",by1=" + by1 + ",by2="
				+ by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5 + ",by6="
				+ by6 + ",by7=" + by7 + ",by8=" + by8 + ",by9=" + by9
				+ ",by10=" + by10 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

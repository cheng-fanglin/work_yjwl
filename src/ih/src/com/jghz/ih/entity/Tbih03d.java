package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih03d:TBIH03D(吊装费用维护)
 */
@Entity
@Table(name = "tbih03d")
public class Tbih03d implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih03dId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 装卸重量:装卸重量
	 */
	@PropertyDef(label = "装卸重量", description = "装卸重量:装卸重量")
	private BigDecimal liftingWgt;

	/**
	 * 装卸数量:装卸数量
	 */
	@PropertyDef(label = "装卸数量", description = "装卸数量:装卸数量")
	private BigDecimal liftingNum;

	/**
	 * 中转港口:中转港口
	 */
	@PropertyDef(label = "中转港口", description = "中转港口:中转港口")
	private String transitPort;

	/**
	 * 吊装价格:吊装价格
	 */
	@PropertyDef(label = "吊装价格", description = "吊装价格:吊装价格")
	private BigDecimal liftingPrice;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 启用时间:启用时间
	 */
	@PropertyDef(label = "启用时间", description = "启用时间:启用时间")
	private String stratDate;

	/**
	 * 截止时间:截止时间
	 */
	@PropertyDef(label = "截止时间", description = "截止时间:截止时间")
	private String endDate;

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

	public Tbih03d() {
		super();
	}

	public Tbih03d(String ih03dId, String compId, BigDecimal liftingWgt,
			BigDecimal liftingNum, String transitPort, BigDecimal liftingPrice,
			String status, String stratDate, String endDate, String by1,
			String by2, String by3, String by4, String by5, String by6,
			String by7, BigDecimal by8, BigDecimal by9, BigDecimal by10,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.ih03dId = ih03dId;
		this.compId = compId;
		this.liftingWgt = liftingWgt;
		this.liftingNum = liftingNum;
		this.transitPort = transitPort;
		this.liftingPrice = liftingPrice;
		this.status = status;
		this.stratDate = stratDate;
		this.endDate = endDate;
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

	public void setIh03dId(String ih03dId) {
		this.ih03dId = ih03dId;
	}

	@Id
	@Column(name = "IH03D_ID_", length = 50, nullable = false)
	public String getIh03dId() {
		return ih03dId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setLiftingWgt(BigDecimal liftingWgt) {
		this.liftingWgt = liftingWgt;
	}

	@Column(name = "LIFTING_WGT_")
	public BigDecimal getLiftingWgt() {
		return liftingWgt;
	}

	public void setLiftingNum(BigDecimal liftingNum) {
		this.liftingNum = liftingNum;
	}

	@Column(name = "LIFTING_NUM_")
	public BigDecimal getLiftingNum() {
		return liftingNum;
	}

	public void setTransitPort(String transitPort) {
		this.transitPort = transitPort;
	}

	@Column(name = "TRANSIT_PORT_", length = 20)
	public String getTransitPort() {
		return transitPort;
	}

	public void setLiftingPrice(BigDecimal liftingPrice) {
		this.liftingPrice = liftingPrice;
	}

	@Column(name = "LIFTING_PRICE_")
	public BigDecimal getLiftingPrice() {
		return liftingPrice;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 5)
	public String getStatus() {
		return status;
	}

	public void setStratDate(String stratDate) {
		this.stratDate = stratDate;
	}

	@Column(name = "STRAT_DATE_", length = 20)
	public String getStratDate() {
		return stratDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Column(name = "END_DATE_", length = 20)
	public String getEndDate() {
		return endDate;
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
		return "Tbih03d [ih03dId=" + ih03dId + ",compId=" + compId
				+ ",liftingWgt=" + liftingWgt + ",liftingNum=" + liftingNum
				+ ",transitPort=" + transitPort + ",liftingPrice="
				+ liftingPrice + ",status=" + status + ",stratDate="
				+ stratDate + ",endDate=" + endDate + ",by1=" + by1 + ",by2="
				+ by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5 + ",by6="
				+ by6 + ",by7=" + by7 + ",by8=" + by8 + ",by9=" + by9
				+ ",by10=" + by10 + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

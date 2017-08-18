package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih21c:
 */
@Entity
@Table(name = "tbih21c")
public class Tbih21c implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * IH21C_ID_:
	 */
	@PropertyDef(label = "IH21C_ID_", description = "IH21C_ID_:")
	private String ih21cId;

	/**
	 * BY1_:
	 */
	@PropertyDef(label = "BY1_", description = "BY1_:")
	private String by1;

	/**
	 * BY10_:
	 */
	@PropertyDef(label = "BY10_", description = "BY10_:")
	private BigDecimal by10;

	/**
	 * BY2_:
	 */
	@PropertyDef(label = "BY2_", description = "BY2_:")
	private String by2;

	/**
	 * BY3_:
	 */
	@PropertyDef(label = "BY3_", description = "BY3_:")
	private String by3;

	/**
	 * BY4_:
	 */
	@PropertyDef(label = "BY4_", description = "BY4_:")
	private String by4;

	/**
	 * BY5_:
	 */
	@PropertyDef(label = "BY5_", description = "BY5_:")
	private String by5;

	/**
	 * BY6_:
	 */
	@PropertyDef(label = "BY6_", description = "BY6_:")
	private String by6;

	/**
	 * BY7_:
	 */
	@PropertyDef(label = "BY7_", description = "BY7_:")
	private String by7;

	/**
	 * BY8_:
	 */
	@PropertyDef(label = "BY8_", description = "BY8_:")
	private BigDecimal by8;

	/**
	 * BY9_:
	 */
	@PropertyDef(label = "BY9_", description = "BY9_:")
	private BigDecimal by9;

	/**
	 * CARRIER_NAME_:
	 */
	@PropertyDef(label = "CARRIER_NAME_", description = "CARRIER_NAME_:")
	private byte[] carrierName;

	/**
	 * CARRIER_NO_:
	 */
	@PropertyDef(label = "CARRIER_NO_", description = "CARRIER_NO_:")
	private String carrierNo;

	/**
	 * COMP_ID_:
	 */
	@PropertyDef(label = "COMP_ID_", description = "COMP_ID_:")
	private String compId;

	/**
	 * CONT_NO_:
	 */
	@PropertyDef(label = "CONT_NO_", description = "CONT_NO_:")
	private String contNo;

	/**
	 * CREATE_DATE_:
	 */
	@PropertyDef(label = "CREATE_DATE_", description = "CREATE_DATE_:")
	private Date createDate;

	/**
	 * CREATE_EMP_:
	 */
	@PropertyDef(label = "CREATE_EMP_", description = "CREATE_EMP_:")
	private String createEmp;

	/**
	 * END_LINE_:
	 */
	@PropertyDef(label = "END_LINE_", description = "END_LINE_:")
	private String endLine;

	/**
	 * END_STATION_:
	 */
	@PropertyDef(label = "END_STATION_", description = "END_STATION_:")
	private String endStation;

	/**
	 * IH21_ID_:
	 */
	@PropertyDef(label = "IH21_ID_", description = "IH21_ID_:")
	private String ih21Id;

	/**
	 * IH21B_ID_:
	 */
	@PropertyDef(label = "IH21B_ID_", description = "IH21B_ID_:")
	private String ih21bId;

	/**
	 * PRICE_:
	 */
	@PropertyDef(label = "PRICE_", description = "PRICE_:")
	private BigDecimal price;

	/**
	 * SETTLE_TYPE_:
	 */
	@PropertyDef(label = "SETTLE_TYPE_", description = "SETTLE_TYPE_:")
	private String settleType;

	/**
	 * SNO_:
	 */
	@PropertyDef(label = "SNO_", description = "SNO_:")
	private String sno;

	/**
	 * START_LINE_:
	 */
	@PropertyDef(label = "START_LINE_", description = "START_LINE_:")
	private String startLine;

	/**
	 * START_STATION_:
	 */
	@PropertyDef(label = "START_STATION_", description = "START_STATION_:")
	private String startStation;

	/**
	 * TROAD_:
	 */
	@PropertyDef(label = "TROAD_", description = "TROAD_:")
	private String troad;

	/**
	 * UPDATE_DATE_:
	 */
	@PropertyDef(label = "UPDATE_DATE_", description = "UPDATE_DATE_:")
	private Date updateDate;

	/**
	 * UPDATE_EMP_:
	 */
	@PropertyDef(label = "UPDATE_EMP_", description = "UPDATE_EMP_:")
	private String updateEmp;

	/**
	 * VERSION:
	 */
	@PropertyDef(label = "VERSION", description = "VERSION:")
	private int version;

	public Tbih21c() {
		super();
	}

	public Tbih21c(String ih21cId, String by1, BigDecimal by10, String by2,
			String by3, String by4, String by5, String by6, String by7,
			BigDecimal by8, BigDecimal by9, byte[] carrierName,
			String carrierNo, String compId, String contNo, Date createDate,
			String createEmp, String endLine, String endStation, String ih21Id,
			String ih21bId, BigDecimal price, String settleType, String sno,
			String startLine, String startStation, String troad,
			Date updateDate, String updateEmp, int version) {
		super();
		this.ih21cId = ih21cId;
		this.by1 = by1;
		this.by10 = by10;
		this.by2 = by2;
		this.by3 = by3;
		this.by4 = by4;
		this.by5 = by5;
		this.by6 = by6;
		this.by7 = by7;
		this.by8 = by8;
		this.by9 = by9;
		this.carrierName = carrierName;
		this.carrierNo = carrierNo;
		this.compId = compId;
		this.contNo = contNo;
		this.createDate = createDate;
		this.createEmp = createEmp;
		this.endLine = endLine;
		this.endStation = endStation;
		this.ih21Id = ih21Id;
		this.ih21bId = ih21bId;
		this.price = price;
		this.settleType = settleType;
		this.sno = sno;
		this.startLine = startLine;
		this.startStation = startStation;
		this.troad = troad;
		this.updateDate = updateDate;
		this.updateEmp = updateEmp;
		this.version = version;
	}

	public void setIh21cId(String ih21cId) {
		this.ih21cId = ih21cId;
	}

	@Id
	@Column(name = "IH21C_ID_", length = 50, nullable = false)
	public String getIh21cId() {
		return ih21cId;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 30)
	public String getBy1() {
		return by1;
	}

	public void setBy10(BigDecimal by10) {
		this.by10 = by10;
	}

	@Column(name = "BY10_")
	public BigDecimal getBy10() {
		return by10;
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

	public void setCarrierName(byte[] carrierName) {
		this.carrierName = carrierName;
	}

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "CARRIER_NAME_", columnDefinition = "BLOB")
	public byte[] getCarrierName() {
		return carrierName;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	@Column(name = "CARRIER_NO_", length = 20)
	public String getCarrierNo() {
		return carrierNo;
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

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE_", nullable = false)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 50)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}

	@Column(name = "END_LINE_", length = 50)
	public String getEndLine() {
		return endLine;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Column(name = "END_STATION_", length = 50)
	public String getEndStation() {
		return endStation;
	}

	public void setIh21Id(String ih21Id) {
		this.ih21Id = ih21Id;
	}

	@Column(name = "IH21_ID_", length = 50)
	public String getIh21Id() {
		return ih21Id;
	}

	public void setIh21bId(String ih21bId) {
		this.ih21bId = ih21bId;
	}

	@Column(name = "IH21B_ID_", length = 50)
	public String getIh21bId() {
		return ih21bId;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "PRICE_")
	public BigDecimal getPrice() {
		return price;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	@Column(name = "SNO_", length = 20)
	public String getSno() {
		return sno;
	}

	public void setStartLine(String startLine) {
		this.startLine = startLine;
	}

	@Column(name = "START_LINE_", length = 50)
	public String getStartLine() {
		return startLine;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	@Column(name = "START_STATION_", length = 50)
	public String getStartStation() {
		return startStation;
	}

	public void setTroad(String troad) {
		this.troad = troad;
	}

	@Column(name = "TROAD_", length = 20)
	public String getTroad() {
		return troad;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE_", nullable = false)
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 50)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbih21c [ih21cId=" + ih21cId + ",by1=" + by1 + ",by10=" + by10
				+ ",by2=" + by2 + ",by3=" + by3 + ",by4=" + by4 + ",by5=" + by5
				+ ",by6=" + by6 + ",by7=" + by7 + ",by8=" + by8 + ",by9=" + by9
				+ ",carrierName=" + carrierName + ",carrierNo=" + carrierNo
				+ ",compId=" + compId + ",contNo=" + contNo + ",createDate="
				+ createDate + ",createEmp=" + createEmp + ",endLine="
				+ endLine + ",endStation=" + endStation + ",ih21Id=" + ih21Id
				+ ",ih21bId=" + ih21bId + ",price=" + price + ",settleType="
				+ settleType + ",sno=" + sno + ",startLine=" + startLine
				+ ",startStation=" + startStation + ",troad=" + troad
				+ ",updateDate=" + updateDate + ",updateEmp=" + updateEmp
				+ ",version=" + version + "]";
	}

}

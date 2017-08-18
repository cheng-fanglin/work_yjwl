package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih01a:TBIH01A(区位管理)
 */
@Entity
@Table(name = "tbih01a")
public class Tbih01a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih01aId;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih01Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 仓库编码:仓库编码
	 */
	@PropertyDef(label = "仓库编码", description = "仓库编码:仓库编码")
	private String wareCode;

	/**
	 * 仓库名称:仓库名称
	 */
	@PropertyDef(label = "仓库名称", description = "仓库名称:仓库名称")
	private String wareName;

	/**
	 * 区位编码:区位编码
	 */
	@PropertyDef(label = "区位编码", description = "区位编码:区位编码")
	private String qwCode;

	/**
	 * 区位名称:区位名称
	 */
	@PropertyDef(label = "区位名称", description = "区位名称:区位名称")
	private String qwName;

	/**
	 * 主营品种类型:主营品种类型
	 */
	@PropertyDef(label = "主营品种类型", description = "主营品种类型:主营品种类型")
	private String mainType;

	/**
	 * 主营品种类型名称:主营品种类型名称
	 */
	@PropertyDef(label = "主营品种类型名称", description = "主营品种类型名称:主营品种类型名称")
	private String mainTypeName;

	/**
	 * 主营品种:主营品种
	 */
	@PropertyDef(label = "主营品种", description = "主营品种:主营品种")
	private String mainProductNo;

	/**
	 * 主营品种名称:主营品种名称
	 */
	@PropertyDef(label = "主营品种名称", description = "主营品种名称:主营品种名称")
	private String mainProductName;

	/**
	 * 最大存量:最大存量
	 */
	@PropertyDef(label = "最大存量", description = "最大存量:最大存量")
	private BigDecimal maxnum;

	/**
	 * 剩余存量:剩余存量
	 */
	@PropertyDef(label = "剩余存量", description = "剩余存量:剩余存量")
	private BigDecimal remainNum;

	/**
	 * 库别:库别
	 */
	@PropertyDef(label = "库别", description = "库别:库别")
	private String kb;

	/**
	 * 所在城市:所在城市
	 */
	@PropertyDef(label = "所在城市", description = "所在城市:所在城市")
	private String city;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String emo;

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
	 * 剩余高度:剩余高度
	 */
	@PropertyDef(label = "剩余高度", description = "剩余高度:剩余高度")
	private BigDecimal remainHeight;

	/**
	 * 剩余宽度:剩余宽度
	 */
	@PropertyDef(label = "剩余宽度", description = "剩余宽度:剩余宽度")
	private BigDecimal remainWidth;

	/**
	 * 剩余长度:剩余长度
	 */
	@PropertyDef(label = "剩余长度", description = "剩余长度:剩余长度")
	private BigDecimal remainLength;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

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

	public Tbih01a() {
		super();
	}

	public Tbih01a(String ih01aId, String ih01Id, String compId,
			String wareCode, String wareName, String qwCode, String qwName,
			String mainType, String mainTypeName, String mainProductNo,
			String mainProductName, BigDecimal maxnum, BigDecimal remainNum,
			String kb, String city, String emo, BigDecimal height,
			BigDecimal width, BigDecimal length, BigDecimal remainHeight,
			BigDecimal remainWidth, BigDecimal remainLength, String status,
			String by1, String by2, String by3, String by4, String by5,
			String by6, String by7, BigDecimal by8, BigDecimal by9,
			BigDecimal by10, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.ih01aId = ih01aId;
		this.ih01Id = ih01Id;
		this.compId = compId;
		this.wareCode = wareCode;
		this.wareName = wareName;
		this.qwCode = qwCode;
		this.qwName = qwName;
		this.mainType = mainType;
		this.mainTypeName = mainTypeName;
		this.mainProductNo = mainProductNo;
		this.mainProductName = mainProductName;
		this.maxnum = maxnum;
		this.remainNum = remainNum;
		this.kb = kb;
		this.city = city;
		this.emo = emo;
		this.height = height;
		this.width = width;
		this.length = length;
		this.remainHeight = remainHeight;
		this.remainWidth = remainWidth;
		this.remainLength = remainLength;
		this.status = status;
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

	public void setIh01aId(String ih01aId) {
		this.ih01aId = ih01aId;
	}

	@Id
	@Column(name = "IH01A_ID_", length = 50, nullable = false)
	public String getIh01aId() {
		return ih01aId;
	}

	public void setIh01Id(String ih01Id) {
		this.ih01Id = ih01Id;
	}

	@Column(name = "IH01_ID_", length = 50)
	public String getIh01Id() {
		return ih01Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setWareCode(String wareCode) {
		this.wareCode = wareCode;
	}

	@Column(name = "WARE_CODE_", length = 20, unique = true)
	public String getWareCode() {
		return wareCode;
	}

	public void setWareName(String wareName) {
		this.wareName = wareName;
	}

	@Column(name = "WARE_NAME_", length = 100)
	public String getWareName() {
		return wareName;
	}

	public void setQwCode(String qwCode) {
		this.qwCode = qwCode;
	}

	@Column(name = "QW_CODE_", length = 20, unique = true)
	public String getQwCode() {
		return qwCode;
	}

	public void setQwName(String qwName) {
		this.qwName = qwName;
	}

	@Column(name = "QW_NAME_", length = 100)
	public String getQwName() {
		return qwName;
	}

	public void setMainType(String mainType) {
		this.mainType = mainType;
	}

	@Column(name = "MAIN_TYPE_", length = 20)
	public String getMainType() {
		return mainType;
	}

	public void setMainTypeName(String mainTypeName) {
		this.mainTypeName = mainTypeName;
	}

	@Column(name = "MAIN_TYPE_NAME_", length = 100)
	public String getMainTypeName() {
		return mainTypeName;
	}

	public void setMainProductNo(String mainProductNo) {
		this.mainProductNo = mainProductNo;
	}

	@Column(name = "MAIN_PRODUCT_NO_", length = 20)
	public String getMainProductNo() {
		return mainProductNo;
	}

	public void setMainProductName(String mainProductName) {
		this.mainProductName = mainProductName;
	}

	@Column(name = "MAIN_PRODUCT_NAME_", length = 100)
	public String getMainProductName() {
		return mainProductName;
	}

	public void setMaxnum(BigDecimal maxnum) {
		this.maxnum = maxnum;
	}

	@Column(name = "MAXNUM_")
	public BigDecimal getMaxnum() {
		return maxnum;
	}

	public void setRemainNum(BigDecimal remainNum) {
		this.remainNum = remainNum;
	}

	@Column(name = "REMAIN_NUM_")
	public BigDecimal getRemainNum() {
		return remainNum;
	}

	public void setKb(String kb) {
		this.kb = kb;
	}

	@Column(name = "KB_", length = 10)
	public String getKb() {
		return kb;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "CITY_", length = 20)
	public String getCity() {
		return city;
	}

	public void setEmo(String emo) {
		this.emo = emo;
	}

	@Column(name = "EMO_", length = 100)
	public String getEmo() {
		return emo;
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

	public void setRemainHeight(BigDecimal remainHeight) {
		this.remainHeight = remainHeight;
	}

	@Column(name = "REMAIN_HEIGHT_")
	public BigDecimal getRemainHeight() {
		return remainHeight;
	}

	public void setRemainWidth(BigDecimal remainWidth) {
		this.remainWidth = remainWidth;
	}

	@Column(name = "REMAIN_WIDTH_")
	public BigDecimal getRemainWidth() {
		return remainWidth;
	}

	public void setRemainLength(BigDecimal remainLength) {
		this.remainLength = remainLength;
	}

	@Column(name = "REMAIN_LENGTH_")
	public BigDecimal getRemainLength() {
		return remainLength;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
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
		return "Tbih01a [ih01aId=" + ih01aId + ",ih01Id=" + ih01Id + ",compId="
				+ compId + ",wareCode=" + wareCode + ",wareName=" + wareName
				+ ",qwCode=" + qwCode + ",qwName=" + qwName + ",mainType="
				+ mainType + ",mainTypeName=" + mainTypeName
				+ ",mainProductNo=" + mainProductNo + ",mainProductName="
				+ mainProductName + ",maxnum=" + maxnum + ",remainNum="
				+ remainNum + ",kb=" + kb + ",city=" + city + ",emo=" + emo
				+ ",height=" + height + ",width=" + width + ",length=" + length
				+ ",remainHeight=" + remainHeight + ",remainWidth="
				+ remainWidth + ",remainLength=" + remainLength + ",status="
				+ status + ",by1=" + by1 + ",by2=" + by2 + ",by3=" + by3
				+ ",by4=" + by4 + ",by5=" + by5 + ",by6=" + by6 + ",by7=" + by7
				+ ",by8=" + by8 + ",by9=" + by9 + ",by10=" + by10
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

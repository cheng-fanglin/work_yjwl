package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbwd02:司机表
 */
@Entity
@Table(name = "tbwd02")
public class Tbwd02 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String wd02Id;

	/**
	 * 会员ID:会员ID
	 */
	@PropertyDef(label = "会员ID", description = "会员ID:会员ID")
	private BigDecimal userId;

	/**
	 * 联系方式:联系方式
	 */
	@PropertyDef(label = "联系方式", description = "联系方式:联系方式")
	private BigDecimal phoneNo;

	/**
	 * 司机类别:司机类别
	 */
	@PropertyDef(label = "司机类别", description = "司机类别:司机类别")
	private String driverType;

	/**
	 * 承运商编号:承运商编号
	 */
	@PropertyDef(label = "承运商编号", description = "承运商编号:承运商编号")
	private String carrierNo;

	/**
	 * 承运人名称:承运人名称
	 */
	@PropertyDef(label = "承运人名称", description = "承运人名称:承运人名称")
	private String carrierName;

	/**
	 * 司机头像(图):司机头像(图)
	 */
	@PropertyDef(label = "司机头像(图)", description = "司机头像(图):司机头像(图)")
	private String driverHead;

	/**
	 * 驾驶证号:驾驶证号
	 */
	@PropertyDef(label = "驾驶证号", description = "驾驶证号:驾驶证号")
	private String driverLisence;

	/**
	 * 驾驶证(图)1:驾驶证(图)1
	 */
	@PropertyDef(label = "驾驶证(图)1", description = "驾驶证(图)1:驾驶证(图)1")
	private String driverLisenceImg;

	/**
	 * 驾驶证(图)2:驾驶证(图)2
	 */
	@PropertyDef(label = "驾驶证(图)2", description = "驾驶证(图)2:驾驶证(图)2")
	private String driverLisenceImg2;

	/**
	 * 驾驶证(图)3:驾驶证(图)3
	 */
	@PropertyDef(label = "驾驶证(图)3", description = "驾驶证(图)3:驾驶证(图)3")
	private String driverLisenceImg3;

	/**
	 * 身份证号码:身份证号码
	 */
	@PropertyDef(label = "身份证号码", description = "身份证号码:身份证号码")
	private BigDecimal identityNo;

	/**
	 * 身份证正面照:身份证正面照
	 */
	@PropertyDef(label = "身份证正面照", description = "身份证正面照:身份证正面照")
	private String identifyImg;

	/**
	 * 身份证反面照:身份证反面照
	 */
	@PropertyDef(label = "身份证反面照", description = "身份证反面照:身份证反面照")
	private String identifyBackImg;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String state;

	/**
	 * 司机姓名:司机姓名
	 */
	@PropertyDef(label = "司机姓名", description = "司机姓名:司机姓名")
	private String userName;

	/**
	 * 紧急联系人:紧急联系人
	 */
	@PropertyDef(label = "紧急联系人", description = "紧急联系人:紧急联系人")
	private String contractName;

	/**
	 * 创建人:创建人
	 */
	@PropertyDef(label = "创建人", description = "创建人:创建人")
	private String createEmp;

	/**
	 * 创建时间:创建时间
	 */
	@PropertyDef(label = "创建时间", description = "创建时间:创建时间")
	private Date createTime;

	/**
	 * 更新人:更新人
	 */
	@PropertyDef(label = "更新人", description = "更新人:更新人")
	private String updateEmp;

	/**
	 * 更新时间:更新时间
	 */
	@PropertyDef(label = "更新时间", description = "更新时间:更新时间")
	private Date updateTime;

	/**
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;

	public Tbwd02() {
		super();
	}

	public Tbwd02(String wd02Id, BigDecimal userId, BigDecimal phoneNo,
			String driverType, String carrierNo, String carrierName,
			String driverHead, String driverLisence, String driverLisenceImg,
			String driverLisenceImg2, String driverLisenceImg3,
			BigDecimal identityNo, String identifyImg, String identifyBackImg,
			String state, String userName, String contractName,
			String createEmp, Date createTime, String updateEmp,
			Date updateTime, int version) {
		super();
		this.wd02Id = wd02Id;
		this.userId = userId;
		this.phoneNo = phoneNo;
		this.driverType = driverType;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.driverHead = driverHead;
		this.driverLisence = driverLisence;
		this.driverLisenceImg = driverLisenceImg;
		this.driverLisenceImg2 = driverLisenceImg2;
		this.driverLisenceImg3 = driverLisenceImg3;
		this.identityNo = identityNo;
		this.identifyImg = identifyImg;
		this.identifyBackImg = identifyBackImg;
		this.state = state;
		this.userName = userName;
		this.contractName = contractName;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setWd02Id(String wd02Id) {
		this.wd02Id = wd02Id;
	}

	@Id
	@Column(name = "WD02_ID_", length = 50, nullable = false)
	public String getWd02Id() {
		return wd02Id;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	@Column(name = "USER_ID_")
	public BigDecimal getUserId() {
		return userId;
	}

	public void setPhoneNo(BigDecimal phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_")
	public BigDecimal getPhoneNo() {
		return phoneNo;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	@Column(name = "DRIVER_TYPE_", length = 10)
	public String getDriverType() {
		return driverType;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	@Column(name = "CARRIER_NO_", length = 10)
	public String getCarrierNo() {
		return carrierNo;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	@Column(name = "CARRIER_NAME_", length = 90)
	public String getCarrierName() {
		return carrierName;
	}

	public void setDriverHead(String driverHead) {
		this.driverHead = driverHead;
	}

	@Column(name = "DRIVER_HEAD_", length = 100)
	public String getDriverHead() {
		return driverHead;
	}

	public void setDriverLisence(String driverLisence) {
		this.driverLisence = driverLisence;
	}

	@Column(name = "DRIVER_LISENCE_", length = 30)
	public String getDriverLisence() {
		return driverLisence;
	}

	public void setDriverLisenceImg(String driverLisenceImg) {
		this.driverLisenceImg = driverLisenceImg;
	}

	@Column(name = "DRIVER_LISENCE_IMG_", length = 100)
	public String getDriverLisenceImg() {
		return driverLisenceImg;
	}

	public void setDriverLisenceImg2(String driverLisenceImg2) {
		this.driverLisenceImg2 = driverLisenceImg2;
	}

	@Column(name = "DRIVER_LISENCE_IMG2_", length = 100)
	public String getDriverLisenceImg2() {
		return driverLisenceImg2;
	}

	public void setDriverLisenceImg3(String driverLisenceImg3) {
		this.driverLisenceImg3 = driverLisenceImg3;
	}

	@Column(name = "DRIVER_LISENCE_IMG3_", length = 100)
	public String getDriverLisenceImg3() {
		return driverLisenceImg3;
	}

	public void setIdentityNo(BigDecimal identityNo) {
		this.identityNo = identityNo;
	}

	@Column(name = "IDENTITY_NO_")
	public BigDecimal getIdentityNo() {
		return identityNo;
	}

	public void setIdentifyImg(String identifyImg) {
		this.identifyImg = identifyImg;
	}

	@Column(name = "IDENTIFY_IMG_", length = 100)
	public String getIdentifyImg() {
		return identifyImg;
	}

	public void setIdentifyBackImg(String identifyBackImg) {
		this.identifyBackImg = identifyBackImg;
	}

	@Column(name = "IDENTIFY_BACK_IMG_", length = 100)
	public String getIdentifyBackImg() {
		return identifyBackImg;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "STATE_", length = 10)
	public String getState() {
		return state;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_NAME_", length = 10)
	public String getUserName() {
		return userName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	@Column(name = "CONTRACT_NAME_", length = 10)
	public String getContractName() {
		return contractName;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 10)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_", nullable = false)
	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 10)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME_", nullable = false)
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION_")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbwd02 [wd02Id=" + wd02Id + ",userId=" + userId + ",phoneNo="
				+ phoneNo + ",driverType=" + driverType + ",carrierNo="
				+ carrierNo + ",carrierName=" + carrierName + ",driverHead="
				+ driverHead + ",driverLisence=" + driverLisence
				+ ",driverLisenceImg=" + driverLisenceImg
				+ ",driverLisenceImg2=" + driverLisenceImg2
				+ ",driverLisenceImg3=" + driverLisenceImg3 + ",identityNo="
				+ identityNo + ",identifyImg=" + identifyImg
				+ ",identifyBackImg=" + identifyBackImg + ",state=" + state
				+ ",userName=" + userName + ",contractName=" + contractName
				+ ",createEmp=" + createEmp + ",createTime=" + createTime
				+ ",updateEmp=" + updateEmp + ",updateTime=" + updateTime
				+ ",version=" + version + "]";
	}

    private String driverShow;
	
	@Transient
	public String getDriverShow() {
		return driverShow;
	}

	public void setDriverShow(String driverShow) {
		this.driverShow = driverShow;
	}
	
	private String driverLisenceShow;
	
	@Transient
	public String getDriverLisenceShow() {
		return driverLisenceShow;
	}

	public void setDriverLisenceShow(String driverLisenceShow) {
		this.driverLisenceShow = driverLisenceShow;
	}
	
	private String identifyShow;
	
	@Transient
	public String getIdentifyShow() {
		return identifyShow;
	}

	public void setIdentifyShow(String identifyShow) {
		this.identifyShow = identifyShow;
	}
	
	private String identifyBackShow;

	@Transient
	public String getIdentifyBackShow() {
		return identifyBackShow;
	}

	public void setIdentifyBackShow(String identifyBackShow) {
		this.identifyBackShow = identifyBackShow;
	}
	
	
}

package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbwd01:承运商表
 */
@Entity
@Table(name = "tbwd01")
public class Tbwd01 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String wd01Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 会员ID:会员ID
	 */
	@PropertyDef(label = "会员ID", description = "会员ID:会员ID")
	private String userId;

	/**
	 * 联系方式:联系方式
	 */
	@PropertyDef(label = "联系方式", description = "联系方式:联系方式")
	private String phoneNo;

	/**
	 * 会员类别:会员类别
	 */
	@PropertyDef(label = "会员类别", description = "会员类别:会员类别")
	private String userType;

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
	 * 身份证号码:身份证号码
	 */
	@PropertyDef(label = "身份证号码", description = "身份证号码:身份证号码")
	private String identityNo;

	/**
	 * 身份证正面照:身份证正面照
	 */
	@PropertyDef(label = "身份证正面照", description = "身份证正面照:身份证正面照")
	private String identityCard;

	/**
	 * 身份证反面照:身份证反面照
	 */
	@PropertyDef(label = "身份证反面照", description = "身份证反面照:身份证反面照")
	private String identityCardBack;

	/**
	 * 税物登记号:税物登记号
	 */
	@PropertyDef(label = "税物登记号", description = "税物登记号:税物登记号")
	private String companyRegistrstion;

	/**
	 * 税务登记证:税务登记证
	 */
	@PropertyDef(label = "税务登记证", description = "税务登记证:税务登记证")
	private String companyCertificate;

	/**
	 * 营业执照(图):营业执照(图)
	 */
	@PropertyDef(label = "营业执照(图)", description = "营业执照(图):营业执照(图)")
	private String companyLicense;

	/**
	 * 道路运输许可证:道路运输许可证
	 */
	@PropertyDef(label = "道路运输许可证", description = "道路运输许可证:道路运输许可证")
	private String roadImg;

	/**
	 * 组织机构代码证:组织机构代码证
	 */
	@PropertyDef(label = "组织机构代码证", description = "组织机构代码证:组织机构代码证")
	private String companyCode;

	/**
	 * 公司委托个人授权书(图):公司委托个人授权书(图)
	 */
	@PropertyDef(label = "公司委托个人授权书(图)", description = "公司委托个人授权书(图):公司委托个人授权书(图)")
	private String authorizationImg;

	/**
	 * 结算开户行:结算开户行
	 */
	@PropertyDef(label = "结算开户行", description = "结算开户行:结算开户行")
	private String bank;

	/**
	 * 结算账号:结算账号
	 */
	@PropertyDef(label = "结算账号", description = "结算账号:结算账号")
	private String bankNo;

	/**
	 * 公司地址:公司地址
	 */
	@PropertyDef(label = "公司地址", description = "公司地址:公司地址")
	private String companyAdderss;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String state;

	/**
	 * 紧急联系人姓名:紧急联系人姓名
	 */
	@PropertyDef(label = "紧急联系人姓名", description = "紧急联系人姓名:紧急联系人姓名")
	private String contract;

	/**
	 * 紧急联系人手机:紧急联系人手机
	 */
	@PropertyDef(label = "紧急联系人手机", description = "紧急联系人手机:紧急联系人手机")
	private String contractPhone;

	/**
	 * 审核单号:审核单号
	 */
	@PropertyDef(label = "审核单号", description = "审核单号:审核单号")
	private String examineNo;

	/**
	 * 创建时间:创建时间
	 */
	@PropertyDef(label = "创建时间", description = "创建时间:创建时间")
	private Date createTime;

	/**
	 * 创建人:创建人
	 */
	@PropertyDef(label = "创建人", description = "创建人:创建人")
	private String createEmp;

	/**
	 * 更新时间:更新时间
	 */
	@PropertyDef(label = "更新时间", description = "更新时间:更新时间")
	private Date updateTime;

	/**
	 * 更新人:更新人
	 */
	@PropertyDef(label = "更新人", description = "更新人:更新人")
	private String updateEmp;

	/**
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;
	//图片对应的全路径虚字段
	
	
	public Tbwd01() {
		super();
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Tbwd01(String wd01Id, String compId, String userId, String phoneNo,
			String userType, String carrierNo, String carrierName,
			String identityNo, String identityCard, String identityCardBack,
			String companyRegistrstion, String companyCertificate,
			String companyLicense, String roadImg, String companyCode,
			String authorizationImg, String bank, String bankNo,
			String companyAdderss, String state, String contract,
			String contractPhone, String examineNo, Date createTime,
			String createEmp, Date updateTime, String updateEmp, int version) {
		super();
		this.wd01Id = wd01Id;
		this.compId = compId;
		this.userId = userId;
		this.phoneNo = phoneNo;
		this.userType = userType;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.identityNo = identityNo;
		this.identityCard = identityCard;
		this.identityCardBack = identityCardBack;
		this.companyRegistrstion = companyRegistrstion;
		this.companyCertificate = companyCertificate;
		this.companyLicense = companyLicense;
		this.roadImg = roadImg;
		this.companyCode = companyCode;
		this.authorizationImg = authorizationImg;
		this.bank = bank;
		this.bankNo = bankNo;
		this.companyAdderss = companyAdderss;
		this.state = state;
		this.contract = contract;
		this.contractPhone = contractPhone;
		this.examineNo = examineNo;
		this.createTime = createTime;
		this.createEmp = createEmp;
		this.updateTime = updateTime;
		this.updateEmp = updateEmp;
		this.version = version;
	}

	public void setWd01Id(String wd01Id) {
		this.wd01Id = wd01Id;
	}

	@Id
	@Column(name = "WD01_ID_", length = 50, nullable = false)
	public String getWd01Id() {
		return wd01Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER_ID_", length = 10)
	public String getUserId() {
		return userId;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_", length = 20)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name = "USER_TYPE_", length = 10)
	public String getUserType() {
		return userType;
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

	@Column(name = "CARRIER_NAME_", length = 50)
	public String getCarrierName() {
		return carrierName;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	@Column(name = "IDENTITY_NO_", length = 25)
	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	@Column(name = "IDENTITY_CARD_", length = 100)
	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCardBack(String identityCardBack) {
		this.identityCardBack = identityCardBack;
	}

	@Column(name = "IDENTITY_CARD_BACK_", length = 100)
	public String getIdentityCardBack() {
		return identityCardBack;
	}

	public void setCompanyRegistrstion(String companyRegistrstion) {
		this.companyRegistrstion = companyRegistrstion;
	}

	@Column(name = "COMPANY_REGISTRSTION__", length = 50)
	public String getCompanyRegistrstion() {
		return companyRegistrstion;
	}

	public void setCompanyCertificate(String companyCertificate) {
		this.companyCertificate = companyCertificate;
	}

	@Column(name = "COMPANY_CERTIFICATE_", length = 100)
	public String getCompanyCertificate() {
		return companyCertificate;
	}

	public void setCompanyLicense(String companyLicense) {
		this.companyLicense = companyLicense;
	}

	@Column(name = "COMPANY_LICENSE_", length = 100)
	public String getCompanyLicense() {
		return companyLicense;
	}

	public void setRoadImg(String roadImg) {
		this.roadImg = roadImg;
	}

	@Column(name = "ROAD_IMG_", length = 100)
	public String getRoadImg() {
		return roadImg;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@Column(name = "COMPANY_CODE_", length = 50)
	public String getCompanyCode() {
		return companyCode;
	}

	public void setAuthorizationImg(String authorizationImg) {
		this.authorizationImg = authorizationImg;
	}

	@Column(name = "AUTHORIZATION_IMG_", length = 100)
	public String getAuthorizationImg() {
		return authorizationImg;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Column(name = "BANK_", length = 90)
	public String getBank() {
		return bank;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	@Column(name = "BANK_NO_", length = 50)
	public String getBankNo() {
		return bankNo;
	}

	public void setCompanyAdderss(String companyAdderss) {
		this.companyAdderss = companyAdderss;
	}

	@Column(name = "COMPANY_ADDERSS_", length = 300)
	public String getCompanyAdderss() {
		return companyAdderss;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "STATE_", length = 10)
	public String getState() {
		return state;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	@Column(name = "CONTRACT_", length = 50)
	public String getContract() {
		return contract;
	}

	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}

	@Column(name = "CONTRACT_PHONE_", length = 20)
	public String getContractPhone() {
		return contractPhone;
	}

	public void setExamineNo(String examineNo) {
		this.examineNo = examineNo;
	}

	@Column(name = "EXAMINE_NO_", length = 20)
	public String getExamineNo() {
		return examineNo;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_", nullable = false)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 10)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME_", nullable = false)
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 10)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION_")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbwd01 [wd01Id=" + wd01Id + ",compId=" + compId + ",userId="
				+ userId + ",phoneNo=" + phoneNo + ",userType=" + userType
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",identityNo=" + identityNo + ",identityCard=" + identityCard
				+ ",identityCardBack=" + identityCardBack
				+ ",companyRegistrstion=" + companyRegistrstion
				+ ",companyCertificate=" + companyCertificate
				+ ",companyLicense=" + companyLicense + ",roadImg=" + roadImg
				+ ",companyCode=" + companyCode + ",authorizationImg="
				+ authorizationImg + ",bank=" + bank + ",bankNo=" + bankNo
				+ ",companyAdderss=" + companyAdderss + ",state=" + state
				+ ",contract=" + contract + ",contractPhone=" + contractPhone
				+ ",examineNo=" + examineNo + ",createTime=" + createTime
				+ ",createEmp=" + createEmp + ",updateTime=" + updateTime
				+ ",updateEmp=" + updateEmp + ",version=" + version + "]";
	}
	

	/** =====================================以下虚字段===================================== **/
	private String companyCertificatePath;
	
	private String companyLicensePath;
	
	private String roadImgPath;
	
	private String companyCodePath;
	
	private String authorizationImgPath;
	
	private String identityCardPath;
	
	private String identityCardBackPath;
	
	@Transient
	public String getCompanyCertificatePath() {
		return companyCertificatePath;
	}

	public void setCompanyCertificatePath(String companyCertificatePath) {
		this.companyCertificatePath = companyCertificatePath;
	}
	@Transient
	public String getCompanyLicensePath() {
		return companyLicensePath;
	}

	public void setCompanyLicensePath(String companyLicensePath) {
		this.companyLicensePath = companyLicensePath;
	}
	@Transient
	public String getRoadImgPath() {
		return roadImgPath;
	}

	public void setRoadImgPath(String roadImgPath) {
		this.roadImgPath = roadImgPath;
	}
	@Transient
	public String getCompanyCodePath() {
		return companyCodePath;
	}

	public void setCompanyCodePath(String companyCodePath) {
		this.companyCodePath = companyCodePath;
	}
	@Transient
	public String getAuthorizationImgPath() {
		return authorizationImgPath;
	}

	public void setAuthorizationImgPath(String authorizationImgPath) {
		this.authorizationImgPath = authorizationImgPath;
	}
	@Transient
	public String getIdentityCardPath() {
		return identityCardPath;
	}

	public void setIdentityCardPath(String identityCardPath) {
		this.identityCardPath = identityCardPath;
	}
	@Transient
	public String getIdentityCardBackPath() {
		return identityCardBackPath;
	}

	public void setIdentityCardBackPath(String identityCardBackPath) {
		this.identityCardBackPath = identityCardBackPath;
	}
	
}

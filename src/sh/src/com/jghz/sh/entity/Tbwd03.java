package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbwd03:司机表
 */
@Entity
@Table(name = "tbwd03")
public class Tbwd03 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String wd03Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 联系方式:联系方式
	 */
	@PropertyDef(label = "联系方式", description = "联系方式:联系方式")
	private BigDecimal phoneNo;

	/**
	 * 车牌号:车牌号
	 */
	@PropertyDef(label = "车牌号", description = "车牌号:车牌号")
	private String carNo;

	/**
	 * 车辆类型:车辆类型
	 */
	@PropertyDef(label = "车辆类型", description = "车辆类型:车辆类型")
	private String carType;

	/**
	 * 车辆载重:车辆载重
	 */
	@PropertyDef(label = "车辆载重", description = "车辆载重:车辆载重")
	private BigDecimal heavy;

	/**
	 * 拖挂轮轴:拖挂轮轴
	 */
	@PropertyDef(label = "拖挂轮轴", description = "拖挂轮轴:拖挂轮轴")
	private String trailerAxle;

	/**
	 * 车辆宽:车辆宽
	 */
	@PropertyDef(label = "车辆宽", description = "车辆宽:车辆宽")
	private BigDecimal carWidth;

	/**
	 * 车辆高:车辆高
	 */
	@PropertyDef(label = "车辆高", description = "车辆高:车辆高")
	private BigDecimal carHeight;

	/**
	 * 车辆长:车辆长
	 */
	@PropertyDef(label = "车辆长", description = "车辆长:车辆长")
	private BigDecimal carLenth;

	/**
	 * 车龄:车龄
	 */
	@PropertyDef(label = "车龄", description = "车龄:车龄")
	private int carAge;

	/**
	 * 冻结状态:冻结状态
	 */
	@PropertyDef(label = "冻结状态", description = "冻结状态:冻结状态")
	private String state;

	/**
	 * 在途状态:在途状态
	 */
	@PropertyDef(label = "在途状态", description = "在途状态:在途状态")
	private String bizState;

	/**
	 * 实际承载量:实际承载量
	 */
	@PropertyDef(label = "实际承载量", description = "实际承载量:实际承载量")
	private BigDecimal realHeavy;

	/**
	 * 发动机号:发动机号
	 */
	@PropertyDef(label = "发动机号", description = "发动机号:发动机号")
	private String engineerNo;

	/**
	 * 车辆照片:车辆照片
	 */
	@PropertyDef(label = "车辆照片", description = "车辆照片:车辆照片")
	private String carImg;

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
	/**
	 * 虚字段 为图片路径
	 */
	private String carImgPath;
	
	@Transient
	public String getCarImgPath() {
		return carImgPath;
	}

	public void setCarImgPath(String carImgPath) {
		this.carImgPath = carImgPath;
	}

	public Tbwd03() {
		super();
	}

	public Tbwd03(String wd03Id, String compId, BigDecimal phoneNo,
			String carNo, String carType, BigDecimal heavy, String trailerAxle,
			BigDecimal carWidth, BigDecimal carHeight, BigDecimal carLenth,
			int carAge, String state, String bizState, BigDecimal realHeavy,
			String engineerNo, String carImg, String createEmp,
			Date createTime, String updateEmp, Date updateTime, int version) {
		super();
		this.wd03Id = wd03Id;
		this.compId = compId;
		this.phoneNo = phoneNo;
		this.carNo = carNo;
		this.carType = carType;
		this.heavy = heavy;
		this.trailerAxle = trailerAxle;
		this.carWidth = carWidth;
		this.carHeight = carHeight;
		this.carLenth = carLenth;
		this.carAge = carAge;
		this.state = state;
		this.bizState = bizState;
		this.realHeavy = realHeavy;
		this.engineerNo = engineerNo;
		this.carImg = carImg;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setWd03Id(String wd03Id) {
		this.wd03Id = wd03Id;
	}

	@Id
	@Column(name = "WD03_ID_", length = 50, nullable = false)
	public String getWd03Id() {
		return wd03Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setPhoneNo(BigDecimal phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_")
	public BigDecimal getPhoneNo() {
		return phoneNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Column(name = "CAR_TYPE_", length = 10)
	public String getCarType() {
		return carType;
	}

	public void setHeavy(BigDecimal heavy) {
		this.heavy = heavy;
	}

	@Column(name = "HEAVY_")
	public BigDecimal getHeavy() {
		return heavy;
	}

	public void setTrailerAxle(String trailerAxle) {
		this.trailerAxle = trailerAxle;
	}

	@Column(name = "TRAILER_AXLE_", length = 100)
	public String getTrailerAxle() {
		return trailerAxle;
	}

	public void setCarWidth(BigDecimal carWidth) {
		this.carWidth = carWidth;
	}

	@Column(name = "CAR_WIDTH_")
	public BigDecimal getCarWidth() {
		return carWidth;
	}

	public void setCarHeight(BigDecimal carHeight) {
		this.carHeight = carHeight;
	}

	@Column(name = "CAR_HEIGHT_")
	public BigDecimal getCarHeight() {
		return carHeight;
	}

	public void setCarLenth(BigDecimal carLenth) {
		this.carLenth = carLenth;
	}

	@Column(name = "CAR_LENTH_")
	public BigDecimal getCarLenth() {
		return carLenth;
	}

	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}

	@Column(name = "CAR_AGE_")
	public int getCarAge() {
		return carAge;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "STATE_", length = 10)
	public String getState() {
		return state;
	}

	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	@Column(name = "BIZ_STATE_", length = 10)
	public String getBizState() {
		return bizState;
	}

	public void setRealHeavy(BigDecimal realHeavy) {
		this.realHeavy = realHeavy;
	}

	@Column(name = "REAL_HEAVY_")
	public BigDecimal getRealHeavy() {
		return realHeavy;
	}

	public void setEngineerNo(String engineerNo) {
		this.engineerNo = engineerNo;
	}

	@Column(name = "ENGINEER_NO_", length = 50)
	public String getEngineerNo() {
		return engineerNo;
	}

	public void setCarImg(String carImg) {
		this.carImg = carImg;
	}

	@Column(name = "CAR_IMG_", length = 100)
	public String getCarImg() {
		return carImg;
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
		return "Tbwd03 [wd03Id=" + wd03Id + ",compId=" + compId + ",phoneNo="
				+ phoneNo + ",carNo=" + carNo + ",carType=" + carType
				+ ",heavy=" + heavy + ",trailerAxle=" + trailerAxle
				+ ",carWidth=" + carWidth + ",carHeight=" + carHeight
				+ ",carLenth=" + carLenth + ",carAge=" + carAge + ",state="
				+ state + ",bizState=" + bizState + ",realHeavy=" + realHeavy
				+ ",engineerNo=" + engineerNo + ",carImg=" + carImg
				+ ",createEmp=" + createEmp + ",createTime=" + createTime
				+ ",updateEmp=" + updateEmp + ",updateTime=" + updateTime
				+ ",version=" + version + "]";
	}

		
	
}

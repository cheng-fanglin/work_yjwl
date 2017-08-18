package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbshwxsite:微信坐标表TBSHWXSITE
 */
@Entity
@Table(name = "tbshwxsite")
public class Tbshwxsite implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String shwxsiteId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 分公司别:分公司别
	 */
	@PropertyDef(label = "分公司别", description = "分公司别:分公司别")
	private String compCode;

	/**
	 * 微信唯一标识:微信唯一标识
	 */
	@PropertyDef(label = "微信唯一标识", description = "微信唯一标识:微信唯一标识")
	private BigDecimal wechatId;

	/**
	 * 运单项次号:运单项次号
	 */
	@PropertyDef(label = "运单项次号", description = "运单项次号:运单项次号")
	private String transItem;

	/**
	 * 承运人ID:承运人ID
	 */
	@PropertyDef(label = "承运人ID", description = "承运人ID:承运人ID")
	private BigDecimal carrierId;

	/**
	 * 经度:经度
	 */
	@PropertyDef(label = "经度", description = "经度:经度")
	private BigDecimal longitude;

	/**
	 * 纬度:纬度
	 */
	@PropertyDef(label = "纬度", description = "纬度:纬度")
	private BigDecimal latitude;

	/**
	 * 节点ID:节点ID
	 */
	@PropertyDef(label = "节点ID", description = "节点ID:节点ID")
	private byte nodeId;

	/**
	 * 上传坐标点地理位置:上传坐标点地理位置
	 */
	@PropertyDef(label = "上传坐标点地理位置", description = "上传坐标点地理位置:上传坐标点地理位置")
	private String areaName;

	/**
	 * 速度:速度
	 */
	@PropertyDef(label = "速度", description = "速度:速度")
	private BigDecimal speed;

	/**
	 * 位置精度:位置精度
	 */
	@PropertyDef(label = "位置精度", description = "位置精度:位置精度")
	private BigDecimal locationAccuracy;

	/**
	 * 新增人:新增人
	 */
	@PropertyDef(label = "新增人", description = "新增人:新增人")
	private String createEmp;

	/**
	 * 新增时间:新增时间
	 */
	@PropertyDef(label = "新增时间", description = "新增时间:新增时间")
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

	public Tbshwxsite() {
		super();
	}

	public Tbshwxsite(String shwxsiteId, String compId, String compCode,
			BigDecimal wechatId, String transItem, BigDecimal carrierId,
			BigDecimal longitude, BigDecimal latitude, byte nodeId,
			String areaName, BigDecimal speed, BigDecimal locationAccuracy,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.shwxsiteId = shwxsiteId;
		this.compId = compId;
		this.compCode = compCode;
		this.wechatId = wechatId;
		this.transItem = transItem;
		this.carrierId = carrierId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.nodeId = nodeId;
		this.areaName = areaName;
		this.speed = speed;
		this.locationAccuracy = locationAccuracy;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setShwxsiteId(String shwxsiteId) {
		this.shwxsiteId = shwxsiteId;
	}

	@Id
	@Column(name = "SHWXSITE_ID_", length = 50, nullable = false)
	public String getShwxsiteId() {
		return shwxsiteId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	@Column(name = "COMP_CODE_", length = 10)
	public String getCompCode() {
		return compCode;
	}

	public void setWechatId(BigDecimal wechatId) {
		this.wechatId = wechatId;
	}

	@Column(name = "WECHAT_ID_")
	public BigDecimal getWechatId() {
		return wechatId;
	}

	public void setTransItem(String transItem) {
		this.transItem = transItem;
	}

	@Column(name = "TRANS_ITEM_", length = 20)
	public String getTransItem() {
		return transItem;
	}

	public void setCarrierId(BigDecimal carrierId) {
		this.carrierId = carrierId;
	}

	@Column(name = "CARRIER_ID_")
	public BigDecimal getCarrierId() {
		return carrierId;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Column(name = "LONGITUDE_")
	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@Column(name = "LATITUDE_")
	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setNodeId(byte nodeId) {
		this.nodeId = nodeId;
	}

	@Column(name = "NODE_ID_")
	public byte getNodeId() {
		return nodeId;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Column(name = "AREA_NAME_", length = 200)
	public String getAreaName() {
		return areaName;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}

	@Column(name = "SPEED_")
	public BigDecimal getSpeed() {
		return speed;
	}

	public void setLocationAccuracy(BigDecimal locationAccuracy) {
		this.locationAccuracy = locationAccuracy;
	}

	@Column(name = "LOCATION_ACCURACY_")
	public BigDecimal getLocationAccuracy() {
		return locationAccuracy;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 20)
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

	@Column(name = "UPDATE_EMP_", length = 20)
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
		return "Tbshwxsite [shwxsiteId=" + shwxsiteId + ",compId=" + compId
				+ ",compCode=" + compCode + ",wechatId=" + wechatId
				+ ",transItem=" + transItem + ",carrierId=" + carrierId
				+ ",longitude=" + longitude + ",latitude=" + latitude
				+ ",nodeId=" + nodeId + ",areaName=" + areaName + ",speed="
				+ speed + ",locationAccuracy=" + locationAccuracy
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

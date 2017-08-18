package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh10a2:回单图片档
 */
@Entity
@Table(name = "tbsh10a2")
public class Tbsh10a2 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh10a2Id;

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
	 * 运单项次号:运单项次号
	 */
	@PropertyDef(label = "运单项次号", description = "运单项次号:运单项次号")
	private String transItem;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

	/**
	 * 图片ID:图片ID
	 */
	@PropertyDef(label = "图片ID", description = "图片ID:图片ID")
	private String imageId;

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

	public Tbsh10a2() {
		super();
	}

	public Tbsh10a2(String sh10a2Id, String compId, String compCode,
			String transItem, String carNo, String imageId, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.sh10a2Id = sh10a2Id;
		this.compId = compId;
		this.compCode = compCode;
		this.transItem = transItem;
		this.carNo = carNo;
		this.imageId = imageId;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh10a2Id(String sh10a2Id) {
		this.sh10a2Id = sh10a2Id;
	}

	@Id
	@Column(name = "SH10A2_ID_", length = 50, nullable = false)
	public String getSh10a2Id() {
		return sh10a2Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 20)
	public String getCompId() {
		return compId;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	@Column(name = "COMP_CODE_", length = 20)
	public String getCompCode() {
		return compCode;
	}

	public void setTransItem(String transItem) {
		this.transItem = transItem;
	}

	@Column(name = "TRANS_ITEM_", length = 20)
	public String getTransItem() {
		return transItem;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	@Column(name = "IMAGE_ID_", length = 200)
	public String getImageId() {
		return imageId;
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
		return "Tbsh10a2 [sh10a2Id=" + sh10a2Id + ",compId=" + compId
				+ ",compCode=" + compCode + ",transItem=" + transItem
				+ ",carNo=" + carNo + ",imageId=" + imageId + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + "]";
	}

}

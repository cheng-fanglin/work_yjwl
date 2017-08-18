package com.jghz.dc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdcc1:产品分类表
 */
@Entity
@Table(name = "tbdcc1")
public class Tbdcc1 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 流水号:流水号
	 */
	@PropertyDef(label = "流水号", description = "流水号:流水号")
	private String dcc1Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 分类编号:分类编号
	 */
	@PropertyDef(label = "分类编号", description = "分类编号:分类编号")
	private String typeId;

	/**
	 * 分类名称:分类名称
	 */
	@PropertyDef(label = "分类名称", description = "分类名称:分类名称")
	private String typeName;

	/**
	 * 说明:说明
	 */
	@PropertyDef(label = "说明", description = "说明:说明")
	private String memo;

	/**
	 * 上级分类:上级分类
	 */
	@PropertyDef(label = "上级分类", description = "上级分类:上级分类")
	private String fatherId;

	/**
	 * 上级分类名称:上级分类名称
	 */
	@PropertyDef(label = "上级分类名称", description = "上级分类名称:上级分类名称")
	private String fatherName;

	/**
	 * 状态(0)=停用1=启用):状态(0)=停用1=启用)
	 */
	@PropertyDef(label = "状态(0)=停用1=启用)", description = "状态(0)=停用1=启用):状态(0)=停用1=启用)")
	private String status;

	/**
	 * 所有上级分类编号:所有上级分类编号
	 */
	@PropertyDef(label = "所有上级分类编号", description = "所有上级分类编号:所有上级分类编号")
	private String allFatherId;

	/**
	 * 所有上级分类名称:所有上级分类名称
	 */
	@PropertyDef(label = "所有上级分类名称", description = "所有上级分类名称:所有上级分类名称")
	private String allFatherName;

	/**
	 * 新增人员:新增人员
	 */
	@PropertyDef(label = "新增人员", description = "新增人员:新增人员")
	private String createEmp;

	/**
	 * 新增时间:新增时间
	 */
	@PropertyDef(label = "新增时间", description = "新增时间:新增时间")
	private Date createTime;

	/**
	 * 修改人员:修改人员
	 */
	@PropertyDef(label = "修改人员", description = "修改人员:修改人员")
	private String updateEmp;

	/**
	 * 修改时间:修改时间
	 */
	@PropertyDef(label = "修改时间", description = "修改时间:修改时间")
	private Date updateTime;

	/**
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;

	public Tbdcc1() {
		super();
	}

	public Tbdcc1(String dcc1Id, String compId, String typeId, String typeName,
			String memo, String fatherId, String fatherName, String status,
			String allFatherId, String allFatherName, String createEmp,
			Date createTime, String updateEmp, Date updateTime, int version) {
		super();
		this.dcc1Id = dcc1Id;
		this.compId = compId;
		this.typeId = typeId;
		this.typeName = typeName;
		this.memo = memo;
		this.fatherId = fatherId;
		this.fatherName = fatherName;
		this.status = status;
		this.allFatherId = allFatherId;
		this.allFatherName = allFatherName;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setDcc1Id(String dcc1Id) {
		this.dcc1Id = dcc1Id;
	}

	@Id
	@Column(name = "DCC1_ID_", length = 50, nullable = false)
	public String getDcc1Id() {
		return dcc1Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	@Column(name = "TYPE_ID_", length = 10)
	public String getTypeId() {
		return typeId;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Column(name = "TYPE_NAME_", length = 50)
	public String getTypeName() {
		return typeName;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 200)
	public String getMemo() {
		return memo;
	}

	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

	@Column(name = "FATHER_ID_", length = 10)
	public String getFatherId() {
		return fatherId;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "FATHER_NAME_", length = 50)
	public String getFatherName() {
		return fatherName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
	}

	public void setAllFatherId(String allFatherId) {
		this.allFatherId = allFatherId;
	}

	@Column(name = "ALL_FATHER_ID_", length = 1000)
	public String getAllFatherId() {
		return allFatherId;
	}

	public void setAllFatherName(String allFatherName) {
		this.allFatherName = allFatherName;
	}

	@Column(name = "ALL_FATHER_NAME_", length = 1000)
	public String getAllFatherName() {
		return allFatherName;
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
	@Column(name = "CREATE_TIME_")
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
	@Column(name = "UPDATE_TIME_")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	@Version
	@Column(name = "VERSION")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbdcc1 [dcc1Id=" + dcc1Id + ",compId=" + compId + ",typeId="
				+ typeId + ",typeName=" + typeName + ",memo=" + memo
				+ ",fatherId=" + fatherId + ",fatherName=" + fatherName
				+ ",status=" + status + ",allFatherId=" + allFatherId
				+ ",allFatherName=" + allFatherName + ",createEmp=" + createEmp
				+ ",createTime=" + createTime + ",updateEmp=" + updateEmp
				+ ",updateTime=" + updateTime + ",version=" + version + "]";
	}

}

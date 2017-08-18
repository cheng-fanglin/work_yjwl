package com.jghz.dc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdcb1a:推送消息表
 */
@Entity
@Table(name = "tbdcb1a")
public class Tbdcb1a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String dcb1aId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 模板ID:模板ID
	 */
	@PropertyDef(label = "模板ID", description = "模板ID:模板ID")
	private String templateId;

	/**
	 * 推送ID:推送ID
	 */
	@PropertyDef(label = "推送ID", description = "推送ID:推送ID")
	private String phoneNo;

	/**
	 * 推送内容:推送内容
	 */
	@PropertyDef(label = "推送内容", description = "推送内容:推送内容")
	private String pushDesc;

	/**
	 * 推送时间:推送时间
	 */
	@PropertyDef(label = "推送时间", description = "推送时间:推送时间")
	private Date pushTime;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 新增人:新增人
	 */
	@PropertyDef(label = "新增人", description = "新增人:新增人")
	private String createEmp;

	/**
	 * 新增时间:新增时间
	 */
	@PropertyDef(label = "新增时间", description = "新增时间:新增时间")
	private Date createTime;

	/**
	 * 修改人:修改人
	 */
	@PropertyDef(label = "修改人", description = "修改人:修改人")
	private String updateEmp;

	/**
	 * 修改时间:修改时间
	 */
	@PropertyDef(label = "修改时间", description = "修改时间:修改时间")
	private Date updateTime;

	/**
	 * 删除标记:删除标记
	 */
	@PropertyDef(label = "删除标记", description = "删除标记:删除标记")
	private String deleteFlag;

	/**
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;

	public Tbdcb1a() {
		super();
	}

	public Tbdcb1a(String dcb1aId, String compId, String templateId,
			String phoneNo, String pushDesc, Date pushTime, String status,
			String createEmp, Date createTime, String updateEmp,
			Date updateTime, String deleteFlag, int version) {
		super();
		this.dcb1aId = dcb1aId;
		this.compId = compId;
		this.templateId = templateId;
		this.phoneNo = phoneNo;
		this.pushDesc = pushDesc;
		this.pushTime = pushTime;
		this.status = status;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	public void setDcb1aId(String dcb1aId) {
		this.dcb1aId = dcb1aId;
	}

	@Id
	@Column(name = "DCB1A_ID_", length = 50, nullable = false)
	public String getDcb1aId() {
		return dcb1aId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	@Column(name = "template_id_", length = 20)
	public String getTemplateId() {
		return templateId;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_", length = 50)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPushDesc(String pushDesc) {
		this.pushDesc = pushDesc;
	}

	@Column(name = "PUSH_DESC_", length = 500)
	public String getPushDesc() {
		return pushDesc;
	}

	public void setPushTime(Date pushTime) {
		this.pushTime = pushTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PUSH_TIME_", nullable = false)
	public Date getPushTime() {
		return pushTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 20)
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

	@Column(name = "UPDATE_EMP_", length = 20)
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

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Column(name = "DELETE_FLAG_", length = 10)
	public String getDeleteFlag() {
		return deleteFlag;
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
		return "Tbdcb1a [dcb1aId=" + dcb1aId + ",compId=" + compId
				+ ",templateId=" + templateId + ",phoneNo=" + phoneNo
				+ ",pushDesc=" + pushDesc + ",pushTime=" + pushTime
				+ ",status=" + status + ",createEmp=" + createEmp
				+ ",createTime=" + createTime + ",updateEmp=" + updateEmp
				+ ",updateTime=" + updateTime + ",deleteFlag=" + deleteFlag
				+ ",version=" + version + "]";
	}
/**************************************/
	
	private String tempDesc;
	@Transient
	public String getTempDesc() {
		return tempDesc;
	}
	
	public void setTempDesc(String tempDesc) {
		this.tempDesc = tempDesc;
	}
}

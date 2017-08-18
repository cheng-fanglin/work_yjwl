package com.jghz.dc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdcb1:短信模板
 */
@Entity
@Table(name = "tbdcb1")
public class Tbdcb1 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String dcb1Id;

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
	 * 模板内容:模板内容
	 */
	@PropertyDef(label = "模板内容", description = "模板内容:模板内容")
	private String template;

	/**
	 * 模板描述:模板描述
	 */
	@PropertyDef(label = "模板描述", description = "模板描述:模板描述")
	private String tempDesc;

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

	public Tbdcb1() {
		super();
	}

	public Tbdcb1(String dcb1Id, String compId, String templateId,
			String template, String tempDesc, String createEmp,
			Date createTime, String updateEmp, Date updateTime,
			String deleteFlag, int version) {
		super();
		this.dcb1Id = dcb1Id;
		this.compId = compId;
		this.templateId = templateId;
		this.template = template;
		this.tempDesc = tempDesc;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	public void setDcb1Id(String dcb1Id) {
		this.dcb1Id = dcb1Id;
	}

	@Id
	@Column(name = "DCB1_ID_", length = 50, nullable = false)
	public String getDcb1Id() {
		return dcb1Id;
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

	@Column(name = "template_id_", length = 20, unique = true)
	public String getTemplateId() {
		return templateId;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@Column(name = "template_", length = 500)
	public String getTemplate() {
		return template;
	}

	public void setTempDesc(String tempDesc) {
		this.tempDesc = tempDesc;
	}

	@Column(name = "temp_desc", length = 100)
	public String getTempDesc() {
		return tempDesc;
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
		return "Tbdcb1 [dcb1Id=" + dcb1Id + ",compId=" + compId
				+ ",templateId=" + templateId + ",template=" + template
				+ ",tempDesc=" + tempDesc + ",createEmp=" + createEmp
				+ ",createTime=" + createTime + ",updateEmp=" + updateEmp
				+ ",updateTime=" + updateTime + ",deleteFlag=" + deleteFlag
				+ ",version=" + version + "]";
	}

}

package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh34:
 */
@Entity
@Table(name = "tbsh34")
public class Tbsh34 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh34Id;

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
	 * 结算单号:结算单号
	 */
	@PropertyDef(label = "结算单号", description = "结算单号:结算单号")
	private String settleNo;

	/**
	 * 送审人:送审人
	 */
	@PropertyDef(label = "送审人", description = "送审人:送审人")
	private String sendEmp;

	/**
	 * 送审时间:送审时间
	 */
	@PropertyDef(label = "送审时间", description = "送审时间:送审时间")
	private String sendTime;

	/**
	 * 送审说明:送审说明
	 */
	@PropertyDef(label = "送审说明", description = "送审说明:送审说明")
	private String sendMemo;

	/**
	 * 审批人:审批人
	 */
	@PropertyDef(label = "审批人", description = "审批人:审批人")
	private String approveEmp;

	/**
	 * 审批时间:审批时间
	 */
	@PropertyDef(label = "审批时间", description = "审批时间:审批时间")
	private String approveTime;

	/**
	 * 审批意见:审批意见
	 */
	@PropertyDef(label = "审批意见", description = "审批意见:审批意见")
	private String approveMemo;

	/**
	 * 类别:类别
	 */
	@PropertyDef(label = "类别", description = "类别:类别")
	private String type;

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

	public Tbsh34() {
		super();
	}

	public Tbsh34(String sh34Id, String compId, String compCode,
			String settleNo, String sendEmp, String sendTime, String sendMemo,
			String approveEmp, String approveTime, String approveMemo,
			String type, String status, String createEmp, Date createDate,
			String updateEmp, Date updateDate, int version) {
		super();
		this.sh34Id = sh34Id;
		this.compId = compId;
		this.compCode = compCode;
		this.settleNo = settleNo;
		this.sendEmp = sendEmp;
		this.sendTime = sendTime;
		this.sendMemo = sendMemo;
		this.approveEmp = approveEmp;
		this.approveTime = approveTime;
		this.approveMemo = approveMemo;
		this.type = type;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh34Id(String sh34Id) {
		this.sh34Id = sh34Id;
	}

	@Id
	@Column(name = "SH34_ID_", length = 50, nullable = false)
	public String getSh34Id() {
		return sh34Id;
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

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 100)
	public String getSettleNo() {
		return settleNo;
	}

	public void setSendEmp(String sendEmp) {
		this.sendEmp = sendEmp;
	}

	@Column(name = "SEND_EMP_", length = 20)
	public String getSendEmp() {
		return sendEmp;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	@Column(name = "SEND_TIME_", length = 20)
	public String getSendTime() {
		return sendTime;
	}

	public void setSendMemo(String sendMemo) {
		this.sendMemo = sendMemo;
	}

	@Column(name = "SEND_MEMO_", length = 200)
	public String getSendMemo() {
		return sendMemo;
	}

	public void setApproveEmp(String approveEmp) {
		this.approveEmp = approveEmp;
	}

	@Column(name = "APPROVE_EMP_", length = 20)
	public String getApproveEmp() {
		return approveEmp;
	}

	public void setApproveTime(String approveTime) {
		this.approveTime = approveTime;
	}

	@Column(name = "APPROVE_TIME_", length = 20)
	public String getApproveTime() {
		return approveTime;
	}

	public void setApproveMemo(String approveMemo) {
		this.approveMemo = approveMemo;
	}

	@Column(name = "APPROVE_MEMO_", length = 200)
	public String getApproveMemo() {
		return approveMemo;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "TYPE_", length = 10)
	public String getType() {
		return type;
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
		return "Tbsh34 [sh34Id=" + sh34Id + ",compId=" + compId + ",compCode="
				+ compCode + ",settleNo=" + settleNo + ",sendEmp=" + sendEmp
				+ ",sendTime=" + sendTime + ",sendMemo=" + sendMemo
				+ ",approveEmp=" + approveEmp + ",approveTime=" + approveTime
				+ ",approveMemo=" + approveMemo + ",type=" + type + ",status="
				+ status + ",createEmp=" + createEmp + ",createDate="
				+ createDate + ",updateEmp=" + updateEmp + ",updateDate="
				+ updateDate + ",version=" + version + "]";
	}

}

package com.jghz.pt.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbpt01:新闻公告表
 */
@Entity
@Table(name = "tbpt01")
public class Tbpt01 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String pt01Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 标题:标题
	 */
	@PropertyDef(label = "标题", description = "标题:标题")
	private String titleName;

	/**
	 * 内容:内容
	 */
	@PropertyDef(label = "内容", description = "内容:内容")
	private String newsContent;

	/**
	 * 类型:类型
	 */
	@PropertyDef(label = "类型", description = "类型:类型")
	private String newsType;

	/**
	 * 信息发布类型:信息发布类型
	 */
	@PropertyDef(label = "信息发布类型", description = "信息发布类型:信息发布类型")
	private String newsClass;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String state;

	/**
	 * 发布人:发布人
	 */
	@PropertyDef(label = "发布人", description = "发布人:发布人")
	private String auditor;

	/**
	 * 审核意见:审核意见
	 */
	@PropertyDef(label = "审核意见", description = "审核意见:审核意见")
	private String opinion;

	/**
	 * 发布时间:发布时间
	 */
	@PropertyDef(label = "发布时间", description = "发布时间:发布时间")
	private String releaseTime;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String remark;

	/**
	 * 所有人:所有人
	 */
	@PropertyDef(label = "所有人", description = "所有人:所有人")
	private String allPeople;

	/**
	 * 部门ID:部门ID
	 */
	@PropertyDef(label = "部门ID", description = "部门ID:部门ID")
	private String deptId;

	/**
	 * 人员ID:人员ID
	 */
	@PropertyDef(label = "人员ID", description = "人员ID:人员ID")
	private String userId;

	/**
	 * 开始时间:开始时间
	 */
	@PropertyDef(label = "开始时间", description = "开始时间:开始时间")
	private String startTime;

	/**
	 * 结束时间:结束时间
	 */
	@PropertyDef(label = "结束时间", description = "结束时间:结束时间")
	private String endTime;

	/**
	 * 附件地址:附件地址
	 */
	@PropertyDef(label = "附件地址", description = "附件地址:附件地址")
	private String uploadAddress;

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

	public Tbpt01() {
		super();
	}

	public Tbpt01(String pt01Id, String compId, String titleName,
			String newsContent, String newsType, String newsClass,
			String state, String auditor, String opinion, String releaseTime,
			String remark, String allPeople, String deptId, String userId,
			String startTime, String endTime, String uploadAddress,
			Date createTime, String createEmp, Date updateTime,
			String updateEmp, int version) {
		super();
		this.pt01Id = pt01Id;
		this.compId = compId;
		this.titleName = titleName;
		this.newsContent = newsContent;
		this.newsType = newsType;
		this.newsClass = newsClass;
		this.state = state;
		this.auditor = auditor;
		this.opinion = opinion;
		this.releaseTime = releaseTime;
		this.remark = remark;
		this.allPeople = allPeople;
		this.deptId = deptId;
		this.userId = userId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.uploadAddress = uploadAddress;
		this.createTime = createTime;
		this.createEmp = createEmp;
		this.updateTime = updateTime;
		this.updateEmp = updateEmp;
		this.version = version;
	}

	public void setPt01Id(String pt01Id) {
		this.pt01Id = pt01Id;
	}

	@Id
	@Column(name = "PT01_ID_", length = 50, nullable = false)
	public String getPt01Id() {
		return pt01Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	@Column(name = "TITLE_NAME_", length = 300)
	public String getTitleName() {
		return titleName;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	@Lob
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "NEWS_CONTENT_", columnDefinition = "CLOB")
	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	@Column(name = "NEWS_TYPE_", length = 2)
	public String getNewsType() {
		return newsType;
	}

	public void setNewsClass(String newsClass) {
		this.newsClass = newsClass;
	}

	@Column(name = "NEWS_CLASS_", length = 2)
	public String getNewsClass() {
		return newsClass;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "STATE_", length = 10)
	public String getState() {
		return state;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	@Column(name = "AUDITOR_", length = 20)
	public String getAuditor() {
		return auditor;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	@Column(name = "OPINION_", length = 200)
	public String getOpinion() {
		return opinion;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	@Column(name = "RELEASE_TIME_", length = 20)
	public String getReleaseTime() {
		return releaseTime;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "REMARK_", length = 200)
	public String getRemark() {
		return remark;
	}

	public void setAllPeople(String allPeople) {
		this.allPeople = allPeople;
	}

	@Column(name = "ALL_PEOPLE_", length = 2)
	public String getAllPeople() {
		return allPeople;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@Column(name = "DEPT_ID_", length = 50)
	public String getDeptId() {
		return deptId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER_ID_", length = 50)
	public String getUserId() {
		return userId;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Column(name = "START_TIME_", length = 20)
	public String getStartTime() {
		return startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Column(name = "END_TIME_", length = 20)
	public String getEndTime() {
		return endTime;
	}

	public void setUploadAddress(String uploadAddress) {
		this.uploadAddress = uploadAddress;
	}

	@Column(name = "UPLOAD_ADDRESS_", length = 200)
	public String getUploadAddress() {
		return uploadAddress;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 20)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME_")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 20)
	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "VERSION")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbpt01 [pt01Id=" + pt01Id + ",compId=" + compId + ",titleName="
				+ titleName + ",newsContent=" + newsContent + ",newsType="
				+ newsType + ",newsClass=" + newsClass + ",state=" + state
				+ ",auditor=" + auditor + ",opinion=" + opinion
				+ ",releaseTime=" + releaseTime + ",remark=" + remark
				+ ",allPeople=" + allPeople + ",deptId=" + deptId + ",userId="
				+ userId + ",startTime=" + startTime + ",endTime=" + endTime
				+ ",uploadAddress=" + uploadAddress + ",createTime="
				+ createTime + ",createEmp=" + createEmp + ",updateTime="
				+ updateTime + ",updateEmp=" + updateEmp + ",version="
				+ version + "]";
	}

}

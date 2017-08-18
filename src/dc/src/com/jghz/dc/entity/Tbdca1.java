package com.jghz.dc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdca1:公用代码档主档
 */
@Entity
@Table(name = "Tbdca1")
public class Tbdca1 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String dca1Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 应用系统类别:应用系统类别
	 */
	@PropertyDef(label = "应用系统类别", description = "应用系统类别:应用系统类别")
	private String sysType;

	/**
	 * 对照表代码:对照表代码
	 */
	@PropertyDef(label = "对照表代码", description = "对照表代码:对照表代码")
	private String compTabCode;

	/**
	 * 拥有者:拥有者
	 */
	@PropertyDef(label = "拥有者", description = "拥有者:拥有者")
	private String owner;

	/**
	 * 授权群组:授权群组
	 */
	@PropertyDef(label = "授权群组", description = "授权群组:授权群组")
	private String authori;

	/**
	 * 功能管制:功能管制
	 */
	@PropertyDef(label = "功能管制", description = "功能管制:功能管制")
	private String funcPower;

	/**
	 * 对照表说明:对照表说明
	 */
	@PropertyDef(label = "对照表说明", description = "对照表说明:对照表说明")
	private String compTabExpln;

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
	 * 版本号:版本号
	 */
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;

	public Tbdca1() {
		super();
	}

	public Tbdca1(String dca1Id, String compId, String sysType,
			String compTabCode, String owner, String authori, String funcPower,
			String compTabExpln, String createEmp, Date createTime,
			String updateEmp, Date updateTime, int version) {
		super();
		this.dca1Id = dca1Id;
		this.compId = compId;
		this.sysType = sysType;
		this.compTabCode = compTabCode;
		this.owner = owner;
		this.authori = authori;
		this.funcPower = funcPower;
		this.compTabExpln = compTabExpln;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setDca1Id(String dca1Id) {
		this.dca1Id = dca1Id;
	}

	@Id
	@Column(name = "DCA1_ID_", length = 50, nullable = false)
	public String getDca1Id() {
		return dca1Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

	@Column(name = "SYS_TYPE_", length = 10, unique = true)
	public String getSysType() {
		return sysType;
	}

	public void setCompTabCode(String compTabCode) {
		this.compTabCode = compTabCode;
	}

	@Column(name = "COMP_TAB_CODE_", length = 20, unique = true)
	public String getCompTabCode() {
		return compTabCode;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Column(name = "OWNER_", length = 10)
	public String getOwner() {
		return owner;
	}

	public void setAuthori(String authori) {
		this.authori = authori;
	}

	@Column(name = "AUTHORI_", length = 20)
	public String getAuthori() {
		return authori;
	}

	public void setFuncPower(String funcPower) {
		this.funcPower = funcPower;
	}

	@Column(name = "FUNC_POWER_", length = 10)
	public String getFuncPower() {
		return funcPower;
	}

	public void setCompTabExpln(String compTabExpln) {
		this.compTabExpln = compTabExpln;
	}

	@Column(name = "COMP_TAB_EXPLN_", length = 60)
	public String getCompTabExpln() {
		return compTabExpln;
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

	public void setVersion(int version) {
		this.version = version;
	}
	
	@Version
	@Column(name = "VERSION")
	public int getVersion() {
		return version;
	}

	public String toString() {
		return "Tbdca1 [dca1Id=" + dca1Id + ",compId=" + compId + ",sysType="
				+ sysType + ",compTabCode=" + compTabCode + ",owner=" + owner
				+ ",authori=" + authori + ",funcPower=" + funcPower
				+ ",compTabExpln=" + compTabExpln + ",createEmp=" + createEmp
				+ ",createTime=" + createTime + ",updateEmp=" + updateEmp
				+ ",updateTime=" + updateTime + ",version=" + version + "]";
	}

}

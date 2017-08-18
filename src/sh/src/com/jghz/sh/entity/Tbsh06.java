package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh06:
 */
@Entity
@Table(name = "tbsh06")
public class Tbsh06 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh06Id;

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
	 * 区域编码:区域编码
	 */
	@PropertyDef(label = "区域编码", description = "区域编码:区域编码")
	private String areacode;

	/**
	 * 区域名称:区域名称
	 */
	@PropertyDef(label = "区域名称", description = "区域名称:区域名称")
	private String areaname;

	/**
	 * 上级区域:上级区域
	 */
	@PropertyDef(label = "上级区域", description = "上级区域:上级区域")
	private String parentId;

	/**
	 * 是否启用:是否启用
	 */
	@PropertyDef(label = "是否启用", description = "是否启用:是否启用")
	private String isuse;

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

	/**
	 * 邮政编码:邮政编码
	 */
	@PropertyDef(label = "邮政编码", description = "邮政编码:邮政编码")
	private String ecode;

	public Tbsh06() {
		super();
	}

	public Tbsh06(String sh06Id, String compId, String compCode,
			String areacode, String areaname, String parentId, String isuse,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version, String ecode) {
		super();
		this.sh06Id = sh06Id;
		this.compId = compId;
		this.compCode = compCode;
		this.areacode = areacode;
		this.areaname = areaname;
		this.parentId = parentId;
		this.isuse = isuse;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.ecode = ecode;
	}

	public void setSh06Id(String sh06Id) {
		this.sh06Id = sh06Id;
	}

	@Id
	@Column(name = "SH06_ID_", length = 50, nullable = false)
	public String getSh06Id() {
		return sh06Id;
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

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	@Column(name = "AREACODE_", length = 20)
	public String getAreacode() {
		return areacode;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	@Column(name = "AREANAME_", length = 50)
	public String getAreaname() {
		return areaname;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "PARENT_ID_", length = 50)
	public String getParentId() {
		return parentId;
	}

	public void setIsuse(String isuse) {
		this.isuse = isuse;
	}

	@Column(name = "ISUSE_", length = 10)
	public String getIsuse() {
		return isuse;
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

	public void setEcode(String ecode) {
		this.ecode = ecode;
	}

	@Column(name = "ECODE_", length = 20)
	public String getEcode() {
		return ecode;
	}

	public String toString() {
		return "Tbsh06 [sh06Id=" + sh06Id + ",compId=" + compId + ",compCode="
				+ compCode + ",areacode=" + areacode + ",areaname=" + areaname
				+ ",parentId=" + parentId + ",isuse=" + isuse + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + ",ecode=" + ecode + "]";
	}

}

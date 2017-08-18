package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh01b:
 */
@Entity
@Table(name = "tbsh01b")
public class Tbsh01b implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh01bId;

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
	 * 到站编码:到站编码
	 */
	@PropertyDef(label = "到站编码", description = "到站编码:到站编码")
	private String stationcode;

	/**
	 * 专用线编码:专用线编码
	 */
	@PropertyDef(label = "专用线编码", description = "专用线编码:专用线编码")
	private String linecode;

	/**
	 * 专用线名称:专用线名称
	 */
	@PropertyDef(label = "专用线名称", description = "专用线名称:专用线名称")
	private String linename;

	/**
	 * 全称:全称
	 */
	@PropertyDef(label = "全称", description = "全称:全称")
	private String fullname;

	/**
	 * 简称:简称
	 */
	@PropertyDef(label = "简称", description = "简称:简称")
	private String shortname;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String transport;

	/**
	 * 仓库:仓库
	 */
	@PropertyDef(label = "仓库", description = "仓库:仓库")
	private String warehouse;

	/**
	 * 线路:线路
	 */
	@PropertyDef(label = "线路", description = "线路:线路")
	private String line;

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

	public Tbsh01b() {
		super();
	}

	public Tbsh01b(String sh01bId, String compId, String compCode,
			String stationcode, String linecode, String linename,
			String fullname, String shortname, String transport,
			String warehouse, String line, String status, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.sh01bId = sh01bId;
		this.compId = compId;
		this.compCode = compCode;
		this.stationcode = stationcode;
		this.linecode = linecode;
		this.linename = linename;
		this.fullname = fullname;
		this.shortname = shortname;
		this.transport = transport;
		this.warehouse = warehouse;
		this.line = line;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh01bId(String sh01bId) {
		this.sh01bId = sh01bId;
	}

	@Id
	@Column(name = "SH01B_ID_", length = 50, nullable = false)
	public String getSh01bId() {
		return sh01bId;
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

	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}

	@Column(name = "STATIONCODE_", length = 30)
	public String getStationcode() {
		return stationcode;
	}

	public void setLinecode(String linecode) {
		this.linecode = linecode;
	}

	@Column(name = "LINECODE_", length = 30)
	public String getLinecode() {
		return linecode;
	}

	public void setLinename(String linename) {
		this.linename = linename;
	}

	@Column(name = "LINENAME_", length = 200)
	public String getLinename() {
		return linename;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "FULLNAME_", length = 200)
	public String getFullname() {
		return fullname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	@Column(name = "SHORTNAME_", length = 200)
	public String getShortname() {
		return shortname;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	@Column(name = "TRANSPORT_", length = 10)
	public String getTransport() {
		return transport;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	@Column(name = "WAREHOUSE_", length = 10)
	public String getWarehouse() {
		return warehouse;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Column(name = "LINE_", length = 200)
	public String getLine() {
		return line;
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
		return "Tbsh01b [sh01bId=" + sh01bId + ",compId=" + compId
				+ ",compCode=" + compCode + ",stationcode=" + stationcode
				+ ",linecode=" + linecode + ",linename=" + linename
				+ ",fullname=" + fullname + ",shortname=" + shortname
				+ ",transport=" + transport + ",warehouse=" + warehouse
				+ ",line=" + line + ",status=" + status + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + "]";
	}

}

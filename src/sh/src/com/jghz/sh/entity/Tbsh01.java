package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh01:
 */
@Entity
@Table(name = "tbsh01")
public class Tbsh01 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh01Id;

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
	 * 拼音简称:拼音简称
	 */
	@PropertyDef(label = "拼音简称", description = "拼音简称:拼音简称")
	private String pyname;

	/**
	 * 到站名称:到站名称
	 */
	@PropertyDef(label = "到站名称", description = "到站名称:到站名称")
	private String stationname;

	/**
	 * 运输方式:运输方式
	 */
	@PropertyDef(label = "运输方式", description = "运输方式:运输方式")
	private String transport;

	/**
	 * 区域:区域
	 */
	@PropertyDef(label = "区域", description = "区域:区域")
	private String area;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 删除标记:删除标记
	 */
	@PropertyDef(label = "删除标记", description = "删除标记:删除标记")
	private String deleteFlag;

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

	public Tbsh01() {
		super();
	}

	public Tbsh01(String sh01Id, String compId, String compCode,
			String stationcode, String pyname, String stationname,
			String transport, String area, String status, String deleteFlag,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.sh01Id = sh01Id;
		this.compId = compId;
		this.compCode = compCode;
		this.stationcode = stationcode;
		this.pyname = pyname;
		this.stationname = stationname;
		this.transport = transport;
		this.area = area;
		this.status = status;
		this.deleteFlag = deleteFlag;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh01Id(String sh01Id) {
		this.sh01Id = sh01Id;
	}

	@Id
	@Column(name = "SH01_ID_", length = 50, nullable = false)
	public String getSh01Id() {
		return sh01Id;
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

	@Column(name = "STATIONCODE_", length = 10)
	public String getStationcode() {
		return stationcode;
	}

	public void setPyname(String pyname) {
		this.pyname = pyname;
	}

	@Column(name = "PYNAME_", length = 200)
	public String getPyname() {
		return pyname;
	}

	public void setStationname(String stationname) {
		this.stationname = stationname;
	}

	@Column(name = "STATIONNAME_", length = 200)
	public String getStationname() {
		return stationname;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	@Column(name = "TRANSPORT_", length = 50)
	public String getTransport() {
		return transport;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 50)
	public String getArea() {
		return area;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Column(name = "DELETE_FLAG_", length = 10)
	public String getDeleteFlag() {
		return deleteFlag;
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
		return "Tbsh01 [sh01Id=" + sh01Id + ",compId=" + compId + ",compCode="
				+ compCode + ",stationcode=" + stationcode + ",pyname="
				+ pyname + ",stationname=" + stationname + ",transport="
				+ transport + ",area=" + area + ",status=" + status
				+ ",deleteFlag=" + deleteFlag + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

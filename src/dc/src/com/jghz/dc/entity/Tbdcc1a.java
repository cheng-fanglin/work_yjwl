package com.jghz.dc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdcc1a:产品基础资料表
 */
@Entity
@Table(name = "tbdcc1a")
public class Tbdcc1a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 流水号:流水号
	 */
	@PropertyDef(label = "流水号", description = "流水号:流水号")
	private String dcc1aId;

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
	 * 物料编号:物料编号
	 */
	@PropertyDef(label = "物料编号", description = "物料编号:物料编号")
	private String id;

	/**
	 * 物料全称:物料全称
	 */
	@PropertyDef(label = "物料全称", description = "物料全称:物料全称")
	private String name;

	/**
	 * 物料简称:物料简称
	 */
	@PropertyDef(label = "物料简称", description = "物料简称:物料简称")
	private String shortName;

	/**
	 * 物料常用名:物料常用名
	 */
	@PropertyDef(label = "物料常用名", description = "物料常用名:物料常用名")
	private String printName;

	/**
	 * 搜索名:搜索名
	 */
	@PropertyDef(label = "搜索名", description = "搜索名:搜索名")
	private String searchName;

	/**
	 * 规格:规格
	 */
	@PropertyDef(label = "规格", description = "规格:规格")
	private String size;

	/**
	 * 型号:型号
	 */
	@PropertyDef(label = "型号", description = "型号:型号")
	private String model;

	/**
	 * 图号:图号
	 */
	@PropertyDef(label = "图号", description = "图号:图号")
	private String figureNum;

	/**
	 * 品牌:品牌
	 */
	@PropertyDef(label = "品牌", description = "品牌:品牌")
	private String brand;

	/**
	 * 计量单位:计量单位
	 */
	@PropertyDef(label = "计量单位", description = "计量单位:计量单位")
	private String pieces;

	/**
	 * 产地:产地
	 */
	@PropertyDef(label = "产地", description = "产地:产地")
	private String country;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String remarks;

	/**
	 * 状态(0=停用1=启用):状态(0=停用1=启用)
	 */
	@PropertyDef(label = "状态(0=停用1=启用)", description = "状态(0=停用1=启用):状态(0=停用1=启用)")
	private String status;

	/**
	 * 备用状态:备用状态
	 */
	@PropertyDef(label = "备用状态", description = "备用状态:备用状态")
	private String isFlag;

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

	public Tbdcc1a() {
		super();
	}

	public Tbdcc1a(String dcc1aId, String compId, String typeId,
			String typeName, String id, String name, String shortName,
			String printName, String searchName, String size, String model,
			String figureNum, String brand, String pieces, String country,
			String remarks, String status, String isFlag, String createEmp,
			Date createTime, String updateEmp, Date updateTime, int version) {
		super();
		this.dcc1aId = dcc1aId;
		this.compId = compId;
		this.typeId = typeId;
		this.typeName = typeName;
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		this.printName = printName;
		this.searchName = searchName;
		this.size = size;
		this.model = model;
		this.figureNum = figureNum;
		this.brand = brand;
		this.pieces = pieces;
		this.country = country;
		this.remarks = remarks;
		this.status = status;
		this.isFlag = isFlag;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.version = version;
	}

	public void setDcc1aId(String dcc1aId) {
		this.dcc1aId = dcc1aId;
	}

	@Id
	@Column(name = "DCC1A_ID_", length = 45, nullable = false)
	public String getDcc1aId() {
		return dcc1aId;
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

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "ID_", length = 20)
	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "NAME_", length = 50)
	public String getName() {
		return name;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "SHORT_NAME_", length = 50)
	public String getShortName() {
		return shortName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	@Column(name = "PRINT_NAME_", length = 50)
	public String getPrintName() {
		return printName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	@Column(name = "SEARCH_NAME_", length = 50)
	public String getSearchName() {
		return searchName;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SIZE_", length = 50)
	public String getSize() {
		return size;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "MODEL_", length = 50)
	public String getModel() {
		return model;
	}

	public void setFigureNum(String figureNum) {
		this.figureNum = figureNum;
	}

	@Column(name = "FIGURE_NUM_", length = 50)
	public String getFigureNum() {
		return figureNum;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "BRAND_", length = 50)
	public String getBrand() {
		return brand;
	}

	public void setPieces(String pieces) {
		this.pieces = pieces;
	}

	@Column(name = "PIECES_", length = 50)
	public String getPieces() {
		return pieces;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "COUNTRY_", length = 50)
	public String getCountry() {
		return country;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "REMARKS_", length = 500)
	public String getRemarks() {
		return remarks;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 4)
	public String getStatus() {
		return status;
	}

	public void setIsFlag(String isFlag) {
		this.isFlag = isFlag;
	}

	@Column(name = "IS_FLAG_", length = 4)
	public String getIsFlag() {
		return isFlag;
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
		return "Tbdcc1a [dcc1aId=" + dcc1aId + ",compId=" + compId + ",typeId="
				+ typeId + ",typeName=" + typeName + ",id=" + id + ",name="
				+ name + ",shortName=" + shortName + ",printName=" + printName
				+ ",searchName=" + searchName + ",size=" + size + ",model="
				+ model + ",figureNum=" + figureNum + ",brand=" + brand
				+ ",pieces=" + pieces + ",country=" + country + ",remarks="
				+ remarks + ",status=" + status + ",isFlag=" + isFlag
				+ ",createEmp=" + createEmp + ",createTime=" + createTime
				+ ",updateEmp=" + updateEmp + ",updateTime=" + updateTime
				+ ",version=" + version + "]";
	}

}

package com.jghz.dc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdctree:树型数据表-地区
 */
@Entity
@Table(name = "tbdctree")
public class Tbdctree implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String dctreeId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 父节点ID:父节点ID
	 */
	@PropertyDef(label = "父节点ID", description = "父节点ID:父节点ID")
	private String fatherId;

	/**
	 * 节点类型:节点类型
	 */
	@PropertyDef(label = "节点类型", description = "节点类型:节点类型")
	private String treeType;

	/**
	 * 节点编码:节点编码
	 */
	@PropertyDef(label = "节点编码", description = "节点编码:节点编码")
	private String treeNo;

	/**
	 * 节点编名称:节点编名称
	 */
	@PropertyDef(label = "节点编名称", description = "节点编名称:节点编名称")
	private String treeName;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String memo;

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
	 
	public Tbdctree() {
		super();
	}

	public Tbdctree(String dctreeId, String compId, String fatherId,
			String treeType, String treeNo, String treeName, String memo,
			String createEmp, Date createTime, String updateEmp,
			Date updateTime, String deleteFlag, int version) {
		super();
		this.dctreeId = dctreeId;
		this.compId = compId;
		this.fatherId = fatherId;
		this.treeType = treeType;
		this.treeNo = treeNo;
		this.treeName = treeName;
		this.memo = memo;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	public void setDctreeId(String dctreeId) {
		this.dctreeId = dctreeId;
	}

	@Id
	@Column(name = "DCTREE_ID_", length = 50, nullable = false)
	public String getDctreeId() {
		return dctreeId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

	@Column(name = "FATHER_ID_", length = 50)
	public String getFatherId() {
		return fatherId;
	}

	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}

	@Column(name = "TREE_TYPE_", length = 50)
	public String getTreeType() {
		return treeType;
	}

	public void setTreeNo(String treeNo) {
		this.treeNo = treeNo;
	}

	@Column(name = "TREE_NO_", length = 50)
	public String getTreeNo() {
		return treeNo;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	@Column(name = "TREE_NAME_", length = 200)
	public String getTreeName() {
		return treeName;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 200)
	public String getMemo() {
		return memo;
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
		return "Tbdctree [dctreeId=" + dctreeId + ",compId=" + compId
				+ ",fatherId=" + fatherId + ",treeType=" + treeType
				+ ",treeNo=" + treeNo + ",treeName=" + treeName + ",memo="
				+ memo + ",createEmp=" + createEmp + ",createTime="
				+ createTime + ",updateEmp=" + updateEmp + ",updateTime="
				+ updateTime + ",deleteFlag=" + deleteFlag + ",version="
				+ version + "]";
	}
	/**************逻辑关系*************/
	@Transient
	private List<Tbdctree> children;
	@Transient
	public List<Tbdctree> getChildren() {
		return children;
	}
	public void setChildren(List<Tbdctree> children) {
		this.children = children;
	}
}

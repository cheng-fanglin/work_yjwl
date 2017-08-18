package com.jghz.dc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbdca1a:公用代码档明细档
 */
@Entity
@Table(name = "tbdca1a")
public class Tbdca1a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统ID:系统ID
	 */
	@PropertyDef(label = "系统ID", description = "系统ID:系统ID")
	private String dca1aId;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 序号:序号
	 */
	@PropertyDef(label = "序号", description = "序号:序号")
	private String seqNo;

	/**
	 * 通用性代码主档ID:通用性代码主档ID
	 */
	@PropertyDef(label = "通用性代码主档ID", description = "通用性代码主档ID:通用性代码主档ID")
	private String dca1Id;

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
	 * 项次:项次
	 */
	@PropertyDef(label = "项次", description = "项次:项次")
	private String itemNo;

	/**
	 * 描述内容一:描述内容一
	 */
	@PropertyDef(label = "描述内容一", description = "描述内容一:描述内容一")
	private String despOne;

	/**
	 * 描述内容二:描述内容二
	 */
	@PropertyDef(label = "描述内容二", description = "描述内容二:描述内容二")
	private String despTwo;

	/**
	 * 描述内容三:描述内容三
	 */
	@PropertyDef(label = "描述内容三", description = "描述内容三:描述内容三")
	private String despThree;

	/**
	 * 描述内容四:描述内容四
	 */
	@PropertyDef(label = "描述内容四", description = "描述内容四:描述内容四")
	private String despFour;

	/**
	 * 描述内容五:描述内容五
	 */
	@PropertyDef(label = "描述内容五", description = "描述内容五:描述内容五")
	private String despFive;

	/**
	 * 描述内容六:描述内容六
	 */
	@PropertyDef(label = "描述内容六", description = "描述内容六:描述内容六")
	private String despSix;

	/**
	 * 说明:说明
	 */
	@PropertyDef(label = "说明", description = "说明:说明")
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
	@Version
	@PropertyDef(label = "版本号", description = "版本号:版本号")
	private int version;

	public Tbdca1a() {
		super();
	}

	public Tbdca1a(String dca1aId, String compId, String seqNo, String dca1Id,
			String sysType, String compTabCode, String itemNo, String despOne,
			String despTwo, String despThree, String despFour, String despFive,
			String despSix, String memo, String createEmp, Date createTime,
			String updateEmp, Date updateTime, String deleteFlag, int version) {
		super();
		this.dca1aId = dca1aId;
		this.compId = compId;
		this.seqNo = seqNo;
		this.dca1Id = dca1Id;
		this.sysType = sysType;
		this.compTabCode = compTabCode;
		this.itemNo = itemNo;
		this.despOne = despOne;
		this.despTwo = despTwo;
		this.despThree = despThree;
		this.despFour = despFour;
		this.despFive = despFive;
		this.despSix = despSix;
		this.memo = memo;
		this.createEmp = createEmp;
		this.createTime = createTime;
		this.updateEmp = updateEmp;
		this.updateTime = updateTime;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	public void setDca1aId(String dca1aId) {
		this.dca1aId = dca1aId;
	}

	@Id
	@Column(name = "DCA1A_ID_", length = 50, nullable = false)
	public String getDca1aId() {
		return dca1aId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	@Column(name = "SEQ_NO_", length = 5)
	public String getSeqNo() {
		return seqNo;
	}

	public void setDca1Id(String dca1Id) {
		this.dca1Id = dca1Id;
	}

	@Column(name = "DCA1_ID_", length = 50)
	public String getDca1Id() {
		return dca1Id;
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

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	@Column(name = "ITEM_NO_", length = 40, unique = true)
	public String getItemNo() {
		return itemNo;
	}

	public void setDespOne(String despOne) {
		this.despOne = despOne;
	}

	@Column(name = "DESP_ONE_", length = 40)
	public String getDespOne() {
		return despOne;
	}

	public void setDespTwo(String despTwo) {
		this.despTwo = despTwo;
	}

	@Column(name = "DESP_TWO_", length = 40)
	public String getDespTwo() {
		return despTwo;
	}

	public void setDespThree(String despThree) {
		this.despThree = despThree;
	}

	@Column(name = "DESP_THREE_", length = 40)
	public String getDespThree() {
		return despThree;
	}

	public void setDespFour(String despFour) {
		this.despFour = despFour;
	}

	@Column(name = "DESP_FOUR_", length = 40)
	public String getDespFour() {
		return despFour;
	}

	public void setDespFive(String despFive) {
		this.despFive = despFive;
	}

	@Column(name = "DESP_FIVE_", length = 40)
	public String getDespFive() {
		return despFive;
	}

	public void setDespSix(String despSix) {
		this.despSix = despSix;
	}

	@Column(name = "DESP_SIX_", length = 40)
	public String getDespSix() {
		return despSix;
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
		return "Tbdca1a [dca1aId=" + dca1aId + ",compId=" + compId + ",seqNo="
				+ seqNo + ",dca1Id=" + dca1Id + ",sysType=" + sysType
				+ ",compTabCode=" + compTabCode + ",itemNo=" + itemNo
				+ ",despOne=" + despOne + ",despTwo=" + despTwo + ",despThree="
				+ despThree + ",despFour=" + despFour + ",despFive=" + despFive
				+ ",despSix=" + despSix + ",memo=" + memo + ",createEmp="
				+ createEmp + ",createTime=" + createTime + ",updateEmp="
				+ updateEmp + ",updateTime=" + updateTime + ",deleteFlag="
				+ deleteFlag + ",version=" + version + "]";
	}

}

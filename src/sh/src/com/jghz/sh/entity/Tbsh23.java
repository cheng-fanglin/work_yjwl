package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh23:
 */
@Entity
@Table(name = "tbsh23")
public class Tbsh23 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh23Id;

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
	 * 发站编码:发站编码
	 */
	@PropertyDef(label = "发站编码", description = "发站编码:发站编码")
	private String stationcodeF;

	/**
	 * 发站专用线编码:发站专用线编码
	 */
	@PropertyDef(label = "发站专用线编码", description = "发站专用线编码:发站专用线编码")
	private String linecodeF;

	/**
	 * 发站专用线名称:发站专用线名称
	 */
	@PropertyDef(label = "发站专用线名称", description = "发站专用线名称:发站专用线名称")
	private String linenameF;

	/**
	 * 发站全称:发站全称
	 */
	@PropertyDef(label = "发站全称", description = "发站全称:发站全称")
	private String fullnameF;

	/**
	 * 发站简称:发站简称
	 */
	@PropertyDef(label = "发站简称", description = "发站简称:发站简称")
	private String shortnameF;

	/**
	 * 到站编码:到站编码
	 */
	@PropertyDef(label = "到站编码", description = "到站编码:到站编码")
	private String stationcodeD;

	/**
	 * 到站专用线编码:到站专用线编码
	 */
	@PropertyDef(label = "到站专用线编码", description = "到站专用线编码:到站专用线编码")
	private String linecodeD;

	/**
	 * 到站专用线名称:到站专用线名称
	 */
	@PropertyDef(label = "到站专用线名称", description = "到站专用线名称:到站专用线名称")
	private String linenameD;

	/**
	 * 到站全称:到站全称
	 */
	@PropertyDef(label = "到站全称", description = "到站全称:到站全称")
	private String fullnameD;

	/**
	 * 到站简称:到站简称
	 */
	@PropertyDef(label = "到站简称", description = "到站简称:到站简称")
	private String shortnameD;

	/**
	 * 车种:车种
	 */
	@PropertyDef(label = "车种", description = "车种:车种")
	private String trainType;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String trainNo;

	/**
	 * 货车标重:货车标重
	 */
	@PropertyDef(label = "货车标重", description = "货车标重:货车标重")
	private BigDecimal standardWgt;

	/**
	 * 货车施封号码:货车施封号码
	 */
	@PropertyDef(label = "货车施封号码", description = "货车施封号码:货车施封号码")
	private String closeNo;

	/**
	 * 货车篷布号码:货车篷布号码
	 */
	@PropertyDef(label = "货车篷布号码", description = "货车篷布号码:货车篷布号码")
	private String panlinNo;

	/**
	 * 服务类别:服务类别
	 */
	@PropertyDef(label = "服务类别", description = "服务类别:服务类别")
	private String severType;

	/**
	 * 保价运输:保价运输
	 */
	@PropertyDef(label = "保价运输", description = "保价运输:保价运输")
	private String supportValue;

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

	public Tbsh23() {
		super();
	}

	public Tbsh23(String sh23Id, String compId, String compCode,
			String stationcodeF, String linecodeF, String linenameF,
			String fullnameF, String shortnameF, String stationcodeD,
			String linecodeD, String linenameD, String fullnameD,
			String shortnameD, String trainType, String trainNo,
			BigDecimal standardWgt, String closeNo, String panlinNo,
			String severType, String supportValue, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.sh23Id = sh23Id;
		this.compId = compId;
		this.compCode = compCode;
		this.stationcodeF = stationcodeF;
		this.linecodeF = linecodeF;
		this.linenameF = linenameF;
		this.fullnameF = fullnameF;
		this.shortnameF = shortnameF;
		this.stationcodeD = stationcodeD;
		this.linecodeD = linecodeD;
		this.linenameD = linenameD;
		this.fullnameD = fullnameD;
		this.shortnameD = shortnameD;
		this.trainType = trainType;
		this.trainNo = trainNo;
		this.standardWgt = standardWgt;
		this.closeNo = closeNo;
		this.panlinNo = panlinNo;
		this.severType = severType;
		this.supportValue = supportValue;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh23Id(String sh23Id) {
		this.sh23Id = sh23Id;
	}

	@Id
	@Column(name = "SH23_ID_", length = 50, nullable = false)
	public String getSh23Id() {
		return sh23Id;
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

	public void setStationcodeF(String stationcodeF) {
		this.stationcodeF = stationcodeF;
	}

	@Column(name = "STATIONCODE_F_", length = 50)
	public String getStationcodeF() {
		return stationcodeF;
	}

	public void setLinecodeF(String linecodeF) {
		this.linecodeF = linecodeF;
	}

	@Column(name = "LINECODE_F_", length = 50)
	public String getLinecodeF() {
		return linecodeF;
	}

	public void setLinenameF(String linenameF) {
		this.linenameF = linenameF;
	}

	@Column(name = "LINENAME_F_", length = 200)
	public String getLinenameF() {
		return linenameF;
	}

	public void setFullnameF(String fullnameF) {
		this.fullnameF = fullnameF;
	}

	@Column(name = "FULLNAME_F_", length = 200)
	public String getFullnameF() {
		return fullnameF;
	}

	public void setShortnameF(String shortnameF) {
		this.shortnameF = shortnameF;
	}

	@Column(name = "SHORTNAME_F_", length = 200)
	public String getShortnameF() {
		return shortnameF;
	}

	public void setStationcodeD(String stationcodeD) {
		this.stationcodeD = stationcodeD;
	}

	@Column(name = "STATIONCODE_D_", length = 50)
	public String getStationcodeD() {
		return stationcodeD;
	}

	public void setLinecodeD(String linecodeD) {
		this.linecodeD = linecodeD;
	}

	@Column(name = "LINECODE_D_", length = 50)
	public String getLinecodeD() {
		return linecodeD;
	}

	public void setLinenameD(String linenameD) {
		this.linenameD = linenameD;
	}

	@Column(name = "LINENAME_D_", length = 200)
	public String getLinenameD() {
		return linenameD;
	}

	public void setFullnameD(String fullnameD) {
		this.fullnameD = fullnameD;
	}

	@Column(name = "FULLNAME_D_", length = 200)
	public String getFullnameD() {
		return fullnameD;
	}

	public void setShortnameD(String shortnameD) {
		this.shortnameD = shortnameD;
	}

	@Column(name = "SHORTNAME_D_", length = 200)
	public String getShortnameD() {
		return shortnameD;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	@Column(name = "TRAIN_TYPE_", length = 10)
	public String getTrainType() {
		return trainType;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	@Column(name = "TRAIN_NO_", length = 10)
	public String getTrainNo() {
		return trainNo;
	}

	public void setStandardWgt(BigDecimal standardWgt) {
		this.standardWgt = standardWgt;
	}

	@Column(name = "STANDARD_WGT_")
	public BigDecimal getStandardWgt() {
		return standardWgt;
	}

	public void setCloseNo(String closeNo) {
		this.closeNo = closeNo;
	}

	@Column(name = "CLOSE_NO_", length = 50)
	public String getCloseNo() {
		return closeNo;
	}

	public void setPanlinNo(String panlinNo) {
		this.panlinNo = panlinNo;
	}

	@Column(name = "PANLIN_NO_", length = 50)
	public String getPanlinNo() {
		return panlinNo;
	}

	public void setSeverType(String severType) {
		this.severType = severType;
	}

	@Column(name = "SEVER_TYPE_", length = 10)
	public String getSeverType() {
		return severType;
	}

	public void setSupportValue(String supportValue) {
		this.supportValue = supportValue;
	}

	@Column(name = "SUPPORT_VALUE_", length = 10)
	public String getSupportValue() {
		return supportValue;
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
		return "Tbsh23 [sh23Id=" + sh23Id + ",compId=" + compId + ",compCode="
				+ compCode + ",stationcodeF=" + stationcodeF + ",linecodeF="
				+ linecodeF + ",linenameF=" + linenameF + ",fullnameF="
				+ fullnameF + ",shortnameF=" + shortnameF + ",stationcodeD="
				+ stationcodeD + ",linecodeD=" + linecodeD + ",linenameD="
				+ linenameD + ",fullnameD=" + fullnameD + ",shortnameD="
				+ shortnameD + ",trainType=" + trainType + ",trainNo="
				+ trainNo + ",standardWgt=" + standardWgt + ",closeNo="
				+ closeNo + ",panlinNo=" + panlinNo + ",severType=" + severType
				+ ",supportValue=" + supportValue + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

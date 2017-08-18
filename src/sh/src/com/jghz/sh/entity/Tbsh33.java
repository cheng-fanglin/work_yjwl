package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh33:运输杂项报支
 */
@Entity
@Table(name = "tbsh33")
public class Tbsh33 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String sh33Id;

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
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

	/**
	 * 业务类别:业务类别
	 */
	@PropertyDef(label = "业务类别", description = "业务类别:业务类别")
	private String type;

	/**
	 * 付款金额:付款金额
	 */
	@PropertyDef(label = "付款金额", description = "付款金额:付款金额")
	private BigDecimal payAmt;

	/**
	 * 客户编号:客户编号
	 */
	@PropertyDef(label = "客户编号", description = "客户编号:客户编号")
	private String custNo;

	/**
	 * 客户名称:客户名称
	 */
	@PropertyDef(label = "客户名称", description = "客户名称:客户名称")
	private String custName;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

	/**
	 * 发票号:发票号
	 */
	@PropertyDef(label = "发票号", description = "发票号:发票号")
	private String billNo;

	/**
	 * 发票吨位:发票吨位
	 */
	@PropertyDef(label = "发票吨位", description = "发票吨位:发票吨位")
	private BigDecimal wgt;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String memo;

	/**
	 * 发票日期:发票日期
	 */
	@PropertyDef(label = "发票日期", description = "发票日期:发票日期")
	private String billDate;

	/**
	 * 图片上传:图片上传
	 */
	@PropertyDef(label = "图片上传", description = "图片上传:图片上传")
	private String upload;

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
	 * 收款人:收款人
	 */
	@PropertyDef(label = "收款人", description = "收款人:收款人")
	private String payer;

	public Tbsh33() {
		super();
	}

	public Tbsh33(String sh33Id, String compId, String compCode,
			String transNo, String type, BigDecimal payAmt, String custNo,
			String custName, String status, String billNo, BigDecimal wgt,
			String memo, String billDate, String upload, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version,
			String payer) {
		super();
		this.sh33Id = sh33Id;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.type = type;
		this.payAmt = payAmt;
		this.custNo = custNo;
		this.custName = custName;
		this.status = status;
		this.billNo = billNo;
		this.wgt = wgt;
		this.memo = memo;
		this.billDate = billDate;
		this.upload = upload;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.payer = payer;
	}

	public void setSh33Id(String sh33Id) {
		this.sh33Id = sh33Id;
	}

	@Id
	@Column(name = "SH33_ID_", length = 50, nullable = false)
	public String getSh33Id() {
		return sh33Id;
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

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 100)
	public String getTransNo() {
		return transNo;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "TYPE_", length = 10)
	public String getType() {
		return type;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}

	@Column(name = "PAY_AMT_")
	public BigDecimal getPayAmt() {
		return payAmt;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 10)
	public String getCustNo() {
		return custNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CUST_NAME_", length = 50)
	public String getCustName() {
		return custName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILL_NO_", length = 20)
	public String getBillNo() {
		return billNo;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	@Column(name = "WGT_")
	public BigDecimal getWgt() {
		return wgt;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 200)
	public String getMemo() {
		return memo;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	@Column(name = "BILL_DATE_", length = 20)
	public String getBillDate() {
		return billDate;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	@Column(name = "UPLOAD_", length = 50)
	public String getUpload() {
		return upload;
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

	public void setPayer(String payer) {
		this.payer = payer;
	}

	@Column(name = "PAYER_", length = 20)
	public String getPayer() {
		return payer;
	}

	public String toString() {
		return "Tbsh33 [sh33Id=" + sh33Id + ",compId=" + compId + ",compCode="
				+ compCode + ",transNo=" + transNo + ",type=" + type
				+ ",payAmt=" + payAmt + ",custNo=" + custNo + ",custName="
				+ custName + ",status=" + status + ",billNo=" + billNo
				+ ",wgt=" + wgt + ",memo=" + memo + ",billDate=" + billDate
				+ ",upload=" + upload + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version
				+ ",payer=" + payer + "]";
	}

}

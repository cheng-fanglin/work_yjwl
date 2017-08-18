package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih21a:
 */
@Entity
@Table(name = "tbih21a")
public class Tbih21a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * IH21A_ID_:
	 */
	@PropertyDef(label = "IH21A_ID_", description = "IH21A_ID_:")
	private String ih21aId;

	/**
	 * COMP_ID_:
	 */
	@PropertyDef(label = "COMP_ID_", description = "COMP_ID_:")
	private String compId;

	/**
	 * CREATE_DATE_:
	 */
	@PropertyDef(label = "CREATE_DATE_", description = "CREATE_DATE_:")
	private Date createDate;

	/**
	 * CREATE_EMP_:
	 */
	@PropertyDef(label = "CREATE_EMP_", description = "CREATE_EMP_:")
	private String createEmp;

	/**
	 * FQR_:
	 */
	@PropertyDef(label = "FQR_", description = "FQR_:")
	private String fqr;

	/**
	 * IH21_ID_:
	 */
	@PropertyDef(label = "IH21_ID_", description = "IH21_ID_:")
	private String ih21Id;

	/**
	 * QZ_:
	 */
	@PropertyDef(label = "QZ_", description = "QZ_:")
	private String qz;

	/**
	 * SP_DATE:
	 */
	@PropertyDef(label = "SP_DATE", description = "SP_DATE:")
	private String spDate;

	/**
	 * SP_DEPT_:
	 */
	@PropertyDef(label = "SP_DEPT_", description = "SP_DEPT_:")
	private String spDept;

	/**
	 * SP_EMP_:
	 */
	@PropertyDef(label = "SP_EMP_", description = "SP_EMP_:")
	private String spEmp;

	/**
	 * SP_MEMO_:
	 */
	@PropertyDef(label = "SP_MEMO_", description = "SP_MEMO_:")
	private String spMemo;

	/**
	 * STATUS_:
	 */
	@PropertyDef(label = "STATUS_", description = "STATUS_:")
	private String status;

	/**
	 * UPDATE_DATE_:
	 */
	@PropertyDef(label = "UPDATE_DATE_", description = "UPDATE_DATE_:")
	private Date updateDate;

	/**
	 * UPDATE_EMP_:
	 */
	@PropertyDef(label = "UPDATE_EMP_", description = "UPDATE_EMP_:")
	private String updateEmp;

	/**
	 * VERSION:
	 */
	@PropertyDef(label = "VERSION", description = "VERSION:")
	private int version;

	public Tbih21a() {
		super();
	}

	public Tbih21a(String ih21aId, String compId, Date createDate,
			String createEmp, String fqr, String ih21Id, String qz,
			String spDate, String spDept, String spEmp, String spMemo,
			String status, Date updateDate, String updateEmp, int version) {
		super();
		this.ih21aId = ih21aId;
		this.compId = compId;
		this.createDate = createDate;
		this.createEmp = createEmp;
		this.fqr = fqr;
		this.ih21Id = ih21Id;
		this.qz = qz;
		this.spDate = spDate;
		this.spDept = spDept;
		this.spEmp = spEmp;
		this.spMemo = spMemo;
		this.status = status;
		this.updateDate = updateDate;
		this.updateEmp = updateEmp;
		this.version = version;
	}

	public void setIh21aId(String ih21aId) {
		this.ih21aId = ih21aId;
	}

	@Id
	@Column(name = "IH21A_ID_", length = 50, nullable = false)
	public String getIh21aId() {
		return ih21aId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10)
	public String getCompId() {
		return compId;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE_")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 50)
	public String getCreateEmp() {
		return createEmp;
	}

	public void setFqr(String fqr) {
		this.fqr = fqr;
	}

	@Column(name = "FQR_", length = 50)
	public String getFqr() {
		return fqr;
	}

	public void setIh21Id(String ih21Id) {
		this.ih21Id = ih21Id;
	}

	@Column(name = "IH21_ID_", length = 50)
	public String getIh21Id() {
		return ih21Id;
	}

	public void setQz(String qz) {
		this.qz = qz;
	}

	@Column(name = "QZ_", length = 20)
	public String getQz() {
		return qz;
	}

	public void setSpDate(String spDate) {
		this.spDate = spDate;
	}

	@Column(name = "SP_DATE", length = 20)
	public String getSpDate() {
		return spDate;
	}

	public void setSpDept(String spDept) {
		this.spDept = spDept;
	}

	@Column(name = "SP_DEPT_", length = 50)
	public String getSpDept() {
		return spDept;
	}

	public void setSpEmp(String spEmp) {
		this.spEmp = spEmp;
	}

	@Column(name = "SP_EMP_", length = 50)
	public String getSpEmp() {
		return spEmp;
	}

	public void setSpMemo(String spMemo) {
		this.spMemo = spMemo;
	}

	@Column(name = "SP_MEMO_", length = 200)
	public String getSpMemo() {
		return spMemo;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 5)
	public String getStatus() {
		return status;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE_")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	@Column(name = "UPDATE_EMP_", length = 50)
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
		return "Tbih21a [ih21aId=" + ih21aId + ",compId=" + compId
				+ ",createDate=" + createDate + ",createEmp=" + createEmp
				+ ",fqr=" + fqr + ",ih21Id=" + ih21Id + ",qz=" + qz
				+ ",spDate=" + spDate + ",spDept=" + spDept + ",spEmp=" + spEmp
				+ ",spMemo=" + spMemo + ",status=" + status + ",updateDate="
				+ updateDate + ",updateEmp=" + updateEmp + ",version="
				+ version + "]";
	}

}

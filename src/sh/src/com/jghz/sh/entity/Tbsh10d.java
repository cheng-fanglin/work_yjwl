package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh10d:
 */
@Entity
@Table(name = "tbsh10d")
public class Tbsh10d implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh10dId;

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
	 * 南钢订单号:南钢订单号
	 */
	@PropertyDef(label = "南钢订单号", description = "南钢订单号:南钢订单号")
	private String orderNoNj;

	/**
	 * 南钢订单总量:南钢订单总量
	 */
	@PropertyDef(label = "南钢订单总量", description = "南钢订单总量:南钢订单总量")
	private BigDecimal orderWgt;

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

	public Tbsh10d() {
		super();
	}

	public Tbsh10d(String sh10dId, String compId, String compCode,
			String transNo, String orderNoNj, BigDecimal orderWgt,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.sh10dId = sh10dId;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.orderNoNj = orderNoNj;
		this.orderWgt = orderWgt;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh10dId(String sh10dId) {
		this.sh10dId = sh10dId;
	}

	@Id
	@Column(name = "SH10D_ID_", length = 50, nullable = false)
	public String getSh10dId() {
		return sh10dId;
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

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
	}

	public void setOrderNoNj(String orderNoNj) {
		this.orderNoNj = orderNoNj;
	}

	@Column(name = "ORDER_NO_NJ_", length = 20)
	public String getOrderNoNj() {
		return orderNoNj;
	}

	public void setOrderWgt(BigDecimal orderWgt) {
		this.orderWgt = orderWgt;
	}

	@Column(name = "ORDER_WGT_")
	public BigDecimal getOrderWgt() {
		return orderWgt;
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
		return "Tbsh10d [sh10dId=" + sh10dId + ",compId=" + compId
				+ ",compCode=" + compCode + ",transNo=" + transNo
				+ ",orderNoNj=" + orderNoNj + ",orderWgt=" + orderWgt
				+ ",createEmp=" + createEmp + ",createDate=" + createDate
				+ ",updateEmp=" + updateEmp + ",updateDate=" + updateDate
				+ ",version=" + version + "]";
	}

}

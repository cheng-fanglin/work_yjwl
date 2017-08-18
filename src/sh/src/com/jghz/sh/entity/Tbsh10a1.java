package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh10a1:
 */
@Entity
@Table(name = "tbsh10a1")
public class Tbsh10a1 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID:主键ID
	 */
	@PropertyDef(label = "主键ID", description = "主键ID:主键ID")
	private String sh10a1Id;

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
	 * 运单项次号:运单项次号
	 */
	@PropertyDef(label = "运单项次号", description = "运单项次号:运单项次号")
	private String transItem;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

	/**
	 * 司机手机:司机手机
	 */
	@PropertyDef(label = "司机手机", description = "司机手机:司机手机")
	private String phoneNo;

	/**
	 * 司机姓名:司机姓名
	 */
	@PropertyDef(label = "司机姓名", description = "司机姓名:司机姓名")
	private String userName;

	/**
	 * 产品大类:产品大类
	 */
	@PropertyDef(label = "产品大类", description = "产品大类:产品大类")
	private String prodType;

	/**
	 * 产品大类名称:产品大类名称
	 */
	@PropertyDef(label = "产品大类名称", description = "产品大类名称:产品大类名称")
	private String prodTypeName;

	/**
	 * 货物编号:货物编号
	 */
	@PropertyDef(label = "货物编号", description = "货物编号:货物编号")
	private String productNo;

	/**
	 * 货物名称:货物名称
	 */
	@PropertyDef(label = "货物名称", description = "货物名称:货物名称")
	private String productName;

	/**
	 * 产品型号:产品型号
	 */
	@PropertyDef(label = "产品型号", description = "产品型号:产品型号")
	private String model;

	/**
	 * 高度:高度
	 */
	@PropertyDef(label = "高度", description = "高度:高度")
	private BigDecimal height;

	/**
	 * 宽度:宽度
	 */
	@PropertyDef(label = "宽度", description = "宽度:宽度")
	private BigDecimal width;

	/**
	 * 长度:长度
	 */
	@PropertyDef(label = "长度", description = "长度:长度")
	private BigDecimal length;

	/**
	 * 规格:规格
	 */
	@PropertyDef(label = "规格", description = "规格:规格")
	private String spec;

	/**
	 * 标签号:标签号
	 */
	@PropertyDef(label = "标签号", description = "标签号:标签号")
	private String labelNo;

	/**
	 * 载重:载重
	 */
	@PropertyDef(label = "载重", description = "载重:载重")
	private BigDecimal weight;

	/**
	 * 件数:件数
	 */
	@PropertyDef(label = "件数", description = "件数:件数")
	private BigDecimal num;

	/**
	 * 批号:批号
	 */
	@PropertyDef(label = "批号", description = "批号:批号")
	private String batchNo;

	/**
	 * 南钢装车单号:南钢装车单号
	 */
	@PropertyDef(label = "南钢装车单号", description = "南钢装车单号:南钢装车单号")
	private String loadingNoNg;

	/**
	 * 南钢订单号:南钢订单号
	 */
	@PropertyDef(label = "南钢订单号", description = "南钢订单号:南钢订单号")
	private String orderNoNg;

	/**
	 * 南钢订单项次:南钢订单项次
	 */
	@PropertyDef(label = "南钢订单项次", description = "南钢订单项次:南钢订单项次")
	private String orderItemNg;

	/**
	 * 南钢发货通知单:南钢发货通知单
	 */
	@PropertyDef(label = "南钢发货通知单", description = "南钢发货通知单:南钢发货通知单")
	private String laddingNoNg;

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

	public Tbsh10a1() {
		super();
	}

	public Tbsh10a1(String sh10a1Id, String compId, String compCode,
			String transNo, String transItem, String carNo, String phoneNo,
			String userName, String prodType, String prodTypeName,
			String productNo, String productName, String model,
			BigDecimal height, BigDecimal width, BigDecimal length,
			String spec, String labelNo, BigDecimal weight, BigDecimal num,
			String batchNo, String loadingNoNg, String orderNoNg,
			String orderItemNg, String laddingNoNg, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.sh10a1Id = sh10a1Id;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.transItem = transItem;
		this.carNo = carNo;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.model = model;
		this.height = height;
		this.width = width;
		this.length = length;
		this.spec = spec;
		this.labelNo = labelNo;
		this.weight = weight;
		this.num = num;
		this.batchNo = batchNo;
		this.loadingNoNg = loadingNoNg;
		this.orderNoNg = orderNoNg;
		this.orderItemNg = orderItemNg;
		this.laddingNoNg = laddingNoNg;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setSh10a1Id(String sh10a1Id) {
		this.sh10a1Id = sh10a1Id;
	}

	@Id
	@Column(name = "SH10A1_ID_", length = 50, nullable = false)
	public String getSh10a1Id() {
		return sh10a1Id;
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

	public void setTransItem(String transItem) {
		this.transItem = transItem;
	}

	@Column(name = "TRANS_ITEM_", length = 20)
	public String getTransItem() {
		return transItem;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_", length = 20)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_NAME_", length = 20)
	public String getUserName() {
		return userName;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	@Column(name = "PROD_TYPE_", length = 20)
	public String getProdType() {
		return prodType;
	}

	public void setProdTypeName(String prodTypeName) {
		this.prodTypeName = prodTypeName;
	}

	@Column(name = "PROD_TYPE_NAME_", length = 50)
	public String getProdTypeName() {
		return prodTypeName;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	@Column(name = "PRODUCT_NO_", length = 20)
	public String getProductNo() {
		return productNo;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_NAME_", length = 50)
	public String getProductName() {
		return productName;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "MODEL", length = 20)
	public String getModel() {
		return model;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	@Column(name = "HEIGHT_")
	public BigDecimal getHeight() {
		return height;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	@Column(name = "WIDTH_")
	public BigDecimal getWidth() {
		return width;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	@Column(name = "LENGTH_")
	public BigDecimal getLength() {
		return length;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	@Column(name = "SPEC_", length = 200)
	public String getSpec() {
		return spec;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}

	@Column(name = "LABEL_NO_", length = 50)
	public String getLabelNo() {
		return labelNo;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "WEIGHT_")
	public BigDecimal getWeight() {
		return weight;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "NUM_")
	public BigDecimal getNum() {
		return num;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	@Column(name = "BATCH_NO_", length = 20)
	public String getBatchNo() {
		return batchNo;
	}

	public void setLoadingNoNg(String loadingNoNg) {
		this.loadingNoNg = loadingNoNg;
	}

	@Column(name = "LOADING_NO_NG_", length = 20)
	public String getLoadingNoNg() {
		return loadingNoNg;
	}

	public void setOrderNoNg(String orderNoNg) {
		this.orderNoNg = orderNoNg;
	}

	@Column(name = "ORDER_NO_NG_", length = 20)
	public String getOrderNoNg() {
		return orderNoNg;
	}

	public void setOrderItemNg(String orderItemNg) {
		this.orderItemNg = orderItemNg;
	}

	@Column(name = "ORDER_ITEM_NG_", length = 20)
	public String getOrderItemNg() {
		return orderItemNg;
	}

	public void setLaddingNoNg(String laddingNoNg) {
		this.laddingNoNg = laddingNoNg;
	}

	@Column(name = "LADDING_NO_NG_", length = 20)
	public String getLaddingNoNg() {
		return laddingNoNg;
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
		return "Tbsh10a1 [sh10a1Id=" + sh10a1Id + ",compId=" + compId
				+ ",compCode=" + compCode + ",transNo=" + transNo
				+ ",transItem=" + transItem + ",carNo=" + carNo + ",phoneNo="
				+ phoneNo + ",userName=" + userName + ",prodType=" + prodType
				+ ",prodTypeName=" + prodTypeName + ",productNo=" + productNo
				+ ",productName=" + productName + ",model=" + model
				+ ",height=" + height + ",width=" + width + ",length=" + length
				+ ",spec=" + spec + ",labelNo=" + labelNo + ",weight=" + weight
				+ ",num=" + num + ",batchNo=" + batchNo + ",loadingNoNg="
				+ loadingNoNg + ",orderNoNg=" + orderNoNg + ",orderItemNg="
				+ orderItemNg + ",laddingNoNg=" + laddingNoNg + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + "]";
	}

}

package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh22a:水运车载表
 */
@Entity
@Table(name = "tbsh22a")
public class Tbsh22a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String tbsh22aId;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String tbsh22Id;

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
	 * 水单号:水单号
	 */
	@PropertyDef(label = "水单号", description = "水单号:水单号")
	private String shipListNo;

	/**
	 * 航次:航次
	 */
	@PropertyDef(label = "航次", description = "航次:航次")
	private String hc;

	/**
	 * 运输公司:运输公司
	 */
	@PropertyDef(label = "运输公司", description = "运输公司:运输公司")
	private String carrierNo;

	/**
	 * 承运商名称:承运商名称
	 */
	@PropertyDef(label = "承运商名称", description = "承运商名称:承运商名称")
	private String carrierName;

	/**
	 * 运单项次号:运单项次号
	 */
	@PropertyDef(label = "运单项次号", description = "运单项次号:运单项次号")
	private String transItem;

	/**
	 * 船名:船名
	 */
	@PropertyDef(label = "船名", description = "船名:船名")
	private String shipNo;

	/**
	 * 车号:车号
	 */
	@PropertyDef(label = "车号", description = "车号:车号")
	private String carNo;

	/**
	 * 挂车号:挂车号
	 */
	@PropertyDef(label = "挂车号", description = "挂车号:挂车号")
	private String trailerNo;

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
	 * 载重:载重
	 */
	@PropertyDef(label = "载重", description = "载重:载重")
	private BigDecimal weight;

	/**
	 * 件数:件数
	 */
	@PropertyDef(label = "件数", description = "件数:件数")
	private BigDecimal number;

	/**
	 * 回执号:回执号
	 */
	@PropertyDef(label = "回执号", description = "回执号:回执号")
	private String receiptNo;

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

	public Tbsh22a() {
		super();
	}

	public Tbsh22a(String tbsh22aId, String tbsh22Id, String compId,
			String compCode, String transNo, String shipListNo, String hc,
			String carrierNo, String carrierName, String transItem,
			String shipNo, String carNo, String trailerNo, String phoneNo,
			String userName, BigDecimal weight, BigDecimal number,
			String receiptNo, String loadingNoNg, String orderNoNg,
			String orderItemNg, String laddingNoNg, String createEmp,
			Date createDate, String updateEmp, Date updateDate, int version) {
		super();
		this.tbsh22aId = tbsh22aId;
		this.tbsh22Id = tbsh22Id;
		this.compId = compId;
		this.compCode = compCode;
		this.transNo = transNo;
		this.shipListNo = shipListNo;
		this.hc = hc;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.transItem = transItem;
		this.shipNo = shipNo;
		this.carNo = carNo;
		this.trailerNo = trailerNo;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.weight = weight;
		this.number = number;
		this.receiptNo = receiptNo;
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

	public void setTbsh22aId(String tbsh22aId) {
		this.tbsh22aId = tbsh22aId;
	}

	@Id
	@Column(name = "TBSH22A_ID_", length = 50, nullable = false)
	public String getTbsh22aId() {
		return tbsh22aId;
	}

	public void setTbsh22Id(String tbsh22Id) {
		this.tbsh22Id = tbsh22Id;
	}

	@Column(name = "TBSH22_ID_", length = 50, nullable = false)
	public String getTbsh22Id() {
		return tbsh22Id;
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

	public void setShipListNo(String shipListNo) {
		this.shipListNo = shipListNo;
	}

	@Column(name = "SHIP_LIST_NO_", length = 20)
	public String getShipListNo() {
		return shipListNo;
	}

	public void setHc(String hc) {
		this.hc = hc;
	}

	@Column(name = "HC_", length = 20)
	public String getHc() {
		return hc;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	@Column(name = "CARRIER_NO_", length = 50)
	public String getCarrierNo() {
		return carrierNo;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	@Column(name = "CARRIER_NAME_", length = 50)
	public String getCarrierName() {
		return carrierName;
	}

	public void setTransItem(String transItem) {
		this.transItem = transItem;
	}

	@Column(name = "TRANS_ITEM_", length = 20)
	public String getTransItem() {
		return transItem;
	}

	public void setShipNo(String shipNo) {
		this.shipNo = shipNo;
	}

	@Column(name = "SHIP_NO_", length = 20)
	public String getShipNo() {
		return shipNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Column(name = "CAR_NO_", length = 20)
	public String getCarNo() {
		return carNo;
	}

	public void setTrailerNo(String trailerNo) {
		this.trailerNo = trailerNo;
	}

	@Column(name = "TRAILER_NO_", length = 20)
	public String getTrailerNo() {
		return trailerNo;
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

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "WEIGHT_")
	public BigDecimal getWeight() {
		return weight;
	}

	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	@Column(name = "NUMBER_")
	public BigDecimal getNumber() {
		return number;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	@Column(name = "RECEIPT_NO_", length = 20)
	public String getReceiptNo() {
		return receiptNo;
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
		return "Tbsh22a [tbsh22aId=" + tbsh22aId + ",tbsh22Id=" + tbsh22Id
				+ ",compId=" + compId + ",compCode=" + compCode + ",transNo="
				+ transNo + ",shipListNo=" + shipListNo + ",hc=" + hc
				+ ",carrierNo=" + carrierNo + ",carrierName=" + carrierName
				+ ",transItem=" + transItem + ",shipNo=" + shipNo + ",carNo="
				+ carNo + ",trailerNo=" + trailerNo + ",phoneNo=" + phoneNo
				+ ",userName=" + userName + ",weight=" + weight + ",number="
				+ number + ",receiptNo=" + receiptNo + ",loadingNoNg="
				+ loadingNoNg + ",orderNoNg=" + orderNoNg + ",orderItemNg="
				+ orderItemNg + ",laddingNoNg=" + laddingNoNg + ",createEmp="
				+ createEmp + ",createDate=" + createDate + ",updateEmp="
				+ updateEmp + ",updateDate=" + updateDate + ",version="
				+ version + "]";
	}

}

package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh22:
 */
@Entity
@Table(name = "tbsh22")
public class Tbsh22 implements Serializable {

	private static final long serialVersionUID = 1L;

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
	 * 航次:航次
	 */
	@PropertyDef(label = "航次", description = "航次:航次")
	private String hc;

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
	 * 船名:船名
	 */
	@PropertyDef(label = "船名", description = "船名:船名")
	private String shipNo;

	/**
	 * 船长电话:船长电话
	 */
	@PropertyDef(label = "船长电话", description = "船长电话:船长电话")
	private String phoneNo;

	/**
	 * 原始可载量:原始可载量
	 */
	@PropertyDef(label = "原始可载量", description = "原始可载量:原始可载量")
	private BigDecimal ysKzl;

	/**
	 * 现有可载量:现有可载量
	 */
	@PropertyDef(label = "现有可载量", description = "现有可载量:现有可载量")
	private BigDecimal xyKzl;

	/**
	 * 载货量:载货量
	 */
	@PropertyDef(label = "载货量", description = "载货量:载货量")
	private BigDecimal shipWgt;

	/**
	 * 车载总辆:车载总辆
	 */
	@PropertyDef(label = "车载总辆", description = "车载总辆:车载总辆")
	private BigDecimal carWgt;

	/**
	 * 装车时间:装车时间
	 */
	@PropertyDef(label = "装车时间", description = "装车时间:装车时间")
	private String loadTime;

	/**
	 * 装车天数:装车天数
	 */
	@PropertyDef(label = "装车天数", description = "装车天数:装车天数")
	private BigDecimal loadDay;

	/**
	 * 运输天数:运输天数
	 */
	@PropertyDef(label = "运输天数", description = "运输天数:运输天数")
	private BigDecimal transDay;

	/**
	 * 短泊费用:短泊费用
	 */
	@PropertyDef(label = "短泊费用", description = "短泊费用:短泊费用")
	private BigDecimal drayageFee;

	/**
	 * 吊装费:吊装费
	 */
	@PropertyDef(label = "吊装费", description = "吊装费:吊装费")
	private BigDecimal liftsFee;

	/**
	 * 港建费:港建费
	 */
	@PropertyDef(label = "港建费", description = "港建费:港建费")
	private BigDecimal portConsFee;

	/**
	 * 滞港费:滞港费
	 */
	@PropertyDef(label = "滞港费", description = "滞港费:滞港费")
	private BigDecimal demurageFee;

	/**
	 * 船运回单量:船运回单量
	 */
	@PropertyDef(label = "船运回单量", description = "船运回单量:船运回单量")
	private BigDecimal backShipWgt;

	/**
	 * 单价:单价
	 */
	@PropertyDef(label = "单价", description = "单价:单价")
	private BigDecimal apUnitPrice;

	/**
	 * 流向1:流向1
	 */
	@PropertyDef(label = "流向1", description = "流向1:流向1")
	private String lx1;

	/**
	 * 流向2:流向2
	 */
	@PropertyDef(label = "流向2", description = "流向2:流向2")
	private String lx2;

	/**
	 * 流向3:流向3
	 */
	@PropertyDef(label = "流向3", description = "流向3:流向3")
	private String lx3;

	/**
	 * 流向4:流向4
	 */
	@PropertyDef(label = "流向4", description = "流向4:流向4")
	private String lx4;

	/**
	 * 结案:结案
	 */
	@PropertyDef(label = "结案", description = "结案:结案")
	private String flag;

	/**
	 * 起运港:起运港
	 */
	@PropertyDef(label = "起运港", description = "起运港:起运港")
	private String startDock;

	/**
	 * 到达港:到达港
	 */
	@PropertyDef(label = "到达港", description = "到达港:到达港")
	private String endDock;

	/**
	 * 离港日:离港日
	 */
	@PropertyDef(label = "离港日", description = "离港日:离港日")
	private String lgr;

	/**
	 * 启始日:启始日
	 */
	@PropertyDef(label = "启始日", description = "启始日:启始日")
	private String qsr;

	/**
	 * 终到日:终到日
	 */
	@PropertyDef(label = "终到日", description = "终到日:终到日")
	private String zdr;

	/**
	 * GPS:GPS
	 */
	@PropertyDef(label = "GPS", description = "GPS:GPS")
	private String gps;

	/**
	 * 类别:类别
	 */
	@PropertyDef(label = "类别", description = "类别:类别")
	private String lb;

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
	 * 结算单号:结算单号
	 */
	@PropertyDef(label = "结算单号", description = "结算单号:结算单号")
	private String settleNo;

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
	 * YSGS_:
	 */
	@PropertyDef(label = "YSGS_", description = "YSGS_:")
	private String ysgs;

	/**
	 * 水单号:水单号
	 */
	@PropertyDef(label = "水单号", description = "水单号:水单号")
	private String shipListNo;

	/**
	 * 运单号:运单号
	 */
	@PropertyDef(label = "运单号", description = "运单号:运单号")
	private String transNo;

	/**
	 * 备注:备注
	 */
	@PropertyDef(label = "备注", description = "备注:备注")
	private String memo;

	/**
	 * 特约事项:特约事项
	 */
	@PropertyDef(label = "特约事项", description = "特约事项:特约事项")
	private String specialMemo;

	/**
	 * DOCK_:
	 */
	@PropertyDef(label = "DOCK_", description = "DOCK_:")
	private String dock;

	public Tbsh22() {
		super();
	}

	public Tbsh22(String tbsh22Id, String compId, String compCode, String hc,
			String custNo, String custName, String carrierNo,
			String carrierName, String shipNo, String phoneNo,
			BigDecimal ysKzl, BigDecimal xyKzl, BigDecimal shipWgt,
			BigDecimal carWgt, String loadTime, BigDecimal loadDay,
			BigDecimal transDay, BigDecimal drayageFee, BigDecimal liftsFee,
			BigDecimal portConsFee, BigDecimal demurageFee,
			BigDecimal backShipWgt, BigDecimal apUnitPrice, String lx1,
			String lx2, String lx3, String lx4, String flag, String startDock,
			String endDock, String lgr, String qsr, String zdr, String gps,
			String lb, String area, String status, String settleNo,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version, String ysgs, String shipListNo,
			String transNo, String memo, String specialMemo, String dock) {
		super();
		this.tbsh22Id = tbsh22Id;
		this.compId = compId;
		this.compCode = compCode;
		this.hc = hc;
		this.custNo = custNo;
		this.custName = custName;
		this.carrierNo = carrierNo;
		this.carrierName = carrierName;
		this.shipNo = shipNo;
		this.phoneNo = phoneNo;
		this.ysKzl = ysKzl;
		this.xyKzl = xyKzl;
		this.shipWgt = shipWgt;
		this.carWgt = carWgt;
		this.loadTime = loadTime;
		this.loadDay = loadDay;
		this.transDay = transDay;
		this.drayageFee = drayageFee;
		this.liftsFee = liftsFee;
		this.portConsFee = portConsFee;
		this.demurageFee = demurageFee;
		this.backShipWgt = backShipWgt;
		this.apUnitPrice = apUnitPrice;
		this.lx1 = lx1;
		this.lx2 = lx2;
		this.lx3 = lx3;
		this.lx4 = lx4;
		this.flag = flag;
		this.startDock = startDock;
		this.endDock = endDock;
		this.lgr = lgr;
		this.qsr = qsr;
		this.zdr = zdr;
		this.gps = gps;
		this.lb = lb;
		this.area = area;
		this.status = status;
		this.settleNo = settleNo;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
		this.ysgs = ysgs;
		this.shipListNo = shipListNo;
		this.transNo = transNo;
		this.memo = memo;
		this.specialMemo = specialMemo;
		this.dock = dock;
	}

	public void setTbsh22Id(String tbsh22Id) {
		this.tbsh22Id = tbsh22Id;
	}

	@Id
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

	public void setHc(String hc) {
		this.hc = hc;
	}

	@Column(name = "HC_", length = 20)
	public String getHc() {
		return hc;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 50)
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

	public void setShipNo(String shipNo) {
		this.shipNo = shipNo;
	}

	@Column(name = "SHIP_NO_", length = 20)
	public String getShipNo() {
		return shipNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PHONE_NO_", length = 20)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setYsKzl(BigDecimal ysKzl) {
		this.ysKzl = ysKzl;
	}

	@Column(name = "YS_KZL_")
	public BigDecimal getYsKzl() {
		return ysKzl;
	}

	public void setXyKzl(BigDecimal xyKzl) {
		this.xyKzl = xyKzl;
	}

	@Column(name = "XY_KZL_")
	public BigDecimal getXyKzl() {
		return xyKzl;
	}

	public void setShipWgt(BigDecimal shipWgt) {
		this.shipWgt = shipWgt;
	}

	@Column(name = "SHIP_WGT_")
	public BigDecimal getShipWgt() {
		return shipWgt;
	}

	public void setCarWgt(BigDecimal carWgt) {
		this.carWgt = carWgt;
	}

	@Column(name = "CAR_WGT_")
	public BigDecimal getCarWgt() {
		return carWgt;
	}

	public void setLoadTime(String loadTime) {
		this.loadTime = loadTime;
	}

	@Column(name = "LOAD_TIME_", length = 50)
	public String getLoadTime() {
		return loadTime;
	}

	public void setLoadDay(BigDecimal loadDay) {
		this.loadDay = loadDay;
	}

	@Column(name = "LOAD_DAY_")
	public BigDecimal getLoadDay() {
		return loadDay;
	}

	public void setTransDay(BigDecimal transDay) {
		this.transDay = transDay;
	}

	@Column(name = "TRANS_DAY_")
	public BigDecimal getTransDay() {
		return transDay;
	}

	public void setDrayageFee(BigDecimal drayageFee) {
		this.drayageFee = drayageFee;
	}

	@Column(name = "DRAYAGE_FEE_")
	public BigDecimal getDrayageFee() {
		return drayageFee;
	}

	public void setLiftsFee(BigDecimal liftsFee) {
		this.liftsFee = liftsFee;
	}

	@Column(name = "LIFTS_FEE_")
	public BigDecimal getLiftsFee() {
		return liftsFee;
	}

	public void setPortConsFee(BigDecimal portConsFee) {
		this.portConsFee = portConsFee;
	}

	@Column(name = "PORT_CONS_FEE_")
	public BigDecimal getPortConsFee() {
		return portConsFee;
	}

	public void setDemurageFee(BigDecimal demurageFee) {
		this.demurageFee = demurageFee;
	}

	@Column(name = "DEMURAGE_FEE_")
	public BigDecimal getDemurageFee() {
		return demurageFee;
	}

	public void setBackShipWgt(BigDecimal backShipWgt) {
		this.backShipWgt = backShipWgt;
	}

	@Column(name = "BACK_SHIP_WGT_")
	public BigDecimal getBackShipWgt() {
		return backShipWgt;
	}

	public void setApUnitPrice(BigDecimal apUnitPrice) {
		this.apUnitPrice = apUnitPrice;
	}

	@Column(name = "AP_UNIT_PRICE_")
	public BigDecimal getApUnitPrice() {
		return apUnitPrice;
	}

	public void setLx1(String lx1) {
		this.lx1 = lx1;
	}

	@Column(name = "LX1_", length = 50)
	public String getLx1() {
		return lx1;
	}

	public void setLx2(String lx2) {
		this.lx2 = lx2;
	}

	@Column(name = "LX2_", length = 50)
	public String getLx2() {
		return lx2;
	}

	public void setLx3(String lx3) {
		this.lx3 = lx3;
	}

	@Column(name = "LX3_", length = 50)
	public String getLx3() {
		return lx3;
	}

	public void setLx4(String lx4) {
		this.lx4 = lx4;
	}

	@Column(name = "LX4_", length = 50)
	public String getLx4() {
		return lx4;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "FLAG_", length = 10)
	public String getFlag() {
		return flag;
	}

	public void setStartDock(String startDock) {
		this.startDock = startDock;
	}

	@Column(name = "START_DOCK_", length = 10)
	public String getStartDock() {
		return startDock;
	}

	public void setEndDock(String endDock) {
		this.endDock = endDock;
	}

	@Column(name = "END_DOCK_", length = 10)
	public String getEndDock() {
		return endDock;
	}

	public void setLgr(String lgr) {
		this.lgr = lgr;
	}

	@Column(name = "LGR_", length = 50)
	public String getLgr() {
		return lgr;
	}

	public void setQsr(String qsr) {
		this.qsr = qsr;
	}

	@Column(name = "QSR_", length = 50)
	public String getQsr() {
		return qsr;
	}

	public void setZdr(String zdr) {
		this.zdr = zdr;
	}

	@Column(name = "ZDR_", length = 50)
	public String getZdr() {
		return zdr;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	@Column(name = "GPS_", length = 50)
	public String getGps() {
		return gps;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 10)
	public String getLb() {
		return lb;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "AREA_", length = 10)
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

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 50)
	public String getSettleNo() {
		return settleNo;
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

	public void setYsgs(String ysgs) {
		this.ysgs = ysgs;
	}

	@Column(name = "YSGS_", length = 50)
	public String getYsgs() {
		return ysgs;
	}

	public void setShipListNo(String shipListNo) {
		this.shipListNo = shipListNo;
	}

	@Column(name = "SHIP_LIST_NO_", length = 20)
	public String getShipListNo() {
		return shipListNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	@Column(name = "TRANS_NO_", length = 20)
	public String getTransNo() {
		return transNo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "MEMO_", length = 200)
	public String getMemo() {
		return memo;
	}

	public void setSpecialMemo(String specialMemo) {
		this.specialMemo = specialMemo;
	}

	@Column(name = "SPECIAL_MEMO_", length = 200)
	public String getSpecialMemo() {
		return specialMemo;
	}

	public void setDock(String dock) {
		this.dock = dock;
	}

	@Column(name = "DOCK_", length = 10)
	public String getDock() {
		return dock;
	}

	public String toString() {
		return "Tbsh22 [tbsh22Id=" + tbsh22Id + ",compId=" + compId
				+ ",compCode=" + compCode + ",hc=" + hc + ",custNo=" + custNo
				+ ",custName=" + custName + ",carrierNo=" + carrierNo
				+ ",carrierName=" + carrierName + ",shipNo=" + shipNo
				+ ",phoneNo=" + phoneNo + ",ysKzl=" + ysKzl + ",xyKzl=" + xyKzl
				+ ",shipWgt=" + shipWgt + ",carWgt=" + carWgt + ",loadTime="
				+ loadTime + ",loadDay=" + loadDay + ",transDay=" + transDay
				+ ",drayageFee=" + drayageFee + ",liftsFee=" + liftsFee
				+ ",portConsFee=" + portConsFee + ",demurageFee=" + demurageFee
				+ ",backShipWgt=" + backShipWgt + ",apUnitPrice=" + apUnitPrice
				+ ",lx1=" + lx1 + ",lx2=" + lx2 + ",lx3=" + lx3 + ",lx4=" + lx4
				+ ",flag=" + flag + ",startDock=" + startDock + ",endDock="
				+ endDock + ",lgr=" + lgr + ",qsr=" + qsr + ",zdr=" + zdr
				+ ",gps=" + gps + ",lb=" + lb + ",area=" + area + ",status="
				+ status + ",settleNo=" + settleNo + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version
				+ ",ysgs=" + ysgs + ",shipListNo=" + shipListNo + ",transNo="
				+ transNo + ",memo=" + memo + ",specialMemo=" + specialMemo
				+ ",dock=" + dock + "]";
	}

}

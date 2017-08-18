package com.jghz.sh.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbsh33a:船运结算项次
 */
@Entity
@Table(name = "tbsh33a")
public class Tbsh33a implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String tbsh33aId;

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
	 * 结算单ID:结算单ID
	 */
	@PropertyDef(label = "结算单ID", description = "结算单ID:结算单ID")
	private String settleNo;

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
	 * 载货量:载货量
	 */
	@PropertyDef(label = "载货量", description = "载货量:载货量")
	private BigDecimal shipWgt;

	/**
	 * 车载总量:车载总量
	 */
	@PropertyDef(label = "车载总量", description = "车载总量:车载总量")
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
	 * 单价:单价
	 */
	@PropertyDef(label = "单价", description = "单价:单价")
	private BigDecimal apUnitPrice;

	/**
	 * 船运费:船运费
	 */
	@PropertyDef(label = "船运费", description = "船运费:船运费")
	private BigDecimal arActMount;

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
	 * 类别:类别
	 */
	@PropertyDef(label = "类别", description = "类别:类别")
	private String lb;

	/**
	 * 状态:状态
	 */
	@PropertyDef(label = "状态", description = "状态:状态")
	private String status;

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

	public Tbsh33a() {
		super();
	}

	public Tbsh33a(String tbsh33aId, String sh33Id, String compId,
			String compCode, String settleNo, String transNo,
			String shipListNo, String hc, String shipNo, String phoneNo,
			BigDecimal shipWgt, BigDecimal carWgt, String loadTime,
			BigDecimal loadDay, BigDecimal transDay, BigDecimal drayageFee,
			BigDecimal liftsFee, BigDecimal portConsFee,
			BigDecimal demurageFee, BigDecimal backShipWgt, String startDock,
			String endDock, BigDecimal apUnitPrice, BigDecimal arActMount,
			String lgr, String qsr, String zdr, String lb, String status,
			String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.tbsh33aId = tbsh33aId;
		this.sh33Id = sh33Id;
		this.compId = compId;
		this.compCode = compCode;
		this.settleNo = settleNo;
		this.transNo = transNo;
		this.shipListNo = shipListNo;
		this.hc = hc;
		this.shipNo = shipNo;
		this.phoneNo = phoneNo;
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
		this.startDock = startDock;
		this.endDock = endDock;
		this.apUnitPrice = apUnitPrice;
		this.arActMount = arActMount;
		this.lgr = lgr;
		this.qsr = qsr;
		this.zdr = zdr;
		this.lb = lb;
		this.status = status;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setTbsh33aId(String tbsh33aId) {
		this.tbsh33aId = tbsh33aId;
	}

	@Id
	@Column(name = "TBSH33A_ID_", length = 50, nullable = false)
	public String getTbsh33aId() {
		return tbsh33aId;
	}

	public void setSh33Id(String sh33Id) {
		this.sh33Id = sh33Id;
	}

	@Column(name = "SH33_ID_", length = 50, nullable = false)
	public String getSh33Id() {
		return sh33Id;
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

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SETTLE_NO_", length = 20)
	public String getSettleNo() {
		return settleNo;
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

	public void setApUnitPrice(BigDecimal apUnitPrice) {
		this.apUnitPrice = apUnitPrice;
	}

	@Column(name = "AP_UNIT_PRICE_")
	public BigDecimal getApUnitPrice() {
		return apUnitPrice;
	}

	public void setArActMount(BigDecimal arActMount) {
		this.arActMount = arActMount;
	}

	@Column(name = "AR_ACT_MOUNT_")
	public BigDecimal getArActMount() {
		return arActMount;
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

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "LB_", length = 10)
	public String getLb() {
		return lb;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 10)
	public String getStatus() {
		return status;
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
		return "Tbsh33a [tbsh33aId=" + tbsh33aId + ",sh33Id=" + sh33Id
				+ ",compId=" + compId + ",compCode=" + compCode + ",settleNo="
				+ settleNo + ",transNo=" + transNo + ",shipListNo="
				+ shipListNo + ",hc=" + hc + ",shipNo=" + shipNo + ",phoneNo="
				+ phoneNo + ",shipWgt=" + shipWgt + ",carWgt=" + carWgt
				+ ",loadTime=" + loadTime + ",loadDay=" + loadDay
				+ ",transDay=" + transDay + ",drayageFee=" + drayageFee
				+ ",liftsFee=" + liftsFee + ",portConsFee=" + portConsFee
				+ ",demurageFee=" + demurageFee + ",backShipWgt=" + backShipWgt
				+ ",startDock=" + startDock + ",endDock=" + endDock
				+ ",apUnitPrice=" + apUnitPrice + ",arActMount=" + arActMount
				+ ",lgr=" + lgr + ",qsr=" + qsr + ",zdr=" + zdr + ",lb=" + lb
				+ ",status=" + status + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

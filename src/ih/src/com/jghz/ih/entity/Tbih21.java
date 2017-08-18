package com.jghz.ih.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbih21:TBIH21(合同表)
 */
@Entity
@Table(name = "tbih21")
public class Tbih21 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键:主键
	 */
	@PropertyDef(label = "主键", description = "主键:主键")
	private String ih21Id;

	/**
	 * 公司别:公司别
	 */
	@PropertyDef(label = "公司别", description = "公司别:公司别")
	private String compId;

	/**
	 * 合同编号:合同编号
	 */
	@PropertyDef(label = "合同编号", description = "合同编号:合同编号")
	private String contNo;

	/**
	 * 内部合同编号:内部合同编号
	 */
	@PropertyDef(label = "内部合同编号", description = "内部合同编号:内部合同编号")
	private String nContNo;

	/**
	 * 南钢合同编号:南钢合同编号
	 */
	@PropertyDef(label = "南钢合同编号", description = "南钢合同编号:南钢合同编号")
	private String ngContNo;

	/**
	 * 合同名称:合同名称
	 */
	@PropertyDef(label = "合同名称", description = "合同名称:合同名称")
	private String contName;

	/**
	 * 年度:年度
	 */
	@PropertyDef(label = "年度", description = "年度:年度")
	private String year;

	/**
	 * 协议分类:协议分类
	 */
	@PropertyDef(label = "协议分类", description = "协议分类:协议分类")
	private String ctype;

	/**
	 * 货源:货源
	 */
	@PropertyDef(label = "货源", description = "货源:货源")
	private String goodsSource;

	/**
	 * 合同性质:合同性质
	 */
	@PropertyDef(label = "合同性质", description = "合同性质:合同性质")
	private String basecodeXz;

	/**
	 * 合同部门:合同部门
	 */
	@PropertyDef(label = "合同部门", description = "合同部门:合同部门")
	private String basecodeBm;

	/**
	 * 结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)
	 */
	@PropertyDef(label = "结算方式(1日结2月结3自定义日期)", description = "结算方式(1日结2月结3自定义日期):结算方式(1日结2月结3自定义日期)")
	private String settleType;

	/**
	 * 付款方式:付款方式
	 */
	@PropertyDef(label = "付款方式", description = "付款方式:付款方式")
	private String payType;

	/**
	 * 价格类型:价格类型
	 */
	@PropertyDef(label = "价格类型", description = "价格类型:价格类型")
	private String priceType;

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
	 * 产品描述:产品描述
	 */
	@PropertyDef(label = "产品描述", description = "产品描述:产品描述")
	private String productDetail;

	/**
	 * 结算方编号:结算方编号
	 */
	@PropertyDef(label = "结算方编号", description = "结算方编号:结算方编号")
	private String settleCompNo;

	/**
	 * 结算方名称:结算方名称
	 */
	@PropertyDef(label = "结算方名称", description = "结算方名称:结算方名称")
	private String settleCompName;

	/**
	 * 合同主管单位编码:合同主管单位编码
	 */
	@PropertyDef(label = "合同主管单位编码", description = "合同主管单位编码:合同主管单位编码")
	private String zgdwNo;

	/**
	 * 合同主管单位:合同主管单位
	 */
	@PropertyDef(label = "合同主管单位", description = "合同主管单位:合同主管单位")
	private String zgdwName;

	/**
	 * 合同承办人员:合同承办人员
	 */
	@PropertyDef(label = "合同承办人员", description = "合同承办人员:合同承办人员")
	private String ccb;

	/**
	 * 联系电话:联系电话
	 */
	@PropertyDef(label = "联系电话", description = "联系电话:联系电话")
	private String telephone;

	/**
	 * 对方当事人编号:对方当事人编号
	 */
	@PropertyDef(label = "对方当事人编号", description = "对方当事人编号:对方当事人编号")
	private String custNo;

	/**
	 * 对方当事人:对方当事人
	 */
	@PropertyDef(label = "对方当事人", description = "对方当事人:对方当事人")
	private String custName;

	/**
	 * 第二当事人编号:第二当事人编号
	 */
	@PropertyDef(label = "第二当事人编号", description = "第二当事人编号:第二当事人编号")
	private String custNo2;

	/**
	 * 第二当事人:第二当事人
	 */
	@PropertyDef(label = "第二当事人", description = "第二当事人:第二当事人")
	private String custName2;

	/**
	 * 审批状态:审批状态
	 */
	@PropertyDef(label = "审批状态", description = "审批状态:审批状态")
	private String status;

	/**
	 * 合同开始日期:合同开始日期
	 */
	@PropertyDef(label = "合同开始日期", description = "合同开始日期:合同开始日期")
	private String startDate;

	/**
	 * 合同截止日期:合同截止日期
	 */
	@PropertyDef(label = "合同截止日期", description = "合同截止日期:合同截止日期")
	private String endDate;

	/**
	 * 标的:标的
	 */
	@PropertyDef(label = "标的", description = "标的:标的")
	private String object;

	/**
	 * 合同签订日期:合同签订日期
	 */
	@PropertyDef(label = "合同签订日期", description = "合同签订日期:合同签订日期")
	private String mdate;

	/**
	 * 合同执行期限:合同执行期限
	 */
	@PropertyDef(label = "合同执行期限", description = "合同执行期限:合同执行期限")
	private String cdate;

	/**
	 * 服务分类:服务分类
	 */
	@PropertyDef(label = "服务分类", description = "服务分类:服务分类")
	private String fwfl;

	/**
	 * 结算项目:结算项目
	 */
	@PropertyDef(label = "结算项目", description = "结算项目:结算项目")
	private String jsxm;

	/**
	 * 库龄计算方式:库龄计算方式
	 */
	@PropertyDef(label = "库龄计算方式", description = "库龄计算方式:库龄计算方式")
	private String kljs;

	/**
	 * 文件ID:文件ID
	 */
	@PropertyDef(label = "文件ID", description = "文件ID:文件ID")
	private String drdcId;

	/**
	 * 是否启用:是否启用
	 */
	@PropertyDef(label = "是否启用", description = "是否启用:是否启用")
	private String isuse;

	/**
	 * 起点:起点
	 */
	@PropertyDef(label = "起点", description = "起点:起点")
	private String startStation;

	/**
	 * 终点:终点
	 */
	@PropertyDef(label = "终点", description = "终点:终点")
	private String endStation;

	/**
	 * 备用1:备用1
	 */
	@PropertyDef(label = "备用1", description = "备用1:备用1")
	private String by1;

	/**
	 * 备用2:备用2
	 */
	@PropertyDef(label = "备用2", description = "备用2:备用2")
	private String by2;

	/**
	 * 备用3:备用3
	 */
	@PropertyDef(label = "备用3", description = "备用3:备用3")
	private String by3;

	/**
	 * 创建人:创建人
	 */
	@PropertyDef(label = "创建人", description = "创建人:创建人")
	private String createEmp;

	/**
	 * 创建时间:创建时间
	 */
	@PropertyDef(label = "创建时间", description = "创建时间:创建时间")
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

	public Tbih21() {
		super();
	}

	public Tbih21(String ih21Id, String compId, String contNo, String nContNo,
			String ngContNo, String contName, String year, String ctype,
			String goodsSource, String basecodeXz, String basecodeBm,
			String settleType, String payType, String priceType,
			String prodType, String prodTypeName, String productNo,
			String productName, String productDetail, String settleCompNo,
			String settleCompName, String zgdwNo, String zgdwName, String ccb,
			String telephone, String custNo, String custName, String custNo2,
			String custName2, String status, String startDate, String endDate,
			String object, String mdate, String cdate, String fwfl,
			String jsxm, String kljs, String drdcId, String isuse,
			String startStation, String endStation, String by1, String by2,
			String by3, String createEmp, Date createDate, String updateEmp,
			Date updateDate, int version) {
		super();
		this.ih21Id = ih21Id;
		this.compId = compId;
		this.contNo = contNo;
		this.nContNo = nContNo;
		this.ngContNo = ngContNo;
		this.contName = contName;
		this.year = year;
		this.ctype = ctype;
		this.goodsSource = goodsSource;
		this.basecodeXz = basecodeXz;
		this.basecodeBm = basecodeBm;
		this.settleType = settleType;
		this.payType = payType;
		this.priceType = priceType;
		this.prodType = prodType;
		this.prodTypeName = prodTypeName;
		this.productNo = productNo;
		this.productName = productName;
		this.productDetail = productDetail;
		this.settleCompNo = settleCompNo;
		this.settleCompName = settleCompName;
		this.zgdwNo = zgdwNo;
		this.zgdwName = zgdwName;
		this.ccb = ccb;
		this.telephone = telephone;
		this.custNo = custNo;
		this.custName = custName;
		this.custNo2 = custNo2;
		this.custName2 = custName2;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.object = object;
		this.mdate = mdate;
		this.cdate = cdate;
		this.fwfl = fwfl;
		this.jsxm = jsxm;
		this.kljs = kljs;
		this.drdcId = drdcId;
		this.isuse = isuse;
		this.startStation = startStation;
		this.endStation = endStation;
		this.by1 = by1;
		this.by2 = by2;
		this.by3 = by3;
		this.createEmp = createEmp;
		this.createDate = createDate;
		this.updateEmp = updateEmp;
		this.updateDate = updateDate;
		this.version = version;
	}

	public void setIh21Id(String ih21Id) {
		this.ih21Id = ih21Id;
	}

	@Id
	@Column(name = "IH21_ID_", length = 50, nullable = false)
	public String getIh21Id() {
		return ih21Id;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	@Column(name = "COMP_ID_", length = 10, unique = true)
	public String getCompId() {
		return compId;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	@Column(name = "CONT_NO_", length = 20, unique = true)
	public String getContNo() {
		return contNo;
	}

	public void setNContNo(String nContNo) {
		this.nContNo = nContNo;
	}

	@Column(name = "N_CONT_NO_", length = 50)
	public String getNContNo() {
		return nContNo;
	}

	public void setNgContNo(String ngContNo) {
		this.ngContNo = ngContNo;
	}

	@Column(name = "NG_CONT_NO_", length = 200)
	public String getNgContNo() {
		return ngContNo;
	}

	public void setContName(String contName) {
		this.contName = contName;
	}

	@Column(name = "CONT_NAME_", length = 200)
	public String getContName() {
		return contName;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name = "YEAR_", length = 20)
	public String getYear() {
		return year;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	@Column(name = "CTYPE_", length = 50)
	public String getCtype() {
		return ctype;
	}

	public void setGoodsSource(String goodsSource) {
		this.goodsSource = goodsSource;
	}

	@Column(name = "GOODS_SOURCE_", length = 10)
	public String getGoodsSource() {
		return goodsSource;
	}

	public void setBasecodeXz(String basecodeXz) {
		this.basecodeXz = basecodeXz;
	}

	@Column(name = "BASECODE_XZ_", length = 50)
	public String getBasecodeXz() {
		return basecodeXz;
	}

	public void setBasecodeBm(String basecodeBm) {
		this.basecodeBm = basecodeBm;
	}

	@Column(name = "BASECODE_BM_", length = 50)
	public String getBasecodeBm() {
		return basecodeBm;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	@Column(name = "SETTLE_TYPE_", length = 20)
	public String getSettleType() {
		return settleType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "PAY_TYPE_", length = 500)
	public String getPayType() {
		return payType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	@Column(name = "PRICE_TYPE_", length = 20)
	public String getPriceType() {
		return priceType;
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

	@Column(name = "PROD_TYPE_NAME_", length = 100)
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

	@Column(name = "PRODUCT_NAME_", length = 100)
	public String getProductName() {
		return productName;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	@Column(name = "PRODUCT_DETAIL_", length = 200)
	public String getProductDetail() {
		return productDetail;
	}

	public void setSettleCompNo(String settleCompNo) {
		this.settleCompNo = settleCompNo;
	}

	@Column(name = "SETTLE_COMP_NO_", length = 20)
	public String getSettleCompNo() {
		return settleCompNo;
	}

	public void setSettleCompName(String settleCompName) {
		this.settleCompName = settleCompName;
	}

	@Column(name = "SETTLE_COMP_NAME_", length = 200)
	public String getSettleCompName() {
		return settleCompName;
	}

	public void setZgdwNo(String zgdwNo) {
		this.zgdwNo = zgdwNo;
	}

	@Column(name = "ZGDW_NO_", length = 20)
	public String getZgdwNo() {
		return zgdwNo;
	}

	public void setZgdwName(String zgdwName) {
		this.zgdwName = zgdwName;
	}

	@Column(name = "ZGDW_NAME_", length = 200)
	public String getZgdwName() {
		return zgdwName;
	}

	public void setCcb(String ccb) {
		this.ccb = ccb;
	}

	@Column(name = "CCB_", length = 50)
	public String getCcb() {
		return ccb;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "TELEPHONE_", length = 50)
	public String getTelephone() {
		return telephone;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Column(name = "CUST_NO_", length = 20)
	public String getCustNo() {
		return custNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CUST_NAME_", length = 200)
	public String getCustName() {
		return custName;
	}

	public void setCustNo2(String custNo2) {
		this.custNo2 = custNo2;
	}

	@Column(name = "CUST_NO2_", length = 20)
	public String getCustNo2() {
		return custNo2;
	}

	public void setCustName2(String custName2) {
		this.custName2 = custName2;
	}

	@Column(name = "CUST_NAME2_", length = 200)
	public String getCustName2() {
		return custName2;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_", length = 20)
	public String getStatus() {
		return status;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Column(name = "START_DATE_", length = 20)
	public String getStartDate() {
		return startDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Column(name = "END_DATE_", length = 20)
	public String getEndDate() {
		return endDate;
	}

	public void setObject(String object) {
		this.object = object;
	}

	@Column(name = "OBJECT_", length = 50)
	public String getObject() {
		return object;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	@Column(name = "MDATE_", length = 20)
	public String getMdate() {
		return mdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	@Column(name = "CDATE_", length = 20)
	public String getCdate() {
		return cdate;
	}

	public void setFwfl(String fwfl) {
		this.fwfl = fwfl;
	}

	@Column(name = "FWFL_", length = 20)
	public String getFwfl() {
		return fwfl;
	}

	public void setJsxm(String jsxm) {
		this.jsxm = jsxm;
	}

	@Column(name = "JSXM_", length = 20)
	public String getJsxm() {
		return jsxm;
	}

	public void setKljs(String kljs) {
		this.kljs = kljs;
	}

	@Column(name = "KLJS_", length = 4)
	public String getKljs() {
		return kljs;
	}

	public void setDrdcId(String drdcId) {
		this.drdcId = drdcId;
	}

	@Column(name = "DRDC_ID_", length = 50)
	public String getDrdcId() {
		return drdcId;
	}

	public void setIsuse(String isuse) {
		this.isuse = isuse;
	}

	@Column(name = "ISUSE_", length = 5)
	public String getIsuse() {
		return isuse;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	@Column(name = "START_STATION_", length = 200)
	public String getStartStation() {
		return startStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Column(name = "END_STATION_", length = 200)
	public String getEndStation() {
		return endStation;
	}

	public void setBy1(String by1) {
		this.by1 = by1;
	}

	@Column(name = "BY1_", length = 50)
	public String getBy1() {
		return by1;
	}

	public void setBy2(String by2) {
		this.by2 = by2;
	}

	@Column(name = "BY2_", length = 50)
	public String getBy2() {
		return by2;
	}

	public void setBy3(String by3) {
		this.by3 = by3;
	}

	@Column(name = "BY3_", length = 50)
	public String getBy3() {
		return by3;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	@Column(name = "CREATE_EMP_", length = 50)
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

	@Column(name = "UPDATE_EMP_", length = 50)
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
		return "Tbih21 [ih21Id=" + ih21Id + ",compId=" + compId + ",contNo="
				+ contNo + ",nContNo=" + nContNo + ",ngContNo=" + ngContNo
				+ ",contName=" + contName + ",year=" + year + ",ctype=" + ctype
				+ ",goodsSource=" + goodsSource + ",basecodeXz=" + basecodeXz
				+ ",basecodeBm=" + basecodeBm + ",settleType=" + settleType
				+ ",payType=" + payType + ",priceType=" + priceType
				+ ",prodType=" + prodType + ",prodTypeName=" + prodTypeName
				+ ",productNo=" + productNo + ",productName=" + productName
				+ ",productDetail=" + productDetail + ",settleCompNo="
				+ settleCompNo + ",settleCompName=" + settleCompName
				+ ",zgdwNo=" + zgdwNo + ",zgdwName=" + zgdwName + ",ccb=" + ccb
				+ ",telephone=" + telephone + ",custNo=" + custNo
				+ ",custName=" + custName + ",custNo2=" + custNo2
				+ ",custName2=" + custName2 + ",status=" + status
				+ ",startDate=" + startDate + ",endDate=" + endDate
				+ ",object=" + object + ",mdate=" + mdate + ",cdate=" + cdate
				+ ",fwfl=" + fwfl + ",jsxm=" + jsxm + ",kljs=" + kljs
				+ ",drdcId=" + drdcId + ",isuse=" + isuse + ",startStation="
				+ startStation + ",endStation=" + endStation + ",by1=" + by1
				+ ",by2=" + by2 + ",by3=" + by3 + ",createEmp=" + createEmp
				+ ",createDate=" + createDate + ",updateEmp=" + updateEmp
				+ ",updateDate=" + updateDate + ",version=" + version + "]";
	}

}

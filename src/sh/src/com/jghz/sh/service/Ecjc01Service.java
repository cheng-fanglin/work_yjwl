package com.jghz.sh.service;

import java.math.BigDecimal;
import java.rmi.dgc.VMID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.constant.SystemConstant;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc01wdDao;
import com.jghz.sh.entity.Tbwd01;
import com.mysql.cj.fabric.xmlrpc.base.Array;

/**
 * 单表维护服务 实现对com.ec.entity.Tbwd01对象信息的保存操
 */
@Component("ecjc01Service")
public class Ecjc01Service {

	@Resource
	private Shjc01wdDao shjc01wdDao;

	@DataProvider
	public void loadwd01(Page<Tbwd01> page, Map<String, Object> paramater) throws Exception {
		shjc01wdDao.pagingQuery01(page, paramater);
		Collection<Tbwd01> col = page.getEntities();
		for (Tbwd01 wd01 : col) {
			String Id = wd01.getRoadImg();
			if (Id != null) {
				wd01.setRoadImgPath(SystemConstant.compressUrl + shjc01wdDao.getFilePath(Id));
			} else {
				wd01.setRoadImgPath(null);
			}
			String Id2 = wd01.getCompanyCertificate();
			if (Id2 != null) {
				wd01.setCompanyCertificatePath(SystemConstant.compressUrl + shjc01wdDao.getFilePath(Id2));
			} else {
				wd01.setCompanyCertificatePath(null);
			}
			String Id3 = wd01.getCompanyLicense();
			if (Id3 != null) {
				wd01.setCompanyLicensePath(SystemConstant.compressUrl + shjc01wdDao.getFilePath(Id3));
			} else {
				wd01.setCompanyLicensePath(null);
			}
			String Id4 = wd01.getCompanyCode();
			if (Id4 != null) {
				wd01.setCompanyCodePath(SystemConstant.compressUrl + shjc01wdDao.getFilePath(Id4));
			} else {
				wd01.setCompanyCodePath(null);
			}
			String Id5 = wd01.getAuthorizationImg();
			if (Id5 != null) {
				wd01.setAuthorizationImgPath(SystemConstant.compressUrl + shjc01wdDao.getFilePath(Id5));
			} else {
				wd01.setAuthorizationImgPath(null);
			}
			String Id6 = wd01.getIdentityCard();
			if (Id6 != null) {
				wd01.setIdentityCardPath(SystemConstant.compressUrl + shjc01wdDao.getFilePath(Id6));
			} else {
				wd01.setIdentityCardPath(null);
			}
			String Id7 = wd01.getIdentityCardBack();
			if (Id7 != null) {
				wd01.setIdentityCardBackPath(SystemConstant.compressUrl + shjc01wdDao.getFilePath(Id7));
			} else {
				wd01.setIdentityCardBackPath(null);
			}
		}
		page.setEntities(col);
	}

	/**
	 * �����޸�ɾ��
	 * 
	 * @param wd01s
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	@DataResolver
	public void saveTbwd01(Collection<Tbwd01> wd01s) throws Exception {
		Session session = shjc01wdDao.getSession();

		try {
			for (Tbwd01 wd01 : wd01s) {
				EntityState state = EntityUtils.getState(wd01);
				final Tbwd01 w01 = wd01;
				if (state.equals(EntityState.NEW)) {
					String userType = w01.getUserType();
					String compId = AppUtils.getCompId();
					w01.setWd01Id(new VMID().toString());
					w01.setCompId(compId);
					w01.setState("0");
					// w01.setCarrierNo(getCarrierNo(userType,compId));
					w01.setCreateTime(new Date());
					w01.setUpdateTime(new Date());
					
					session.save(w01);
				}
				if (state.equals(EntityState.MODIFIED)) {
					/*// 前台传过来的是一个地址 保存到对应的字段需要的是upload表的 file_path字段
					String Id = AppUtils.toValidString(wd01.getRoadImg()); 
					Id=Id.replaceAll(SystemConstant.compressUrl, "");
					String id = shjc01wdDao.getIdByFilePath(Id);
					if(!id.isEmpty()) {
						w01.setRoadImg(id);
					}
					
					String Id2 = AppUtils.toValidString(wd01.getCompanyCertificate());
					Id2=Id2.replaceAll(SystemConstant.compressUrl, "");
					String id2 = shjc01wdDao.getIdByFilePath(Id2);
					if(!id2.isEmpty()) {
						w01.setCompanyCertificate(id2);
					}
					
					String Id3 =  AppUtils.toValidString(wd01.getCompanyLicense());
					Id3=Id3.replaceAll(SystemConstant.compressUrl, "");
					String id3 = shjc01wdDao.getIdByFilePath(Id3);
					if(!id3.isEmpty()) {
						w01.setCompanyLicense(id3);
					}
					
					String Id4 = AppUtils.toValidString(wd01.getCompanyCode());
					Id4=Id4.replaceAll(SystemConstant.compressUrl, "");
					String id4= shjc01wdDao.getIdByFilePath(Id4);
					if(!id4.isEmpty()) {
						w01.setCompanyCode(id4);
					}
					
					String Id5 = AppUtils.toValidString(wd01.getAuthorizationImg());
					Id5=Id5.replaceAll(SystemConstant.compressUrl, "");
					String id5 = shjc01wdDao.getIdByFilePath(Id5);
					if(!id5.isEmpty()) {
						w01.setAuthorizationImg(id5);
					}
					
					String Id6 = AppUtils.toValidString(wd01.getIdentityCard());
					Id6 = Id6.replaceAll(SystemConstant.compressUrl, "");
					String id6 = shjc01wdDao.getIdByFilePath(Id6);
					if(!id6.isEmpty()) {
						w01.setIdentityCard(id6);
					}
					
					String Id7 = AppUtils.toValidString(wd01.getIdentityCardBack());
					Id7=Id7.replaceAll(SystemConstant.compressUrl, "");
					String id7 = shjc01wdDao.getIdByFilePath(Id7);
					if(!id7.isEmpty()) {
						w01.setIdentityCardBack(id7);
					}*/
					
					session.update(w01);
				}
				if (state.equals(EntityState.DELETED)) {
					session.delete(w01);
				}
			}

		} finally {
			session.flush();

		}
	}

	@Transactional
	@DataResolver
	public void saveSh(Collection<Tbwd01> tbwd01s) throws Exception {
		Properties prop = new Properties();
		if(tbwd01s!=null&&tbwd01s.size()>0) {
			for(Tbwd01 tbwd01 : tbwd01s) {
				boolean update = shjc01wdDao.update(tbwd01);
			}
		}
	}

	@DataResolver
	public String getCarrierNo(String userType, String compId) throws Exception {
		String carrierNo = "";
		List<String> params = new ArrayList<String>();
		params.add(compId);
		params.add(userType + "%");
		String sql = " SELECT MAX(carrier_no_) AS carrierNo FROM Tbwd01 WHERE comp_Id_ = ? AND carrier_no_ like ?  ";
		// List listCNo =this.getJdbcTemplate().queryForList(sql, params.toArray());
		List listCNo = shjc01wdDao.getListBySQL(sql, params);
		if (listCNo.size() > 0) {
			Map map = (Map) listCNo.get(0);
			Object carrierNoMax = map.get("carrierNo");
			if (carrierNoMax != null && carrierNoMax != "") {
				String maxString = (carrierNoMax.toString()).substring(2, 5);
				BigDecimal maxBig = new BigDecimal(maxString);
				String maxLast = String.valueOf(maxBig.add(new BigDecimal(1)));

				switch (maxLast.length()) {
				case 1:
					maxLast = "0000" + maxLast;
					break;
				case 2:
					maxLast = "000" + maxLast;
					break;
				case 3:
					maxLast = "00" + maxLast;
					break;
				case 4:
					maxLast = "0" + maxLast;
					break;
				}
				carrierNo = userType + maxLast;
			} else {
				carrierNo = userType + "00001";
			}
		}
		return carrierNo;
	}

}
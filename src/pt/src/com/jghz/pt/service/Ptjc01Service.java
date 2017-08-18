package com.jghz.pt.service;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.base.util.DateUtil;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.pt.dao.Ptjc01Dao;
import com.jghz.pt.entity.Tbpt01;

@Transactional
@Component
public class Ptjc01Service extends HibernateDao {

	@Resource
	private Ptjc01Dao ptjc01Dao;

	/**
	 * @Description 查询新闻发布内容
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void loadTbpt01(Page<Tbpt01> page, Map<String, Object> parameter)
			throws Exception {
		ptjc01Dao.pagingQuery(page,parameter);
	}

	/**
	 * @Description 增删改新闻发布内容
	 * @param ListPt01
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	@DataResolver
	public Properties saveTbpt01(Collection<Tbpt01> ListPt01,Map<String,Object> parameter) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for (Tbpt01 pt01 : ListPt01) {
				EntityState state = EntityUtils.getState(pt01);
				if (state.equals(EntityState.NEW)) {
					pt01.setPt01Id(AppUtils.generateUniqueKey());
					pt01.setCompId(AppUtils.getCompId());
					pt01.setState("0");//设置初始未发布状态
					pt01.setCreateEmp(AppUtils.getUserInfo().getCname());
					pt01.setCreateTime(AppUtils.getCurrentDate());
					ptjc01Dao.save(pt01);
					prop.put("msg", "新增成功");
					prop.put("flag", flag);
				}
				if (state.equals(EntityState.MODIFIED)) {
					pt01.setUpdateEmp(AppUtils.getUserInfo().getCname());
					pt01.setUpdateTime(AppUtils.getCurrentDate());
					ptjc01Dao.update(pt01);
					prop.put("msg", "修改成功");
					prop.put("flag", flag);
				}
				if (state.equals(EntityState.DELETED)) {
					ptjc01Dao.delete(pt01);
					prop.put("msg", "删除成功");
					prop.put("flag", flag);
				}
			}

		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
	/**
	 * 发布与取消发布新闻公告
	 * @param pt01s
	 * @return
	 */
	@DataResolver
	public Properties executePublish(Collection<Tbpt01> pt01s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			String status = "";
			for(Tbpt01 pt01 : pt01s){
				status = pt01.getState();
				//发布
				if("0".equals(status)){
					pt01.setReleaseTime(DateUtil.getToday("yyyyMMdd HH:mm:ss"));
					pt01.setAuditor(AppUtils.getUserInfo().getCname());
					pt01.setState("1");//发布成功
					pt01.setUpdateEmp(AppUtils.getUserInfo().getCname());
					pt01.setUpdateTime(AppUtils.getCurrentDate());
					ptjc01Dao.update(pt01);
					prop.put("msg", "发布成功");
					prop.put("flag", flag);
				}else if("1".equals(status)){//取消发布
					pt01.setState("0");//取消发布成功
					pt01.setReleaseTime("");
					pt01.setAuditor("");
					pt01.setUpdateEmp(AppUtils.getUserInfo().getCname());
					pt01.setUpdateTime(AppUtils.getCurrentDate());
					ptjc01Dao.update(pt01);
					prop.put("msg", "取消发布成功");
					prop.put("flag", flag);
				}else{
					prop.put("msg", "状态异常");
					prop.put("flag", false);
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
}
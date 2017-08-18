package com.jghz.pt.service;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.base.util.AppUtils;
import com.base.util.DateUtil;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.provider.Page;
import com.jghz.pt.dao.Bdf2MessageDao;
import com.jghz.pt.dao.Ptjc01Dao;
import com.jghz.pt.entity.Bdf2Message;
import com.jghz.pt.entity.Tbpt01;

/**
 * 单表维护服务类
 * 实现对com.jghz.pt.entity.Tbpt01对象信息的保存操作
 */
@Component
public class Ptjc02Service extends HibernateDao {
	@Resource
	private Ptjc01Dao ptjc01Dao;
	
	@Resource
	private Bdf2MessageDao msgDao;

	@DataProvider
	public void loadTbpt01(Page<Tbpt01> page, Map<String, Object> parameter)
			throws Exception {
		ptjc01Dao.pagingQueryByPublish(page,parameter);
	}
	
	@DataProvider
	public void loadBdf2Message(Page<Bdf2Message> page, Map<String, Object> parameter)
			throws Exception {
		msgDao.pagingQuery(page,parameter);
	}
	
	/**
	 * 设置为已读消息
	 * @param msgs
	 * @return
	 */
	@DataResolver
	public Properties executeRead(Collection<Bdf2Message> msgs){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			boolean read ;
			for(Bdf2Message msg : msgs){
				read = msg.isRead();
				//发布
				if(read){
					msg.setRead(true);
					msgDao.update(msg);
					prop.put("msg", "设置成功");
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
	 * 设置为回复消息
	 * @param msgs
	 * @return
	 */
	@DataResolver
	public Properties executeReply(Collection<Bdf2Message> msgs){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			boolean reply ;
			for(Bdf2Message msg : msgs){
				reply = msg.isReply();
				//发布
				if(reply){
					msgDao.update(msg);
					prop.put("msg", "设置成功");
					prop.put("flag", flag);
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}

}
package com.jghz.pt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.pt.entity.Bdf2Message;

@Component
public class Bdf2MessageDao extends BaseDao{
	
	public void pagingQuery(Page<Bdf2Message> page, Map<String, Object> paramater)
			throws Exception {
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Bdf2Message.class.getName()+ " where receiver='"+AppUtils.getUserName()+"'";

		this.pagingQuery(page, hql, "select count(*) " + hql,param);
		
	}
}

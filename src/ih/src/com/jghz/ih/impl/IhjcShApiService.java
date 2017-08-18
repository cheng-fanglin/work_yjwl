package com.jghz.ih.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdcc1a;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc16Dao;
import com.jghz.ih.dao.Ihjc21Dao;
import com.jghz.ih.dao.IhjcComm01Dao;
import com.jghz.ih.entity.Tbih01a;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih16;
import com.jghz.ih.entity.Tbih21;
import com.jghz.ih.entity.Tbih22;


@Component
public class IhjcShApiService extends BaseDao{
	@Resource
	private Ihjc16Dao ihjc16Dao;
	
	@Resource
	private Ihjc02Dao ihjc02Dao;
	
	@Resource
	private Ihjc21Dao ihjc21Dao;
	
	@Resource
	private IhjcComm01Dao ihjcComm01Dao;
	
	//根据运单生成提单
	public void saveTbih16LadingNo(Map<String, Object> parameter) throws Exception {
		String ladingNo="";
			if(parameter!=null) {
				Tbih16 ih16= new Tbih16();
				AppUtils.copyProperties(parameter, ih16);
				ih16.setTranType(AppUtils.toValidString(parameter.get("transType")));
				ih16.setIh16Id(AppUtils.generateUniqueKey());
				ih16.setCompId(AppUtils.getCompId());
				parameter.put("compId", ih16.getCompId());
				ladingNo=ihjcComm01Dao.getLaddingNo(parameter);
				Map<String,Object> map02=new HashMap<String,Object>();
				AppUtils.copyProperties(ih16, map02);
				ih16.setLadingNo(ladingNo);
				List<Tbih21> listIh21 = ihjc21Dao.queryList(map02);
				if(CollectionUtils.isNotEmpty(listIh21)&&listIh21.get(0)!=null){
					Tbih21 ih21=listIh21.get(0);
					ih16.setSettleType(ih21.getSettleType());
					ih16.setContNo(ih21.getContNo());
					ih16.setFwlx(ih21.getFwfl());
				}
				
				List<Tbih02> listIh02 = ihjc02Dao.queryList02(map02);
				if(CollectionUtils.isNotEmpty(listIh02)&&listIh02.get(0)!=null){
					Tbih02 ih02 = listIh02.get(0);
					ih16.setDsNo(ih02.getDsNo());
					ih16.setDsName(ih02.getDsName());
				}
				ih16.setStatus("00");
				ih16.setDeliveryDate(AppUtils.getCurrentDateString("yyyyMMdd"));
				ihjc21Dao.save(ih16);
			}
	}
}

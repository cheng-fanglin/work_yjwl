package com.jghz.ih.service;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc03Dao;
import com.jghz.ih.entity.Tbih03;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih03b;
import com.jghz.ih.entity.Tbih03c;
import com.jghz.ih.entity.Tbih03d;
import com.jghz.ih.entity.Tbih03e;
import com.jghz.ih.entity.Tbih03f;

@Transactional
@Component
public class Ihjc03Service {

	@Resource
	private Ihjc03Dao ihjc03Dao;

	@DataProvider
	public void loadTbih03(Page<Tbih03> page, Map<String, Object> parameter)
			throws Exception {
		ihjc03Dao.pagingQuery03(page, parameter);
	}

	@DataProvider
	public void loadTbih03a(Page<Tbih03a> page, Map<String, Object> parameter)
			throws Exception {
		ihjc03Dao.pagingQuery03a(page, parameter);
	}

	@DataProvider
	public void loadTbih03b(Page<Tbih03b> page, Map<String, Object> parameter)
			throws Exception {
		ihjc03Dao.pagingQuery03b(page, parameter);
	}

	@DataProvider
	public void loadTbih03c(Page<Tbih03c> page, Map<String, Object> parameter)
			throws Exception {
		ihjc03Dao.pagingQuery03c(page, parameter);
	}

	@DataProvider
	public void loadTbih03d(Page<Tbih03d> page, Map<String, Object> parameter)
			throws Exception {
		ihjc03Dao.pagingQuery03d(page, parameter);
	}

	@DataProvider
	public void loadTbih03e(Page<Tbih03e> page, Map<String, Object> parameter)
			throws Exception {
		ihjc03Dao.pagingQuery03e(page, parameter);
	}

	@DataProvider
	public void loadTbih03f(Page<Tbih03f> page, Map<String, Object> parameter)
			throws Exception {
		ihjc03Dao.pagingQuery03f(page, parameter);
	}

	@DataResolver
	public void saveTbih03(Collection<Tbih03> ListIh03) throws Exception {
		for (Tbih03 tbih03 : ListIh03) {
			EntityState state = EntityUtils.getState(tbih03);
			final Tbih03 ih03 = tbih03;
			if (state.equals(EntityState.NEW)) {
				ih03.setIh03Id(AppUtils.generateUniqueKey());
				ih03.setCompId(AppUtils.getCompId());
				ih03.setCreateDate(new Date());
				ih03.setCreateEmp(AppUtils.getUserName());
				ih03.setUpdateEmp(AppUtils.getUserName());
				ih03.setUpdateDate(new Date());
				ihjc03Dao.save(ih03);

			}
			if (state.equals(EntityState.MODIFIED)) {
				ih03.setUpdateDate(new Date());
				ih03.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.update(ih03);
			}
			if (state.equals(EntityState.DELETED)) {
				ihjc03Dao.delete(ih03);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih03Stu(Map<String, Object> parameters)
			throws Exception {
		Collection<Tbih03> ListIh03 = (Collection<Tbih03>) parameters
				.get("ListIh03");
		String status = (String) parameters.get("status");
		for (Tbih03 ih03 : ListIh03) {
			ih03.setStatus(status);
			if (status.equals("01")) {
				ih03.setUsedate(AppUtils.getCurrentDateString("yyyyMMdd"));
			}
			ihjc03Dao.update(ih03);
		}
	}

	@DataResolver
	public void saveTbih03a(Collection<Tbih03a> ListIh03a) throws Exception {
		for (Tbih03a tbih03a : ListIh03a) {
			EntityState state = EntityUtils.getState(tbih03a);
			final Tbih03a ih03a = tbih03a;
			if (state.equals(EntityState.NEW)) {
				ih03a.setIh03aId(AppUtils.generateUniqueKey());
				ih03a.setCompId(AppUtils.getCompId());
				ih03a.setCreateDate(new Date());
				ih03a.setUpdateDate(new Date());
				ih03a.setCreateEmp(AppUtils.getUserName());
				ih03a.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.save(ih03a);

			}
			if (state.equals(EntityState.MODIFIED)) {
				ih03a.setUpdateDate(new Date());
				ih03a.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.update(ih03a);
			}
			if (state.equals(EntityState.DELETED)) {
				ihjc03Dao.delete(ih03a);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih03aStu(Map<String, Object> parameters)
			throws Exception {
		Collection<Tbih03a> ListIh03a = (Collection<Tbih03a>) parameters
				.get("ListIh03a");
		String status = (String) parameters.get("status");

		for (Tbih03a ih03a : ListIh03a) {
			ih03a.setStatus(status);
			if (status.equals("01")) {
				ih03a.setUseDate(AppUtils.getCurrentDateString("yyyyMMdd"));
			}
			ih03a.setUpdateDate(new Date());
			ih03a.setUpdateEmp(AppUtils.getUserName());
			ihjc03Dao.update(ih03a);
		}

	}

	@DataResolver
	public void saveTbih03b(Collection<Tbih03b> ListIh03b) throws Exception {

		for (Tbih03b tbih03b : ListIh03b) {
			EntityState state = EntityUtils.getState(tbih03b);
			final Tbih03b ih03b = tbih03b;
			if (state.equals(EntityState.NEW)) {
				ih03b.setIh03bId(AppUtils.generateUniqueKey());
				ih03b.setCompId(AppUtils.getCompId());
				ih03b.setCreateDate(new Date());
				ih03b.setUpdateDate(new Date());
				ih03b.setCreateEmp(AppUtils.getUserName());
				ih03b.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.save(ih03b);

			}
			if (state.equals(EntityState.MODIFIED)) {
				ih03b.setUpdateDate(new Date());
				ih03b.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.update(ih03b);
			}
			if (state.equals(EntityState.DELETED)) {
				ihjc03Dao.delete(ih03b);
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih03bStu(Map<String, Object> parameters)
			throws Exception {
		Collection<Tbih03b> ListIh03b = (Collection<Tbih03b>) parameters
				.get("ListIh03b");
		String status = (String) parameters.get("status");

		for (Tbih03b ih03b : ListIh03b) {
			ih03b.setStatus(status);
			if (status.equals("01")) {
				ih03b.setUsedate(AppUtils.getCurrentDateString("yyyyMMdd"));
			}
			ih03b.setUpdateDate(new Date());
			ih03b.setUpdateEmp(AppUtils.getUserName());
			ihjc03Dao.update(ih03b);
		}

	}

	@DataResolver
	public void saveTbih03c(Collection<Tbih03c> ListIh03c) throws Exception {

		for (Tbih03c tbih03c : ListIh03c) {
			EntityState state = EntityUtils.getState(tbih03c);
			final Tbih03c ih03c = tbih03c;
			if (state.equals(EntityState.NEW)) {
				ih03c.setIh03cId(AppUtils.generateUniqueKey());
				ih03c.setCompId(AppUtils.getCompId());
				ih03c.setCreateDate(new Date());
				ih03c.setUpdateDate(new Date());
				ih03c.setCreateEmp(AppUtils.getUserName());
				ih03c.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.save(ih03c);

			}
			if (state.equals(EntityState.MODIFIED)) {
				ih03c.setUpdateDate(new Date());
				ih03c.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.update(ih03c);
			}
			if (state.equals(EntityState.DELETED)) {
				ihjc03Dao.delete(ih03c);
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih03cStu(Map<String, Object> parameters)
			throws Exception {
		Collection<Tbih03c> ListIh03c = (Collection<Tbih03c>) parameters
				.get("ListIh03c");
		String status = (String) parameters.get("status");

		for (Tbih03c ih03c : ListIh03c) {
			ih03c.setStatus(status);
			if (status.equals("01")) {
				ih03c.setUsedate(AppUtils.getCurrentDateString("yyyyMMdd"));
			}
			ih03c.setUpdateDate(new Date());
			ih03c.setUpdateEmp(AppUtils.getUserName());
			ihjc03Dao.update(ih03c);
		}

	}

	@DataResolver
	public void saveTbih03d(Collection<Tbih03d> ListIh03d) throws Exception {

		for (Tbih03d tbih03d : ListIh03d) {
			EntityState state = EntityUtils.getState(tbih03d);
			final Tbih03d ih03d = tbih03d;
			if (state.equals(EntityState.NEW)) {
				ih03d.setIh03dId(AppUtils.generateUniqueKey());
				ih03d.setCompId(AppUtils.getCompId());
				ih03d.setCreateDate(new Date());
				ih03d.setUpdateDate(new Date());
				ih03d.setCreateEmp(AppUtils.getUserName());
				ih03d.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.save(ih03d);

			}
			if (state.equals(EntityState.MODIFIED)) {
				ih03d.setUpdateDate(new Date());
				ih03d.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.update(ih03d);
			}
			if (state.equals(EntityState.DELETED)) {
				ihjc03Dao.delete(ih03d);
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih03dStu(Map<String, Object> parameters)
			throws Exception {
		Collection<Tbih03d> ListIh03d = (Collection<Tbih03d>) parameters
				.get("ListIh03d");
		String status = (String) parameters.get("status");

		for (Tbih03d ih03d : ListIh03d) {
			ih03d.setStatus(status);
			if (status.equals("01")) {
				ih03d.setStratDate(AppUtils.getCurrentDateString("yyyyMMdd"));
			} else {
				ih03d.setEndDate(AppUtils.getCurrentDateString("yyyyMMdd"));
			}
			ih03d.setUpdateDate(new Date());
			ih03d.setUpdateEmp(AppUtils.getUserName());
			ihjc03Dao.update(ih03d);
		}

	}

	@DataResolver
	public void saveTbih03e(Collection<Tbih03e> ListIh03e) throws Exception {

		for (Tbih03e ih03e : ListIh03e) {
			EntityState state = EntityUtils.getState(ih03e);
			if (state.equals(EntityState.NEW)) {
				ih03e.setIh03eId(AppUtils.generateUniqueKey());
				ih03e.setCompId(AppUtils.getCompId());
				ih03e.setCreateDate(new Date());
				ih03e.setUpdateDate(new Date());
				ih03e.setCreateEmp(AppUtils.getUserName());
				ih03e.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.save(ih03e);

			}
			if (state.equals(EntityState.MODIFIED)) {
				ih03e.setUpdateDate(new Date());
				ih03e.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.update(ih03e);
			}
			if (state.equals(EntityState.DELETED)) {
				ihjc03Dao.delete(ih03e);
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih03eStu(Map<String, Object> parameters)
			throws Exception {
		Collection<Tbih03e> ListIh03e = (Collection<Tbih03e>) parameters
				.get("ListIh03e");
		String status = (String) parameters.get("status");

		for (Tbih03e ih03e : ListIh03e) {
			ih03e.setState(status);
			if (status.equals("01")) {
				ih03e.setStartDate(AppUtils.getCurrentDateString("yyyyMMdd"));
				ih03e.setStartEmp(AppUtils.getUserName());
			} else {
				ih03e.setEndDate(AppUtils.getCurrentDateString("yyyyMMdd"));
				ih03e.setEndEmp(AppUtils.getUserName());
			}
			ih03e.setUpdateDate(new Date());
			ih03e.setUpdateEmp(AppUtils.getUserName());
			ihjc03Dao.update(ih03e);
		}

	}

	@DataResolver
	public void saveTbih03f(Collection<Tbih03f> ListIh03f) throws Exception {

		for (Tbih03f ih03f : ListIh03f) {
			EntityState state = EntityUtils.getState(ih03f);
			if (state.equals(EntityState.NEW)) {
				ih03f.setIh03fId(AppUtils.generateUniqueKey());
				ih03f.setCompId(AppUtils.getCompId());
				ih03f.setCreateDate(new Date());
				ih03f.setUpdateDate(new Date());
				ih03f.setCreateEmp(AppUtils.getUserName());
				ih03f.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.save(ih03f);

			}
			if (state.equals(EntityState.MODIFIED)) {
				ih03f.setUpdateDate(new Date());
				ih03f.setUpdateEmp(AppUtils.getUserName());
				ihjc03Dao.update(ih03f);
			}
			if (state.equals(EntityState.DELETED)) {
				ihjc03Dao.delete(ih03f);
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Expose
	public void updateTbih03fStu(Map<String, Object> parameters)
			throws Exception {
		Collection<Tbih03f> ListIh03f = (Collection<Tbih03f>) parameters
				.get("ListIh03f");
		String status = (String) parameters.get("status");

		for (Tbih03f ih03f : ListIh03f) {
			ih03f.setState(status);
			if (status.equals("01")) {
				ih03f.setStartDate(AppUtils.getCurrentDateString("yyyyMMdd"));
				ih03f.setStartEmp(AppUtils.getUserName());
			} else {
				ih03f.setEndDate(AppUtils.getCurrentDateString("yyyyMMdd"));
				ih03f.setEndEmp(AppUtils.getUserName());
			}
			ih03f.setUpdateDate(new Date());
			ih03f.setUpdateEmp(AppUtils.getUserName());
			ihjc03Dao.update(ih03f);
		}
	}
}

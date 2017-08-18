package com.demo.company;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.bstek.bdf2.core.model.DefaultCompany;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;

@Component
public class CompanyService extends HibernateDao{
	@DataProvider
	public Collection<DefaultCompany> getAll(){
		String hql = "from DefaultCompany";
		return this.query(hql);
	}
}

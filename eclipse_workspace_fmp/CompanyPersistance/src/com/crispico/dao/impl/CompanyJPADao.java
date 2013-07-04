package com.crispico.dao.impl;

import java.util.Set;

import javax.persistence.*;
import javax.persistence.Query;

import com.crispica.model.*;
import com.crispico.dao.*;

public class CompanyJPADao implements CompanyDao {

	private EntityManager entitymanager;
	
	public  CompanyJPADao(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}

	public void saveOrUpdate(Company company) {
		if (company.getId() != null)
			entitymanager.merge(company);
		else {
			entitymanager.persist(company);
			entitymanager.getTransaction().commit();
		}

	}

	@Override
	public Company loadByID(Integer id) {
		return entitymanager.find(Company.class, 1);
	}

	@Override
	public Set<Company> loadAll() {
		Query query = entitymanager.createQuery("select c from Company c");
		return (Set<Company>) query.getResultList();
	}

	@Override
	public void remove(Company company) {
		entitymanager.remove(company);

	}

}

package com.crispico.dao;

import java.util.Set;

import com.crispica.model.Company;

public interface CompanyDao {
	
	public void saveOrUpdate(Company company);
	
	public Company loadByID(Integer id);
	
	public Set<Company> loadAll();
	
	public void remove(Company company);

}

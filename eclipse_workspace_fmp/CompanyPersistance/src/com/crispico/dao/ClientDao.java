package com.crispico.dao;

import java.util.Set;

import com.crispica.model.*;

public interface ClientDao {
	
	public void saveOrUpdate(Client client);
	
	public Client loadByID(Integer id);
	
	public Set<Client> loadAll();
	
	public void remove(Client client);
	

}

package com.crispico.dao.impl.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.crispica.model.*;

public class ClientTest {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	
	@BeforeClass
	public static void initEntityManager() {
		emf = Persistence.createEntityManagerFactory("hibernate_demo");
		em = emf.createEntityManager();
	}

	@Test
	public void test() {
		em.getTransaction().begin();
		Client client = new Client();
		client.setName("Crispico");
		client.setAddress("asdf");
		em.persist(client);
		em.getTransaction().commit();
		assertEquals(1, 1);

		@SuppressWarnings("unchecked")
		List<Client> clients = em.createQuery("select c from Company c").getResultList();
		System.out.println(clients.size());
	}

}

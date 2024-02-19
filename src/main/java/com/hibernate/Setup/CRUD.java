package com.hibernate.Setup;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



// aim of this was how to crate EMF,em,et and use save ,update,delete
public class CRUD {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("Priya");
		s.setEmail("piya@gmail.com");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(s);// this is to save object
		
		em.merge(s); //update object
		
		em.remove(s); //delete a object
		

		et.commit();
	}
}

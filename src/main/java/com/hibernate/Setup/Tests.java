package com.hibernate.Setup;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
// just to see hwo find can be used
public class Tests {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	Student stu=em.find(Student.class, 1);
	System.out.println("roll no "+stu.getId() +" "+stu.getName()+" "+stu.getEmail()+" "
			);
}
}

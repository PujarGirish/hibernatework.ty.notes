package com.hibernate.Setup;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Testa {
public static void main(String[] args) {
	EntityManagerFactory entityManager =Persistence.createEntityManagerFactory("vikas");
	System.out.println(entityManager);
	System.out.println("ready ");
}
}

package com.klef.jfsd.exam;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Transaction;


public class ClientDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); 
		Transaction transaction = null;
		transaction = session.beginTransaction();
	    String sql = "UPDATE Department SET name = ?1, location = ?2 WHERE id = ?3";
	    int updatedRows = session.createQuery(sql)
	                                      .setParameter(1, "AIDS")
	                                      .setParameter(2, "GUNTUR")
	                                      .setParameter(3, 1)  
	                                      .executeUpdate();
	    transaction.commit();
	    session.close();
	    sessionFactory.close();
	        }
}


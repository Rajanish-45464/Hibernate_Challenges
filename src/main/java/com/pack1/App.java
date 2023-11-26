package com.pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Emp e=new Emp();
    	e.setId(109);
    	e.setName("Rajanish_K_P");
    	e.setCmpName("RKP_Tech");
    	
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	System.out.println("xml done configuration");
    	
    	SessionFactory s = cfg.buildSessionFactory();
    	System.out.println("Session factory done... connection done");
    	
		Session se = s.openSession();
		Transaction t = se.beginTransaction();
		se.save(e);
		t.commit();
		System.out.println("Save done");
    }
}
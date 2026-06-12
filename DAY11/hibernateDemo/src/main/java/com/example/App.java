package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration();
    	    cfg.configure("hibernate.cfg.xml");
    	   SessionFactory factory= cfg.buildSessionFactory();
        System.out.println( "Hello World!" );
        
        Student s1=new Student();
        s1.setRn(205);
        s1.setName("Raje");
        s1.setCity("Raigad");
        System.out.println(s1);
        
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(s1);
       
        tx.commit();
        session.close();
        
        System.out.println("Done....");
   //System.out.println(factory.isClosed());
    }
}

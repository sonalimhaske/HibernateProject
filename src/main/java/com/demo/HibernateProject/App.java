package com.demo.HibernateProject;
//import java.lang.module.Configuration;


import java.util.Date;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Project Started !" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        
        org.hibernate.Session session = factory.getCurrentSession();
        System.out.println(factory.isClosed());
        
        
        StudentEntity st = new StudentEntity("sonali","pune");
        System.out.println(st);
        session.beginTransaction();
        session.save(st);
        
        Session.getTransaction().commit();
        session.Close();
        //creatig  address
        
        Address add =new Address();
        add.setCity("pune");
        add.setHno(23.33);
        add.setOpen(true);
        add.setStreet("GTB Nagar");
        add.setAdd_date(new Date());
        session.beginTransaction();
        session.save(add);
    }
    
}

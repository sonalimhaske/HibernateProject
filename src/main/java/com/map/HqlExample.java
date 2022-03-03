package com.map;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

import com.demo.HibernateProject.StudentEntity;
//import com.mysql.cj.xdevapi.SessionFactory;

public class HqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure("hibernate.cgf.xml");
SessionFactory factory =cfg.buildSessionFactory();

	String query="from StudentEntity where city=:x";
	
	Session session=factory.openSession();
	
	Query q=session.createQuery(query);
	q.setParameter("x", "pune");
	
	
	List<StudentEntity> stu=q.getResultList();
	
	for(StudentEntity st:stu){
		System.out.println(st.getName());
	    System.out.println(st.getCerti());
	    
	}
	System.out.println("........");
	Transaction tx=session.beginTransaction();
	Query q1=session.createQuery("delete from StudentEntity where id=:x");
	q1.setParameter("x", 1);
	int r=q1.executeUpdate();
	System.out.println("Deleted:"+r);
	
	System.out.println("...update...");
	//Transaction tx=session.beginTransaction();
	Query q2=session.createQuery("update StudentEntity set city=:x  where course =:x1");
	q2.setParameter("x", "pune");
	q2.setParameter("x1", "java");
	int r1=q2.executeUpdate();
	System.out.println("updated:"+r1);
	tx.commit();
	session.close();
	factory.close();
	
	}

}

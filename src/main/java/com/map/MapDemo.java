package com.map;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Question Q1=new Question();
		Q1.setQues("What is sql");
		Answer ans =new Answer();
		ans.setAnswer("sql is DB");
		Q1.setAns(ans);
		
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		
		tx.commit();
       Question ques=(Question)session.load(Question.class, 5);
       System.out.println(ques.getQues());
       System.out.println(ques.getAns().getAnswer());
       
       
       session.close();
       factory.close();
	
	
	}

}

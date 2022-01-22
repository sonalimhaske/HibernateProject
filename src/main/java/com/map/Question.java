package com.map;

import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


public class Question {

	
	@ID
	@GeneratedValue(strategy=GenerationType.IDENTITY)

private int Qid;
	private String Ques;
	
	
	@OneToOne
	@JoinColumn(name="Ans_ID")
	
	private Answer Ans;
	public int getQid(){
		return Qid;
	
	}
	
	public Question(){
		super();
	}
	
	
}


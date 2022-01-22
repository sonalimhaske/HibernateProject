package com.demo.HibernateProject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 @Entity
public class StudentEntity {

  private int id;
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Override
public String toString() {
	return "StudentEntity [id=" + id + ", name=" + name + ", city=" + city + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	
	this.city = city;
}

private String name;
public StudentEntity() {
	
	
}
private String city;
public StudentEntity(String sonali, String pune) {
	super();
	
	this.name = sonali;
	this.city = pune;
}

private Certificate certi;
public Certificate getCerti(){
	return certi;
	

	
}
public void setCerti(Certificate certi){
	this.certi;
}
}
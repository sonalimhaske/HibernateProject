package com.demo.HibernateProject;

import java.beans.Transient;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student_address")
public class Address{
	@ID
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADD_ID")
	private int add_id;
	@Column(length =50,name="STREET")
	private String street;
	
	@Column(length =50,name="CITY")
	private String city;
	private boolean open;
	@Transient
	private double open;
	@Temporal(TemporalType.DATE)
	
	private double hno;
	@Lob
	private byte[] image;
	public Address(){
		super();
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return open1;
	}
	public void setOpen(boolean open) {
		this.open1 = open;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open1 = open;
	}
	public double getHno() {
		return hno;
	}
	public void setHno(double hno) {
		this.hno = hno;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address(int add_id, String street, String city, boolean open, double hno, byte[] image) {
		super();

		this.street = street;
		this.city = city;
		this.open1 = open;
		this.hno = hno;
		this.image = image;
	}
	
}

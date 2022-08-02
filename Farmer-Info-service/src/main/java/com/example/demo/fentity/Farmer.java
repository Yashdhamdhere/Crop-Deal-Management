package com.example.demo.fentity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="FarmerDetails")
public class Farmer {
	
	@Id
	private int farmerId;
	private String firstname;
	private String lastname;
	private int age;
	
	public Farmer() {
		
	}
	public Farmer(int farmerId, String firstname, String lastname,int age) {
		super();
		this.farmerId = farmerId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return farmerId;
	}
	public void setId(int farmerid) {
		this.farmerId = farmerid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}

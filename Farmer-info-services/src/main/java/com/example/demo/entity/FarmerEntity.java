package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Farmers")
public class FarmerEntity {
	
	@Id
	private int cropid;
	private String typeofCrop;
	private String location;
	private int quantity;
	private int price;
	
	public FarmerEntity() {
		super();
	}
	public FarmerEntity(int cropid,String typeofCrop, String location, int quantity, int price) {
		super();
		this.cropid=cropid;
		this.typeofCrop = typeofCrop;
		this.location = location;
		this.quantity = quantity;
		this.price = price;
	}
	public int getCropid() {
		return cropid;
	}
	public void setCropid(int cropid) {
		this.cropid = cropid;
	}
	public String getTypeofCrop() {
		return typeofCrop;
	}
	public void setTypeofCrop(String typeofCrop) {
		this.typeofCrop = typeofCrop;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

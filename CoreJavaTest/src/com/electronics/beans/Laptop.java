package com.electronics.beans;

public class Laptop extends Device {
	private Integer price;
	
	public Laptop(Integer price){
		this.deviceType = "Laptop";
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	

}

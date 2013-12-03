package com.electronics.beans;

public class Smartphone extends Device {
	Integer price;
	public Smartphone(Integer price){
		this.price = price;
		this.deviceType = "Smartphone";
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}

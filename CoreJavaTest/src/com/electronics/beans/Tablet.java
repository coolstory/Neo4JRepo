package com.electronics.beans;

public class Tablet extends Device{
	Integer price;
	public Tablet(Integer price){
		this.price = price;
		this.deviceType = "Tablet";
	}
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}

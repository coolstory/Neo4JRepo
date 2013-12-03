package com.electronics.beans;

public class DesktopComputer extends Device{
	private Integer price;
	public DesktopComputer(Integer price){
		this.price =price;
		this.deviceType = "desktopComputer";
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	

 
	

}

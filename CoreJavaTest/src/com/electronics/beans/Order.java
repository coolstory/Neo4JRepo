package com.electronics.beans;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private	Customer customer;
	private	Integer orderId;
	private	String deviceType;
	private	Integer numberOfDevices;
	private	Integer totalAmount;
	private	static final String orderStatus = "placed";
	
	
	public Order(){
		
	}
	public Order(Customer customer, Integer orderId, String deviceType,
			Integer numberOfDevices, Integer totalAmount) {
		super();
		this.customer = customer;
		this.orderId = orderId;
		this.deviceType = deviceType;
		this.numberOfDevices = numberOfDevices;
		this.totalAmount = totalAmount;
	}
	public List<Order> makeOrder(Customer customer, Integer orderId, String deviceType,
			Integer numberOfDevices, Integer totalAmount){
		List<Order> order = new ArrayList<Order>();
		return order;
		
		
		

}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public Integer getNumberOfDevices() {
		return numberOfDevices;
	}
	public void setNumberOfDevices(Integer numberOfDevices) {
		this.numberOfDevices = numberOfDevices;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public static String getOrderstatus() {
		return orderStatus;
	}
}
package com.electronics.beans;

import java.util.ArrayList;
import java.util.List;



public class Customer implements Runnable {
	private Integer customerId;
	private String customerName;
	Order order = new Order();
	public Customer(Integer id, String name){
		this.customerId = id;
		this.customerName = name;
	}
	Customer customrList;
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Customer> makeCustomerList(int cid, String cname){
		List<Customer> cust = new ArrayList<Customer>();
	    cust.add(new Customer(1, "Tom"));
		cust.add(new Customer(2, "Sam"));
		cust.add(new Customer(3, "Abc"));
		cust.add(new Customer(4, "Xyx"));
		cust.add(new Customer(5, "Phf"));
		cust.add(new Customer(6, "jkf"));
		cust.add(new Customer(7, "Loif"));
		cust.add(new Customer(8, "tuy"));
		cust.add(new Customer(9, "Shel"));
		cust.add(new Customer(10, "Jo"));
		cust.add(customrList);
		return cust;
}
	public void showOrderDetails(int orderId){
		if(order.getOrderId() == orderId){
			System.out.println("Order placed");
		}
		
		
	}

	@Override
	public void run() {
		try{
			Thread.sleep(100);
			showOrderDetails(1);
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}

}

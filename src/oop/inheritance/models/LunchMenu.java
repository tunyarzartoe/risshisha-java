package oop.inheritance.models;

public class LunchMenu extends Menu {
	
	private String service;

	public void setService(String service) {
		this.service = service;
	}
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("サービス : " + service);
	}

}

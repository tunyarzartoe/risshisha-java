package oop.inheritance.models;

public class Sales extends EmployeeBean {

	private String area;
	
	public void setArea(String area) {
		this.area = area;
	}
	public void displaySales() {
		System.out.println("担当地域名　：" + area);
	}
	
}

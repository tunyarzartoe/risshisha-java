package oop.access_level_and_packaging;

public class Order {
	private int no;
	private String custName;
	public Order(int no, String custName) {
		super();
		this.no = no;
		this.custName = custName;
	}
	public int getNo() {
		return no;
	}
	public String getCustName() {
		return custName;
	}
}

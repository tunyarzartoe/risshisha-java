package oop.inheritance.models;

public class LimitedProduct extends Product{

	private int quantity;
	public LimitedProduct(String name, int price,int quantity) {
		super(name, price);
		this.quantity = quantity;
	}
	
	public void display() {
		String name = super.getName();
		int price = super.getPrice();
		System.out.println("製品名 : " + name);
		System.out.println("価格 : " + price + "円");
		System.out.println("限定数量 : " + quantity + "個");
	}
	
}

package oop.inheritance.models;

public class Book implements ItemStandard {
	
	private int price;
	public Book(int price) {
		super();
		this.price = price;
	}

	@Override
	public void printPrice() {
		System.out.println("定価　："+ price + "円");
	}

}

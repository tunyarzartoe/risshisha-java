package oop;

class Product {
	String no;
	String name;
	int price;
	int quantity;
	void display() {
		int total = price * quantity;
		System.out.println("ナンバー :" + no );
		System.out.println("製品名 :" + name );
		System.out.println("価格 :" + price + "円");
		System.out.println("数量 :" + quantity + "個");
		System.out.println("合計金額 :" + total + "円");
	}
}

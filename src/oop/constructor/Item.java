package oop.constructor;

class Item {
	int no;
	String name;
	int price;
	
	Item(int no) {
		// TODO Auto-generated constructor stub
		this(no,"未登録",0);
	}
	
	Item(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("商品番号 : " + no);
		System.out.println("商品名 : " + name);
		System.out.println("単価 : " + price + "円");
	}
	
}

package constructor;

class Menu {
	String name;
	int price;
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	void display() {
		// TODO Auto-generated method stub
		System.out.println("品名 : " + name);
		System.out.println("単価 : " + price + "円");
	}
	
}

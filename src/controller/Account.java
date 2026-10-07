package controller;

class Account {
	int number;
	String name;
	
	public Account(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	void display() {
		// TODO Auto-generated method stub
		System.out.println("口座番号 :" + number);
		System.out.println("口座名義 :" + name);
	}
	
}

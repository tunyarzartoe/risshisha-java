package constructor;

class Account {
	int number;
	String name;
	
	Account(int nu, String na) {
		number = nu;
		name = na;
	}
	void display() {
		// TODO Auto-generated method stub
		System.out.println("口座番号 :" + number);
		System.out.println("口座名義 :" + name);
	}
	
}

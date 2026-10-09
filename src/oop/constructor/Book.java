package oop.constructor;

class Book {
	String title;
	String author;
	int price;

	Book(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("書籍名 : " + title);
		System.out.println("筆者 : " + author);
		System.out.println("単価 : " + price + "円");
	}
	
}

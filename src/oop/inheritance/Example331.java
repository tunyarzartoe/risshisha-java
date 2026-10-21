package oop.inheritance;

import oop.inheritance.models.Book;

public class Example331 {

	public static void main(String[] args) {
		System.out.println("書箱情報　＞");
		Book book = new Book(2500);
		book.printPrice();
	}

}

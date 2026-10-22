package oop.inheritance.models;


public class BirthdayGift  extends Gift{

	public BirthdayGift(int code, String name) {
		super(code, name);
	}
	public void displayGift() {
		System.out.println("バースデーギフト＞");
		super.displayGift();
	}
}

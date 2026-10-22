package oop.inheritance.models;


public class WeddingGift  extends Gift{

	public WeddingGift(int code, String name) {
		super(code, name);
	}
	public void displayGift() {
		System.out.println("ウェディングギフト＞");
		super.displayGift();
	}
}

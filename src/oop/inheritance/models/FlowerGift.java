package oop.inheritance.models;


public class FlowerGift  extends Gift{

	public FlowerGift(int code, String name) {
		super(code, name);
	}
	public void displayGift() {
		System.out.println("フラワーギフト＞");
		super.displayGift();
	}
}

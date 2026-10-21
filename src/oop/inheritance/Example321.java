package oop.inheritance;

import oop.inheritance.models.LunchMenu;

public class Example321 {

	public static void main(String[] args) {
		LunchMenu lunchMe = new LunchMenu();
		lunchMe.setName("チキンステーキ");
		lunchMe.setPrice(4000);
		lunchMe.setService("ドリンクバー");
		lunchMe.display();
	}

}

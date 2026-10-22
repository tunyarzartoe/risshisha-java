package oop.inheritance;

import java.util.ArrayList;

import oop.inheritance.models.BirthdayGift;
import oop.inheritance.models.Gift;
import oop.inheritance.models.WeddingGift;

public class Example342 {

	public static void main(String[] args) {
		Gift gift1 = new BirthdayGift(12321, "Iphone");
		Gift gift2 = new WeddingGift(5678876, "Car");
		ArrayList<Gift> list = new ArrayList<Gift>();
		list.add(gift1);
		list.add(gift2);
		for(Gift gift : list) {
			gift.displayGift();
		}
	}

}

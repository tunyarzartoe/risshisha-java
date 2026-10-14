package oop.access_level_and_packaging;

import java.util.ArrayList;

public class Example252 {

	public static void main(String[] args) {
		ArrayList<Gift> list = new ArrayList<Gift>();
		Gift gift1 = new Gift(1232, "キキョウの花東");
		Gift gift2 = new Gift(2121, "ユリのブーケ");
		list.add(gift1);
		list.add(gift2);
		for (int i = 0; i < list.size(); i++) {
			Gift gift = list.get(i);
			System.out.println("ギフトコート　: " + gift.getCode() );
			System.out.println("ギフト名　   : " + gift.getName());
		}
	}

}

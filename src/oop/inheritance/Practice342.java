package oop.inheritance;

import java.util.ArrayList;
import java.util.Scanner;

import oop.inheritance.models.BirthdayGift;
import oop.inheritance.models.FlowerGift;
import oop.inheritance.models.Gift;
import oop.inheritance.models.WeddingGift;
public class Practice342 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("商品コード１　＞");
			int code1 = sc.nextInt();
			System.out.print("商品名１　＞");
			String name1 = sc.next();
			Gift gift1 = new FlowerGift(code1, name1);
			System.out.print("商品コード2　＞");
			int code2 = sc.nextInt();
			System.out.print("商品名2　＞");
			String name2 = sc.next();
			Gift gift2 = new BirthdayGift(code2, name2);
			System.out.print("商品コード3　＞");
			int code3 = sc.nextInt();
			System.out.print("商品名3　＞");
			String name3 = sc.next();
			Gift gift3 = new WeddingGift(code3, name3);
			ArrayList<Gift> list = new ArrayList<Gift>();
			list.add(gift1);
			list.add(gift2);
			list.add(gift3);
			for(Gift gift : list) {
				gift.displayGift();
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}

}

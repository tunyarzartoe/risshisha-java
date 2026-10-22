package oop.inheritance;

import java.util.Scanner;

import oop.inheritance.models.FlowerGift;
public class Practice342 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("商品コード１　＞");
			int code1 = sc.nextInt();
			System.out.print("商品名１　＞");
			String name1 = sc.next();
			FlowerGift gift1 = new FlowerGift(code1, name1);
			
			sc.close();
		} catch (Exception e) {
			System.out.println("送信できませんした！");
		}
	}

}

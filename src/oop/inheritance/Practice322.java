package oop.inheritance;

import java.util.Scanner;

import oop.inheritance.models.LimitedProduct;
public class Practice322 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("製品名　＞");
			String name = sc.next();
			System.out.print("価格　＞");
			int price = sc.nextInt();
			System.out.print("限定数量　＞");
			int quantity = sc.nextInt();
			LimitedProduct litProd = new LimitedProduct(name, price, quantity);
			litProd.display();
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}

}

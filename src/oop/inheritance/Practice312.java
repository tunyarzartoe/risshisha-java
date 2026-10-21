package oop.inheritance;

import java.util.Scanner;

import oop.inheritance.models.Sales;

public class Practice312 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("社員ID　＞");
			int id = sc.nextInt();
			System.out.print("社員名　＞");
			String name = sc.next();
			System.out.print("担当地域名　＞");
			String area = sc.next();
			Sales sale = new Sales();
			sale.setId(id);
			sale.setName(name);
			sale.display();
			sale.setArea(area);
			sale.displaySales();
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}

}

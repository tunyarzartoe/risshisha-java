package oop.inheritance;

import java.util.Scanner;

import oop.inheritance.models.CellPhone;
public class Practice332 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("奥先　＞");
			String address = sc.next();
			CellPhone phone = new CellPhone();
			phone.setAddress(address);
			phone.email();
			System.out.print("アドレス　＞");
			String url = sc.next();
			phone.setURL(url);
			phone.webBrowser();
			sc.close();
		} catch (Exception e) {
			System.out.println("送信できませんした！");
		}
	}

}

package oop.access_level_and_packaging;

import java.util.Scanner;

public class Practice241 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("メールアドレス　＞ ");
			String mail1 = sc.next();
			System.out.print("パスワード　   ＞ ");
			String pass1 = sc.next();
			Login login = new Login(mail1, pass1);
			String mail2 = login.getMail();
			String pass2 = login.getPass();
			System.out.println("メールアドレス　＞" + mail2);
			System.out.println("パスワード　   ＞" + pass2);
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}

}

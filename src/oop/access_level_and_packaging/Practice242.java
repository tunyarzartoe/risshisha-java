package oop.access_level_and_packaging;

import java.util.Scanner;

public class Practice242 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("社員ID　＞");
			int id1 = sc.nextInt();
			System.out.print("社員名　＞");
			String name1 = sc.next();
			EmployeeBean emyployee = new EmployeeBean(id1, name1);
			int id2 = emyployee.getId();
			String name2 = emyployee.getName();
			System.out.println("社員ID　＞" + id2);
			System.out.println("社員名　＞" + name2);
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}

}

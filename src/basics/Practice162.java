package basics;
import java.util.Scanner;

class Practice162 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("ユーザー　登録");
			System.out.print("名前（必須）＞");
			String name = sc.next();
			System.out.print("年齢（0：登録しない　）＞");
			int age = sc.nextInt();
			if (age != 0) {
				register(name, age);
			} else {
				register(name);
			}
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("入力値は不正です。");
		}
	}

	static void register(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println("名前 :" + name + "　を登録しました。");
		System.out.println("年齢 :" + age + "　を登録しました。");
	}

	static void register(String name) {
		// TODO Auto-generated method stub
		System.out.println("名前 :" + name + "を登録しました。");
	}

}

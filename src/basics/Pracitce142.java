package basics;
import java.util.Scanner;

class Pracitce142 {

	public static void main(String[] args) {
		try {
			System.out.println("＜パスワード　登録＞");
			System.out.print("整数　４桁以上 8 桁以下　＞ :");
			Scanner sc =  new Scanner(System.in);
			int pass = sc.nextInt();
			if (pass >= 1000 && pass <= 99999999) {
				System.out.println("パスワード　を登録しました。");
			}else {
				System.out.println("もう一度やり直して下さい。");
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("入力は誤りです。");
		}
	}
}

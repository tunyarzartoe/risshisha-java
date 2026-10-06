import java.util.Scanner;

class Example141 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("パスワード　(整数４)　＞ :");
		int pass = sc.nextInt();
		if(pass == 7777) {
			System.out.print("確証　OK");
		}else {
			System.out.print("エラー");
		}
		sc.close();
	}
}

package basics;
import java.util.Scanner;

class Example141 {

	public static void main(String[] args) {
		try {
			System.out.print("入力　(1~10)　＞ :");
			Scanner sc =  new Scanner(System.in);
			int num = sc.nextInt();
			if(num >= 1) {
				if(num<=10){
					System.out.print("入力値は範囲内です。");
				}else {
					System.out.print("入力値は範囲外です。");
				}
			}else {
				System.out.print("入力値は範囲外です。");
			}
			sc.close();
		}catch(Exception e) {
			System.out.print("入力値は不正です。");
		}
	}
}

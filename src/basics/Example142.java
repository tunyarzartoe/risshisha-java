package basics;
import java.util.Scanner;

class Example142 {
	public static void main(String[] args) {
			Scanner sc =  new Scanner(System.in);
			System.out.println("誕生日　＞");
			int year = sc.nextInt();
			if(year >= 1989) {
				System.out.println("平成生まれです。");
			}else  if(year >= 1927){
				System.out.print("昭和生まれです。");
			}
			sc.close();
	}
}

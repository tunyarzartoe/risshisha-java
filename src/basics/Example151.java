package basics;
import java.util.Scanner;

class Example151 {
	public static void main(String[] args) {
			Scanner sc =  new Scanner(System.in);
			System.out.print("カウント数　＞");
			int num = sc.nextInt();
			int i = 0;
			while(i < num) {
				System.out.println("カウント :"+ i);
				i++;
			}
			sc.close();
	}
}

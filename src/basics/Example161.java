package basics;
import java.util.Scanner;

class Example161 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("金額　＞");
			int num = sc.nextInt();
			double result = tax(num);
			System.out.println("税込金額　：" + result + "円");
			sc.close();
	}
	static double tax(int data) {
		double ans = data * 1.1;
		return ans;
	}
}

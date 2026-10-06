import java.util.Scanner;

class Example122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.print("チケットの枚数を入力して下さい > ");
		int count = sc.nextInt();
		int money = 600 * count;
		System.out.println
			("大人" + count + "枚の料金" + money + "円");
		sc.close();
	}

}

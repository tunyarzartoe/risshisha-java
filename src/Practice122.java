import java.util.Scanner;

class Practice122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc =  new Scanner(System.in);
			System.out.print("金額を入力して下さい > ");
			int money = sc.nextInt();
			int bill = money / 10000;
			int rem = money % 10000;
			System.out.print("10000円紙 :" + bill + "枚");
			System.out.print("残り :" + rem + "円");
			sc.close();
		}catch(Exception e) {
			System.out.print("エラーが発生しました。");
		}
	}
}

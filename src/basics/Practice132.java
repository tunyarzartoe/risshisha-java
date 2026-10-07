package basics;
import java.util.Scanner;

class Practice132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[][] price = {{6500,7000,8000},{7500,8500,9600},{10000,11500,14000}};
			System.out.println("＜レンタカー料金＞");
			System.out.print("0 : コンパクト , 1 :スタンダート , 2 :プレミアム >");
			Scanner sc =  new Scanner(System.in);
			int num = sc.nextInt();
			System.out.print("0 : ６ 時間 , 1 :12時間 , 2 :　24時間 >");
			int hour = sc.nextInt();
			System.out.println("料金　:" + price[num][hour] + "円");
			sc.close();
		}catch(Exception e) {
			System.out.println("エラーが発生しました。");
		}
	}

}

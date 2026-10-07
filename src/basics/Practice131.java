package basics;
import java.util.Scanner;

class Practice131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] ticket = {1800,1200,600};
			System.out.print("0 : 大人 , 1 :高校生 , 2 :中学生  >");
			Scanner sc =  new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println("料金　:" + ticket[num] + "円");
			sc.close();
		}catch(Exception e) {
			System.out.println("エラーが発生しました。");
		}
	}

}

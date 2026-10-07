import java.util.Scanner;

class Practice151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc =  new Scanner(System.in);
			System.out.print("整数を入力 > ");
			int num = sc.nextInt();
			int i = 1;
			int sum = 0;
			while (i <= num) {
				sum = sum + i;
				i++;
			}
			System.out.println("1から "+ num +" までの合計 :" + sum);
			sc.close();
		}catch(Exception e) {
			System.out.print("入力値は不正です。");
		}
	}
}

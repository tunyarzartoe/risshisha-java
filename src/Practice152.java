import java.util.Scanner;

class Practice152 {
	public static void main(String[] args) {
			try {
				int[] scales = new int[3];
				Scanner sc = new Scanner(System.in);
				for (int i = 0; i < scales.length; i++) {
					System.out.print("データ入力" +(i+1)+"件目　>");
					scales[i] = sc.nextInt();
				}
				int total = 0;
				for (int i = 0; i < scales.length; i++) {
					System.out.println((i+1)+" 件目　:"+ scales[i]);
					total = total + scales[i];
				}
				System.out.println("データー合計 :" + total);
				sc.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("入力値は不正です。");
			}
	}
}

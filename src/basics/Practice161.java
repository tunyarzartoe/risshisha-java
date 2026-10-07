package basics;
import java.util.Scanner;

class Practice161 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ユーザーID　＞");
			String userId = sc.next();
			System.out.print("パスワード　＞");
			int password = sc.nextInt();
			String result = loginCheck(userId,password);
			System.out.println(result);
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("入力値は不正です。");
		}
	}

	static String loginCheck(String userId, int password) {
		// TODO Auto-generated method stub
		if (userId.equals("G1010") && password == 8888) {
			return "ログインしました。";
		}else {
			return "IDまたはパスワードは違います。";
		}
	}
}

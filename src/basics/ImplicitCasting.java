package basics;

public class ImplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 9;
		double myDouble = myInt; // 自動的に int から double へ変換される

		System.out.println(myInt);    // 出力: 9
		System.out.println(myDouble); // 出力: 9.0 (.0 が補完される)
	}

}

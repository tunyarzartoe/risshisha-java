package basics.type_casting;

public class ExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myDouble = 9.78d;
		int myInt = (int) myDouble; // 手動で (int) と記述してキャストする

		System.out.println(myDouble); // 出力: 9.78
		System.out.println(myInt);    // 出力: 9 (小数点以下 .78 が切り捨てられる)
	}

}

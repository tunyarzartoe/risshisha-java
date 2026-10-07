
class Example162 {
	public static void main(String[] args) {
			charge(3);
			charge(700,3);
	}

	static void charge(int i, int j) {
		// TODO Auto-generated method stub
		int money = j * i;
		System.out.println("合計料金 :" + money + "円");
	}

	static void charge(int i) {
		// TODO Auto-generated method stub
		int money = 600 * i;
		System.out.println("合計料金 :" + money + "円");
	}

}

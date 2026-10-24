package basics;

class HelloWorld {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (++i < 8) {
			sum += i;
			System.out.println(sum);
		}
		System.out.println(sum);
		System.out.println("Hello World");
	}

}

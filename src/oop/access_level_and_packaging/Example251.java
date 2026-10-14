package oop.access_level_and_packaging;

public class Example251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gift[] gitArray = new Gift[2];
		gitArray[0] = new Gift(1123, "カーネーションのブーケ");
		gitArray[1] = new Gift(2121, "バラのアレンジメント");
		int code1  = gitArray[0].getCode();
		String name1  = gitArray[0].getName();
		int code2  = gitArray[1].getCode();
		String name2  = gitArray[1].getName();
		System.out.println("ギフトコート　: " + code1);
		System.out.println("ギフト名　   : " + name1);
		System.out.println("ギフトコート　: " + code2);
		System.out.println("ギフト名　   : " + name2);
	}

}

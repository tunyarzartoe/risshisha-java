package oop.access_level_and_packaging;

public class Example242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gift gift = new Gift(1242, "バラのアレンジメント");
		int code = gift.getCode();
		String name = gift.getName();
		System.out.println("ギフトコート　: " + code);
		System.out.println("ギフト名　   : " + name);
	}

}

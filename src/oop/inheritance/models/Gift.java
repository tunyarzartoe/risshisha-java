package oop.inheritance.models;

public class Gift {

	private int code;
	private String name;
	public Gift(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public void displayGift() {
		// TODO Auto-generated method stub
		System.out.println("ギフトコード　：" + code);
		System.out.println( "ギフト名　："+ name);
	}
	
}

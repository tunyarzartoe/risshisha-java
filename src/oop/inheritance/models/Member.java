package oop.inheritance.models;

public class Member {
	private int no;
	private String name;
	public Member(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public void display() {
		System.out.println("会員番号 : " + no);
		System.out.println("会員名 : " + name);
	}
}

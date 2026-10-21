package oop.inheritance.models;

public class VipMember extends Member{
	
	private int vipId;

	public VipMember(int no, String name,int vipId) {
		super(no, name);
		this.vipId = vipId;
	}
	public void display() {
		super.display();
		System.out.println("VIP　会員ID : " + vipId);
	}

}

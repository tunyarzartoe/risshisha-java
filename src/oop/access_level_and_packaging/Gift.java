package oop.access_level_and_packaging;

public class Gift {
	private int code;
	private String name;
	public Gift(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
}

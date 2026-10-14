package oop.access_level_and_packaging;

public class EmployeeBean {
	private int id;
	private String name;
	public EmployeeBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}

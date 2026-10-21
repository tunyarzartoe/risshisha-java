package oop.inheritance.models;

public class Development extends EmployeeBean{

	private String project;

	public void setProject(String project) {
		this.project = project;
	}
	public void display() {
		super.display();
		System.out.println("プロジェクト名　：" + project);
	}
}

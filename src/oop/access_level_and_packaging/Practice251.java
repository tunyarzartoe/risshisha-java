package oop.access_level_and_packaging;

import java.util.Scanner;

public class Practice251 {

	public static void main(String[] args) {
		EmployeeBean[] arrayEmployee = new EmployeeBean[3];
		arrayEmployee[0] = new EmployeeBean(1212, "佐藤");
		arrayEmployee[1] = new EmployeeBean(1313, "中村");
		arrayEmployee[2] = new EmployeeBean(1414, "はるき");
		for (int i = 0; i < arrayEmployee.length; i++) {
			EmployeeBean employeeBean = arrayEmployee[i];
			int id = employeeBean.getId();
			String name = employeeBean.getName();
			System.out.println("社員ID　＞" + id);
			System.out.println("社員名　＞" + name);
		}
	}

}

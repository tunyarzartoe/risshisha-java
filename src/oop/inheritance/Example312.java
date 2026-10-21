package oop.inheritance;

import oop.inheritance.models.WebAccount;

public class Example312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebAccount  webAcc = new WebAccount();
		webAcc.setNumber(1234432);
		webAcc.setName("佐藤　先生");
		webAcc.display();
		webAcc.setEmail("satou@gamil.com");
		webAcc.displayWebAccount();
	}

}

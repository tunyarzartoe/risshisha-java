package oop.access_level_and_packaging;

import java.util.ArrayList;

public class Practice252 {
	public static void main(String[] args) {
		ArrayList<Order> orderList = new ArrayList<Order>();
		Order order1 = new Order(780, "中村 社長");
		Order order2 = new Order(800, "青山　店長");
		Order order3 = new Order(813, "佐藤　先生");
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		for (int i = 0; i < orderList.size(); i++) {
			Order order = orderList.get(i);
			System.out.println("注文番号　: " + order.getNo());
			System.out.println("お客名　　: " + order.getCustName());
		}
//		for(Order order: orderList) {
//			int no = order.getNo();
//			String name = order.getCustName();
//			System.out.println("注文番号　: " + no);
//			System.out.println("お客名　　: " + name);
//		}
		
	}
}

package chapter8th.section01;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		VIPCustomer customerHong = new VIPCustomer(10030, "홍길동", 123);
		VIPCustomer customerYoul = new VIPCustomer(10040, "이율곡", 456);
		VIPCustomer customerKim = new VIPCustomer(10050, "김유신", 789);

		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);

		System.out.println("==========고객정보 출력==========");

		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println();

		System.out.println("==========할인율과 보너스 포인트 결과==========");

		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셨습니다.");

			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}
}

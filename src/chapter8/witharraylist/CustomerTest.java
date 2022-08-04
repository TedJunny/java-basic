package chapter8.witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer(10010, "Ted");
        Customer customer2 = new Customer(10011, "Terry");
        GoldCustomer customer3 = new GoldCustomer(10012, "Mary");
        VIPCustomer customer4 = new VIPCustomer(10013, "Hailey", 123);

        customers.add(customer);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        System.out.println("=========== 고객정보 출력 ===========");

        for (Customer c : customers) {
            System.out.println(c.showCustomerInfo());
        }

        System.out.println();
        System.out.println("=========== 할인율과 보너스 포인트 결과 출력 ===========");

        int price = 10000;
        for (Customer c : customers) {
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName() + "님이 " + cost + "를 지불하셨습니다.");
            System.out.println(c.showCustomerInfo());
            System.out.println();
        }
    }
}

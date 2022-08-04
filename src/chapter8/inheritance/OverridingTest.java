package chapter8.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customer = new Customer(100010, "Lee");
        customer.calcPrice(10000);
        System.out.println(customer.showCustomerInfo());


        VIPCustomer vipCustomer = new VIPCustomer(100010, "Lee", 100);
        vipCustomer.calcPrice(10000);
        System.out.println(vipCustomer.showCustomerInfo());

        // 묵시적 형변환과 재정의된 메소드 호출, 함수가 오버라이드 되었다면 묵시적 형변환 된 상태에서 오버라이드 된 함수를 호출
        Customer customer2 =  new VIPCustomer(100010, "Lee", 100);
        int price = customer2.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " +customer2.showCustomerInfo());
    }
}

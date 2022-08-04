package chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        /*Customer customer = new Customer();
        customer.setCustomerID(10100);
        customer.setCustomerName("Lee");*/

        VIPCustomer vipCustomer = new VIPCustomer();
        vipCustomer.setCustomerID(10101);
        vipCustomer.setCustomerName("Kim");

//        System.out.println(customer.showCustomerInfo());
        System.out.println(vipCustomer.showCustomerInfo());
    }
}

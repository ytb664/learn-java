public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 1000,
                "tim@email.com");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getCustomerEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getCustomerName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getCustomerEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getCustomerName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getCustomerEmail());
    }
}

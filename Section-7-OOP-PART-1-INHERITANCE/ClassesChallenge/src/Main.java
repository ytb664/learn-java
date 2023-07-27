public class Main {

    public static void main(String[] args) {

//        Account account = new Account("12345", 500,
//                "Bob Brown", "myemail@bob.com",
//                "(087) 123 4567");

        Account account = new Account();

        System.out.println(account.getNumber());
        System.out.println(account.getBalance());

//        account.setNumber("12345");
//        account.setBalance(1000.00);
//        account.setName("Bob Brown");
//        account.setEmail("myemail@bob.com");
//        account.setPhoneNumber("(087) 123-4567");

        account.withdraw(100.0);
        account.deposit(250);
        account.withdraw(50);

        account.withdraw(200);

        account.deposit(100);
        account.withdraw(45.55);
        account.withdraw(54.46);

        account.withdraw(54.45);

        Account timsAccount = new Account("Tim",
                "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() +
                "; name " + timsAccount.getName());
    }
}
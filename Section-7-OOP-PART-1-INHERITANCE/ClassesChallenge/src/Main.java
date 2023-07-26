public class Main {

    public static void main(String[] args) {

        Account account = new Account();

        account.setNumber("12345");
        account.setBalance(1000.00);
        account.setName("Bob Brown");
        account.setEmail("myemail@bob.com");
        account.setPhoneNumber("(087) 123-4567");

        account.withdraw(100.0);
        account.deposit(250);
        account.withdraw(50);

        account.withdraw(200);

        account.deposit(100);
        account.withdraw(45.55);
        account.withdraw(54.46);

        account.withdraw(54.45);

//        account.setNumber("1010");
//        account.setBalance(100);
//        account.setName("Zim");
//        account.setEmail("zim@gmail.com");
//        account.setPhoneNumber("085156348470");
//
//        account.deposit(1000);
//        account.withdraw(626);
//        System.out.println("Balance: " + account.getBalance());
//        System.out.println();
//
//        System.out.println("Account Number: " + account.getNumber());
//        System.out.println("Account Owner: " + account.getName());
//        System.out.println("Account Balance: $" + account.getBalance());
//        System.out.println("Email: " + account.getEmail());
//        System.out.println("Phone Number: " + account.getPhoneNumber());

    }
}
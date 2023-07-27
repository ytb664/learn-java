public class Account {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this("56789", 2.50, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String name, String email,
                    String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this("99999", 100.55, name, email, phoneNumber);
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit) {
        balance += deposit;
        System.out.println("Deposit of $" + deposit + " made. New balance is $" +
                balance);
    }

    public void withdraw(double withdraw) {

        if (withdraw > balance) {
            System.out.println("Insufficient Funds! You only have $" + balance +
                    " in your account.");
        } else if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal of $" + withdraw +
                    " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
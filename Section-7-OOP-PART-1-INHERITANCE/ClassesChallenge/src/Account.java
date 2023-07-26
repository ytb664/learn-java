public class Account {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

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
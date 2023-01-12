package question01;

public class Account {

    private String accountNumber;
    private String name;
    private double balance;

    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(float amount){
        balance = balance + amount;
        System.out.println("Succesfully Deposited : " + amount);
    }

    public String withdraw(float amount){
        if(amount > balance){
            return "Insufficient Balance";
        }
        balance = balance - amount;
        return "Successfully withdrawn /n Remaining amount : " + balance ;
    }

}

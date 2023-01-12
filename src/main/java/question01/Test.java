package question01;

public class Test {

    public static void main(String[] args) {

        Account account = new Account("12345","Amit", 200394);
        account.deposit(1234);
        System.out.println(account.getBalance());
        System.out.println(account.withdraw(12345));
        System.out.println(account.getBalance());
        System.out.println(account.withdraw(200394434));
        System.out.println("Final Balance " + account.getBalance());
    }
}

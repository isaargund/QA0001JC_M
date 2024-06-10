package homeWork.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        C08_BankAccount account = new C08_BankAccount();
        account.setAccountNumber("123456789");
        System.out.println(account.getAccountNumber());
        account.setBalance(1000);
        System.out.println(account.getBalance());
        System.out.println(account.deposit(500));
        System.out.println(account.withdraw(200));
        System.out.println(account.withdraw(2000));


    }
}

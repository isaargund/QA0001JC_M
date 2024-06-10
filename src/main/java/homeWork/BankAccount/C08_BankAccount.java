package homeWork.BankAccount;

public class C08_BankAccount {

//1- Create a class called "BankAccount" with the following private properties: "accountNumber" (String),
// "balance" (double).
// 2-Provide public getter and setter methods for the "accountNumber" and "balance" properties to
// allow controlled access to these properties.
// 3-Write a method called "deposit" that takes an amount (double) as a parameter and adds it to the balance.
// 4-Write a method called "withdraw" that takes an amount (double)
// as a parameter and subtracts it from the balance if there are sufficient funds;
// otherwise, print an error message.
// 6-In the main method, create an instance of the "BankAccount" class, set the account number
// and initial balance, and test the deposit and withdraw methods.
    //set accountNumber = "123456789"
    //set balance = 1000
    // deposit = 500
    // withdraw = 200
    // Test insufficient funds = 2000
    private String accountNumber="";
    private double balance=0;

    public double deposit(double a){
        balance= balance+a;
        return balance;
    }
    public  double withdraw(double a){
        if (balance-a>-1){
        balance= balance-a;}else {
            System.out.println("inufficient funds");
        }
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

package Assignment2.oop;

public class BankAccount {

    private final long accountNumber;
    private int balance;

    public BankAccount(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}

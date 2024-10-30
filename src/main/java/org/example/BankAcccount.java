package org.example;

public class BankAcccount {

    private double balance;
    private double minimumBalance;
    private String accountHolderName;

    public BankAcccount() {
        this.balance = 0;
        this.minimumBalance = 0;
    }

    public BankAcccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public String withdraw(double withdraw) {
        if (this.balance - withdraw < this.minimumBalance) {
            return "Unable to withdraw. Insufficient funds available.";
        }
        this.balance -= withdraw;
        return "Successful withdraw. Posting cash now.";
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }


}

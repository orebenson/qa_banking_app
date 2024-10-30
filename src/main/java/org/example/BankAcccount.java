package org.example;

public class BankAcccount {

    private double balance;
    private double minimumBalance;
    private String accountHolderName;

    public BankAcccount() {
        this.balance = 0;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
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

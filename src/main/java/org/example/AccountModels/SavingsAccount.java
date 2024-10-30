package org.example.AccountModels;

import org.example.BankAcccount;

public class SavingsAccount extends BankAcccount {

    private double interestRate;
    public SavingsAccount(String accountHolderName, double interestRate) {
        super(accountHolderName);
        this.interestRate = interestRate;
    }


    public double getInterestRate() {
        return this.interestRate;
    }
}

package org.example.AccountModels;

import org.example.BankAcccount;

public class CurrentAccount extends BankAcccount {
        private double maximumWithdrawal;
    public CurrentAccount(String accountName, double maximumWithdrawal) {
        super(accountName);
        this.maximumWithdrawal = maximumWithdrawal;
    }

    @Override
    public String withdraw(double withdrawalAmount) {
        if (withdrawalAmount > this.maximumWithdrawal) return "Error - Maximum withdrawal exceeded";
        return super.withdraw(withdrawalAmount);
    }
}

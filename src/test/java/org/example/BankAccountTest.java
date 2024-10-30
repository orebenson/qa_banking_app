package org.example;

import org.example.AccountModels.SavingsAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAcccount account1 = new BankAcccount();
        double testDeposit = 10.50;
        double initialBalance = account1.getBalance();
        account1.deposit(testDeposit);
        assert (account1.getBalance() == (initialBalance + testDeposit));

    }

    @Test
    void testWithdraw() {
        BankAcccount account1 = new BankAcccount();
        double testWithdraw = 10.50;
        String resultMessage = account1.withdraw(testWithdraw);
        assert (resultMessage.equals("Unable to withdraw. Insufficient funds available."));
    }

    @Test
    void testDepositThenWithdraw() {
        BankAcccount account1 = new BankAcccount();
        // deposit first
        double testDeposit = 10.50;
        account1.deposit(testDeposit);
        // withdraw valid amount
        double testWithdraw = 5;
        String resultMessage = account1.withdraw(testWithdraw);
        // Success
        assert (resultMessage.equals("Successful withdraw. Posting cash now."));
    }

    @Test
    void testAccountHolderName(){
        String testAccountHolderName = "Nick";
       BankAcccount acccount1 = new BankAcccount(testAccountHolderName);
       assert (testAccountHolderName.equals(acccount1.getAccountHolderName()));

       

    }

    @Test
    void testSavingsAccount() {
        String accountHolderName = "Dave";
        double interestRate = 1.25;
        SavingsAccount savingsAccount = new SavingsAccount(accountHolderName, interestRate);

        assertEquals(interestRate, savingsAccount.getInterestRate());
    }

}

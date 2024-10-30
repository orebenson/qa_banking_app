package org.example;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAcccount account1 = new BankAcccount();
        double testDeposit = 10.50;

        double initialBalance = account1.getBalance();

        account1.deposit(testDeposit);

        assert (account1.getBalance() == (initialBalance + testDeposit));

    }


}

package org.example;

import org.example.AccountModels.CurrentAccount;
import org.example.AccountModels.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAcccount> accounts = new ArrayList<>();

        // Some bank accounts
        CurrentAccount current1 = new CurrentAccount("Jeb", 500);
        CurrentAccount current2 = new CurrentAccount("Jib", 1500);
        SavingsAccount savings1 = new SavingsAccount("Jab", 1.25);
        SavingsAccount savings2 = new SavingsAccount("Job", 2.25);
        BankAcccount banking = new BankAcccount("Jub");

        accounts.add(current1);
        accounts.add(current2);
        accounts.add(savings1);
        accounts.add(savings2);
        accounts.add(banking);

        for (BankAcccount account : accounts) {
            System.out.println(account);
        }
    }
}
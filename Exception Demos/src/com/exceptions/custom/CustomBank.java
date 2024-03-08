package com.exceptions.custom;

public class CustomBank {
    double balance;

    public CustomBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount){
        System.out.println("In withdraw method");
        try {
            if (balance-amount<=0)
                throw new NegativeBalanceException("limit exceeded");
        }
        if amountcatch (NegativeBalanceException e) {
            System.out.println("exception.."+e.getmessage());
            throw e;
        }
    }
}

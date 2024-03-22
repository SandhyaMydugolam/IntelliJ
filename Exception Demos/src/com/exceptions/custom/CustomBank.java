package com.exceptions.custom;

public class CustomBank {
    double balance;

    public CustomBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) {
        System.out.println("In withdraw method");

    }
}

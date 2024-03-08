package com.exception.basic;

public class Atm {
    public static void main(String[] args) {
        System.out.println("Bank");
        Bank bank = new Bank();
        try {
            bank.withdraw(70000);
            System.out.println("Amount withdrawn");
            }

    catch(Exception e){
        System.out.println("exception.....");
        System.out.println(e.getMessage());
        }
        System.out.println("good bye");
    }
    }


package com.exceptions.custom;

public class CustomAtm {
    public static void main(String[] args) {
        System.out.println("in ATM");
    CustomBank bank = new CustomBank(70000);
    try {
        bank.withdraw(2000);
        System.out.println("Amount with drawn");
    } catch (NegativeBalanceException e){
        System.out.println(e.getMessage());
    }catch (OutOfLimitsException e){
        System.out.println(e.getMessage());
    }
        System.out.println("good bye");


    }
}
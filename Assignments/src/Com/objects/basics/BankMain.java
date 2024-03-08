package Com.objects.basics;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank = new Bank(7000);
        System.out.println("Enter your choice");
        System.out.println("Enter 1 for depoist");
        System.out.println("Enter 2 for withdraw");
        int choice =sc.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter amount to depoist :");
                double amount=sc.nextDouble();
                bank.deposit(amount);
                break;
            }
            case 2:{
                System.out.println("Enter amount to withdraw :");
                double amount= sc.nextDouble();
                bank.withdraw(amount);
                break;
            }
            default:{
                //return bank.getBalance();
            }

        }
    }

}

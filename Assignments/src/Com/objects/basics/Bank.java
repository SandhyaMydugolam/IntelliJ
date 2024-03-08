package Com.objects.basics;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    void withdraw (double amount) {
        balance -= amount;
        System.out.println("Balance is :"+balance);
    }
    void deposit (double amount) {
        balance += amount;
        System.out.println("Balance is :"+balance);
    }
    double getBalance() {
        return balance;}

}

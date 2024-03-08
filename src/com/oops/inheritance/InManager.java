package com.oops.inheritance;

public class InManager extends InEmployee{
    double Salary;

    public InManager(String employeename, int employeeId, double salary) {
        super(employeename, employeeId);
        this.Salary = salary;
    }


    void printBonus(double amount){
        System.out.println("Bonus "+(amount+Salary));
    }
}

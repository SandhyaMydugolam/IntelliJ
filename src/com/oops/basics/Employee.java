package com.oops.basics;

import java.time.Clock;

public class Employee {
    String employeeName;
    int employeeId;
    double salary;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void getDetails(){
        System.out.println("name "+employeeName);
        System.out.println("employeeId "+employeeId);
        System.out.println("salary "+salary);


    }
    String greet(String msg){
        return msg +" "+employeeName;
    }

}

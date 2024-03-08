package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("siri",67);
        inEmployee.getDetails();

        InManager inManager = new InManager("kirrru",70,7000);
        inManager.getDetails();
        inManager.printBonus(1000);
    }
}

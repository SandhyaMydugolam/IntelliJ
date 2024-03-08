package com.inter.basics;

public class InterMain {
    public static void main(String[] args) {
        IEnterainment enterainment = new ManagerDetails();
        enterainment.showGames("outdoor");
        enterainment.showActivity();
        System.out.println("-------------");
        enterainment=new DeveloperDetails();
        enterainment.showGames("indoor");
        enterainment.showActivity();

    }
}

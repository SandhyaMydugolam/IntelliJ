package com.inter.basics;

public class DeveloperDetails implements IEnterainment{
    @Override
    public void showGames(String type) {
        if( type .equals("indoor"))
            System.out.println("carrom and shuttle available");
        else
            System.out.println("Football");

    }

    @Override
    public void showActivity() {
        System.out.println("Monthly trip with Football players");

    }


}

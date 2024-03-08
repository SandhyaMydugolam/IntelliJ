package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("ertiga","2023","White");
        Vehicle v2 = new Vehicle("ertiga","2022","White");
        Vehicle v3 = new Vehicle("ertiga","2021","White");
        Vehicle v4 = new Vehicle("ertiga","2021","black");

        System.out.println(v1.equals(v2));
        System.out.println(v2.equals(v3));
        System.out.println(v3.equals(v4));

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
    }
}

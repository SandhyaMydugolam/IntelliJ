package com.list.custom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {

        List<Vehicle> vehicles =
                Arrays.asList(
                        new Vehicle("City", "Honda", 23_90_000),
                        new Vehicle("Hexa", "Tata", 12_90_000),
                        new Vehicle("City", "Honda", 43_90_000),
                        new Vehicle("City", "Honda", 53_90_000),
                        new Vehicle("City", "Honda", 1190000));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        Collections.sort(vehicles,(o1, o2) -> {
            return ((Long)o1.getPrice()).compareTo(o2.getPrice());
        });
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
    }

}

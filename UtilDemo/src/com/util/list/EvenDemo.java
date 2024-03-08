package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,20,25,60,44,76);

        List<Integer> evennums = new ArrayList<>();

        for (int number:nums){
            if (number%2==0){
                evennums.add(number);
            }
        }
        for (int evennumber : evennums){
            System.out.println(evennumber);

        }
    }
}

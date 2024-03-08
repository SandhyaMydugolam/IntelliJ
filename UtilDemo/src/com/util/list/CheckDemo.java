package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CheckDemo {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("AppleCustard");
        fruits.add("orange");
        fruits.add("grapes");
        fruits.add("peach");

        List<String> fruitstartswithA = new ArrayList<>();
         for (String fruit:fruits){
             if (fruit.startsWith("A")){
                 fruitstartswithA.add(fruit);

             }
         }
         for (String fruitstartwithA : fruitstartswithA){
             System.out.println(fruitstartwithA);
         }


    }
}

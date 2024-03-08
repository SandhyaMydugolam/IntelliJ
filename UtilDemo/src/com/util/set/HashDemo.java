package com.util.set;

import java.util.*;

public class HashDemo {

    public static void main(String[] args) {
       // Set<String> haashset = new HashSet<>();
        Set<String> haashset = new LinkedHashSet<>();
        //Set<String> haashset = new TreeSet<>();
        haashset.add("Apple");
        haashset.add("PineApple");
        haashset.add("Orange");
        haashset.add("Banana");
        haashset.add("Kiwi");
        haashset.add("100");
        haashset.add(null);
        // hashSet.add("Apple"); //duplicates not allowed
        System.out.println(haashset);
        System.out.println(haashset);
        for (String element : haashset){
            System.out.println(element);
        }
        List<String> fruits = Arrays.asList("apple","orange","apple");
        Set<String> newfruits=new HashSet<>(fruits);
        System.out.println(newfruits);
    }

}

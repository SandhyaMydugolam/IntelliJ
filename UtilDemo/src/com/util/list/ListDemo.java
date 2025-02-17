package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        //list.add(100);  // String
        list.add("100.9");
        list.add("spring");
        list.add("angular");
        list.add("Maven");
        list.add(1, "helen");
        System.out.println(list);//
        list.set(2, "kutlu");
        System.out.println(list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println(".......");

        System.out.println("Sorting the list");
        Collections.sort(list);
        for (String val : list)
            System.out.println(val.toUpperCase());
    }
}

package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("angular");
        list.add("spring");
        list.add("maven");
        System.out.println(list);
        list.addFirst("Html");
        list.addFirst("Css");
        list.set(1, "react");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        //System.out.println(list);
        System.out.println("---------------------");
        Iterator<String> iterator = list .iterator();
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

    }
}

package com.util.map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> hashmap = new HashMap<>();
//        Map<Integer, String> hashmap = new LinkedHashMap<>();
//        Map<Integer, String> hashmap = new TreeMap<>();
        hashmap.put(1, "java");
        hashmap.put(10, "Spring");
        hashmap.put(8, "node");
        hashmap.put(7, "css");
//        hashmap.put(null, "angular");
//        hashmap.put(null, "java");
        hashmap.put(5, "java");
        hashmap.put(74, "java");
        hashmap.put(100, "html");
        hashmap.put(105, "java script");
        System.out.println(hashmap);

        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(102));//null
        System.out.println(hashmap.getOrDefault(100,"html"));
        System.out.println(hashmap.get(1));
        hashmap.values();//to return the values

        System.out.println();
        Set<Integer> keys = hashmap.keySet();
        for (Integer key : keys) {
            System.out.println(key+" "+hashmap.get(key));
        }

        System.out.println();
        System.out.println("using enty set");
        Set<Map.Entry<Integer,String>> entries = hashmap.entrySet();

        for (Map.Entry<Integer, String> entry:entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        // System.out.println();
        //for (Map.Entry<Integer, String> entry : hashmap.entryset()){
        //Integer key = entry.getKey();
        //string val = entry.getValue();
    }
}

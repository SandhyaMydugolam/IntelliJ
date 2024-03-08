package com.util.map;

import java.util.*;

public class MapStateDemo {
    public static <set> void main(String[] args) {

        Map<String, List<String>> statemap =new HashMap<>();
        statemap.put("Andhrapradesh", Arrays.asList("Ananthapur","Tirupathi","Vizag"));
        statemap.put("Karnataka", Arrays.asList("Bengaluru","Dharmastla","udupi"));
        statemap.put("Kerala", Arrays.asList("cochin","palakad","ernakulam"));

        System.out.println(statemap);
        System.out.println();


        System.out.println("states and cities");
        Set<String> entries1 = statemap.keySet();
        for (String entries : entries1){
            System.out.println(entries+"   "+statemap.get(entries));
        }


        System.out.println("method 2");

        Set<Map.Entry<String, List<String>>> entries = statemap.entrySet();
        for (Map.Entry<String, List<String>> entry : entries){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}

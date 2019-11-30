package com.company.lesson7;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put("Alex", 10);
        map.put("Alex2", 10);
        map.put("Alex3", 10);
        map.put("Alex4", 10);
        map.put("Alex5", 10);
        map.put("Alex6", 10);
        map.put("Alex7", 10);
        map.put("Alex8", 10);

        map.forEach((key, value)->{
            System.out.println(String.format("%s got %s",key,value));
            });

        System.out.println("_____________________");
        for (Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(String.format("&s got &s",entry.getKey(),entry.getValue()));
        }
    }
}

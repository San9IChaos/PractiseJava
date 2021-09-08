package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
HashMap<String, Integer> myHash = new HashMap<>();
myHash.put("Vasya", 1);
myHash.put("Petya", 2);
myHash.put("Katya", 3);
myHash.put("Senya", 4);
		System.out.println(myHash.get("Senya"));
		System.out.println(myHash.size());
		for(Map.Entry<String, Integer> entry: myHash.entrySet())
		System.out.println(entry.getKey() + entry.getValue());
		System.out.println(myHash.containsValue(3));

    }
}


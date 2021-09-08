package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
      HashSet<String> myHash = new HashSet<>();
      myHash.add("Misha");
      myHash.add("Alena");
      myHash.add("Arina");
      myHash.add("Natasha");
      myHash.add("George");
      myHash.add("Sasha");
        System.out.println(myHash.isEmpty());
       myHash.clear();
        System.out.println(myHash.isEmpty());
    }
}

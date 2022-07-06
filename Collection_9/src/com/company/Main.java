package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    List<Houses> house = new ArrayList<>();
    List<Houses> house1 = new LinkedList<>();
    Set<Houses> house2 = new HashSet<>();

    addHouse(house);
    addHouse(house1);
    addHouse(house2);

        System.out.println(house);
        System.out.println(house1);
        System.out.println(house2);
    }
    private static void addHouse(Collection collection) {
    collection.add(new Houses("ПентХаус",350000));
    collection.add(new Houses("Особняк",1000000));
    collection.add(new Houses("Дачный участок",42000));
    collection.add(new Houses("Изба",31000));
    collection.add(new Houses("Дом",800000));
    }
}

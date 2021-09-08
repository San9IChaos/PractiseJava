package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static <T> T getTheFirst(List<T> list){
        return list.get(0);
    }

    public static void main(String[] args) {
        List<Integer> listOfInts = new ArrayList<>();
        listOfInts.add(0);
        Integer intValue = getTheFirst(listOfInts);

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("word");
        String stringValue = getTheFirst(listOfStrings);
    }
}

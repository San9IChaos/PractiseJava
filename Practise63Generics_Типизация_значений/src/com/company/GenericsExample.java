package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static Object getFirstValue(List list){
        return list.get(0);
    }

    public static String getFirstStringValue(List<String> listOfString){
        return listOfString.get(0);
    }

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(4);

//        String name1 = (String) getFirstStringValue(listOfNumbers); - Runtime error
//        String name2 = getFirstStringValue(listOfNumbers); Compile error
    }
}

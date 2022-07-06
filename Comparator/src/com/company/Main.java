package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("a");
        animals.add("elephant");
        animals.add("bird");
        animals.add("frog");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(1);
        numbers.add(500);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) {
            return 1;
        }
        else if (o1.length() < o2.length()) {
            return -1;
        }
        else  {
            return 0;
        }
    }
}

//class BackwardsIntegerComparator implements  Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if( o1>o2 ) {
//            return 1;
//        }
//        else if(o1<o2) {
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }
//}

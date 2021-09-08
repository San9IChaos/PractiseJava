package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        number.stream()
                .peek(System.out::println)
                .forEach(n -> doSomeStaff(n));
        List<String> strings = Arrays.asList("ABC","DEF","GH","FFFFF");
        strings.stream()
                .peek(System.out::println)
                .forEach(s -> doSomeThing(s));
    }
    private static void doSomeStaff(Integer n){
    }
    private static void doSomeThing(String s){}

}

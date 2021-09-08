package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	List<String> strings = Arrays.asList("Bob", "Java 8", "Java the best", "Java 9", "Hot", "Star Wars");
	Optional<String> java = strings.parallelStream()
            .filter(s -> s.contains("Java"))
            .findAny();
        System.out.println(java);
    //findFirst
        System.out.println("Find First");
    List<Integer> numbers = Arrays.asList(1,3,5,7,9,11,12,13,15);
    Optional<Integer> number = numbers.stream()
            .filter(n -> n>10)
            .findFirst();
        System.out.println(number);
    }
}

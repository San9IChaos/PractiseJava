package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Stream Modifiers
        System.out.println("Stream Modifiers");
        List<String> strings = Arrays.asList("a","b","c","d","a","b");
        strings.stream()
                .distinct()
                .forEach(System.out::println);
        //Person
        System.out.println("--Person--");
        List<Person> persons = Arrays.asList(
                new Person("Bob"),
                new Person("July"),
                new Person("Lily")
        );
        persons.parallelStream()
                .sequential()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);
    }
}

package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned","Stark",1),
                new Human("Robb","Stark",2),
                new Human("Arya","Stark",1),
                new Human("Aegon","Targaryen",6),
                new Human("Daenerys","Targaryen",6),
                new Human("Jaime","Lannister",1),
                new Human("Tyrion","Lannister",3)
        );
        Map<String, Set<String>> map = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname,
                Collectors.mapping(Human::getName, Collectors.toSet())));
        System.out.println(map);

    }
}

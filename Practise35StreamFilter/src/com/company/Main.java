package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
List<String> names = Arrays.asList("John","Alena","Alexandr","Alex","Maria","July","Mark");
names.stream()
        .filter(Objects::nonNull)
        .filter(name -> !name.isEmpty() && name.contains("a"))
        .forEach(System.out::println);


    }
}

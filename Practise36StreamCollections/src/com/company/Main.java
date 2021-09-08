package com.company;

import java.io.StringBufferInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    List<String> names = Arrays.asList("John","Alex","","July","Mark","");
    Queue<String> name = names.stream()
            .filter(n-> !n.isEmpty())
            .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(name);


    }
}

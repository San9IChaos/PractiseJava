package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
	List<Human> humans = asList(
	        new Human("Sam",asList("Buddy","Lucy")),
            new Human("Bob",asList("Frankie","Rosie")),
            new Human("Marta",asList("Simba","Tilly"))
    );
	List<String> petNames = humans.stream()
            .flatMap(human -> human.getPets().stream())
            .collect(Collectors.toList());
        System.out.println(petNames);
        //Двумерный массив
        System.out.println("Двумерный массив в одномерный");
        int[][] arr = {{1,2}, {3,6}, {5,2}};
        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(newArr));
    }

}

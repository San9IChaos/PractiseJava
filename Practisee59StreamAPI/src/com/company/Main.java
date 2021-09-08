package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    List<Animal> animals = getAnimals();
    //Старый подход (до java 8)
//        List<Animal> predators = new ArrayList<>();
//        for(Animal animal:animals){
//            if(animal.getClassification().equals(Classification.PREDATOR)){
//                predators.add(animal);
//            }
//        }
//        predators.forEach(System.out::println);
    //Новый подход (Декларативный)
    //Filter
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());
        //predators.forEach(System.out::println);
    //Sort
        List<Animal> ageSort = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge)
                .reversed())
                .collect(Collectors.toList());
        //ageSort.forEach(System.out::println);
    //All match
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);
        //System.out.println(allMatch);
    //Any match
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getName().equals("Tiger"));
        //System.out.println(anyMatch);
    //None match
        boolean NoneMatch = animals.stream()
                .noneMatch(animal -> animal.getAge() > 2000);
        //System.out.println(NoneMatch);
    //Max
        animals.stream()
                .max(Comparator.comparing(Animal::getAge));
                //.ifPresent((System.out::println));
    //Min
        animals.stream()
                .min(Comparator.comparing(Animal::getAge));
                //.ifPresent((System.out::println));
    //Group
        Map<Classification, List<Animal>> Class = animals.stream()
             .collect(Collectors.groupingBy(Animal::getClassification));
//        Class.forEach(((classification, animals1) -> {
//            System.out.println(classification);
//            animals1.forEach(System.out::println);
//        }));
    //Name
        Optional<String> oldestAnimal = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        oldestAnimal.ifPresent(System.out::println);
    }
    private static List<Animal> getAnimals(){
        return List.of(
                new Animal("Elephant",20,Classification.HERBIVORE),
                new Animal("Lion",10,Classification.PREDATOR),
                new Animal("Hyena",11,Classification.PREDATOR),
                new Animal("Giraffe",7,Classification.HERBIVORE),
                new Animal("Gibbon",35,Classification.OMNIVOROUS),
                new Animal("Horse",36,Classification.HERBIVORE),
                new Animal("Lynx",2,Classification.PREDATOR),
                new Animal("Dinosaur",200,Classification.PREDATOR)

                );
    }
}

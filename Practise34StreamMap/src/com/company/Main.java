package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
List<Car> cars = Arrays.asList(
new Car("O123OO",2005),
new Car("P578OP",2011),
new Car("C935BP",2021)
);
cars.stream()
        .filter(c-> c.getYear()>2010)
        .map(Car::getNumber)
        .forEach(System.out::println);
    }
}

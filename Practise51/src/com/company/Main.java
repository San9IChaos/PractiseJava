package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    //String joiner
	StringJoiner joiner = new StringJoiner(", ","(" ,")");
	joiner.add("John");
	joiner.add("Alex");
	joiner.add("Igor");
	System.out.println("--StringJoiner--");
        System.out.println(joiner.toString());
    //String.join
	System.out.println("--String join--");
    	String numbers = String.join("-", "1", "0","1","0");
		System.out.println(numbers);
	//Iterable
	System.out.println("--Iterable--");
		List<String> dataBase = Arrays.asList("John","Mary","Lina");
		String string = String.join(",", dataBase);
		System.out.println(string);
	//Collectors joining
	System.out.println("--Collectors joining--");
		List<String> cars = Arrays.asList("Toyota","BMW","Mercedes","Citroen","Lada");
		String collect = cars.stream()
				.collect(Collectors.joining(", ", "(",")"));
		System.out.println(collect);
    }
}

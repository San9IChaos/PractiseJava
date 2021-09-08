package com.company;

public class Main {

    public static void main(String[] args) {
	GenericsExample<Integer> intObject = new GenericsExample<>(1);
	Integer valueInteger = intObject.getT();

	    System.out.println("Integer Generic value = " + valueInteger);

	GenericsExample<String> stringObject = new GenericsExample<>("word");
	String valueString = stringObject.getT();

        System.out.println("String Generic value = " + valueString);
    }
}

package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	boolean match = numbers.stream()
            .noneMatch(i -> i>0);
        System.out.println(match);
    }
}

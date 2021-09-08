package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
    //Complex Search
		System.out.println("--Complex Search--");
		List<Connection> network = Arrays.asList(
				new Connection("A","C"),
				new Connection("A","D"),
				new Connection("B","C")
		);
		List<String> identity = new ArrayList<>();
		BiFunction<List<String>, Connection, List<String>> accumulator = (strings,connection) -> {
			strings.add(connection.getTo());
			return strings;
		};
		BinaryOperator<List<String>> combiner = (strings,strings2) -> {
			strings.addAll(strings2);
					return strings;
		};
		List<String> connect = network.stream()
				.filter(p -> "A".equals(p.getFrom()))
				.reduce(identity, accumulator, combiner);
		System.out.println(connect);
	//Самая длинная строка
	System.out.println("---Самая длинная строчка---");
	List<String> string = Arrays.asList("Aaa","bbb","ffff","ccc");
	String s = string.stream()
			.reduce("", (left,right)-> left.length() > right.length() ? left:right);
		System.out.println(s);

	//sum reduce
		System.out.println("sum reduce");
		List<Integer> numbers = Arrays.asList(1,3,5,7,9);
		Optional<Integer> number = numbers.stream()
				.reduce((left,right) -> left + right);
		System.out.println(number);

	//умножение
		System.out.println("Сумма умножений");
		List<Integer> num = Arrays.asList(1,2,3);
		Integer sum = num.stream()
				.reduce(10,(identi,val) -> identi*val, (left,right) -> left + right );
		System.out.println(sum);
    }
}

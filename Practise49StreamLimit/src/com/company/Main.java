package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        //StreamAPI(skip/limit)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .skip(5)
                .forEach(System.out::println);
        //StreamAPI(Primitives stream)
        IntStream intStream = IntStream.of(1,2,3,4,5);
        LongStream longStream = LongStream.of(6,7,8,9);
        DoubleStream doubleStream = DoubleStream.of(10,11,12,13);
        IntStream IntRange = IntStream.range(2,10);
        LongStream longRange = LongStream.range(5,25);
        //double не поддерживает .range
        IntStream IntRangeClosed = IntStream.rangeClosed(1,10);
        //rangeClosed включает в себя от 1 до 10 включительно
        DoubleStream doubleS = IntStream.rangeClosed(1,15)
                .asLongStream()
                .asDoubleStream();
        System.out.println(IntRangeClosed);
        //Преобразование в массив
        int[] ints = IntStream.of(1,2).toArray();
        long[] longs = LongStream.of(1,2).toArray();
        double[] doubles = DoubleStream.of(1,2).toArray();
        //Сумма
        int intSum = IntStream.of(1,3,5,7,9).sum();
        long longSum = LongStream.of(5,9,15).sum();
        double doubleSum = DoubleStream.of(1,3,5,7).sum();
        System.out.println("IntSum= " + intSum + "LongSum= " +longSum+ "doubleSum = "+ doubleSum);
        //Среднее число
        OptionalDouble intAverage = DoubleStream.of(1,8,15,5).average();
        System.out.println(intAverage);
        //ForEach
                IntStream.of(1,3,5,7,9,12)
                .filter((i) -> i>3)
                .forEach(System.out::println);

    }
}

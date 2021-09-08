package com.company;

import java.util.EnumSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
Set<Country> countries = EnumSet.allOf(Country.class);
        System.out.println(countries);
        Set<Country> range = EnumSet.range(Country.CANADA,Country.POLAND);
        System.out.println(range);
        EnumSet<Country> canadaSet = EnumSet.of(Country.CANADA);
        EnumSet<Country>canadaSetCopy = EnumSet.copyOf(canadaSet);
        System.out.println(canadaSet);
        System.out.println(canadaSetCopy);
        EnumSet<Country>countries1 = EnumSet.of(Country.CANADA,Country.GERMANY,Country.POLAND);
        System.out.println(countries1);
        EnumSet<Country>countries2 = EnumSet.complementOf(countries1);
        System.out.println(countries2);
        EnumSet<Country>countries3=EnumSet.noneOf(Country.class);
        System.out.println(countries3);
    }
}

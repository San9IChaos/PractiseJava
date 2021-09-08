package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
		ArrayList<Horse> priceHorse = new ArrayList<Horse>();
        TreeSet<Horse> myHorse = new TreeSet<Horse>();
	Horse firstHorse = new Horse("Anabel","Silver",12,15000,5);
	Horse secondHorse = new Horse("BlackAngel","Black",15,21000,9);
	Horse thirdHorse = new Horse("Graf","Gold",13,50000,8);
	Horse forthHorse = new Horse("King","Brown",14,39000,10);
	myHorse.add(firstHorse);
	myHorse.add(secondHorse);
	myHorse.add(thirdHorse);
	myHorse.add(forthHorse);
		priceHorse.add(firstHorse);
		priceHorse.add(secondHorse);
		priceHorse.add(thirdHorse);
		priceHorse.add(forthHorse);
		System.out.println("Sorted for age");
        for(Horse h: myHorse){
            System.out.println(h);
        }
		System.out.println("Sorted for price");
		priceComparator myPriceComparator = new priceComparator();
		priceHorse.sort(myPriceComparator);
        for(Horse h:priceHorse){
			System.out.println(h);
		}
    }
}

package com.company;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
		System.out.println("Comparable for Age");
	TreeSet<Horses> myHorsesAge = new TreeSet<Horses>();
	Horses firstHorse = new Horses(10,120000,3,"BlackIron","Black");
	Horses secondHorse = new Horses(15,100000,7,"Blessed","Gold");
	Horses thirdHorse = new Horses(12,165000,4,"Divine","White");
	Horses forthHorse = new Horses(17,120000,10,"Rose","Brown");
	Horses fifthHorse = new Horses(10,120000,4,"Helga","Silver");
	myHorsesAge.add(firstHorse);
	myHorsesAge.add(secondHorse);
	myHorsesAge.add(thirdHorse);
	myHorsesAge.add(forthHorse);
	myHorsesAge.add(fifthHorse);
	for(Horses h: myHorsesAge){
        System.out.println(h);
    }
		System.out.println("Comparator for price");
        ArrayList<Horses> myHorsesPrice= new ArrayList<Horses>();
	myHorsesPrice.add(firstHorse);
	myHorsesPrice.add(secondHorse);
	myHorsesPrice.add(thirdHorse);
	myHorsesPrice.add(forthHorse);
	myHorsesPrice.add(fifthHorse);
	ComparatorPrice myPrice = new ComparatorPrice();
	myHorsesPrice.sort(myPrice);
	for(Horses h:myHorsesPrice){
        System.out.println(h);
    }
    }
}

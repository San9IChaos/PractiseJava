package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	MyCLass obj = new MyCLass();
	ArrayList <String> deliveryCity = new ArrayList<>();
	deliveryCity.add("London");
	deliveryCity.add("Tokyo");
	deliveryCity.add("NewYork");
	deliveryCity.add("Moscow");

	deliveryCity.add(1,"Krasnodar");
	deliveryCity.set(3,"Toronto");
        System.out.println(deliveryCity.get(3));
		System.out.println(deliveryCity.contains("Krasnodar"));
		System.out.println(deliveryCity.contains("Chelyabinsk"));
		System.out.println(deliveryCity.indexOf("Moscow"));
		System.out.println(obj.AddAll(1,3,5,7,9,11,13,15,17,19,21));
    }
}

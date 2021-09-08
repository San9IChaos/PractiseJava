package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	HashSet<Integer> myHash = new HashSet<Integer>();
	myHash.add(1);
	myHash.add(2);
	myHash.add(3);
		System.out.println(myHash.isEmpty());
		myHash.clear();
		System.out.println(myHash.isEmpty());
    }
}

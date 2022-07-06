package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	Set<String> hashSet = new HashSet<>();
	Set<String> linkedHasSet = new LinkedHashSet<>();
	Set<String> treeSet = new TreeSet<>();

	Set<Integer> set1 = new HashSet<>();
	set1.add(0);
	set1.add(1);
	set1.add(4);
	set1.add(5);
	set1.add(2);
	set1.add(3);

	Set<Integer> set2 = new HashSet<>();

	set2.add(2);
	set2.add(3);
	set2.add(4);
	set2.add(5);
	set2.add(6);
	set2.add(7);

	//union - объединение множеств
	Set<Integer> union = new HashSet<>(set1);
	union.addAll(set2);
		System.out.println(union);

	// intersection - пересечение множеств

	Set<Integer> intersection = new HashSet<>(set1);
	intersection.retainAll(set2);
		System.out.println(intersection);

	// difference - разность множеств

	Set<Integer> difference = new HashSet<>(set1);
	difference.removeAll(set2);
		System.out.println(difference);



/*
	hashSet.add("Mike");
	hashSet.add("Katy");
	hashSet.add("Tom");
	hashSet.add("George");
	hashSet.add("Donald");
*/

//		System.out.println("HashSet: ");
//		System.out.println(hashSet.contains("Tom"));
//		System.out.println(hashSet.contains("Tim"));
//
//        for(String name : hashSet) {
//            System.out.println(name);
//        }
//
//		linkedHasSet.add("Mike");
//		linkedHasSet.add("Katy");
//		linkedHasSet.add("Tom");
//		linkedHasSet.add("George");
//		linkedHasSet.add("Donald");
//
//		System.out.println("LinkedHashSet: ");
//
//		for(String name : linkedHasSet) {
//			System.out.println(name);
//		}
//
//
//		treeSet.add("Mike");
//		treeSet.add("Katy");
//		treeSet.add("Tom");
//		treeSet.add("George");
//		treeSet.add("Donald");
//
//		System.out.println("treeSet: ");
//
//		for(String name : treeSet) {
//			System.out.println(name);
//		}
    }
}

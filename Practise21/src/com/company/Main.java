package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	PriorityQueue<Integer>myFirstPriority = new PriorityQueue<Integer>();
	myFirstPriority.add(1);
	myFirstPriority.add(2);
	myFirstPriority.add(3);
	myFirstPriority.add(4);
	myFirstPriority.offer(22);
		System.out.println(myFirstPriority.peek());
		System.out.println(myFirstPriority.element());

    }
}

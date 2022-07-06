package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person(1);
	Person person2 = new Person(2);
	Person person3 = new Person(3);
	Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
        people.offer(person2);
        people.offer(person4);
        people.offer(person1);
        people.offer(person3);

//        System.out.println(people.remove());
//        System.out.println(people.peek());
//        System.out.println(people);

//        for(Person person : people) {
//            System.out.println(person);
//        }

    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

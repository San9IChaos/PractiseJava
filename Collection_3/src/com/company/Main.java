package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}

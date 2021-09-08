package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
List<User> users = Arrays.asList(
new User("John",28),
new User("July",21),
new User("Alex",25));
        System.out.println("Before sort");
        for(User user:users){
            System.out.println(user);
        }
Comparator<User> comparator = (u1,u2) -> u1.getAge() - u2.getAge();
users.sort(comparator.reversed());
        System.out.println("After sort");
        for(User user:users){
            System.out.println(user);
        }
        System.out.println("Name sort");
users.sort((u1,u2) -> u1.getName().compareTo(u2.getName()));
users.forEach(user-> System.out.println(user));
    }
}

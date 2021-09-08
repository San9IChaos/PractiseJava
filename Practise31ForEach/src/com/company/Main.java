package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
List<User> users = new ArrayList<>();
users.add(new User("Alexandr", "Savelev"));
users.add(new User("Ivan","Ivanov"));
users.add(new User("Misha","Mihailov"));
users.sort(Comparator.comparing(User::getName));
users.forEach(System.out::println);
    }
}

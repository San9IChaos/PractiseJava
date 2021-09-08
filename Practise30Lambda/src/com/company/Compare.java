package com.company;

import java.util.Comparator;

public class Compare<U> implements Comparator <User> {

    public int compare(User u1, User u2) {
    return u1.getAge() - u2.getAge();
    }
}
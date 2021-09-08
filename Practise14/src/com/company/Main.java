package com.company;

public class Main {

    public static void main(String[] args) {
       MyClass test = new MyClass();
       Cat cat = new Cat();
       Dog dog = new Dog();
        System.out.println(test.AddAll(1,5,10,15,20,25,30));
        cat.voice();
        dog.voice();
    }
}

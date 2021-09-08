package com.company;

public class Animal {
    private final String name;
    private final int age;
    private final Classification classification;

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }

    public String getName() {
        return name;
    }

    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classification=" + classification +
                '}';
    }
}

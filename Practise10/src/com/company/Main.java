package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        double b = 4.4;
        String c = "Alex";
Cat cat1 = new Cat("Барсик","Оранжевый");
Dog dog1 = new Dog("Тор","Чёрный");
Animal animal = new Animal("Млекопитающее","Кошачье");
animal.Voice();
        System.out.println(dog1.b);
        System.out.println(dog1.i);
        System.out.println(add(a,a));
        System.out.println(add(b,b));
        System.out.println(add(c,c));
}
public static int add(int a,int b){
        return a+b;
}
public static double add(double a,double b){
        return a+b;
}
public static String add(String a, String b){
        return a+b;
}

    }


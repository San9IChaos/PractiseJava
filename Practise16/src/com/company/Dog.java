package com.company;

public class Dog {
    private String name;
    private String poroda;
    private int age;
    {
        System.out.println("Это не статический блок иницилизации");
    }
   public Dog(String x, String y, int z){
    name=x;
    poroda=y;
    z=age;
    }

}

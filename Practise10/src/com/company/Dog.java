package com.company;

public class Dog {
    private String name;
    private String color;
    static int i = 100;
    int b = 10;
    public String getName(){
        return name;
    }
    public void setName(String a){
        name=a;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color=c;
    }
    public Dog(String Name, String Color){
        name = Name;
        color = Color;
    }
}

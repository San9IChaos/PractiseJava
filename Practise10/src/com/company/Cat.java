package com.company;

public class Cat{
    private String name;
    private String color;

    public String getName(){
        return name;
    }
    public void setName(String a){
        name=a;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Cat(String Name, String Color){
        name = Name;
        color = Color;
    }
   }


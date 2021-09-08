package com.company;

public class Horse implements Comparable<Horse> {
    String name;
    String color;
    int age;
    int price;
    int experience;
    public Horse(String name, String color, int age, int price, int experience){
        this.name=name;
        this.color=color;
        this.age=age;
        this.price=price;
        this.experience=experience;
    }
    public String toString(){
        final StringBuffer sb = new StringBuffer("Horse: {");
        sb.append("Name: ").append(name);
        sb.append(", Color: ").append(color);
        sb.append(", Age: ").append(age);
        sb.append(", Price: ").append(price);
        sb.append(", Experience: ").append(experience);
        sb.append("}");
        return sb.toString();
    }
    public int compareTo(Horse anotherHorse){
        if(this.age == anotherHorse.age){
            return 0;
        }
        else if(this.age>anotherHorse.age){
            return -1;
        }
        else{
            return 1;
        }
    }
}

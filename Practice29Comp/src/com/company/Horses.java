package com.company;

public class Horses implements Comparable<Horses>{
    int age;
    int price;
    int experience;
    String name;
    String color;
    public Horses(int age,int price,int experience, String name, String color){
        this.age = age;
        this.price = price;
        this.experience = experience;
        this.name = name;
        this.color = color;
    }
    public String toString(){
        final StringBuffer sb = new StringBuffer("Horses {");
        sb.append("age: ").append(age);
        sb.append(", price: ").append(price);
        sb.append(", experience: ").append(price);
        sb.append(", name: ").append(name).append('\'');
        sb.append(", color:").append(color).append('\'');
        sb.append("}");
        return sb.toString();
    }
    public int compareTo(Horses anotherHorse) {
        if(this.age == anotherHorse.age){
            return 0;
        }
        else if(this.age<anotherHorse.age){
            return -1;
        }
        else{
            return 1;
        }
    }
}
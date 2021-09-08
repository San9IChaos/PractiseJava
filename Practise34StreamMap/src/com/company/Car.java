package com.company;

public class Car {
    private String number;
    private int year;
    public Car(String number, int year){
        this.number = number;
        this.year = year;
    }
    String getNumber(){
        return number;
    }
    int getYear(){
        return year;
    }
}

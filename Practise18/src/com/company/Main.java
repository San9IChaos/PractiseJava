package com.company;

public class Main {

    public static void main(String[] args) {
Season fall = Season.FALL;
switch(fall){
    case WINTER:
        System.out.println("Christmas Time!");
        break;
    case SPRING:
        System.out.println("Time of Easter!");
        break;
    case SUMMER:
        System.out.println("Sea Season!");
        break;
    case FALL:
        System.out.println("Time go to school :c");
        break;
    default:
        System.out.println("Такого времени года не существует...");
}
    }
    }



package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = GetNumber();
        boolean answer;
        if(num1%2 ==0){
            answer = true;
        }
        else{
            answer = false;
        }
        System.out.println("Число " + num1 + "делится на 2? " + answer);
    }

    public static int GetNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы ввели некорректное число");
            return GetNumber();
        }
    }
}
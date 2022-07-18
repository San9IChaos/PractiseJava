package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int num1;
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        num1 = sc.nextInt();
        if(num1!=2 && num1%2!=0) {
            System.out.println("Число является простым");
        }
        else if (num1 == 2){
            System.out.println("Число является простым");
        }
        else {
            System.out.println("Число не является простым");
        }
    }
}

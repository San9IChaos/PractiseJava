package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = GetNum();
        int num2 = GetNum();
        int result = Minimal(num1, num2);
        System.out.println("Наименьшее число = " + result);
    }
    public static int GetNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if(sc.hasNextInt()){
             return sc.nextInt();
        }
        else {
            System.out.println("Вы ввели некорректное число");
            return GetNum();
        }
    }
    public static int Minimal(int num1, int num2){
        return Math.min(num1, num2);
    }
    }


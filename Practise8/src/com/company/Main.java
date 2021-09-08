package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    boolean answer = getCheck();
        System.out.println(answer);
    }
    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число");
        if (sc.hasNextInt()){
            return sc.nextInt();
        }
        else{
            System.out.println("Вы ввели некорректное число");
            return getNum();
        }
    }
    public static boolean getCheck(){
        int num = getNum();
        if(num>5){
            return true;
        }
        else{
            return false;
        }
    }
    }


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1 = getNum();
        double num2 = getNum();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        System.out.println("Ответ: "+ result);
    }

    public static double getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы ввели некорректное число");
            return getNum();
        }
    }

    public static char getOperation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите операцию: \n1 Сложение \n2 Вычитаение \n3 Умножение \n4 Деление");
        int operation = 0;
        if (scan.hasNextInt()) {
            operation = scan.nextInt();
        }
            switch (operation) {
                case 1:
                    return '+';
                case 2:
                    return '-';
                case 3:
                    return '*';
                case 4:
                    return '/';
                default:
                    System.out.println("Неверная операция");
                    return getOperation();
            }
        }
        public static double add(double num1, double num2){return num1+num2;}
        public static double min(double num1, double num2){return num1-num2;}
        public static double mult(double num1, double num2){return num1*num2;}
        public static double div(double num1, double num2){return num1/num2;}

        public static double calc(double num1, double num2, char operation){
        switch(operation){
            case '+':
               return add(num1,num2);
            case '-':
               return min(num1,num2);
            case'*':
                return mult(num1,num2);
            case'/':
                return div(num1,num2);
            default:
                return Double.NaN;
        }
        }
}


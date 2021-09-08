package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

        public static double getNumber() {
            Scanner getNum = new Scanner(System.in);
            System.out.println("Введите первое число");
            if (getNum.hasNextDouble()) {
                return getNum.nextDouble();
            }
            else{
                System.out.println("Вы ввели некорректное число");
                return getNumber();
            }
        }
        public static char getOperation() {
        Scanner getOper = new Scanner(System.in);
        System.out.println("Выберите тип операции: \n1 Прибавить \n2 Отнять \n3 Умножить \n4 Поделить");
        int OperNumber = 0;
        if(getOper.hasNextInt()){
        OperNumber = getOper.nextInt();
        }
        switch(OperNumber){
            case 1:
            return '+';
            case 2:
            return '-';
            case 3:
            return '*';
            case 4:
            return '/';
            default:
                System.out.println("Неправильная операция");
                return getOperation();
        }
    }
    public static double add(double num1, double num2){
        return num1+num2;
    }
    public static double min(double num1, double num2){
        return num1-num2;
    }
    public static double umn(double num1, double num2){
        return num1*num2;
    }
    public static double del(double num1, double num2){
        return num1/num2;
    }

    public static double calc(double num1, double num2, char operation){
        switch(operation){
            case '+':
                return add(num1, num2);
            case '-':
                return min(num1, num2);
            case'*':
                return umn(num1, num2);
            case'/':
                return del(num1,num2);
            default:
                return Double.NaN;
        }
    }

}

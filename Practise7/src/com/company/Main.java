package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = getNum();
        int dig = getDegree();
        int result = 1;
        for(int i=0;i<dig;i++){
            result=result*num;
        }
        System.out.println("Число "+ num +" в степени "+ dig + " равно " + result);

    }
    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Некорректное число");
            return getNum();
        }
    }
        public static int getDegree(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите степень в которую хотите возвести число");
            if(scan.hasNextInt()){
                return scan.nextInt();
            }
            else{
                System.out.println("Вы ввели некорректное число");
                return getDegree();
            }
        }

}

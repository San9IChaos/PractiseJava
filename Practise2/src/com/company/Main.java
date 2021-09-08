package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        int i = scan.nextInt();
        switch(i){
            case 1:
                System.out.println("Вы ввели число 1");break;
            case 2:
                System.out.println("Вы ввели число 2");break;
            case 3:
                System.out.println("Вы ввели число 3");break;
            case 4:
                System.out.println("Вы ввели число 4");break;
            default:
                System.out.println("Может подумаешь над своим выбором?");
        }
        }
    }


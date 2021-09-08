package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit;
        exit=false;
        System.out.println("Отгадайте загадку: синий, большой, с усами и полностью набит зайцами? \nУ вас 3 попытки.");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
        if(exit==true)
            break;
            String answer = sc.nextLine();
        switch(answer) {
            case "Троллейбус":
                System.out.println("Правильно!");
                exit=true;
                break;
            case "Сдаюсь":
                System.out.println("Правильный ответ: Троллейбус");
                exit=true;
                break;
            default:
                System.out.println("Подумай ещё");
        }
        }
        System.out.println("Попытки закончились.");
    }
}

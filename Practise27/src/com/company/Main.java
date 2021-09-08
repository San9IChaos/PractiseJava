package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String scan = null;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите любое предложение");
        if(sc.hasNextLine()){
        scan = sc.nextLine();
}
        else{
            System.out.println("Вы ввели неккоректное предложение");
        }
        for(int i=0;i<scan.length();i++){
            if(scan.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Вы ввели " + count + " слов");
    }
}

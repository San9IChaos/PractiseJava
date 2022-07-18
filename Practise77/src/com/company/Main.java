package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line;
        String line2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую строку, мы проверим является ли она Полиндромом");
        line = sc.nextLine().toLowerCase(Locale.ROOT).replace(" ", "");;
        char[] pol = new char[line.length()];
        char[] pol2 = pol;
        int count = 0;
        pol = line.toCharArray();
        for(int i = line.length();i>0;i--) {
            pol2[count++] = pol[i-1];
        }
        line2 = String.valueOf(pol2);
        if(line.equals(line2)) {
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является полиндромом");
        }

    }
}

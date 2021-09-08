package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("Test.txt");
    Scanner sc = new Scanner(fr);
    int i = 1;
    while(sc.hasNextLine()){
        System.out.println("Строчка "+ i+" : "+ sc.nextLine());
    }
    fr.close();

        FileWriter fw = new FileWriter("Test.txt");
        fw.write("Я помню чудное мгновенье, \nПередо мною явилась ты, \nКак мимолётное виденье, \nКак гений чистой красоты...");
        fw.close();
    }
}

package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	int sred1;
	int sred2;
	int min =1;
	int max =5;
        int x = 0;
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
	for(int i=0;i<mas1.length;i++){
        x = randomInt(min,max);
    }
	mas1 = new int[]{x,x,x,x,x};
	mas2 = new int[]{x, x, x, x, x};
        System.out.println(x);
        System.out.println(mas1);
        System.out.println(mas2);
    sred1 = (int) (IntStream.of(mas1).count() / mas1.length);
    sred2 = (int) (IntStream.of(mas2).count() / mas2.length);
        System.out.println("Среднее число массива N1 = " + sred1);
        System.out.println("Среднее число массива N2 = " + sred2);
        if(sred1>sred2){
            System.out.println("Среднее число массива N1 > среднего числа массива N2");
        }
        else if(sred1==sred2){
            System.out.println("Среднее число массива N2 = среднему числу массива N1");
        }
        else{
            System.out.println("Среднее число массива N2 > среднего число массива N1");
        }
    }
    public static int randomInt(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static int randomInt2(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

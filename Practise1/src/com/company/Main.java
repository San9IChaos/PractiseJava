package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     int N = 100;
     double array[] = new double[N];
     for (int i=0; i<array.length; i++) {
         array[i] = Math.random();
     }
     double max = array[0];
     double min = array[0];
     double sred = 0;
     for (int i=0; i<array.length; i++) {
         if (max < array[i])
             max = array[i];
         if (min > array[i])
            min = array[i];
         sred += array[i]/ array.length;
     }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sred);
    }
}

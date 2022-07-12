package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = "Hello1251616there16126161261hey61261261616126Jo";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello57575757there57575757hey";
        String modifiedString = b.replaceAll("\\d+", " ");
        String modifiedString2 = b.replaceFirst("\\d+", " ");
        System.out.println(modifiedString);
        System.out.println(modifiedString2);
    }
}

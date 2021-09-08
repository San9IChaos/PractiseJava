package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Color> colors = new ArrayList<Color>(List.of(Color.RED,Color.BLACK,Color.BLUE));
        System.out.println(colors);
        System.out.println("after sort");
        Collections.sort(colors);
        System.out.println(colors);
        Color[] color = Color.values();
        System.out.println(Arrays.toString(color));
        System.out.println(Color.RED.name());
        System.out.println(Color.RED.ordinal());
        boolean ItEquals = Color.RED.equals(Color.RED);
        boolean ItEquals2 = Color.RED.equals(Color.BLACK);
        System.out.println(ItEquals);
        System.out.println(ItEquals2);
        int hashOfRed = Color.RED.hashCode();
        int hashOfBlue = Color.BLUE.hashCode();
        System.out.println(hashOfRed);
        System.out.println(hashOfBlue);
        String red = Color.RED.toString();
        System.out.println(red);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<House>myHouseList = new ArrayList<House>();
        House firstHouse = new House(100,120000,"Tokyo",true);
        House secondHouse = new House(120,135000,"Toronto",false);
        House thirdHouse = new House(98,105000,"Sidney",true);
        myHouseList.add(firstHouse);
        myHouseList.add(secondHouse);
        myHouseList.add(thirdHouse);
        for(House h: myHouseList){
            System.out.println(h);
        }
        PriceComparator myPriceComparator = new PriceComparator();
        myHouseList.sort(myPriceComparator);
        System.out.println("Sorted: ");
        for(House h: myHouseList)
            System.out.println(h);
    }

}

package com.company;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("Comparable по area");
        TreeSet<House> myHouseArrayList = new TreeSet<House>();
        House firstHouse = new House(155, 199999, "Toronto", true);
        House secondHouse = new House(132, 132000, "Tokyo", false);
        House thirdHouse = new House(111, 112000, "Riga", true);
        House forthHouse = new House(155,199999,"Moscow",false);
        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);
        myHouseArrayList.add(forthHouse);
        for (House h : myHouseArrayList) {
            System.out.println(h);
        }
        System.out.println("Method Comparator for price");
        ArrayList<House> MyHouseList = new ArrayList<>();
        MyHouseList.add(firstHouse);
        MyHouseList.add(secondHouse);
        MyHouseList.add(thirdHouse);
        MyHouseList.add(forthHouse);
        PriceComparator MyPriceComparator = new PriceComparator();
        MyHouseList.sort(MyPriceComparator);
        for(House h : MyHouseList){
            System.out.println(h);
        }
    }
}
package com.company;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<Horses> {

    @Override
    public int compare(Horses h1, Horses h2) {
        if(h1.price==h2.price){
            return 0;
        }
        else if(h1.price<h2.price){
            return -1;
        }
        else{
            return 1;
        }
    }
}

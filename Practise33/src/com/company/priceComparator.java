package com.company;

import java.util.Comparator;

public class priceComparator implements Comparator<Horse> {
    @Override
    public int compare(Horse h1, Horse h2) {
        if(h1.price==h2.price){
            return 0;
        }
        else if(h1.price<h2.price){
            return 1;
        }
        else{
            return -1;
        }
    }
}

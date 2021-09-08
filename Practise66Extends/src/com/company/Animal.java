package com.company;

public abstract class Animal {
    private int weight;

    public boolean isDangerous(){
        return isPredator() ||
                getWeight() >15;
    }

    public Animal(int weight){
        this.weight = weight;
    }
    protected int getWeight() {
        return weight;
    }

    abstract boolean isPredator();
}

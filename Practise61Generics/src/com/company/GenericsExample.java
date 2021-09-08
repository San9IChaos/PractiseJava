package com.company;

public class GenericsExample<T> {
    private T value;

    public GenericsExample(T value){
        this.value = value;
    }

    public T getT(){
        return value;
    }
}

package com.company;

public class GenericsExample <T extends Number>{
    private T value;

    public GenericsExample(T value){
        this.value = value;
    }
    public T getT() {
        return value;
    }

    public static void main(String[] args) {
        //Integer - is Number, no Error
        GenericsExample<Integer> intObject = new GenericsExample<>(1);
        Integer valueInteger = intObject.getT();

        //String - no Number, error
        GenericsExample<String> stringObject = new GenericsExample<String>("word");
        String stringValue = stringObject.getT();
    }
}

package com.company;
public class Main {
static Cat[] cat = new Cat[3];
    public static void main(String[] args) {
    cat[0] = new Cat("Мурка");
    cat[1] = new Cat("Симба");
    cat[2] = new Cat("Черныш");
    for(int i=0;i< cat.length;i++){
        System.out.println(cat[i].name);
    }
    }
}
class Cat{
    String name;
    public Cat(String name){
        this.name = name;
    }
}
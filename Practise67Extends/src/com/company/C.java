package com.company;

public class C extends B {

    public static void main(String[] args) {
        A aB = new B();

        A aC = new C();

        B bB= new B();

        B bC= new C();

        C cC = new C();
        System.out.println(bB.diff(1,2));
        System.out.println(aC.sum(1,1));
        System.out.println(bC.diff(1,2));
    }
    public int mult(int x, int y){
        return (x*y);
    }
    public int diff(int x, int y){
        return (y-x);
    }
}

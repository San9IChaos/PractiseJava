package com.company;

public class MyClass {
public int AddAll(int...var){
    int sum=0;
    for(int i=0;i<var.length;i++){
        sum=sum+var[i];
        System.out.println(" Предыдущее значение прибавить " + var[i] + " = " + sum);
    }
    return sum;
}
}

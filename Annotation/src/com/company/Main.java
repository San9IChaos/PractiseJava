package com.company;

@MyAnnotation
public class Main {
    public static void main( String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyClass myClass = new MyClass();
        myClass.myMethod();

        System.out.println("Hello from main thread");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from MyThread");
    }
}

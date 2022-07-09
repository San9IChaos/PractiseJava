package com.company;

public class Main {

    public static void main(String[] args) {
    new Worker().main();
    }
}

class Worker {
    private int counter = 1000;

    Object lock1 = new Object();
    Object lock2 = new Object();

    public void add() {
        synchronized (lock1) {
            counter++;
        }
    }
    public void min() {
        synchronized (lock2) {
            counter--;
        }
    }

    public void doWork() {
        for(int i = 0;i<1000;i++) {
            add();
            min();
        }
    }

    public void main() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        System.out.println(counter);
    }
}

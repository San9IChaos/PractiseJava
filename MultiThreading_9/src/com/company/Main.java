package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class Worker {
    Object lock = new Object();
    String message = "a";

    public void consume() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
        synchronized (lock) {
            if(message.length()%2==0) {
                message+="a";
                lock.notify();
                System.out.println(message);
            }
            else {
                lock.wait();
            }
            }
        }
    }

    public void produce() throws InterruptedException {
        while(true) {
            Thread.sleep(1000);
            synchronized (lock) {
                if(message.length()%2!=0) {
                    message+="b";
                    lock.notify();
                    System.out.println(message);
                }
                else {
                    lock.wait();
                }
            }
        }
    }
}

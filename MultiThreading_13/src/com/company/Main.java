package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Worker worker = Worker.getWorker();
        for(int i=0;i<200;i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        worker.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
        }

class Worker {
    private static Worker worker = new Worker();
    private String message = "a";
    private Semaphore semaphore = new Semaphore(10);
    public Lock lock = new ReentrantLock();

    private Worker() {
    }
public static Worker getWorker() {
        return worker;
}

public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        }
    finally {
            semaphore.release();
        }
}

private void doWork() throws InterruptedException {
        lock.lock();
        message+="a";
    System.out.println(message);
        lock.unlock();
        Thread.sleep(1000);
}

}
package com.mph;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//synchronized method implementation along with executorservice thread creation and management
class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

public class ExecutorsSyncPractise {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Counter counter = new Counter();

        Counter c2 = new Counter();
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> counter.increment());

        }
        executorService.submit(() -> c2.increment()); // calling the increment method from different counter instance

        //System.out.println(counter.count); it executes before the task completion so count =0
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(counter.getCount()); // it executes after the task completion so count =100
        System.out.println(c2.getCount()); // no race condition occurs for call it from different counter instance
    }

}

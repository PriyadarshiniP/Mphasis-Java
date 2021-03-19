package com.mph;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//usage of ExecutorService interface
public class ExecutorServicePractise {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("creating executor service with 2 threads");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //fixed thread pool creates 2 threads, if any dies due to some reason, it is replaced by creating a new thread
        System.out.println("creating runnable obj tasks");
        Runnable task1 = () -> System.out.println(Thread.currentThread().getName() + "inside the task 1");
        Runnable task2 = () -> System.out.println(Thread.currentThread().getName() + " inside the task2");
        Runnable task3 = () -> System.out.println(Thread.currentThread().getName() + " inside task 3");

        System.out.println("submitting 3 tasks to a thread pool of 2 threads");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        System.out.println("shutdown the executor service");
        executorService.shutdown();
    }
}

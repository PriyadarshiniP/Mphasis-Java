package com.mph;

//overrides the run method of runnable interface
class Run implements Runnable {
    public void run() {
        long t = System.currentTimeMillis();
        for (int ctr = 0; ctr <= 100; ctr++) {

            System.out.println(Thread.currentThread());
        }
        long t2 = System.currentTimeMillis();
        long time = t2 - t;
        System.out.println(time);
    }

}

//creates two threads to perform the task in run method
public class MultiThreadingExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        Runnable run = new Run();
        Thread th1 = new Thread(run);
        Thread th2 = new Thread(run);
        th1.start();
        th2.start();
        System.out.println("End");

    }


}




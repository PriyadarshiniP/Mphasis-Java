package com.mph;

//example of race condition
class RunnerClass implements Runnable {

    @Override
    public void run() {
        Thread curThread = Thread.currentThread();
        for (int counter = 0; counter < 1000; counter++) {
            System.out.println(curThread);
            if (counter == 5) {
                try {
                    curThread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}

public class RaceConditionExample {
    public static void main(String[] args) {
        Runnable r = new RunnerClass();
        Thread t1 = new Thread(r, "producer");
        Thread t2 = new Thread(r, "consumer");
        t1.start();
        t2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        System.out.println("End");
    }
}

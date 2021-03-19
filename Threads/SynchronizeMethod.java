package com.mph;

//usage of synchronize method
class DataClass {
    private int value;

    public synchronized void getValue() {
        System.out.println(value);
        try {
            notify();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public synchronized void setValue(int value) {
        this.value = value;
        try {
            notify();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class RunTaskClass implements Runnable {
    DataClass data;

    RunTaskClass() {
        data = new DataClass();
    }

    @Override
    public void run() {
        Thread currThread = Thread.currentThread();

        for (int counter = 0; counter < 10; counter++) {
            System.out.println(currThread);
            if (currThread.getName().equalsIgnoreCase("Producer")) {

                data.setValue(counter + 1);

            } else {

                data.getValue();

            }
        }
    }

}

public class SynchronizeMethod {
    public static void main(String[] args) {
        Thread mainthread = Thread.currentThread();
        RunTaskClass r = new RunTaskClass();
        Thread t1 = new Thread(r, "Producer");
        Thread t2 = new Thread(r, "Consumer");
        t1.start();
        t2.start();
        System.out.println("end");

    }
}



package com.mph;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//pojo class
class Point3 {
    int x, y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

//implements the callable interface
class Task3 implements Callable<Point3> {
    String name;
    int c1, c2;

    public Task3(String name, int c1, int c2) {
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public Point3 call() throws Exception {
        System.out.println(Thread.currentThread() + " " + name);
        return new Point3(c1, c2);
    }
}

//submits the task to call method using the threads from scheduledThreadPool
public class FutureExample {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newScheduledThreadPool(coreCount);
        List<Future> FutureList = new ArrayList<Future>();

        for (int counter = 0; counter < 10; counter++) {
            Future<Point3> future = service.submit(new Task3("Task" + (counter + 1), counter + 1, counter + 2));
            FutureList.add(future);
        }

        for (Future<Point3> f : FutureList) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done");


    }


}



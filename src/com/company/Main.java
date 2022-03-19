package com.company;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener1 = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();

        Worker worker1 = new Worker(listener1);
        worker1.start1();

    }
}

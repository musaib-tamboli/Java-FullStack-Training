package com.musaib.threading;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running...");
    }
}
class MyRunnable2 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running...");
    }
}
class MyRunnable3 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running...");
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);

        t.start();
    }
}

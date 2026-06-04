package com.musaib.threading;

class MyThread extends Thread {
	//logic part
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();//calling starts from here
    }
}

package com.musaib;

class Table extends Thread {
    void printTable(int n) {
        // Synchronized Block
        synchronized (this) {
            System.out.println("Thread Running...");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyTable1 extends Thread {
    Table t1;

    public MyTable1(Table t1) {
        this.t1 = t1;
    }

    public void run() {
        t1.printTable(5);
    }
}

class MyTable2 extends Thread {
    Table t2;

    public MyTable2(Table t2) {
        this.t2 = t2;
    }

    public void run() {
        t2.printTable(10);
    }
}

public class SynchronizedExample {
    public static void main(String args[]) {
        Table table = new Table();
        MyTable1 mt1 = new MyTable1(table);
        MyTable2 mt2 = new MyTable2(table);
        mt1.start();
        mt2.start();

    }
}

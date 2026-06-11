package com.musaib;

public class AnonymousEx {

    public static void main(String[] args) {
        final Table obj = new Table();
        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(10);
            }
        };

        t1.start();
        t2.start();
    }

}

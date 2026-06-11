package com.musaib;

class Downloading extends Thread {
    public void run() {
        download();
    }

    public void download() {
        for (int i = 0; i <= 100; i += 20) {
            System.out.println("Downloading... " + i + "% for " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.println("Downloading Completed Successfully...");
    }
}

public class DownloadEX {
    public static void main(String args[]) {
        Downloading d1 = new Downloading();
        Downloading d2 = new Downloading();
        d1.setName("Task 1");
        d2.setName("Task 2");
//		d1.setPriority(Thread.MAX_PRIORITY); // 10
//      d2.setPriority(Thread.MIN_PRIORITY); // 1
        d1.setPriority(2);
        d2.setPriority(8);
        d1.start();
        try {
            d1.join();
        } catch (Exception e) {
        }
        d2.start();
    }
}

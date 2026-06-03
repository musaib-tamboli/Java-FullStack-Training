package com.musaib.oop.interfaces;
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing Document...");
    }
}

public class PrintableInter {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
    }
}

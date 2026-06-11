package com.musaib.LambdaExpression;

interface Message {
    void display();
}

public class Demo {
    public static void main(String[] args) {

        Message m = () -> System.out.println("Hello Java");

        m.display();
    }
}
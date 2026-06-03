package com.musaib.oop.interfaces;
interface Payment {
    void makePayment(double amount);
}

class CreditCardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount +
                " using Credit Card");
    }
}

class UPIPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount +
                " using UPI");
    }
}

public class PaymentInter {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.makePayment(20000);
        p2.makePayment(5000);
    }
}


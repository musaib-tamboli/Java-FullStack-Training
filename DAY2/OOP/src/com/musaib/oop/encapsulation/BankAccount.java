package com.musaib.oop.encapsulation;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(10000);
        acc.withdraw(3000);

        System.out.println("Balance: " + acc.getBalance());
    }
}


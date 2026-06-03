package com.musaib.oop.encapsulation;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(1001);
        e.setName("Asad");
        e.setSalary(50000);

        System.out.println("ID: " + e.getEmpId());
        System.out.println("Namee: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}


package com.musaib.ArrayListEx;


import java.util.ArrayList;

public class PrintArrayListSize {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Bangalore");

        System.out.println("Cities: " + cities);
        System.out.println("Size of ArrayList: " + cities.size());
    }
}
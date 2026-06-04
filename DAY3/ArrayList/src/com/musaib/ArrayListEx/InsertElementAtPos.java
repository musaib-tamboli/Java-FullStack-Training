package com.musaib.ArrayListEx;


import java.util.ArrayList;

public class InsertElementAtPos {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Before Insertion:");
        System.out.println(languages);

        languages.add(1, "Python");

        System.out.println("After Insertion:");
        System.out.println(languages);
    }
}
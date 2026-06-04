package com.musaib.ArrayListEx;
import java.util.*;
public class StudentNames {

        public static void main(String[] args) {

            ArrayList<String> students = new ArrayList<>();

            students.add("Musaib");
            students.add("Saqib");
            students.add("Asad");
            students.add("Ali");
            students.add("Aman");

            System.out.println("Student Names:");

            for (String name : students) {
                System.out.println(name);
            }
        }
    }


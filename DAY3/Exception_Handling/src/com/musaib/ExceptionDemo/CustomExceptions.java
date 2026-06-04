package com.musaib.ExceptionDemo;

class InvalidAgeException extends Exception {
     //constructor
	InvalidAgeException(String msg) {
//calling super class constructor in exception class
		super(msg);
	}
}

public class CustomExceptions {

	static void validate(int age) throws InvalidAgeException {

		if (age < 18)
			throw new InvalidAgeException("Age must be 18 or above");
	}

	public static void main(String[] args) {

		try {
			validate(15);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
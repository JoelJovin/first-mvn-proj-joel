package com.fssa.joel.day18.solved;

public class AgeValidator {
	public static boolean validateAge(int age) throws IllegalArgumentException {
		if (age <= 0) {// Check if the age is a posotive value
			throw new IllegalArgumentException("Invalid age");

		} else {
			return true;
		}
	}
}


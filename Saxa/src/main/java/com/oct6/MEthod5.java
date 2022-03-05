package com.oct6;

public class MEthod5 {

	public static void main(String[] args) {
		checkAge(10); 
	}
	
	public static void checkAge(int age) {
		if (age < 18) { //If age is less than 18, print "access denied"
			System.out.println("Access denied - You are not old enough!");
		} else { // If age is greater than, or equal to, 18, print "access granted"
			System.out.println("Access granted - You are old enough!");
		}
	}
}
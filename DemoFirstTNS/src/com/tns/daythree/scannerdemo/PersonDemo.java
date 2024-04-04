package com.tns.daythree.scannerdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		try (// Create the object of the scanner
		Scanner ob = new Scanner(System.in)) {
			String name1;
			System.out.println("Enter the Person Name:");
			name1=ob.next();
			
			System.out.println("Enter the Age:");
			int age1=ob.nextInt();
			
			System.out.println("Enter the Income:");
			int income1=ob.nextInt();
			
			System.out.println("Enter the Gende:");
			String Gender1=ob.next();
			
			// Person object and initialize values using setter
			Person person= new Person();
			person.setName(name1);
			person.setAge(age1);
			person.setGender(Gender1);
			person.setIncome(income1);
			
			System.out.println(person);
			
			TaxCalculation tx= new TaxCalculation();
			tx.calculateTax(person);
			
			System.out.println("After Calculating Tax:");
			System.out.println(person);
		}
	}
}

package com.tns.daythree.scannerdemo;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name,city;
		int id;
		System.out.println("Enter the Customer id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the Customer Name");
		name=sc.next();
		
		System.out.println("Enter the Customer City:");
		city=sc.next();
		
		System.out.println(" ");
		
		Customer c1=new Customer(city, id, city);//Default Constructor invoked
		
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		
		//another way


		System.out.println("Enter Customer Id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		name=sc.next();
		
		System.out.println("Enter Customer City:");
		city=sc.next();
		
		Customer c2=new Customer(name,id,city);
		System.out.println(c2);
	
	}
}

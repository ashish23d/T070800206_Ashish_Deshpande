package com.exception.demo;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
	try {
		System.out.println("Enter the Number a");
		int a=s1.nextInt();
		System.out.println("Enter the Number b");
		int b=s1.nextInt();
		int res=a*b;
		System.out.println("Result is: "+res );
	} catch (InputMismatchExcetion e) {
		
		System.out.println("Plaease Enter the Integer Values only");
		 
	}catch (ArithmeticExcetion e) {
		// TODO: handle exception
		System.out.println("second no should not be zero");
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(" !!");
		
	}
	
	}
}

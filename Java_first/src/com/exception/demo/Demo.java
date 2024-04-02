package com.exception.demo;

import java.io.FileInputStream;
import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		File f1= new File("C:\\Program Files\\MySQL\\MySQL Server 8.3\\lib");
		FileInputStream F2=null;
		try {
			f2=new FileInputStream(f1);
			System.out.println("File found");
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the 1st  Number");
			int b=s1.nextInt();
			System.out.println("Enter the 2nd  Number");
			int b=s1.nextInt();
			
		}
		
	}
}

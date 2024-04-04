package com.tnsif.daytwo.jump;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char x='j';
		String x;
		System.out.println("Enter the Desire Charecter");
		Scanner sc = new Scanner(System.in);
		 x = sc.next();
		
		switch(x)
		{
		case'l':
		case'L':
			System.out.println(x+"for lion");
			break;
			
		case'd':
		case'D':
			System.out.println(x+"for Dog");
			break;
			
		case'w':
		case'W':
			System.out.println(x+"for Wolf");
			break;
			
		case'p':
		case'P':
			System.out.println(x+"for Panda");
			break;
			
		case's':
		case'S':
			System.out.println(x+ "for Ship");
			break;
		default:
			System.out.println(x+ "is other letter which is not incuded in the code");
		
		
		
		
		}
	}
	
	

}

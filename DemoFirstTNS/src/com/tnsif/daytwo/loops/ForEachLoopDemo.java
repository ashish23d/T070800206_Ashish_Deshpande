package com.tnsif.daytwo.loops;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
	// for integer array
		
		System.out.println(a);
		
		for( int i:a) {
			System.out.println(i);
		}
		
		char ch[]= {'j','a','v','a'};
		System.out.println(ch);
		
		for(char c:ch) {
			System.out.println( c);
		}
		
		String s1[]= {"Java","Programming","Learnig"};
		
		System.out.println(s1);
		
		for(String s:s1)
		{
			System.out.println(s);
		}
}
}

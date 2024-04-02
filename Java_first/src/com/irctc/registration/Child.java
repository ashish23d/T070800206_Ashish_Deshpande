package com.irctc.registration;

public class Child extends Client{
	
	public Child() {
		super(10);
		// TODO Auto-generated constructor stub
		System.out.println("This is child class Constructor");
	}
	public void data() {
		
		
	}
	public Child(int b) {
		this();
		System.out.println("This is parameterised Constructor of Child");
	}
	

}

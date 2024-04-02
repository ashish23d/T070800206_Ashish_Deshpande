package com.irctc.registration;

public abstract class Client {
	public Client() {
		System.out.println("this is default Constructor");
	}
		public Client(int a) {
			this();
			System.out.println("This is Parameterised Constructor");
			
		
	}
	
	public abstract void data();
	
	public void demo() {
		System.out.println("This is demo");
	}
	}

	



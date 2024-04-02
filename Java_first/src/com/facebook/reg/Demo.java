package com.facebook.reg;

public abstract interface Demo {
	int id=50;
	 abstract void data();
	 default void demo() {
		 System.out.println("demo method");
	 }

}

package org.apcoer.login;

public class Client implements P1,P2 {
	public void demo() {
		System.out.println("this is Implementation of Demo Method ");
	}

	public static void main(String[] args) {
	
		P1 objP1=new Client();
		objP1.demo();
		
		P2 objP2=new Client();
		objP2.demo();
	}
}

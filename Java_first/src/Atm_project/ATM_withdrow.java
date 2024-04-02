package Atm_project;

import java.util.Scanner;

public class ATM_withdrow {
	 

	public static void main(String[] args) {
		int yes=0;
		int PIN = 1212;
		try (Scanner scanner = new Scanner(System.in)) {
			int Amount=20000;
			System.out.println("Wel-Come to ATM");
			System.out.println("Enter which Operation to Perform:");
			String task= scanner.next();
			
					switch(task){
			case "1":
				 
				System.out.println("Enter the PIN");
				PIN=scanner.nextInt(PIN);
				
	
				if(PIN==1212) {
					System.out.println("Enter the Amount:");
					PIN=scanner.nextInt(PIN);
					 			
				
						int a = 0;
						if(a<=Amount ) {
						System.out.println("Do you want Recipt");	
						yes=scanner.nextInt(yes);
					}
					else {
						System.out.println("Enterd amount is not sufficient");
					}
				}
					 
					
				break;
			}
		}
			
	}
	 
		


}



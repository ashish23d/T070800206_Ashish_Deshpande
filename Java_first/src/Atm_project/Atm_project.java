package Atm_project;

import java.util.Scanner;

public class Atm_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balance =100000, withdraw,deposite,PIN,PIN2,PINc;
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Wel-Come to The ATM");
			System.out.println(" ");
			System.out.print("Enter the ATM PIN:");
			 PIN = sc.nextInt();
			
			 if(PIN==1212) {
			 
 
				 
				while(true) {
					
					System.out.println("Choose 1 for the Withdraw");
					System.out.println("Chose 2 for the Deposite");
					System.out.println("Chose 3 for the Check The Balance");
					System.out.println("Chose 4 for the Exit");
					System.out.println("Chose 5 for Generate a New PIN");
					System.out.print("Chose the Operation to Performe:");
					System.out.println(" ");
				
			
				int choise = sc.nextInt();
				if(choise<=5){
					 
				 
					
					switch(choise) 
					
					{
					case 1:
						System.out.println("Enter the Amount to Withdraw:");
						
						withdraw = sc.nextInt();
						
						if(balance >=withdraw)
						{
							balance = balance - withdraw;
							System.out.println("Please Collect the Amount!");
						}
						else {
							System.out.println("In-sufficient Balance in your Account");
						}
						System.out.println("");
						break;
						
						
					case 2:
						System.out.println("Enter the Amount for Deposite:");
						deposite = sc.nextInt();
						
						balance = balance + deposite;
						System.out.println("Your Money is Successfully Deposited in your A/c");
						System.out.println("");
						break;
						
						
					case 3:
						System.out.println("Balance:"+balance);
						System.out.println("");
						break;
						
						
					case 4:
						System.exit(0);
						break;
						
						
					case 5:
						System.out.println("Enter the old PIN:");
						PINc= sc.nextInt();
							if(PIN==PINc)
							{
								System.out.println("Now Enter NEW PIN:");
								PIN2= sc.nextInt();
								
								if(PIN != PIN2) {
									
									PIN = PIN-PIN + PIN2;
									System.out.println("Your PIN is has bein Changed to "+PIN2);
									System.out.println(" ");
									}
								else {
									System.out.println("Same PIN does Not be allowd");
									System.out.println(" ");
									}
							}
							else {
								System.out.println("Your Old PIN is Wrong! Try agin");
								System.out.println(" ");
								}
							
					}
				}
				else {
					System.out.println("Invalid Input!");
					System.out.println(" ");
				}
			 }
			 }
			  
			 else {
				 System.out.println("Invalid PIN !");
			 }
		}

	}
}


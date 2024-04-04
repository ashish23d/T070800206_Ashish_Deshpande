package com.tns.daythree.scannerdemo;

public class TaxCalculation {

	public void calculateTax(Person person) {
		
		
		if(person.getAge()>65 || person.getGender().equalsIgnoreCase("Female")) {
			
			
			 person.setTax(0);
			 System.out.println("tax not applicable");
			 
		}
		else {
			if(person.getIncome()<=160000)
			{
				person.setTax(0);
			}
			else if(person.getIncome()>160000 && person.getIncome()<500000)
			{
				person.setTax((person.getTax()-160000)* 5/100);
			}
			else if(person.getIncome()>500000&& person.getIncome()<800000)
			{
				person.setTax((person.getTax()-500000)* 20/100 + 340000);
			}
			else
			{
				person.setTax((person.getTax()-800000)*30/100 + 94000);
			}
		}
		
	}
	
}

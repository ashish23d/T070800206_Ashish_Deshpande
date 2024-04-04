
	import java.util.Scanner;

	public class TaxCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input: Name, Gender, Age, Yearly Income, and Mobile Number
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter your gender: ");
	        String gender = scanner.nextLine();
	        
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        
	        System.out.print("Enter your yearly income: ");
	        double income = scanner.nextDouble();
	        
	        System.out.print("Enter your mobile number: ");
	        long mobileNo = scanner.nextLong();
	        
	        // Tax calculation based on income and age
	        double taxPercentage;
	        
	        switch (age) {
	            case 0:
	            case 1:
	            case 2:
	            case 3:
	            case 4:
	            case 5:
	            case 6:
	            case 7:
	            case 8:
	            case 9:
	            case 10:
	            case 11:
	            case 12:
	            case 13:
	            case 14:
	            case 15:
	            case 16:
	            case 17:
	                taxPercentage = 0;
	                break;
	            case 18:
	            case 19:
	            case 20:
	            case 21:
	            case 22:
	            case 23:
	            case 24:
	            case 25:
	            case 26:
	            case 27:
	            case 28:
	            case 29:
	            case 30:
	            case 31:
	            case 32:
	            case 33:
	            case 34:
	            case 35:
	            case 36:
	            case 37:
	            case 38:
	            case 39:
	            case 40:
	            case 41:
	            case 42:
	            case 43:
	            case 44:
	            case 45:
	            case 46:
	            case 47:
	            case 48:
	            case 49:
	            case 50:
	            case 51:
	            case 52:
	            case 53:
	            case 54:
	            case 55:
	            case 56:
	            case 57:
	            case 58:
	            case 59:
	            case 60:
	                if (income <= 300000)
	                    taxPercentage = 0;
	                else if (income <= 500000)
	                    taxPercentage = 0.05;
	                else if (income <= 900000)
	                    taxPercentage = 0.10;
	                else
	                    taxPercentage = 0.20;
	                break;
	            default:
	                taxPercentage = 0;
	                break;
	        }
	        
	        double tax = income * taxPercentage;
	        System.out.println("Name: " + name);
	        System.out.println("Gender: " + gender);
	        System.out.println("Age: " + age);
	        System.out.println("Yearly Income: " + income);
	        System.out.println("Tax Percentage: " + (taxPercentage * 100) + "%");
	        System.out.println("Tax Amount: " + tax);
	        System.out.println("Mobile Number: " + mobileNo);
	        
	        scanner.close();
	    }
	}



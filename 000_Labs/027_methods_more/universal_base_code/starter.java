/*
 *	Author: Nolan Lee 
 *  Date: 10/22/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Thank you for coming to the Lee ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int num1 = sc.nextInt();
		sc.nextLine();
		if(num1 == 1){
			BankAccount a = new BankAccount();
			System.out.println("--- Account Info ---");
			a.printDetails();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String text1 = sc.nextLine();
			if(text1.equalsIgnoreCase("yes")){
				System.out.println("Current Account Balance: $" + a.getBalance());
				System.out.println();
				System.out.println("Thank you for coming to the Lee ATM!");
			}
			else if(text1.equalsIgnoreCase("No")){
				System.out.println("Great! No balance checked.");
				System.out.println();
				System.out.println("Thank you for coming to the Lee ATM!");
			}
			else{
				System.out.println("Bruh, you didn't follow the order, listen next time okay?");
			}
		}
		else if(num1 == 2){
			System.out.println("What is the name of the owner of this bank account?");
			String text2 = sc.nextLine();
			BankAccount b = new BankAccount(text2);
			b.printDetails();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String text1 = sc.nextLine();
			if(text1.equalsIgnoreCase("yes")){
				System.out.println("Current Account Balance: $" + b.getBalance());
				System.out.println();
				System.out.println("Thank you for coming to the Lee ATM!");
			}
			else if(text1.equalsIgnoreCase("No")){
				System.out.println("Great! No balance checked.");
				System.out.println();
				System.out.println("Thank you for coming to the Lee ATM!");
			}
			else{
				System.out.println("Bruh, you didn't follow the order, listen next time okay?");
			}
		}
		else if(num1 == 3){
			System.out.println("What is the name of the owner of this bank account?");
			String text2 = sc.nextLine();
			System.out.println("How much are you initally depositing into this account?");
			double num2 = sc.nextDouble();
			sc.nextLine();
			BankAccount c = new BankAccount(text2, num2);
			c.printDetails();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String text1 = sc.nextLine();
			if(text1.equalsIgnoreCase("yes")){
				System.out.println("Current Account Balance: $" + c.getBalance());
				System.out.println();
				System.out.println("Thank you for coming to the Lee ATM!");
			}
			else if(text1.equalsIgnoreCase("No")){
				System.out.println("Great! No balance checked.");
				System.out.println();
				System.out.println("Thank you for coming to the Lee ATM!");
			}
			else{
				System.out.println("Bruh, you didn't follow the order, listen next time okay?");
			}
		}
		
	}
}

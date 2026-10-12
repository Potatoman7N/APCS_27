/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		int number = (int)(Math.random()*1001);
		System.out.print("Please guess a number: ");
		int x = sc.nextInt();
		while(x!=number){
			if(x<number){
				System.out.println("The number is higher.");
			}
			if(x>number){
				System.out.println("The number is lower.");
			}
			System.out.print("Please guess a number: ");
			x = sc.nextInt();
		}
		System.out.println("You got the number!");



		
	}
}

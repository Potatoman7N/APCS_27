/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int num1 = sc.nextInt();
		int taco = (int)(Math.random()*1000+1);
		if (num1 == taco){
			System.out.print("You guessed the random number! " + "The number was " + taco);
		}
		else if(num1>taco){
			System.out.print("Your number was greater than the random number. The number was " + taco);
		}
		else if(num1<taco){
			System.out.print("Your number was smaller than the random number. The number was " + taco);
		}
		System.out.println();
	}
}

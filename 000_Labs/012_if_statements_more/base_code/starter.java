/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please input your second number: ");
		int num2 = sc.nextInt();
		boolean answer = num1 == num2;
		if(answer == true){
			System.out.println("The numbers are the same!");
		}
		if(answer == false){
			System.out.println("The numbers are different!");
		}
	}
}

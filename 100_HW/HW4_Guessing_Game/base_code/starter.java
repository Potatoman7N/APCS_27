/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println();
		int random = (int)(Math.random()*2+1);
		String Dragon = "Dragon fruit";
		String Dragon2 = "dragon fruit";
		
		if(random == 1){
			System.out.println("It is a spikey fruit!");
			System.out.print("What is your guess?");
			String text1 = sc.nextLine();
		
		}
			if(text1.equals(Dragon)||text1.equals(Dragon2));{
				System.out.print("You got it! Woo!");
			}
			else if(!text1.equals(Dragon)||text1.equals(Dragon2)){
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It is pink on the outside!");
				String text2 = sc.nextLine();
			}
			if(text2.equals(Dragon)||text2.equals(Dragon2)){
				System.out.print("You got it Woo!");
			}
			else if(!text2.equals(Dragon)||!text2.equals(Dragon2)){
				System.out.print("The answer was Dragon fruit, better luck next time!");
			}
			




		

	}
}

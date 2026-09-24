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
		
		if(random == 1){
			System.out.println("It is a spikey fruit!");
			System.out.print("What is your guess?");
			String text1 = sc.nextLine();
			if(text1 == "D".toLowerCase() + "ragon fruit"){
				System.out.print("You got it! Woo!");
			}
			else if(text1 == "D" + "ragon fruit"){
				System.out.print("Your got it Woo!");
			}

		}
		else if(random == 2){
			System.out.print("It is one of the most popular games in the world!");
		}
		else if(random == 3){
			System.out.print("It is the most populated country in the world!");
		}

		

	}
}

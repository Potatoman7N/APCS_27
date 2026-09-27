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
		int random = (int)(Math.random()*3+1);
		String Dragon = "Dragon fruit";
		String Dragon2 = "dragon fruit";
		String Planet = "Mercury";
		String Planet2 = "mercury";
		String Axo = "Axolotl";
		String Axo2 = "axolotl";
		String text1 = "";
		String text2 = "";
		String text3 = "";
		String text4 = "";
		String text5 = "";
		String text6 = "";
		
		if(random == 1){
			System.out.println("It is a spikey fruit!");
			System.out.print("What is your guess? ");
			text1 = sc.nextLine();
	
			if(text1.equals(Dragon)||text1.equals(Dragon2)){
				System.out.println();
				System.out.print("You got it! Woo!");
			}
			else {
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It is pink on the outside!");
				text2 = sc.nextLine();
			
			if(text2.equals(Dragon)||text2.equals(Dragon2)){
				System.out.println();
				System.out.print("You got it Woo!");
			}
			else {
				System.out.println();
				System.out.print("The answer was Dragon fruit, better luck next time!");
			}
		}
	}

		else if(random == 2){
			System.out.println("It is the hottest planet!");
			System.out.print("What is your guess? ");
			text3 = sc.nextLine();
		
			if(text3.equals(Planet)||text3.equals(Planet2)){
				System.out.println();
				System.out.print("You got it! Woo!");
			}
			else {
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It is the closest planet to the sun!");
				text4 = sc.nextLine();
			
			if(text4.equals(Planet)||text4.equals(Planet2)){
				System.out.println();
				System.out.print("You got it Woo!");
			}
			else{
				System.out.println();
				System.out.print("The answer was Mercury, better luck next time!");
			}
		}
	}

		else if(random == 3){
			System.out.println("It is an amphibian with feathery gills!");
			System.out.print("What is your guess? ");
			text5 = sc.nextLine();
		
			if(text5.equals(Axo)||text5.equals(Axo2)){
				System.out.println();
				System.out.print("You got it! Woo!");
			}
			else {
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It is pink and popular on the internet!");
				text6 = sc.nextLine();
			
			if(text6.equals(Axo)||text6.equals(Axo2)){
				System.out.println();
				System.out.print("You got it Woo!");
			}
			else{
				System.out.println();
				System.out.print("The answer was Axolotl, better luck next time!");
			}
		}
	}




		
		}
}

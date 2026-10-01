/*
 *	Author: Nolan Lee  
 *  Date: 10/1/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue");
		String text1 = sc.nextLine();
		String line1 = "Wizard";
		String line3 = "Warrior";
		String line5 = "Rouge";
		if(text1.equalsIgnoreCase(line1)){
			System.out.print("You've chosen Wizard! Excelsior!");
			System.out.println();
		}
		else if (text1.equalsIgnoreCase(line3)){
			System.out.print("You've chosen the Warrior! For honor!");
			System.out.println();
		}
		else if (text1.equalsIgnoreCase(line5)){
			System.out.print("You've chosen the Rogue! How cunning!");
			System.out.println();
		}
		else{
			System.out.print("You've decided not to chose a role. Rerun program.");
			System.out.println();
		}
	}
}

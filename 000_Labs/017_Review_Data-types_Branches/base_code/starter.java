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
		System.out.println("What is your name?");
		String text1 = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String text2 = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue");
		String text3 = sc.nextLine();
		String line1 = "Wizard";
		String line3 = "Warrior";
		String line5 = "Rouge";
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		if(text3.equalsIgnoreCase(line1)){
			System.out.print("You've chosen Wizard! Excelsior!");
			System.out.println();
		}
		else if (text3.equalsIgnoreCase(line3)){
			System.out.println("You've chosen the Warrior! For honor!");
			System.out.println();
		}
		else if(text3.equalsIgnoreCase(line5)){
			System.out.println("You've chosen the Rogue! How cunning!");
			System.out.println();
		}
		else{
			System.out.print("You've decided not to chose a role. Rerun program.");
			System.out.println();
		}
			System.out.println();
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
			System.out.print("Strenth (1-10): ");
			num1 = sc.nextInt();
			sc.nextLine();
			if(num1>10){
				System.out.print("Please input a smaller value. Strength (1-10): ");
				num1 = sc.nextInt();
				
			}
			System.out.println("You have " + (20 - num1) + " left to spend");
			System.out.println();
			System.out.print("Dexterity (1-10): ");
			num2 = sc.nextInt();
			sc.nextLine();
			
			if(num2>10){
				System.out.println("Please input a smaller value. Strength (1-10): ");
				num2 = sc.nextInt();
				sc.nextLine();
			}
			System.out.println("You have " + ((20 - num1)-num2) + " left to spend");
			System.out.println();
			System.out.print("Intelligence (1-10): ");
			num3 = sc.nextInt();
			sc.nextLine();
			if(num3>10 || num3>((20 - num1)-num2)){
				System.out.println("Please input a smaller value. Dexterity (1-10)");
				num3 =sc.nextInt();
				sc.nextLine();
				System.out.println();
			}
			System.out.println(("You have " + (((20-num1)-num2)-num3)) + " left to spend");
			System.out.print("Charisma (1-10): ");
			num4 = sc.nextInt();
			sc.nextLine();
			System.out.println();
			if(num4>10 || num4>(((20 - num1)-num2)-num3)){
				System.out.println("Please input a smaller value. Charisma (1-10)");
				num4 =sc.nextInt();
				sc.nextLine();
				System.out.println();
			}
			System.out.println("You have " + (((((20-num1)-num2)-num3)-num4)) + " left to spend for next time");
			System.out.println("--------------------------------------------------");
			System.out.println("You are " + text1 + ", the " + text2 + " of CVHS.");
			System.out.println ("You are a " + text3 + " with the following stats!");
			System.out.println("Strength - " + num1);
			System.out.println("Dexterity - " + num2);
			System.out.println("Intelligence - " + num3);
			System.out.println("Charisma - " + num4);
			System.out.println();
			System.out.println("Good luck on your quest " + text1 + "!");

	



		}
		
		
	}


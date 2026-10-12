/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int Money = 100;
		int ran1 = (int)(Math.random()*10+1);
		int ran2 = (int)(Math.random()*10+1);
		int ran3 = (int)(Math.random()*10+1);
		System.out.println("Slot Machine Rules.");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) ");
		String text1 = sc.nextLine();
			
			while(!text1.equalsIgnoreCase("Yes")&&!text1.equalsIgnoreCase("Y")){
				if(text1.equalsIgnoreCase("Yes")||text1.equalsIgnoreCase("Y")||text1.equalsIgnoreCase("No")||text1.equalsIgnoreCase("N")){
					break;
				}
			System.out.println("--------------------------------------------------");
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y) ");
			System.out.println("--------------------------------------------------");
			System.out.print("That wasn't quite the correct answer. Try again. : ");
			text1 = sc.nextLine();
			System.out.println();

	}
	if(text1.equalsIgnoreCase("No")||text1.equalsIgnoreCase("N")){
				System.out.println();
				System.out.println("WHY! You could've won so much more...You still have $" + Money + " left. Come again soon! Thanks!");
				return;
				}
		if(text1.equalsIgnoreCase("Yes")||text1.equalsIgnoreCase("Y")){
			while(true){
					while((!text1.equalsIgnoreCase("Yes")) && (!text1.equalsIgnoreCase("Y"))&&(!text1.equalsIgnoreCase("No"))&&(!text1.equalsIgnoreCase("N"))){
				if(text1.equalsIgnoreCase("Yes")||text1.equalsIgnoreCase("Y")||text1.equalsIgnoreCase("No")||text1.equalsIgnoreCase("N")){
					break;
				}
			System.out.println("--------------------------------------------------");
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y) ");
			System.out.println("That wasn't quite the correct answer. Try again. : ");
			System.out.println("--------------------------------------------------");
			text1 = sc.nextLine();
			System.out.println();

	}
				if(Money<=0){
					break;
				}
				if(text1.equalsIgnoreCase("No")||text1.equalsIgnoreCase("N")){
				System.out.println();
				System.out.println("WHY! You could've won so much more...You still have $" + Money + " left. Come again soon! Thanks!");
				break;
				}
			ran1 = (int)(Math.random()*10+1);
		    ran2 = (int)(Math.random()*10+1);
			ran3 = (int)(Math.random()*10+1);
			System.out.println();
			System.out.print("You have $" + Money + ". How much would you like to wager? ");
			int num1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			System.out.println("_______________________");
			System.out.println(" | " + ran1 + " | " + ran2 + " | " + ran3 + " | ");
			System.out.println("_______________________");
			if((ran1==ran2)||(ran1==ran3)||(ran2==ran3)){
				System.out.println("You won! You're wager has now been doubled");
				Money = Money*2;
				System.out.println("You now have $" + Money);
			}
			else if((ran1==ran2)&&(ran1==ran3)||(ran2==ran1)&&(ran2==ran3)){
				System.out.println("I JUST HIT THE JACKPOTTTT!!!! You're wager has now been TRIPLED");
				Money = Money*3;
				System.out.println("You now have $" + Money);
			}
			else{
				System.out.println("You didn't win this time, better luck next time!");
				Money = Money-num1;
				System.out.println("You now have $" + Money);
			}
			if((text1.equalsIgnoreCase("No") || (Money<=0))||(text1.equalsIgnoreCase("N") || (Money<=0))){
					break;
				}
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) ");
			text1 = sc.nextLine();
			

			
			}
		}
	
			if(Money<=0){
			System.out.println("--------------------------------------------------");
			System.out.println();
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			}
		}
}
				
		
		



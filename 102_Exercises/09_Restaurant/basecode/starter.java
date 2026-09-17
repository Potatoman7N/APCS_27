/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("            WELCOME RESTAURANT OWNER!            ");
		System.out.println("=================================================");
		System.out.println();
		System.out.print("What's the name of your restaurant? ");
		String text = sc.nextLine();
		System.out.println();
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		System.out.println();
		System.out.println("Great to see you, " + name + "!" + " Let's set up a menu for " + text + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String item = sc.nextLine();
		System.out.print("Price of " + item + " ($): ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many " + item + " would you like? ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(num2 + "x" + " " + item + " added to your order!" + "($" + num2*num1 +")");
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String item2 = sc.nextLine();
		System.out.print("Price of " + item2 + " ($): ");
		double num3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many " + item2 + " would you like? ");
		int num4 = sc.nextInt();
		sc.nextLine();
		System.out.println(num4 + "x" + " " + item2 + " added to your order!" + "($" + num4*num3 +")");
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String item3 = sc.nextLine();
		System.out.print("Price of " + item3 + " ($): ");
		double num5 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many " + item3 + " would you like? ");
		int num6 = sc.nextInt();
		sc.nextLine();
		System.out.println(num6 + "x" + " " + item3 + " added to your order!" + "($" + num6*num5 +")");
		System.out.println("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double tip = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.println("=================================================");
        System.out.println(text + " - Menu For Today");
		System.out.println("=================================================");
		System.out.println("Owner: " + name);
		System.out.println("-------------------------------------------------");
		System.out.println("Item                Qty     Price");
		System.out.println("-------------------------------------------------");
		System.out.println(item + "                " + num2 + "     " + num1*num2);
		System.out.println(item2 + "                " + num4 + "     " + num3*num4);
		System.out.println(item3 + "                " + num6 + "     " + num5*num6);
		System.out.println("-------------------------------------------------");
		double subtotal = (num1*num2 + num3*num4 + num5*num6);
		System.out.println("Subtotal:                  " + subtotal);
		double tax = subtotal*0.0975;
		System.out.println("Tax (9.75%):               " + tax);
		System.out.println("Tip:                       " + tip);
		double tip2 = (subtotal*(tip*0.01));
		System.out.println("Tip Amount:" + ":               " + tip2);
		System.out.println("=================================================");
		System.out.println("TOTAL:                    $" + (subtotal + tip2 + tax));
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Thanks for eating at " + text + "!");
		System.out.println("Come back soon -- we'll always have a byte for you!");











		


		
	}
}

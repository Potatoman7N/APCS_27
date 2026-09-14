/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;



class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First Name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		System.out.print("Enter your age ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("You are " + age + " years old");
		System.out.print("Enter your Birthday Month ");
		String text = sc.nextLine();
		System.out.println("Your birthday month is " + text);
		System.out.print("Enter your birthday day ");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.println("Your birthday day is " + text + " " + day);
		System.out.print("Enter your birthday year ");
		String year = sc.nextLine();
		System.out.println("Your birthday year is " + text + " " + day + " " + year);
		System.out.print("How much is a buck fifty ");
		String buck = sc.nextLine();
		System.out.print("A buck fifty is $" + buck);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		 
	}
}

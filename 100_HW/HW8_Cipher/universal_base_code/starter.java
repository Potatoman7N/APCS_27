/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {

	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a Cipher");
		String text1 = sc.nextLine();
		System.out.println("Does this Cipher have a key?(Integer) Yes or No(Just put nothing/anything but yes if you have no key)");
		String text2 = sc.nextLine();
		if(text2.equalsIgnoreCase("Yes")){
			System.out.println("Please enter the key.");
			int number1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Your decoded/encoded Cipher is:");
			System.out.println(Cipher.keyedEncode(text1, number1));
			
		}
		else{
			System.out.println("Your decoded/encoded Cipher is:");
			System.out.println(Cipher.encode(text1));
		}
		
	}
}
		/*
		THIS IS THE ANSWERS TO THE CIPHERS IN ORDER
		do you people like turtles
		robotics is the best
		the key to number 4 is 33
		never gonna give you up never going to let you down
		half of ohtanis jersey number is key to 6
		13 and 29 are keys to 7
		potatoes and chicken are my favorite variable names
		youve successfully completed the first section
		you are an amazing programmer and human being thank you
		this homework kind of ate but skibidi toilet is minus 1234 aura

		<THIS IS MY CIPHER FOR MR.POOLE!!!>
		c7 9aadk g6 maad obl g dgek 5475dk6 5aaa
		*/

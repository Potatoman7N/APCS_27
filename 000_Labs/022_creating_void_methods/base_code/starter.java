/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentence!");
	String text1 = sc.nextLine();
	System.out.println("Write a sentence!");
	String text2 = sc.nextLine();
	System.out.println();
	System.out.println("This is using the methods!");
	toString(text1);
	toStringCombined(text1, text2);
	}
		public static void toString(String text1){
			System.out.println(text1);
			return;
		}
		public static void toStringCombined(String text1, String text2){
			System.out.println(text1 + " " + text2);
			return;
		}




		
}

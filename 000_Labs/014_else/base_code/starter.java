/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int taco = (int)(Math.random()*15);
		if(taco>2){
			System.out.print("Greater");
		}
		else{
			System.out.print("Smaller");
		}
		
	}
}

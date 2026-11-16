/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int random = (int)(Math.random()*10+1);
		int targetrandom = (int)(Math.random()*10+1);
		int [] arr = new int[20];
		int dupes = 0;
		int c = 0;
		int e = 0;
		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers");
		for(int i = 0; i < arr.length; i++){
		random = ((int)(Math.random()*10+1));
		arr[i] = random;
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("The random number to look for is " + targetrandom);
		int b = 0;
		while(b < arr.length){
			if(arr[b] == targetrandom){
				System.out.println("Duplicate found at index " + b);
				dupes++;
			}
			b++;
		}
		System.out.println("The total number of duplicates for " + targetrandom + " is " + dupes);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row...");
		while(e < (arr.length - 1)){
			if(arr[e] == arr[e + 1]){
				System.out.print("Two in a row found at indexes " + e + " and " + (e + 1) + ". ");
				System.out.println("The repeating number was " + arr[e]);
				c++;
			}
			e++;
		}
		if(c == 0){
				System.out.println("No two numbers in a row were found");
			}
		}
	}


/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr = new int[1000];
		int random = ((int)Math.random()*100000+1);
		for(int i = 0; i < arr.length; i++){
		random = ((int)(Math.random()*100000+1));
		arr[i] = random;
		System.out.println(arr[i]);
		}


		
	}
}

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
		int check = 0;
		int i = 0;
		int random = ((int)Math.random()*100000+1);
		while(check < arr.length){
arr[i] = random;
		System.out.println(arr[i]);
		i++;
		check++;	
		}


		
	}
}

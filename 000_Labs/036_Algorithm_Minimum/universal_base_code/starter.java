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
		int random = ((int)(Math.random()*150+51));	
		int random2 = ((int)(Math.random()*100+1));	
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double average = 0.0;
		int averagecount = 0;
		int i = 0;
		int [] arr = new int[random];
		for(i = 0; i < arr.length; i++){
		random2 = ((int)(Math.random()*100+1));
		arr[i] = random2;
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
			averagecount = (averagecount + arr[i]);
		}
		average = averagecount/((double)i);
		System.out.println("The average is " + average);
		System.out.println("The minimum is " + min);
		System.out.println("The maximum is " + max);
		System.out.println("There are " + arr.length + " elements");

		
	}
}

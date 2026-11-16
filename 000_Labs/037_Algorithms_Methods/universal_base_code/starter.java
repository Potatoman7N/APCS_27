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
		int [] arr = new int[100];
		int random = (int)(Math.random()*100+1);
		for(int b = 0; b <arr.length; b++){
			random = (int)(Math.random()*100+1);
			arr[b] = random;
			toStringArray(arr[b]);
			getArrayAverage(arr[b]);
			getArrayMax(arr[b]);
			getArrayMin(arr[b]);
		}



		
	}
}

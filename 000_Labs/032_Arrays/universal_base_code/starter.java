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
		int [] arr = new int[10];
		int check = 0;
		int checkmango = 0;
		int arrchange = 0;
		int len = arr.length;
		while(checkmango < len){
			System.out.println(arr[arrchange]);
			arr[arrchange] = check + 1;
			check++;
			checkmango++;
		}
		int [] brr = new int[10];
		int check2 = 10;
		int checkmango2 = 0;
		int brrchange = 0;
		int len2 = brr.length;
		while(checkmango2 < len2){
			brr[brrchange] = check2 - 1;
			System.out.println(brr[brrchange]);
			check2--;
			checkmango2++;
		}

		
	}
}

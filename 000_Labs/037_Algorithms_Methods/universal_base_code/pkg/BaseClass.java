/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
		private int max = Integer.MIN_VALUE;
		private int min = Integer.MAX_VALUE;
		private int i;

		public BaseClass(){
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			i = 0;
		}
		public void toStringArray(int [] num){
			for(i = 0; i<num.length; i++){
				System.out.println(num[i]);
			}
		}
		public int getArrayAverage(int [] num){
			for(i = 0; i<num.length; i++){
				int total = num[i] + num[i + 1];
				return (((double)total)/(num.length - 1));
			}
		}
		public int getArrayMax(int [] num){
			for(i = 0; i<num.length; i++){
			if(num[i] > max){
				max = num[i];
			}
			}
			return max;
		}
		public int getArrayMin(int [] num){
		for(i = 0; i<num.length; i++){
			if(num[i] < min){
				min = num[i];
			}
			}
			return min;
		}
		}


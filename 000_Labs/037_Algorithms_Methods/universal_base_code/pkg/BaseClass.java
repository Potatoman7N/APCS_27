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
		public void toStringArray(int [] arr){
			for(i = 0; i<arr.length; i++){
				System.out.println(arr[i]);
			}
		}
		public int getArrayAverage(int [] arr){
			for(i = 0; i<arr.length; i++){
				int total = arr[i] + arr[i + 1];
				return (((double)total)/(arr.length - 1));
			}
		}
		public int getArrayMax(int [] arr){
			for(i = 0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
			}
			return max;
		}
		public int getArrayMin(int [] arr){
		for(i = 0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			}
			return min;
		}
		}


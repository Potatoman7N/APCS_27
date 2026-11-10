/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[1001];
		int len = arr.length;
		int check = 0;
		int arrchange = 0;
		int uhmcheck = 0;
		while(uhmcheck< len){
			arr[arrchange] = 3 + check;
			System.out.println(arr[arrchange]);
			check = check + 3;
			uhmcheck++;
		}
		int [] brr = new int[1001];
		int len2 = brr.length;
		int check2 = 1000;
		int arrchange2 = 0;
		int uhmcheck2 = 0;
		brr[0] = check2;
		System.out.println(brr[0]);
		while(uhmcheck2 < (len2-1)){
			brr[arrchange2] = check2 - 1;
			System.out.println(brr[arrchange2]);
			check2--;
			uhmcheck2++;
		}


	}
}

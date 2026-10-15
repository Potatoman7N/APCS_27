/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int x, int y){
		y = y-2;
		int p = 0;
		int x1 = x;
		while(true){
			if(p>y){
				break;
			}
			x = x*x1;
			p = p+1;
		}
		return x;
	}
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter another integer: ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.println(pow(x,y));
		
		



		
	}
}

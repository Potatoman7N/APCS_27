/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
		int num2;
		int num1;
		int check;
		public static boolean checkPrime(int num){
			int check = 2;
			if(num<=1){
				return false;
			}
			while(num>check){
				if(num % check == 0){
				return false;
				}
				check++;
			}
			return true;
		}
		public static void printPrimes(int num1){
			int check = 2;
			while(check<=num1){
				if(checkPrime(check) == true){
					System.out.println(check);
				}
				check = check +1;
			}
		}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num1 = sc.nextInt();
		sc.nextLine();
			printPrimes(num1);
		}

		
		
	}

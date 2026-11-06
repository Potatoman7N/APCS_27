/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
		int num2;
		int num1;
			public void printPrimes(int b){
			while(num2!=0){
				if(checkPrime(num2) == true){
					System.out.println(num2);
				}
				else{
					return;
				}
			}
		}

		public boolean checkPrime(int a){
			if(true){
			while(num2!=0){
				num2 = num1 - 1;
				if(num1%num2 != 0){
					return true;
				}
				else{
					return false;
				}
			}
			}
			else{
				return false;
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

		
		
	}
}

/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private BankAccount(){
	String Owner;
	int Number;
	double Balance;
	boolean isActive;
	}


	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = "unknown";
		Number = 0;
		Balance = 0;
		isActive = false;
	}
		public BankAccount(String o, int a, double b, boolean c){
		Owner = o;
		Number = a;
		Balance = b;
		isActive = c;

	}
		public BankAccount()

	// -------METHODS-------

}
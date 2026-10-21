/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount( "Noah");
		BankAccount c = new BankAccount("Bobby", 50000.00);
		BankAccount d = new BankAccount("Nolan", 1000000.00);
		BankAccount e = new BankAccount("Ronny", 30000.00);

		a.printDetails();
		b.printDetails();
		c.printDetails();
		d.printDetails();
		e.printDetails();

		
	}
}

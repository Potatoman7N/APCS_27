/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String Owner;
	int Number = 0;
	private static int nextAccountNumber = ((int)(Math.random()*951+50));
	double Balance;
	boolean isActive;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = "unknown";
		Number = 0;
		Balance = 0;
		isActive = true;
	}
		public BankAccount(String o){
		Number = 0;
		Owner = o;
		Balance = 0;
		isActive = true;

	}
		public BankAccount(String o, double b){
			Number = 0;
			Owner = o;
			Balance = b;
			isActive = true;
		}

	// -------METHODS-------
	public void setOwner(String o){
		Owner = o;
		return;
	}
	public String getOwner(){
		return Owner;
	}
	public double getBalance(){
		return Balance;
	}
	public boolean getisActive(){
		return isActive;
	}
	public int getNumber(){
		return Number;
	}
	public int getnextAccountNumber(){
		return nextAccountNumber;
	}
	public void printDetails(){
		System.out.println("----------------------");
		System.out.println("Owner: " + Owner);
		System.out.println("Balance: " + Balance);
		System.out.println("Account number: " + nextAccountNumber);
		if(isActive){
			System.out.println("This bank account is active.");
		}
		else{
			System.out.println("This bank account is not active");
		}
		System.out.println("----------------------");
		System.out.println();
		return;
	}
}
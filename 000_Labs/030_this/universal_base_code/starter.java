/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randAge(){
		int ranage = (int)(Math.random()*350);
		return ranage;
	}
	public static void main(String args[]) {
		// Your code goes below here
		int x = 0;
		PooleDwarf test = new PooleDwarf();
		PooleDwarf a = new PooleDwarf(randName(), randAge());
		PooleDwarf b = new PooleDwarf(randName(), randAge());
		PooleDwarf c = new PooleDwarf(randName(), randAge());
		PooleDwarf d = new PooleDwarf(randName(), randAge());
		PooleDwarf e = new PooleDwarf(randName(), randAge());
		PooleDwarf f = new PooleDwarf(randName(), randAge());
		PooleDwarf g = new PooleDwarf(randName(), randAge());
		while(a.isSameName("Dopey") == true){
			x++;
		}
		while(a.isSameName("Bashful") == true){
			x++;
		}
		while(a.isSameName("Grumpy") == true){
			x++;
		}
		while(a.isSameName("Sleepy") == true){
			x++;
		}
		while(a.isSameName("Sneezy") == true){
			x++;
		}
		while(a.isSameName("Happy") == true){
			x++;
		}
		while(a.isSameName("Doc") == true){
			x++;
		}
		System.out.println("There are " + x);
		
	}
}

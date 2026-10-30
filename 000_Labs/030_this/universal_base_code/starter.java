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
		if(a.isSameName(b.getName())){
			x++;
		}
		if(a.isSameName(c.getName())){
			x++;
		}
		if(a.isSameName(d.getName())){
			x++;
		}
		if(a.isSameName(e.getName())){
			x++;
		}
		if(a.isSameName(f.getName())){
			x++;
		}
		if(a.isSameName(g.getName())){
			x++;
		}
		System.out.println(a.getName() + "was the name with " + x + " matches!");
	}
}

/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog a = new Dog("Rob", 2);
		Dog b = new Dog("Austin", "Welsh Corgi");
		System.out.println(a.getName() + " is a " + a.getBreed() + " that is " + a.getAge() + " years old!");
		System.out.println(b.getName() + " is a " + b.getBreed() + " that is " + b.getAge() + " years old!");

		if((a.isSleeping() == false) && (b.isSleeping() == true)){
			System.out.println(a.getName() + " is awake!");
			a.bark();
			System.out.println(b.getName() + " is startled awake by " + a.getName() + "!");
			b.bark();
		}
		else if((a.isSleeping() == false) && (b.isSleeping() == false)){
			System.out.println(a.getName() + " is awake!");
			a.bark();
			System.out.println(b.getName() + " hears " + a.getName() + "!");
			b.bark();
		}
		else if((a.isSleeping() == true) && (b.isSleeping() == false)){
			System.out.println(a.getName() + " is sleeping!");
			System.out.println(b.getName() + " isn't sleeping!");
		}
		else{
			System.out.println("Both " + a.getName() + " and " + b.getName() + " are asleep, don't wake them up!");
		}

	}

}

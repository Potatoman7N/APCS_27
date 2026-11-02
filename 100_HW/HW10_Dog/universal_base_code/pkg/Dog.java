package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		String name = "unknown";
		int age = 0;
		String breed = "unknown";
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String name){
		this.name = name;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String name, String breed){
		this.name = name;
		age = 1;
		this.breed = breed; 
	}
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
		breed = "dog dog";
	}
	public void setName(String name){
		this.name = name;
		return;
	}
	public void setAge(int age){
		this.age = age;
		return;
	}
	public void setBreed(String breed){
		this.breed = breed;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int chance = (int)(Math.random()*2+1);
		if(chance == 1){
			return true;
		}
		else if(chance == 2){
			return false;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " Barks!");
	}

}

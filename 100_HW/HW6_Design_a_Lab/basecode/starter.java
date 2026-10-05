/*  Solution
 *	Author:Nolan Lee
 *  Date:10/4/2026
 * 	Collaborator:
 */

import java.util.*;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        String sleep = "Sleep in";
        String wake = "Wake up";
        String egg = "eggs";
        String pancake = "pancakes";
        String pizza = "pizza";
        String punch = "Karate Punch";
        String kick = "Super Kick";
        String rando = "Random Item";
        int health = 80;
        int happiness = 80;
        int randomitem = (int)(Math.random()*3+1);
        int randomitem2 = (int)(Math.random()*3+1);
        int randomitem3 = (int)(Math.random()*3+1);
        Scanner sc = new Scanner(System.in);
        System.out.println("You are currently sleeping right now, your happiness levels are currently at 80 and your health levels are at 80 as well.");
        System.out.println("If either drops below zero you LOSE, the MAX is 100, based on your levels you will get a score at the end");
        System.out.println();
        System.out.println("Now tell me your name...");
        String name = sc.nextLine();
        System.out.println("You have 2 options currently, you can either wake up or sleep in, each having consequences on your levels.");
        System.out.println("Please pick either to wake up or sleep in");
        String text1 = sc.nextLine();
        System.out.println();
        if(text1.equalsIgnoreCase(sleep)){
            System.out.println("You choose to sleep in! You lose 20 health points but gain 20 happiness!");
            System.out.println("You now have " + (health - 20) + " health points left :( and you have " + (happiness+20) + " happiness left :)!");
            health = health - 20;
            happiness = happiness + 20;
            System.out.println();
        }
        else if(text1.equalsIgnoreCase(wake)){
            System.out.println("You choose to wake up! You gain 20 health points but lose 20 happiness!");
            System.out.println("You now have " + (health + 20) + " health points left :)! and you have " + (happiness - 20) + " happiness left :(");
            health = health + 20;
            happiness = happiness - 20;
        }
        else{
            System.out.println("You choose to do nothing, you fall asleep forever and out live everything and everyone, countless wars happen around you but you could do nothing but sleep, you regret your actions, please rerun the program for a second chance");
        }
        System.out.println("Now let's eat some breakfast! There are 3 options, eggs, pancakes, or a pizza!");
        String text2 = sc.nextLine();
        System.out.println();
        
        if(text2.equalsIgnoreCase(egg)){
            System.out.println("You choose the eggs! You eat them in dismay, you gain 10 health points but lose 20 happiness");
            System.out.println();
            System.out.println("You now have " + (health + 10) + " health points left :)! and you have " + (happiness - 20) + " happiness left :(");
            health = health + 10;
            happiness = happiness - 20;
            System.out.println();
                  if(health<0 || happiness<0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
        }
        else if(text2.equalsIgnoreCase(pancake)){
            System.out.println("You choose the pancakes! You eat them with glee but feel a little uneasy, you gain 20 happiness, but lose 20 health points");
            System.out.println();
            System.out.println("You now have " + (health - 20) + " health points left :( and you have " + (happiness+20) + " happiness left :)!");
            health = health - 20;
            happiness = happiness + 20;
            System.out.println();
            if(health<0 || happiness<0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
        }
        else if(text2.equalsIgnoreCase(pizza)){
            System.out.println("You choose the PIZZA! You gobble it up but feel a very uneasy, you gain 40 happiness, but lose 40 health points");
            System.out.println();
            System.out.println("You now have " + (health - 40) + " health points left :( and you have " + (happiness+40) + " happiness left :)!");
            health = health - 40;
            happiness = happiness + 40;
            System.out.println();
            if(health<0 || happiness<0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
        }
        else{
            System.out.println("You choose to do nothing and die of starvation, pick an option next time ok? Rerun the program for a second chance");

        }
        if(happiness>100){
            System.out.println("You have gone over the maximum amount of happiness, the person above takes away the amount in order to keep balance");
            happiness = 100;
            System.out.println("You now have " + happiness + " happiness");
            System.out.println();
        }
        if(health>100){
            System.out.println("You have gone over the maximum amount of health points, the person above takes away the amount in order to keep balance");
            health = 100;
            System.out.println("You now have " + health + " health points");
            System.out.println();
        }

        System.out.println("Now it is time to head off to school!");
        System.out.println("However on the way to school you encounter  a bully that blocks your way!");
        System.out.println();
        System.out.println("You need to protect yourself!");
        System.out.println("The bully has 100 health points, you have " + health + "!");
        int bhealth = 100;
        if(health<60){
            System.out.println("What!? Your health levels are too low, the bully gets the first move!");
            int random = (int)(Math.random()*3+1);
            if(random == 1){
                System.out.println("The bully uses ANGRY BEATING!");
                System.out.println("You lose 10 health points and 10 happiness!");
                System.out.println("You now have " + (health - 10) + " health points left :( and you have " + (happiness-10) + " happiness left :(");
                health = health - 10;
                happiness = happiness - 10;
                System.out.println();
                if(health<0 || happiness<0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            else if(random == 2){
                System.out.println("The bully uses THROAT CHOP!");
                System.out.println("You lose 15 health points and 15 happiness!");
                System.out.println("You now have " + (health - 15) + " health points left :( and you have " + (happiness-15) + " happiness left :(");
                health = health - 15;
                happiness = happiness - 15;
                System.out.println();
                if(health<0 || happiness<0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            else if(random == 3){
                System.out.println("The bully is supercharged and uses DEATH BLOW!");
                System.out.println("You lose 20 health points and 20 happiness!");
                System.out.println("You now have " + (health - 20) + " health points left :( and you have " + (happiness-20) + " happiness left :(");
                health = health - 20;
                happiness = happiness - 20;
                System.out.println();
                if(health<0 || happiness<0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
        }
        else{
            System.out.println("You can choose between 3 moves, Karate Punch, Super Kick, or a Random item!");
            String text3 = sc.nextLine();
            if(text3.equalsIgnoreCase(punch)){
                System.out.println("You use karate punch! The bully loses 40 hp! The bully now has " + (bhealth-40) + "hp!" );
                bhealth = bhealth-40;
                System.out.println();
                    if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
            }
            else if(text3.equalsIgnoreCase(kick)){
                System.out.println("You use Super Kick! The bully loses 35 hp! The bully now has " + (bhealth-35) + "hp!" );
                bhealth = bhealth-35;
                System.out.println();
                    if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
            }
            else if(text3.equalsIgnoreCase(rando)){
                System.out.print("You chose the random item! Your random item is...");
                if(randomitem==1){
                    System.out.println("A POTATO!!! Oh, it's a potato...uhm I guess you throw it at the bully and...WAIT HE SLIPS ON IT AND IT DOES 100 DAMAGEEE!!!! THE BULLY NOW HAS " + (bhealth-100) + "hp!");
                    bhealth = bhealth-100;
                    System.out.println();
                    if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
                }
                else if(randomitem==2){
                    System.out.println("A 10000 KILOTON NUCLEAR BOMB!!!! OH MY GOODNESS THIS IS GONNA DO IT...wait your too weak to set it off or pick it up...0 damage...The bully now has " + bhealth + "hp!");
                }
                else if(randomitem==3){
                    System.out.println("A salad! The bully is repulsed by it and it does 35 damage! The bully now has " + (bhealth-35) + "hp!");
                    bhealth = bhealth-35;
                    System.out.println();
                    if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
                }
            }
            else{
                System.out.println("You chose to do nothing? Uhm pick an option next time ok?");
                 System.out.println();
            }
            
        }
            int random = (int)(Math.random()*3+1);
              if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
            else{
            if(random == 1){
                System.out.println("The bully uses ANGRY BEATING!");
                System.out.println("You lose 10 health points and 10 happiness!");
                System.out.println("You now have " + (health - 10) + " health points left :( and you have " + (happiness-10) + " happiness left :(");
                health = health - 10;
                happiness = happiness - 10;
                System.out.println();
                if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            else if(random == 2){
                System.out.println("The bully uses THROAT CHOP!");
                System.out.println("You lose 15 health points and 15 happiness!");
                System.out.println("You now have " + (health - 15) + " health points left :( and you have " + (happiness-15) + " happiness left :(");
                health = health - 15;
                happiness = happiness - 15;
                System.out.println();
                 if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            else if(random == 3){
                System.out.println("The bully is supercharged and uses DEATH BLOW!");
                System.out.println("You lose 20 health points and 20 happiness!");
                System.out.println("You now have " + (health - 20) + " health points left :( and you have " + (happiness-20) + " happiness left :(");
                health = health - 20;
                happiness = happiness - 20;
                System.out.println();
                if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            }
             System.out.println("You can choose between 3 moves, Karate Punch, Super Kick, or a Random item!");
            String text3 = sc.nextLine();
            if(text3.equalsIgnoreCase(punch)){
                System.out.println("You use karate punch! The bully loses 40 hp! The bully now has " + (bhealth-40) + "hp!" );
                bhealth = bhealth-40;
                System.out.println();
                    if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
            }
            else if(text3.equalsIgnoreCase(kick)){
                System.out.println("You use Super Kick! The bully loses 35 hp! The bully now has " + (bhealth-35) + "hp!" );
                bhealth = bhealth-35;
                System.out.println();
                    if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
            }
            else if(text3.equalsIgnoreCase(rando)){
                System.out.print("You chose the random item! Your random item is...");
                if(randomitem2==1){
                    System.out.println("A POTATO!!! Oh, it's a potato...uhm I guess you throw it at the bully and...WAIT HE SLIPS ON IT AND IT DOES 100 DAMAGEEE!!!! THE BULLY NOW HAS " + (bhealth-100) + "hp!");
                    bhealth = bhealth-100;
                    System.out.println();
                    if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
                }
                else if(randomitem2==2){
                    System.out.println("A 10000 KILOTON NUCLEAR BOMB!!!! OH MY GOODNESS THIS IS GONNA DO IT...wait your too weak to set it off or pick it up...0 damage...The bully now has " + bhealth + "hp!");
                    System.out.println();
                }
                else if(randomitem2==3){
                    System.out.println("A salad! The bully is repulsed by it and it does 35 damage! The bully now has " + (bhealth-35) + "hp!");
                    bhealth = bhealth-35;
                    System.out.println();
                    }
                }
            else{
                System.out.println("You chose to do nothing? Uhm pick an option next time ok?");
                 System.out.println();
            }

            random = (int)(Math.random()*3+1);
            if(bhealth>0){
            if(random == 1){
                System.out.println("The bully uses ANGRY BEATING!");
                System.out.println("You lose 10 health points and 10 happiness!");
                System.out.println("You now have " + (health - 10) + " health points left :( and you have " + (happiness-10) + " happiness left :(");
                health = health - 10;
                happiness = happiness - 10;
                System.out.println();
                if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
            }
            }
            else if(random == 2){
                System.out.println("The bully uses THROAT CHOP!");
                System.out.println("You lose 15 health points and 15 happiness!");
                System.out.println("You now have " + (health - 15) + " health points left :( and you have " + (happiness-15) + " happiness left :(");
                health = health - 15;
                happiness = happiness - 15;
                System.out.println();
                 if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            else if(random == 3){
                System.out.println("The bully is supercharged and uses DEATH BLOW!");
                System.out.println("You lose 20 health points and 20 happiness!");
                System.out.println("You now have " + (health - 20) + " health points left :( and you have " + (happiness-20) + " happiness left :(");
                health = health - 20;
                happiness = happiness - 20;
                System.out.println();
                if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            }
            if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }
            else{
             System.out.println("You can choose between 3 moves, Karate Punch, Super Kick, or a Random item!");
             text3 = sc.nextLine();
            if(text3.equalsIgnoreCase(punch)){
                System.out.println("You use karate punch! The bully loses 40 hp! The bully now has " + (bhealth-40) + "hp!" );
                bhealth = bhealth-40;
                System.out.println();
            }
            else if(text3.equalsIgnoreCase(kick)){
                System.out.println("You use Super Kick! The bully loses 35 hp! The bully now has " + (bhealth-35) + "hp!" );
                bhealth = bhealth-35;
                System.out.println();
            }
            else if(text3.equalsIgnoreCase(rando)){
                System.out.print("You chose the random item! Your random item is...");
                if(randomitem3==1){
                    System.out.println("A POTATO!!! Oh, it's a potato...uhm I guess you throw it at the bully and...WAIT HE SLIPS ON IT AND IT DOES 100 DAMAGEEE!!!! THE BULLY NOW HAS " + (bhealth-100) + "hp!");
                    bhealth = bhealth-100;
                    System.out.println();
                }
                else if(randomitem3==2){
                    System.out.println("A 10000 KILOTON NUCLEAR BOMB!!!! OH MY GOODNESS THIS IS GONNA DO IT...wait your too weak to set it off or pick it up...0 damage...The bully now has " + bhealth + "hp!");
                    System.out.println();
                }
                else if(randomitem3==3){
                    System.out.println("A salad! The bully is repulsed by it and it does 35 damage! The bully now has " + (bhealth-35) + "hp!");
                    bhealth = bhealth-35;
                    System.out.println();
                }
            }
            else{
                System.out.println("You chose to do nothing? Uhm pick an option next time ok?");
                 System.out.println();
            }
            }

            random = (int)(Math.random()*3+1);
             if(bhealth<=0){
                        System.out.println("YOU BEAT THE BULLY! He runs away deafeated and you hit an emote in victory!");
                        System.out.println();
                    }

            else{
                if(bhealth>0){
                if(random==1){
                System.out.println("The bully uses ANGRY BEATING!");
                System.out.println("You lose 10 health points and 10 happiness!");
                System.out.println("You now have " + (health - 10) + " health points left :( and you have " + (happiness-10) + " happiness left :(");
                health = health - 10;
                happiness = happiness - 10;
                System.out.println();
                if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            else if(random == 2){
                System.out.println("The bully uses THROAT CHOP!");
                System.out.println("You lose 15 health points and 15 happiness!");
                System.out.println("You now have " + (health - 15) + " health points left :( and you have " + (happiness-15) + " happiness left :(");
                health = health - 15;
                happiness = happiness - 15;
                System.out.println();
                 if(health<=0||happiness<=0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            else if(random == 3){
                System.out.println("The bully is supercharged and uses DEATH BLOW!");
                System.out.println("You lose 20 health points and 20 happiness!");
                System.out.println("You now have " + (health - 20) + " health points left :( and you have " + (happiness-20) + " happiness left :(");
                health = health - 20;
                happiness = happiness - 20;
                System.out.println();
                if(health<0 || happiness<0){
                    System.out.println("Sadly you died, rerun the program to try again.");
                    System.out.println();
                }
            }
            }
            }

        if(bhealth<=0){
        System.out.println();
        System.out.println(name +"                 SCORE");
        System.out.println("---------------------------------");
        if(happiness>=80 || health>=80){
            System.out.println("A RANK PERFECTION, you are the King!");
        }
        else if(happiness>=60 || health>=60){
            System.out.println("B RANK GREAT, you are pretty good");
        }
        else if(happiness>=40 || health>=40){
            System.out.println("C RANK OK, you can do better, you're okay");
        }
        else{
            System.out.println("F RANK BRUH, dude lock in next time alright?");
        }
        System.out.println();
        System.out.println("Thank you for playing my game of life!");
        }
}
}
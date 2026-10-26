/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
       int random = (int)(Math.random()*2+1);
       if(random == 1){
        return "Rock";
       }
       else if(random == 2){
        return "Paper";
       }
       else if(random == 3){
        return "Scissors";
       }
       else{
        return "";
       }

    }
    public static int compare2(String choice2, String choice1){
        if((choice2.equals("Rock"))&&(choice1.equalsIgnoreCase("Rock"))){
            return 0;
        }
        else if((choice2.equalsIgnoreCase("Rock"))&&(choice1.equalsIgnoreCase("Paper"))){
            return 1;
        }
        else if((choice2.equalsIgnoreCase("Rock"))&&(choice1.equalsIgnoreCase("Scissors"))){
            return 2;
        }
        else if((choice2.equalsIgnoreCase("Paper"))&&(choice1.equalsIgnoreCase("Rock"))){
            return 2;
        }
        else if((choice2.equalsIgnoreCase("Paper"))&&(choice1.equalsIgnoreCase("Paper"))){
            return 0;
        }
        else if((choice2.equalsIgnoreCase("Paper"))&&(choice1.equalsIgnoreCase("Scissors"))){
            return 1;
        }
        else if((choice2.equalsIgnoreCase("Scissors"))&&(choice1.equalsIgnoreCase("Rock"))){
            return 1;
        }
        else if((choice1.equalsIgnoreCase("Scissors"))&&(choice1.equalsIgnoreCase("Paper"))){
            return 2;
        }
        else if((choice1.equalsIgnoreCase("Scissors"))&&(choice1.equalsIgnoreCase("Scissors"))){
            return 0;
        }
        else{
            return -1;
        }
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("--------------------------------------------------------------");
        System.out.print("Would you like to play the computer? (yes/no/done): ");
        String text1 = sc.nextLine();
        System.out.println("--------------------------------------------------------------");
            if(text1.equalsIgnoreCase("done")){
                break;
            }
            else if(text1.equalsIgnoreCase("Yes")){
            System.out.println("Please enter rock/paper/scissors: ");
            String choice1 = sc.nextLine();
            while(!choice1.equalsIgnoreCase("Rock")&&!choice1.equalsIgnoreCase("Paper")&&!choice1.equalsIgnoreCase("Scissors")){
                System.out.println("That was an invalid input, please try again.");
                choice1 = sc.nextLine();
                if(choice1.equalsIgnoreCase("Rock")||choice1.equalsIgnoreCase("Paper")||choice1.equalsIgnoreCase("Scissors")){
                    break;
                }
            }
            String choice2 = getObject();
            int result = compare2(choice2, choice1);
            if(result==0){
                System.out.println("Draw!");
                System.out.println();
            }
            else if(result==1){
                System.out.println("You win!");
                System.out.println();
            }
            else if(result==2){
                System.out.println("The computer wins!");
                System.out.println();
            }
        }
        else if(text1.equalsIgnoreCase("No")){
            System.out.println("How many times would you like the computer to play itself?");
            int num1 = sc.nextInt();
            sc.nextLine();
            int num2 = 0;
            int ties = 0;
            int player1 = 0;
            int player2 = 0;
            while(num2<num1){
            String com1 = getObject();
            String com2 = getObject();
            int comresult = compare2(com2, com1);
            if(comresult == 1){
                player1++;
            }
            else if(comresult == 2){
                player2++;
            }
            else if(comresult == 0){
                ties++;
            }
            num2++;
            }
            System.out.println("Player 1 wins: " + player1);
            System.out.println("Player 2 wins: " + player2);
            System.out.println("Ties: " + ties);

        }
        else{
            System.out.println("--------------------------------------------------------------");
            System.out.println("That was an invalid input, please try again.");
        }


    }
    }
}

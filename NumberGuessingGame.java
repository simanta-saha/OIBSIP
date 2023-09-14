package oasis;
import java.util.Scanner;
public class NumberGuessingGame {
        public static void main(String[] args){
                int Number;
                int UserInput;
                int Score = 0;
                int Chance = 7;
                int Trial = 1;
                Number = (int)(Math.random()*100);
                
            System.out.println("********WELCOME TO THE NUMBER GUESSING GAME********");
            System.out.println("Guess a Number between 1-100");
            System.out.println("YOU HAVE TOTAL 7 CHANCES TO GO!");
            System.out.println("GOOD LUCK PLAYER!!!");
            do { 
                System.out.println("OK LET'S GO! \nTRY TO GUESS THE NUMBER => ");
                Scanner sc = new Scanner(System.in);
                UserInput = sc.nextInt();
                if(Trial<Chance) {
                    if(UserInput == Number) {
                        System.out.println("BULLEYE!! YOU GUESSED IT RIGHT!");
                            break;
                    }
                    else if(UserInput>Number){
                        System.out.println("NO!! Too Large");
                }
                    else
                        System.out.println("NO!! Too Small");
                        Trial++;
                        Score = (Chance - Trial + 1)*100/Chance;   
                } else if(Trial == Chance && UserInput == Number){
                        System.out.println("BULLEYE!! YOU GUESSED IT RIGHT!");
                        break;
                }
                else {
                    System.out.println("Out of Chances! \nBetter Luck Next Time...");
                    Score = 0;
                    break;
                }
            }
            while(UserInput>0);
                    System.out.println("The Number is : " + Number);
                    if(UserInput>0){
                        System.out.println("Total Score = " + Score + "%");
                    }
                    else {
                        System.out.println("DO YOU WANNA TRY AGAIN...?");
                    }
                    System.out.println("PRESS 1 TO TRY AGAIN AND 0 TO EXIT : ");
                    Scanner sc = new Scanner(System.in);
                    int i = sc.nextInt();
                    if(i == 1) {
                        main(args);
                    }
                    else {
                        System.out.println("THANK YOU!!");
                    }
            
                    
        }
}
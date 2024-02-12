//Number Guessing Game

import java.util.Scanner;
import java.util.Random;

public class guessthenumber{

	public static void main(String args[])
    { 
    		generateRandom();
    } 



    public static void generateRandom(){
    	
    	Random rand=new Random();

    	
    	int randomNum=rand.nextInt(101);

    	
    	guess(randomNum);
    }



    public static void guess(int randomNum){
    	
    	Scanner sc=new Scanner(System.in);

    	
    	System.out.println("");
    	System.out.println("Number Guessing Game");
    	System.out.print("Guess a number between 0-100: ");
    	int guess=sc.nextInt();
    	System.out.println("");
        int attempts=0;

    	
    	do {
            System.out.println("Guess a number between 0-100: ");
    		guess=sc.nextInt();
    		System.out.println("");
            attempts++;

            if(guess<randomNum){
                System.out.print("  Too low.Try Again!!");
            }
            else if(guess>randomNum){
                System.out.print("  Too high.Try Again!!");

            }
            else{
                System.out.println("Congratulations!Yo have guessed in "  +  attempts + " attempts!");
            }
        }
            while(guess!=randomNum);

            System.out.println("Press 1 to Play again.");
    	System.out.println("Press 0 to exit.");
    	int choice=sc.nextInt();
            if(choice==1)
    		generateRandom();
    	else
    		return;
            
        }
    }
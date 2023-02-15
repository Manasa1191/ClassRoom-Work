// CS210 Assignment #5 "GuessingGame"
// Manasa Bethapudi
// Code to play number guessing game.
import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {
    	
        Scanner console = new Scanner(System.in);
    	boolean multiple_gamePlay = true;
    	int total_Games = 0;
    	int total_Guesses = 0;
    	int win = 0;
    	do {
    		int n = gamePlay(console);
    		total_Guesses = total_Guesses + n;
    		if(win == 0 || n < win) {
    			win = n;
    		}
    		total_Games++;
    	}while(multiple_gamePlay());
    	
    	//Code to display overall statistics of the game.
    	double AvgNumberOfGuess = (double)total_Guesses / total_Games;
    	System.out.println("\n");
    	System.out.println("Your overall results: ");
    	System.out.println("Total games = "+total_Games);
    	System.out.println("Total guesses = "+total_Guesses);
    	System.out.printf("Guesses/game = %.1f\n", AvgNumberOfGuess);
    	System.out.println("Best game = "+win);
    }
    
    
    
  //A method that picks a random number, compares with user's guess and .....
  //prints number of guesses if user guessed it right. Also returns number of guesses made.
  //
    public static int gamePlay(Scanner console) { 
        
    	Random rand = new Random();
    	int number = rand.nextInt(100)+1;
    	int total_Guesses = 0;
    	int guess;
    	System.out.println();
    	System.out.println("I'm thinking of a number between 1 and 100...");
    	do {
    		System.out.print("Your guess? ");
    		guess = console.nextInt();
    		total_Guesses++;
    		if(number < guess) {
    			System.out.println("Its lower.");
    		}
    		else if(number > guess){
    			System.out.println("Its higher.");
    		}
    	}while(guess != number);
    	
    	System.out.println("You guessed it in "+total_Guesses+" guesses!");
    	return total_Guesses;
    } 
    
        
  // Method that ask's user if he/she wants to continue playing.
    public static boolean multiple_gamePlay() {
    	
    	System.out.print("Play again? ");
    	Scanner con = new Scanner(System.in);
    	String s= con.next();
    	
    	if(s.startsWith("y") || s.startsWith("Y")) {
    		
    		return true;
    	}
    	else {
    	
    		return false;
    	}
    	
    }
    
}
    
    
    


/*
* Class CMSC203
* Instructor: Ahmed Tarek
* Description: This class Creates the logic for the Random number guesser. Using the RNG class.
* Due: 6/29/2021
* Platform: Eclipse
* I pledgethat i have completed the programmming assignment independently. I have not copied the code from any student or any source. i have not given any code to 
 any student
 Print your name here: Shamariah Ogu
*/

import java.util.Random;

import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String args[]) {
		
	boolean gameis_on = true;
	Scanner obj = new Scanner(System.in);
	
	while(gameis_on == true) { // set up while loop for game
	RNG rng = new RNG(); //new RNG class
	int lowguess = 0;//create lowguess acording to RNG class
	int highGuess = 100; //create highguess acording to RNG class
	int random_number = rng.rand();
	
	System.out.println(random_number); //test print, to help test
	System.out.println("Enter your first guess:"); //initialize first guess
	int nextGuess = obj.nextInt(); //scanner object
	int counter = 0; //create counter, assign to zero
	
	//int earlierguess = nextGuess;
	//int previousguess = earlierguess;
	
		while (nextGuess != random_number) { //initialize while loop for guess logic	
		
				if (nextGuess == random_number) {
					break;
				}
				else if(nextGuess > random_number) { //When guess is greater than the random number
					System.out.println("Too High");
					highGuess = nextGuess;
					RNG.inputValidation(nextGuess, lowguess, highGuess);
					
					//System.out.println("   >>> Guess must be between "+lowguess+" and "+highGuess+
							   //".  Try again");	
				}
				else if (nextGuess < random_number) { //when guess is less than the  randomnumber
					lowguess = nextGuess;
					System.out.println("Too Low");
					RNG.inputValidation(nextGuess, lowguess, highGuess);
					//System.out.println("   >>> Guess must be between "+lowguess+" and "+highGuess+
							   //".  Try again");	
				}
				
		System.out.println("Number of guess is  " + RNG.getCount());
		System.out.println("Enter your next guess: ");
		nextGuess = obj.nextInt();
		
		
		
		}
		//initialized when the user guessess the correct number
		if (nextGuess == random_number); 
		System.out.println("Congratulations, you guess correctly");
		System.out.println("Try again? (Yes or no)");
		String tryagain = obj.next();
		if (tryagain.equals("yes")) {
			continue;
		}
		else if (tryagain.equals("no")) {
			System.out.println("Thanks for playing...");
			break;
		}
		else {
			System.out.println("invalid input");
			break;
		}
	}
		
			
}
}
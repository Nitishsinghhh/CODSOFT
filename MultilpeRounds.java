
import java.util.Scanner;
import java.util.Random;

public class MultilpeRounds {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random random = new Random();

boolean Again = true;

while (Again) {
int Guess = random.nextInt(10) + 1;
int Tries = 0;
boolean GuessCorrect = false;

System.out.println("Welcome in Number Guessing Game!");
System.out.println("you have to choose a number between 1 and 10 , guess a number.");

while (!GuessCorrect) {
System.out.print("Enter your guess: ");
int userGuess = sc.nextInt();

if (userGuess == Guess) {
GuessCorrect = true;
System.out.println("Congratulations! You guessed the number in " + Tries + " tries.");
} 

else if (userGuess < Guess) {
System.out.println("Try a higher number.");
} 

else {
System.out.println("Try a lower number.");
}
}

System.out.print("Do you want to play again? (yes/no): ");
String playAgain = sc.next();
Again = playAgain.equalsIgnoreCase("yes");
}

System.out.println("Thanks for playing!");
}
}

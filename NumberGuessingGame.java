import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("guess the number between 1 and 10.");

        for (int i = 0; i < 3; i++) {
            // while (!guessed) {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    break;
                }
                 else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }
            System.out.println("The number was : "+" "+targetNumber);
        }
    }

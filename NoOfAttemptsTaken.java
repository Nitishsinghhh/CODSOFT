import java.util.Scanner;
import java.util.Random;

public class NoOfAttemptsTaken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Number Guessing Game!");

        int totalScore = 0;
        boolean playAgain = true;
        
        while (playAgain) {
            int Number = random.nextInt(10) + 1;
            int attempts = 0;

            System.out.println("Think a number between 1 and 10. guess it");

            while (true) {
                System.out.print("Guess a number :");
                int guess = sc.nextInt();
                attempts++;

                if (guess < Number) {
                    System.out.println("You guesses a low number ");
                }
                 else if (guess > Number) {
                    System.out.println("it is not matched ,large number ");
                } 
                else 
                {
                    System.out.println("Congratulations! You guessed the number " + Number);
                    totalScore += (10 - attempts); // Calculate and update the score
                    break;
                }
            }

            System.out.println("Your current score: " + totalScore);

            System.out.print("Do you want to play again? (yes/no): ");
            String AgainInput = sc.next();
            playAgain = AgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + totalScore);
    }
}


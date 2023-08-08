import java.util.Random;
import java.util.Scanner;

public class LimitTheNumberOfAtempts {
    // private static final char Y = 0;

    public static void main(String[] args) {
        Random random = new Random();
        int guess = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        int userInput;
        int i = 0;
        final int maxAttempt = 3;

        System.out.println("Welcome to My Number game ");
        System.out.println(" guess the number between 1 and 10.");

        while (i < maxAttempt) {
            i++;
            System.out.print("Attempt " + i + ": Enter your guess: ");
            userInput = sc.nextInt();

            if (userInput == guess) {
                System.out.println("Congratulations! You guessed the correct number: " + guess);
                break;
            } else if (userInput < guess) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
        if (i == maxAttempt) {
            System.out.println("Sorry, you've reached the maximum number of attempts.");
            System.out.println("The correct number was: " + guess);
        }

    }
}

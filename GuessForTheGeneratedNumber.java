import java.util.Random;
import java.util.Scanner;

public class GuessForTheGeneratedNumber {
    public static void main(String[] args) {
        int Guess, number;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess a number between 1 And 10 : ");
        Guess = sc.nextInt();
        System.out.println("Your number is :" + " " + (Guess+1));
        number = random.nextInt(10);
        if (Guess==number) {
            System.out.println("You win");
        }
        else{
            System.out.println(" Sorry,you guess a wrong number ");
        }
        System.out.println("Number was :" + " " + number);
    }

}

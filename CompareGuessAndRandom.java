import java.util.Random;
import java.util.Scanner;

public class CompareGuessAndRandom {
    public static void main(String[] args) {
        int Guess, answer;
        final int number=10;

        Scanner sc=new Scanner(System.in);
        Random random =new Random();
        
       
        
        answer=random.nextInt(number)+1;
        System.out.print("Guess A number between 1 and 10 : ");
        Guess=sc.nextInt();

        if (Guess==answer) {
            System.out.println("Good ,The number was : "+ answer );
        }

        else if (Guess<answer) 
        {
           System.out.println("Your guess is too low "); 
        }
        else
        {
            System.out.println("your guess is too high  ");
        }
        System.out.println("your number is :"+Guess+" "+" And the Generated number was : "+answer);
    }
}

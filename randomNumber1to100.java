import java.util.Random;

public class randomNumber1to100 {
    public static void main(String[] args) {
        // Random number is generated between 1 and 100
        int number;
        Random random = new Random();
        number = random.nextInt(100);
        System.out.println("Random number is generated between 1 and 100 : " + " " + (number + 1));
    }

}
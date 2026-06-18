import java.util.Random;
import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // 1. Generate random number between 1 and 500
        int secretNumber = random.nextInt(501) ;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 500!");

        // 2. Loop until the guess matches the secret number
        while (userGuess != secretNumber) {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt(); // Get user input
            attempts++;                  // Count the guess

            // 3. Check the guess
            if (userGuess < secretNumber) {
                System.out.println("Too small!");
            } else if (userGuess > secretNumber) {
                System.out.println("Too big!");
            }
        }

        // 4. Winning message (Runs only when the loop ends)
        System.out.println("🎉 Congratulations! You got it in " + attempts + " guesses.");
        input.close();
    }
}
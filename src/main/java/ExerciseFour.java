import java.util.Scanner;

import static java.lang.Long.sum;

public class ExerciseFour {
    static void main() {
        //Declare variable
        int number1;
        int number2;
        int number3;
        double avg;

        //input variables
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        number1 = scanner1.nextInt();

        System.out.print("Enter 2nd Number: ");
        number2 = scanner2.nextInt();

        System.out.print("Enter 3rd Number: ");
        number3 = scanner3.nextInt();

        avg = (number1 + number2 + number3)/ 3;


        IO.println("Average: " + avg);

        // Step 5: Close the scanner
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}

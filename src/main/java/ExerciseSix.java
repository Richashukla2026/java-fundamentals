import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        //Declare variable
        int number1;
        int number2;


        //input variables
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter First Number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter 2nd Number: ");
        number2 = scanner.nextInt();

        // Perform and print the four basic operations
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));

        // This will print 3 because both numbers are integers
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

        scanner.close();

    }
    }




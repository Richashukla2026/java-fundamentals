import javax.naming.Name;
import java.util.Scanner;

public class ExerciseTwo {
    static void main() {
        //Declare variable
        int year;

        //Assign value
        year = 2024;
        //input variables
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter your year: ");
        year = scanner1.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");

        }

        // Step 5: Close the scanner
        scanner1.close();
    }
}

import java.util.Scanner;

public class ExerciseFive
{
    static void main()
    {
        String firstName;
        String lastName;

        //input variables
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = scanner1.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = scanner2.nextLine();

        IO.println("Hello, " + firstName + " " +lastName +"! Welcome aboard.");

        scanner1.close();
        scanner2.close();
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;
public class PractiseJava {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int FirstNumber = input.nextInt();

        System.out.print("Enter Second number: ");
        int SecondNumber = input.nextInt();

        System.out.println(FirstNumber+ " + " + SecondNumber+" = " + (FirstNumber+SecondNumber ));
        System.out.println(FirstNumber+ " * " +SecondNumber+ " = " +(FirstNumber*SecondNumber));
        System.out.println(FirstNumber+ " - " +SecondNumber+ " = " +(FirstNumber-SecondNumber));
        System.out.println(FirstNumber+ " / " +SecondNumber+ " = " +(FirstNumber/(SecondNumber*1.0)));




    }
}

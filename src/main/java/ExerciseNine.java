import java.util.Scanner;
public class ExerciseNine
 {
    static void main()
    {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius= input.nextDouble();

        double fahrenheit =  celsius * 9.0 / 5 + 32;

        double kelvin = celsius + 273.15;

        System.out.println("Celsius:    "+ celsius+" °C");
        System.out.println("fahrenheit: "+ fahrenheit+" °F" );
        System.out.println("Kelvin:     "+ kelvin+" K" );


    }
}

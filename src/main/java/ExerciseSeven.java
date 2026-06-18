import java.util.Scanner;

public class ExerciseSeven
{
    static void main()
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of seconds: ");
        int inputSeconds = input.nextInt();

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        System.out.println(hours+":" + minutes+ ":" + seconds);



    }
}

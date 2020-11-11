/**
 * The purpose of this program is to calculate your age in minutes
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
import java.util.Scanner;
public class AgeCalculatorV2
{
    public static void main(String[] args)
    {
        //construct a Scanner object called in
        Scanner in = new Scanner(System.in);

        //ask user for input
        String firstName;
        System.out.print("Please enter your name: ");
        firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");

        System.out.print("Please your age in years: ");
        String userAge = in.next();
        int ageInYears = Integer.parseInt(userAge);

        //calculate age in minutes
        int ageInHours;
        int ageInMinutes;
   
        double approxAgeInDays = ageInYears * 365.25;
        ageInHours = (int)approxAgeInDays * 24;
        ageInMinutes = ageInHours * 60;
        
        String firstInitial = firstName.substring(0,1);
        String name = firstInitial + "  . " + lastName;

        // display name and minutes to screen
        System.out.print("Name: " + name);
        System.out.print("\tab\tab Age in Minutes: " + ageInMinutes + "/n");
    }
}

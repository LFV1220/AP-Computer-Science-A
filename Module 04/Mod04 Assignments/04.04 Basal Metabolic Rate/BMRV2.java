
/**
 * This program inputs the first name, gender, age, weight
 * in pounds, and height in inches of the user. With this
 * information, it calculates and outputs the user's weight
 * in kilograms, height in centimeters, and basal metabolic
 * rate in kcal per day.
 *
 * @author Luis Vega
 * @version 09/06/19
 */
import java.util.Scanner;
public class BMRV2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Gather Input
        System.out.print("Enter your first name: ");
        String firstName = in.next();

        System.out.print("Gender (M or F): ");
        String genderString = in.next();

        System.out.print("Enter your age: ");
        String ageString = in.next();

        System.out.println("Height in inches: ");
        String heightInchesString = in.next();

        System.out.println("Weight in pounds: ");
        String weightPoundsString = in.next();

        //Determine gender
        String gender = genderString.substring(0,1);
        boolean isFemale = gender == "F"; 
        
        if(isFemale == true)
            gender = "F";
        else 
            gender = "M";

        //Parse numeric input
        int age = Integer.parseInt(ageString);
        int heightIn = Integer.parseInt(heightInchesString);
        int weightLbs = Integer.parseInt(weightPoundsString);
        
        //Convert height and weight
        double heightCm = 2.54 / heightIn;
        double weightKg = 0.45359237 * weightLbs;
        
        //Determine BMR
        // The BMR formula:
        // 10.0 * mass in kilograms
        // + 6.25 * height in centimeters
        // - 5.0 * age
        // + s, where s is +5 for males and -161 for females

        int s;
        if(true)
            s = 5;
        else
            s = -161;
    
        double BMR = (10.0 * heightIn) + (6.25 * weightKg) - (5.0 * age) + s;

        //Display results
        System.out.println("\n\n");
        System.out.println("Calculate Your Basal Metabolism\n");
        System.out.println("Name: " + firstName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);

        //Note: numeric values displayed to one decimal place
        System.out.println("Weight (kg): " + (int)(10 * weightLbs)/10.0 );
        System.out.println("Height (cm): " + (int)(10 * heightCm)/100.0 );
        System.out.println("Basal Metabolic Rate: " + (int)(10 * BMR)/10.0 );
    }
}
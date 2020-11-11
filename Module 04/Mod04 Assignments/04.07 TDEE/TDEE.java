
/**
 * Write a program to calculate total daily energy expenditure.
 *
 * @author Luis Vega
 * @version 9/20/19
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
        //Variable Initialization
        String name;
        int BMR;
        String gender;
        String gender1;
        String gender2;
        String letter;
        String letter1;
        double TDEE;
        double activityFactor = 0.0;
        
        Scanner in = new Scanner(System.in);
    
        //User Input
        System.out.println("Please enter your name: ");
        name = in.nextLine();
        
        System.out.println("Please enter your BMR: ");
        BMR = in.nextInt();
        
        System.out.println("Please enter your gender (M/F): ");
        gender2 = in.next();
        gender1 = gender2.substring(0,1);
        System.out.println();
        
        if(gender1.equalsIgnoreCase("M"))
            gender = "Male";
        else if(gender1.equalsIgnoreCase("F"))
            gender = "Female";
        else
            gender = "Unknown";
            
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manuel Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manuel Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manuel Labor)");
        System.out.println();
        
        System.out.println("Enter the letter corresponding to your activity level: ");
        letter1 = in.next();
        letter = letter1.substring(0,1);
        
        //Calculations
        if(letter.equalsIgnoreCase("A") && gender.equals("Male"))
            activityFactor += 1.0;
        else if(letter.equalsIgnoreCase("B") && gender.equals("Male"))
            activityFactor += 1.3;
        else if(letter.equalsIgnoreCase("C") && gender.equals("Male"))
            activityFactor += 1.6;
        else if(letter.equalsIgnoreCase("D") && gender.equals("Male"))
            activityFactor += 1.7;
        else if(letter.equalsIgnoreCase("E") && gender.equals("Male"))
            activityFactor += 2.1;
        else if(letter.equalsIgnoreCase("F") && gender.equals("Male"))
            activityFactor += 2.4;
        else if(letter.equalsIgnoreCase("A") && gender.equals("Female"))
            activityFactor += 1.0;
        else if(letter.equalsIgnoreCase("B") && gender.equals("Female"))
            activityFactor += 1.3;
        else if(letter.equalsIgnoreCase("C") && gender.equals("Female"))
            activityFactor += 1.5;
        else if(letter.equalsIgnoreCase("D") && gender.equals("Female"))
            activityFactor += 1.6;
        else if(letter.equalsIgnoreCase("E") && gender.equals("Female"))
            activityFactor += 1.9;
        else if(letter.equalsIgnoreCase("F") && gender.equals("Female"))
            activityFactor += 2.2;
        else
            System.out.println("Please try again");
        
        TDEE = (double)BMR * activityFactor;
        System.out.println();
        System.out.println();
        
        //Second part
        System.out.println("Your results: ");
        System.out.print("Name: " + name + "               ");
        System.out.println("Gender: " + gender);
        System.out.print("BMR: " + BMR + " calories                 ");
        System.out.println("Activity Factor: " + activityFactor);
        System.out.print("TDEE: " + TDEE + " calories");
        
    }
}


/**
 * Write a program to calculate Body Mass Index (BMI) given a person's 
 * height and weight. Use previous assignments and demo programs as models.
 *
 * @author Luis Vega
 * @version 09/08/19
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //Print statements and user input
        System.out.println("Enter your name (first last): ");
        String name = in.nextLine();
        
        System.out.println("Enter your weight in pounds (e.g. 175): ");
        int weight = in.nextInt();
        
        System.out.println("Enter your height in feet and inches (e.g. 5 11): ");
        String heightString = in.next();
        String heightString1 = in.next();
        System.out.println();
        
        //BMI calculator header
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        
        System.out.println("Name: " + name);
        
        //Calculate height
        String height1Convert = heightString.substring(0); 
        String height2Convert = heightString1.substring(0);
        int height1 = Integer.parseInt(height1Convert);
        int height2 = Integer.parseInt(height2Convert);
        
        double heightToIn = (height1 * 12) + height2;
        double heightCM = heightToIn * 2.54; 
        double heightM = heightCM / 10;
        System.out.println("Height (m): " + heightM);
        
        //Calculate weight
        double weightKg = weight * 0.45359237;
        System.out.println("Weight (kg): " + weightKg);
        
        //BMI and Category
        double BMI1 = weightKg / (heightM * heightM);
        double BMI = BMI1 * 100;
        String category;
        
        if(BMI < 18.5)
            category = "Underweight";
        else if(BMI < 24.9)
            category = "Normal/Healthy Weight";
        else if(BMI < 29.9)
            category = "Overweight";
        else
            category = "Obese";
        
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + category);
        
        
    }
}


/**
 * Write a description of class AnimalPopulation here.
 *
 * @author Luis Vega
 * @version 10/7/19
 */

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class AnimalPopulation
{
    public static void main(String[] args) throws IOException
    {
        //Initializing/Declaring variables
        double average;  
        int counter = 0;
        int sharks = 0;
        int amountTrials = 0;
        String resultsMSG;
        Random r = new Random(); 
        Scanner in = new Scanner(System.in);
        
        //setting up the first file
        File myFile = new File("part1.txt");
        Scanner file = new Scanner(myFile);
        
        //user input
        System.out.println("Welcome to the Fox Squirrel Simulator");
        System.out.println();
        
        System.out.println("How many trials should be simulated?");
        System.out.println("Enter a value greater than 1000: ");
        int amountTrialsInput = in.nextInt();
        
        //user input for the amount of trials
        while(amountTrialsInput != 0)
        {
            if(amountTrialsInput >= 1000)
            {
                amountTrialsInput = 0;
            }
            else
            {
                while(amountTrialsInput < 999)
                {   
                    System.out.println();
                    System.out.println("  Please try again. Enter a number greater than 1000.");
                    System.out.println();
                
                    System.out.println("How many trials should be simulated?");
                    System.out.println("Enter a value greater than 1000.");
                
                    amountTrialsInput = in.nextInt();
                }
            }
        }
        
        amountTrials += amountTrialsInput;
        
        //part 1 
        for (int num = 0; num <= amountTrials; num++)
        {
            int randomNumber = r.nextInt(18);
            System.out.println(counter);
            
            while(randomNumber != 5)
            {
                counter++;
                randomNumber = r.nextInt(18);
                System.out.println(counter);
                
                if(counter >= 5)
                {
                    counter = 0;
                }
                else if(randomNumber == 5)
                {
                    sharks++;
                }
            }
        }
        
        //print lines used as space for the next part (2)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        //part 2 
        System.out.println("\t\t\tThe results!");
        average = sharks / counter; 
        resultsMSG = "The average number of animals observed until spotting a \nShark is: ";
        
        System.out.println(resultsMSG + average);
    }
}

/**
 * Write a program to calculate the probability that a family with two children will consist of two boys, a boy and a girl, or two girls.
 *
 * @author Luis Vega    
 * @version 09/28/19
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        //declare and initialize variables
        double BB = 0;
        double GG = 0;
        double BG = 0;
        int total = 0;
        String token = "";
        
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        
        while(inFile.hasNext())
        {
            token = inFile.next();
            
            if(token.equals("BB"))
            {
                BB++;
                total++;
            }
            else if(token.equals("GG"))
            {
                GG++;
                total++;
            }
            else if(token.equals("BG"))
            {
                BG++;
                total++;
            }
            else if(token.equals("GB"))
            {
                BG++;
                total++;
            }
        }
        
        inFile.close();
        
        //print statements that includes data
        System.out.println("Composition statistics for families with two children.");
        System.out.println();
        
        System.out.println("Total number of families: " + total);
        System.out.println();
        
        System.out.println("Number of families with");
        System.out.print("\t    2 boys: " + (int)BB + " family(s) and ");
        System.out.println("represents " + (int)((BB / total) * 100) + "%");
        
        System.out.print("\t   2 girls: " + (int)GG + " family(s) and ");
        System.out.println("represents " + (int)((GG / total) * 100) + "%");
        
        System.out.print("  1 boy and 1 girl: " + (int)BG + " family(s) and ");
        System.out.print("represents " + (int)((BG / total) * 100) + "%");
    }
}

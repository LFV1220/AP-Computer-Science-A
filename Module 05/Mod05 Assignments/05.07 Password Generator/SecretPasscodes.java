/**
 *  Write a program to generate random passwords; the user should be able to select the character set and the length.
 *  
 *  Author: Luis Vega
 *  Date: 10/7/19
 */
import java.util.Scanner;

public class SecretPasscodes

{
    public static void main(String[] args)
    {
        //initialize scanner
        Scanner in = new Scanner(System.in);
        
        //declare and initialize variables
        int userChoice = 0;
        int pwLength = 0;
        String password = "";
        double randomVal = 0;


        //password generator menu
        System.out.println("\t\t    Password Generator");
        System.out.println("==============================================================");
        System.out.println("[1] Only lowercase Letters    ");
        System.out.println("[2] Only lowercase letters and numbers");
        System.out.println("[3] Only lowercase & uppercase letters, and numbers");    
        System.out.println("[4] Only lowercase & uppercase letters, numbers, and symbols");   
        System.out.println("[5] Quit                      ");
        System.out.println("==============================================================");
     
        //Prompt for a menu selection
        System.out.println("Enter Selection (1-5): ");
        userChoice = in.nextInt();
        
        System.out.println("Password Length (6 or more): ");
        pwLength = in.nextInt();
         
        //Check that selection meets the criteria of 1-4
        
            // When it is 5, loop ends and passwords are printed back from text file
            
        //Ask for password length
        

        if(userChoice == 1)
        {
            while(password.length() < pwLength)
            {
                randomVal =  Math.random() * 26 + 97;
                password += (char)(randomVal);
            }
        }
        else if(userChoice == 2)
        {
            while(password.length() < pwLength)
            {
                randomVal = Math.random() * 64 + 90;
                
            }
        }
        System.out.println(password);
        
        // Read passwords back from text file
     }
}
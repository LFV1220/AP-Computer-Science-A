
/**
 * Write a program to encode or decode a message using a Caesar Shift.
 *
 * @author Luis Vega
 * @version 2/25/20
 */
import java.util.Scanner;
public class CaesarTester
{
    public static final String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    public static String encrypt(String message,int shift)
    {
        String words = "";
        for(int i = 0; i < message.length(); i++)
        {
            int count = 0;
            if(message.substring(i, i + 1).equalsIgnoreCase(alphabet[0]))
            {
                words += alphabet[i + shift];
            }
            else if(message.substring(i, i + 1).equals(" "))
            {
                words += " ";
            }
            else
            {
                while(!(message.substring(i, i + 1).equalsIgnoreCase(alphabet[count])))
                {
                    count++;
                }
                words += alphabet[count + shift];
            }
        }
        return words;
    }
    
    public static String decrypt(String message,int shift)
    {
        String words = "";
        for(int i = 0; i < message.length(); i++)
        {
            int count = 0;
            if(message.substring(i, i + 1).equalsIgnoreCase(alphabet[0]))
            {
                words += alphabet[i - shift];
            }
            else if(message.substring(i, i + 1).equals(" "))
            {
                words += " ";
            }
            else
            {
                while(!(message.substring(i, i + 1).equalsIgnoreCase(alphabet[count])))
                {
                    count++;
                }
                words += alphabet[count - shift];
            }
        }
        return words;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int shift;
        String message, menu;
        
        System.out.printf("Welcome to the Caesar Shift Cipher.\n\n");
        System.out.printf("Please enter a shift key value (0-25): ");
        shift = in.nextInt();
        
        while(shift <= 0 || shift > 25)
        {
            System.out.printf("\nPlease enter a shift key value (0-25): ");
            shift = in.nextInt();
        }
        
        //Added another Scanner because using one wasn't working
        Scanner messageIn = new Scanner(System.in);
        System.out.printf("\nPlease input a plaintext message: ");
        message = messageIn.nextLine();
        
        System.out.printf("\nPlease choose encryption or decryption: ");
        menu = in.next();
        
        while(!((menu.equalsIgnoreCase("encryption")) || (menu.equalsIgnoreCase("decryption")) || (menu.equalsIgnoreCase("Q"))))
        {
            System.out.printf("\nPlease choose encryption or decryption: ");
            menu = in.next();
        }
        
        if(menu.equalsIgnoreCase("encryption"))
        {
            System.out.println();
            System.out.println("    ...encrypting...");
            System.out.println(" " + encrypt(message,shift));
        }
        else if(menu.equalsIgnoreCase("decryption"))
        {
            System.out.println();
            System.out.println("    ...decrypting...");
            System.out.println(" " + decrypt(message,shift));
        }
        else
        {
            System.out.println();
        }
    }
}

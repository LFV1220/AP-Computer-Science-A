
/**
 * Write a program to simulate an online purchase by asking the user for input and displaying a receipt.
 *
 * @author Luis Vega
 * @version 8/21/19
 */
import java.util.Scanner; 
public class BuyMovieTickets
{
    public static void main(String[] args) 
    {
        //variables
        String firstName;           // the shopper's first name
        String lastName;            // the shopper's last name
        String date;                // today's date (mm/dd/yyyy) 
        String itemName;            // name of item
        int itemQuantity;           // how many items
        double itemPrice;           // how much the item costs
        String cardAccountNumber;   // credit or debit card used to purchase item
        int pin;                    // pin for the credit/debit card used
        double total;               // the total price (itemQuantity * itemPrice)
        
        Scanner in = new Scanner(System.in);
        
        //Interactive (first part of program)
        System.out.println("Hello.");
        System.out.println();
        
        System.out.println("Please enter your first name: ");
        firstName = in.nextLine();
        System.out.println();
        
        System.out.println("Please enter your last name: ");
        lastName = in.nextLine();
        System.out.println();
        
        System.out.println("Please enter today's date (mm/dd/yyyy): ");
        date = in.nextLine();
        System.out.println();
        
        System.out.println("What movie would you like to see?");
        itemName = in.nextLine();
        System.out.println();
        
        System.out.println("How many tickets?");
        itemQuantity = in.nextInt();
        System.out.println();
        
        System.out.println("What is the ticket price?"); 
        itemPrice = in.nextDouble();
        System.out.println();
        
        System.out.println("What is your credit/debit card number (#####-###-####): ");
        cardAccountNumber = in.next();
        System.out.println();
        
        System.out.println("What is your PIN (####): ");
        pin = in.nextInt();
        System.out.println();
        System.out.println("Thank you. The receipt is listed below.");
        System.out.println();
        
        //e-Receipt (second part of the program)
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Your e-Receipt");
        System.out.println(date);
        System.out.println("Order number: " + lastName.substring(0, 1) + cardAccountNumber.substring(9, 12));
        System.out.println();
        
        System.out.println(firstName.substring(0, 1) + ". " + lastName);
        System.out.println("Account: #####-###-" + cardAccountNumber.substring(8, 12));
        System.out.println("Movie: " + itemName);
        System.out.println("Number of tickets: " + itemQuantity);
        System.out.println("Ticket Price: $" + itemPrice);
        System.out.println();
        
        total = itemQuantity * itemPrice;
        System.out.println("Total Price: " + total);
        System.out.println();
        
        System.out.println("Thank you for your purchase. Enjoy!");
    }
}

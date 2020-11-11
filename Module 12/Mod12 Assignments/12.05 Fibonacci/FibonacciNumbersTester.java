/**
 * Write a program to recursively calculate the nth Fibonacci number.
 *
 * @author Luis Vega
 * @version 1/14/20
 */
import java.util.Scanner;
public class FibonacciNumbersTester
{
    public static void main(String[] args)
    {
        FibonacciNumbers tests = new FibonacciNumbers();
        
        //scanner for input
        Scanner in = new Scanner(System.in);
        
        //first input to start while loop
        System.out.printf("Enter a number ('q' to quit): ");
        String input = in.next();
        int numIn = Integer.parseInt(input);
        
        while(!input.equalsIgnoreCase("q") && numIn >= 0)
        {  
            System.out.printf("%s%d\n","n-th term: ",tests.fibonacci(numIn));
            
            //loop inputs (if its a positive integer)
            System.out.printf("Enter a number ('q' to quit): ");
            input = in.next(); 
            if(!input.equalsIgnoreCase("q") && numIn >= 0)
            {
                numIn = Integer.parseInt(input);
            }
        }
    }
}

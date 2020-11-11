/**
 * Write a description of class PrimeTester here.
 *
 * @author Luis Vega
 * @version 2/27/20
 */
import java.util.Scanner;
import java.lang.Math;
public class PrimeTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int lower,upper,amount;
        double[] numbers;
        String[] primeNumbers;
        
        System.out.printf("Please enter a LOWER limit ranging from 1-100: ");
        lower = in.nextInt();
        while(lower < 1 || lower > 100)
        {
            System.out.printf("Please enter a LOWER limit ranging from 1-100: ");
            lower = in.nextInt();
        }
        
        System.out.printf("Please enter an UPPER limit ranging from 1-100: ");
        upper = in.nextInt();
        while(upper < 1 || upper > 100 || upper < lower)
        {
            System.out.printf("Please enter an UPPER limit ranging from 1-100: ");
            upper = in.nextInt();
        }
        
        amount = (upper - lower) + 1;
        numbers = new double[amount];
        for(int i = 0; i < numbers.length; i++)
        {
            int n = lower + i;
            numbers[i] += n;
        }
        
        primeNumbers = new String[amount];
        
        Prime p = new Prime(numbers,primeNumbers,upper,lower);
        p.calc();
        
    }
}

/**
 * Write a program to recursively calculate the nth Fibonacci number.
 *
 * @author Luis Vega
 * @version 1/14/20
 */
public class FibonacciNumbers
{    
    /**
     * Accessor method that finds the number in the fibonacci sequence.
     *
     * @param  n  finding this number in the fibonacci sequence. 
     * @return number in fibonacci if the number is not 0 or 1. 
     */
    public int fibonacci(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


/**
 * Write a description of class Prime here.
 *
 * @author Luis Vega
 * @version 2/27/20
 */
import java.lang.Math;
public class Prime
{
    private int upper,lower;
    private double[] numbers;
    private String[] primeNumbers;
    
    /**
     * Constructor for objects of class Prime
     */
    public Prime(double[] numbers,String[] primeNumbers,int upper,int lower)
    {
        this.numbers = numbers;
        this.primeNumbers = primeNumbers;
        this.upper = upper;
        this.lower = lower;
    }
    
    public void calc()
    {
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == 2 || (pow(2.0,(numbers[i] - 1)) * pow(2.0,numbers[i])) % 2 == 0)
            {
                primeNumbers[i] += " - Prime";
            }
            else
            {
                primeNumbers[i] += " - Not Prime";
            }
            System.out.printf("%.2f%s\n",numbers[i], primeNumbers[i]);
        }
        
    }
    
    public double pow(double a,double b)
    {
        double power;
        power = a;
        
        for(int i = 0; i < b; i++)
        {
            power *= b; 
        }
        
        return power;
    }
}

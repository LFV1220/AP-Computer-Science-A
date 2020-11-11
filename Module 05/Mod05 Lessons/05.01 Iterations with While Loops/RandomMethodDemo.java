
/**
 * The purpose of this program is to illustrate the use of the
 * Math class ranomd() method.
 *
 * @author Luis Vega
 * @version 9/22/19
 */
public class RandomMethodDemo
{
    public static void main(String [] args)
    {
        double randomNumber;
        int counter = 0;

        while(counter < 10)
        {
            randomNumber = Math.random();
            System.out.println(counter + ":  " + randomNumber);
            counter ++;
        }//end of while loop
    }//end of main method
}//end of class


/*
 *

if( randomNumber > 0.4 && random number < 0.6 )
{

}
 */

/**
 * The purpose of this program is to illustrate the use of the
 * while loop as a counter.
 *
 * @author Luis Vega
 * @version 09/22/19
 */
public class CountingWithWhileLoops
{
    public static void main(String [] args)
    {
        int counter = 0;
        int theTerminator = 10;          //initialize the terminating value

        while(counter < theTerminator)     //test the terminating condition
        {
            System.out.println("counter = " + counter);
            counter++;
        }//end of while loop

    }//end of main method
}//end of class
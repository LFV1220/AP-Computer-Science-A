/**
 * The purpose of this program is to demonstrate the PrintWriter 
 * class and its methods for writing to text files.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
class PrintWriterDemoV1
{
    public static void main (String [ ] args) throws IOException
    {
        
       File myFile = new File ("hello.txt");
       PrintWriter outFile = new PrintWriter(myFile); 

       for (int loop = 1; loop <= 5; loop++)
       {
           outFile.println(loop + " Hello, World!");
           outFile.println(loop + " ayyy");
       }//end for loop

       outFile.close( );    //close the file when finished
    }//end of main method
}//end of class
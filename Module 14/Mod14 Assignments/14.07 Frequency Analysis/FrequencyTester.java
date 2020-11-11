
/**
 * Write a description of class FrequencyTester here.
 *
 * @author Luis Vega
 * @version 3/2/20
 */
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class FrequencyTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String file, newFile;
        int length;
        
        System.out.printf("Enter the file name: ");
        file = in.next();
        length = file.length() - 4;
        newFile = file.substring(0,length) + "Freq.txt";
        
        Frequency f = new Frequency(file,newFile);
        f.setFreq();
        f.printFreq();
    }
}


/**
 * Write a description of class Frequency here.
 *
 * @author Luis Vega
 * @version 3/2/20
 */
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class Frequency
{
    private String file;
    private String newFile;
    public String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public int[] alphabetCounter = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
    
    public Frequency(String file,String newFile)
    {
        this.file = file;
        this.newFile = newFile;
    }
    
    public void setFreq() throws IOException
    {
        String token = "";
        String subToken = "";
        
        File fileName = new File(file);
        Scanner inFile = new Scanner(fileName);
        
        while(inFile.hasNext())
        {
            token = inFile.next();
            
            for(int i = 0; i < token.length(); i++)
            {
                subToken = token.substring(0 + i,1 + i);
                
                for(int j = 0; j < alphabet.length; j++)
                {
                    if(subToken.equalsIgnoreCase(alphabet[j]))
                    {
                        alphabetCounter[j]++;
                    }
                }
            }  
        }
        
        inFile.close();
    }
    
    public void printFreq() throws IOException
    {
        File newF = new File(newFile);
        PrintWriter outFile = new PrintWriter(newF);
        
        for(int i = 0; i < alphabet.length; i++)
        {
            System.out.println(alphabet[i] + "-" + alphabetCounter[i] + " (" + (((double)(alphabetCounter[i] / getCounter()) * 100)) + "%)");
            outFile.println(alphabet[i] + "-" + alphabetCounter[i] + " (" + (((double)(alphabetCounter[i] / getCounter()) * 100)) + "%)");
        }
        outFile.close();
    }
    
    public double getCounter()
    {
        int counter = 0;
        for(int i = 0; i < alphabetCounter.length; i++)
        {
            counter += alphabetCounter[i];
        }
        
        return counter; 
    }
}

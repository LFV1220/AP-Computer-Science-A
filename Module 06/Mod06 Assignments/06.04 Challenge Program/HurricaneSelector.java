/**
 * APCS Team
 *
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class HurricaneSelector

{
    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        int i = 0;
        double avgCat;
        double avgWindSpeed;
        double avgPressure;
        int pressSum = 0;
        double sum = 0;
        double wsSum = 0;
        int counter = 0;
        
        //min and max values
        int minCat = Integer.MAX_VALUE;
        int maxCat = Integer.MIN_VALUE;
        int minP = Integer.MAX_VALUE;
        int maxP = Integer.MIN_VALUE;
        double minWS = Double.MAX_VALUE;
        double maxWS = Double.MIN_VALUE;
        
        //count number of lines in text file
        while (inFile.hasNextLine() && numValues < 157)
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() && index < numValues)
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        //convert knots to mph
        int[] cat = new int[numValues];
        double[] mph = new double[numValues];
        
        for(int j = 0; j < mph.length; j++)
        {
            mph[j] = windSpeeds[j] * 1.15078;
        }
        
        for(int j = 0; j < mph.length; j++)
        {        
            if(mph[j] >= 74 && mph[j] <= 95)
            {
                cat[i] = 1;
            }
            else if(mph[j] > 95 && mph[j] <= 110)
            {
                cat[i] = 2;
            }
            else if(mph[j] > 110 && mph[j] <= 129)
            {
                cat[i] = 3;
            } 
            else if(mph[j] > 129 && mph[j] <= 156)
            {
                cat[i] = 4;
            }
            else if(mph[j] > 156)
            {
                cat[i] = 5;
            }
        }
        
        //continue program below
        Scanner in = new Scanner (System.in);
        
        //user input 
        System.out.printf("Hurricanes from which year? ");
        int fromYear = in.nextInt();
        while(fromYear < 1995 || fromYear > 2015)
        {
            System.out.printf("Please enter a year in the correct range.");
            fromYear = in.nextInt();
        }
        System.out.printf("Hurricanes until which year? ");
        int untilYear = in.nextInt();
        while(untilYear < 1995 || untilYear > 2015)
        {
            System.out.printf("Please enter a number in the correct range.");
            untilYear = in.nextInt();
        }
        
        //OutFile
        
        
        for(i = 0; i < years.length; i++)
        {
            counter++;
            if(years[i] >= fromYear && years[i] <= untilYear)
            {
                counter++;
                
                //finding the Category average
                sum += cat[i];
                if(cat[i] > maxCat)
                {
                    maxCat = cat[i];
                }
                if(cat[i] < minCat)
                {
                    minCat = cat[i];
                }
                
                //finding Pressure average
                pressSum += pressures[i];
                if(pressures[i] > maxP)
                {
                    maxP = pressures[i];
                }
                if(pressures[i] < minP)
                {
                    minP = pressures[i];
                }
                
                //finding Windspeed average
                wsSum += windSpeeds[i];
                if(windSpeeds[i] > maxWS)
                {
                    maxWS = windSpeeds[i];
                }
                if(windSpeeds[i] < minWS)
                {
                    minWS = windSpeeds[i];
                }
            }
            //calculating the averages 
            avgCat = sum / counter;
            avgPressure = pressSum / counter;
            avgWindSpeed = wsSum / counter;
            
            //print statements (name,year,month,pressure,WS,cat,etc.) + outfile(with same things)?
        }
        
        //print statements (averages, max/min, etc.) + outfile(with same things)?
     }
}
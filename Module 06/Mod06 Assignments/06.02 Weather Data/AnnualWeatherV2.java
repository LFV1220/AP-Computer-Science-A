
/**
 * Write a program that displays the average temperature and the annual precipitation for a selected city. The user should be able to choose 
 *  whether temperature is displayed in Fahrenheit or Celsius and whether precipitation is displayed in inches or centimeters.
 *
 * @author Luis Vega
 * @version 10/10/19
 */
import java.util.Scanner; 

public class AnnualWeatherV2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Choose the temperature scale(F = Fahrenheit, C = Celsius): ");
        String tScale = in.next();

        System.out.println("Choose the precipitation scale (i = inches, c = centimeters): ");
        String pScale = in.next();
        System.out.println("\n\n");
        
        String[] months = new String[12]; 
        
        months[0] = "Jan.";
        months[1] = "Feb."; 
        months[2] = "Mar.";
        months[3] = "Apr.";
        months[4] = "May.";
        months[5] = "Jun."; 
        months[6] = "Jul.";
        months[7] = "Aug.";
        months[8] = "Sep.";
        months[9] = "Oct.";
        months[10] = "Nov.";
        months[11] = "Dec.";
        
        double[] tallahasseeTemp = new double[12];
        
        if(tScale.equalsIgnoreCase("F"))
        {
            tallahasseeTemp[0] = 51.8;
            tallahasseeTemp[1] = 54.8;
            tallahasseeTemp[2] = 61.1;
            tallahasseeTemp[3] = 66.4;
            tallahasseeTemp[4] = 74.4;
            tallahasseeTemp[5] = 80.4;
            tallahasseeTemp[6] = 82.4;
            tallahasseeTemp[7] = 82.1;
            tallahasseeTemp[8] = 78.9;
            tallahasseeTemp[9] = 69.1;
            tallahasseeTemp[10] = 60.4;
            tallahasseeTemp[11] = 53.7;
        }
        else if(tScale.equalsIgnoreCase("C"))
        {
            tallahasseeTemp[0] = (51.8 - 32) * (5.0/9);
            tallahasseeTemp[1] = (54.8 - 32) * (5.0/9);
            tallahasseeTemp[2] = (61.1 - 32) * (5.0/9);
            tallahasseeTemp[3] = (66.4 - 32) * (5.0/9);
            tallahasseeTemp[4] = (74.4 - 32) * (5.0/9);
            tallahasseeTemp[5] = (80.4 - 32) * (5.0/9);
            tallahasseeTemp[6] = (82.4 - 32) * (5.0/9);
            tallahasseeTemp[7] = (82.1 - 32) * (5.0/9);
            tallahasseeTemp[8] = (78.9 - 32) * (5.0/9);
            tallahasseeTemp[9] = (69.1 - 32) * (5.0/9);
            tallahasseeTemp[10] = (60.4 - 32) * (5.0/9);
            tallahasseeTemp[11] = (53.7 - 32) * (5.0/9);
        }

        
        double[] tallahasseePrec = new double[12];
        
        if(pScale.equalsIgnoreCase("i"))
        {
            tallahasseePrec[0] = 5.4;
            tallahasseePrec[1] = 4.6;
            tallahasseePrec[2] = 6.5;
            tallahasseePrec[3] = 3.6;
            tallahasseePrec[4] = 5.0;
            tallahasseePrec[5] = 6.9;
            tallahasseePrec[6] = 8.0;
            tallahasseePrec[7] = 7.0;
            tallahasseePrec[8] = 5.0;
            tallahasseePrec[9] = 3.3;
            tallahasseePrec[10] = 3.9;
            tallahasseePrec[11] = 4.1;
        }
        else if(pScale.equalsIgnoreCase("c"))
        {
            tallahasseePrec[0] = 5.4 * 2.54;
            tallahasseePrec[1] = 4.6 * 2.54;
            tallahasseePrec[2] = 6.5 * 2.54;
            tallahasseePrec[3] = 3.6 * 2.54;
            tallahasseePrec[4] = 5.0 * 2.54;
            tallahasseePrec[5] = 6.9 * 2.54;
            tallahasseePrec[6] = 8.0 * 2.54;
            tallahasseePrec[7] = 7.0 * 2.54;
            tallahasseePrec[8] = 5.0 * 2.54;
            tallahasseePrec[9] = 3.3 * 2.54;
            tallahasseePrec[10] = 3.9 * 2.54;
            tallahasseePrec[11] = 4.1 * 2.54;
        }
        
        System.out.printf("%33s%n","Weather Data");
        System.out.printf("%43s%n","Location: Tallahassee, Florida");
        System.out.printf("\n");
        System.out.printf("%-1s%26s%28s%n","Month","Temperature (F)","Precipitation (in.)");
        System.out.printf("************************************************************");

        for(int num = 0; num < months.length; num++)
        {
           System.out.printf("\n%s%21.1f%25.1f",months[num],tallahasseeTemp[num],tallahasseePrec[num]);
        }
        
        System.out.printf("%n*************************************************************%n");
        
        double averageTemp = ((tallahasseeTemp[0] + tallahasseeTemp[1] + tallahasseeTemp[2] + tallahasseeTemp[3] + tallahasseeTemp[4] + tallahasseeTemp[5] + tallahasseeTemp[6] + tallahasseeTemp[7] + tallahasseeTemp[8] + tallahasseeTemp[9] + tallahasseeTemp[10] + tallahasseeTemp[11]) / 12);
        System.out.printf("%20s%5.1f\t","Average: ",averageTemp); 
        double annualTotal = (tallahasseePrec[0] + tallahasseePrec[1] + tallahasseePrec[2] + tallahasseePrec[3] + tallahasseePrec[4] + tallahasseePrec[5] + tallahasseePrec[6] + tallahasseePrec[7] + tallahasseePrec[8] + tallahasseePrec[9] + tallahasseePrec[10] + tallahasseePrec[11]);
        System.out.printf("%14s%5.1f","Annual: ", annualTotal);
        
    }
}

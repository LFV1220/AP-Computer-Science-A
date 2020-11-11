
/**
 * Write a program that displays the average temperature and the annual precipitation for a selected city. The user should be able to choose 
 *  whether temperature is displayed in Fahrenheit or Celsius and whether precipitation is displayed in inches or centimeters.
 *
 * @author Luis Vega
 * @version 10/9/19
 */
public class AnnualWeatherV1
{
    public static void main(String[] args)
    {
        //initialize/declare variables
        String[] months = new String[12]; 
        
        months[0] = "Jan.";
        months[1] = "Feb."; 
        months[2] = "Mar.";
        months[3] = "Apr.";
        months[4] = "May";
        months[5] = "Jun."; 
        months[6] = "Jul.";
        months[7] = "Aug.";
        months[8] = "Sep.";
        months[9] = "Oct.";
        months[10] = "Nov.";
        months[11] = "Dec.";
        
        double[] tallahasseeTemp = new double[12];
        
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
        
        double[] tallahasseePrec = new double[12];
        
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
        
        System.out.println("\t\tWeather Data");
        System.out.println("\tLocation: Tallahassee, Florida");
        System.out.println("Month \t\tTemperature (F) \tPrecipitation (in.)");
        System.out.println("************************************************************");
        
        for(int num = 0; num < months.length; num++)
        {
            System.out.println(months[num] + "\t\t    " + tallahasseeTemp[num] + "\t\t     " + tallahasseePrec[num]);
        }
        
        System.out.println("************************************************************");
        
        System.out.print("Average: " + ((tallahasseeTemp[0] + tallahasseeTemp[1] + tallahasseeTemp[2] + tallahasseeTemp[3] + tallahasseeTemp[4] + tallahasseeTemp[5] + tallahasseeTemp[6] + tallahasseeTemp[7] + tallahasseeTemp[8] + tallahasseeTemp[9] + tallahasseeTemp[10] + tallahasseeTemp[11]) / 12));
        System.out.println("\tAnnual: " + (tallahasseePrec[0] + tallahasseePrec[1] + tallahasseePrec[2] + tallahasseePrec[3] + tallahasseePrec[4] + tallahasseePrec[5] + tallahasseePrec[6] + tallahasseePrec[7] + tallahasseePrec[8] + tallahasseePrec[9] + tallahasseePrec[10] + tallahasseePrec[11]));
    }
}


/**
 * Convert your V3 object class to V7 implementation and client classes and instantiate multiple objects.
 *
 * @author Luis Vega
 * @version 11/14/19
 */
public class TimeTrialsV8
{
    //public and private instance variables 
    private String name; 
    private double time1;
    private double time2;
    private double min;
    private double max;
    private double average; 
    private double[] times = {2.50, 4.50, 1.25, 5.60, 12.30, 16.75}; 
    private double difference;
    private int differenceToM;
    
    //TimeTrials constructor
    public TimeTrialsV8(String n, double t1, double t2)
    {
        name = n;
        time1 = t1;
        time2 = t2;
    }
    
    //finds the difference between Time 1 and Time 2 (in hours)
    public double findTimeDifference(double t1, double t2)
    {
        difference = t2 - t1;
        return difference;
    }
    
    //converts the time difference from hours to minutes
    public int differenceInMinutes(double difference)
    {
        differenceToM = (int)(difference * 60);
        return differenceToM;
    }
    
    //finds the minimum (from time difference and difference in minutes)
    public void calcMinMax()
    {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        
        for(int i = 0; i < times.length; i++)
        {
            if(times[i] < min)
            {
                min = times[i];
            }
            
            if(times[i] > max)
            {
                max = times[i];
            }
        }
        
    }
    
    public double getMin()
    {
        return min;
    }
    
    public double getMax()
    {
        return max;
    }
    
    public double getAverage()
    {
        return average;
    }
    
    public static void output()
    {
        
    }
    
    public String toString()
    {
       return String.format("%5.2f%5.2f", time1, time2);
    }
}

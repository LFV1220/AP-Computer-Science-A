
/**
 * Convert your V3 object class to V7 implementation and client classes and instantiate multiple objects.
 *
 * @author Luis Vega
 * @version 11/07/19
 */
public class TimeTrialsV7
{
    //private instance variables 
    private String name; 
    private double time1;
    private double time2;
    public double difference;
    public int differenceToM;
    
    //TimeTrials constructor
    public TimeTrialsV7(String n, double t1, double t2)
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
}

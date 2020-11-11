
/**
 * Write a description of class WinterMountain here.
 *
 * @author Luis Vega
 * @version 1/30/20
 */
public class WinterMountain extends Mountain
{
    // instance variables
    private int temperature;

    //Constructor
    public WinterMountain(int length, int width, int mountains, int temp)
    {
        super(length, width, mountains);
        temperature = temp;
    }
    
    public String getWinterMountainSize()
    {
        return "Winter Mountain Land has dimensions " + getLength() + " X " + getLength() + " and has " + getMountains() +
                                                            " mountains and a temperature of " + temperature + " degrees"; 
    }
    
    public int getTemperature()
    {
        return temperature;
    }
}

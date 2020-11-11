
/**
 * Write a description of class Mountain here.
 *
 * @author Luis Vega
 * @version 1/30/20
 */
public class Mountain extends Terrain
{
    // instance variables
    private int amountMountains;

    //Constructor 
    public Mountain(int length, int width, int mountains)
    {
        super(length, width);
        amountMountains = mountains;
    }
    
    public String getMountainSize()
    {
        return "Mountain Land has dimensions " + getLength() + " X " + getWidth() + " and has " + amountMountains + " mountains";
    }
    
    public int getMountains()
    {
        return amountMountains;
    }
}

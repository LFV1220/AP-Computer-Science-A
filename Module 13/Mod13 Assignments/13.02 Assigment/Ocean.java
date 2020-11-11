
/**
 * Write a description of class Ocean here.
 *
 * @author Luis Vega
 * @version 1/30/20
 */
public class Ocean extends Terrain
{
    // instance variables
    private int amountReefs;
    
    //Constructor
    public Ocean(int length, int width, int coralReefs)
    {
        super(length,width);
        amountReefs = coralReefs;
    }
    
    public String getOceanSize()
    {
        return "Ocean has dimensions " + getLength() + " X " + getWidth() + " and has " + amountReefs + " different coral reefs";
    }
    
    public int getCoralReefs()
    {
        return amountReefs;
    }
}

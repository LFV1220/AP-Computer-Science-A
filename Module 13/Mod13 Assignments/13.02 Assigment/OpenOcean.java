
/**
 * Write a description of class OpenOcean here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OpenOcean extends Ocean
{
    // instance variables
    private int amountFishSpecies;
    
    //Constructor
    public OpenOcean(int length, int width, int coralReefs, int fishSpecies)
    {
        super(length,width,coralReefs);
        amountFishSpecies = fishSpecies;
    }
    
    public String getOpenOceanSize()
    {
        return "Open Ocean has dimensions " + getLength() + " X " + getWidth() + " and has " + getCoralReefs() +
                                          " different coral reefs as well as " + amountFishSpecies + " different species of fish";
    }
}

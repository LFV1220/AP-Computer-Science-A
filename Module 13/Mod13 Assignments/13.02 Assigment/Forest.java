
/**
 * Write a description of class Forest here.
 *
 * @author Luis Vega
 * @version 1/30/20
 */
public class Forest extends Terrain
{
    // instance variables
    private int amountTrees;

    //Constructor 
    public Forest(int length, int width, int trees)
    {
        super(length, width);
        amountTrees = trees;
    }
    
    public String getForestSize()
    {
        return "Forest Land has dimensions " + getLength() + " X " + getWidth() + " and has " + amountTrees + " trees";
    }
    
    public int getTrees()
    {
        return amountTrees;
    }
}
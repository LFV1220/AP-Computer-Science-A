
/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Luis Vega
 * @version 2/26/20
 */

public class OvalCylinder33 extends Oval33
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder33(int x, int y, int radius, int radius2, int height)
    {
        // call superclass
        super(x, y, radius, radius2);

        // initialize instance variables
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }
}
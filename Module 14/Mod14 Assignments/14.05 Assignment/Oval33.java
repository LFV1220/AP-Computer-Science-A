
/**
 * This class defines an Oval object by extending Circle.
 *
 * @author Luis Vega
 * @version 2/26/20
 */

public class Oval33 extends Circle33
{
    // instance variables
    private int radius2;

    // Constructor for objects of class Oval
    public Oval33(int x, int y, int radius, int radius2)
    {
        // call superclass
        super(x, y, radius);

        // initialize instance variables
        this.radius2 = radius2;
    }

    public int getRadius2()
    {
        return radius2;
    }
}
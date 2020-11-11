
/**
 * This class defines a Cylinder object by extending a Circle.
 *
 * @author Luis Vega
 * @version 2/26/20
 */

public class Cylinder33 extends Circle33
{
    // instance variables
    private int height;

    // Constructor for objects of class Cylinder
    public Cylinder33(int x, int y, int radius, int height)
    {
        // call superclass
        super(x, y, radius);

        // initialize instance variables
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }
}

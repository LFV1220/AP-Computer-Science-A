
/**
 * This class defines a Circle object.
 *
 * @author Luis Vega
 * @version 2/26/20
 */

public class Circle33
{
    // instance variables
    private int x;
    private int y;
    private int radius;

    // Constructor for objects of class Circle
    public Circle33(int x, int y, int radius)
    {
        // initialize instance variables
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "(" + x + ", " + y + ").";
    }
}
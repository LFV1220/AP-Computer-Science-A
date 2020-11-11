
/**
 * Write a description of class Cube4 here.
 *
 * @author Luis Vega
 * @version 2/07/20
 */
public class Cube4 extends Box4
{
    /**
     * Constructor for objects of class Cube4
     */
    public Cube4(int l, int w, int h)
    {
        super(l,w,h);
    }
    
    public String toString()
    {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}

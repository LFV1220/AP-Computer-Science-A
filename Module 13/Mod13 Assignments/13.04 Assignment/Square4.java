
/**
 * Write a description of class Square4 here.
 *
 * @author Luis Vega
 * @version 2/07/20
 */
public class Square4 extends Rectangle4
{
    /**
     * Constructor for objects of class Square4
     */
    public Square4(int l, int w)
    {
        super(l,w);
    }
    
    public String toString()
    {
        return "Square - " + getLength() + " X " + getWidth();
    }
}

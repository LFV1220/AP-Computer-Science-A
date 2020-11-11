
/**
 * Write a description of class Triangle4 here.
 *
 * @author Luis Vega
 * @version 2/07/20
 */
public class Triangle4 extends Box4
{
    /**
     * Constructor for objects of class Triangle4
     */
    public Triangle4(int s1, int s2, int s3)
    {
        super(s1,s2,s3);
    }
    
    public String toString()
    {
        return "Triangle - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}

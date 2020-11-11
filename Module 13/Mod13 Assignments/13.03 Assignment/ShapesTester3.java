
/**
 * Write a description of class ShapesTester3 here.
 *
 * @author Luis Vega
 * @version 02/04/20
 */
import java.util.ArrayList;
public class ShapesTester3
{
    public static void showCenter(Circle2 c)
    {
        String className = c.getClass().getName();
        
        if(className.equals("Circle2"))
        {
           System.out.println("For this Circle2 the center is at " + c.getCenter()); 
        }
        else if(className.equals("Oval2"))
        {
            System.out.println("For this Oval2 the center is at " + c.getCenter());
        }
        else if(className.equals("OvalCylinder2"))
        {
            System.out.println("For this OvalCylinder2 the center is at " + c.getCenter());
        }
        else if(className.equals("Cylinder2"))
        {
            System.out.println("For this Cylinder2 the center is at " + c.getCenter());
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(new Circle2(2,4,2));
        shapes.add(new Cylinder2(10,15,3,9));
        shapes.add(new Oval2(25,15,4,4));
        shapes.add(new OvalCylinder2(40,10,5,7,9));
        
        for(Circle2 a: shapes)
        {
            showCenter(a);
        }
    }
}

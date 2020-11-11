
/**
 * Write a description of class ShapesTester3 here.
 *
 * @author Luis Vega
 * @version 2/26/20
 */
import java.util.ArrayList;
public class ShapesTester444
{
    public static void showCenter(Circle33 c)
    {
        String className = c.getClass().getName();
        
        if(className.equals("Circle33"))
        {
           System.out.println("For this Circle3 the center is at " + c.getCenter()); 
        }
        else if(className.equals("Oval33"))
        {
            System.out.println("For this Oval3 the center is at " + c.getCenter());
        }
        else if(className.equals("OvalCylinder33"))
        {
            System.out.println("For this OvalCylinder3 the center is at " + c.getCenter());
        }
        else if(className.equals("Cylinder33"))
        {
            System.out.println("For this Cylinder3 the center is at " + c.getCenter());
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Circle33> shapes = new ArrayList<Circle33>();
        shapes.add(new Circle33(2,4,2));
        shapes.add(new Cylinder33(10,15,3,9));
        shapes.add(new Oval33(25,15,4,4));
        shapes.add(new OvalCylinder33(40,10,5,7,9));
        
        for(Circle33 a: shapes)
        {
            showCenter(a);
        }
    }
}

/**
 * Write a description of class ShapesTester4 here.
 *
 * @author Luis Vega
 * @version 02/07/20
 */
public class ShapesTester4
{
    public static void main(String[] args)
    {
        Rectangle4 rectangle = new Rectangle4(12,20);
        Rectangle4 box1 = new Box4(4,4,4);
        Rectangle4 box2 = new Box4(4,12,8);
        Rectangle4 cube = new Cube4(4,4,4);
        Rectangle4 square = new Square4(12,1);
        Rectangle4 triangle = new Triangle4(18,1,1);
        
        System.out.printf("My shapes: \n\n");
        
        showEffectBoth(rectangle);
        showEffectBoth(box1);
        showEffectBoth(box2);
        showEffectBoth(cube);
        showEffectBoth(square);
        showEffectBoth(triangle);
        
        System.out.printf("\n\nTest for equality: \n\n");
        
        if(equals(box1,cube))
        {
            System.out.println(box1.toString() + " IS same size as " + cube.toString());
        }
        else
        {
            System.out.println(box1.toString() + " is NOT the same size as " + cube.toString());
        }
        
        System.out.printf("\n");
        
        if(equals(box2,cube))
        {
            System.out.println(box2.toString() + " IS same size as " + cube.toString());
        }
        else
        {
            System.out.println(box2.toString() + " is NOT the same size as " + cube.toString());
        }
        
        System.out.printf("\n");
    }
    
    public static void showEffectBoth(Rectangle4 shape)
    {
        System.out.println(shape);
    }
    
    public static boolean equals(Rectangle4 a,Rectangle4 b)
    {
        int sides1 = a.getLength() + a.getWidth() + ((Box4)a).getHeight();
        int sides2 = b.getLength() + b.getWidth() + ((Box4)b).getHeight();
        
        if(sides1 == sides2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

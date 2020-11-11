
/**
 * Write a program to calculate the (x, y) coordinates of points on a circle of a given radius.
 *
 * Luis Vega
 * 10/26/19
 */

import java.util.Scanner;

public class CirclePoints
{
    public static void main(String[] args)
    {
        //variable declaration/initialization
        double r = 1;
        double x = 1;
        double rate = 0.1;
        double change = 0.1;
        double y1 = 0;
        double y2 = 0;
        double power;
        double calculations;
        
        //scanner class
        Scanner in = new Scanner(System.in);
        
        //request user input
        System.out.printf("\t   Points on a Circle with a Radius of ");
        r = in.nextDouble();
        System.out.printf("\n");
        
        //outputs
        System.out.printf("%9s%16s%16s%15s","x1","y1","x1","y2");
        System.out.printf("\n");
        System.out.printf("      ****************************************************");
        System.out.printf("\n");
        
        //calculations
        for(int a = 0; a < 21; a++)
        {
            //both x's
            System.out.printf("%10.2f\t",x);
            x -= rate;
            
            //y1
            System.out.printf("%10.2f\t", y1);
            power = Math.pow(r, 2) - Math.pow(x, 2);
            y1 = Math.sqrt(power);
            
            //second x print
            x += rate;
            System.out.printf("%10.2f\t",x);
            x -= rate;
            
            //y2
            System.out.printf("%10.2f\n",y2);
            y2 = -1 * y1;
        }
    }
}

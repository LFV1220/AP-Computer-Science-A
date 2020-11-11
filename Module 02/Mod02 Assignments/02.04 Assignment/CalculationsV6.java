
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Luis Vega
 * @version 7/31/19
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Declare integer variables 
        int iNum1 = 25; 
        int iNum2 = 9;
        int iNum3 = 11;
        
        // Declare double variables
        double dNum1 = 43.21; 
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = "+ (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
               
        // Subtraction
        System.out.println("Subtraction");        
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2)); 
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2 * dNum3 * dNum3));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("Additional int Equations (2.03)");
        int iNum4 = 12;
        int iNum5 = 20;
        
        System.out.println(iNum4 + " + " + iNum5 + " = " + (iNum4 + iNum5));
        System.out.println(iNum5 + " - " + iNum4 + " = " + (iNum5 - iNum4));
        System.out.println(iNum4 + " * " + iNum5 + " = " + (iNum4 * iNum5));
        System.out.println();
        
        //2.04 Additional double Equations
        System.out.println("Additional double Equations (2.04)");
        double dNum4 = 2.25;
        double dNum5 = 13.5;
        
        System.out.println(dNum4 + " + " + dNum5 + " = " + (dNum4 + dNum5));
        System.out.println(dNum5 + " - " + dNum4 + " = " + (dNum5 - dNum4));
        System.out.println(dNum4 + " * " + dNum5 + " = " + (dNum4 * dNum5));
        
               
    } // end of main method
} // end of class
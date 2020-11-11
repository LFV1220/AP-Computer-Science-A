
/**
 * Write a program to calculate the trajectory of a 
 * projectile based on launch angles and launch velocities.
 *
 * @author Luis Vega
 * @version 12/11/19
 */
public class FruitCatapult
{
    // instance variables - replace the example below with your own
    private int[] speed;
    private int[] angles;
    private double[][] calculations = new double[7][6];
    
    /**
     * Constructor for objects of class FruitCatapult
     */
    public FruitCatapult(int[] mph, int[] deg, double[][] calc)
    {
        // initialise instance variables
        int[] speed = mph;
        int[] angles = deg;
        double[][] calculations = calc;
    } 
    
    public void calcTrajectory()
    {
        for(int row = 0; row < calculations.length; row++)
        {
            int column = 0;
            calculations[column][row] = Math.pow(speed[row], 2) * Math.sin(2 * Math.toRadians(angles[row])) / 9.8; //somethings wrong here :(
            column++;
        }
    }
    
    public void trajectoryOutput()
    {
        System.out.printf("%10s","Projectile Distance (feet)");
        System.out.printf("%5s %5s %5s %5s %5s %5s %5s\n","MPH","25 deg","30 deg","35 deg","40 deg","45 deg","50 deg");
        System.out.printf("=================================================\n");
        
        for(int row = 0; row < calculations.length; row++)
        {
            for(int column = 0; column < calculations[row].length; column++)
            {
                System.out.printf("%5.2f",calculations[column][row]);
            }
            System.out.printf("\n");
        }
    }
    
    public double[][] getTrajectory()
    {
        return calculations; 
    }
}

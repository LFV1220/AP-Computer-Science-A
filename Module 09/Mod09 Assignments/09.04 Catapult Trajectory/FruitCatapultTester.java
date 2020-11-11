
/**
 * Write a program to calculate the trajectory of a 
 * projectile based on launch angles and launch velocities.
 *
 * @author Luis Vega
 * @version 12/11/19
 */
public class FruitCatapultTester
{
    public static void main(String[] args)
    {
        int[] speed = {20,25,30,35,40,45,50};
        int[] angles = {25,30,35,40,45,50};
        double[][] calc = new double[7][6];
        
        FruitCatapult catapult = new FruitCatapult(speed,angles,calc);
        
        catapult.calcTrajectory();
        catapult.trajectoryOutput();
        
        
    }
}

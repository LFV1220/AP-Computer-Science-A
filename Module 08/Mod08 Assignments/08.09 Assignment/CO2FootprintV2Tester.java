/**
 * This class tests the CO2FootprintV2 class.
 * 
 *An object is created in order to calculate tons and convert to pounds. 
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
        //the amount of gallons 
        double gallonsOfGas = 2410;
        
        //new object named footprint with the amount of gallons in the parameter
        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas);
        
        //the calculations for footprint (calculates tons and converts it to pounds)
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();
        
        //outputs/displays the calculations/conversions using the footprint object
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}

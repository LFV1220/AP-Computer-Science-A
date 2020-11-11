/**
 * @purpose: This class calculates the CO2 footprint using pounds and tons
 * It contains mutator methods to calculate the tons and pounds
 * It contains double getter methods: getGallons, getTonsCO2, getPoundsCO2
 * Private double instance variables are myGallonsUsed, myTonsCO2, myPoundsCO2
 * 
 * @author Luis Vega
 * @version 11/19/19
 */
public class CO2FootprintV2
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    /**
     * Constructor for objects of type CO2FootprintV2
     * @param gallons is the number of gallons used
     * Precondition: gallons is a positive value
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate the tons, by multiplying 
     * (8.78 * 10 to the -3) times gallons (no parameters)
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to convert tons into pounds, by multipying
     * tons by 2,205 (no parameters)
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the number of gallons used (no parameters)
     * @return number of gallons used
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the amount of tons (no parameters)
     * @return the amount of tons
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return number of pounds, converted from tons (no parameters)
     * @return the number of pounds
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

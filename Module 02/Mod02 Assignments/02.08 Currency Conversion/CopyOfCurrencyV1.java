/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Luis Vega
 * @version 8/3/19
 */
public class CopyOfCurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 6754.65;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        //remaining variables below here
        double eurosSpent = 300.50;             // Euros spent
        double eurosExchangeRate = 0.90;        // 1 US dollar = 0.90 euros
        double dollarsSpentInItaly = 0.0;       // US dollars spent in Italy
        double dollarsAfterItaly = 0.0;         // US dollars remaining after Italy

        double auDollarsSpent = 500.90;          // Australian Dollars spent
        double auDollarExchangeRate = 1.47;     // 1 US dollar = 1.47 australian dollars
        double dollarsSpentInAU = 0.0;          // US dollars spent in Australia
        double dollarsAfterAU = 0.0;            // US dollars remaining after Australia
        
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println("Starting US dollars:            " + startingUsDollars);
        System.out.println();
        
        //Mexico
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        startingUsDollars -= dollarsSpentInMexico;
        System.out.println("Mexico:");
        System.out.println("  Pesos spent:                  " + pesosSpent); 
        System.out.println("  US dollars equivalent:        " + dollarsSpentInMexico);
        System.out.println("  US dollars remaining:         " + startingUsDollars);
        System.out.println();
        
        //Italy
        dollarsSpentInItaly = eurosSpent * eurosExchangeRate;
        startingUsDollars -= dollarsSpentInItaly;
        System.out.println("Italy:");
        System.out.println("  Euros spent:                  " + eurosSpent);
        System.out.println("  US dollars equivalent:        " + dollarsSpentInItaly);
        System.out.println("  US dollars remaining:         " + startingUsDollars);
        System.out.println();

        //Australia
        dollarsSpentInAU = auDollarsSpent / auDollarExchangeRate;
        startingUsDollars -= dollarsSpentInAU;
        System.out.println("Australia:");
        System.out.println("  Australian dollars spent:     " + auDollarsSpent);
        System.out.println("  US dollars equivalent:        " + dollarsSpentInAU);
        System.out.println("  US dollars remaining:         " + startingUsDollars);

        System.out.println("==================================================");
        System.out.println("Remaining US dollars:          " + startingUsDollars);
        System.out.println();
        System.out.println();
        
        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                             //cost per item of first souvenir
        int budget1 = 100;                              //budget for first item
        int totalItems1 = 0;                            //how many items can be purchased
        int fundsRemaining1 = 0;                        //how much of the budget is left

        totalItems1 = budget1 / costItem1;
        fundsRemaining1 = budget1 % costItem1;
        
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = 0;                            //how many items can be purchased
        double fundsRemaining2 = 0.0;                   //how much of the budget is left

        totalItems2 = budget2 / (int)costItem2;
        fundsRemaining2 = budget2 % costItem2;
        
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

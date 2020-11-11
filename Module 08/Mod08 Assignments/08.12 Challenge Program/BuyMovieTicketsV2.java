/**
 * 08.12 Challenge Program. Converting an assignment 
 * (module 3 challenge program) to OOP.
 *
 * @author Luis Vega
 * @version 12/7/19
 */
public class BuyMovieTicketsV2
{
    private String first,last,name,day,movie,cardAccNumber,orderNumber;
    private int numberTickets,cardPin;
    private double ticketPrice,total;
    
    /**
     * Constructor for objects of type BuyMovieTicketsV2
     * @param firstN is the first name
     * @param lastN is the last name
     * @param date is the date 
     * @param itemName is the item name
     * @param cardNumber is the card number
     * @param number is the item number
     * @param pin is the card pin
     * @param price is the cost of a ticket
     */
    public BuyMovieTicketsV2(String firstN,String lastN,String date,String itemName,String cardNumber,int number,int pin,double price)
    {
        first = firstN;
        last = lastN;
        day = date;
        movie = itemName;
        cardAccNumber = cardNumber;
        numberTickets = number;
        cardPin = pin;
        ticketPrice = price;
    }  
    
    /**
     * Mutator method to create the order number (no parameters).
     */
    public void orderNumber()
    {
        orderNumber = last.substring(0,2) + cardAccNumber.substring(12,14);
    }
    
    /**
     * Getter method to return the order number (no parameters).
     * @return the name.
     */
    public String getOrderNumber()
    {
        return orderNumber;
    }
    
    /**
     * Mutator method that makes the name (no parameters).
     */
    public void name()
    {
        name = last;
    }
    
    /**
     * Getter method that returns the name.
     * @return the name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Getter method that returns the date.
     * @return the day.
     */
    public String getDate()
    {
        return day;
    }
    
    /**
     * Getter method that returns the movie name. 
     * @return the movie title. 
     */
    public String getMovie()
    {
        return movie;
    }
    
    /**
     * Getter method that returns the number of tickets purchased.
     * @return the number of tickets.
     */
    public int getNumberTickets()
    {
        return numberTickets; 
    }
    
    /**
     * Mutator method that calculates a hidden card number (no parameters).
    */
    public void account()
    {
        cardAccNumber = "#####-###-" + cardAccNumber.substring(10,14);
    }
    
    /**
     * Getter method to return the card number.
     * @return the card number.
     */
    public String getAccount()
    {
        return cardAccNumber;
    }
    
    /**
     * Getter method that returns the price of each ticket.
     * @return the price per ticket.
     */
    public double getPrice()
    {
        return ticketPrice;
    }
    
    /**
     * Mutator method that calculates the total (no parameters).
     */
    public void total()
    {
        total = ((double)numberTickets) * ticketPrice;
    }
    
    /**
     * Getter method that returns the total.
     * @return the total.
     */
    public double getTotal()
    {
        return total;
    }
}

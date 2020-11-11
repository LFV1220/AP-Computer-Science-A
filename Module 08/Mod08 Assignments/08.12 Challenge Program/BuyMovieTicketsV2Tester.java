/**
 * 08.12 Challenge Program. Converting an assignment 
 * (module 3 challenge program) to OOP.
 * 
 * @author Luis Vega
 * @version 12/7/19
 */

public class BuyMovieTicketsV2Tester
{
    public static void main(String[] args)
    {
        //objects
        BuyMovieTicketsV2 order1 = new BuyMovieTicketsV2("Liam","Smith","01/21","Jumanji","11111-111-1111",1,1111,5.99);
        BuyMovieTicketsV2 order2 = new BuyMovieTicketsV2("Noah","Long","02/20","Frozen 2","22222-222-2222",2,2222,5.99);
        BuyMovieTicketsV2 order3 = new BuyMovieTicketsV2("William","Jones","03/04","Joker","33333-333-3333",3,3333,5.99);
        BuyMovieTicketsV2 order4 = new BuyMovieTicketsV2("James","Hill","04/15","Apollo 11","44444-444-4444",4,4444,5.99);
        BuyMovieTicketsV2 order5 = new BuyMovieTicketsV2("Oliver","Brown","05/02","Avengers","55555-555-5555",5,5555,5.99);
        BuyMovieTicketsV2 order6 = new BuyMovieTicketsV2("Ava","Davis","06/30","Aladdin","66666-666-6666",6,6666,5.99);
        BuyMovieTicketsV2 order7 = new BuyMovieTicketsV2("Isabella","Miller","07/25","Us","77777-777-7777",7,7777,5.99);
        BuyMovieTicketsV2 order8 = new BuyMovieTicketsV2("Sophia","Wilson","08/02","IT 2","88888-888-8888",8,8888,5.99);
        BuyMovieTicketsV2 order9 = new BuyMovieTicketsV2("Mia","Moore","09/10","Dumbo","99999-999-9999",9,9999,5.99);
        BuyMovieTicketsV2 order10 = new BuyMovieTicketsV2("Evelyn","Taylor","10/19","Elf","00000-000-0000",10,1010,5.99);
        
        //array of objects
        BuyMovieTicketsV2[] allOrders = {order1,order2,order3,order4,order5,order6,order7,order8,order9,order10};
        
        System.out.printf("%37s","e-Receipts\n");
        System.out.printf("%1s %8s %10s %10s %8s %8s %8s\n","Name","Date","Movie","Number","Price","Total", "Order #");
        System.out.printf("---------------------------------------------------------------\n");

        for(int i = 0; i < allOrders.length; i++)
        {
            allOrders[i].name();
            allOrders[i].total();
            allOrders[i].orderNumber();
            
            System.out.printf("%-7s %6s %10s %6d %10.2f %8.2f %7s\n",
                                allOrders[i].getName(),
                                allOrders[i].getDate(),
                                allOrders[i].getMovie(),
                                allOrders[i].getNumberTickets(),
                                allOrders[i].getPrice(),
                                allOrders[i].getTotal(),
                                allOrders[i].getOrderNumber());
            
                                  
        }
    }
}

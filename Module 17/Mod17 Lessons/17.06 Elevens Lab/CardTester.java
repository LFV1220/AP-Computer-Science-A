/**
 * This is a class that tests the Card class.
 *
 *  < Your Name >
 *  < Today's Date >
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card jackSpades = new Card("jack","spades",11);
      Card queenClubs = new Card("queen","clubs",12);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: jack of spades ****");
      System.out.println("  rank: " + jackSpades.rank());
      System.out.println("  suit: " + jackSpades.suit());
      System.out.println("  pointValue: " + jackSpades.pointValue());
      System.out.println("  toString: " + jackSpades.toString());
      System.out.println();
      
      // Test card 3
      System.out.println("**** Tests Card 3: queen of clubs ****");
      System.out.println("  rank: " + queenClubs.rank());
      System.out.println("  suit: " + queenClubs.suit());
      System.out.println("  pointValue: " + queenClubs.pointValue());
      System.out.println("  toString: " + queenClubs.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** Card 2 matches Card 1 ****");
      System.out.println("  matching: " + jackSpades.matches(aceHearts));
      System.out.println("  not matching: " + !jackSpades.matches(aceHearts));
      
   }
}
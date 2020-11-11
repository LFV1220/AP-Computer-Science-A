
/**
 * Write a description of class ElectionTesterV1 here.
 *
 * @author Luis Vega
 * @version 3/12/20
 */
public class ElectionTesterV1
{
    public static void main(String[] args)
    {
        Candidate[] candidates = new Candidate[5];
        
        candidates[0] = new Candidate("Lucy Robertson",6000);
        candidates[1] = new Candidate("Marie Grace",2400);
        candidates[2] = new Candidate("Brad Rodgers",1800);
        candidates[3] = new Candidate("Anthony Smith",3200);
        candidates[4] = new Candidate("Carl Tucker",2100);
        
        printRawData(candidates);
        electionResults(candidates);
        System.out.println();
    }
    
    public static void printRawData(Candidate[] candidates)
    {
        System.out.println("Raw Election Data: ");
        System.out.println();
        
        for(int i = 0; i < candidates.length; i++)
        {
            System.out.println(candidates[i].toString());
        }
    }
    
    public static void electionResults(Candidate[] candidates)
    {
        double calc = 0;
        System.out.println("\nElection Results: \n");
        System.out.printf("%11s %9s %13s","Candidate","Votes","% of Total");
        System.out.println("\n--------------------------------------");
        for(int i = 0; i < candidates.length; i++)
        {
            calc = (candidates[i].getVotes() / ((double)totalVotes(candidates))) * 100;
            System.out.printf("%-14s %6d %12.2f",candidates[i].getName(),candidates[i].getVotes(),calc);
            System.out.printf("\n");
        }
        System.out.println("\nTotal number of votes cast in election: " + totalVotes(candidates));
    }
    
    public static int totalVotes(Candidate[] candidates)
    {
        int total = 0;
        for(int i = 0; i < candidates.length; i++)
        {
            total += candidates[i].getVotes();
        }
        return total;
    }
}

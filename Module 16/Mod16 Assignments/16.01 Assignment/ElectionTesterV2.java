
/**
 * Write a description of class ElectionTesterV2 here.
 *
 * @author Luis Vega
 * @version 3/12/20
 */
import java.util.*;
public class ElectionTesterV2
{
    public static void main(String[] args)
    {
        List<Candidate> candidates = new ArrayList<Candidate>();
        
        candidates.add(new Candidate("Lucy Robertson",6000));
        candidates.add(new Candidate("Marie Grace",2400));
        candidates.add(new Candidate("Brad Rodgers",1800));
        candidates.add(new Candidate("Anthony Smith",3200));
        candidates.add(new Candidate("Carl Tucker",2100));
        
        printRawData(candidates);
        electionResults(candidates);
        System.out.println();
    }
    
    public static void printRawData(List<Candidate> candidates)
    {
        System.out.println("Raw Election Data: ");
        System.out.println();
        
        for(int i = 0; i < candidates.size(); i++)
        {
            System.out.println(candidates.get(i).toString());
        }
    }
    
    public static void electionResults(List<Candidate> candidates)
    {
        double calc = 0;
        System.out.println("\nElection Results: \n");
        System.out.printf("%11s %9s %13s","Candidate","Votes","% of Total");
        System.out.println("\n--------------------------------------");
        for(int i = 0; i < candidates.size(); i++)
        {
            calc = (candidates.get(i).getVotes() / ((double)totalVotes(candidates))) * 100;
            System.out.printf("%-14s %6d %12.2f",candidates.get(i).getName(),candidates.get(i).getVotes(),calc);
            System.out.printf("\n");
        }
        System.out.println("\nTotal number of votes cast in election: " + totalVotes(candidates));
    }
    
    public static int totalVotes(List<Candidate> candidates)
    {
        int total = 0;
        for(int i = 0; i < candidates.size(); i++)
        {
            total += candidates.get(i).getVotes();
        }
        return total;
    }
}

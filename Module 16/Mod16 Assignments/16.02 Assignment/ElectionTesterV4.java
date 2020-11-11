
/**
 * Write a description of class ElectionTesterV2 here.
 *
 * @author Luis Vega
 * @version 3/15/20
 */
import java.util.*;
public class ElectionTesterV4
{
    public static void main(String[] args)
    {
        List<Candidate> candidates = new ArrayList<Candidate>();
        
        candidates.add(new Candidate("Lucy Robertson",6000));
        candidates.add(new Candidate("Marie Grace",2400));
        candidates.add(new Candidate("Brad Rodgers",1800));
        candidates.add(new Candidate("Anthony Smith",3200));
        candidates.add(new Candidate("Carl Tucker",2100));
        
        System.out.println("Original results: \n");
        electionResults(candidates);
        System.out.println();
        
        changeItem(candidates,"Marie Grace","Earl Rossburg");
        System.out.println("\n<< Changing Marie Grace to Earl Rossburg >>\n");
        electionResults(candidates);
        System.out.println();
        
        changeItem(candidates,6000,4500);
        System.out.println("\n<< Changing Lucy Robertson votes to 4500 >>\n");
        electionResults(candidates);
        System.out.println();
        
        changeItem(candidates,"Anthony Smith","Aaron Sans",3200,3600);
        System.out.println("\n<< Changing Anthony Smith with 3200 votes \n    to Aaron Sans with 3600 votes >>\n");
        electionResults(candidates);
        System.out.println();
    }

    public static void electionResults(List<Candidate> candidates)
    {
        double calc = 0;
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
    
    public static void changeItem(List<Candidate> candidates,String find,String replace)
    {
        for(int i = 0; i < candidates.size(); i ++)
        {
            if(candidates.get(i).getName().equals(find))
            {
                candidates.get(i).setName(replace);
            }
        }
    }
    
    public static void changeItem(List<Candidate> candidates,int find,int replace)
    {
        for(int i = 0; i < candidates.size(); i++)
        {
            if(candidates.get(i).getVotes() == find)
            {
                candidates.get(i).setVotes(replace);
            }
        }
    }
    
    public static void changeItem(List<Candidate> candidates,String findName,String replaceName,int findVotes,int replaceVotes)
    {
        for(int i = 0; i < candidates.size(); i++)
        {
            if(candidates.get(i).getName().equals(findName))
            {
                candidates.get(i).setName(replaceName);
            }
            
            if(candidates.get(i).getVotes() == findVotes)
            {
                candidates.get(i).setVotes(replaceVotes);
            }
        }
    }
}

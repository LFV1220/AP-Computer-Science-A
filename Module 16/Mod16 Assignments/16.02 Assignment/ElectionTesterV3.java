
/**
 * Write a description of class ElectionTesterV1 here.
 *
 * @author Luis Vega
 * @version 3/15/20
 */
public class ElectionTesterV3
{
    public static void main(String[] args)
    {
        Candidate[] candidates = new Candidate[5];
        
        candidates[0] = new Candidate("Lucy Robertson",6000);
        candidates[1] = new Candidate("Marie Grace",2400);
        candidates[2] = new Candidate("Brad Rodgers",1800);
        candidates[3] = new Candidate("Anthony Smith",3200);
        candidates[4] = new Candidate("Carl Tucker",2100);
        
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

    public static void electionResults(Candidate[] candidates)
    {
        double calc = 0;
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
    
    public static void changeItem(Candidate[] candidates,String find,String replace)
    {
        for(int i = 0; i < candidates.length; i ++)
        {
            if(candidates[i].getName().equals(find))
            {
                candidates[i].setName(replace);
            }
        }
    }
    
    public static void changeItem(Candidate[] candidates,int find,int replace)
    {
        for(int i = 0; i < candidates.length; i++)
        {
            if(candidates[i].getVotes() == find)
            {
                candidates[i].setVotes(replace);
            }
        }
    }
    
    public static void changeItem(Candidate[] candidates,String findName,String replaceName,int findVotes,int replaceVotes)
    {
        for(int i = 0; i < candidates.length; i++)
        {
            if(candidates[i].getName().equals(findName))
            {
                candidates[i].setName(replaceName);
            }
            
            if(candidates[i].getVotes() == findVotes)
            {
                candidates[i].setVotes(replaceVotes);
            }
        }
    }
}

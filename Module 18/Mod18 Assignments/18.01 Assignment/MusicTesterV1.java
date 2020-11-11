
/**
 * Write a description of class MusicTesterV1 here.
 *
 * @author Luis Vega
 * @version 3/31/20
 */
public class MusicTesterV1
{
    public static void main(String[] args)
    {
        Music[] musicObj = new Music[10];
        
        musicObj[0] = new Music("Imagine",1971,"John Lennon");
        musicObj[1] = new Music("One",1991,"U2");
        musicObj[2] = new Music("Billie Jean",1982,"Michael Jackson");
        musicObj[3] = new Music("Bohemian Rhapsody",1975,"Queen");
        musicObj[4] = new Music("Hey Jude",1968,"The Beatles");
        musicObj[5] = new Music("Stairway To Heaven",1971,"Led Zeppelin");
        musicObj[6] = new Music("Respect",1967,"Aretha Franklin");
        musicObj[7] = new Music("Good Vibrations",1993,"The Beach Boys");
        musicObj[8] = new Music("Purple Haze",1970,"Jimi Hendrix");
        musicObj[9] = new Music("Gimme Shelter",1969,"The Rolling Stones");
        
        print(musicObj);
        
        System.out.println("\n\nSearching for Hey Jude: ");
        findTitle(musicObj,"Hey Jude");
        
        System.out.println("\n\nSearching for Never Gonna Give You Up: ");
        findTitle(musicObj,"Never Gonna Give You Up");
        
        System.out.println("\n\nSearching for The Beatles: ");
        findArtist(musicObj,"The Beatles");
        
        System.out.println("\n\nSearching for Waldo: ");
        findArtist(musicObj,"Waldo");
        
        System.out.println("\n\nSearching for the year 1969: ");
        findYear(musicObj,1969);
        
        System.out.println("\n\nSearching for the year 1992");
        findYear(musicObj,1992);
    }
    
    public static void print(Music[] m)
    {
        System.out.printf("%7s %18s %25s\n","Title","Artist","Year");
        System.out.println("-----------------------------------------------------------");
        
        for(int i = 0; i < m.length; i++)
        {
            System.out.printf("%-20s%-18s%15d\n",m[i].getTitle(),m[i].getArtist(),m[i].getYear());
        }
    }
    
    public static void findTitle(Music[] m,String toFind)
    {
        int found = -1;

        for(int i = 0; i < m.length; i++)
        {
            if(m[i].getTitle().compareTo(toFind) == 0)
            {
                found = i;
                break;
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println(toFind + ": " + m[found].getArtist() + " (" + m[found].getYear() + ")");
        }
        else
        {
            System.out.println(toFind + ": Not Found");
        }
    }
    
    public static void findYear(Music[] m,int toFind)
    {
        int found = 0;
        
        for(int i = 0; i < m.length; i++)
        {
            if(m[i].getYear() == toFind)
            {
                System.out.println(m[i].getYear() + " - " + m[i].getTitle() + " by " + m[i].getArtist());
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not found");
        }
    }
    
    public static void findArtist(Music[] m,String toFind)
    {
        int found = -1;

        for(int i = 0; i < m.length; i++)
        {
            if(m[i].getArtist().compareTo(toFind) == 0)
            {
                found = i;
                break;
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println(toFind + ": " + m[found].getTitle() + " (" + m[found].getYear() + ")");
        }
        else
        {
            System.out.println(toFind + ": Not Found");
        }
    }
}

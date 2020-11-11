
/**
 * Write a description of class MusicTesterV3 here.
 *
 * @author Luis Vega
 * @version 4/8/20
 */
public class MusicTesterV3
{
    public static void main(String[] args)
    {
        Music[] musicObj = new Music[10];
        int test;
        
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
        
        System.out.println("Original results: \n");
        print(musicObj);
        
        System.out.println("\n\nSearching for \"Hey Jude\": ");
        selectionTitle(musicObj);
        test = binarySearchTitle(musicObj,"Hey Jude");
        if(test != -1)
            System.out.println("Found: " + "\"" + musicObj[test].getTitle() + "\"" + " by " + musicObj[test].getArtist() + " (" + musicObj[test].getYear() + ")");
        else
            System.out.println("Not Found. ");
        
        System.out.println("\n\nSearching for \"Never Gonna Give You Up\":"); 
        test = binarySearchTitle(musicObj,"Never Gonna Give You Up");
        if(test != -1)
            System.out.println("Found: " + "\"" + musicObj[test].getTitle() + "\"" + " by " + musicObj[test].getArtist() + " (" + musicObj[test].getYear() + ")");
        else
            System.out.println("Not Found. ");
        
        System.out.println("\n\nSearching for The Beatles: ");
        selectionArtist(musicObj);
        binarySearchArtist(musicObj,"The Beatles");
        
        System.out.println("\n\nSearching for Waldo: ");
        binarySearchArtist(musicObj,"Waldo");
        
        System.out.println("\n\nSearching for 1969: ");
        binarySearchYear(musicObj,1969);
        
        System.out.println("\n\nSearching for 1992: ");
        binarySearchYear(musicObj,1992);
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
    
    public static void selectionTitle(Music[] source)
    {
        int i;
        int k;
        int posMax;
        Music temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getTitle().compareTo(source[posMax].getTitle()) > 0 )
                    posMax = k;
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            // System.out.println("\nPass # " + i);
            //for(Music a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getTitle() );
        }
    }
    
    public static void selectionArtist(Music[] source)
    {
        int i;
        int k;
        int posMax;
        Music temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getArtist().compareTo(source[posMax].getArtist()) > 0 )
                    posMax = k;
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            // System.out.println("\nPass # " + i);
            //for(Music a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getArtist() );
        }
    }
    
    public static void selectionYear(Music[] source)
    {
        int i;
        int k;
        int posMax;
        Music temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getYear() >= source[posMax].getYear())
                    posMax = k;
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            temp = source[ i ];
            source[ i ] = source[ posMax ];
            source[ posMax ] = temp;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            // System.out.println("\nPass # " + i);
            //for(Music a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getYear() );
        }
    }
    
    public static int binarySearchTitle(Music[] m,String toFind)
    {
        int high = m.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( m[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (m[low].getTitle().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }
    
    public static void binarySearchYear(Music[] m,int toFind)
    {
        int high = m.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(m[probe].getYear() == toFind )
                high = probe;
            else
            {
                low = probe;
                if( m[probe].getYear() == toFind )
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (m[low].getYear() == toFind ))
        {
            linearPrintYear(m, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    public static void binarySearchArtist(Music[] m,String toFind)
    {
        int high = m.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(m[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( m[probe].getArtist().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (m[low].getArtist().compareTo(toFind) == 0 ))
        {
            linearPrintArtist(m, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    public static void linearPrintYear(Music[] m, int low,int toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (m[i].getYear() == toFind))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < m.length) && (m[i].getYear() == toFind))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(m[i]);
    }
    
    public static void linearPrintArtist(Music[] m,int low,String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (m[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < m.length) && (m[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(m[i].getArtist() + " - " + m[i].getTitle() + "(" + m[i].getYear() + ")");
    }
    
    public static void linearPrintTitle(Music[] m,int low,String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (m[i].getTitle().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < m.length) && (m[i].getTitle().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(m[i]);
    }
}

/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Luis Vega
 * @version 2/19/20
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);
        System.out.println();

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  This is a sample.  ";

        //  Add examples below for the following methods:
        
        //    trim()
        String sampleTrim = sample.trim();
        System.out.println("sample =" + sample);
        System.out.println("sample.trim() = " + sampleTrim);
        System.out.println();
        
        //    length()
        int sampleLength = sample.length();
        System.out.println("sample.length() = " + sampleLength);
        System.out.println();
        
        //    indexOf with one and two parameters
        position = sample.indexOf("a");
        System.out.println("sample.indexOf(\"a\") = " + position);
        position = sample.indexOf("i",6);
        System.out.println("sample.indexOf(\"i\",6) = " + position);
        System.out.println();
        
        //    substring() with one and two parameters
        String sampleSubstring = sample.substring(10);
        System.out.println("sample.substring(10) = " + sampleSubstring);
        sampleSubstring = sample.substring(2,6);
        System.out.println("sample.substring(2,6) = " + sampleSubstring);
        System.out.println();
        
        //    compareTo()
        int sampleCompare = sample.compareTo(sample);
        System.out.println("sample.compareTo(sample) = " + sampleCompare);
        System.out.println();
        
        //    any other String methods you'd like to try
    }

}
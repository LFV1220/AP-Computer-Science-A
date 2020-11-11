
/**
 * Write a program that will calculate the total points and average grade each
 * time a new score is added to the total. 
 *
 * @author Luis Vega
 * @version 8/3/19
 */
public class GradesV2
{
    public static void main(String [ ] args)
    {
        //local variables
        int numTests = 0;       //counts number of tests
        int testGrade = 0;      //individual test grade
        int totalPoints = 0;    //total points for all tests
        double average = 0.0;   //average grade
        
        //first test
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //second test
        testGrade = 73;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //third test
        testGrade = 91;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //fourth test
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //fifth test
        testGrade = 90; 
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //sixth test
        testGrade = 100; 
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //seventh test
        testGrade = 78;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //eighth test
        testGrade = 98;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests); 
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //ninth test
        testGrade = 93;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //tenth test
        testGrade = 70;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("   Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        
    
    }
}

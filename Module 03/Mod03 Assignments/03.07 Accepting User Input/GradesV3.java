
/**
 * Write a program that will calculate the total points and average grade each
 * time a new score is added to the total and then add and use scanners (03.07).
 *
 * @author Luis Vega
 * @version 8/14/19
 */

//Scanner methods
import java.util.Scanner;

public class GradesV3
{
    public static void main(String [ ] args)
    {
        //03.07 assignment introduction (scanner class methods)
        Scanner greeting = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = greeting.next();
        System.out.println();
        
        System.out.println("Hi there, " + name + "! What is the subject for the grades?");
        Scanner subject = new Scanner(System.in);
        String subjectResponse = subject.next();
        System.out.println();
        
        System.out.println("Okay, " + name + "." + " Let's add in some more test grades.");
        System.out.println("Let's get started...");
        Scanner first = new Scanner(System.in);
        System.out.println("Alright remember three recent test grades?");
        System.out.println();
        System.out.println("Could you tell me the first test grade?");
        int firstNewTest = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Okay, and the second?");
        int secondNewTest = second.nextInt();
        Scanner third = new Scanner(System.in);
        System.out.println("And lastly, the third?");
        int thirdNewTest = third.nextInt();
        
        System.out.println();
        System.out.println("The following grades from " + subjectResponse + " are listed below, including the three recent test grades.");
        System.out.println();
        System.out.println("========================================================================================");
        System.out.println();
        
       
        
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
        System.out.print(" Test # " + numTests);
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
        
        //03.07 assignment
        
        //First New Test Grade 
        System.out.println();
        totalPoints += firstNewTest;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("   Test Grade: " + firstNewTest);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //Second New Test Grade
        totalPoints += secondNewTest;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("   Test Grade: " + secondNewTest);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("  Average Score: " + average);
        
        //Third New Test Grade
        totalPoints += thirdNewTest;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.print(" Test # " + numTests);
        System.out.print("   Test Grade: " + thirdNewTest);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("  Average Score: " + average);
        
    }
}

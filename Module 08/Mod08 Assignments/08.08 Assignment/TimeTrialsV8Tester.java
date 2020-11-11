
/**
 * Write a description of class TimeTrialsV7Tester here.
 *
 * @author Luis Vega
 * @version 11/14/19
 */
public class TimeTrialsV8Tester
{
    public static void main(String[] args)
    {
        //variables declared
        String p1Name; double p1Time1; double p1Time2;      //first person (tanya) data
        String p2Name; double p2Time1; double p2Time2;      //second person (Miguel) data
        String p3Name; double p3Time1; double p3Time2;      //third person (Neeti) data
        
        double p1TD, p2TD, p3TD;
        int p1DM, p2DM, p3DM;

        //variables initialized
        p1Name = "Tanya";   p1Time1 = 2.50;   p1Time2 = 4.50;
        p2Name = "Miguel";  p2Time1 = 1.25;   p2Time2 = 5.60;
        p3Name = "Neeti";   p3Time1 = 12.30;  p3Time2 = 16.75;
        
        //objects created
        TimeTrialsV8 person1 = new TimeTrialsV8(p1Name, p1Time1, p1Time2);
        TimeTrialsV8 person2 = new TimeTrialsV8(p2Name, p2Time1, p2Time2);
        TimeTrialsV8 person3 = new TimeTrialsV8(p3Name, p3Time1, p3Time2);
     
        //methods called upon
        p1TD = person1.findTimeDifference(p1Time1, p1Time2);
        p1DM = person1.differenceInMinutes(p1TD);
        p2TD = person2.findTimeDifference(p2Time1, p2Time2);
        p2DM = person2.differenceInMinutes(p2TD);
        p3TD = person3.findTimeDifference(p3Time1, p3Time2);
        p3DM = person3.differenceInMinutes(p3TD);
        
        //output
        System.out.printf("%35s\n","Time Trials");
        System.out.printf("%5s %10s %10s %20s %12s\n", "Name","Time 1","Time 2","Time Differences","Difference");
        System.out.printf("%15s %10s %15s %18s\n","(hrs)","(hrs)","(hrs)","in Minutes");
        System.out.printf("--------------------------------------------------------------\n");
        
        System.out.printf("%s %8.2f %10.2f %15.2f %15d\n",p1Name,p1Time1,p1Time2,p1TD,p1DM);
        System.out.printf("%s %7.2f %10.2f %15.2f %15d\n",p2Name,p2Time1,p2Time2,p2TD,p2DM);
        System.out.printf("%s %8.2f %10.2f %15.2f %15d\n",p3Name,p3Time1,p3Time2,p3TD,p3DM);
        System.out.printf("--------------------------------------------------------------\n");

    }
}


/**
 * Write a description of class StudentTester here.
 *
 * @author Luis Vega
 * @version 3/18/20
 */
import java.util.*;
public class StudentTester
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Mary Long",70,80,90,80,90));
        students.add(new Student("Monty Schmitt",80,85,90,85,80));
        students.add(new Student("Justen Dean",50,79,89,99,99));
        students.add(new Student("Bryan Chase",85,80,85,88,89));
        students.add(new Student("Dustin Brown",70,70,90,70,80));
        
        System.out.println("Starting Gradebook: \n");
        results(students);
        System.out.println();
        
        changeItem(students,"Monty Schmitt","Blake Wales");
        System.out.println("\n<< Changing Monty Schmitt to Blake Wales >>\n");
        results(students);
        System.out.println();
        
        changeItem(students,90,100);
        System.out.println("\n<< Changing a grade from a 90 to a 100 >>\n");
        results(students);
        System.out.println();
        
        changeItem(students,"Bryan Chase","James Lee",60,70,80,90,50);
        System.out.println("\n<< Changing Bryan Chase and grades to James Lee >>\n");
        results(students);
        System.out.println();
        
        insertItem(students,"Justen Dean","Sarah Hopper",90,85,95,70,100);
        System.out.println("\n<< Adding Sarah Hopper before Justen Dean >>\n");
        results(students);
        System.out.println();
        
        deleteItem(students,"Dustin Brown");
        System.out.println("\n<< Removing a Dustin Brown >>\n");
        results(students);
        System.out.println();
    }
    
    public static void results(List<Student> students)
    {
        System.out.printf("%13s %5s %5s %5s %5s %5s","Student name","Q1","Q2","Q3","Q4","Q5");
        System.out.println("\n----------------------------------------------");
        for(int i = 0; i < students.size(); i++)
        {
            System.out.printf("%-13s %5d %5d %5d %5d %5d",students.get(i).getName(),students.get(i).getQ1(),students.get(i).getQ2(),
                                                          students.get(i).getQ3(),students.get(i).getQ4(),students.get(i).getQ5());
            System.out.printf("\n");
        }
    }
    
    public static void changeItem(List<Student> students,String find,String replace)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getName().equals(find))
            {
                students.get(i).setName(replace);
            }
        }
    }
    
    public static void changeItem(List<Student> students,int find,int replace)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getQ1() == find)
            {
                students.get(i).setQ1(replace);
                break;
            }
            else if(students.get(i).getQ2() == find)
            {
                students.get(i).setQ2(replace);
                break;
            }
            else if(students.get(i).getQ3() == find)
            {
                students.get(i).setQ3(replace);
                break;
            }
            else if(students.get(i).getQ4() == find)
            {
                students.get(i).setQ4(replace);
                break;
            }
            else if(students.get(i).getQ5() == find)
            {
                students.get(i).setQ5(replace);
                break;
            }
        }
    }
    
    public static void changeItem(List<Student> students,String findN,String replaceN,int q1,int q2,int q3,int q4,int q5)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getName().equals(findN))
            {
                students.get(i).setName(replaceN);
                
                students.get(i).setQ1(q1);
                students.get(i).setQ2(q2);
                students.get(i).setQ3(q3);
                students.get(i).setQ4(q4);
                students.get(i).setQ5(q5);
            }
        }
    }
    
    public static void insertItem(List<Student> students,String find,String addN,int q1,int q2,int q3,int q4,int q5)
    {
        int location = 0;
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getName().equals(find))
            {
                location = i;
            }
        }
        students.add(location,new Student(addN,q1,q2,q3,q4,q5));
    }
    
    public static void deleteItem(List<Student> students,String find)
    {
        int location = 0;
        int i;
        for(i = 0; i < students.size(); i++)
        {
            if(students.get(i).getName().equals(find))
            {
                location = i;
                break;
            }
        }
        if(i != students.size())
        {
            students.remove(location);
        }
    }
}

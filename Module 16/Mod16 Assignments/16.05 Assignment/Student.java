
/**
 * Write a description of class Student here.
 *
 * @author Luis Vega
 * @version 3/18/20
 */
public class Student
{
    private String name;
    private int q1,q2,q3,q4,q5;
    
    public Student(String name,int q1,int q2,int q3,int q4,int q5)
    {
        this.name = name;
        this.q1 = q1; this.q2 = q2; this.q3 = q3; this.q4 = q4; this.q5 = q5;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getQ1()
    {
        return q1;
    }
    
    public int getQ2()
    {
        return q2;
    }
    
    public int getQ3()
    {
        return q3;
    }
    
    public int getQ4()
    {
        return q4;
    }
    
    public int getQ5()
    {
        return q5;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setQ1(int g)
    {
        q1 = g;
    }
    
    public void setQ2(int g)
    {
        q2 = g;
    }
    
    public void setQ3(int g)
    {
        q3 = g;
    }
    
    public void setQ4(int g)
    {
        q4 = g;
    }
    
    public void setQ5(int g)
    {
        q5 = g;
    }
    
    public String toString()
    {
        return getName() + ":\t" + getQ1() + "\t" + getQ2() + "\t" + getQ3() 
                         + "\t" + getQ4() + "\t" + getQ5();
    }
}

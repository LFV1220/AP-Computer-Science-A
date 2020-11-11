
/**
 * Write a description of class HomeworkTester here.
 *
 * @author Luis Vega
 * @version 3/5/20
 */
import java.util.ArrayList;
public class HomeworkTester
{
    public static void main(String[] args) 
    {
        System.out.println("\tMy Homework Reading To-Do\t");
        System.out.println("-----------------------------------------");
        
        Math m = new Math();
        APCompSci cs = new APCompSci();
        Science s = new Science();
        English e = new English();
        
        m.setPages(3); m.setType(3);
        cs.setPages(7); cs.setType(7);
        s.setPages(11); s.setType(11);
        e.setPages(34); e.setType(34);
        
        ArrayList<Homework> hw = new ArrayList<Homework>();
        hw.add(m);
        hw.add(cs);
        hw.add(s);
        hw.add(e);
        
        for(int i = 0; i < hw.size(); i++)
        {
            System.out.println(hw.get(i).toString());
        }
    }
}

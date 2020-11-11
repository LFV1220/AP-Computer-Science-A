
/**
 * Write a description of class Science here.
 *
 * @author Luis Vega
 * @version 3/5/20
 */
public class Science extends Homework
{
    
    public Science()
    {
        super();
    }
    
    public void setType(int numberPages)
    {
        if(numberPages <= 15)
        {
            homeworkType = "AP Environmental Science";
        }
    }
}

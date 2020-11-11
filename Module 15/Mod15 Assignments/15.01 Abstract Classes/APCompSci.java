
/**
 * Write a description of class APCompSci here.
 *
 * @author Luis Vega
 * @version 3/5/20
 */
public class APCompSci extends Homework
{
    
    public APCompSci()
    {
        super();
    }
    
    public void setType(int numberPages)
    {
        if(numberPages <= 10)
        {
            homeworkType = "AP Computer Science A";
        }
    }
}

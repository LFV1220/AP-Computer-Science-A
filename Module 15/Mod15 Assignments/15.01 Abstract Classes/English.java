
/**
 * Write a description of class English here.
 *
 * @author Luis Vega
 * @version 3/5/20
 */
public class English extends Homework
{
    
    public English()
    {
        super();
    }
    
    public void setType(int numberPages)
    {
        if(numberPages > 15)
        {
            homeworkType = "English";
        }
    }
}

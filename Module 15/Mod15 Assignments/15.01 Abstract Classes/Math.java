
/**
 * Write a description of class Math here.
 *
 * @author Luis Vega
 * @version 3/5/20
 */
public class Math extends Homework
{
    
    public Math()
    {
        super();
    }
    
    public void setType(int numberPages)
    {
        if(numberPages <= 5)
        {
            homeworkType = "Trigonometry";
        }
    }
}

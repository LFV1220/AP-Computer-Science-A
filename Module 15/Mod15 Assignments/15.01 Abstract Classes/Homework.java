
/**
 * Abstract class Homework - write a description of the class here
 *
 * @author Luis Vega
 * @version 3/5/20
 */
public abstract class Homework
{
    private int numberPages;
    public String homeworkType;
    
    public Homework()
    {
        this.numberPages = 0;
        this.homeworkType = "None";
    }
    
    public abstract void setType(int numberPages);
    
    public void setPages(int numberPages)
    {
        this.numberPages = numberPages;
    }
    
    public int getPages()
    {
        return numberPages;
    }
    
    public String getType()
    {
        return homeworkType;
    }
    
    public String toString()
    {
        return getType() + " - read " + numberPages + " pages.";
    }
}
